package s2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.EnumC3383a;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* renamed from: s2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3417h extends AbstractC3416g {
    public /* synthetic */ C3417h(InterfaceC3396f interfaceC3396f, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3396f, (i5 & 2) != 0 ? kotlin.coroutines.g.f41113b : coroutineContext, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? EnumC3383a.f43420b : enumC3383a);
    }

    @Override // s2.AbstractC3414e
    protected AbstractC3414e j(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return new C3417h(this.f45971e, coroutineContext, i4, enumC3383a);
    }

    @Override // s2.AbstractC3414e
    public InterfaceC3396f k() {
        return this.f45971e;
    }

    @Override // s2.AbstractC3416g
    protected Object r(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
        Object a4 = this.f45971e.a(interfaceC3397g, dVar);
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }

    public C3417h(InterfaceC3396f interfaceC3396f, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        super(interfaceC3396f, coroutineContext, i4, enumC3383a);
    }
}
