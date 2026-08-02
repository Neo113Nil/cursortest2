package okio.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* renamed from: okio.internal.-Path, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Path {
    public static final ByteString ANY_SLASH;
    public static final ByteString BACKSLASH;
    public static final ByteString DOT;
    public static final ByteString DOT_DOT;
    public static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SLASH = ByteString.Companion.encodeUtf8("/");
        BACKSLASH = ByteString.Companion.encodeUtf8("\\");
        ANY_SLASH = ByteString.Companion.encodeUtf8("/\\");
        DOT = ByteString.Companion.encodeUtf8(".");
        DOT_DOT = ByteString.Companion.encodeUtf8("..");
    }

    public static final int access$rootLength(okio.Path path) {
        ByteString byteString = path.bytes;
        if (byteString.getSize$okio() != 0) {
            if (byteString.internalGet$okio(0) != 47) {
                if (byteString.internalGet$okio(0) == 92) {
                    if (byteString.getSize$okio() > 2 && byteString.internalGet$okio(1) == 92) {
                        ByteString byteString2 = BACKSLASH;
                        byteString2.getClass();
                        int indexOf = byteString.indexOf(2, byteString2.internalArray$okio());
                        return indexOf == -1 ? byteString.getSize$okio() : indexOf;
                    }
                } else if (byteString.getSize$okio() > 2 && byteString.internalGet$okio(1) == 58 && byteString.internalGet$okio(2) == 92) {
                    char internalGet$okio = (char) byteString.internalGet$okio(0);
                    if ('a' <= internalGet$okio && internalGet$okio < '{') {
                        return 3;
                    }
                    if ('A' <= internalGet$okio && internalGet$okio < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path path2, boolean z) {
        path2.getClass();
        if (access$rootLength(path2) != -1 || path2.volumeLetter() != null) {
            return path2;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(path2)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.m4333write(path.bytes);
        if (buffer.size > 0) {
            buffer.m4333write(slash);
        }
        buffer.m4333write(path2.bytes);
        return toPath(buffer, z);
    }

    public static final ByteString getSlash(okio.Path path) {
        ByteString byteString = path.bytes;
        ByteString byteString2 = SLASH;
        if (ByteString.indexOf$default(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = path.bytes;
        ByteString byteString4 = BACKSLASH;
        if (ByteString.indexOf$default(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final okio.Path toPath(Buffer buffer, boolean z) {
        ByteString byteString;
        long j;
        char c;
        boolean exhausted;
        ByteString byteString2;
        int size;
        int i;
        ByteString readByteString;
        Buffer buffer2 = new Buffer();
        ByteString byteString3 = null;
        int i2 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString3 == null) {
                byteString3 = toSlash(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && Intrinsics.areEqual(byteString3, byteString);
        ByteString byteString4 = ANY_SLASH;
        if (z2) {
            byteString3.getClass();
            buffer2.m4333write(byteString3);
            buffer2.m4333write(byteString3);
        } else if (i2 > 0) {
            byteString3.getClass();
            buffer2.m4333write(byteString3);
        } else {
            long indexOfElement = buffer.indexOfElement(byteString4);
            if (byteString3 == null) {
                byteString3 = indexOfElement == -1 ? toSlash(okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(indexOfElement));
            }
            if (Intrinsics.areEqual(byteString3, byteString) && buffer.size >= 2) {
                j = -1;
                if (buffer.getByte(1L) == 58 && (('a' <= (c = (char) buffer.getByte(0L)) && c < '{') || ('A' <= c && c < '['))) {
                    if (indexOfElement == 2) {
                        buffer2.write(buffer, 3L);
                    } else {
                        buffer2.write(buffer, 2L);
                    }
                }
                boolean z3 = buffer2.size <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    exhausted = buffer.exhausted();
                    byteString2 = DOT;
                    if (!exhausted) {
                        break;
                    }
                    long indexOfElement2 = buffer.indexOfElement(byteString4);
                    if (indexOfElement2 == j) {
                        readByteString = buffer.readByteString(buffer.size);
                    } else {
                        readByteString = buffer.readByteString(indexOfElement2);
                        buffer.readByte();
                    }
                    ByteString byteString5 = DOT_DOT;
                    if (Intrinsics.areEqual(readByteString, byteString5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), byteString5)))) {
                                arrayList.add(readByteString);
                            } else if (!z2 || arrayList.size() != 1) {
                                CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                            }
                        }
                    } else if (!Intrinsics.areEqual(readByteString, byteString2) && !Intrinsics.areEqual(readByteString, ByteString.EMPTY)) {
                        arrayList.add(readByteString);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        buffer2.m4333write(byteString3);
                    }
                    buffer2.m4333write((ByteString) arrayList.get(i));
                }
                if (buffer2.size == 0) {
                    buffer2.m4333write(byteString2);
                }
                return new okio.Path(buffer2.readByteString(buffer2.size));
            }
        }
        j = -1;
        if (buffer2.size <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            exhausted = buffer.exhausted();
            byteString2 = DOT;
            if (!exhausted) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (buffer2.size == 0) {
        }
        return new okio.Path(buffer2.readByteString(buffer2.size));
    }

    public static final ByteString toSlash(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return SLASH;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("not a directory separator: ", str));
        return null;
    }

    public static final ByteString toSlash(byte b) {
        if (b == 47) {
            return SLASH;
        }
        if (b == 92) {
            return BACKSLASH;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b, "not a directory separator: "));
        return null;
    }
}
