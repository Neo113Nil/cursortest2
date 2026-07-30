package com.moyoung.classes.meditation.localclass.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;
import androidx.annotation.StringRes;
import java.util.List;

/* loaded from: classes4.dex */
public class WhiteNoiseBean {

    @RawRes
    private int audioResId;

    @DrawableRes
    private int bgResId;
    private int id;
    private boolean isSelected = false;

    @DrawableRes
    private int thumbResId;

    @StringRes
    private int title;

    public WhiteNoiseBean(int i8, @StringRes int i9, int i10, int i11, int i12) {
        this.id = i8;
        this.title = i9;
        this.thumbResId = i10;
        this.bgResId = i11;
        this.audioResId = i12;
    }

    public static WhiteNoiseBean findById(int i8, List<WhiteNoiseBean> list) {
        for (WhiteNoiseBean whiteNoiseBean : list) {
            if (whiteNoiseBean.getId() == i8) {
                return whiteNoiseBean;
            }
        }
        return list.get(0);
    }

    public static String getAudioUrl(@RawRes int i8) {
        return "rawresource:///" + i8;
    }

    public int getAudioResId() {
        return this.audioResId;
    }

    public int getBgResId() {
        return this.bgResId;
    }

    public int getId() {
        return this.id;
    }

    public int getThumbResId() {
        return this.thumbResId;
    }

    @StringRes
    public int getTitle() {
        return this.title;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setSelected(boolean z7) {
        this.isSelected = z7;
    }
}
