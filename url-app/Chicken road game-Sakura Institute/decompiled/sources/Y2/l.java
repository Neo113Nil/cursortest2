package Y2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4443a = new k();

    public static e a(int i2, int i4, a aVar) {
        e oVar;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            aVar = a.f4398d;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (aVar == a.f4398d) {
                    return new o(1, a.f4399e, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 == 0) {
                oVar = aVar == a.f4398d ? new e(0, null) : new o(1, aVar, null);
            } else {
                if (i2 != Integer.MAX_VALUE) {
                    return aVar == a.f4398d ? new e(i2, null) : new o(i2, aVar, null);
                }
                oVar = new e(Integer.MAX_VALUE, null);
            }
        } else if (aVar == a.f4398d) {
            i.f4441b.getClass();
            oVar = new e(h.f4440b, null);
        } else {
            oVar = new o(1, aVar, null);
        }
        return oVar;
    }
}
