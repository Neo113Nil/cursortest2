package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class le extends pe {

    /* renamed from: a, reason: collision with root package name */
    public final String f320a;
    public final HashMap b;

    public le(String str, HashMap hashMap) {
        this.f320a = str;
        this.b = hashMap;
    }

    @Override // com.startapp.sdk.internal.pe
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
        if (!this.f320a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            if (!((String) entry.getValue()).equals(String.valueOf(extras.get((String) entry.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
