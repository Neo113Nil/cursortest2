package com.bytedance.sdk.openadsdk.doe;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class hhw {
    private WeakReference<zg> fs;
    private Context zmn;
    private Map<String, zmn> zn = new HashMap();
    private SensorEventListener fb = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            zg fb;
            if (sensorEvent.sensor.getType() != 1 || (fb = hhw.this.fb()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, f);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, f2);
                jSONObject.put("z", f3);
                fb.zmn("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener btk = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            zg fb;
            if (sensorEvent.sensor.getType() != 4 || (fb = hhw.this.fb()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, degrees);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, degrees2);
                jSONObject.put("z", degrees3);
                fb.zmn("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener hhw = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            zg fb;
            if (sensorEvent.sensor.getType() != 10 || (fb = hhw.this.fb()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, f);
                jSONObject.put(VastAttributes.VERTICAL_POSITION, f2);
                jSONObject.put("z", f3);
                fb.zmn("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener nps = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = iv.fs;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = iv.zn;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = iv.fb;
            SensorManager.getRotationMatrix(fArr5, null, iv.fs, iv.zn);
            float[] fArr6 = iv.btk;
            SensorManager.getOrientation(fArr5, fArr6);
            zg fb = hhw.this.fb();
            if (fb == null) {
                return;
            }
            float f = fArr6[0];
            float f2 = fArr6[1];
            float f3 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                fb.zmn("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    interface zmn {
        JSONObject zmn(JSONObject jSONObject) throws Throwable;
    }

    public hhw(zg zgVar) {
        this.zmn = zgVar.zmn();
        this.fs = new WeakReference<>(zgVar);
        zn();
    }

    public Set<String> zmn() {
        return this.zn.keySet();
    }

    private void zn() {
        this.zn.put("adInfo", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.45
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                if (fb != null) {
                    JSONObject kw = fb.kw();
                    if (kw != null) {
                        kw.put("code", 1);
                        return kw;
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
        this.zn.put("appInfo", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.56
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = hhw.this.zmn().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                zg fb = hhw.this.fb();
                if (fb != null) {
                    jSONObject2.put("deviceId", fb.nps());
                    jSONObject2.put("netType", fb.cyb());
                    jSONObject2.put("innerAppName", fb.fb());
                    jSONObject2.put("appName", fb.btk());
                    jSONObject2.put(X3.j.W, fb.hhw());
                    Map<String, String> fs = fb.fs();
                    for (String str : fs.keySet()) {
                        jSONObject2.put(str, fs.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.zn.put("playableSDKInfo", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.62
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.zn.put("subscribe_app_ad", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.63
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("download_app_ad", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.64
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put(X3.i.o, new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.2
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                if (fb == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", fb.bvs());
                return jSONObject3;
            }
        });
        this.zn.put("getVolume", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.3
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                if (fb == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", fb.zg());
                return jSONObject3;
            }
        });
        this.zn.put("getScreenSize", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.4
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                if (fb == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject kgc = fb.kgc();
                kgc.put("code", 1);
                return kgc;
            }
        });
        this.zn.put("start_accelerometer_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.5
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        nps.zmn("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                iv.zmn(hhw.this.zmn, hhw.this.fb, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("close_accelerometer_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.6
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, hhw.this.fb);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("start_gyro_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.7
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        nps.zmn("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                iv.fs(hhw.this.zmn, hhw.this.btk, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("close_gyro_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.8
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, hhw.this.btk);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("start_accelerometer_grativityless_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.9
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        nps.zmn("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                iv.zn(hhw.this.zmn, hhw.this.hhw, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("close_accelerometer_grativityless_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.10
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, hhw.this.hhw);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("start_rotation_vector_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.11
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        nps.zmn("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                iv.fb(hhw.this.zmn, hhw.this.nps, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("close_rotation_vector_observer", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.13
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, hhw.this.nps);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("device_shake", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.14
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("device_shake_short", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.15
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    iv.zmn(hhw.this.zmn, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    nps.zmn("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.zn.put("playable_style", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.16
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb != null) {
                    JSONObject zn = fb.zn();
                    zn.put("code", 1);
                    return zn;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.zn.put("sendReward", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.17
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb != null) {
                    fb.phc();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.zn.put("playableInteractionTriggered", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.18
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb != null) {
                    fb.doe();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.zn.put("webview_time_track", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.19
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.zn.put("playable_event", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.20
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.fs(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("reportAd", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.21
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("close", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.22
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("openAdLandPageLinks", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.24
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("get_viewport", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.25
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject iqz = fb.iqz();
                iqz.put("code", 1);
                return iqz;
            }
        });
        this.zn.put("jssdk_load_finish", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.26
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.so();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_material_render_result", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.27
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.bvs(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("detect_change_playable_click", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.28
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject iv = fb.iv();
                iv.put("code", 1);
                return iv;
            }
        });
        this.zn.put("check_camera_permission", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.29
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject mw = fb.mw();
                mw.put("code", 1);
                return mw;
            }
        });
        this.zn.put("check_external_storage", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.30
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject rt = fb.rt();
                if (rt.isNull("result")) {
                    rt.put("code", -1);
                } else {
                    rt.put("code", 1);
                }
                return rt;
            }
        });
        this.zn.put("playable_open_camera", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.31
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_pick_photo", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.32
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_download_media_in_photos", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.33
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.zmn(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_preventTouchEvent", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.35
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.fs(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_settings_info", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.36
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject cn = fb.cn();
                cn.put("code", 1);
                return cn;
            }
        });
        this.zn.put("playable_load_main_scene", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.37
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.nqi();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_enter_section", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.38
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.fb(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_end", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.39
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.uqh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_finish_play_playable", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.40
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.bjh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_transfrom_module_show", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.41
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.rp();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_transfrom_module_change_color", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.42
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.kjb();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_set_scroll_rect", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.43
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_click_area", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.44
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.btk(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_real_play_start", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.46
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_material_first_frame_show", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.47
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.zak();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_stuck_check_pong", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.48
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.am();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_material_adnormal_mask", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.49
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                fb.hhw(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_long_press_panel", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.50
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_alpha_player_play", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.51
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_transfrom_module_highlight", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.52
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_send_click_event", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.53
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_query_media_permission_declare", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.54
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject nps = fb.nps(jSONObject);
                nps.put("code", 1);
                return nps;
            }
        });
        this.zn.put("playable_query_media_permission_enable", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.55
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                zg fb = hhw.this.fb();
                JSONObject jSONObject2 = new JSONObject();
                if (fb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject zg = fb.zg(jSONObject);
                zg.put("code", 1);
                return zg;
            }
        });
        this.zn.put("playable_apply_media_permission", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.57
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_start_kws", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.58
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_close_kws", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.59
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_video_preload_task_add", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.60
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.zn.put("playable_video_preload_task_cancel", new zmn() { // from class: com.bytedance.sdk.openadsdk.doe.hhw.61
            @Override // com.bytedance.sdk.openadsdk.doe.hhw.zmn
            public JSONObject zmn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.doe.zmn btk = hhw.this.btk();
                JSONObject jSONObject2 = new JSONObject();
                if (btk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zg fb() {
        WeakReference<zg> weakReference = this.fs;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.doe.zmn btk() {
        zg fb = fb();
        if (fb == null) {
            return null;
        }
        return fb.olo();
    }

    public JSONObject zmn(String str, JSONObject jSONObject) {
        try {
            zmn zmnVar = this.zn.get(str);
            if (zmnVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return zmnVar.zmn(jSONObject);
        } catch (Throwable th) {
            nps.zmn("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void fs() {
        iv.zmn(this.zmn, this.fb);
        iv.zmn(this.zmn, this.btk);
        iv.zmn(this.zmn, this.hhw);
        iv.zmn(this.zmn, this.nps);
    }
}
