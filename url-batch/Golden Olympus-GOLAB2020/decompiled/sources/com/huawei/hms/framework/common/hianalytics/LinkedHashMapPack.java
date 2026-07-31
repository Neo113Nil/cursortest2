package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class LinkedHashMapPack {

    /* renamed from: a, reason: collision with root package name */
    private LinkedHashMap f14173a = new LinkedHashMap();

    public LinkedHashMap<String, String> getAll() {
        return this.f14173a;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f14173a.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j4, long j5) {
        return j4 == j5 ? this : put(str, j4);
    }

    public LinkedHashMapPack put(String str, boolean z4) {
        if (str != null) {
            if (z4) {
                this.f14173a.put(str, "1");
                return this;
            }
            this.f14173a.put(str, "0");
        }
        return this;
    }

    public LinkedHashMapPack put(String str, long j4) {
        if (str != null) {
            this.f14173a.put(str, "" + j4);
        }
        return this;
    }
}
