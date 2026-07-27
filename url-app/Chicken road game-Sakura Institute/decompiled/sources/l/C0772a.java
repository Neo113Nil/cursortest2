package l;

import B1.C0097d;
import G.C0205j0;
import P0.C0259a;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C0898m;
import o.C0899m0;
import p0.C0963Y;
import s.C1113q;
import s.RunnableC1097a;
import s1.C1183B;
import s1.C1193i;
import w.C1272l;
import z2.C1405I;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772a extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7666e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7668j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0772a(M2.A a4, C1183B c1183b, s1.v vVar, Bundle bundle) {
        super(1);
        this.f7665d = 3;
        this.f7669k = a4;
        this.f7666e = c1183b;
        this.f7667i = vVar;
        this.f7668j = bundle;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7665d) {
            case 0:
                C0786l c0786l = (C0786l) obj;
                C0778d c0778d = (C0778d) this.f7666e;
                AbstractC0779e.k(c0786l, c0778d.f7700c);
                C0205j0 c0205j0 = c0786l.f7794e;
                Object a4 = C0778d.a(c0778d, c0205j0.getValue());
                boolean a5 = Intrinsics.a(a4, c0205j0.getValue());
                Function1 function1 = (Function1) this.f7668j;
                if (!a5) {
                    c0778d.f7700c.f7813e.setValue(a4);
                    ((C0788n) this.f7667i).f7813e.setValue(a4);
                    if (function1 != null) {
                        function1.invoke(c0778d);
                    }
                    c0786l.f7798i.setValue(Boolean.FALSE);
                    c0786l.f7793d.invoke();
                    ((M2.A) this.f7669k).f3576d = true;
                } else if (function1 != null) {
                    function1.invoke(c0778d);
                }
                return Unit.f7487a;
            case 1:
                C0786l c0786l2 = (C0786l) obj;
                float floatValue = ((Number) c0786l2.f7794e.getValue()).floatValue();
                M2.B b4 = (M2.B) this.f7666e;
                float f4 = floatValue - b4.f3577d;
                float a6 = ((C0899m0) this.f7667i).a(f4);
                b4.f3577d = ((Number) c0786l2.f7794e.getValue()).floatValue();
                ((M2.B) this.f7668j).f3577d = ((Number) c0786l2.f7790a.f7854b.invoke(c0786l2.f7795f)).floatValue();
                if (Math.abs(f4 - a6) > 0.5f) {
                    c0786l2.f7798i.setValue(Boolean.FALSE);
                    c0786l2.f7793d.invoke();
                }
                ((C0898m) this.f7669k).getClass();
                return Unit.f7487a;
            case 2:
                C0097d c0097d = new C0097d((C1113q) this.f7667i, (C0963Y) this.f7668j, (RunnableC1097a) this.f7669k, 22);
                s.z zVar = (s.z) this.f7666e;
                zVar.f9980c = c0097d;
                return new C0259a(4, zVar);
            case 3:
                C1193i it = (C1193i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((M2.A) this.f7669k).f3576d = true;
                C1405I c1405i = C1405I.f11931d;
                ((C1183B) this.f7666e).a((s1.v) this.f7667i, (Bundle) this.f7668j, it, c1405i);
                return Unit.f7487a;
            default:
                w.P p4 = (w.P) this.f7666e;
                if (p4.b()) {
                    M2.E e4 = new M2.E();
                    P.h hVar = new P.h(p4.f11057d, p4.f11073t, e4, 15);
                    G0.z zVar2 = (G0.z) this.f7667i;
                    G0.t tVar = zVar2.f3096a;
                    tVar.e((G0.y) this.f7668j, (G0.m) this.f7669k, hVar, p4.f11074u);
                    G0.E e5 = new G0.E(zVar2, tVar);
                    zVar2.f3097b.set(e5);
                    e4.f3580d = e5;
                    p4.f11058e = e5;
                }
                return new C1272l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0772a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(1);
        this.f7665d = i2;
        this.f7666e = obj;
        this.f7667i = obj2;
        this.f7668j = obj3;
        this.f7669k = obj4;
    }
}
