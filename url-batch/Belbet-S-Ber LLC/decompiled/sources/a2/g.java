package a2;

import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f134f;

    public /* synthetic */ g(ChipGroup chipGroup) {
        this.f134f = chipGroup;
    }

    @Override // a2.j
    public void a(ChipGroup chipGroup, ArrayList arrayList) {
        ChipGroup chipGroup2 = this.f134f;
        if (chipGroup2.f1020m.d) {
            chipGroup2.getCheckedChipId();
            throw null;
        }
    }
}
