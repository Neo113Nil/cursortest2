package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public abstract class t6 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public float f7591a;

    /* renamed from: b, reason: collision with root package name */
    public float f7592b;

    /* renamed from: c, reason: collision with root package name */
    public float f7593c;

    /* renamed from: d, reason: collision with root package name */
    public float f7594d;

    /* renamed from: e, reason: collision with root package name */
    public long f7595e;

    public t6() {
        this.f7593c = Float.MAX_VALUE;
        this.f7594d = -3.4028235E38f;
        this.f7595e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f7591a);
        parcel.writeFloat(this.f7592b);
        parcel.writeFloat(this.f7593c);
        parcel.writeFloat(this.f7594d);
    }

    public t6(Parcel parcel) {
        this.f7593c = Float.MAX_VALUE;
        this.f7594d = -3.4028235E38f;
        this.f7595e = 0L;
        this.f7591a = parcel.readFloat();
        this.f7592b = parcel.readFloat();
        this.f7593c = parcel.readFloat();
        this.f7594d = parcel.readFloat();
        this.f7595e = AnimationUtils.currentAnimationTimeMillis();
    }
}
