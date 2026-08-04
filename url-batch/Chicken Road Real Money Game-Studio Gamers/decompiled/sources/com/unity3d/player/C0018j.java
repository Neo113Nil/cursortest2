package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0018j implements OnSuccessListener {
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private Looper b = Looper.myLooper();

    public C0018j(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        if (this.a != null) {
            new Handler(this.b).post(new RunnableC0016i(this.a, num.intValue() == -1));
        }
    }
}
