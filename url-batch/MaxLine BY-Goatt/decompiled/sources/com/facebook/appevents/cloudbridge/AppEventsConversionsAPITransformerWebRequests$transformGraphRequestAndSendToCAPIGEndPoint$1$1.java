package com.facebook.appevents.cloudbridge;

import com.facebook.internal.Utility;
import defpackage.o81;
import defpackage.zv;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends o81 implements Function2<String, Integer, Unit> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Integer num, List list) {
        HashSet hashSet;
        list.getClass();
        hashSet = AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE;
        if (zv.q(hashSet, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, list, 5);
    }

    public final void invoke(String str, final Integer num) {
        final List<Map<String, Object>> list = this.$processedEvents;
        Utility.runOnNonUiThread(new Runnable() { // from class: com.facebook.appevents.cloudbridge.a
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1.invoke$lambda$0(num, list);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Integer) obj2);
        return Unit.a;
    }
}
