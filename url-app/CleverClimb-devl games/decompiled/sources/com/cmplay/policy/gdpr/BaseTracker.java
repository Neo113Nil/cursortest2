package com.cmplay.policy.gdpr;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class BaseTracker {
    protected String tableName;
    protected ContentValues values = new ContentValues();

    public BaseTracker(String str) {
        this.tableName = str;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String buildToReportStr() {
        if (this.values == null || this.values.valueSet() == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.values.valueSet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        return TextUtils.join("&", arrayList);
    }

    protected void setValue(String str, int i) {
        this.values.put(str, Integer.valueOf(i));
    }

    protected void setValue(String str, long j) {
        this.values.put(str, Long.valueOf(j));
    }

    protected void setValue(String str, float f) {
        this.values.put(str, Float.valueOf(f));
    }

    protected void setValue(String str, byte b2) {
        this.values.put(str, Byte.valueOf(b2));
    }

    protected void setValue(String str, String str2) {
        this.values.put(str, str2);
    }
}
