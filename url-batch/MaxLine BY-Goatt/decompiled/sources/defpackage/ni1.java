package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ni1 extends h0 {
    public final /* synthetic */ int n = 1;
    public final Object o;

    public ni1(List list) {
        list.getClass();
        this.o = list;
    }

    @Override // defpackage.b0
    public final int a() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((oi1) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.b0, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.n;
        Object obj = this.o;
        switch (i2) {
            case 0:
                String group = ((oi1) obj).a.group(i);
                return group == null ? BuildConfig.FLAVOR : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= qv.f(this)) {
                    return list.get(qv.f(this) - i);
                }
                StringBuilder n = in1.n(i, "Element index ", " must be in range [");
                n.append(new IntRange(0, qv.f(this), 1));
                n.append("].");
                throw new IndexOutOfBoundsException(n.toString());
        }
    }

    @Override // defpackage.h0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.h0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.n) {
            case 1:
                return new ka2(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.h0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.n) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.h0, java.util.List
    public ListIterator listIterator() {
        switch (this.n) {
            case 1:
                return new ka2(this, 0);
            default:
                return super.listIterator();
        }
    }

    public ni1(oi1 oi1Var) {
        this.o = oi1Var;
    }

    @Override // defpackage.h0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.n) {
            case 1:
                return new ka2(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
