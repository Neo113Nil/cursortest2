package com.bytedance.sdk.openadsdk.core.mw.btk.fs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public class fs extends com.bytedance.adsdk.ugeno.fb.fb.zn {
    private String rc;

    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Object obj;
        Map<String, Object> map = this.btk;
        if (map == null || map.size() <= 0 || (obj = this.btk.get("id")) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        Object obj2 = this.btk.get("state");
        if (obj2 != null) {
            this.rc = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.fs;
        com.bytedance.adsdk.ugeno.fs.zn fs = znVar.fs(znVar);
        if (fs == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.fs.zn btk = fs.btk(valueOf);
        if (btk instanceof com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn) {
            ((com.bytedance.sdk.openadsdk.core.mw.fs.fs.zmn) btk).zmn(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.mw.btk.fs.fs.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!TextUtils.equals(fs.this.rc, "complete") || ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zmn == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zmn.zmn(((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).fs, ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).hhw, ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zn.fs(), ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zn);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (!TextUtils.equals(fs.this.rc, "start") || ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zmn == null) {
                        return;
                    }
                    ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zmn.zmn(((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).fs, ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).hhw, ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zn.fs(), ((com.bytedance.adsdk.ugeno.fb.fb.zn) fs.this).zn);
                }
            });
        }
        return false;
    }
}
