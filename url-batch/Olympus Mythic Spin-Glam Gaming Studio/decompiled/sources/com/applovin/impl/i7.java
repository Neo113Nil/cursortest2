package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class i7 extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;

    class a extends s2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i) {
            return i == d.SETTINGS.ordinal() ? i7.this.c() : i7.this.a();
        }

        @Override // com.applovin.impl.s2
        protected int d(int i) {
            return i == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i) {
            return i == d.SETTINGS.ordinal() ? new v4("SETTINGS") : new v4("GDPR APPLICABILITY");
        }
    }

    class b implements s2.a {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        b(com.applovin.impl.sdk.k kVar) {
            this.a = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() == d.SETTINGS.ordinal()) {
                if (j2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.a.x().f() != null) {
                        k7.a(this.a.x().f(), com.applovin.impl.sdk.k.o(), this.a);
                        return;
                    } else {
                        n7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", i7.this);
                        return;
                    }
                }
                if (j2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.a.x().h() == null) {
                    return;
                }
                k7.a(this.a.x().h(), com.applovin.impl.sdk.k.o(), this.a);
            }
        }
    }

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private r2 d() {
        r2.b d2 = r2.a().d("Terms of Service URL");
        if (this.a.x().h() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(m0.a(R.color.applovin_sdk_checkmarkColor, this));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.b;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.a.v().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography d2 = this.a.x().d();
        boolean z = n7.c(this.a) && d2 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(r2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(d2, z));
        return arrayList;
    }

    private r2 b() {
        boolean z = this.a.x().f() != null;
        return r2.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }

    private r2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return r2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z).a();
    }

    private r2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return r2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z).a();
    }
}
