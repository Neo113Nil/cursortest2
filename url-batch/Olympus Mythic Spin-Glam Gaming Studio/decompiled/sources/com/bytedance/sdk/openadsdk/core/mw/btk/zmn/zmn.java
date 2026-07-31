package com.bytedance.sdk.openadsdk.core.mw.btk.zmn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.adsdk.ugeno.fs.zn;
import java.util.Map;

/* loaded from: classes12.dex */
public class zmn extends com.bytedance.adsdk.ugeno.fb.fs.zmn {
    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void fs() {
    }

    public zmn(zn znVar, String str, hhw.zmn zmnVar) {
        super(znVar, str, zmnVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void zmn() {
        Object obj;
        zn znVar;
        zn fs;
        Map<String, Object> map = this.hhw;
        if (map == null || map.isEmpty() || (obj = this.hhw.get("id")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (fs = (znVar = this.zn).fs(znVar)) == null) {
            return;
        }
        zn btk = fs.btk(valueOf);
        if (btk instanceof com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn) {
            com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn zmnVar = (com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn) btk;
            zmnVar.fb();
            zmnVar.zmn(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.mw.btk.zmn.zmn.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    zmn.this.zn();
                }
            });
        }
    }
}
