package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jk0 extends w {
    public final /* synthetic */ int e = 1;
    public final Object g;

    public jk0(List list) {
        list.getClass();
        this.g = list;
    }

    @Override // defpackage.m
    public final int a() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((kk0) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.m, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
        int i2 = this.e;
        Object obj = this.g;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String group = ((kk0) obj).a.group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= zh.d(this)) {
                    return list.get(zh.d(this) - i);
                }
                StringBuilder n = qy0.n("Element index ", i, " must be in range [");
                n.append(new IntRange(0, zh.d(this), 1));
                n.append("].");
                throw new IndexOutOfBoundsException(n.toString());
        }
    }

    @Override // defpackage.w, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.e) {
            case 1:
                return new q31(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.w, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.w, java.util.List
    public ListIterator listIterator() {
        switch (this.e) {
            case 1:
                return new q31(this, 0);
            default:
                return super.listIterator();
        }
    }

    public jk0(kk0 kk0Var) {
        this.g = kk0Var;
    }

    @Override // defpackage.w, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.e) {
            case 1:
                return new q31(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
