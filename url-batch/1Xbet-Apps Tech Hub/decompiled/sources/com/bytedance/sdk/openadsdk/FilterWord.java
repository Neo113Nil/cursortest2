package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FilterWord {
    private List<FilterWord> Jd;
    private String icD;
    private String pvs;
    private boolean vG;

    public FilterWord(String str, String str2) {
        this.pvs = str;
        this.icD = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.pvs;
    }

    public void setId(String str) {
        this.pvs = str;
    }

    public String getName() {
        return this.icD;
    }

    public void setName(String str) {
        this.icD = str;
    }

    public boolean getIsSelected() {
        return this.vG;
    }

    public void setIsSelected(boolean z) {
        this.vG = z;
    }

    public List<FilterWord> getOptions() {
        return this.Jd;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.Jd == null) {
            this.Jd = new ArrayList();
        }
        this.Jd.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.pvs) || TextUtils.isEmpty(this.icD)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.Jd;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
