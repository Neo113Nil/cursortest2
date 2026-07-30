package com.crrepa.band.my.device.customkey.model;

import androidx.annotation.DrawableRes;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class FeatureInfo {
    private int featureType;

    @DrawableRes
    private int icon;
    private String name;
    private boolean selected;

    public int getFeatureType() {
        return this.featureType;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setFeatureType(int i8) {
        this.featureType = i8;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z7) {
        this.selected = z7;
    }

    public void setTitle(int i8) {
        this.name = d.get().getString(i8);
    }
}
