package B1;

import j1.C0708b;
import j1.C0710d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class D extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f947k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f950n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i2, String str, String str2, C2.a aVar) {
        super(2, aVar);
        this.f948l = i2;
        this.f949m = str;
        this.f950n = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((D) j((C2.a) obj2, (C0708b) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        D d4 = new D(this.f948l, this.f949m, this.f950n, aVar);
        d4.f947k = obj;
        return d4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0708b c0708b = (C0708b) this.f947k;
        I i2 = this.f948l;
        C0710d key = i2.f964b;
        String str = this.f949m;
        c0708b.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        c0708b.c(key, str);
        String str2 = this.f950n;
        if (str2 != null && str2.length() != 0) {
            C0710d key2 = i2.f965c;
            Intrinsics.checkNotNullParameter(key2, "key");
            c0708b.c(key2, str2);
        }
        return Unit.f7487a;
    }
}
