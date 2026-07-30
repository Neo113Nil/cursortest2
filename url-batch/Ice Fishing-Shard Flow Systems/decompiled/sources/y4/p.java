package y4;

import P.InterfaceC0144i;
import a.AbstractC0169a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class p extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.D f8610d;

    /* renamed from: e, reason: collision with root package name */
    public int f8611e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8612i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f8613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.D f8614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, K k7, kotlin.jvm.internal.D d7, V5.b bVar) {
        super(2, bVar);
        this.f8612i = str;
        this.f8613l = k7;
        this.f8614m = d7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new p(this.f8612i, this.f8613l, this.f8614m, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.D d7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8611e;
        if (i2 == 0) {
            V6.b.P(obj);
            T.d a7 = AbstractC0169a.a(this.f8612i);
            Context context = this.f8613l.f8566d;
            if (context == null) {
                Intrinsics.h("context");
                throw null;
            }
            P0.e eVar = new P0.e(15, ((InterfaceC0144i) ((l2.c) L.a(context)).f6269d).getData(), a7, false);
            kotlin.jvm.internal.D d8 = this.f8614m;
            this.f8610d = d8;
            this.f8611e = 1;
            Object d9 = q6.w.d(eVar, this);
            if (d9 == aVar) {
                return aVar;
            }
            d7 = d8;
            obj = d9;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7 = this.f8610d;
            V6.b.P(obj);
        }
        d7.f6152d = obj;
        return Unit.f6114a;
    }
}
