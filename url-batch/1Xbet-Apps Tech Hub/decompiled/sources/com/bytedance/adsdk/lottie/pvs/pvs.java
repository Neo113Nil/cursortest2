package com.bytedance.adsdk.lottie.pvs;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.sUS.NB;

/* compiled from: LPaint.java */
/* loaded from: classes.dex */
public class pvs extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public pvs() {
    }

    public pvs(int i) {
        super(i);
    }

    public pvs(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public pvs(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((NB.pvs(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(NB.pvs(i, 0, 255));
        }
    }
}
