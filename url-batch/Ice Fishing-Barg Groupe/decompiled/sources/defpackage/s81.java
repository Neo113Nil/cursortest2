package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s81 implements hu0, Set, fu0 {
    public final q81 OPXfSBeufaJ8;
    public final q81 rtx2ld2ELZv4;

    public s81(q81 q81Var) {
        q81Var.getClass();
        this.rtx2ld2ELZv4 = q81Var;
        this.OPXfSBeufaJ8 = q81Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.OPXfSBeufaJ8.PxuCJdSBwIXG(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        q81 q81Var = this.OPXfSBeufaJ8;
        q81Var.getClass();
        int i = q81Var.RAsUl2FVSrh6;
        for (Object obj : collection) {
            int Y1f8riQaR6yg = q81Var.Y1f8riQaR6yg(obj);
            q81Var.lS5Rgt96tfkO[Y1f8riQaR6yg] = obj;
            long[] jArr = q81Var.TSizfFm2Yiuu;
            int i2 = q81Var.Y1f8riQaR6yg;
            jArr[Y1f8riQaR6yg] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((Y1f8riQaR6yg & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            q81Var.Y1f8riQaR6yg = Y1f8riQaR6yg;
            if (q81Var.e9gEMXR7LXtO == Integer.MAX_VALUE) {
                q81Var.e9gEMXR7LXtO = Y1f8riQaR6yg;
            }
        }
        return i != q81Var.RAsUl2FVSrh6;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.OPXfSBeufaJ8.lS5Rgt96tfkO();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.rtx2ld2ELZv4.TSizfFm2Yiuu(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s81.class != obj.getClass()) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ((s81) obj).rtx2ld2ELZv4);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.RAsUl2FVSrh6 == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lg0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.OPXfSBeufaJ8.RAsUl2FVSrh6(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        q81 q81Var = this.OPXfSBeufaJ8;
        q81Var.getClass();
        int i3 = q81Var.RAsUl2FVSrh6;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = q81Var.a92UlCVFR9N8;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = q81Var.PxuCJdSBwIXG;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (cs0.wdg6QnbFHrFF(q81Var.lS5Rgt96tfkO[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                q81Var.rtx2ld2ELZv4(i2);
            }
        }
        return i3 != q81Var.RAsUl2FVSrh6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.OPXfSBeufaJ8.OPXfSBeufaJ8(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.rtx2ld2ELZv4.RAsUl2FVSrh6;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return mm2.KUoIVIumpKat(this, objArr);
    }

    public final String toString() {
        return this.rtx2ld2ELZv4.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }
}
