package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cf extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6770a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6771b;

    public cf(String str, HashMap hashMap) {
        this.f6770a = str;
        this.f6771b = hashMap;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first != this) {
            return false;
        }
        Object obj2 = pair.second;
        if (!(obj2 instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) obj2;
        if (!this.f6770a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry entry : this.f6771b.entrySet()) {
            if (!((String) entry.getValue()).equals(String.valueOf(extras.get((String) entry.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
