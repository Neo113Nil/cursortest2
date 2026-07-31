package w2;

import h2.n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3508b implements InterfaceC3507a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f46634a;

    /* renamed from: b, reason: collision with root package name */
    private final n f46635b;

    /* renamed from: c, reason: collision with root package name */
    private final n f46636c;

    /* renamed from: d, reason: collision with root package name */
    private final n f46637d;

    public C3508b(Object obj, n nVar, n nVar2) {
        n nVar3;
        this.f46634a = obj;
        this.f46635b = nVar;
        this.f46636c = nVar2;
        nVar3 = h.f46661a;
        this.f46637d = nVar3;
    }

    @Override // w2.e
    public n a() {
        return this.f46635b;
    }

    @Override // w2.e
    public Object b() {
        return this.f46634a;
    }

    @Override // w2.e
    public n c() {
        return this.f46636c;
    }

    @Override // w2.e
    public n d() {
        return this.f46637d;
    }

    public /* synthetic */ C3508b(Object obj, n nVar, n nVar2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, nVar, (i4 & 4) != 0 ? null : nVar2);
    }
}
