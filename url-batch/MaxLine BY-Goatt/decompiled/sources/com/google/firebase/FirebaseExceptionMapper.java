package com.google.firebase;

import com.google.android.gms.common.api.Status;
import defpackage.fp2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseExceptionMapper implements fp2 {
    @Override // defpackage.fp2
    public final Exception getException(Status status) {
        return status.m == 8 ? new FirebaseException(status.a()) : new FirebaseApiNotAvailableException(status.a());
    }
}
