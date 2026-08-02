package com.stripe.android.uicore.elements;

import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class OTPController {
    public static final CharRange VALID_INPUT_RANGES = new CharRange('0', '9');
    public String autofillAccumulator = "";
    public final FlowToStateFlow fieldValue;
    public final ArrayList fieldValues;

    public OTPController() {
        int i = 0;
        IntRange until = RangesKt___RangesKt.until(0, 6);
        int i2 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            it.nextInt();
            arrayList.add(FlowKt.MutableStateFlow(""));
        }
        this.fieldValues = arrayList;
        this.fieldValue = new FlowToStateFlow(new OTPController$special$$inlined$combineAsStateFlow$2(i, arrayList), arrayList.isEmpty() ? IblLoaderKt.stateFlowOf(CollectionsKt.joinToString$default(EmptyList.INSTANCE, "", null, null, 0, null, null, 62)) : new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), i2));
    }

    public final int onValueChanged(int i, String str) {
        ArrayList arrayList = this.fieldValues;
        if (str.equals(((StateFlowImpl) ((MutableStateFlow) arrayList.get(i))).getValue())) {
            return 1;
        }
        if (str.length() == 0) {
            StateFlowImpl stateFlowImpl = (StateFlowImpl) ((MutableStateFlow) arrayList.get(i));
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, "");
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (VALID_INPUT_RANGES.contains(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 6) {
            i = 0;
        }
        int min = Math.min(6, sb2.length());
        IntProgressionIterator it = RangesKt___RangesKt.until(0, min).iterator();
        while (it.hasNext) {
            int nextInt = it.nextInt();
            ((StateFlowImpl) ((MutableStateFlow) arrayList.get(i + nextInt))).setValue(String.valueOf(sb2.charAt(nextInt)));
        }
        return min;
    }
}
