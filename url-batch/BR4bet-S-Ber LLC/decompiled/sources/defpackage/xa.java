package defpackage;

import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xa implements ab {
    public final /* synthetic */ ChipGroup f;

    public /* synthetic */ xa(ChipGroup chipGroup) {
        this.f = chipGroup;
    }

    @Override // defpackage.ab
    public void a(ChipGroup chipGroup, ArrayList arrayList) {
        ChipGroup chipGroup2 = this.f;
        if (chipGroup2.m.d) {
            chipGroup2.getCheckedChipId();
            throw null;
        }
    }
}
