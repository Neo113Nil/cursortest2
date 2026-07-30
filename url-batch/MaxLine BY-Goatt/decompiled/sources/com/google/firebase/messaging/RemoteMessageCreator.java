package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tk3;
import defpackage.yk3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.T(parcel, 2, remoteMessage.bundle);
        yk3.c0(parcel, b0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        int j0 = tk3.j0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < j0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                tk3.f0(parcel, readInt);
            } else {
                bundle = tk3.E(parcel, readInt);
            }
        }
        tk3.L(parcel, j0);
        return new RemoteMessage(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
