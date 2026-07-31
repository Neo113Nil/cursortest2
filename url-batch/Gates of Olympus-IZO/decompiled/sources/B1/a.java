package B1;

import D1.C0018f;
import D1.v;
import I.C0102j0;
import I2.l;
import L1.z;
import R1.i;
import Y1.e;
import com.gates.olympus.miruv.WorkbenchActivity;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class a extends i implements e {

    /* renamed from: e, reason: collision with root package name */
    public C0102j0 f400e;

    /* renamed from: f, reason: collision with root package name */
    public int f401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0018f f402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0102j0 f403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0018f c0018f, C0102j0 c0102j0, P1.d dVar) {
        super(2, dVar);
        this.f402g = c0018f;
        this.f403h = c0102j0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new a(this.f402g, this.f403h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((a) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        C0102j0 c0102j0;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f401f;
        if (i3 == 0) {
            l.Q(obj);
            C0102j0 c0102j02 = this.f403h;
            this.f400e = c0102j02;
            this.f401f = 1;
            Object a3 = this.f402g.a(this);
            if (a3 == aVar) {
                return aVar;
            }
            c0102j0 = c0102j02;
            obj = a3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0102j0 = this.f400e;
            l.Q(obj);
        }
        int i4 = WorkbenchActivity.f4422x;
        c0102j0.setValue((v) obj);
        return z.f2729a;
    }
}
