package com.squareup.cash.ui.bitcoin;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import androidx.glance.appwidget.RemoteViewsTranslatorKt;
import androidx.glance.appwidget.SizeBoxKt;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.AccountRequirement;
import com.squareup.cash.clientroutes.ClientRouteSpec;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.clientroutes.RealUriFormatter;
import com.squareup.cash.shortcut.BitcoinShortcutBuilder;
import com.squareup.cash.shortcut.PinnedShortcutActivity;
import com.squareup.cash.shortcut.PinnedShortcutResult$Failure;
import com.squareup.cash.shortcut.PinnedShortcutResult$Success;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class BitcoinShortcutActivity extends PinnedShortcutActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy shortcutBuilder$delegate = LazyKt.lazy(new AlertBannerKt$$ExternalSyntheticLambda0(11));

    @Override // com.squareup.cash.shortcut.PinnedShortcutActivity
    public final SizeBoxKt createShortcutResult(PinnedShortcutActivity pinnedShortcutActivity, ShortcutManager shortcutManager) {
        BitcoinShortcutBuilder bitcoinShortcutBuilder = (BitcoinShortcutBuilder) this.shortcutBuilder$delegate.getValue();
        bitcoinShortcutBuilder.getClass();
        BinaryBitmap binaryBitmap = bitcoinShortcutBuilder.deepLinkFormatter;
        DeepLinkSpec deepLinkSpec = DeepLinkSpec.viewBitcoin_widgetBitcoin;
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("ORIGIN", "WIDGET"), new Pair("WIDGET_KIND", "BITCOIN_SHORTCUT_WIDGET"), new Pair("WIDGET_FAMILY", "CIRCULAR"));
        deepLinkSpec.getClass();
        RealUriFormatter realUriFormatter = (RealUriFormatter) binaryBitmap.matrix;
        DeepLinksConfig deepLinksConfig = (DeepLinksConfig) binaryBitmap.binarizer;
        String str = (String) CollectionsKt.first(deepLinksConfig.webProtocols);
        String str2 = (String) CollectionsKt.first(deepLinksConfig.hosts);
        String str3 = deepLinkSpec.pathFormat;
        ClientRouteSpec clientRouteSpec = deepLinkSpec.clientRouteSpec;
        List list = clientRouteSpec.parameterNames;
        AccountRequirement accountRequirement = clientRouteSpec.accountRequirement;
        realUriFormatter.getClass();
        String format2 = RealUriFormatter.format(str, str2, str3, list, mapOf, null, accountRequirement);
        if (format2 == null) {
            Timber.Forest.e("Failed to format deep link for Bitcoin shortcut", new Object[0]);
            return new PinnedShortcutResult$Failure();
        }
        ShortcutInfo build = new ShortcutInfo.Builder(pinnedShortcutActivity, "bitcoin_home_shortcut").setShortLabel(pinnedShortcutActivity.getString(R.string.bitcoin_shortcut_short_label)).setLongLabel(pinnedShortcutActivity.getString(R.string.bitcoin_shortcut_long_label)).setIcon(Icon.createWithResource(pinnedShortcutActivity, R.mipmap.bitcoin_shortcut_icon)).setIntent(RemoteViewsTranslatorKt.buildShortcutIntent(pinnedShortcutActivity, format2, bitcoinShortcutBuilder.mainActivityClass)).build();
        build.getClass();
        Intent createShortcutResultIntent = shortcutManager.createShortcutResultIntent(build);
        createShortcutResultIntent.getClass();
        return new PinnedShortcutResult$Success(createShortcutResultIntent);
    }
}
