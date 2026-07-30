package com.crrepa.band.my.model.gps;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

/* loaded from: classes2.dex */
public class GpsTrainingInfoModel {
    public static final int TIPS_TYPE_NONE = -1;
    private String content;

    @DrawableRes
    private int icon;
    private int tipsType = -1;

    @StringRes
    private int title;

    public String getContent() {
        return this.content;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public int getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setTipsType(int i8) {
        this.tipsType = i8;
    }

    public void setTitle(int i8) {
        this.title = i8;
    }
}
