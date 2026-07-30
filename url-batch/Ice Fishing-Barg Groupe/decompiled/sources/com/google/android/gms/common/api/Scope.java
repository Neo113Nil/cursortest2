package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.BUo4iHFctTZi;
import defpackage.POWyO8hTM6YC;
import defpackage.ki0;
import defpackage.u9;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class Scope extends POWyO8hTM6YC implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new BUo4iHFctTZi(14);
    public final String OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;

    public Scope(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            u9.XL4ISE6Oc65B("scopeUri must not be null or empty");
            throw null;
        }
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.OPXfSBeufaJ8.equals(((Scope) obj).OPXfSBeufaJ8);
    }

    public final int hashCode() {
        return this.OPXfSBeufaJ8.hashCode();
    }

    public final String toString() {
        return this.OPXfSBeufaJ8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.KUoIVIumpKat(parcel, 2, this.OPXfSBeufaJ8);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
