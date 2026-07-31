package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j9 implements ae {
    public static final j9 b = new j9();

    /* renamed from: a, reason: collision with root package name */
    public final Collection f286a;

    public j9(Set set) {
        set.getClass();
        this.f286a = set;
    }

    @Override // com.startapp.sdk.internal.ae
    public final JSONArray a() {
        if (this.f286a != null) {
            return new JSONArray(this.f286a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ae
    public final String b() {
        Collection collection = this.f286a;
        if (collection == null) {
            return null;
        }
        WeakHashMap weakHashMap = zh.f528a;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Object obj : collection) {
            if (z) {
                sb.append(";");
            }
            sb.append(obj);
            z = true;
        }
        return sb.toString();
    }

    public j9() {
        this.f286a = null;
    }
}
