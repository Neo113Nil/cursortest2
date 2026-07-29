package com.cmplay.a;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: BaseTracker.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected String f3894a;

    /* renamed from: b, reason: collision with root package name */
    protected ContentValues f3895b = new ContentValues();

    public b(String str) {
        this.f3894a = str;
    }

    public String a() {
        return this.f3894a;
    }

    public String b() {
        if (this.f3895b == null || this.f3895b.valueSet() == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.f3895b.valueSet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        return TextUtils.join("&", arrayList);
    }

    protected void a(String str, int i) {
        this.f3895b.put(str, Integer.valueOf(i));
    }

    protected void a(String str, long j) {
        this.f3895b.put(str, Long.valueOf(j));
    }
}
