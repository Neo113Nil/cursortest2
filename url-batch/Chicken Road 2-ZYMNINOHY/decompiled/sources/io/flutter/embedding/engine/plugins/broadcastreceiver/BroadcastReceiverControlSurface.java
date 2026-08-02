package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.lifecycle.AbstractC0231j;

/* loaded from: classes.dex */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, AbstractC0231j abstractC0231j);

    void detachFromBroadcastReceiver();
}
