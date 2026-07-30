package com.crrepa.band.my.device.muslim.model;

import java.util.List;

/* loaded from: classes2.dex */
public class DuasSection {
    private List<Duas> details;
    private boolean favorite;
    private String title;

    public List<Duas> getDetails() {
        return this.details;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isFavorite() {
        return this.favorite;
    }

    public void setDetails(List<Duas> list) {
        this.details = list;
    }

    public void setFavorite(boolean z7) {
        this.favorite = z7;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
