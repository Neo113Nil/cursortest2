package com.applovin.impl.sdk.a;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.applovin.adview.AppLovinConfirmationActivity;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f2918a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2919b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f2920c;

    public b(j jVar, Context context, String str) {
        this.f2918a = jVar;
        this.f2919b = str;
        this.f2920c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Throwable th) {
        this.f2918a.u().c("IncentivizedConfirmationManager", "Unable to show incentivized ad reward dialog. Have you defined com.applovin.adview.AppLovinConfirmationActivity in your manifest?", th);
        Toast.makeText(this.f2920c, str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        j jVar;
        com.applovin.impl.sdk.b.b<String> bVar;
        if (this.f2919b.equals("accepted")) {
            jVar = this.f2918a;
            bVar = com.applovin.impl.sdk.b.b.bC;
        } else if (this.f2919b.equals("quota_exceeded")) {
            jVar = this.f2918a;
            bVar = com.applovin.impl.sdk.b.b.bD;
        } else if (this.f2919b.equals("rejected")) {
            jVar = this.f2918a;
            bVar = com.applovin.impl.sdk.b.b.bE;
        } else {
            jVar = this.f2918a;
            bVar = com.applovin.impl.sdk.b.b.bF;
        }
        return (String) jVar.a(bVar);
    }

    void a() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                String str = (String) b.this.f2918a.a(com.applovin.impl.sdk.b.b.bB);
                String b2 = b.this.b();
                String str2 = (String) b.this.f2918a.a(com.applovin.impl.sdk.b.b.bG);
                if (!com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinConfirmationActivity.class, b.this.f2920c)) {
                    b.this.a(b2, null);
                    return;
                }
                try {
                    Intent intent = new Intent(b.this.f2920c, (Class<?>) AppLovinConfirmationActivity.class);
                    intent.putExtra("dialog_title", str);
                    intent.putExtra("dialog_body", b2);
                    intent.putExtra("dialog_button_text", str2);
                    b.this.f2920c.startActivity(intent);
                } catch (Throwable th) {
                    b.this.a(b2, th);
                }
            }
        });
    }
}
