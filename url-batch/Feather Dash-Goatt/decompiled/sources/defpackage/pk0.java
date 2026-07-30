package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class pk0 extends ok0 {
    public static int a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        dd0.e("Cannot round NaN value.");
        return 0;
    }
}
