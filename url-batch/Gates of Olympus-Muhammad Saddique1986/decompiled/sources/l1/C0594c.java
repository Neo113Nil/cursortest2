package l1;

import R1.y;
import X1.i;
import e2.InterfaceC0426e;
import f2.j;

/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594c extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6586h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f6588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0594c(InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f6588j = (i) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0594c) o((V1.d) obj2, (C0593b) obj)).q(y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0594c c0594c = new C0594c(this.f6588j, dVar);
        c0594c.f6587i = obj;
        return c0594c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6586h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0593b c0593b = (C0593b) this.f6587i;
            this.f6586h = 1;
            obj = this.f6588j.h(c0593b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        C0593b c0593b2 = (C0593b) obj;
        j.d(c0593b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        c0593b2.f6585b.f6365a.set(true);
        return c0593b2;
    }
}
