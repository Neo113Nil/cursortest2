package com.startapp.sdk.internal;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f300a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public GetBluetoothAsync$startUnsafe$1 c;

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        if (this.f300a.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (BluetoothDevice bluetoothDevice : this.f300a) {
                JSONObject jSONObject2 = new JSONObject();
                BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                jSONObject2.put("bluetoothClass", bluetoothClass != null ? Integer.valueOf(bluetoothClass.getDeviceClass()) : null);
                jSONObject2.put("name", bluetoothDevice.getName());
                jSONObject2.put("mac", bluetoothDevice.getAddress());
                jSONObject2.put("bondState", bluetoothDevice.getBondState());
                jSONArray.put(jSONObject2);
            }
            jSONObject = new JSONObject();
            jSONObject.put("paired", jSONArray);
        } else {
            jSONObject = null;
        }
        if (this.b.size() <= 0) {
            return jSONObject;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (BluetoothDevice bluetoothDevice2 : this.b) {
            JSONObject jSONObject3 = new JSONObject();
            BluetoothClass bluetoothClass2 = bluetoothDevice2.getBluetoothClass();
            jSONObject3.put("bluetoothClass", bluetoothClass2 != null ? Integer.valueOf(bluetoothClass2.getDeviceClass()) : null);
            jSONObject3.put("name", bluetoothDevice2.getName());
            jSONObject3.put("mac", bluetoothDevice2.getAddress());
            jSONObject3.put("bondState", bluetoothDevice2.getBondState());
            jSONArray2.put(jSONObject3);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("available", jSONArray2);
        return jSONObject;
    }
}
