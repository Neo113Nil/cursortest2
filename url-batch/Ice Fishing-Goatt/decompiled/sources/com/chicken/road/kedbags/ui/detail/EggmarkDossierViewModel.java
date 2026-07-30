package com.chicken.road.kedbags.ui.detail;

import com.chicken.road.kedbags.data.repository.TreasureRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggmarkDossierScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/chicken/road/kedbags/ui/detail/EggmarkDossierViewModel;", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "<init>", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;)V", "setExplored", "", "id", "", "explored", "", "setNote", "note", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EggmarkDossierViewModel {
    public static final int $stable = 8;
    private final TreasureRepository repository;

    public EggmarkDossierViewModel(TreasureRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final void setExplored(int id, boolean explored) {
        this.repository.setExplored(id, explored);
    }

    public final void setNote(int id, String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.repository.setNote(id, note);
    }
}
