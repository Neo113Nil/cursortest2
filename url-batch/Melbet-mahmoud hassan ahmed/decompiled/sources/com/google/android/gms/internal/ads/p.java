package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements b81 {
    public static final Parcelable.Creator<p> CREATOR = new n();

    /* renamed from: f, reason: collision with root package name */
    public final float f9961f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9962g;

    public p(float f7, int i7) {
        this.f9961f = f7;
        this.f9962g = i7;
    }

    /* synthetic */ p(Parcel parcel, o oVar) {
        this.f9961f = parcel.readFloat();
        this.f9962g = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.b81
    public final /* synthetic */ void b(ds dsVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f9961f == pVar.f9961f && this.f9962g == pVar.f9962g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9961f).hashCode() + 527) * 31) + this.f9962g;
    }

    public final String toString() {
        float f7 = this.f9961f;
        int i7 = this.f9962g;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f7);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i7);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f9961f);
        parcel.writeInt(this.f9962g);
    }
}
