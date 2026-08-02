package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;

/* loaded from: classes9.dex */
public enum CaptureMethod implements Parcelable {
    UPLOAD("upload"),
    MANUAL("manual");

    public static final Parcelable.Creator<CaptureMethod> CREATOR = new HCaptchaStateListener.Creator(21);

    /* renamed from: type, reason: collision with root package name */
    public final String f1449type;

    CaptureMethod(String str) {
        this.f1449type = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
