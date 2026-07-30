package com.moyoung.instructions.model;

import com.moyoung.instructions.utils.ContentType;
import java.util.List;

/* loaded from: classes4.dex */
public class InstructBean {
    int HorizontalMargin;
    int bottomMargin;
    int imageRes;
    int textColorRes;
    int textContentRes;
    int textSize;
    int topMargin;
    ContentType type;
    List<Integer> videoRes;

    public int getBottomMargin() {
        return this.bottomMargin;
    }

    public int getHorizontalMargin() {
        return this.HorizontalMargin;
    }

    public int getImageRes() {
        return this.imageRes;
    }

    public int getTextColorRes() {
        return this.textColorRes;
    }

    public int getTextContentRes() {
        return this.textContentRes;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public int getTopMargin() {
        return this.topMargin;
    }

    public ContentType getType() {
        return this.type;
    }

    public List<Integer> getVideoRes() {
        return this.videoRes;
    }

    public void setBottomMargin(int i8) {
        this.bottomMargin = i8;
    }

    public void setHorizontalMargin(int i8) {
        this.HorizontalMargin = i8;
    }

    public void setImageRes(int i8) {
        this.imageRes = i8;
    }

    public void setTextColorRes(int i8) {
        this.textColorRes = i8;
    }

    public void setTextContentRes(int i8) {
        this.textContentRes = i8;
    }

    public void setTextSize(int i8) {
        this.textSize = i8;
    }

    public void setTopMargin(int i8) {
        this.topMargin = i8;
    }

    public void setType(ContentType contentType) {
        this.type = contentType;
    }

    public void setVideoRes(List<Integer> list) {
        this.videoRes = list;
    }
}
