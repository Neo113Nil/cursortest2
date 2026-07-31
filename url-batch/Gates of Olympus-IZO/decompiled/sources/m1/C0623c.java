package m1;

import I.C0112o0;
import I2.l;
import L1.z;
import R1.i;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.H;
import k2.AbstractC0552y;
import n2.InterfaceC0690O;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623c extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5921e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0238x f5923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0230o f5924h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P1.i f5925i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0690O f5926j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623c(C0238x c0238x, EnumC0230o enumC0230o, P1.i iVar, InterfaceC0690O interfaceC0690O, P1.d dVar) {
        super(2, dVar);
        this.f5923g = c0238x;
        this.f5924h = enumC0230o;
        this.f5925i = iVar;
        this.f5926j = interfaceC0690O;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0623c c0623c = new C0623c(this.f5923g, this.f5924h, this.f5925i, this.f5926j, dVar);
        c0623c.f5922f = obj;
        return c0623c;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0623c) create((C0112o0) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Object d3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5921e;
        z zVar = z.f2729a;
        if (i3 == 0) {
            l.Q(obj);
            C0622b c0622b = new C0622b(this.f5925i, this.f5926j, (C0112o0) this.f5922f, null);
            this.f5921e = 1;
            EnumC0230o enumC0230o = EnumC0230o.f4026e;
            EnumC0230o enumC0230o2 = this.f5924h;
            if (enumC0230o2 == enumC0230o) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            C0238x c0238x = this.f5923g;
            if (c0238x.f4041d == EnumC0230o.f4025d || (d3 = AbstractC0552y.d(new H(c0238x, enumC0230o2, c0622b, null), this)) != aVar) {
                d3 = zVar;
            }
            if (d3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return zVar;
    }
}
