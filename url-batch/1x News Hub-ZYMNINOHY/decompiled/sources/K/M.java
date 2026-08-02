package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class M extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.p f689e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f691h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ N f692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f694k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(kotlin.jvm.internal.p pVar, N n3, Object obj, boolean z, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f691h = pVar;
        this.f692i = n3;
        this.f693j = obj;
        this.f694k = z;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        M m3 = new M(this.f691h, this.f692i, this.f693j, this.f694k, interfaceC0300c);
        m3.f690g = obj;
        return m3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        Y y3;
        kotlin.jvm.internal.p pVar;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f;
        kotlin.jvm.internal.p pVar2 = this.f691h;
        Object obj2 = this.f693j;
        N n3 = this.f692i;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            Y y4 = (Y) this.f690g;
            h0 g3 = n3.g();
            this.f690g = y4;
            this.f689e = pVar2;
            this.f = 1;
            Integer num = new Integer(((AtomicInteger) g3.f772b.f2532b).incrementAndGet());
            if (num != enumC0317a) {
                y3 = y4;
                obj = num;
                pVar = pVar2;
            }
            return enumC0317a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            if (this.f694k) {
                n3.f701h.w(new C0039c(obj2 != null ? obj2.hashCode() : 0, pVar2.f9691a, obj2));
            }
            return C0195i.f2555a;
        }
        pVar = this.f689e;
        y3 = (Y) this.f690g;
        android.support.v4.media.session.a.T(obj);
        pVar.f9691a = ((Number) obj).intValue();
        this.f690g = null;
        this.f689e = null;
        this.f = 2;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) b((InterfaceC0300c) obj2, (Y) obj)).g(C0195i.f2555a);
    }
}
