package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7088a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7089b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7090c;

    /* renamed from: d, reason: collision with root package name */
    public String f7091d;

    public final i9 a(String... strArr) {
        ArrayList arrayList = this.f7090c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f7090c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
