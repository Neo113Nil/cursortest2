package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes5.dex */
public class c {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    private c() {
    }

    public static String getName(int i8) {
        if (i8 == 5) {
            return "qTESLA-p-I";
        }
        if (i8 == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }

    static int getPrivateSize(int i8) {
        if (i8 == 5) {
            return 5224;
        }
        if (i8 == 6) {
            return 12392;
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }

    static int getPublicSize(int i8) {
        if (i8 == 5) {
            return 14880;
        }
        if (i8 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }

    static int getSignatureSize(int i8) {
        if (i8 == 5) {
            return 2592;
        }
        if (i8 == 6) {
            return 5664;
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }

    static void validate(int i8) {
        if (i8 == 5 || i8 == 6) {
            return;
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }
}
