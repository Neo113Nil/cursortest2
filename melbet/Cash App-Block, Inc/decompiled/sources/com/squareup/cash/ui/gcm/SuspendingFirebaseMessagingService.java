package com.squareup.cash.ui.gcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public abstract class SuspendingFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new ExoPlayerVideoView.AnonymousClass2(this, null, 12));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new TaxWebAppBridge.AnonymousClass3(this, remoteMessage, (Continuation) null, 25));
    }

    public Object onMessageReceivedSuspend(RemoteMessage remoteMessage, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageSent(String str) {
        str.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new SuspendingFirebaseMessagingService$onNewToken$1(this, str, null, 1));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new SuspendingFirebaseMessagingService$onNewToken$1(this, str, null, 0));
    }

    public Object onNewTokenSuspend(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onSendError(String str, Exception exc) {
        str.getClass();
        exc.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new TaxWebAppBridge.AnonymousClass4(this, str, exc, null, 29));
    }
}
