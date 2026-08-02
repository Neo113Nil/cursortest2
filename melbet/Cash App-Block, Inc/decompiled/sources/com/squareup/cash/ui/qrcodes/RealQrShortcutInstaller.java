package com.squareup.cash.ui.qrcodes;

import android.app.StatusBarManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.squareup.cash.R;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class RealQrShortcutInstaller implements QrShortcutInstaller {
    public final Context context;

    public RealQrShortcutInstaller(Context context) {
        this.context = context;
    }

    public final boolean isWidgetPinSupported() {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.context);
            boolean z = false;
            if (appWidgetManager != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
                z = true;
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    public final void requestAddTile() {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        Context context = this.context;
        StatusBarManager statusBarManager = (StatusBarManager) context.getSystemService(StatusBarManager.class);
        if (statusBarManager == null) {
            return;
        }
        statusBarManager.requestAddTileService(new ComponentName(context, (Class<?>) QrCodeTileService.class), context.getString(R.string.qr_code_tile_label), Icon.createWithResource(context, R.drawable.ic_qr_code_tile), context.getMainExecutor(), new RealQrShortcutInstaller$$ExternalSyntheticLambda0());
    }

    public final void requestPinWidget() {
        Context context = this.context;
        try {
            Result.Companion companion = Result.Companion;
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
                appWidgetManager.requestPinAppWidget(new ComponentName(context, (Class<?>) CashQrWidgetReceiver.class), null, null);
            }
        } catch (Throwable unused) {
            Result.Companion companion2 = Result.Companion;
        }
    }
}
