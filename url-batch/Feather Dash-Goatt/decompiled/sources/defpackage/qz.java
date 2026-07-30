package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qz implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ qz(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                Context context = ((rz) this.e).a;
                context.getClass();
                str.getClass();
                context.getApplicationContext().getSharedPreferences("feather_firebase_push_token", 0).edit().putString("push_token", str).apply();
                tf tfVar = (tf) this.g;
                if (tfVar.v() instanceof yp0) {
                    i31 i31Var = k31.d;
                    tfVar.l(str);
                }
                return Unit.a;
            case 1:
                mb1 mb1Var = (mb1) obj;
                synchronized (pb1.c) {
                    j = pb1.e;
                    pb1.e = 1 + j;
                }
                return new zn0(j, mb1Var, (Function1) this.e, (Function1) this.g);
            default:
                nz nzVar = (nz) this.e;
                Object obj2 = nzVar.b;
                tf tfVar2 = (tf) this.g;
                synchronized (obj2) {
                    ((ArrayList) nzVar.c).remove(tfVar2);
                }
                return Unit.a;
        }
    }
}
