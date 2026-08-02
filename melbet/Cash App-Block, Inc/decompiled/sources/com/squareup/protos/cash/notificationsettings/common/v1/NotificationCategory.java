package com.squareup.protos.cash.notificationsettings.common.v1;

import com.plaid.internal.EnumC0170g;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum NotificationCategory implements WireEnum {
    NOTIFICATION_CATEGORY_UNSPECIFIED(0),
    NOTIFICATION_CATEGORY_SPECIAL_SILENT_PUSH(10),
    NOTIFICATION_CATEGORY_SPECIAL_VOICE_CALL(11),
    NOTIFICATION_CATEGORY_ACCOUNT_SECURITY(100),
    NOTIFICATION_CATEGORY_ACCOUNT_NOTICES(101),
    NOTIFICATION_CATEGORY_ACCOUNT_CHANGES(102),
    NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS(200),
    NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE),
    NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS(EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE),
    NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE),
    NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS(EnumC0170g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE),
    NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE),
    NOTIFICATION_CATEGORY_MARKETING_CASH_APP_NEWS(400),
    NOTIFICATION_CATEGORY_MARKETING_OFFERS(HttpStatusCode.UNAUTHORIZED_401),
    NOTIFICATION_CATEGORY_MARKETING_EXCLUSIVES(402),
    NOTIFICATION_CATEGORY_MARKETING_CASH_APP_LOCAL(403),
    NOTIFICATION_CATEGORY_CASH_APP_TAXES(500),
    NOTIFICATION_CATEGORY_FAMILY(600),
    NOTIFICATION_CATEGORY_MONEYBOT_ALERTS(700),
    NOTIFICATION_CATEGORY_MONEYBOT_RECOMMENDATIONS(701),
    NOTIFICATION_CATEGORY_MONEYBOT_PROGRESS_UPDATES(702);

    public static final NotificationCategory$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        NotificationCategory notificationCategory = NOTIFICATION_CATEGORY_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new NotificationCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationCategory.class), Syntax.PROTO_2, notificationCategory);
    }

    NotificationCategory(int i) {
        this.value = i;
    }

    public static final NotificationCategory fromValue(int i) {
        Companion.getClass();
        return Origin.Companion.m3886fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
