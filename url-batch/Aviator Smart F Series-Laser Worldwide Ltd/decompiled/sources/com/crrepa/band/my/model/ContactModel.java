package com.crrepa.band.my.model;

import android.net.Uri;
import me.yokeyword.indexablerv.e;

/* loaded from: classes2.dex */
public class ContactModel implements e {
    private Uri avatar;
    private boolean cheched;
    private int count;
    private int index;
    private String indexText;
    private String name;
    private String number;
    private String pinyin;

    public Uri getAvatar() {
        return this.avatar;
    }

    public int getCount() {
        return this.count;
    }

    @Override // me.yokeyword.indexablerv.e
    public String getFieldIndexBy() {
        String str = this.name + this.index;
        this.indexText = str;
        return str;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public boolean isCheched() {
        return this.cheched;
    }

    public void setAvatar(Uri uri) {
        this.avatar = uri;
    }

    public void setCheched(boolean z7) {
        this.cheched = z7;
    }

    public void setCount(int i8) {
        this.count = i8;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldIndexBy(String str) {
        this.indexText = str;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldPinyinIndexBy(String str) {
        this.pinyin = str;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public void setPinyin(String str) {
        this.pinyin = str;
    }
}
