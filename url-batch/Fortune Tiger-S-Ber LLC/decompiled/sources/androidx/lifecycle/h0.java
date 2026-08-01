package androidx.lifecycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h0 extends u2.d implements t2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f583f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h0(int i4, Object obj) {
        this.f583f = i4;
        this.g = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t2.a, u2.d] */
    @Override // t2.a
    public final Object a() {
        switch (this.f583f) {
            case 0:
                p0 p0Var = (p0) this.g;
                ArrayList arrayList = new ArrayList();
                u2.f.f3430a.getClass();
                Class a4 = new u2.b(j0.class).a();
                u2.c.c(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new x0.c(a4));
                x0.c[] cVarArr = (x0.c[]) arrayList.toArray(new x0.c[0]);
                return (j0) new androidx.emoji2.text.s(p0Var.e(), new r0.a((x0.c[]) Arrays.copyOf(cVarArr, cVarArr.length)), p0Var instanceof h ? ((h) p0Var).c() : x0.a.f3605b).e("androidx.lifecycle.internal.SavedStateHandlesVM", j0.class);
            case 1:
                return (List) this.g;
            default:
                try {
                    return (List) ((u2.d) this.g).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return n2.o.f2953f;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(t2.a aVar) {
        this.f583f = 2;
        this.g = (u2.d) aVar;
    }
}
