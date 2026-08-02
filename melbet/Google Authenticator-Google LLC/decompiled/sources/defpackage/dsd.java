package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dsd implements dry {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dsd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.dry, defpackage.dou
    public final void a(View view, Object obj) {
        int i = this.b;
        if (i == 0) {
            if (obj == null) {
                return;
            }
            dov dovVar = ((dsa) this.a).a;
            if (dovVar.i(obj)) {
                String d = dovVar.d(obj);
                jkj k = iiw.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                iiw iiwVar = (iiw) k.b;
                iiwVar.b |= 1;
                iiwVar.c = 1;
                dqx.a(view, d, (iiw) k.q());
                return;
            }
            return;
        }
        if (i == 1) {
            drv drvVar = new drv(0);
            dsa dsaVar = (dsa) this.a;
            drvVar.a(new dsh(dsaVar.b, dsaVar.a, dsaVar.c)).onClick(view);
            return;
        }
        if (i == 2) {
            ((Activity) this.a).startActivity(new Intent("android.settings.SYNC_SETTINGS"));
        } else {
            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            intent.putExtra("account_types", new String[]{"com.google"});
            ((Activity) this.a).startActivity(intent);
        }
    }
}
