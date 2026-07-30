package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ fb0 e;

    public /* synthetic */ eb0(fb0 fb0Var, int i) {
        this.d = i;
        this.e = fb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        fb0 fb0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                xn xnVar = (xn) obj;
                xnVar.getClass();
                Log.w(a21.a(fb0.class).a(), "CorruptionException in " + fb0Var.a + " DataStore running in process " + Process.myPid(), xnVar);
                return new qn0(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = fb0Var.a;
                LinkedHashSet linkedHashSet = ia1.a;
                linkedHashSet.getClass();
                return yh.b(new ga1(context, str, ja1.a, new k8(linkedHashSet, (dn) null, 4), new ha1(3, null)));
        }
    }
}
