package i2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2001a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2002b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public a2.g f2003c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2004e;

    public final boolean a(i iVar) {
        int id = iVar.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.f2002b;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        i iVar2 = (i) this.f2001a.get(Integer.valueOf(c()));
        if (iVar2 != null) {
            e(iVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f2002b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.f2002b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        a2.g gVar = this.f2003c;
        if (gVar != null) {
            new HashSet(this.f2002b);
            ChipGroup chipGroup = gVar.f134f;
            a2.j jVar = chipGroup.f1019l;
            if (jVar != null) {
                jVar.a(chipGroup, chipGroup.f1020m.b(chipGroup));
            }
        }
    }

    public final boolean e(i iVar, boolean z4) {
        int id = iVar.getId();
        Integer valueOf = Integer.valueOf(id);
        HashSet hashSet = this.f2002b;
        if (!hashSet.contains(valueOf)) {
            return false;
        }
        if (z4 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            iVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (iVar.isChecked()) {
            iVar.setChecked(false);
        }
        return remove;
    }
}
