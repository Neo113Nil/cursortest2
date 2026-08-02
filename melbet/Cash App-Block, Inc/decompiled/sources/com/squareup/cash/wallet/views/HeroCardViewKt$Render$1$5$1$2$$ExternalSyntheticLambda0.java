package com.squareup.cash.wallet.views;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SnapshotStateList f$0;

    public /* synthetic */ HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0(CardLockPresenter cardLockPresenter, SnapshotStateList snapshotStateList) {
        this.$r8$classId = 1;
        this.f$0 = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SnapshotStateList snapshotStateList = this.f$0;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                Iterator it = snapshotStateList.iterator();
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) it;
                    if (!stateListIterator.hasNext()) {
                        return arrayList;
                    }
                    arrayList.add(((InteractiveCardState) stateListIterator.next()).toPanEntity());
                }
            case 1:
                return CardLockPresenter.sumOfAmount(snapshotStateList);
            default:
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                Iterator it2 = snapshotStateList.iterator();
                while (true) {
                    StateListIterator stateListIterator2 = (StateListIterator) it2;
                    if (!stateListIterator2.hasNext()) {
                        return arrayList2;
                    }
                    arrayList2.add(((InteractiveCardState) stateListIterator2.next()).toPanEntity());
                }
        }
    }

    public /* synthetic */ HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0(SnapshotStateList snapshotStateList, int i) {
        this.$r8$classId = i;
        this.f$0 = snapshotStateList;
    }
}
