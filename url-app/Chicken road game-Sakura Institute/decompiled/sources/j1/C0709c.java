package j1;

import E2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709c extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7146k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f7148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0709c(Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f7148m = (j) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0709c) j((C2.a) obj2, (C0708b) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0709c c0709c = new C0709c(this.f7148m, aVar);
        c0709c.f7147l = obj;
        return c0709c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7146k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0708b c0708b = (C0708b) this.f7147l;
            this.f7146k = 1;
            obj = this.f7148m.h(c0708b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        C0708b c0708b2 = (C0708b) obj;
        Intrinsics.d(c0708b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        c0708b2.f7145b.f6827a.set(true);
        return c0708b2;
    }
}
