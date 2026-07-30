package com.google.android.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;

@Deprecated
/* loaded from: classes3.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    private static int[] getUriIndices(String str) {
        int i8;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i9 = indexOf4 + 2;
        if (i9 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i9) == '/') {
            i8 = str.indexOf(47, indexOf4 + 3);
            if (i8 == -1 || i8 > indexOf2) {
                i8 = indexOf2;
            }
        } else {
            i8 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i8;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(@Nullable String str) {
        return (str == null || getUriIndices(str)[0] == -1) ? false : true;
    }

    private static String removeDotSegments(StringBuilder sb, int i8, int i9) {
        int i10;
        int i11;
        if (i8 >= i9) {
            return sb.toString();
        }
        if (sb.charAt(i8) == '/') {
            i8++;
        }
        int i12 = i8;
        int i13 = i12;
        while (i12 <= i9) {
            if (i12 == i9) {
                i10 = i12;
            } else if (sb.charAt(i12) == '/') {
                i10 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb.charAt(i13) == '.') {
                sb.delete(i13, i10);
                i9 -= i10 - i13;
            } else {
                if (i12 == i13 + 2 && sb.charAt(i13) == '.' && sb.charAt(i14) == '.') {
                    i11 = sb.lastIndexOf("/", i13 - 2) + 1;
                    int i15 = i11 > i8 ? i11 : i8;
                    sb.delete(i15, i10);
                    i9 -= i10 - i15;
                } else {
                    i11 = i12 + 1;
                }
                i13 = i11;
            }
            i12 = i13;
        }
        return sb.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    public static String resolve(@Nullable String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb.append(str2);
            removeDotSegments(sb, uriIndices[1], uriIndices[2]);
            return sb.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (uriIndices[2] == 0) {
            sb.append((CharSequence) str, 0, uriIndices2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i8 = uriIndices[1];
        if (i8 != 0) {
            int i9 = uriIndices2[0] + 1;
            sb.append((CharSequence) str, 0, i9);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices[1] + i9, i9 + uriIndices[2]);
        }
        if (str2.charAt(i8) == '/') {
            sb.append((CharSequence) str, 0, uriIndices2[1]);
            sb.append(str2);
            int i10 = uriIndices2[1];
            return removeDotSegments(sb, i10, uriIndices[2] + i10);
        }
        int i11 = uriIndices2[0] + 2;
        int i12 = uriIndices2[1];
        if (i11 >= i12 || i12 != uriIndices2[2]) {
            int lastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
            int i13 = lastIndexOf == -1 ? uriIndices2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i13);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices2[1], i13 + uriIndices[2]);
        }
        sb.append((CharSequence) str, 0, i12);
        sb.append(cn.hutool.core.io.file.c.UNIX_SEPARATOR);
        sb.append(str2);
        int i14 = uriIndices2[1];
        return removeDotSegments(sb, i14, uriIndices[2] + i14 + 1);
    }

    public static Uri resolveToUri(@Nullable String str, @Nullable String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
