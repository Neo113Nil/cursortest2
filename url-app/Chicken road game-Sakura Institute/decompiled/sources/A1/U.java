package A1;

import W2.InterfaceC0302y;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import z1.C1377c;

/* loaded from: classes.dex */
public final class U implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f544e;

    public U(InterfaceC0302y interfaceC0302y, InstallReferrerClient installReferrerClient) {
        this.f544e = installReferrerClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f544e;
        switch (this.f543d) {
            case 0:
                Map.Entry it = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.a(it.getValue(), ((C1377c) obj2).f11851a));
            default:
                InstallReferrerClient installReferrerClient = (InstallReferrerClient) obj2;
                try {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    installReferrerClient.endConnection();
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    AbstractC1343r.a(th);
                }
                return Unit.f7487a;
        }
    }

    public U(C1377c c1377c) {
        this.f544e = c1377c;
    }
}
