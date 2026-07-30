package com.crrepa.band.my.device.localmusic.model;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class SongBean {
    public String album;
    public String artist;
    public int duration;
    public String filePath;
    public int id;
    public boolean isSavedToBand;
    public boolean isSelected;
    public int size;
    public String title;

    public SongBean() {
    }

    public String getAlbum() {
        return this.album;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getId() {
        return this.id;
    }

    public int getSize() {
        return this.size;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIsSavedToBand(boolean z7) {
        this.isSavedToBand = z7;
    }

    public void setSelected(boolean z7) {
        this.isSelected = z7;
    }

    @NonNull
    public String toString() {
        return "SongBean{" + this.id + ", " + this.title + ", " + this.artist + ", " + this.album + ", " + this.filePath + ", " + this.duration + ", " + this.size + "}";
    }

    public SongBean(String str) {
        this.title = str;
    }
}
