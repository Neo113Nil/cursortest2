package E2;

import A2.j;
import D2.AbstractC0348a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class M extends AbstractC0372c {

    /* renamed from: f, reason: collision with root package name */
    private final D2.w f531f;

    /* renamed from: g, reason: collision with root package name */
    private final String f532g;

    /* renamed from: h, reason: collision with root package name */
    private final A2.f f533h;

    /* renamed from: i, reason: collision with root package name */
    private int f534i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f535j;

    public /* synthetic */ M(AbstractC0348a abstractC0348a, D2.w wVar, String str, A2.f fVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0348a, wVar, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(A2.f fVar, int i4) {
        boolean z4 = (d().d().f() || fVar.j(i4) || !fVar.i(i4).c()) ? false : true;
        this.f535j = z4;
        return z4;
    }

    private final boolean v0(A2.f fVar, int i4, String str) {
        AbstractC0348a d4 = d();
        A2.f i5 = fVar.i(i4);
        if (!i5.c() && (e0(str) instanceof D2.u)) {
            return true;
        }
        if (!Intrinsics.areEqual(i5.e(), j.b.f98a) || (i5.c() && (e0(str) instanceof D2.u))) {
            return false;
        }
        D2.i e02 = e0(str);
        D2.z zVar = e02 instanceof D2.z ? (D2.z) e02 : null;
        String f4 = zVar != null ? D2.k.f(zVar) : null;
        return f4 != null && G.g(i5, d4, f4) == -3;
    }

    @Override // C2.AbstractC0320l0
    protected String a0(A2.f descriptor, int i4) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        G.k(descriptor, d());
        String g4 = descriptor.g(i4);
        if (!this.f591e.k() || s0().keySet().contains(g4)) {
            return g4;
        }
        Map d4 = G.d(d(), descriptor);
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) d4.get((String) obj);
            if (num != null && num.intValue() == i4) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : g4;
    }

    @Override // E2.AbstractC0372c, B2.e
    public B2.c b(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor == this.f533h ? this : super.b(descriptor);
    }

    @Override // E2.AbstractC0372c, B2.c
    public void c(A2.f descriptor) {
        Set j4;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f591e.g() || (descriptor.e() instanceof A2.d)) {
            return;
        }
        G.k(descriptor, d());
        if (this.f591e.k()) {
            Set a4 = C2.W.a(descriptor);
            Map map = (Map) D2.B.a(d()).a(descriptor, G.e());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = kotlin.collections.T.e();
            }
            j4 = kotlin.collections.T.j(a4, keySet);
        } else {
            j4 = C2.W.a(descriptor);
        }
        for (String str : s0().keySet()) {
            if (!j4.contains(str) && !Intrinsics.areEqual(str, this.f532g)) {
                throw F.f(str, s0().toString());
            }
        }
    }

    @Override // E2.AbstractC0372c
    protected D2.i e0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (D2.i) MapsKt.getValue(s0(), tag);
    }

    @Override // E2.AbstractC0372c, C2.N0, B2.e
    public boolean r() {
        return !this.f535j && super.r();
    }

    @Override // B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f534i < descriptor.f()) {
            int i4 = this.f534i;
            this.f534i = i4 + 1;
            String V3 = V(descriptor, i4);
            int i5 = this.f534i - 1;
            this.f535j = false;
            if (s0().containsKey(V3) || u0(descriptor, i5)) {
                if (!this.f591e.d() || !v0(descriptor, i5, V3)) {
                    return i5;
                }
            }
        }
        return -1;
    }

    @Override // E2.AbstractC0372c
    /* renamed from: w0 */
    public D2.w s0() {
        return this.f531f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC0348a json, D2.w value, String str, A2.f fVar) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f531f = value;
        this.f532g = str;
        this.f533h = fVar;
    }
}
