package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
final class zzaff implements OnFailureListener {
    zzaff(zzafd zzafdVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzafd.zza;
        logger.e("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
