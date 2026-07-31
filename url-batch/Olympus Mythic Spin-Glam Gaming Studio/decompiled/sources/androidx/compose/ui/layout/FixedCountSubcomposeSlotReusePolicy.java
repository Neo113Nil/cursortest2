package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "", "getSlotsToRetain", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;)V", "", "slotId", "reusableSlotId", "", "areCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "maxSlotsToRetainForReuse", "I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object slotId, Object reusableSlotId) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        if (slotIds.size() > this.maxSlotsToRetainForReuse) {
            Iterator it = slotIds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }
}
