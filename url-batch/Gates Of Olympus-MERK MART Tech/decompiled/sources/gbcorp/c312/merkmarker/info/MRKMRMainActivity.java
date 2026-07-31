package gbcorp.c312.merkmarker.info;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import gbcorp.c312.merkmarker.info.worker.GTSLYVisitRequestWorker;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRMainActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0002J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lgbcorp/c312/merkmarker/info/MRKMRMainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "handleNotificationIntent", "currentIntent", "scheduleClickTracking", "pushId", "", "linkUrl", "openExternalBrowser", "uri", "Landroid/net/Uri;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRMainActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MRKMRMainActivity mRKMRMainActivity = this;
        EdgeToEdge.enable$default(mRKMRMainActivity, SystemBarStyle.INSTANCE.dark(ColorKt.m5447toArgb8_81llA(gbcorp.c312.merkmarker.info.ui.theme.ColorKt.getForestGreen())), null, 2, null);
        ComponentActivityKt.setContent$default(mRKMRMainActivity, null, ComposableSingletons$MRKMRMainActivityKt.INSTANCE.m9475getLambda$54678455$app_release(), 1, null);
        Intent intent = getIntent();
        if (intent != null) {
            handleNotificationIntent(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleNotificationIntent(intent);
    }

    private final void handleNotificationIntent(Intent currentIntent) {
        if (currentIntent.getBooleanExtra("ARG_FROM_NOTIFICATION", false)) {
            currentIntent.removeExtra("ARG_FROM_NOTIFICATION");
            String stringExtra = currentIntent.getStringExtra("KEY_PUSH_ID");
            if (stringExtra == null) {
                stringExtra = "unknown_id";
            }
            String stringExtra2 = currentIntent.getStringExtra("KEY_LINK_URL");
            Uri data = currentIntent.getData();
            if (data != null) {
                scheduleClickTracking(stringExtra, stringExtra2);
                currentIntent.setData(null);
                openExternalBrowser(data);
                return;
            }
            scheduleClickTracking(stringExtra, null);
        }
    }

    private final void scheduleClickTracking(String pushId, String linkUrl) {
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Pair[] pairArr = {TuplesKt.to("KEY_PUSH_ID", pushId), TuplesKt.to("KEY_LINK_URL", linkUrl)};
        Data.Builder builder = new Data.Builder();
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            builder.put((String) pair.getFirst(), pair.getSecond());
        }
        OneTimeWorkRequest build2 = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) GTSLYVisitRequestWorker.class).setInputData(builder.build()).setConstraints(build).build();
        WorkManager.Companion companion = WorkManager.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.getInstance(applicationContext).enqueue(build2);
    }

    private final void openExternalBrowser(Uri uri) {
        try {
            Intent createChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", uri), "Open link with:");
            createChooser.setFlags(268435456);
            startActivity(createChooser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
