package com.chicken.road.kedbags.ui.home;

import com.chicken.road.kedbags.data.model.EggStatus;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoostGateScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/chicken/road/kedbags/ui/home/RoostGateViewModel;", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "<init>", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;)V", "total", "", "getTotal", "()I", "pinnedCount", "exploredCount", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoostGateViewModel {
    public static final int $stable = 8;
    private final TreasureRepository repository;
    private final int total;

    public RoostGateViewModel(TreasureRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.total = repository.getEggs().size();
    }

    public final int getTotal() {
        return this.total;
    }

    public final int pinnedCount() {
        Collection<EggStatus> values = this.repository.getStatuses().getValue().values();
        int i = 0;
        if ((values instanceof Collection) && values.isEmpty()) {
            return 0;
        }
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            if (((EggStatus) it.next()).getPinned() && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public final int exploredCount() {
        Collection<EggStatus> values = this.repository.getStatuses().getValue().values();
        int i = 0;
        if ((values instanceof Collection) && values.isEmpty()) {
            return 0;
        }
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            if (((EggStatus) it.next()).getExplored() && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }
}
