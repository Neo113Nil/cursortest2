package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r3.o;
import s3.c;

/* loaded from: classes.dex */
public final class Scope extends s3.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final int f2458f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2459g;

    Scope(int i7, String str) {
        o.g(str, "scopeUri must not be null or empty");
        this.f2458f = i7;
        this.f2459g = str;
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }

    @RecentlyNonNull
    public String c() {
        return this.f2459g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f2459g.equals(((Scope) obj).f2459g);
        }
        return false;
    }

    public int hashCode() {
        return this.f2459g.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f2459g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = c.a(parcel);
        c.h(parcel, 1, this.f2458f);
        c.m(parcel, 2, c(), false);
        c.b(parcel, a7);
    }
}
