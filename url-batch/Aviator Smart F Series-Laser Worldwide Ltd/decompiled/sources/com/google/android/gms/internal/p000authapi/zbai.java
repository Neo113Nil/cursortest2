package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes3.dex */
public final class zbai extends zba {
    zbai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zby zbyVar, BeginSignInRequest beginSignInRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbyVar);
        zbc.zbc(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(zbab zbabVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbabVar);
        zbc.zbc(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbad zbadVar, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbadVar);
        zbc.zbc(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbf(IStatusCallback iStatusCallback, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
