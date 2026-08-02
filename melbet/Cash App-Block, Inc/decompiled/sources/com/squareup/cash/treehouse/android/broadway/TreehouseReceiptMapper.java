package com.squareup.cash.treehouse.android.broadway;

import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class TreehouseReceiptMapper implements TreehouseScreenMapper {
    public static final Regex Pattern = new Regex("receipt/([^/]+)");

    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    @Override // com.squareup.cash.treehouse.android.broadway.TreehouseScreenMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Screen map(TreehouseScreen treehouseScreen) {
        MatcherMatchResult matchEntire;
        String str;
        List split$default;
        String str2;
        Integer intOrNull;
        ActivityToken activityToken;
        String str3;
        String str4;
        Integer intOrNull2;
        ActivityTokenType fromValue;
        ActivityToken activityToken2;
        String str5;
        Integer intOrNull3;
        ActivityScope activityScope = null;
        if (!Intrinsics.areEqual(treehouseScreen.f1218app, "activity") || (matchEntire = Pattern.matchEntire(treehouseScreen.link)) == null || (str = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(1)) == null) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"?"}, false, 0, 6, null);
        List split$default2 = StringsKt.split$default((String) (1 < split$default.size() ? split$default.get(1) : ""), new char[]{'&'}, 6);
        MapBuilder mapBuilder = new MapBuilder();
        Iterator it = split$default2.iterator();
        while (it.hasNext()) {
            List split$default3 = StringsKt.split$default((String) it.next(), new char[]{'='}, 6);
            mapBuilder.put(split$default3.get(0), 1 < split$default3.size() ? split$default3.get(1) : "");
        }
        MapBuilder build = mapBuilder.build();
        String str6 = (String) split$default.get(0);
        String str7 = (String) build.get("activity_token");
        if (str7 != null && (str2 = (String) build.get("activity_token_type")) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            int intValue = intOrNull.intValue();
            ActivityTokenType.INSTANCE.getClass();
            ActivityTokenType fromValue2 = ActivityTokenType.Companion.fromValue(intValue);
            if (fromValue2 != null) {
                activityToken = new ActivityToken(fromValue2, str7, (String) null, 12);
                str3 = (String) build.get("primary_activity_token");
                if (str3 != null && (str4 = (String) build.get("primary_activity_token_type")) != null && (intOrNull2 = StringsKt.toIntOrNull(str4)) != null) {
                    int intValue2 = intOrNull2.intValue();
                    ActivityTokenType.INSTANCE.getClass();
                    fromValue = ActivityTokenType.Companion.fromValue(intValue2);
                    if (fromValue != null) {
                        activityToken2 = new ActivityToken(fromValue, str3, (String) null, 12);
                        str5 = (String) build.get("activity_scope");
                        if (str5 != null && (intOrNull3 = StringsKt.toIntOrNull(str5)) != null) {
                            int intValue3 = intOrNull3.intValue();
                            ActivityScope.INSTANCE.getClass();
                            activityScope = ActivityScope.Companion.fromValue(intValue3);
                        }
                        return new HistoryScreens.PaymentReceipt(str6, activityToken, activityToken2, activityScope, (String) build.get("locale"), 16);
                    }
                }
                activityToken2 = null;
                str5 = (String) build.get("activity_scope");
                if (str5 != null) {
                    int intValue32 = intOrNull3.intValue();
                    ActivityScope.INSTANCE.getClass();
                    activityScope = ActivityScope.Companion.fromValue(intValue32);
                }
                return new HistoryScreens.PaymentReceipt(str6, activityToken, activityToken2, activityScope, (String) build.get("locale"), 16);
            }
        }
        activityToken = null;
        str3 = (String) build.get("primary_activity_token");
        if (str3 != null) {
            int intValue22 = intOrNull2.intValue();
            ActivityTokenType.INSTANCE.getClass();
            fromValue = ActivityTokenType.Companion.fromValue(intValue22);
            if (fromValue != null) {
            }
        }
        activityToken2 = null;
        str5 = (String) build.get("activity_scope");
        if (str5 != null) {
        }
        return new HistoryScreens.PaymentReceipt(str6, activityToken, activityToken2, activityScope, (String) build.get("locale"), 16);
    }
}
