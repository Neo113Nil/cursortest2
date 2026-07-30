package y4;

import P.InterfaceC0144i;
import a.AbstractC0169a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class y extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.D f8648d;

    /* renamed from: e, reason: collision with root package name */
    public int f8649e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8650i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f8651l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.D f8652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, K k7, kotlin.jvm.internal.D d7, V5.b bVar) {
        super(2, bVar);
        this.f8650i = str;
        this.f8651l = k7;
        this.f8652m = d7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new y(this.f8650i, this.f8651l, this.f8652m, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.D d7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8649e;
        if (i2 == 0) {
            V6.b.P(obj);
            T.d E7 = AbstractC0169a.E(this.f8650i);
            Context context = this.f8651l.f8566d;
            if (context == null) {
                Intrinsics.h("context");
                throw null;
            }
            P0.s sVar = new P0.s(((InterfaceC0144i) ((l2.c) L.a(context)).f6269d).getData(), E7);
            kotlin.jvm.internal.D d8 = this.f8652m;
            this.f8648d = d8;
            this.f8649e = 1;
            Object d9 = q6.w.d(sVar, this);
            if (d9 == aVar) {
                return aVar;
            }
            d7 = d8;
            obj = d9;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7 = this.f8648d;
            V6.b.P(obj);
        }
        d7.f6152d = obj;
        return Unit.f6114a;
    }
}
