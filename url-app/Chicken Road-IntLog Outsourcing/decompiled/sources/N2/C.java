package N2;

import D4.InterfaceC0022w;
import android.content.Context;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class C extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f2045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f2046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, H h3, double d6, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2044b = str;
        this.f2045c = h3;
        this.f2046d = d6;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C(this.f2044b, this.f2045c, this.f2046d, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2043a;
        if (i2 == 0) {
            e5.g.y(obj);
            P.d dVar = new P.d(this.f2044b);
            Context context = this.f2045c.f2062a;
            if (context == null) {
                kotlin.jvm.internal.i.l("context");
                throw null;
            }
            B1.g a6 = I.a(context);
            B b6 = new B(dVar, this.f2046d, null);
            this.f2043a = 1;
            if (a6.c(new P.h(b6, null), this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return f4.v.f5689a;
    }
}
