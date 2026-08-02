package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eb extends se {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f3737b;

    public eb(Set set) {
        super(set);
        this.f3737b = new JSONObject();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Object obj, boolean z, boolean z2) {
        if (this.f4432a.contains(str)) {
            return;
        }
        try {
            Object a3 = obj instanceof re ? ((re) obj).a() : obj != null ? obj.toString() : null;
            if (a3 != null) {
                this.f3737b.put(str, a3);
            } else if (z) {
                throw new SDKException(str);
            }
        } catch (JSONException e3) {
            if (z) {
                throw new SDKException(str, e3);
            }
        }
    }

    public final String toString() {
        return this.f3737b.toString();
    }

    @Override // com.startapp.sdk.internal.se
    public final void a(String str, Set set) {
        if (this.f4432a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.f3737b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
