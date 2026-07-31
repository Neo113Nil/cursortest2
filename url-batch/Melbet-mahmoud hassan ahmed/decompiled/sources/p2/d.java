package p2;

import o2.a0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f19985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19986b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19987c;

    private d(int i7, int i8, String str) {
        this.f19985a = i7;
        this.f19986b = i8;
        this.f19987c = str;
    }

    public static d a(a0 a0Var) {
        String str;
        a0Var.P(2);
        int C = a0Var.C();
        int i7 = C >> 1;
        int C2 = ((a0Var.C() >> 3) & 31) | ((C & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(C2 >= 10 ? "." : ".0");
        sb.append(C2);
        return new d(i7, C2, sb.toString());
    }
}
