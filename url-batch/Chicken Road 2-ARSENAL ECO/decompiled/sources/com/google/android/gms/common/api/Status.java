package com.google.android.gms.common.api;

import I.j;
import U0.t;
import V0.a;
import a.AbstractC0219a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import u0.AbstractC0676f;
import u0.C0675e;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new j(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f3859f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3860g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f3861h;

    /* renamed from: i, reason: collision with root package name */
    public final R0.a f3862i;

    public Status(int i7, String str, PendingIntent pendingIntent, R0.a aVar) {
        this.f3859f = i7;
        this.f3860g = str;
        this.f3861h = pendingIntent;
        this.f3862i = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f3859f == status.f3859f && t.i(this.f3860g, status.f3860g) && t.i(this.f3861h, status.f3861h) && t.i(this.f3862i, status.f3862i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3859f), this.f3860g, this.f3861h, this.f3862i});
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        String str = this.f3860g;
        if (str == null) {
            str = AbstractC0676f.k(this.f3859f);
        }
        c0675e.b(str, "statusCode");
        c0675e.b(this.f3861h, "resolution");
        return c0675e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f3859f);
        AbstractC0219a.J(parcel, 2, this.f3860g);
        AbstractC0219a.I(parcel, 3, this.f3861h, i7);
        AbstractC0219a.I(parcel, 4, this.f3862i, i7);
        AbstractC0219a.Q(parcel, O6);
    }
}
