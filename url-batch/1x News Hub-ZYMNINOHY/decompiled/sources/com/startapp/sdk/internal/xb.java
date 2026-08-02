package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class xb implements re {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f4718a;

    public xb(LinkedHashSet linkedHashSet) {
        this.f4718a = linkedHashSet;
    }

    @Override // com.startapp.sdk.internal.re
    public final JSONArray a() {
        LinkedHashSet<Locale> linkedHashSet = this.f4718a;
        JSONArray jSONArray = new JSONArray();
        for (Locale locale : linkedHashSet) {
            if (locale != null) {
                jSONArray.put(locale.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.startapp.sdk.internal.re
    public final String b() {
        return yb.a(null, this.f4718a, ';');
    }
}
