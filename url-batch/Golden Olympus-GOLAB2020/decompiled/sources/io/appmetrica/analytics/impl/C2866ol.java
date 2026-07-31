package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.google.android.gms.common.ConnectionResult;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
@TargetApi(ConnectionResult.API_DISABLED)
/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2866ol {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2866ol f39588a = new C2866ol();

    private C2866ol() {
    }

    @NotNull
    public static final List<C2710il> a(@NotNull Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.sp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                List a4;
                a4 = C2866ol.a((SubscriptionManager) obj);
                return a4;
            }
        });
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a4 = AndroidUtils.isApiAchieved(29) ? C2892pl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b4 = AndroidUtils.isApiAchieved(29) ? C2892pl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z4 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C2710il(a4, b4, z4, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
