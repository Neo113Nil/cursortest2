package com.squareup.util.android;

import android.content.ActivityNotFoundException;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry$register$2;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class SimpleActivityForResultLauncher {
    public final ComponentActivity activity;
    public final ActivityResultRegistry$register$2 launcher;
    public final BufferedChannel result;

    public SimpleActivityForResultLauncher(ComponentActivity componentActivity, String str) {
        this.activity = componentActivity;
        BufferedChannel Channel$default = PapaEvent.Channel$default(1, null, null, 6);
        this.result = Channel$default;
        this.launcher = componentActivity.getActivityResultRegistry().register(str, contract(componentActivity), new SimpleActivityForResultLauncher$launcher$1(Channel$default));
    }

    public abstract ActivityResultContract contract(ComponentActivity componentActivity);

    public final Object getResult(ContinuationImpl continuationImpl) {
        BufferedChannel bufferedChannel = this.result;
        bufferedChannel.getClass();
        return BufferedChannel.receive$suspendImpl(bufferedChannel, continuationImpl);
    }

    public final void tryLaunch(Object obj) {
        obj.getClass();
        try {
            if (this.result.isEmpty()) {
                this.launcher.launch(obj);
            }
        } catch (Exception e) {
            if (!(e instanceof SecurityException) && !(e instanceof ActivityNotFoundException)) {
                throw e;
            }
            ToastKt.toast(this.activity, R.string.no_intent_handler, 1);
        }
    }
}
