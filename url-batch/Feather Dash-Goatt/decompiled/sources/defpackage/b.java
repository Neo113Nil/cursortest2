package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ eh e;

    public /* synthetic */ b(eh ehVar, int i) {
        this.d = i;
        this.e = ehVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yq yqVar;
        int i = this.d;
        eh ehVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s70 s70Var = (s70) mo.k(ehVar, r70.a);
                if (s70Var == null) {
                    r80.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + s70Var);
                }
                s70 s70Var2 = ehVar.z;
                ehVar.z = s70Var;
                if (s70Var2 != null && !Intrinsics.a(s70Var, s70Var2) && ((yqVar = ehVar.A) != null || !ehVar.H)) {
                    if (yqVar != null) {
                        ehVar.A0(yqVar);
                    }
                    ehVar.A = null;
                    ehVar.G0();
                }
                return Unit.a;
            default:
                ehVar.x.invoke();
                return Boolean.TRUE;
        }
    }
}
