package y4;

import P.InterfaceC0144i;
import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* renamed from: y4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042k extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f8595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f8596e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f8597i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042k(K k7, List list, V5.b bVar) {
        super(2, bVar);
        this.f8596e = k7;
        this.f8597i = list;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new C1042k(this.f8596e, this.f8597i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1042k) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f8595d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        Context context = this.f8596e.f8566d;
        if (context == null) {
            Intrinsics.h("context");
            throw null;
        }
        InterfaceC0144i a7 = L.a(context);
        C1041j c1041j = new C1041j(this.f8597i, null);
        this.f8595d = 1;
        Object m2 = d4.c.m(a7, c1041j, this);
        return m2 == aVar ? aVar : m2;
    }
}
