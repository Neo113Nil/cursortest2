package com.crrepa.band.my.device.ai.picture.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class AIPictureHistoryBean implements Serializable {
    private final String description;
    private String pictureFilePath;
    private final String styleCode;
    private final String styleName;

    public AIPictureHistoryBean(String str, String str2, String str3) {
        this.styleCode = str;
        this.styleName = str2;
        this.description = str3;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPictureFilePath() {
        return this.pictureFilePath;
    }

    public String getStyleCode() {
        return this.styleCode;
    }

    public String getStyleName() {
        return this.styleName;
    }

    public void setPictureFilePath(String str) {
        this.pictureFilePath = str;
    }
}
