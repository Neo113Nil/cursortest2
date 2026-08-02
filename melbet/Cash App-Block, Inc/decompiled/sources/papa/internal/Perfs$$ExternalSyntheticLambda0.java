package papa.internal;

import android.os.Build;
import android.os.SystemClock;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.TestTagKt;
import com.appsflyer.internal.AFj1sSDK;
import com.squareup.cash.CashApp;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import papa.AppStart$AppStartData;

/* loaded from: classes3.dex */
public final /* synthetic */ class Perfs$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Perfs$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Perfs.firstPostUptimeMillis = Long.valueOf(SystemClock.uptimeMillis());
                AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
                if (appStart$AppStartData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                    throw null;
                }
                long uptimeMillis = SystemClock.uptimeMillis() - appStart$AppStartData.processStartUptimeMillis;
                AppStart$AppStartData appStart$AppStartData2 = Perfs.appStartData;
                if (appStart$AppStartData2 != null) {
                    Perfs.appStartData = AppStart$AppStartData.copy$default(appStart$AppStartData2, null, null, Long.valueOf(uptimeMillis), null, null, null, null, null, null, null, null, null, null, null, -262145);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                    throw null;
                }
            case 1:
                MutableObjectList mutableObjectList = AndroidComposeView.composeViews;
                synchronized (mutableObjectList) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = mutableObjectList.content;
                        int i2 = mutableObjectList._size;
                        final int i3 = 0;
                        if (i < 30) {
                            for (int i4 = 0; i4 < i2; i4++) {
                                final AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i4];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.systemPropertiesClass;
                                androidComposeView.setShowLayoutBounds(TestTagKt.getIsShowingLayoutBounds());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5 = i3;
                                            AndroidComposeView androidComposeView2 = androidComposeView;
                                            switch (i5) {
                                                case 0:
                                                    AndroidComposeView.invalidateLayers(androidComposeView2.root);
                                                    break;
                                                default:
                                                    AndroidComposeView.invalidateLayers(androidComposeView2.root);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            while (i3 < i2) {
                                final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i3];
                                final int i5 = 1;
                                androidComposeView2.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i52 = i5;
                                        AndroidComposeView androidComposeView22 = androidComposeView2;
                                        switch (i52) {
                                            case 0:
                                                AndroidComposeView.invalidateLayers(androidComposeView22.root);
                                                break;
                                            default:
                                                AndroidComposeView.invalidateLayers(androidComposeView22.root);
                                                break;
                                        }
                                    }
                                });
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                AFj1sSDK.AFAdRevenueData();
                return;
            case 3:
                CashApp.onCreate$lambda$4();
                return;
            case 4:
                throw new IllegalStateException("shouldn't reach here");
            default:
                Utf8.enableOnMainThread();
                return;
        }
    }
}
