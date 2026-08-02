package okhttp3.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.cache.DiskLruCache$fileSystem$1;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Options;
import okio.Path;

/* loaded from: classes3.dex */
public abstract class _UtilCommonKt {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final Options UNICODE_BOMS;

    static {
        int i = Options.$r8$clinit;
        ByteString.Companion companion = ByteString.Companion;
        UNICODE_BOMS = Tags.of(ByteString.Companion.decodeHex("efbbbf"), ByteString.Companion.decodeHex("feff"), ByteString.Companion.decodeHex("fffe0000"), ByteString.Companion.decodeHex("fffe"), ByteString.Companion.decodeHex("0000feff"));
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "length=", ", offset=");
            m1149m.append(j2);
            m1149m.append(", count=");
            m1149m.append(j2);
            throw new ArrayIndexOutOfBoundsException(m1149m.toString());
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void deleteContents(FileSystem fileSystem, Path path) {
        fileSystem.getClass();
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).isDirectory) {
                        deleteContents(fileSystem, path2);
                    }
                    fileSystem.delete(path2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1, Path path) {
        diskLruCache$fileSystem$1.getClass();
        path.getClass();
        try {
            diskLruCache$fileSystem$1.delete(path, false);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(String str, int i, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (StringsKt.contains((CharSequence) str2, str.charAt(i), false)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int indexOfLastNonAsciiWhitespace(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return StringsKt__StringsJVMKt.equals(str, "Authorization", true) || StringsKt__StringsJVMKt.equals(str, "Cookie", true) || StringsKt__StringsJVMKt.equals(str, "Proxy-Authorization", true) || StringsKt__StringsJVMKt.equals(str, "Set-Cookie", true);
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int readMedium(BufferedSource bufferedSource) {
        bufferedSource.getClass();
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final int toNonNegativeInt(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String trimSubstring(int i, int i2, String str) {
        str.getClass();
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(i, i2, str);
        return str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(indexOfFirstNonAsciiWhitespace, i2, str));
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
