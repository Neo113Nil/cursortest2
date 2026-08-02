package com.squareup.cash.work.tinygraph.models;

import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes7.dex */
public abstract class MerchantKt {
    public static final LocalText access$withPrefixIfNeeded(LocalText localText, OrderStatus orderStatus, Fulfillment fulfillment, Function1 function1) {
        String str;
        String str2 = orderStatus != null ? orderStatus.currentStatusFulfillmentLabel : null;
        if (str2 == null || StringsKt.isBlank(str2)) {
            if (fulfillment != null && DateTimesKt.hasFriendlyEstimatedTimeText(fulfillment)) {
                return localText;
            }
            if (localText != null && (str = localText.text) != null) {
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    return LocalTextsKt.toLocalText((String) function1.invoke(str));
                }
            }
        }
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCashBalance.deepLinkSpecs;
    }

    public static final String getInitials(Merchant merchant) {
        String str;
        String valueOf;
        merchant.getClass();
        String name = getName(merchant);
        String str2 = "";
        if (name == null) {
            return "";
        }
        List split = new Regex("\\s+").split(0, name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            if (arrayList.isEmpty()) {
                return "";
            }
            String upperCase = StringsKt___StringsKt.take(2, (String) arrayList.get(0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return upperCase;
        }
        Character firstOrNull = StringsKt___StringsKt.firstOrNull((CharSequence) arrayList.get(0));
        if (firstOrNull == null || (str = String.valueOf(firstOrNull.charValue())) == null) {
            str = "";
        }
        Character firstOrNull2 = StringsKt___StringsKt.firstOrNull((CharSequence) arrayList.get(1));
        if (firstOrNull2 != null && (valueOf = String.valueOf(firstOrNull2.charValue())) != null) {
            str2 = valueOf;
        }
        String upperCase2 = str.concat(str2).toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase2;
    }

    public static final String getName(Merchant merchant) {
        Names names;
        Name name;
        merchant.getClass();
        com.squareup.protos.wire.roster.mds.Merchant merchant2 = (com.squareup.protos.wire.roster.mds.Merchant) merchant.protoModel$delegate.getValue();
        if (merchant2 == null || (names = merchant2.name) == null || (name = names.primary) == null) {
            return null;
        }
        return name.value;
    }
}
