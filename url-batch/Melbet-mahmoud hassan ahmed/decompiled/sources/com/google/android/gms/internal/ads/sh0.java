package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import x3.a;

/* loaded from: classes.dex */
public final class sh0 extends s3.a {
    public static final Parcelable.Creator<sh0> CREATOR = new th0();

    /* renamed from: f, reason: collision with root package name */
    public final View f11823f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, WeakReference<View>> f11824g;

    public sh0(IBinder iBinder, IBinder iBinder2) {
        this.f11823f = (View) x3.b.O0(a.AbstractBinderC0153a.q0(iBinder));
        this.f11824g = (Map) x3.b.O0(a.AbstractBinderC0153a.q0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.g(parcel, 1, x3.b.B3(this.f11823f).asBinder(), false);
        s3.c.g(parcel, 2, x3.b.B3(this.f11824g).asBinder(), false);
        s3.c.b(parcel, a7);
    }
}
