package com.unity.services.pushnotifications.android;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* loaded from: classes2.dex */
public class UnityFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "PUSH NOTIFICATION";
    private static final String defaultChannelId = "com.unity.services.pushnotifications.android.default";

    private void SendPushNotification(RemoteMessage remoteMessage) {
        UnityPushNotifications.getUnityPushNotificationImpl(getApplicationContext()).sendPushNotification(remoteMessage, defaultChannelId);
    }

    private boolean isSenderIdValid(String str) {
        String string = getApplicationContext().getSharedPreferences(UnityPushNotifications.SHARED_PREFERENCE, 0).getString(UnityPushNotifications.SENDER_ID, "");
        if (string.equals("")) {
            Log.w(TAG, "Stored sender ID not present, notification will be ignored - have you initialised the SDK?");
            return false;
        }
        if (str == null) {
            Log.w(TAG, "Message sender is unknown, notification will be ignored");
            return false;
        }
        if (string.equals(str)) {
            return true;
        }
        Log.w(TAG, "Message sender doesn't match stored sender ID, notification will be ignored");
        return false;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "Notification received by the Unity Push Notifications SDK");
        Log.d(TAG, String.format("Notification body: %s", remoteMessage.getData().toString()));
        Map<String, String> data = remoteMessage.getData();
        if (isSenderIdValid(remoteMessage.getFrom())) {
            if (data.isEmpty()) {
                Log.w(TAG, "Push: Message data is empty, defaulting to basic notification display");
            } else {
                SendPushNotification(remoteMessage);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        super.onNewToken(str);
    }
}
