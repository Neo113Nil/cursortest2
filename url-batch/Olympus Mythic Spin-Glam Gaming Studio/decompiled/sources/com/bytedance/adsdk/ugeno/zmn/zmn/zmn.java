package com.bytedance.adsdk.ugeno.zmn.zmn;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class zmn {
    protected com.bytedance.adsdk.ugeno.fs.zn fs;
    protected JSONObject zmn;
    private String zn;

    public abstract void fs();

    public abstract void fs(Canvas canvas);

    public abstract void zmn(int i, int i2);

    public abstract void zmn(Canvas canvas);

    public abstract List<PropertyValuesHolder> zn();

    public zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        this.zmn = jSONObject;
        this.fs = znVar;
        zmn();
    }

    public void zmn() {
        this.zn = this.zmn.optString("type");
        fs();
    }

    public String fb() {
        return this.zn;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zmn.zmn.zmn$zmn, reason: collision with other inner class name */
    public static class C0117zmn {
        public static zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
            if (znVar == null || jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            optString.hashCode();
            switch (optString) {
                case "stretch":
                    return new btk(znVar, jSONObject);
                case "ripple":
                    return new fs(znVar, jSONObject);
                case "rub_in":
                    return new zn(znVar, jSONObject);
                case "shine":
                    return new fb(znVar, jSONObject);
                default:
                    return null;
            }
        }
    }
}
