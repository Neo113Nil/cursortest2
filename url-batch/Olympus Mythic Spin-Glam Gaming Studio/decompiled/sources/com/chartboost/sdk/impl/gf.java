package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class gf {
    public final HashMap a = new HashMap();
    public final SharedPreferences b;
    public final p7 c;

    public gf(SharedPreferences sharedPreferences, p7 p7Var) {
        this.b = sharedPreferences;
        this.c = p7Var;
        b();
    }

    public HashMap a() {
        return this.a;
    }

    public final void c() {
        if (this.b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(a((DataUseConsent) it.next()));
            }
            a(this.b, jSONArray);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[Catch: JSONException -> 0x0055, TryCatch #0 {JSONException -> 0x0055, blocks: (B:6:0x0016, B:8:0x0023, B:23:0x0080, B:25:0x00ed, B:28:0x00f7, B:30:0x008e, B:31:0x0098, B:32:0x00a2, B:34:0x00ae, B:35:0x00b4, B:37:0x00c0, B:39:0x00c6, B:41:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x004b, B:48:0x0058, B:51:0x0062, B:54:0x006c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7 A[Catch: JSONException -> 0x0055, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0055, blocks: (B:6:0x0016, B:8:0x0023, B:23:0x0080, B:25:0x00ed, B:28:0x00f7, B:30:0x008e, B:31:0x0098, B:32:0x00a2, B:34:0x00ae, B:35:0x00b4, B:37:0x00c0, B:39:0x00c6, B:41:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x004b, B:48:0x0058, B:51:0x0062, B:54:0x006c), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: JSONException -> 0x0055, TryCatch #0 {JSONException -> 0x0055, blocks: (B:6:0x0016, B:8:0x0023, B:23:0x0080, B:25:0x00ed, B:28:0x00f7, B:30:0x008e, B:31:0x0098, B:32:0x00a2, B:34:0x00ae, B:35:0x00b4, B:37:0x00c0, B:39:0x00c6, B:41:0x00d2, B:42:0x00d8, B:44:0x00e4, B:45:0x004b, B:48:0x0058, B:51:0x0062, B:54:0x006c), top: B:5:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        char c;
        DataUseConsent gdpr;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("privacy_standards", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString("consent");
                    int hashCode = string2.hashCode();
                    if (hashCode == -1172350233) {
                        if (string2.equals("us_privacy")) {
                            c = 1;
                            if (c != 0) {
                            }
                            if (gdpr == null) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (gdpr == null) {
                        }
                    } else if (hashCode == 3168159) {
                        if (string2.equals("gdpr")) {
                            c = 0;
                            if (c != 0) {
                            }
                            if (gdpr == null) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (gdpr == null) {
                        }
                    } else if (hashCode != 3319983) {
                        if (hashCode == 94846581 && string2.equals("coppa")) {
                            c = 2;
                            if (c != 0) {
                                GDPR.GDPR_CONSENT gdpr_consent = GDPR.GDPR_CONSENT.BEHAVIORAL;
                                if (gdpr_consent.getValue().equals(string3)) {
                                    gdpr = new GDPR(gdpr_consent);
                                } else {
                                    GDPR.GDPR_CONSENT gdpr_consent2 = GDPR.GDPR_CONSENT.NON_BEHAVIORAL;
                                    if (gdpr_consent2.getValue().equals(string3)) {
                                        gdpr = new GDPR(gdpr_consent2);
                                    }
                                    gdpr = null;
                                }
                            } else if (c == 1) {
                                CCPA.CCPA_CONSENT ccpa_consent = CCPA.CCPA_CONSENT.OPT_IN_SALE;
                                if (ccpa_consent.getValue().equals(string3)) {
                                    gdpr = new CCPA(ccpa_consent);
                                } else {
                                    CCPA.CCPA_CONSENT ccpa_consent2 = CCPA.CCPA_CONSENT.OPT_OUT_SALE;
                                    if (ccpa_consent2.getValue().equals(string3)) {
                                        gdpr = new CCPA(ccpa_consent2);
                                    }
                                    gdpr = null;
                                }
                            } else if (c == 2) {
                                gdpr = new COPPA(jSONObject.getBoolean("consent"));
                            } else if (c != 3) {
                                gdpr = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString("consent"));
                            } else {
                                gdpr = new LGPD(jSONObject.getBoolean("consent"));
                            }
                            if (gdpr == null) {
                                this.a.put(gdpr.getPrivacyStandard(), gdpr);
                            } else {
                                b(string2);
                                xb.a("Failed to load consent: " + string2, null);
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (gdpr == null) {
                        }
                    } else {
                        if (string2.equals(LGPD.LGPD_STANDARD)) {
                            c = 3;
                            if (c != 0) {
                            }
                            if (gdpr == null) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (gdpr == null) {
                        }
                    }
                }
            } catch (JSONException e) {
                a(e);
                e.printStackTrace();
            }
        }
    }

    public void a(String str) {
        this.a.remove(str);
        c();
    }

    public void b(DataUseConsent dataUseConsent) {
        xb.a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        c();
    }

    public final void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    public final void b(String str) {
        this.c.mo3222track(s5.a(si.d.f, str, "", ""));
    }

    public final void a(JSONException jSONException) {
        this.c.mo3222track(s5.a(si.d.d, jSONException.getMessage(), "", ""));
    }

    public final JSONObject a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put("consent", dataUseConsent.getConsent());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
