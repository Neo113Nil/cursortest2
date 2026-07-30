package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

@Deprecated
/* loaded from: classes3.dex */
public final class UrlTemplate {
    private static final String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final String DEFAULT_FORMAT_TAG = "%01d";
    private static final String ESCAPED_DOLLAR = "$$";
    private static final String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final String TIME = "Time";
    private static final int TIME_ID = 4;
    private final int identifierCount;
    private final String[] identifierFormatTags;
    private final int[] identifiers;
    private final String[] urlPieces;

    private UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i8) {
        this.urlPieces = strArr;
        this.identifiers = iArr;
        this.identifierFormatTags = strArr2;
        this.identifierCount = i8;
    }

    public static UrlTemplate compile(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new UrlTemplate(strArr, iArr, strArr2, parseTemplate(str, strArr, iArr, strArr2));
    }

    private static int parseTemplate(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            int indexOf = str.indexOf("$", i8);
            if (indexOf == -1) {
                strArr[i9] = strArr[i9] + str.substring(i8);
                i8 = str.length();
            } else if (indexOf != i8) {
                strArr[i9] = strArr[i9] + str.substring(i8, indexOf);
                i8 = indexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, i8)) {
                strArr[i9] = strArr[i9] + "$";
                i8 += 2;
            } else {
                int i10 = i8 + 1;
                int indexOf2 = str.indexOf("$", i10);
                String substring = str.substring(i10, indexOf2);
                if (substring.equals(REPRESENTATION)) {
                    iArr[i9] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = DEFAULT_FORMAT_TAG;
                    }
                    substring.hashCode();
                    switch (substring) {
                        case "Number":
                            iArr[i9] = 2;
                            break;
                        case "Time":
                            iArr[i9] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i9] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i9] = str2;
                }
                i9++;
                strArr[i9] = "";
                i8 = indexOf2 + 1;
            }
        }
        return i9;
    }

    public String buildUri(String str, long j8, int i8, long j9) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        while (true) {
            int i10 = this.identifierCount;
            if (i9 >= i10) {
                sb.append(this.urlPieces[i10]);
                return sb.toString();
            }
            sb.append(this.urlPieces[i9]);
            int i11 = this.identifiers[i9];
            if (i11 == 1) {
                sb.append(str);
            } else if (i11 == 2) {
                sb.append(String.format(Locale.US, this.identifierFormatTags[i9], Long.valueOf(j8)));
            } else if (i11 == 3) {
                sb.append(String.format(Locale.US, this.identifierFormatTags[i9], Integer.valueOf(i8)));
            } else if (i11 == 4) {
                sb.append(String.format(Locale.US, this.identifierFormatTags[i9], Long.valueOf(j9)));
            }
            i9++;
        }
    }
}
