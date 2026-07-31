package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p3.d;
import p3.j;
import r3.n;
import s3.c;

/* loaded from: classes.dex */
public final class Status extends s3.a implements j, ReflectedParcelable {

    /* renamed from: f, reason: collision with root package name */
    final int f2467f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2468g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2469h;

    /* renamed from: i, reason: collision with root package name */
    private final PendingIntent f2470i;

    /* renamed from: j, reason: collision with root package name */
    private final o3.b f2471j;

    /* renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2460k = new Status(0);

    /* renamed from: l, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2461l = new Status(14);

    /* renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2462m = new Status(8);

    /* renamed from: n, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2463n = new Status(15);

    /* renamed from: o, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2464o = new Status(16);

    /* renamed from: q, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2466q = new Status(17);

    /* renamed from: p, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f2465p = new Status(18);

    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int i7) {
        this(i7, (String) null);
    }

    Status(int i7, int i8, String str, PendingIntent pendingIntent) {
        this(i7, i8, str, pendingIntent, null);
    }

    Status(int i7, int i8, String str, PendingIntent pendingIntent, o3.b bVar) {
        this.f2467f = i7;
        this.f2468g = i8;
        this.f2469h = str;
        this.f2470i = pendingIntent;
        this.f2471j = bVar;
    }

    public Status(int i7, String str) {
        this(1, i7, str, null);
    }

    public Status(@RecentlyNonNull o3.b bVar, @RecentlyNonNull String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(@RecentlyNonNull o3.b bVar, @RecentlyNonNull String str, int i7) {
        this(1, i7, str, bVar.h(), bVar);
    }

    @Override // p3.j
    @RecentlyNonNull
    public Status a() {
        return this;
    }

    @RecentlyNullable
    public o3.b c() {
        return this.f2471j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2467f == status.f2467f && this.f2468g == status.f2468g && n.a(this.f2469h, status.f2469h) && n.a(this.f2470i, status.f2470i) && n.a(this.f2471j, status.f2471j);
    }

    public int g() {
        return this.f2468g;
    }

    @RecentlyNullable
    public String h() {
        return this.f2469h;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f2467f), Integer.valueOf(this.f2468g), this.f2469h, this.f2470i, this.f2471j);
    }

    public boolean i() {
        return this.f2470i != null;
    }

    public boolean j() {
        return this.f2468g <= 0;
    }

    @RecentlyNonNull
    public final String k() {
        String str = this.f2469h;
        return str != null ? str : d.a(this.f2468g);
    }

    @RecentlyNonNull
    public String toString() {
        n.a c7 = n.c(this);
        c7.a("statusCode", k());
        c7.a("resolution", this.f2470i);
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.h(parcel, 1, g());
        c.m(parcel, 2, h(), false);
        c.l(parcel, 3, this.f2470i, i7, false);
        c.l(parcel, 4, c(), i7, false);
        c.h(parcel, 1000, this.f2467f);
        c.b(parcel, a7);
    }
}
