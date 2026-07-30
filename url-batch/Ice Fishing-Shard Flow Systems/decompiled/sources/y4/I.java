package y4;

import P.InterfaceC0144i;
import a.AbstractC0169a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class I extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8559e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K f8560i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f8561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, K k7, long j, V5.b bVar) {
        super(2, bVar);
        this.f8559e = str;
        this.f8560i = k7;
        this.f8561l = j;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new I(this.f8559e, this.f8560i, this.f8561l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8558d;
        if (i2 == 0) {
            V6.b.P(obj);
            T.d q4 = AbstractC0169a.q(this.f8559e);
            Context context = this.f8560i.f8566d;
            if (context == null) {
                Intrinsics.h("context");
                throw null;
            }
            InterfaceC0144i a7 = L.a(context);
            H h7 = new H(q4, this.f8561l, null);
            this.f8558d = 1;
            if (d4.c.m(a7, h7, this) == aVar) {
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
