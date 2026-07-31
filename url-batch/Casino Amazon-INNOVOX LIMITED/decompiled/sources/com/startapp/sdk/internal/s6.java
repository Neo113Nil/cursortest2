package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class s6 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public float f417a;
    public float b;
    public float c;
    public float d;
    public long e;

    public s6() {
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f417a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }

    public s6(Parcel parcel) {
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.e = 0L;
        this.f417a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = AnimationUtils.currentAnimationTimeMillis();
    }
}
