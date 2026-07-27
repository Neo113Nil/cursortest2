package k;

import kotlin.jvm.functions.Function1;
import l.h0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728D extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0729E f7242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0728D(C0729E c0729e, int i2) {
        super(1);
        this.f7241d = i2;
        this.f7242e = c0729e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7241d) {
            case 0:
                h0 h0Var = (h0) obj;
                w wVar = w.f7338d;
                w wVar2 = w.f7339e;
                boolean a4 = h0Var.a(wVar, wVar2);
                Object obj2 = null;
                C0729E c0729e = this.f7242e;
                if (a4) {
                    t tVar = c0729e.f7248w.f7253a.f7269b;
                    if (tVar != null) {
                        obj2 = tVar.f7324c;
                    }
                } else if (h0Var.a(wVar2, w.f7340i)) {
                    t tVar2 = c0729e.f7249x.f7256a.f7269b;
                    if (tVar2 != null) {
                        obj2 = tVar2.f7324c;
                    }
                } else {
                    obj2 = AbstractC0725A.f7232d;
                }
                return obj2 == null ? AbstractC0725A.f7232d : obj2;
            default:
                h0 h0Var2 = (h0) obj;
                w wVar3 = w.f7338d;
                w wVar4 = w.f7339e;
                boolean a5 = h0Var2.a(wVar3, wVar4);
                C0729E c0729e2 = this.f7242e;
                if (a5) {
                    c0729e2.f7248w.f7253a.getClass();
                    return AbstractC0725A.f7231c;
                }
                if (!h0Var2.a(wVar4, w.f7340i)) {
                    return AbstractC0725A.f7231c;
                }
                c0729e2.f7249x.f7256a.getClass();
                return AbstractC0725A.f7231c;
        }
    }
}
