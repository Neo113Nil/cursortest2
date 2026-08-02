package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Looper;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
class gnw implements gbj {
    final /* synthetic */ gnx a;

    public gnw(gnx gnxVar) {
        this.a = gnxVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((hkf) ((hkf) ((hkf) gnx.a.f()).h(th)).i("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter$2", "onFailure", '8', "HelpAndFeedbackStarter.java")).s("Unable to start HelpAndFeedback");
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        d((Intent) obj2);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [hac, java.lang.Object] */
    public final void d(Intent intent) {
        try {
            gnx gnxVar = this.a;
            fwm fwmVar = new fwm(gnxVar.b);
            if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
            }
            Object obj = fwmVar.a;
            int b = cmd.b((Context) obj, 11925000);
            if (b == 0) {
                ((cuu) fwmVar.b.bB()).a(intent);
                return;
            }
            Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
            short[] sArr = null;
            if (b == 7) {
                b = 7;
            } else if (!((Activity) obj).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
                new gbg(Looper.getMainLooper(), (byte[]) null).post(new avl((Object) fwmVar, (Object) data, 13, sArr));
                return;
            }
            if (true == cmd.e((Context) obj, b)) {
                b = 18;
            }
            cll.a.h((Activity) obj, b, 0, null);
        } catch (BadParcelableException e) {
            ((hkf) ((hkf) ((hkf) gnx.a.f()).h(e)).i("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter$2", "onSuccess", '2', "HelpAndFeedbackStarter.java")).s("Unable to start HelpAndFeedback");
        }
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
