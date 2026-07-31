package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class kf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f307a = new HashMap();

    public final int a(SensorEvent sensorEvent) {
        int size;
        synchronized (this) {
            int type = sensorEvent.sensor.getType();
            SensorEvent sensorEvent2 = (SensorEvent) this.f307a.get(Integer.valueOf(type));
            if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                this.f307a.put(Integer.valueOf(type), sensorEvent);
            }
            size = this.f307a.size();
        }
        return size;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent sensorEvent : this.f307a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = sensorEvent.sensor;
            jSONObject2.put("name", sensor.getName());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            jSONObject2.put("maximum range", sensor.getMaximumRange());
            jSONObject2.put("power", sensor.getPower());
            jSONObject2.put("resolution", sensor.getResolution());
            jSONObject2.put("accuracy", sensorEvent.accuracy);
            jSONObject2.put("timestamp", sensorEvent.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            int length = sensorEvent.values.length;
            for (int i = 0; i < length; i++) {
                jSONArray2.put(r2[i]);
            }
            jSONObject2.put("values", jSONArray2);
            jSONObject.put(String.valueOf(sensor.getType()), jSONObject2);
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
