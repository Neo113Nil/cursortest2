package B1;

import A1.U;
import W2.C0286h;
import W2.InterfaceC0302y;
import android.app.Application;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class x extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1030k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1031l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1294c f1032m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1294c c1294c, C2.a aVar) {
        super(2, aVar);
        this.f1032m = c1294c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((x) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        x xVar = new x(this.f1032m, aVar);
        xVar.f1031l = obj;
        return xVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1030k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f1031l;
            this.f1031l = interfaceC0302y;
            C1294c c1294c = this.f1032m;
            this.f1030k = 1;
            C0286h c0286h = new C0286h(1, D2.f.b(this));
            c0286h.s();
            InstallReferrerClient build = InstallReferrerClient.newBuilder((Application) c1294c.f11388d).build();
            c0286h.v(new U(interfaceC0302y, build));
            build.startConnection(new y.t(c0286h, 1, build));
            obj = c0286h.r();
            if (obj == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
