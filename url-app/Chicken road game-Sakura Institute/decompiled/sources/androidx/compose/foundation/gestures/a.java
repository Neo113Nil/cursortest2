package androidx.compose.foundation.gestures;

import j6.c;
import m.w0;
import o.f1;
import o.j0;
import o.k;
import o.p0;
import o.q0;
import o.r0;
import o.s0;
import o.y0;
import p.j;
import r6.s;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f613a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f614b = new p0();

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f615c = new r0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f1 f1Var, long j8, c cVar) {
        s0 s0Var;
        int i7;
        s sVar;
        f1 f1Var2;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i8 = s0Var.f6734i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                s0Var.f6734i = i8 - Integer.MIN_VALUE;
                Object obj = s0Var.f6733h;
                i7 = s0Var.f6734i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    sVar = new s();
                    m.a aVar = new m.a(f1Var, j8, sVar, null, 1);
                    s0Var.f6731f = f1Var;
                    s0Var.f6732g = sVar;
                    s0Var.f6734i = 1;
                    Object e9 = f1Var.e(m.p0.f6228f, aVar, s0Var);
                    i6.a aVar2 = i6.a.f4956f;
                    if (e9 == aVar2) {
                        return aVar2;
                    }
                    f1Var2 = f1Var;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s sVar2 = s0Var.f6732g;
                    f1 f1Var3 = s0Var.f6731f;
                    d6.a.e(obj);
                    sVar = sVar2;
                    f1Var2 = f1Var3;
                }
                return new y0.c(f1Var2.g(sVar.f7965f));
            }
        }
        s0Var = new s0(cVar);
        Object obj2 = s0Var.f6733h;
        i7 = s0Var.f6734i;
        if (i7 != 0) {
        }
        return new y0.c(f1Var2.g(sVar.f7965f));
    }

    public static final o b(o oVar, y0 y0Var, j0 j0Var, w0 w0Var, boolean z8, boolean z9, k kVar, j jVar) {
        return oVar.j(new ScrollableElement(w0Var, kVar, j0Var, y0Var, jVar, z8, z9));
    }
}
