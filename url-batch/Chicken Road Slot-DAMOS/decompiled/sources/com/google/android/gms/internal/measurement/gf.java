package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public final b8.s f2339a;

    /* renamed from: b, reason: collision with root package name */
    public final b8.s f2340b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f2341c;

    public gf(b8.s sVar, b8.s sVar2, UUID uuid) {
        this.f2339a = sVar;
        this.f2340b = sVar2;
        this.f2341c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        return this.f2339a.equals(gfVar.f2339a) && this.f2340b.equals(gfVar.f2340b) && this.f2341c.equals(gfVar.f2341c);
    }

    public final int hashCode() {
        return ((((((this.f2339a.hashCode() ^ 1000003) * 1000003) ^ this.f2340b.hashCode()) * 1000003) ^ this.f2341c.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f2339a);
    }
}
