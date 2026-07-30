package cn.hutool.core.text;

/* loaded from: classes.dex */
public class a {
    private static final int ASCII_LENGTH = 128;
    private static final String[] CACHE = new String[128];

    static {
        for (char c8 = 0; c8 < 128; c8 = (char) (c8 + 1)) {
            CACHE[c8] = String.valueOf(c8);
        }
    }

    public static String toString(char c8) {
        return c8 < 128 ? CACHE[c8] : String.valueOf(c8);
    }
}
