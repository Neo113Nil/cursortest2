package z7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f10255a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10256b = new int[10];

    public final int a() {
        if ((this.f10255a & 128) != 0) {
            return this.f10256b[7];
        }
        return 65535;
    }

    public final void b(z zVar) {
        r6.k.f(zVar, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & zVar.f10255a) != 0) {
                c(i7, zVar.f10256b[i7]);
            }
        }
    }

    public final void c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f10256b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f10255a = (1 << i7) | this.f10255a;
            iArr[i7] = i8;
        }
    }
}
