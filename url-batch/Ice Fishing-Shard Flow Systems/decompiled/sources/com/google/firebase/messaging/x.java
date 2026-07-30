package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class x extends AbstractC0943a {
    public static final Parcelable.Creator<x> CREATOR = new I1.c(10);

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f4533d;

    public x(Bundle bundle) {
        this.f4533d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.H(parcel, 2, this.f4533d);
        AbstractC1053a.S(parcel, Q);
    }
}
