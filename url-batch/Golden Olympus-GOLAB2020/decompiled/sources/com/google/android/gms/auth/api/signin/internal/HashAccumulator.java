package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes.dex */
public class HashAccumulator {
    private int zaa = 1;

    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    public final HashAccumulator zaa(boolean z4) {
        this.zaa = (this.zaa * 31) + (z4 ? 1 : 0);
        return this;
    }
}
