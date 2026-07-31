package q2;

import W1.AbstractC1233c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import q2.h;
import t2.P;
import t2.y;

/* loaded from: classes3.dex */
public class o extends b {

    /* renamed from: n, reason: collision with root package name */
    private final int f43484n;

    /* renamed from: o, reason: collision with root package name */
    private final EnumC3383a f43485o;

    public o(int i4, EnumC3383a enumC3383a, Function1 function1) {
        super(i4, function1);
        this.f43484n = i4;
        this.f43485o = enumC3383a;
        if (enumC3383a == EnumC3383a.f43420b) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + H.b(b.class).e() + " instead").toString());
        }
        if (i4 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    static /* synthetic */ Object X0(o oVar, Object obj, kotlin.coroutines.d dVar) {
        P d4;
        Object Z02 = oVar.Z0(obj, true);
        if (!(Z02 instanceof h.a)) {
            return Unit.f41027a;
        }
        h.e(Z02);
        Function1 function1 = oVar.f43435c;
        if (function1 == null || (d4 = y.d(function1, obj, null, 2, null)) == null) {
            throw oVar.W();
        }
        AbstractC1233c.a(d4, oVar.W());
        throw d4;
    }

    private final Object Y0(Object obj, boolean z4) {
        Function1 function1;
        P d4;
        Object r4 = super.r(obj);
        if (h.i(r4) || h.h(r4)) {
            return r4;
        }
        if (!z4 || (function1 = this.f43435c) == null || (d4 = y.d(function1, obj, null, 2, null)) == null) {
            return h.f43478b.c(Unit.f41027a);
        }
        throw d4;
    }

    private final Object Z0(Object obj, boolean z4) {
        return this.f43485o == EnumC3383a.f43422d ? Y0(obj, z4) : N0(obj);
    }

    @Override // q2.b
    protected boolean k0() {
        return this.f43485o == EnumC3383a.f43421c;
    }

    @Override // q2.b, q2.u
    public Object r(Object obj) {
        return Z0(obj, false);
    }

    @Override // q2.b, q2.u
    public Object s(Object obj, kotlin.coroutines.d dVar) {
        return X0(this, obj, dVar);
    }
}
