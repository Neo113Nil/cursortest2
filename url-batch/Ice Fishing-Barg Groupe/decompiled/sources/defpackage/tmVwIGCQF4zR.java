package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class tmVwIGCQF4zR extends e6tOsSdd2EFb {
    public abstract tmVwIGCQF4zR RAsUl2FVSrh6(int i);

    public abstract tmVwIGCQF4zR TSizfFm2Yiuu(Object obj);

    public tmVwIGCQF4zR Y1f8riQaR6yg(Collection collection) {
        vl1 e9gEMXR7LXtO = e9gEMXR7LXtO();
        e9gEMXR7LXtO.addAll(collection);
        return e9gEMXR7LXtO.TSizfFm2Yiuu();
    }

    public abstract tmVwIGCQF4zR a92UlCVFR9N8(ozEBbv0hFTAB ozebbv0hftab);

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract vl1 e9gEMXR7LXtO();

    @Override // defpackage.e6tOsSdd2EFb, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract tmVwIGCQF4zR lS5Rgt96tfkO(int i, Object obj);

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract tmVwIGCQF4zR rtx2ld2ELZv4(int i, Object obj);

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final List subList(int i, int i2) {
        return new nn0(this, i, i2);
    }
}
