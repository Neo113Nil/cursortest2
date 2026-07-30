package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public class HoleOptions extends OverlayOptions {
    protected String mHoleType;
    protected boolean mIsHoleClickable = false;

    public String getHoleType() {
        return this.mHoleType;
    }

    public boolean isHoleClickable() {
        return this.mIsHoleClickable;
    }

    public HoleOptions setHoleClickable(boolean z7) {
        this.mIsHoleClickable = z7;
        return this;
    }
}
