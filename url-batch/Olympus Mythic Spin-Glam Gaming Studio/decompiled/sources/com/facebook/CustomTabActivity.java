package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.notification.NotificationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CustomTabActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "()V", "closeReceiver", "Landroid/content/BroadcastReceiver;", "onActivityResult", "", NotificationRequest.REQUEST_CODE_KEY, "", X3.f.f, "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomTabActivity extends Activity {
    private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;

    @Nullable
    private BroadcastReceiver closeReceiver;

    @NotNull
    public static final String CUSTOM_TAB_REDIRECT_ACTION = Intrinsics.stringPlus(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    @NotNull
    public static final String DESTROY_ACTION = Intrinsics.stringPlus(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.facebook", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(CUSTOM_TAB_REDIRECT_ACTION);
        intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            Intent intent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
            intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@NotNull Context context, @NotNull Intent intent2) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent2, "intent");
                    CustomTabActivity.this.finish();
                }
            };
            LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new IntentFilter(DESTROY_ACTION));
            this.closeReceiver = broadcastReceiver;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.closeReceiver;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }
}
