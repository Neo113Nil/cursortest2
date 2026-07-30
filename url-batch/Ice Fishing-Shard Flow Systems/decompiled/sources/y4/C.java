package y4;

import P.InterfaceC0144i;
import a.AbstractC0169a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class C extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8537e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K f8538i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f8539l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, K k7, boolean z7, V5.b bVar) {
        super(2, bVar);
        this.f8537e = str;
        this.f8538i = k7;
        this.f8539l = z7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new C(this.f8537e, this.f8538i, this.f8539l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8536d;
        if (i2 == 0) {
            V6.b.P(obj);
            T.d a7 = AbstractC0169a.a(this.f8537e);
            Context context = this.f8538i.f8566d;
            if (context == null) {
                Intrinsics.h("context");
                throw null;
            }
            InterfaceC0144i a8 = L.a(context);
            C1031B c1031b = new C1031B(a7, this.f8539l, null);
            this.f8536d = 1;
            if (d4.c.m(a8, c1031b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return Unit.f6114a;
    }
}
