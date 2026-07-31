package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class eb implements ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f226a;

    public eb(LinkedHashSet linkedHashSet) {
        this.f226a = linkedHashSet;
    }

    @Override // com.startapp.sdk.internal.ae
    public final JSONArray a() {
        LinkedHashSet<Locale> linkedHashSet = this.f226a;
        JSONArray jSONArray = new JSONArray();
        for (Locale locale : linkedHashSet) {
            if (locale != null) {
                jSONArray.put(locale.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.startapp.sdk.internal.ae
    public final String b() {
        boolean z = false;
        StringBuilder sb = null;
        for (Locale locale : this.f226a) {
            if (locale != null) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z) {
                    sb.append(';');
                }
                sb.append(locale);
                z = true;
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }
}
