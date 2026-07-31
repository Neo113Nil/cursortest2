package com.bytedance.adsdk.ugeno.zmn.fs;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.zmn.btk;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class zn extends zmn {
    public zn(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, String str, TreeMap<Float, String> treeMap) {
        super(context, znVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void fs() {
        if (this.fb == btk.BACKGROUND_COLOR) {
            this.btk.add(Keyframe.ofInt(0.0f, this.nps.oub()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void zmn(float f, String str) {
        Keyframe ofInt;
        if (this.fb == btk.BACKGROUND_COLOR) {
            ofInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.nps.zmn.zmn(str));
        } else {
            ofInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.nps.zn.zmn(str, 0));
        }
        this.btk.add(ofInt);
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public TypeEvaluator hhw() {
        if (this.fb == btk.BACKGROUND_COLOR) {
            return new ArgbEvaluator();
        }
        return new IntEvaluator();
    }
}
