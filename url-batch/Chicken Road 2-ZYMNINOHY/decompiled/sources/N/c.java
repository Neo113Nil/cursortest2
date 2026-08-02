package N;

import O3.l;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import o3.p;

/* loaded from: classes.dex */
public final class c extends h3.g implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1787a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.g f1789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1789c = (h3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        c cVar = new c(this.f1789c, interfaceC0425c);
        cVar.f1788b = obj;
        return cVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1787a;
        if (i4 == 0) {
            l.w(obj);
            b bVar = (b) this.f1788b;
            this.f1787a = 1;
            obj = this.f1789c.invoke(bVar, this);
            if (obj == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.w(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f1786b.f15398b).set(true);
        return bVar2;
    }
}
