package com.bytedance.adsdk.ugeno.zmn.fs;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.zmn.btk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public abstract class zmn {
    protected btk fb;
    protected String fs;
    protected com.bytedance.adsdk.ugeno.fs.zn nps;
    protected Context zmn;
    protected Map<Float, String> zn;
    protected List<PropertyValuesHolder> hhw = new ArrayList();
    protected List<Keyframe> btk = new ArrayList();

    public abstract void fs();

    public abstract TypeEvaluator hhw();

    public abstract void zmn(float f, String str);

    public zmn(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, String str, Map<Float, String> map) {
        this.zmn = context;
        this.fs = str;
        this.zn = map;
        this.fb = btk.zmn(this.fs);
        this.nps = znVar;
    }

    public boolean zmn() {
        Map<Float, String> map = this.zn;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.zn.containsKey(Float.valueOf(0.0f));
    }

    public void zn() {
        Map<Float, String> map = this.zn;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.zn;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                zmn(100.0f, this.zn.get(f));
            }
        }
    }

    public void fb() {
        Map<Float, String> map = this.zn;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!zmn()) {
            fs();
        }
        for (Map.Entry<Float, String> entry : this.zn.entrySet()) {
            if (entry != null) {
                zmn(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        zn();
    }

    public List<PropertyValuesHolder> btk() {
        String fs = this.fb.fs();
        fb();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(fs, (Keyframe[]) this.btk.toArray(new Keyframe[0]));
        TypeEvaluator hhw = hhw();
        if (hhw != null) {
            ofKeyframe.setEvaluator(hhw);
        }
        this.hhw.add(ofKeyframe);
        return this.hhw;
    }
}
