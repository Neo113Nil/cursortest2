package kotlin.text;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r extends q {
    public static String m(int i3, String str) {
        str.getClass();
        if (i3 < 0) {
            a2.r.h(n0.l.f(i3, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        return str.substring(0, i3);
    }
}
