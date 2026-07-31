package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public final int f172a;
    public final int b;
    public final ji c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    public ai(int i, int i2, ji jiVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f172a = i;
        this.b = i2;
        this.c = jiVar;
        this.d = str;
        this.e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ai.class == obj.getClass()) {
            ai aiVar = (ai) obj;
            if (this.f172a == aiVar.f172a && this.b == aiVar.b) {
                ji jiVar = this.c;
                ji jiVar2 = aiVar.c;
                WeakHashMap weakHashMap = zh.f528a;
                if (jiVar.equals(jiVar2) && zh.a((Object) this.d, (Object) aiVar.d) && this.e.equals(aiVar.e) && this.f.equals(aiVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f172a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
