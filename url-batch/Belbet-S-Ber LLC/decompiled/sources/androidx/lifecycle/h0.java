package androidx.lifecycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h0 extends i3.e implements h3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, Object obj) {
        super(0);
        this.f713f = i;
        this.f714g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h3.a, i3.e] */
    @Override // h3.a
    public final Object a() {
        switch (this.f713f) {
            case 0:
                p0 p0Var = (p0) this.f714g;
                ArrayList arrayList = new ArrayList();
                i3.g.f2075a.getClass();
                arrayList.add(new b1.d());
                b1.d[] dVarArr = (b1.d[]) arrayList.toArray(new b1.d[0]);
                return (j0) new androidx.emoji2.text.t(p0Var.e(), new a0.a((b1.d[]) Arrays.copyOf(dVarArr, dVarArr.length)), p0Var instanceof h ? ((h) p0Var).c() : b1.a.f824b).b("androidx.lifecycle.internal.SavedStateHandlesVM", j0.class);
            case 1:
                return (List) this.f714g;
            default:
                try {
                    return (List) ((i3.e) this.f714g).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return x2.q.f3887f;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(h3.a aVar) {
        super(0);
        this.f713f = 2;
        this.f714g = (i3.e) aVar;
    }
}
