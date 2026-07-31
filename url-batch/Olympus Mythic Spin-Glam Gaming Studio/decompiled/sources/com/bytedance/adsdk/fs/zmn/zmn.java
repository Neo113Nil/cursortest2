package com.bytedance.adsdk.fs.zmn;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.fs.hhw.btk;

/* loaded from: classes3.dex */
public class zmn extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public zmn() {
    }

    public zmn(int i) {
        super(i);
    }

    public zmn(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public zmn(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((btk.zmn(i, 0, 255) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(btk.zmn(i, 0, 255));
        }
    }
}
