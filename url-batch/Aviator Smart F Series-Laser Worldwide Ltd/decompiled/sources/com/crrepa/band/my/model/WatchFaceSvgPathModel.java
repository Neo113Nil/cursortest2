package com.crrepa.band.my.model;

import android.graphics.Path;

/* loaded from: classes2.dex */
public class WatchFaceSvgPathModel {
    private String color;
    private String fillAlpha;
    private String id;
    private boolean isClipPath;
    private Path path;

    public WatchFaceSvgPathModel(String str, Path path, String str2) {
        this.id = str;
        this.path = path;
        this.color = str2;
    }

    public String getColor() {
        return this.color;
    }

    public String getFillAlpha() {
        return this.fillAlpha;
    }

    public String getId() {
        return this.id;
    }

    public Path getPath() {
        return this.path;
    }

    public boolean isClipPath() {
        return this.isClipPath;
    }

    public void setClipPath(boolean z7) {
        this.isClipPath = z7;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setFillAlpha(String str) {
        this.fillAlpha = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public WatchFaceSvgPathModel() {
    }

    public WatchFaceSvgPathModel(Path path, String str) {
        this.path = path;
        this.color = str;
    }
}
