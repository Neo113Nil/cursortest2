package com.onesignal.notifications.internal.generation;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface INotificationGenerationWorkManager {
    boolean beginEnqueueingWork(Context context, String str, int i2, JSONObject jSONObject, long j2, boolean z, boolean z5);
}
