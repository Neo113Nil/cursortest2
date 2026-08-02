package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;

/* loaded from: classes9.dex */
public final class DocumentPages implements Parcelable {
    public static final Parcelable.Creator<DocumentPages> CREATOR = new HCaptchaStateListener.Creator(24);
    public final DocumentStartPage documentStartPage;
    public final UploadOptionsDialog uploadOptionsDialog;

    public DocumentPages(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog) {
        documentStartPage.getClass();
        uploadOptionsDialog.getClass();
        this.documentStartPage = documentStartPage;
        this.uploadOptionsDialog = uploadOptionsDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.documentStartPage.writeToParcel(parcel, i);
        this.uploadOptionsDialog.writeToParcel(parcel, i);
    }
}
