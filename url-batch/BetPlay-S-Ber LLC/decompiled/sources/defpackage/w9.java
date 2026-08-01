package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class w9 {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public ha c;
    public boolean d;
    public boolean e;

    public final boolean a(Chip chip) {
        int id = chip.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        Chip chip2 = (Chip) this.a.get(Integer.valueOf(c()));
        if (chip2 != null) {
            e(chip2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!chip.isChecked()) {
            chip.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        ha haVar = this.c;
        if (haVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = haVar.a;
            ka kaVar = chipGroup.l;
            if (kaVar != null) {
                chipGroup.m.b(chipGroup);
                ChipGroup chipGroup2 = ((ha) kaVar).a;
                if (chipGroup2.m.d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(Chip chip, boolean z) {
        int id = chip.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(valueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            chip.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (chip.isChecked()) {
            chip.setChecked(false);
        }
        return remove;
    }
}
