package com.google.firebase.installations;

import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import defpackage.jt2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface FirebaseInstallationsApi {
    jt2 delete();

    jt2 getId();

    jt2 getToken(boolean z);

    FidListenerHandle registerFidListener(FidListener fidListener);
}
