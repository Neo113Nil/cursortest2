package r6;

import kotlin.Unit;
import kotlin.jvm.internal.D;
import n6.AbstractC0792z;
import n6.EnumC0790x;
import n6.InterfaceC0789w;
import n6.X;
import n6.f0;

/* loaded from: classes.dex */
public final class k implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f7568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0789w f7569e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f7570i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.e f7571l;

    public k(D d7, InterfaceC0789w interfaceC0789w, m mVar, q6.e eVar) {
        this.f7568d = d7;
        this.f7569e = interfaceC0789w;
        this.f7570i = mVar;
        this.f7571l = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, V5.b bVar) {
        j jVar;
        int i2;
        k kVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i5 = jVar.f7567m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.f7567m = i5 - Integer.MIN_VALUE;
                Object obj2 = jVar.f7565i;
                W5.a aVar = W5.a.f2787d;
                i2 = jVar.f7567m;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    X x7 = (X) this.f7568d.f6152d;
                    if (x7 != null) {
                        x7.d(new n("Child of the scoped flow was cancelled"));
                        jVar.f7563d = this;
                        jVar.f7564e = obj;
                        jVar.f7567m = 1;
                        if (((f0) x7).I(jVar) == aVar) {
                            return aVar;
                        }
                    }
                    kVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = jVar.f7564e;
                    kVar = jVar.f7563d;
                    V6.b.P(obj2);
                }
                D d7 = kVar.f7568d;
                InterfaceC0789w interfaceC0789w = kVar.f7569e;
                EnumC0790x enumC0790x = EnumC0790x.f7088d;
                d7.f6152d = AbstractC0792z.l(interfaceC0789w, null, new i(kVar.f7570i, kVar.f7571l, obj, null), 1);
                return Unit.f6114a;
            }
        }
        jVar = new j(this, bVar);
        Object obj22 = jVar.f7565i;
        W5.a aVar2 = W5.a.f2787d;
        i2 = jVar.f7567m;
        if (i2 != 0) {
        }
        D d72 = kVar.f7568d;
        InterfaceC0789w interfaceC0789w2 = kVar.f7569e;
        EnumC0790x enumC0790x2 = EnumC0790x.f7088d;
        d72.f6152d = AbstractC0792z.l(interfaceC0789w2, null, new i(kVar.f7570i, kVar.f7571l, obj, null), 1);
        return Unit.f6114a;
    }
}
