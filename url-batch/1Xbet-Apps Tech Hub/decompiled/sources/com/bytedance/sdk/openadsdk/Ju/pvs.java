package com.bytedance.sdk.openadsdk.Ju;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.IP.Jd;
import com.bytedance.sdk.openadsdk.IP.vG;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.settings.IP;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: StrategyCenterUtils.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile vG pvs;

    public static vG pvs(final Context context, final String str) {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    vG vGVar = new vG(new Jd() { // from class: com.bytedance.sdk.openadsdk.Ju.pvs.1
                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public String vG() {
                            return "pag_adn_strategy_center";
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public ExecutorService pvs() {
                            return ae.Jd();
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public Context icD() {
                            Context context2 = context;
                            return context2 != null ? context2 : mnm.pvs();
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public Handler Jd() {
                            return Ju.icD();
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public String NB() {
                            return jlb.Jd("/api/ad/union/sdk/strategies/adn");
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public JSONObject sUS() {
                            try {
                                JSONObject pvs2 = IP.pvs(ny.pvs(mnm.pvs(), 0L));
                                if (!pvs2.has("app_id")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        pvs2.put("app_id", str);
                                    } else {
                                        if (TextUtils.isEmpty(so.icD().Jd())) {
                                            return null;
                                        }
                                        pvs2.put("app_id", so.icD().Jd());
                                    }
                                }
                                return com.bytedance.sdk.component.utils.pvs.pvs(pvs2);
                            } catch (Throwable th) {
                                com.bytedance.sdk.component.utils.Ju.pvs("StrategyUtils", th.getMessage());
                                return null;
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public Map<String, String> yiw() {
                            HashMap hashMap = new HashMap();
                            hashMap.put(HttpHeaders.USER_AGENT, jlb.vG());
                            return hashMap;
                        }

                        @Override // com.bytedance.sdk.openadsdk.IP.Jd
                        public JSONObject pvs(JSONObject jSONObject) {
                            int optInt = jSONObject.optInt("cypher", -1);
                            if (optInt == -1 || optInt != 3) {
                                return jSONObject;
                            }
                            String vG = com.bytedance.sdk.component.utils.pvs.vG(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                            if (TextUtils.isEmpty(vG)) {
                                return jSONObject;
                            }
                            try {
                                return new JSONObject(vG);
                            } catch (Throwable unused) {
                                return jSONObject;
                            }
                        }
                    });
                    pvs = vGVar;
                    vGVar.pvs(new com.bytedance.sdk.openadsdk.IP.pvs() { // from class: com.bytedance.sdk.openadsdk.Ju.pvs.2
                    });
                }
            }
        }
        return pvs;
    }

    private static vG icD() {
        return pvs(mnm.pvs(), so.icD().Jd());
    }

    public static void pvs() {
        icD().pvs();
    }
}
