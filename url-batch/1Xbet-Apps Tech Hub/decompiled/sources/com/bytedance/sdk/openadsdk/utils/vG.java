package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AdmobOverlayHelper.java */
/* loaded from: classes2.dex */
public class vG {
    public static void pvs(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (viewGroup == null || cRVar == null || TextUtils.isEmpty(cRVar.BHd())) {
            return;
        }
        try {
            if (viewGroup.getTag(kj.ekB) != null) {
                return;
            }
            int i = kj.ekB;
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable pvs2 = pvs(viewGroup.getResources(), cRVar);
            if (pvs2 == null) {
                return;
            }
            viewGroup.setForeground(pvs2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("add overlay fail", th.getMessage());
        }
    }

    public static void pvs(Activity activity, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (activity == null || cRVar == null || TextUtils.isEmpty(cRVar.BHd())) {
            return;
        }
        try {
            if (activity.getWindow().getDecorView().getTag(kj.ekB) != null) {
                return;
            }
            View decorView = activity.getWindow().getDecorView();
            int i = kj.ekB;
            decorView.setTag(i, Integer.valueOf(i));
            Drawable pvs2 = pvs(activity.getResources(), cRVar);
            if (pvs2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(pvs2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("add overlay fail", th.getMessage());
        }
    }

    private static Drawable pvs(Resources resources, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        try {
            String BHd = cRVar.BHd();
            if (TextUtils.isEmpty(BHd)) {
                return null;
            }
            byte[] decode = Base64.decode(BHd, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* compiled from: AdmobOverlayHelper.java */
    private static class pvs implements View.OnLayoutChangeListener {
        private int icD;
        private final Drawable pvs;
        private int vG;

        public pvs(Drawable drawable) {
            this.pvs = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.icD && i10 == this.vG) {
                return;
            }
            this.icD = i9;
            this.vG = i10;
            this.pvs.setBounds(0, 0, i9, i10);
        }
    }
}
