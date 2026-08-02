package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class ca implements re {

    /* renamed from: b, reason: collision with root package name */
    public static final ca f6754b = new ca();

    /* renamed from: a, reason: collision with root package name */
    public final Set f6755a;

    public ca(Set languages) {
        kotlin.jvm.internal.i.e(languages, "languages");
        this.f6755a = languages;
    }

    @Override // com.startapp.sdk.internal.re
    public final JSONArray a() {
        if (this.f6755a != null) {
            return new JSONArray((Collection) this.f6755a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.re
    public final String b() {
        Set set = this.f6755a;
        if (set == null) {
            return null;
        }
        WeakHashMap weakHashMap = si.f7575a;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Object obj : set) {
            if (z) {
                sb.append(";");
            }
            sb.append(obj);
            z = true;
        }
        return sb.toString();
    }

    public ca() {
        this.f6755a = null;
    }
}
