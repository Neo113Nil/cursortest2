package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class iv extends com.bytedance.adsdk.fs.hhw {
    private String fs;
    private Map<String, Bitmap> zmn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    public iv(Context context) {
        super(context);
        this.zmn = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.fs = str;
    }

    public void zg() {
        if (TextUtils.isEmpty(this.fs)) {
            return;
        }
        setProgress(0.0f);
        zmn(true);
        setAnimationFromUrl(this.fs);
        setImageAssetDelegate(new com.bytedance.adsdk.fs.fb() { // from class: com.bytedance.sdk.component.adexpress.hhw.iv.1
            @Override // com.bytedance.adsdk.fs.fb
            public Bitmap zmn(final com.bytedance.adsdk.fs.iv ivVar) {
                final String zg = ivVar.zg();
                String iv = ivVar.iv();
                String bvs = ivVar.bvs();
                if (TextUtils.equals(zg, "image_0") && TextUtils.equals(bvs, "Lark20201123-180048_2.png")) {
                    bvs = "hand.png";
                }
                Bitmap bitmap = (Bitmap) iv.this.zmn.get(zg);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(iv) || !TextUtils.isEmpty(bvs)) {
                    if (!TextUtils.isEmpty(bvs) && TextUtils.isEmpty(iv)) {
                        iv = bvs;
                    } else if (!TextUtils.isEmpty(bvs) && !TextUtils.isEmpty(iv)) {
                        iv = iv + bvs;
                    } else {
                        iv = "";
                    }
                }
                if (TextUtils.isEmpty(iv)) {
                    return null;
                }
                com.bytedance.sdk.component.btk.iv zmn2 = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().btk().zmn(iv).zn(2).zmn(new com.bytedance.sdk.component.btk.zg() { // from class: com.bytedance.sdk.component.adexpress.hhw.iv.1.1
                    @Override // com.bytedance.sdk.component.btk.zg
                    public Bitmap zmn(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ivVar.zmn(), ivVar.fs(), false);
                        iv.this.zmn.put(zg, createScaledBitmap);
                        return createScaledBitmap;
                    }
                });
                iv ivVar2 = iv.this;
                zmn2.zmn(new zmn(ivVar2, ivVar, zg, ivVar2.zmn));
                return (Bitmap) iv.this.zmn.get(zg);
            }
        });
        zmn();
    }

    private static class zmn implements com.bytedance.sdk.component.btk.cyb {
        private final Map<String, Bitmap> fb;
        private final com.bytedance.adsdk.fs.iv fs;
        private final WeakReference<iv> zmn;
        private final String zn;

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, Throwable th) {
        }

        public zmn(iv ivVar, com.bytedance.adsdk.fs.iv ivVar2, String str, Map<String, Bitmap> map) {
            this.zmn = new WeakReference<>(ivVar);
            this.fs = ivVar2;
            this.zn = str;
            this.fb = map;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            Object fs = rcVar.fs();
            if (fs instanceof Bitmap) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) fs, this.fs.zmn(), this.fs.fs(), false);
                this.fb.put(this.zn, createScaledBitmap);
                iv ivVar = this.zmn.get();
                if (ivVar != null) {
                    ivVar.zmn(this.fs.zg(), createScaledBitmap);
                }
            }
        }
    }
}
