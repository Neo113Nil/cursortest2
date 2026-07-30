package com.crrepa.band.my.device.customkey.model;

import androidx.annotation.DrawableRes;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class ActionInfo {
    private byte actionIndex;
    private String describe;
    private boolean hasGoal;

    @DrawableRes
    private int icon;
    private boolean selected;

    public byte getActionIndex() {
        return this.actionIndex;
    }

    public String getDescribe() {
        return this.describe;
    }

    public int getIcon() {
        return this.icon;
    }

    public boolean isHasGoal() {
        return this.hasGoal;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setActionIndex(byte b8) {
        this.actionIndex = b8;
    }

    public void setDescribe(String str) {
        this.describe = str;
    }

    public void setHasGoal(boolean z7) {
        this.hasGoal = z7;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setSelected(boolean z7) {
        this.selected = z7;
    }

    public String toString() {
        return "ActionInfo{icon=" + this.icon + ", describe='" + this.describe + "', selected=" + this.selected + ", hasGoal=" + this.hasGoal + ", actionIndex=" + ((int) this.actionIndex) + '}';
    }

    public void setDescribe(int i8) {
        this.describe = d.get().getString(i8);
    }
}
