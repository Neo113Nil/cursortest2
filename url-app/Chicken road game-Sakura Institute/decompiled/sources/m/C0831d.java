package m;

import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831d extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public boolean f8089k;

    /* renamed from: l, reason: collision with root package name */
    public int f8090l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o.Q f8092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f8093o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0935k f8094p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0850x f8095q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0831d(o.Q q2, long j4, C0935k c0935k, C0850x c0850x, C2.a aVar) {
        super(2, aVar);
        this.f8092n = q2;
        this.f8093o = j4;
        this.f8094p = c0935k;
        this.f8095q = c0850x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0831d) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0831d c0831d = new C0831d(this.f8092n, this.f8093o, this.f8094p, this.f8095q, aVar);
        c0831d.f8091m = obj;
        return c0831d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0280c0 m4;
        Object b4;
        boolean z4;
        C0938n c0938n;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8090l;
        C0850x c0850x = this.f8095q;
        C0935k c0935k = this.f8094p;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            m4 = W2.B.m((InterfaceC0302y) this.f8091m, null, null, new C0830c(this.f8095q, this.f8093o, this.f8094p, null), 3);
            this.f8091m = m4;
            this.f8090l = 1;
            b4 = this.f8092n.b(this);
            if (b4 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1343r.b(obj);
                        c0850x.f8218F = null;
                        return Unit.f7487a;
                    }
                    c0938n = (C0938n) this.f8091m;
                    AbstractC1343r.b(obj);
                    this.f8091m = null;
                    this.f8090l = 4;
                    if (c0935k.b(c0938n, this) == aVar) {
                        return aVar;
                    }
                    c0850x.f8218F = null;
                    return Unit.f7487a;
                }
                z4 = this.f8089k;
                AbstractC1343r.b(obj);
                if (z4) {
                    C0937m c0937m = new C0937m(this.f8093o);
                    C0938n c0938n2 = new C0938n(c0937m);
                    this.f8091m = c0938n2;
                    this.f8090l = 3;
                    if (c0935k.b(c0937m, this) == aVar) {
                        return aVar;
                    }
                    c0938n = c0938n2;
                    this.f8091m = null;
                    this.f8090l = 4;
                    if (c0935k.b(c0938n, this) == aVar) {
                    }
                }
                c0850x.f8218F = null;
                return Unit.f7487a;
            }
            m4 = (InterfaceC0280c0) this.f8091m;
            AbstractC1343r.b(obj);
            b4 = obj;
        }
        boolean booleanValue = ((Boolean) b4).booleanValue();
        if (m4.b()) {
            this.f8091m = null;
            this.f8089k = booleanValue;
            this.f8090l = 2;
            if (W2.B.c(m4, this) == aVar) {
                return aVar;
            }
            z4 = booleanValue;
            if (z4) {
            }
            c0850x.f8218F = null;
            return Unit.f7487a;
        }
        C0937m c0937m2 = c0850x.f8218F;
        if (c0937m2 != null) {
            InterfaceC0933i c0938n3 = booleanValue ? new C0938n(c0937m2) : new C0936l(c0937m2);
            this.f8091m = null;
            this.f8090l = 5;
            if (c0935k.b(c0938n3, this) == aVar) {
                return aVar;
            }
        }
        c0850x.f8218F = null;
        return Unit.f7487a;
    }
}
