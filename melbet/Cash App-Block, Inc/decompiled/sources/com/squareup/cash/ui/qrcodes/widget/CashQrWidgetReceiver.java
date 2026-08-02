package com.squareup.cash.ui.qrcodes.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.glance.appwidget.CoroutineBroadcastReceiverKt;
import androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1;
import androidx.paging.FlowExtKt$simpleScan$1;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class CashQrWidgetReceiver extends AppWidgetProvider {
    public final DefaultScheduler coroutineContext = Dispatchers.Default;
    public final CashQrWidget glanceAppWidget = new CashQrWidget();

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        CoroutineBroadcastReceiverKt.goAsync(this, this.coroutineContext, new BufferCountKt$bufferSkip$1(this, context, i, bundle, (Continuation) null, 1));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        CoroutineBroadcastReceiverKt.goAsync(this, this.coroutineContext, new GlanceAppWidgetReceiver$onDeleted$1(this, context, iArr, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x00a7, CancellationException -> 0x00b0, TryCatch #2 {CancellationException -> 0x00b0, all -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:28:0x00a3, B:30:0x006e, B:32:0x0080, B:34:0x008b, B:35:0x0097, B:37:0x0093, B:38:0x009b, B:39:0x00a2, B:40:0x0063), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x00a7, CancellationException -> 0x00b0, TryCatch #2 {CancellationException -> 0x00b0, all -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:28:0x00a3, B:30:0x006e, B:32:0x0080, B:34:0x008b, B:35:0x0097, B:37:0x0093, B:38:0x009b, B:39:0x00a2, B:40:0x0063), top: B:2:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        CashQrWidgetReceiver cashQrWidgetReceiver;
        Context context2;
        String canonicalName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -19011148) {
                    cashQrWidgetReceiver = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        super.onReceive(context2, intent);
                    }
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context2);
                    String packageName = context2.getPackageName();
                    canonicalName = cashQrWidgetReceiver.getClass().getCanonicalName();
                    if (canonicalName != null) {
                    }
                } else {
                    if (hashCode == 649033583) {
                        cashQrWidgetReceiver = this;
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                            super.onReceive(context2, intent);
                        }
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context2);
                        String packageName2 = context2.getPackageName();
                        canonicalName = cashQrWidgetReceiver.getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        ComponentName componentName = new ComponentName(packageName2, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            appWidgetIds.getClass();
                        } else {
                            appWidgetIds = appWidgetManager2.getAppWidgetIds(componentName);
                        }
                        cashQrWidgetReceiver.onUpdate(context2, appWidgetManager2, appWidgetIds);
                        return;
                    }
                    if (hashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        CoroutineBroadcastReceiverKt.goAsync(this, this.coroutineContext, new BufferCountKt$bufferSkip$1(this, context, intExtra, stringExtra, (Continuation) null, 2));
                        return;
                    }
                }
            }
            cashQrWidgetReceiver = this;
            context2 = context;
            super.onReceive(context2, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        CoroutineBroadcastReceiverKt.goAsync(this, this.coroutineContext, new FlowExtKt$simpleScan$1(this, context, iArr, null, 19));
    }
}
