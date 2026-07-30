package com.crrepa.band.my.model;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public class ContactInfo {
    private Uri avatarUrl;
    private String name;
    private List<String> number;

    public Uri getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getNumber() {
        return this.number;
    }

    public void setAvatarUrl(Uri uri) {
        this.avatarUrl = uri;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(List<String> list) {
        this.number = list;
    }
}
