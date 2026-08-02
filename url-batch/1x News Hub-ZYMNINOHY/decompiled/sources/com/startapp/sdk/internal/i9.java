package com.startapp.sdk.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3962a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3963b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3964c;

    /* renamed from: d, reason: collision with root package name */
    public String f3965d;

    public final i9 a(String... strArr) {
        ArrayList arrayList = this.f3964c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3964c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
