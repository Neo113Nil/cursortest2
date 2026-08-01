package a2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f136b;

    public k(ChipGroup chipGroup) {
        this.f136b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f136b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            i2.a aVar = chipGroup.f1020m;
            Chip chip = (Chip) view2;
            aVar.f2001a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new a0.a(16, aVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f135a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f136b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            i2.a aVar = chipGroup.f1020m;
            Chip chip = (Chip) view2;
            aVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            aVar.f2001a.remove(Integer.valueOf(chip.getId()));
            aVar.f2002b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f135a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
