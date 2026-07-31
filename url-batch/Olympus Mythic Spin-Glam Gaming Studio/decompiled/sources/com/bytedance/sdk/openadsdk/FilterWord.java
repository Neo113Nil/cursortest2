package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class FilterWord {
    private List<FilterWord> fb;
    private String fs;
    private String zmn;
    private boolean zn;

    public FilterWord(String str, String str2) {
        this.zmn = str;
        this.fs = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.zmn;
    }

    public void setId(String str) {
        this.zmn = str;
    }

    public String getName() {
        return this.fs;
    }

    public void setName(String str) {
        this.fs = str;
    }

    public boolean getIsSelected() {
        return this.zn;
    }

    public void setIsSelected(boolean z) {
        this.zn = z;
    }

    public List<FilterWord> getOptions() {
        return this.fb;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.fb == null) {
            this.fb = new ArrayList();
        }
        this.fb.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.zmn) || TextUtils.isEmpty(this.fs)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.fb;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }
}
