package k5;

import r2.q;
import u.e1;
import u.s0;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4185a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4186b;

    public /* synthetic */ c(Object obj, boolean z3) {
        this.f4186b = obj;
        this.f4185a = z3;
    }

    public boolean a() {
        return this.f4185a;
    }

    public boolean b(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        o3.e eVar = (o3.e) this.f4186b;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c8 = 2;
        for (int i8 = 0; i8 < i && c8 == 2; i8++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i8));
            c cVar = o3.f.f5614a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case v0.f8308f /* 15 */:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c8 = 2;
                            break;
                    }
                }
                c8 = 0;
            }
            c8 = 1;
        }
        if (c8 == 0) {
            return true;
        }
        if (c8 != 1) {
            return a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(long j7, long j8, i6.c cVar) {
        s0 s0Var;
        int i;
        long j9;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i8 = s0Var.f7094j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                s0Var.f7094j = i8 - Integer.MIN_VALUE;
                Object obj = s0Var.f7093h;
                i = s0Var.f7094j;
                if (i != 0) {
                    s6.a.K(obj);
                    j9 = 0;
                    if (this.f4185a) {
                        e1 e1Var = (e1) this.f4186b;
                        if (!e1Var.i) {
                            s0Var.f7092g = j8;
                            s0Var.f7094j = 1;
                            obj = e1Var.a(j8, s0Var);
                            h6.a aVar = h6.a.f3204d;
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        j9 = q.d(j8, j9);
                    }
                    return new q(j9);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j8 = s0Var.f7092g;
                s6.a.K(obj);
                j9 = ((q) obj).f6537a;
                j9 = q.d(j8, j9);
                return new q(j9);
            }
        }
        s0Var = new s0(this, cVar);
        Object obj2 = s0Var.f7093h;
        i = s0Var.f7094j;
        if (i != 0) {
        }
        j9 = ((q) obj2).f6537a;
        j9 = q.d(j8, j9);
        return new q(j9);
    }

    public c(o3.e eVar, boolean z3) {
        this.f4186b = eVar;
        this.f4185a = z3;
    }
}
