package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bq implements ak {
    public final /* synthetic */ int d;
    public final /* synthetic */ v01 e;

    public /* synthetic */ bq(v01 v01Var, int i) {
        this.d = i;
        this.e = v01Var;
    }

    @Override // defpackage.ak
    public final Object f(mc mcVar) {
        FirebaseMessaging lambda$getComponents$0;
        int i = this.d;
        v01 v01Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new dq((Context) mcVar.a(Context.class), ((ez) mcVar.a(ez.class)).c(), mcVar.c(v01.a(a60.class)), mcVar.d(sq.class), (Executor) mcVar.f(v01Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(v01Var, mcVar);
                return lambda$getComponents$0;
        }
    }
}
