package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ZbWwgt3aGe7A implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public ZbWwgt3aGe7A(j60 j60Var) {
        this.rtx2ld2ELZv4 = 2;
        this.wdg6QnbFHrFF = j60Var;
        this.OPXfSBeufaJ8 = j60Var.TSizfFm2Yiuu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                if (this.OPXfSBeufaJ8 < ((e6tOsSdd2EFb) obj).PxuCJdSBwIXG()) {
                    break;
                }
                break;
            case 1:
                if (this.OPXfSBeufaJ8 < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.OPXfSBeufaJ8 > 0) {
                    break;
                }
                break;
            case 3:
                if (this.OPXfSBeufaJ8 < ((s82) obj).e9gEMXR7LXtO()) {
                    break;
                }
                break;
            case 4:
                if (this.OPXfSBeufaJ8 < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 5:
                if (this.OPXfSBeufaJ8 < ((int[]) obj).length) {
                    break;
                }
                break;
            case 6:
                if (this.OPXfSBeufaJ8 < ((long[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.OPXfSBeufaJ8 < ((short[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    int i2 = this.OPXfSBeufaJ8;
                    this.OPXfSBeufaJ8 = i2 + 1;
                    break;
                }
            case 1:
                try {
                    int i3 = this.OPXfSBeufaJ8;
                    this.OPXfSBeufaJ8 = i3 + 1;
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.OPXfSBeufaJ8--;
                    rc1.RAsUl2FVSrh6(e.getMessage());
                    return null;
                }
            case 2:
                j60 j60Var = (j60) obj;
                int i4 = j60Var.TSizfFm2Yiuu;
                int i5 = this.OPXfSBeufaJ8;
                this.OPXfSBeufaJ8 = i5 - 1;
                break;
            case 3:
                int i6 = this.OPXfSBeufaJ8;
                this.OPXfSBeufaJ8 = i6 + 1;
                break;
            case 4:
                int i7 = this.OPXfSBeufaJ8;
                byte[] bArr = (byte[]) obj;
                if (i7 >= bArr.length) {
                    rc1.RAsUl2FVSrh6(String.valueOf(i7));
                    break;
                } else {
                    this.OPXfSBeufaJ8 = i7 + 1;
                    break;
                }
            case 5:
                int i8 = this.OPXfSBeufaJ8;
                int[] iArr = (int[]) obj;
                if (i8 >= iArr.length) {
                    rc1.RAsUl2FVSrh6(String.valueOf(i8));
                    break;
                } else {
                    this.OPXfSBeufaJ8 = i8 + 1;
                    break;
                }
            case 6:
                int i9 = this.OPXfSBeufaJ8;
                long[] jArr = (long[]) obj;
                if (i9 >= jArr.length) {
                    rc1.RAsUl2FVSrh6(String.valueOf(i9));
                    break;
                } else {
                    this.OPXfSBeufaJ8 = i9 + 1;
                    break;
                }
            default:
                int i10 = this.OPXfSBeufaJ8;
                short[] sArr = (short[]) obj;
                if (i10 >= sArr.length) {
                    rc1.RAsUl2FVSrh6(String.valueOf(i10));
                    break;
                } else {
                    this.OPXfSBeufaJ8 = i10 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ZbWwgt3aGe7A(Object[] objArr) {
        this.rtx2ld2ELZv4 = 1;
        objArr.getClass();
        this.wdg6QnbFHrFF = objArr;
    }

    public /* synthetic */ ZbWwgt3aGe7A(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.wdg6QnbFHrFF = obj;
    }
}
