package cn.hutool.core.text.escape;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
class a {
    a() {
    }

    public static String[][] invert(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 2);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr2[i8][0] = strArr[i8][1];
            strArr2[i8][1] = strArr[i8][0];
        }
        return strArr2;
    }
}
