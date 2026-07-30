package y4;

import P.InterfaceC0144i;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class F extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8548e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K f8549i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f8550l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, K k7, double d7, V5.b bVar) {
        super(2, bVar);
        this.f8548e = str;
        this.f8549i = k7;
        this.f8550l = d7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new F(this.f8548e, this.f8549i, this.f8550l, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8547d;
        if (i2 == 0) {
            V6.b.P(obj);
            String name = this.f8548e;
            Intrinsics.checkNotNullParameter(name, "name");
            T.d dVar = new T.d(name);
            Context context = this.f8549i.f8566d;
            if (context == null) {
                Intrinsics.h("context");
                throw null;
            }
            InterfaceC0144i a7 = L.a(context);
            E e7 = new E(dVar, this.f8550l, null);
            this.f8547d = 1;
            if (d4.c.m(a7, e7, this) == aVar) {
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
