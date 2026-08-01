package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a0 {
    static d1.l a(float f3) {
        if (f3 <= 0.0d) {
            c0.a.a("invalid weight; must be greater than zero");
        }
        if (f3 > Float.MAX_VALUE) {
            f3 = Float.MAX_VALUE;
        }
        return new i0(f3, true);
    }
}
