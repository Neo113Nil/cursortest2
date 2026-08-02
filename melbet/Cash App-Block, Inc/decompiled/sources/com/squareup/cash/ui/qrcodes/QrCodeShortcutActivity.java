package com.squareup.cash.ui.qrcodes;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import androidx.glance.appwidget.RemoteViewsTranslatorKt;
import androidx.glance.appwidget.SizeBoxKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.shortcut.PinnedShortcutActivity;
import com.squareup.cash.shortcut.PinnedShortcutResult$Success;
import com.squareup.cash.shortcut.QrCodeShortcutBuilder;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes7.dex */
public final class QrCodeShortcutActivity extends PinnedShortcutActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy shortcutBuilder$delegate = LazyKt.lazy(new AlertBannerKt$$ExternalSyntheticLambda0(12));

    @Override // com.squareup.cash.shortcut.PinnedShortcutActivity
    public final SizeBoxKt createShortcutResult(PinnedShortcutActivity pinnedShortcutActivity, ShortcutManager shortcutManager) {
        QrCodeShortcutBuilder qrCodeShortcutBuilder = (QrCodeShortcutBuilder) this.shortcutBuilder$delegate.getValue();
        qrCodeShortcutBuilder.getClass();
        ShortcutInfo build = new ShortcutInfo.Builder(pinnedShortcutActivity, "qr_code_shortcut").setShortLabel(pinnedShortcutActivity.getString(R.string.qr_code_shortcut_short_label)).setLongLabel(pinnedShortcutActivity.getString(R.string.qr_code_shortcut_long_label)).setIcon(Icon.createWithResource(pinnedShortcutActivity, R.drawable.qr_code_shortcut)).setIntent(RemoteViewsTranslatorKt.buildShortcutIntent(pinnedShortcutActivity, zzjm.format(qrCodeShortcutBuilder.clientRouteFormatter, new ClientRoute.ViewQrCode()), qrCodeShortcutBuilder.mainActivityClass)).build();
        build.getClass();
        Intent createShortcutResultIntent = shortcutManager.createShortcutResultIntent(build);
        createShortcutResultIntent.getClass();
        return new PinnedShortcutResult$Success(createShortcutResultIntent);
    }
}
