package com.crrepa.band.my.training.gomoresport.path;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

/* loaded from: classes3.dex */
public class a {
    public static final int TIPS_TYPE_NONE = -1;
    public static final int TIPS_TYPE_TRAINING_LOAD = 0;
    public static final int TIPS_TYPE_TRAINING_STATUS = 1;
    public String data;

    @DrawableRes
    public int icon;
    public int tipsType = -1;

    @StringRes
    public int title;
    public String unit;

    public a(int i8, @StringRes int i9, String str, String str2) {
        this.icon = i8;
        this.title = i9;
        this.data = str;
        this.unit = str2;
    }
}
