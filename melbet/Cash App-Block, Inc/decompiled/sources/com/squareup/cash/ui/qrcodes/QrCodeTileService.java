package com.squareup.cash.ui.qrcodes;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import androidx.glance.appwidget.RemoteViewsTranslatorKt;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.ClientRouteSpec;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealUriFormatter;
import com.squareup.cash.ui.MainActivity;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public final class QrCodeTileService extends TileService {
    public static final /* synthetic */ int $r8$clinit = 0;

    public final void launch(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            startActivityAndCollapse(PendingIntent.getActivity(this, 0, intent, 201326592));
        } else {
            startActivityAndCollapse(intent);
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        super.onClick();
        ClientRoutesConfig.standard.getClass();
        ClientRoute.ViewQrCode viewQrCode = new ClientRoute.ViewQrCode();
        ClientRouteSpec clientRouteSpec = viewQrCode.spec$1;
        clientRouteSpec.getClass();
        EmptyMap emptyMap = viewQrCode.parameters;
        emptyMap.getClass();
        String format2 = RealUriFormatter.format("https", "internal.cash.app", clientRouteSpec.pathFormat, clientRouteSpec.parameterNames, emptyMap, null, clientRouteSpec.accountRequirement);
        format2.getClass();
        Intent buildShortcutIntent = RemoteViewsTranslatorKt.buildShortcutIntent(this, format2, Reflection.factory.getOrCreateKotlinClass(MainActivity.class));
        if (isLocked()) {
            unlockAndRun(new r6$$ExternalSyntheticLambda0(12, this, buildShortcutIntent));
        } else {
            launch(buildShortcutIntent);
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(2);
            qsTile.setLabel(getString(R.string.qr_code_tile_label));
            qsTile.setIcon(Icon.createWithResource(this, R.drawable.ic_qr_code_tile));
            qsTile.updateTile();
        }
    }
}
