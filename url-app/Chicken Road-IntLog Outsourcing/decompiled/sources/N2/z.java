package N2;

import D4.InterfaceC0022w;
import android.content.Context;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class z extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f2156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, H h3, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2155b = str;
        this.f2156c = h3;
        this.f2157d = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new z(this.f2155b, this.f2156c, this.f2157d, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2154a;
        if (i2 == 0) {
            e5.g.y(obj);
            P.d dVar = new P.d(this.f2155b);
            Context context = this.f2156c.f2062a;
            if (context == null) {
                kotlin.jvm.internal.i.l("context");
                throw null;
            }
            B1.g a6 = I.a(context);
            y yVar = new y(dVar, this.f2157d, null);
            this.f2154a = 1;
            if (a6.c(new P.h(yVar, null), this) == enumC1260a) {
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
