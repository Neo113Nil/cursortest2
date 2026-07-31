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
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public class fb {
    public static void zmn(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (viewGroup == null || nqiVar == null || TextUtils.isEmpty(nqiVar.am())) {
            return;
        }
        try {
            int i = olo.au;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable zmn2 = zmn(viewGroup.getResources(), nqiVar);
            if (zmn2 == null) {
                return;
            }
            viewGroup.setForeground(zmn2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("add overlay fail", th.getMessage());
        }
    }

    public static void zmn(Activity activity, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (activity == null || nqiVar == null || TextUtils.isEmpty(nqiVar.am())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = olo.au;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable zmn2 = zmn(activity.getResources(), nqiVar);
            if (zmn2 == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(zmn2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable zmn(Resources resources, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        try {
            String am = nqiVar.am();
            if (TextUtils.isEmpty(am)) {
                return null;
            }
            byte[] decode = Base64.decode(am, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static class zmn implements View.OnLayoutChangeListener {
        private int fs;
        private final Drawable zmn;
        private int zn;

        public zmn(Drawable drawable) {
            this.zmn = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.fs && i10 == this.zn) {
                return;
            }
            this.fs = i9;
            this.zn = i10;
            this.zmn.setBounds(0, 0, i9, i10);
        }
    }
}
