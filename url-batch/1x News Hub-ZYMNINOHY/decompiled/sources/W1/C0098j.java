package W1;

import android.content.Context;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.List;
import t2.InterfaceC1210u;

/* renamed from: W1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098j extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1676e;
    public final /* synthetic */ K f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098j(K k3, List list, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = k3;
        this.f1677g = list;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C0098j(this.f, this.f1677g, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f1676e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        android.support.v4.media.session.a.T(obj);
        Context context = this.f.f1649a;
        if (context == null) {
            kotlin.jvm.internal.j.g("context");
            throw null;
        }
        C0.e a3 = L.a(context);
        C0097i c0097i = new C0097i(this.f1677g, null);
        this.f1676e = 1;
        Object a4 = a3.a(new N.h(c0097i, null), this);
        return a4 == enumC0317a ? enumC0317a : a4;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0098j) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
