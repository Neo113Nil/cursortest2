package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public abstract class t6 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public float f4454a;

    /* renamed from: b, reason: collision with root package name */
    public float f4455b;

    /* renamed from: c, reason: collision with root package name */
    public float f4456c;

    /* renamed from: d, reason: collision with root package name */
    public float f4457d;

    /* renamed from: e, reason: collision with root package name */
    public long f4458e;

    public t6() {
        this.f4456c = Float.MAX_VALUE;
        this.f4457d = -3.4028235E38f;
        this.f4458e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f4454a);
        parcel.writeFloat(this.f4455b);
        parcel.writeFloat(this.f4456c);
        parcel.writeFloat(this.f4457d);
    }

    public t6(Parcel parcel) {
        this.f4456c = Float.MAX_VALUE;
        this.f4457d = -3.4028235E38f;
        this.f4458e = 0L;
        this.f4454a = parcel.readFloat();
        this.f4455b = parcel.readFloat();
        this.f4456c = parcel.readFloat();
        this.f4457d = parcel.readFloat();
        this.f4458e = AnimationUtils.currentAnimationTimeMillis();
    }
}
