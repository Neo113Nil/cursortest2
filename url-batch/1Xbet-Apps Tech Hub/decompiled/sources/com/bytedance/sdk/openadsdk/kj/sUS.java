package com.bytedance.sdk.openadsdk.kj;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlayableJsBridge.java */
/* loaded from: classes2.dex */
public class sUS {
    private WeakReference<so> icD;
    private Context pvs;
    private Map<String, pvs> vG = new HashMap();
    private SensorEventListener Jd = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            so Jd;
            if (sensorEvent.sensor.getType() != 1 || (Jd = sUS.this.Jd()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                Jd.pvs("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener NB = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            so Jd;
            if (sensorEvent.sensor.getType() != 4 || (Jd = sUS.this.Jd()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                Jd.pvs("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener sUS = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            so Jd;
            if (sensorEvent.sensor.getType() != 10 || (Jd = sUS.this.Jd()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                Jd.pvs("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener yiw = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                System.arraycopy(sensorEvent.values, 0, Wyp.icD, 0, Wyp.icD.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                System.arraycopy(sensorEvent.values, 0, Wyp.vG, 0, Wyp.vG.length);
            }
            SensorManager.getRotationMatrix(Wyp.Jd, null, Wyp.icD, Wyp.vG);
            SensorManager.getOrientation(Wyp.Jd, Wyp.NB);
            so Jd = sUS.this.Jd();
            if (Jd == null) {
                return;
            }
            float f = Wyp.NB[0];
            float f2 = Wyp.NB[1];
            float f3 = Wyp.NB[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                Jd.pvs("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* compiled from: PlayableJsBridge.java */
    interface pvs {
        JSONObject pvs(JSONObject jSONObject) throws Throwable;
    }

    public sUS(so soVar) {
        this.pvs = soVar.pvs();
        this.icD = new WeakReference<>(soVar);
        vG();
    }

    public Set<String> pvs() {
        return this.vG.keySet();
    }

    private void vG() {
        this.vG.put("adInfo", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.45
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                if (Jd != null) {
                    JSONObject zM = Jd.zM();
                    if (zM != null) {
                        zM.put("code", 1);
                        return zM;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.vG.put("appInfo", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.56
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = sUS.this.pvs().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                so Jd = sUS.this.Jd();
                if (Jd != null) {
                    jSONObject2.put("deviceId", Jd.yiw());
                    jSONObject2.put("netType", Jd.mnm());
                    jSONObject2.put("innerAppName", Jd.Jd());
                    jSONObject2.put("appName", Jd.NB());
                    jSONObject2.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, Jd.sUS());
                    Map<String, String> icD = Jd.icD();
                    for (String str : icD.keySet()) {
                        jSONObject2.put(str, icD.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.vG.put("playableSDKInfo", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.61
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.vG.put("subscribe_app_ad", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.62
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("download_app_ad", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.63
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("isViewable", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.2
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                if (Jd == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", Jd.Mxy());
                return jSONObject3;
            }
        });
        this.vG.put("getVolume", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.3
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                if (Jd == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", Jd.so());
                return jSONObject3;
            }
        });
        this.vG.put("getScreenSize", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.4
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                if (Jd == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject cR = Jd.cR();
                cR.put("code", 1);
                return cR;
            }
        });
        this.vG.put("start_accelerometer_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.5
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        yiw.pvs("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                Wyp.pvs(sUS.this.pvs, sUS.this.Jd, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("close_accelerometer_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.6
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, sUS.this.Jd);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("start_gyro_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.7
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        yiw.pvs("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                Wyp.icD(sUS.this.pvs, sUS.this.NB, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("close_gyro_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.8
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, sUS.this.NB);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("start_accelerometer_grativityless_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.9
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        yiw.pvs("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                Wyp.vG(sUS.this.pvs, sUS.this.sUS, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("close_accelerometer_grativityless_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.10
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, sUS.this.sUS);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("start_rotation_vector_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.11
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        yiw.pvs("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                Wyp.Jd(sUS.this.pvs, sUS.this.yiw, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("close_rotation_vector_observer", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.13
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, sUS.this.yiw);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("device_shake", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.14
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("device_shake_short", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.15
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Wyp.pvs(sUS.this.pvs, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    yiw.pvs("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.vG.put("playable_style", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.16
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd != null) {
                    JSONObject vG = Jd.vG();
                    vG.put("code", 1);
                    return vG;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.vG.put("sendReward", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.17
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd != null) {
                    Jd.rCZ();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.vG.put("webview_time_track", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.18
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.vG.put("playable_event", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.19
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.icD(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("reportAd", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.20
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("close", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.21
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("openAdLandPageLinks", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.22
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("get_viewport", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.24
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject uc = Jd.uc();
                uc.put("code", 1);
                return uc;
            }
        });
        this.vG.put("jssdk_load_finish", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.25
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.gA();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_material_render_result", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.26
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.Mxy(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("detect_change_playable_click", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.27
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject Wyp = Jd.Wyp();
                Wyp.put("code", 1);
                return Wyp;
            }
        });
        this.vG.put("check_camera_permission", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.28
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject Ju = Jd.Ju();
                Ju.put("code", 1);
                return Ju;
            }
        });
        this.vG.put("check_external_storage", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.29
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject IP = Jd.IP();
                if (IP.isNull("result")) {
                    IP.put("code", -1);
                } else {
                    IP.put("code", 1);
                }
                return IP;
            }
        });
        this.vG.put("playable_open_camera", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.30
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_pick_photo", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.31
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_download_media_in_photos", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.32
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.pvs(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_preventTouchEvent", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.33
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.icD(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_settings_info", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.35
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject bNS = Jd.bNS();
                bNS.put("code", 1);
                return bNS;
            }
        });
        this.vG.put("playable_load_main_scene", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.36
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.OT();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_enter_section", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.37
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.Jd(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_end", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.38
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.ny();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_finish_play_playable", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.39
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.ZhG();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_transfrom_module_show", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.40
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.dyT();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_transfrom_module_change_color", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.41
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.dX();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_set_scroll_rect", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.42
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_click_area", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.43
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.NB(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_real_play_start", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.44
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_material_first_frame_show", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.46
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.CvL();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_stuck_check_pong", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.47
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.Gp();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_material_adnormal_mask", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.48
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                Jd.sUS(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_long_press_panel", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.49
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_alpha_player_play", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.50
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_transfrom_module_highlight", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.51
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_send_click_event", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.52
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_query_media_permission_declare", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.53
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject yiw = Jd.yiw(jSONObject);
                yiw.put("code", 1);
                return yiw;
            }
        });
        this.vG.put("playable_query_media_permission_enable", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.54
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                so Jd = sUS.this.Jd();
                JSONObject jSONObject2 = new JSONObject();
                if (Jd == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject so = Jd.so(jSONObject);
                so.put("code", 1);
                return so;
            }
        });
        this.vG.put("playable_apply_media_permission", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.55
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_start_kws", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.57
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_close_kws", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.58
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_video_preload_task_add", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.59
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.vG.put("playable_video_preload_task_cancel", new pvs() { // from class: com.bytedance.sdk.openadsdk.kj.sUS.60
            @Override // com.bytedance.sdk.openadsdk.kj.sUS.pvs
            public JSONObject pvs(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.kj.pvs NB = sUS.this.NB();
                JSONObject jSONObject2 = new JSONObject();
                if (NB == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public so Jd() {
        WeakReference<so> weakReference = this.icD;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.kj.pvs NB() {
        so Jd = Jd();
        if (Jd == null) {
            return null;
        }
        return Jd.vA();
    }

    public JSONObject pvs(String str, JSONObject jSONObject) {
        try {
            pvs pvsVar = this.vG.get(str);
            if (pvsVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return pvsVar.pvs(jSONObject);
        } catch (Throwable th) {
            yiw.pvs("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void icD() {
        Wyp.pvs(this.pvs, this.Jd);
        Wyp.pvs(this.pvs, this.NB);
        Wyp.pvs(this.pvs, this.sUS);
        Wyp.pvs(this.pvs, this.yiw);
    }
}
