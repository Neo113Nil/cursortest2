package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class wp2 extends vp2 {
    public static String L(int i, String str) {
        str.getClass();
        if (i < 0) {
            lh.c(in1.l(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String M(int i, String str) {
        str.getClass();
        if (i < 0) {
            lh.c(in1.l(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
