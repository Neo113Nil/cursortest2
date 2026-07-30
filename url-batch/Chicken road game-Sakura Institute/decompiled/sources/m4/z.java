package m4;

import o.f1;
import o.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6423b;

    public /* synthetic */ z(Object obj, boolean z8) {
        this.f6423b = obj;
        this.f6422a = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j8, long j9, j6.c cVar) {
        t0 t0Var;
        int i7;
        long j10;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i8 = t0Var.f6746i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                t0Var.f6746i = i8 - Integer.MIN_VALUE;
                Object obj = t0Var.f6744g;
                i7 = t0Var.f6746i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (!this.f6422a) {
                        j10 = 0;
                        return new m2.o(j10);
                    }
                    f1 f1Var = (f1) this.f6423b;
                    t0Var.f6743f = j9;
                    t0Var.f6746i = 1;
                    obj = f1Var.b(j9, t0Var);
                    i6.a aVar = i6.a.f4956f;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j9 = t0Var.f6743f;
                    d6.a.e(obj);
                }
                j10 = m2.o.d(j9, ((m2.o) obj).f6330a);
                return new m2.o(j10);
            }
        }
        t0Var = new t0(this, cVar);
        Object obj2 = t0Var.f6744g;
        i7 = t0Var.f6746i;
        if (i7 != 0) {
        }
        j10 = m2.o.d(j9, ((m2.o) obj2).f6330a);
        return new m2.o(j10);
    }
}
