package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.m f2502b;

    public la(Context context, a8.m mVar) {
        this.f2501a = context;
        this.f2502b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        if (!this.f2501a.equals(laVar.f2501a)) {
            return false;
        }
        a8.m mVar = laVar.f2502b;
        a8.m mVar2 = this.f2502b;
        return mVar2 == null ? mVar == null : mVar2.equals(mVar);
    }

    public final int hashCode() {
        int hashCode = this.f2501a.hashCode() ^ 1000003;
        a8.m mVar = this.f2502b;
        return (hashCode * 1000003) ^ (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        String obj = this.f2501a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f2502b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        n0.l.l(sb2, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
