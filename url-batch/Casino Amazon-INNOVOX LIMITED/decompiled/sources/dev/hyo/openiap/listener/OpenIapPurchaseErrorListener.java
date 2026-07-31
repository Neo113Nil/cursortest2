package dev.hyo.openiap.listener;

import com.google.firebase.messaging.Constants;
import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;

/* compiled from: OpenIapListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;", "", "onPurchaseError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ldev/hyo/openiap/OpenIapError;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OpenIapPurchaseErrorListener {
    void onPurchaseError(OpenIapError error);
}
