package N;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import l2.p;

/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f979e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f980g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f980g = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        c cVar = new c(this.f980g, interfaceC0300c);
        cVar.f = obj;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f979e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            b bVar = (b) this.f;
            this.f979e = 1;
            obj = this.f980g.invoke(bVar, this);
            if (obj == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        b bVar2 = (b) obj;
        j.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f978b.f2532b).set(true);
        return bVar2;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) b((InterfaceC0300c) obj2, (b) obj)).g(C0195i.f2555a);
    }
}
