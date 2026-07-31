package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r60 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final s60 f11035a;

    public r60(s60 s60Var) {
        this.f11035a = s60Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        if (this.f11035a == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            io0.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = a3.a1.a(new JSONObject(map.get("info")));
            } catch (JSONException e7) {
                io0.e("Failed to convert ad metadata to JSON.", e7);
            }
        }
        if (bundle == null) {
            io0.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f11035a.t(str, bundle);
        }
    }
}
