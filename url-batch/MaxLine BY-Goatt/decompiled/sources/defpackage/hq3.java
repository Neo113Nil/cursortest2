package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hq3 implements xq3, xh3 {
    public final /* synthetic */ oq3 m;

    public /* synthetic */ hq3(oq3 oq3Var) {
        this.m = oq3Var;
    }

    @Override // defpackage.xh3
    public /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.m.A(str, i, th, bArr, map);
    }

    @Override // defpackage.xq3
    public void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        oq3 oq3Var = this.m;
        if (!isEmpty) {
            oq3Var.c().F(new ys(this, str, str2, bundle, 11));
            return;
        }
        pj3 pj3Var = oq3Var.x;
        if (pj3Var != null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(str2, "AppId not known when logging event");
        }
    }
}
