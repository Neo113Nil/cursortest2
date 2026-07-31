package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zf2 implements ij2<yf2> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15105a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f15106b;

    zf2(Context context, dc3 dc3Var) {
        this.f15105a = context;
        this.f15106b = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<yf2> a() {
        return this.f15106b.E(new Callable() { // from class: com.google.android.gms.internal.ads.wf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zf2.this.b();
            }
        });
    }

    final /* synthetic */ yf2 b() {
        Bundle bundle;
        y2.t.q();
        String string = !((Boolean) sw.c().b(m10.f8337x4)).booleanValue() ? "" : this.f15105a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) sw.c().b(m10.f8351z4)).booleanValue() ? this.f15105a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        y2.t.q();
        Context context = this.f15105a;
        if (((Boolean) sw.c().b(m10.f8344y4)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i7 = 0; i7 < 4; i7++) {
                String str = strArr[i7];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new yf2(string, string2, bundle, null);
    }
}
