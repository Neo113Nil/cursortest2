package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y41 extends e6tOsSdd2EFb {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;

    public y41(List list) {
        list.getClass();
        this.OPXfSBeufaJ8 = list;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((Matcher) ((e0) obj).OPXfSBeufaJ8).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.rtx2ld2ELZv4) {
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
        int i2 = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                String group = ((Matcher) ((e0) obj).OPXfSBeufaJ8).group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= fx1.xbgXKYA2cIfu(this)) {
                    return list.get(fx1.xbgXKYA2cIfu(this) - i);
                }
                StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "Element index ", " must be in range [");
                BRwzKIf41E4i.append(new br0(0, fx1.xbgXKYA2cIfu(this), 1));
                BRwzKIf41E4i.append("].");
                throw new IndexOutOfBoundsException(BRwzKIf41E4i.toString());
        }
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 1:
                return new fw1(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public ListIterator listIterator() {
        switch (this.rtx2ld2ELZv4) {
            case 1:
                return new fw1(this, 0);
            default:
                return super.listIterator();
        }
    }

    public y41(e0 e0Var) {
        this.OPXfSBeufaJ8 = e0Var;
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.rtx2ld2ELZv4) {
            case 1:
                return new fw1(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
