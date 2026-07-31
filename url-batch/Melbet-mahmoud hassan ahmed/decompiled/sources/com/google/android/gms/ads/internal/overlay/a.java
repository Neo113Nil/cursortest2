package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;
import com.google.android.gms.internal.ads.po0;
import s3.b;
import y2.j;
import z2.f;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int u6 = b.u(parcel);
        f fVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        po0 po0Var = null;
        String str4 = null;
        j jVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = b.o(parcel);
            switch (b.l(o7)) {
                case 2:
                    fVar = (f) b.e(parcel, o7, f.CREATOR);
                    break;
                case 3:
                    iBinder = b.p(parcel, o7);
                    break;
                case 4:
                    iBinder2 = b.p(parcel, o7);
                    break;
                case 5:
                    iBinder3 = b.p(parcel, o7);
                    break;
                case 6:
                    iBinder4 = b.p(parcel, o7);
                    break;
                case w0.f2149o /* 7 */:
                    str = b.f(parcel, o7);
                    break;
                case w0.f2150p /* 8 */:
                    z6 = b.m(parcel, o7);
                    break;
                case 9:
                    str2 = b.f(parcel, o7);
                    break;
                case 10:
                    iBinder5 = b.p(parcel, o7);
                    break;
                case 11:
                    i7 = b.q(parcel, o7);
                    break;
                case 12:
                    i8 = b.q(parcel, o7);
                    break;
                case 13:
                    str3 = b.f(parcel, o7);
                    break;
                case 14:
                    po0Var = (po0) b.e(parcel, o7, po0.CREATOR);
                    break;
                case 15:
                default:
                    b.t(parcel, o7);
                    break;
                case 16:
                    str4 = b.f(parcel, o7);
                    break;
                case 17:
                    jVar = (j) b.e(parcel, o7, j.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.p(parcel, o7);
                    break;
                case 19:
                    str5 = b.f(parcel, o7);
                    break;
                case 20:
                    iBinder7 = b.p(parcel, o7);
                    break;
                case 21:
                    iBinder8 = b.p(parcel, o7);
                    break;
                case 22:
                    iBinder9 = b.p(parcel, o7);
                    break;
                case 23:
                    iBinder10 = b.p(parcel, o7);
                    break;
                case 24:
                    str6 = b.f(parcel, o7);
                    break;
                case 25:
                    str7 = b.f(parcel, o7);
                    break;
                case 26:
                    iBinder11 = b.p(parcel, o7);
                    break;
                case 27:
                    iBinder12 = b.p(parcel, o7);
                    break;
            }
        }
        b.k(parcel, u6);
        return new AdOverlayInfoParcel(fVar, iBinder, iBinder2, iBinder3, iBinder4, str, z6, str2, iBinder5, i7, i8, str3, po0Var, str4, jVar, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i7) {
        return new AdOverlayInfoParcel[i7];
    }
}
