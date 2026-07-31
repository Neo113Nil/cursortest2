package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.OneSignalInternalActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationOpenedActivityHMS.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/onesignal/NotificationOpenedActivityHMS;", "Landroid/app/Activity;", "Lcom/onesignal/core/internal/application/OneSignalInternalActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "processIntent", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationOpenedActivityHMS extends Activity implements OneSignalInternalActivity {
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        processIntent();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        processIntent();
    }

    private final void processIntent() {
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnDefault(new NotificationOpenedActivityHMS$processIntent$1(this, null));
    }
}
