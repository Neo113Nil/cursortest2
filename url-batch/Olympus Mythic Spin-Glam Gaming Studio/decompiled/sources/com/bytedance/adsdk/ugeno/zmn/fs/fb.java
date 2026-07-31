package com.bytedance.adsdk.ugeno.zmn.fs;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.nps.zg;
import com.bytedance.adsdk.ugeno.zmn.btk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class fb extends zmn {
    private List<Keyframe> zg;

    public fb(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, String str, Map<Float, String> map) {
        super(context, znVar, str, map);
        this.zg = new ArrayList();
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zmn.fs.fb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[btk.values().length];
            zmn = iArr;
            try {
                iArr[btk.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[btk.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void fs() {
        Keyframe ofFloat;
        Keyframe ofFloat2;
        int i = AnonymousClass1.zmn[this.fb.ordinal()];
        if (i == 1) {
            ofFloat = Keyframe.ofFloat(0.0f, this.nps.cn());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.nps.cyb());
        } else if (i != 2) {
            ofFloat = null;
            ofFloat2 = null;
        } else {
            ofFloat = Keyframe.ofFloat(0.0f, this.nps.olo());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.nps.kgc());
        }
        if (ofFloat != null) {
            this.btk.add(ofFloat);
        }
        if (ofFloat2 != null) {
            this.zg.add(ofFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public void zmn(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float optDouble = (float) jSONArray.optDouble(0);
            float optDouble2 = (float) jSONArray.optDouble(1);
            if (this.fb == btk.TRANSLATE) {
                optDouble = zg.zmn(this.zmn, optDouble);
                optDouble2 = zg.zmn(this.zmn, optDouble2);
            }
            this.btk.add(Keyframe.ofFloat(f, optDouble));
            this.zg.add(Keyframe.ofFloat(f, optDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public List<PropertyValuesHolder> btk() {
        String fs = this.fb.fs();
        fb();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(fs + "X", (Keyframe[]) this.btk.toArray(new Keyframe[0]));
        this.hhw.add(ofKeyframe);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(fs + "Y", (Keyframe[]) this.zg.toArray(new Keyframe[0]));
        this.hhw.add(ofKeyframe2);
        TypeEvaluator hhw = hhw();
        if (hhw != null) {
            ofKeyframe.setEvaluator(hhw);
            ofKeyframe2.setEvaluator(hhw);
        }
        return this.hhw;
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.fs.zmn
    public TypeEvaluator hhw() {
        return new FloatEvaluator();
    }
}
