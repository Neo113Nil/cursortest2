package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class xm implements l01 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ xm(q00 q00Var, Context context, Uri uri) {
        this.OPXfSBeufaJ8 = context;
        this.wdg6QnbFHrFF = uri;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = this.rtx2ld2ELZv4;
        Object obj = this.wdg6QnbFHrFF;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                uf1 uf1Var = (uf1) obj2;
                hn hnVar = (hn) obj;
                if (e01Var == e01.ON_CREATE) {
                    onBackInvokedDispatcher = hnVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    uf1Var.lS5Rgt96tfkO(onBackInvokedDispatcher);
                    break;
                }
                break;
            default:
                Context context = (Context) obj2;
                Uri uri = (Uri) obj;
                if (e01Var == e01.ON_RESUME) {
                    try {
                        jv jvVar = new jv(0);
                        Intent intent = (Intent) jvVar.lS5Rgt96tfkO;
                        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                        op0 lS5Rgt96tfkO = jvVar.lS5Rgt96tfkO();
                        Intent intent2 = (Intent) lS5Rgt96tfkO.OPXfSBeufaJ8;
                        intent2.setData(uri);
                        context.startActivity(intent2, (Bundle) lS5Rgt96tfkO.wdg6QnbFHrFF);
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ xm(uf1 uf1Var, hn hnVar) {
        this.OPXfSBeufaJ8 = uf1Var;
        this.wdg6QnbFHrFF = hnVar;
    }
}
