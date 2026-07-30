package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ax implements ka {
    public final Context a;

    public ax(Context context) {
        context.getClass();
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.ka
    public final String a() {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this.a);
        return appsFlyerUID == null ? "" : appsFlyerUID;
    }

    @Override // defpackage.ka
    public final Object b(gd1 gd1Var) {
        return hx.a.a(gd1Var);
    }
}
