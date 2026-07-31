package com.startapp.sdk.internal;

import com.startapp.sdk.common.SDKException;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class la extends be {
    public final JSONObject b;

    public la(Set set) {
        super(set);
        this.b = new JSONObject();
    }

    @Override // com.startapp.sdk.internal.be
    public final void a(String str, Object obj, boolean z, boolean z2) {
        if (this.f185a.contains(str)) {
            return;
        }
        try {
            Object a2 = obj instanceof ae ? ((ae) obj).a() : obj != null ? obj.toString() : null;
            if (a2 != null) {
                this.b.put(str, a2);
            } else if (z) {
                throw new SDKException(str);
            }
        } catch (JSONException e) {
            if (z) {
                throw new SDKException(str, e);
            }
        }
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // com.startapp.sdk.internal.be
    public final void a(String str, Set set) {
        if (this.f185a.contains(str) || set == null || set.size() <= 0) {
            return;
        }
        try {
            this.b.put(str, new JSONArray((Collection) set));
        } catch (JSONException unused) {
        }
    }
}
