package w2;

import h2.n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d implements InterfaceC3509c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f46638a;

    /* renamed from: b, reason: collision with root package name */
    private final n f46639b;

    /* renamed from: c, reason: collision with root package name */
    private final n f46640c;

    /* renamed from: d, reason: collision with root package name */
    private final n f46641d;

    public d(Object obj, n nVar, n nVar2, n nVar3) {
        this.f46638a = obj;
        this.f46639b = nVar;
        this.f46640c = nVar2;
        this.f46641d = nVar3;
    }

    @Override // w2.e
    public n a() {
        return this.f46639b;
    }

    @Override // w2.e
    public Object b() {
        return this.f46638a;
    }

    @Override // w2.e
    public n c() {
        return this.f46641d;
    }

    @Override // w2.e
    public n d() {
        return this.f46640c;
    }

    public /* synthetic */ d(Object obj, n nVar, n nVar2, n nVar3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, nVar, nVar2, (i4 & 8) != 0 ? null : nVar3);
    }
}
