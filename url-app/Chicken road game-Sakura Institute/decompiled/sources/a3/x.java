package a3;

import Z2.InterfaceC0331g;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class x implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final Y2.q f4994d;

    public x(Y2.q qVar) {
        this.f4994d = qVar;
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a aVar) {
        Object t4 = ((Y2.p) this.f4994d).f4447j.t(aVar, obj);
        return t4 == D2.a.f2163d ? t4 : Unit.f7487a;
    }
}
