package com.stripe.android.uicore.elements;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes8.dex */
public final class OTPController$special$$inlined$combineAsStateFlow$2 implements Function0 {
    public final ArrayList $flows;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OTPController$special$$inlined$combineAsStateFlow$2(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.$flows = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.$flows;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((StateFlow) it.next()).getValue());
                }
                return CollectionsKt.joinToString$default(arrayList2, "", null, null, 0, null, null, 62);
            case 1:
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StateFlow) it2.next()).getValue());
                }
                return arrayList3;
            default:
                return arrayList;
        }
    }
}
