package io.appmetrica.analytics.impl;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854ol {

    /* renamed from: a, reason: collision with root package name */
    public static final C0854ol f12531a = new C0854ol();

    private C0854ol() {
    }

    public static final List<C0698il> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new Zo(0));
        if (list == null) {
            return d3.q.f8333a;
        }
        ArrayList arrayList = new ArrayList(d3.k.Y(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer a3 = AndroidUtils.isApiAchieved(29) ? C0880pl.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer b4 = AndroidUtils.isApiAchieved(29) ? C0880pl.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C0698il(a3, b4, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
