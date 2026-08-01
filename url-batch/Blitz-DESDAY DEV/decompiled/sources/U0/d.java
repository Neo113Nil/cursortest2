package U0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0.c f864a;

    static {
        int i;
        int i2;
        Y0.c cVar = new Y0.c(10);
        int i3 = 1;
        while (true) {
            i = 6;
            if (i3 >= 6) {
                break;
            }
            cVar.add(new e(i3, X0.a.e("Easy ", i3), a.f860a, 0));
            i3++;
        }
        while (true) {
            if (i >= 11) {
                break;
            }
            cVar.add(new e(i, X0.a.e("Medium ", i - 5), a.f861b, 0));
            i++;
        }
        for (i2 = 11; i2 < 16; i2++) {
            cVar.add(new e(i2, X0.a.e("Hard ", i2 - 10), a.f862c, i2 - 8));
        }
        cVar.f();
        cVar.f1007c = true;
        if (cVar.f1006b <= 0) {
            cVar = Y0.c.d;
        }
        f864a = cVar;
    }
}
