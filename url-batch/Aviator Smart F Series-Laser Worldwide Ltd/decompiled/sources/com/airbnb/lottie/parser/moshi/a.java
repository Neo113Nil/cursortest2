package com.airbnb.lottie.parser.moshi;

/* loaded from: classes.dex */
final class a {
    static final int CLOSED = 8;
    static final int DANGLING_NAME = 4;
    static final int EMPTY_ARRAY = 1;
    static final int EMPTY_DOCUMENT = 6;
    static final int EMPTY_OBJECT = 3;
    static final int NONEMPTY_ARRAY = 2;
    static final int NONEMPTY_DOCUMENT = 7;
    static final int NONEMPTY_OBJECT = 5;

    private a() {
    }

    static String getPath(int i8, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(iArr2[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append('.');
                String str = strArr[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
