package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045k implements OnCompleteListener {
    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            FirebaseIdentifiersHelper.nativeOnFirebaseAppInstanceIdResult((String) task.getResult());
        } else {
            FirebaseIdentifiersHelper.nativeOnFirebaseAppInstanceIdResult(null);
        }
    }
}
