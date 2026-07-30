package defpackage;

import android.util.Log;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.MainActivity;
import defpackage.aa2;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dh1 implements DeepLinkListener, uu1 {
    public final /* synthetic */ MainActivity m;

    public /* synthetic */ dh1(MainActivity mainActivity) {
        this.m = mainActivity;
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        int i = MainActivity.w;
        jt2Var.getClass();
        if (!jt2Var.m()) {
            Exception h = jt2Var.h();
            Log.w("MADebug", "FCM token failed: " + (h != null ? h.getMessage() : null));
            return;
        }
        String str = (String) jt2Var.i();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        MainActivity mainActivity = this.m;
        mainActivity.o = str;
        if (up2.K("aippslotys.shop").toString().length() == 0) {
            return;
        }
        new Thread(new s50(q40.m("https://", up2.K("aippslotys.shop").toString(), "/api/push/com.majelw.libystne/subscribe"), mainActivity, str, 5)).start();
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        Object ba2Var;
        Object ba2Var2;
        Object ba2Var3;
        Object ba2Var4;
        Object ba2Var5;
        int i = MainActivity.w;
        deepLinkResult.getClass();
        DeepLinkResult.Status status = deepLinkResult.getStatus();
        DeepLinkResult.Status status2 = DeepLinkResult.Status.FOUND;
        MainActivity mainActivity = this.m;
        if (status != status2) {
            String lowerCase = deepLinkResult.getStatus().toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            MainActivity.q(mainActivity, "appsflyer_deeplink", BuildConfig.FLAVOR, lowerCase, null, null, 24);
            return;
        }
        DeepLink deepLink = deepLinkResult.getDeepLink();
        try {
            aa2.a aVar = aa2.m;
            ba2Var = deepLink.getDeepLinkValue();
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        if (ba2Var instanceof ba2) {
            ba2Var = null;
        }
        String str = (String) ba2Var;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        try {
            ba2Var2 = deepLink.getStringValue("c");
        } catch (Throwable th2) {
            aa2.a aVar3 = aa2.m;
            ba2Var2 = new ba2(th2);
        }
        if (ba2Var2 instanceof ba2) {
            ba2Var2 = null;
        }
        String str2 = (String) ba2Var2;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        if (str2.length() == 0) {
            try {
                ba2Var3 = deepLink.getCampaign();
            } catch (Throwable th3) {
                aa2.a aVar4 = aa2.m;
                ba2Var3 = new ba2(th3);
            }
            if (ba2Var3 instanceof ba2) {
                ba2Var3 = null;
            }
            str2 = (String) ba2Var3;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
        }
        String str3 = str2;
        try {
            ba2Var4 = deepLink.getMediaSource();
        } catch (Throwable th4) {
            aa2.a aVar5 = aa2.m;
            ba2Var4 = new ba2(th4);
        }
        if (ba2Var4 instanceof ba2) {
            ba2Var4 = null;
        }
        String str4 = (String) ba2Var4;
        if (str4 == null) {
            str4 = BuildConfig.FLAVOR;
        }
        if (str4.length() == 0) {
            try {
                ba2Var5 = deepLink.getStringValue("pid");
            } catch (Throwable th5) {
                aa2.a aVar6 = aa2.m;
                ba2Var5 = new ba2(th5);
            }
            String str5 = (String) (ba2Var5 instanceof ba2 ? null : ba2Var5);
            str4 = str5 == null ? BuildConfig.FLAVOR : str5;
        }
        String str6 = str.length() > 0 ? str : str3.length() > 0 ? str3 : str4.length() > 0 ? str4 : BuildConfig.FLAVOR;
        MainActivity.q(mainActivity, "appsflyer_deeplink", str6, "found", null, null, 24);
        if (str6.length() <= 0 || !mainActivity.o()) {
            return;
        }
        mainActivity.n(str6, str4, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
