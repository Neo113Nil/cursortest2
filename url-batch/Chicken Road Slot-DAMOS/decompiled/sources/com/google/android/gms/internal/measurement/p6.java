package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p6 extends d7.a {
    public static final Parcelable.Creator<p6> CREATOR = new o6(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f2667d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2668e;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f2669i;

    public p6(int i3, String str, Intent intent) {
        this.f2667d = i3;
        this.f2668e = str;
        this.f2669i = intent;
    }

    public static p6 b(Activity activity) {
        return new p6(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.f2667d == p6Var.f2667d && Objects.equals(this.f2668e, p6Var.f2668e) && Objects.equals(this.f2669i, p6Var.f2669i);
    }

    public final int hashCode() {
        return this.f2667d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f2667d);
        cf.c.V(parcel, 2, this.f2668e);
        cf.c.U(parcel, 3, this.f2669i, i3);
        cf.c.a0(parcel, Z);
    }
}
