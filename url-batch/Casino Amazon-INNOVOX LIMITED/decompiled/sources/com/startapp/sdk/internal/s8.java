package com.startapp.sdk.internal;

import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f418a;
    public ArrayList b;
    public ArrayList c;
    public String d;

    public final s8 a(String... strArr) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
