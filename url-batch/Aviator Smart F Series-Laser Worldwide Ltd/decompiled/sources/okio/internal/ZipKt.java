package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import f6.l;
import f6.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.a1;
import okio.i;
import okio.j;
import okio.j0;
import okio.k;
import okio.o0;
import y5.u;
import y5.w;

/* loaded from: classes5.dex */
public abstract class ZipKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareValues;
            compareValues = kotlin.comparisons.g.compareValues(((c) obj).getCanonicalPath(), ((c) obj2).getCanonicalPath());
            return compareValues;
        }
    }

    private static final Map<o0, c> buildIndex(List<c> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : CollectionsKt___CollectionsKt.sortedWith(list, new a())) {
            if (((c) linkedHashMap.put(cVar.getCanonicalPath(), cVar)) == null) {
                while (true) {
                    o0 parent = cVar.getCanonicalPath().parent();
                    if (parent != null) {
                        c cVar2 = (c) linkedHashMap.get(parent);
                        if (cVar2 != null) {
                            cVar2.getChildren().add(cVar.getCanonicalPath());
                            break;
                        }
                        c cVar3 = new c(parent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        linkedHashMap.put(parent, cVar3);
                        cVar3.getChildren().add(cVar.getCanonicalPath());
                        cVar = cVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static final Long dosDateTimeToEpochMillis(int i8, int i9) {
        if (i9 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i8 >> 9) & 127) + 1980, ((i8 >> 5) & 15) - 1, i8 & 31, (i9 >> 11) & 31, (i9 >> 5) & 63, (i9 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i8) {
        int checkRadix;
        checkRadix = kotlin.text.b.checkRadix(16);
        String num = Integer.toString(i8, checkRadix);
        s.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return s.stringPlus("0x", num);
    }

    /* JADX WARN: Finally extract failed */
    public static final a1 openZip(o0 zipPath, k fileSystem, l predicate) {
        okio.e buffer;
        s.checkNotNullParameter(zipPath, "zipPath");
        s.checkNotNullParameter(fileSystem, "fileSystem");
        s.checkNotNullParameter(predicate, "predicate");
        i openReadOnly = fileSystem.openReadOnly(zipPath);
        long j8 = 0;
        try {
            okio.e buffer2 = j0.buffer(i.source$default(openReadOnly, 0L, 1, null));
            try {
                int readIntLe = buffer2.readIntLe();
                if (readIntLe != LOCAL_FILE_HEADER_SIGNATURE) {
                    if (readIntLe == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        throw new IOException("unsupported zip: empty");
                    }
                    throw new IOException("not a zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(readIntLe));
                }
                w wVar = w.INSTANCE;
                kotlin.io.b.closeFinally(buffer2, null);
                long size = openReadOnly.size() - 22;
                if (size < 0) {
                    throw new IOException(s.stringPlus("not a zip: size=", Long.valueOf(openReadOnly.size())));
                }
                long max = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                do {
                    okio.e buffer3 = j0.buffer(openReadOnly.source(size));
                    try {
                        if (buffer3.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                            okio.internal.a readEocdRecord = readEocdRecord(buffer3);
                            String readUtf8 = buffer3.readUtf8(readEocdRecord.getCommentByteCount());
                            buffer3.close();
                            long j9 = size - 20;
                            if (j9 > 0) {
                                buffer = j0.buffer(openReadOnly.source(j9));
                                try {
                                    if (buffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                        int readIntLe2 = buffer.readIntLe();
                                        long readLongLe = buffer.readLongLe();
                                        if (buffer.readIntLe() != 1 || readIntLe2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        buffer = j0.buffer(openReadOnly.source(readLongLe));
                                        try {
                                            int readIntLe3 = buffer.readIntLe();
                                            if (readIntLe3 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                                throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(readIntLe3));
                                            }
                                            readEocdRecord = readZip64EocdRecord(buffer, readEocdRecord);
                                            w wVar2 = w.INSTANCE;
                                            kotlin.io.b.closeFinally(buffer, null);
                                        } finally {
                                        }
                                    }
                                    w wVar3 = w.INSTANCE;
                                    kotlin.io.b.closeFinally(buffer, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            buffer = j0.buffer(openReadOnly.source(readEocdRecord.getCentralDirectoryOffset()));
                            try {
                                long entryCount = readEocdRecord.getEntryCount();
                                if (0 < entryCount) {
                                    do {
                                        j8++;
                                        c readEntry = readEntry(buffer);
                                        if (readEntry.getOffset() >= readEocdRecord.getCentralDirectoryOffset()) {
                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                        }
                                        if (((Boolean) predicate.invoke(readEntry)).booleanValue()) {
                                            arrayList.add(readEntry);
                                        }
                                    } while (j8 < entryCount);
                                }
                                w wVar4 = w.INSTANCE;
                                kotlin.io.b.closeFinally(buffer, null);
                                a1 a1Var = new a1(zipPath, fileSystem, buildIndex(arrayList), readUtf8);
                                kotlin.io.b.closeFinally(openReadOnly, null);
                                return a1Var;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    kotlin.io.b.closeFinally(buffer, th);
                                }
                            }
                        }
                        buffer3.close();
                        size--;
                    } finally {
                        buffer3.close();
                    }
                } while (size >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                    kotlin.io.b.closeFinally(buffer2, th2);
                }
            }
        } finally {
        }
    }

    public static /* synthetic */ a1 openZip$default(o0 o0Var, k kVar, l lVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            lVar = new l() { // from class: okio.internal.ZipKt$openZip$1
                @Override // f6.l
                public final Boolean invoke(c it) {
                    s.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        return openZip(o0Var, kVar, lVar);
    }

    public static final c readEntry(final okio.e eVar) {
        boolean contains$default;
        s.checkNotNullParameter(eVar, "<this>");
        int readIntLe = eVar.readIntLe();
        if (readIntLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(readIntLe));
        }
        eVar.skip(4L);
        short readShortLe = eVar.readShortLe();
        int i8 = readShortLe & u.MAX_VALUE;
        if ((readShortLe & 1) != 0) {
            throw new IOException(s.stringPlus("unsupported zip: general purpose bit flag=", getHex(i8)));
        }
        int readShortLe2 = eVar.readShortLe() & u.MAX_VALUE;
        Long dosDateTimeToEpochMillis = dosDateTimeToEpochMillis(eVar.readShortLe() & u.MAX_VALUE, eVar.readShortLe() & u.MAX_VALUE);
        long readIntLe2 = eVar.readIntLe() & 4294967295L;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = eVar.readIntLe() & 4294967295L;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = eVar.readIntLe() & 4294967295L;
        int readShortLe3 = eVar.readShortLe() & u.MAX_VALUE;
        int readShortLe4 = eVar.readShortLe() & u.MAX_VALUE;
        int readShortLe5 = eVar.readShortLe() & u.MAX_VALUE;
        eVar.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = eVar.readIntLe() & 4294967295L;
        String readUtf8 = eVar.readUtf8(readShortLe3);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) readUtf8, (char) 0, false, 2, (Object) null);
        if (contains$default) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j8 = ref$LongRef2.element == 4294967295L ? 8 : 0L;
        long j9 = ref$LongRef.element == 4294967295L ? j8 + 8 : j8;
        if (ref$LongRef3.element == 4294967295L) {
            j9 += 8;
        }
        final long j10 = j9;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(eVar, readShortLe4, new p() { // from class: okio.internal.ZipKt$readEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                return w.INSTANCE;
            }

            public final void invoke(int i9, long j11) {
                if (i9 == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                    if (ref$BooleanRef2.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.element = true;
                    if (j11 < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long j12 = ref$LongRef4.element;
                    if (j12 == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
                        j12 = eVar.readLongLe();
                    }
                    ref$LongRef4.element = j12;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.element = ref$LongRef5.element == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 ? eVar.readLongLe() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.element = ref$LongRef6.element == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 ? eVar.readLongLe() : 0L;
                }
            }
        });
        if (j10 <= 0 || ref$BooleanRef.element) {
            return new c(o0.a.get$default(o0.Companion, "/", false, 1, (Object) null).resolve(readUtf8), t.endsWith$default(readUtf8, "/", false, 2, null), eVar.readUtf8(readShortLe5), readIntLe2, ref$LongRef.element, ref$LongRef2.element, readShortLe2, dosDateTimeToEpochMillis, ref$LongRef3.element);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final okio.internal.a readEocdRecord(okio.e eVar) {
        int readShortLe = eVar.readShortLe() & u.MAX_VALUE;
        int readShortLe2 = eVar.readShortLe() & u.MAX_VALUE;
        long readShortLe3 = eVar.readShortLe() & u.MAX_VALUE;
        if (readShortLe3 != (eVar.readShortLe() & u.MAX_VALUE) || readShortLe != 0 || readShortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eVar.skip(4L);
        return new okio.internal.a(readShortLe3, 4294967295L & eVar.readIntLe(), eVar.readShortLe() & u.MAX_VALUE);
    }

    private static final void readExtra(okio.e eVar, int i8, p pVar) {
        long j8 = i8;
        while (j8 != 0) {
            if (j8 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int readShortLe = eVar.readShortLe() & u.MAX_VALUE;
            long readShortLe2 = eVar.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j9 = j8 - 4;
            if (j9 < readShortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            eVar.require(readShortLe2);
            long size = eVar.getBuffer().size();
            pVar.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
            long size2 = (eVar.getBuffer().size() + readShortLe2) - size;
            if (size2 < 0) {
                throw new IOException(s.stringPlus("unsupported zip: too many bytes processed for ", Integer.valueOf(readShortLe)));
            }
            if (size2 > 0) {
                eVar.getBuffer().skip(size2);
            }
            j8 = j9 - readShortLe2;
        }
    }

    public static final j readLocalHeader(okio.e eVar, j basicMetadata) {
        s.checkNotNullParameter(eVar, "<this>");
        s.checkNotNullParameter(basicMetadata, "basicMetadata");
        j readOrSkipLocalHeader = readOrSkipLocalHeader(eVar, basicMetadata);
        s.checkNotNull(readOrSkipLocalHeader);
        return readOrSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final j readOrSkipLocalHeader(final okio.e eVar, j jVar) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = jVar == null ? 0 : jVar.getLastModifiedAtMillis();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int readIntLe = eVar.readIntLe();
        if (readIntLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(readIntLe));
        }
        eVar.skip(2L);
        short readShortLe = eVar.readShortLe();
        int i8 = readShortLe & u.MAX_VALUE;
        if ((readShortLe & 1) != 0) {
            throw new IOException(s.stringPlus("unsupported zip: general purpose bit flag=", getHex(i8)));
        }
        eVar.skip(18L);
        long readShortLe2 = eVar.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int readShortLe3 = eVar.readShortLe() & u.MAX_VALUE;
        eVar.skip(readShortLe2);
        if (jVar == null) {
            eVar.skip(readShortLe3);
            return null;
        }
        readExtra(eVar, readShortLe3, new p() { // from class: okio.internal.ZipKt$readOrSkipLocalHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                return w.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Long] */
            public final void invoke(int i9, long j8) {
                if (i9 == 21589) {
                    if (j8 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = okio.e.this.readByte();
                    boolean z7 = (readByte & 1) == 1;
                    boolean z8 = (readByte & 2) == 2;
                    boolean z9 = (readByte & 4) == 4;
                    okio.e eVar2 = okio.e.this;
                    long j9 = z7 ? 5L : 1L;
                    if (z8) {
                        j9 += 4;
                    }
                    if (z9) {
                        j9 += 4;
                    }
                    if (j8 < j9) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z7) {
                        ref$ObjectRef.element = Long.valueOf(eVar2.readIntLe() * 1000);
                    }
                    if (z8) {
                        ref$ObjectRef2.element = Long.valueOf(okio.e.this.readIntLe() * 1000);
                    }
                    if (z9) {
                        ref$ObjectRef3.element = Long.valueOf(okio.e.this.readIntLe() * 1000);
                    }
                }
            }
        });
        return new j(jVar.isRegularFile(), jVar.isDirectory(), null, jVar.getSize(), (Long) ref$ObjectRef3.element, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, null, 128, null);
    }

    private static final okio.internal.a readZip64EocdRecord(okio.e eVar, okio.internal.a aVar) {
        eVar.skip(12L);
        int readIntLe = eVar.readIntLe();
        int readIntLe2 = eVar.readIntLe();
        long readLongLe = eVar.readLongLe();
        if (readLongLe != eVar.readLongLe() || readIntLe != 0 || readIntLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eVar.skip(8L);
        return new okio.internal.a(readLongLe, eVar.readLongLe(), aVar.getCommentByteCount());
    }

    public static final void skipLocalHeader(okio.e eVar) {
        s.checkNotNullParameter(eVar, "<this>");
        readOrSkipLocalHeader(eVar, null);
    }
}
