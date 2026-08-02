package okio.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyRevocation;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.franklin.investing.resources.OrderSide;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Buffer;
import okio.FileHandle;
import okio.FileSystem;
import okio.Path;
import okio.RealBufferedSource;
import okio.ZipFileSystem;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes9.dex */
public abstract class ZipFilesKt {
    public static zzb zza;

    public static final LinkedHashMap buildIndex(ArrayList arrayList) {
        String str = Path.DIRECTORY_SEPARATOR;
        Path path = Path.Companion.get("/", false);
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (ZipEntry zipEntry : CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(24))) {
            if (((ZipEntry) mutableMapOf.put(zipEntry.canonicalPath, zipEntry)) == null) {
                while (true) {
                    Path path2 = zipEntry.canonicalPath;
                    Path parent = path2.parent();
                    if (parent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) mutableMapOf.get(parent);
                        if (zipEntry2 != null) {
                            zipEntry2.children.add(path2);
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(parent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        mutableMapOf.put(parent, zipEntry3);
                        zipEntry3.children.add(path2);
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return mutableMapOf;
    }

    public static final String getBitcoinSourceAsset(OrderSide orderSide) {
        orderSide.getClass();
        int ordinal = orderSide.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String lowerCase = "BTC".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final String getBitcoinTargetAsset(OrderSide orderSide) {
        orderSide.getClass();
        int ordinal = orderSide.ordinal();
        if (ordinal == 0) {
            String lowerCase = "BTC".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        if (ordinal == 1 || ordinal == 2) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getHex(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:26:0x007a, B:28:0x0084, B:72:0x0149, B:82:0x0142, B:83:0x014e, B:108:0x01a9, B:114:0x01b6, B:117:0x01a4, B:11:0x01c2, B:15:0x01ce, B:16:0x01d5, B:133:0x01d6, B:134:0x01d9, B:135:0x01da, B:136:0x01ef, B:78:0x013d, B:106:0x019f, B:30:0x008d, B:32:0x0096, B:35:0x00a7, B:50:0x012c, B:64:0x0125, B:65:0x0130, B:66:0x0135, B:8:0x002c, B:19:0x0035, B:25:0x005b, B:130:0x01ba, B:131:0x01bf), top: B:2:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:26:0x007a, B:28:0x0084, B:72:0x0149, B:82:0x0142, B:83:0x014e, B:108:0x01a9, B:114:0x01b6, B:117:0x01a4, B:11:0x01c2, B:15:0x01ce, B:16:0x01d5, B:133:0x01d6, B:134:0x01d9, B:135:0x01da, B:136:0x01ef, B:78:0x013d, B:106:0x019f, B:30:0x008d, B:32:0x0096, B:35:0x00a7, B:50:0x012c, B:64:0x0125, B:65:0x0130, B:66:0x0135, B:8:0x002c, B:19:0x0035, B:25:0x005b, B:130:0x01ba, B:131:0x01bf), top: B:2:0x000d, inners: #0, #1, #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, Function1 function1) {
        RealBufferedSource realBufferedSource;
        Throwable th;
        Throwable th2;
        Throwable th3;
        int readIntLe;
        fileSystem.getClass();
        FileHandle openReadOnly = fileSystem.openReadOnly(path);
        try {
            long size = openReadOnly.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + openReadOnly.size());
            }
            long max = Math.max(size - 65558, 0L);
            do {
                RealBufferedSource realBufferedSource2 = new RealBufferedSource(openReadOnly.source(j));
                try {
                    if (realBufferedSource2.readIntLe() == 101010256) {
                        int readShortLe = realBufferedSource2.readShortLe() & HPKE.aead_EXPORT_ONLY;
                        int readShortLe2 = realBufferedSource2.readShortLe() & HPKE.aead_EXPORT_ONLY;
                        long readShortLe3 = realBufferedSource2.readShortLe() & HPKE.aead_EXPORT_ONLY;
                        if (readShortLe3 != (realBufferedSource2.readShortLe() & HPKE.aead_EXPORT_ONLY) || readShortLe != 0 || readShortLe2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        realBufferedSource2.skip(4L);
                        long readIntLe2 = realBufferedSource2.readIntLe() & BodyPartID.bodyIdMax;
                        int readShortLe4 = realBufferedSource2.readShortLe() & HPKE.aead_EXPORT_ONLY;
                        EocdRecord eocdRecord = new EocdRecord(readShortLe4, readShortLe3, readIntLe2);
                        realBufferedSource2.readUtf8(readShortLe4);
                        realBufferedSource2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            realBufferedSource2 = new RealBufferedSource(openReadOnly.source(j3));
                            try {
                                if (realBufferedSource2.readIntLe() == 117853008) {
                                    int readIntLe3 = realBufferedSource2.readIntLe();
                                    long readLongLe = realBufferedSource2.readLongLe();
                                    if (realBufferedSource2.readIntLe() != 1 || readIntLe3 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    realBufferedSource2 = new RealBufferedSource(openReadOnly.source(readLongLe));
                                    try {
                                        readIntLe = realBufferedSource2.readIntLe();
                                    } catch (Throwable th4) {
                                        try {
                                        } catch (Throwable th5) {
                                            ExceptionsKt__ExceptionsKt.addSuppressed(th4, th5);
                                        }
                                        th3 = th4;
                                    }
                                    if (readIntLe != 101075792) {
                                        throw new IOException("bad zip: expected " + getHex(101075792) + " but was " + getHex(readIntLe));
                                    }
                                    realBufferedSource2.skip(12L);
                                    int readIntLe4 = realBufferedSource2.readIntLe();
                                    int readIntLe5 = realBufferedSource2.readIntLe();
                                    long readLongLe2 = realBufferedSource2.readLongLe();
                                    if (readLongLe2 != realBufferedSource2.readLongLe() || readIntLe4 != 0 || readIntLe5 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    realBufferedSource2.skip(8L);
                                    try {
                                        th3 = null;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                    }
                                    eocdRecord = new EocdRecord(readShortLe4, readLongLe2, realBufferedSource2.readLongLe());
                                    if (th3 != null) {
                                        throw th3;
                                    }
                                }
                                try {
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                } catch (Throwable th9) {
                                    ExceptionsKt__ExceptionsKt.addSuppressed(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        RealBufferedSource realBufferedSource3 = new RealBufferedSource(openReadOnly.source(eocdRecord.centralDirectoryOffset));
                        try {
                            long j4 = eocdRecord.entryCount;
                            while (j2 < j4) {
                                ZipEntry readCentralDirectoryZipEntry = readCentralDirectoryZipEntry(realBufferedSource3);
                                realBufferedSource = realBufferedSource3;
                                try {
                                    if (readCentralDirectoryZipEntry.offset >= eocdRecord.centralDirectoryOffset) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) function1.invoke(readCentralDirectoryZipEntry)).booleanValue()) {
                                        arrayList.add(readCentralDirectoryZipEntry);
                                    }
                                    j2++;
                                    realBufferedSource3 = realBufferedSource;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        realBufferedSource.close();
                                    } catch (Throwable th11) {
                                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th11);
                                    }
                                    if (th == null) {
                                    }
                                }
                            }
                            try {
                                realBufferedSource3.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            realBufferedSource = realBufferedSource3;
                        }
                        if (th == null) {
                            throw th;
                        }
                        ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList));
                        try {
                            openReadOnly.close();
                        } catch (Throwable unused) {
                        }
                        return zipFileSystem;
                    }
                    realBufferedSource2.close();
                    j--;
                } finally {
                    realBufferedSource2.close();
                }
            } while (j >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th14) {
            if (openReadOnly == null) {
                throw th14;
            }
            try {
                openReadOnly.close();
                throw th14;
            } catch (Throwable th15) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th14, th15);
                throw th14;
            }
        }
    }

    public static Algorithm parseAlgorithm(Map map) {
        String string2 = JSONObjectUtils.getString("alg", map);
        if (string2 != null) {
            return new Algorithm(string2);
        }
        Algorithm algorithm = Algorithm.NONE;
        return null;
    }

    public static Date parseExpirationTime(Map map) {
        if (map.get("exp") == null) {
            return null;
        }
        return new Date(JSONObjectUtils.getLong("exp", map) * 1000);
    }

    public static Date parseIssueTime(Map map) {
        if (map.get("iat") == null) {
            return null;
        }
        return new Date(JSONObjectUtils.getLong("iat", map) * 1000);
    }

    public static LinkedHashSet parseKeyOperations(Map map) {
        KeyOperation keyOperation;
        List<String> stringList = JSONObjectUtils.getStringList("key_ops", map);
        if (stringList == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : stringList) {
            if (str != null) {
                KeyOperation[] values = KeyOperation.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        keyOperation = null;
                        break;
                    }
                    keyOperation = values[i];
                    if (str.equals(keyOperation.identifier)) {
                        break;
                    }
                    i++;
                }
                if (keyOperation == null) {
                    JWK$$ExternalSyntheticBUOutline0.m$1("Invalid JWK operation: ".concat(str));
                    return null;
                }
                linkedHashSet.add(keyOperation);
            }
        }
        return linkedHashSet;
    }

    public static KeyRevocation parseKeyRevocation(Map map) {
        KeyRevocation.Reason reason = null;
        if (map.get("revoked") == null) {
            return null;
        }
        Map jSONObject = JSONObjectUtils.getJSONObject("revoked", map);
        Date date = new Date(JSONObjectUtils.getLong("revoked_at", jSONObject) * 1000);
        if (jSONObject.get("reason") != null) {
            String str = (String) JSONObjectUtils.getGeneric(jSONObject, "reason", String.class);
            KeyRevocation.Reason reason2 = KeyRevocation.Reason.UNSPECIFIED;
            if (!reason2.value.equals(str)) {
                reason2 = KeyRevocation.Reason.COMPROMISED;
                if (!reason2.value.equals(str)) {
                    reason2 = KeyRevocation.Reason.SUPERSEDED;
                    if (!reason2.value.equals(str)) {
                        reason2 = new KeyRevocation.Reason(str);
                    }
                }
            }
            reason = reason2;
        }
        return new KeyRevocation(date, reason);
    }

    public static KeyType parseKeyType(Map map) {
        try {
            return KeyType.parse(JSONObjectUtils.getString("kty", map));
        } catch (IllegalArgumentException e) {
            JWK$$ExternalSyntheticBUOutline0.m$1(e.getMessage());
            return null;
        }
    }

    public static KeyUse parseKeyUse(Map map) {
        String string2 = JSONObjectUtils.getString("use", map);
        if (string2 == null) {
            return null;
        }
        KeyUse keyUse = KeyUse.SIGNATURE;
        if (string2.equals(keyUse.identifier)) {
            return keyUse;
        }
        KeyUse keyUse2 = KeyUse.ENCRYPTION;
        if (string2.equals(keyUse2.identifier)) {
            return keyUse2;
        }
        if (!string2.trim().isEmpty()) {
            return new KeyUse(string2);
        }
        JWK$$ExternalSyntheticBUOutline0.m$1("JWK use value must not be empty or blank");
        return null;
    }

    public static Date parseNotBeforeTime(Map map) {
        if (map.get("nbf") == null) {
            return null;
        }
        return new Date(JSONObjectUtils.getLong("nbf", map) * 1000);
    }

    public static LinkedList parseX509CertChain(Map map) {
        LinkedList base64List = X509CertChainUtils.toBase64List((List) JSONObjectUtils.getGeneric(map, "x5c", List.class));
        if (base64List == null || !base64List.isEmpty()) {
            return base64List;
        }
        return null;
    }

    public static final ZipEntry readCentralDirectoryZipEntry(RealBufferedSource realBufferedSource) {
        int readIntLe = realBufferedSource.readIntLe();
        if (readIntLe != 33639248) {
            f$$ExternalSyntheticLambda0.m$3("bad zip: expected ", getHex(33639248), " but was ", getHex(readIntLe));
            return null;
        }
        realBufferedSource.skip(4L);
        short readShortLe = realBufferedSource.readShortLe();
        int i = readShortLe & HPKE.aead_EXPORT_ONLY;
        if ((readShortLe & 1) != 0) {
            a$$ExternalSyntheticBUOutline0.m$4("unsupported zip: general purpose bit flag=".concat(getHex(i)));
            return null;
        }
        int readShortLe2 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        int readShortLe3 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        int readShortLe4 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        long readIntLe2 = realBufferedSource.readIntLe() & BodyPartID.bodyIdMax;
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = realBufferedSource.readIntLe() & BodyPartID.bodyIdMax;
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = realBufferedSource.readIntLe() & BodyPartID.bodyIdMax;
        int readShortLe5 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        int readShortLe6 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        int readShortLe7 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        realBufferedSource.skip(8L);
        Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = realBufferedSource.readIntLe() & BodyPartID.bodyIdMax;
        String readUtf8 = realBufferedSource.readUtf8(readShortLe5);
        if (StringsKt.contains((CharSequence) readUtf8, (char) 0, false)) {
            a$$ExternalSyntheticBUOutline0.m$4("bad zip: filename contains 0x00");
            return null;
        }
        long j = ref$LongRef2.element == BodyPartID.bodyIdMax ? 8L : 0L;
        if (ref$LongRef.element == BodyPartID.bodyIdMax) {
            j += 8;
        }
        if (ref$LongRef3.element == BodyPartID.bodyIdMax) {
            j += 8;
        }
        long j2 = j;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(realBufferedSource, readShortLe6, new ZipFilesKt$$ExternalSyntheticLambda2(ref$BooleanRef, j2, ref$LongRef2, realBufferedSource, ref$LongRef, ref$LongRef3, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        if (j2 > 0 && !ref$BooleanRef.element) {
            a$$ExternalSyntheticBUOutline0.m$4("bad zip: zip64 extra required but absent");
            return null;
        }
        String readUtf82 = realBufferedSource.readUtf8(readShortLe7);
        String str = Path.DIRECTORY_SEPARATOR;
        return new ZipEntry(Path.Companion.get("/", false).resolve(readUtf8), StringsKt__StringsJVMKt.endsWith(readUtf8, "/", false), readUtf82, readIntLe2, ref$LongRef.element, ref$LongRef2.element, readShortLe2, ref$LongRef3.element, readShortLe4, readShortLe3, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, (Long) ref$ObjectRef3.element, 57344);
    }

    public static final void readExtra(RealBufferedSource realBufferedSource, int i, Function2 function2) {
        Buffer buffer = realBufferedSource.bufferField;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                a$$ExternalSyntheticBUOutline0.m$4("bad zip: truncated header in extra field");
                return;
            }
            int readShortLe = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
            long readShortLe2 = realBufferedSource.readShortLe() & 65535;
            long j2 = j - 4;
            if (j2 < readShortLe2) {
                a$$ExternalSyntheticBUOutline0.m$4("bad zip: truncated value in extra field");
                return;
            }
            realBufferedSource.require(readShortLe2);
            long j3 = buffer.size;
            function2.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
            long j4 = (buffer.size + readShortLe2) - j3;
            if (j4 < 0) {
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readShortLe, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    buffer.skip(j4);
                }
                j = j2 - readShortLe2;
            }
        }
    }

    public static final ZipEntry readOrSkipLocalHeader(RealBufferedSource realBufferedSource, ZipEntry zipEntry) {
        int readIntLe = realBufferedSource.readIntLe();
        if (readIntLe != 67324752) {
            f$$ExternalSyntheticLambda0.m$3("bad zip: expected ", getHex(67324752), " but was ", getHex(readIntLe));
            return null;
        }
        realBufferedSource.skip(2L);
        short readShortLe = realBufferedSource.readShortLe();
        int i = readShortLe & HPKE.aead_EXPORT_ONLY;
        if ((readShortLe & 1) != 0) {
            a$$ExternalSyntheticBUOutline0.m$4("unsupported zip: general purpose bit flag=".concat(getHex(i)));
            return null;
        }
        realBufferedSource.skip(18L);
        int readShortLe2 = realBufferedSource.readShortLe() & HPKE.aead_EXPORT_ONLY;
        realBufferedSource.skip(realBufferedSource.readShortLe() & 65535);
        if (zipEntry == null) {
            realBufferedSource.skip(readShortLe2);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        readExtra(realBufferedSource, readShortLe2, new ZipFilesKt$$ExternalSyntheticLambda1(realBufferedSource, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new ZipEntry(zipEntry.canonicalPath, zipEntry.isDirectory, zipEntry.comment, zipEntry.crc, zipEntry.compressedSize, zipEntry.size, zipEntry.compressionMethod, zipEntry.offset, zipEntry.dosLastModifiedAtDate, zipEntry.dosLastModifiedAtTime, zipEntry.ntfsLastModifiedAtFiletime, zipEntry.ntfsLastAccessedAtFiletime, zipEntry.ntfsCreatedAtFiletime, (Integer) ref$ObjectRef.element, (Integer) ref$ObjectRef2.element, (Integer) ref$ObjectRef3.element);
    }
}
