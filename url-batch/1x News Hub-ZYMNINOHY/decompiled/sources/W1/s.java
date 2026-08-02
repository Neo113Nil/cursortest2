package W1;

import K.InterfaceC0044h;
import android.content.Context;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class s extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.q f1700e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K f1702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f1703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, K k3, kotlin.jvm.internal.q qVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f1701g = str;
        this.f1702h = k3;
        this.f1703i = qVar;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new s(this.f1701g, this.f1702h, this.f1703i, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        kotlin.jvm.internal.q qVar;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            N.d dVar = new N.d(this.f1701g);
            K k3 = this.f1702h;
            Context context = k3.f1649a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            A0.f fVar = new A0.f(((InterfaceC0044h) L.a(context).f201b).getData(), dVar, k3, 11);
            kotlin.jvm.internal.q qVar2 = this.f1703i;
            this.f1700e = qVar2;
            this.f = 1;
            Object c3 = w2.q.c(fVar, this);
            if (c3 == enumC0317a) {
                return enumC0317a;
            }
            qVar = qVar2;
            obj = c3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.f1700e;
            android.support.v4.media.session.a.T(obj);
        }
        qVar.f9692a = obj;
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
