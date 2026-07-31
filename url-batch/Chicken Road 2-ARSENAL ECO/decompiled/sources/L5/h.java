package L5;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import H5.X;
import H5.g0;
import k5.v;
import kotlin.jvm.internal.s;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class h implements K5.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f1506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0163x f1507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K5.b f1508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K5.d f1509i;

    public h(s sVar, InterfaceC0163x interfaceC0163x, K5.b bVar, K5.d dVar) {
        this.f1506f = sVar;
        this.f1507g = interfaceC0163x;
        this.f1508h = bVar;
        this.f1509i = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // K5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, AbstractC0607c abstractC0607c) {
        g gVar;
        int i7;
        h hVar;
        if (abstractC0607c instanceof g) {
            gVar = (g) abstractC0607c;
            int i8 = gVar.f1505j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f1505j = i8 - Integer.MIN_VALUE;
                Object obj2 = gVar.f1503h;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = gVar.f1505j;
                if (i7 != 0) {
                    AbstractC0676f.w(obj2);
                    X x6 = (X) this.f1506f.f5233f;
                    if (x6 != null) {
                        x6.d(new j("Child of the scoped flow was cancelled"));
                        gVar.f1501f = this;
                        gVar.f1502g = obj;
                        gVar.f1505j = 1;
                        if (((g0) x6).I(gVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    }
                    hVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = gVar.f1502g;
                    hVar = gVar.f1501f;
                    AbstractC0676f.w(obj2);
                }
                hVar.f1506f.f5233f = AbstractC0165z.l(hVar.f1507g, null, new f(hVar.f1508h, hVar.f1509i, obj, null), 1);
                return v.f5219a;
            }
        }
        gVar = new g(this, abstractC0607c);
        Object obj22 = gVar.f1503h;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = gVar.f1505j;
        if (i7 != 0) {
        }
        hVar.f1506f.f5233f = AbstractC0165z.l(hVar.f1507g, null, new f(hVar.f1508h, hVar.f1509i, obj, null), 1);
        return v.f5219a;
    }
}
