package io.appmetrica.analytics.impl;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835sl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0835sl f8324a = new C0835sl();

    private C0835sl() {
    }

    public static final List<C0680ml> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new Y1.M(21));
        if (list == null) {
            return c2.m.f2637a;
        }
        ArrayList arrayList = new ArrayList(c2.g.N(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a3 = AndroidUtils.isApiAchieved(29) ? C0861tl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b3 = AndroidUtils.isApiAchieved(29) ? C0861tl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C0680ml(a3, b3, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
