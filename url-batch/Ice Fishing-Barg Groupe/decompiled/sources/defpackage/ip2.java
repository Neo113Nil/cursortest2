package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ip2 {
    public static final hp2 PxuCJdSBwIXG;

    static {
        df1.Companion.getClass();
        PxuCJdSBwIXG = new hp2(0, 0);
    }

    public static final yk2 PxuCJdSBwIXG(wr2 wr2Var, v8 v8Var) {
        ((rc1) wr2Var).getClass();
        df1.Companion.getClass();
        int length = v8Var.OPXfSBeufaJ8.length();
        int length2 = v8Var.OPXfSBeufaJ8.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            lS5Rgt96tfkO(i, length2, i);
        }
        lS5Rgt96tfkO(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            TSizfFm2Yiuu(i2, length, i2);
        }
        TSizfFm2Yiuu(length2, length, length2);
        return new yk2(v8Var, new hp2(v8Var.OPXfSBeufaJ8.length(), v8Var.OPXfSBeufaJ8.length()));
    }

    public static final void TSizfFm2Yiuu(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        hp0.TSizfFm2Yiuu("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }

    public static final void lS5Rgt96tfkO(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        hp0.TSizfFm2Yiuu("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }
}
