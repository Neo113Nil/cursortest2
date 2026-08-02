package com.valentinilk.shimmer;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBooleanKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils;
import defpackage.JsonLogicEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class ShimmerThemeKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ShimmerThemeKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        JsonLogicEngine jsonLogicEngine_delegate$lambda$0;
        switch (this.$r8$classId) {
            case 10:
                try {
                    Object newInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventReceiver").getConstructor(null).newInstance(null);
                    newInstance.getClass();
                    break;
                } catch (Exception unused) {
                    return null;
                }
            case 15:
                IdConfig.Side[] values = IdConfig.Side.values();
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (IdConfig.Side side : values) {
                    linkedHashMap.put(side.key, side);
                }
                break;
            case 20:
                jsonLogicEngine_delegate$lambda$0 = JsonLogicBooleanKt.jsonLogicEngine_delegate$lambda$0();
                break;
            case 27:
                Option option = CountryCodeUtils.toOption(CountryCodeUtils.usCountryCodeMetadata);
                Map map = CountryCodeUtils.countryCodeToCountryMetadata;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.areEqual((String) entry.getKey(), option.value)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(CountryCodeUtils.toOption((CountryCodeMetadata) ((Map.Entry) it.next()).getValue()));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
