package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f82 {
    public e82 OPXfSBeufaJ8;
    public final le0 PxuCJdSBwIXG;
    public boolean TSizfFm2Yiuu;
    public rf1 rtx2ld2ELZv4;
    public final AtomicReference lS5Rgt96tfkO = new AtomicReference(null);
    public final l4 Y1f8riQaR6yg = new l4(17, this);
    public final xw1 e9gEMXR7LXtO = new xw1(7, this);
    public final f91 a92UlCVFR9N8 = new f91(new e82[16]);
    public final Object RAsUl2FVSrh6 = new Object();
    public long wdg6QnbFHrFF = -1;

    public f82(le0 le0Var) {
        this.PxuCJdSBwIXG = le0Var;
    }

    public final void PxuCJdSBwIXG() {
        synchronized (this.RAsUl2FVSrh6) {
            f91 f91Var = this.a92UlCVFR9N8;
            Object[] objArr = f91Var.rtx2ld2ELZv4;
            int i = f91Var.wdg6QnbFHrFF;
            for (int i2 = 0; i2 < i; i2++) {
                e82 e82Var = (e82) objArr[i2];
                e82Var.e9gEMXR7LXtO.PxuCJdSBwIXG();
                e82Var.a92UlCVFR9N8.PxuCJdSBwIXG();
                e82Var.x50lh2ztY7Y5.PxuCJdSBwIXG();
                e82Var.cpQdD2nAriOS.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean TSizfFm2Yiuu() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.RAsUl2FVSrh6) {
            z = this.TSizfFm2Yiuu;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.lS5Rgt96tfkO;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        mp.lS5Rgt96tfkO("Unexpected notification");
                        u9.Y1f8riQaR6yg();
                        return false;
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.RAsUl2FVSrh6) {
                f91 f91Var = this.a92UlCVFR9N8;
                Object[] objArr = f91Var.rtx2ld2ELZv4;
                int i = f91Var.wdg6QnbFHrFF;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((e82) objArr[i2]).PxuCJdSBwIXG(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [f91] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y1f8riQaR6yg(Object obj, le0 le0Var, ae0 ae0Var) {
        ?? r6;
        Object obj2;
        e82 e82Var;
        boolean z;
        e82 e82Var2;
        long j;
        long j2;
        e82 e82Var3;
        j72 kl2Var;
        long j3;
        l81 l81Var;
        int i;
        long j4;
        l81 l81Var2;
        long VhhvGxCb8gfr = xi0.VhhvGxCb8gfr();
        synchronized (this.RAsUl2FVSrh6) {
            r6 = this.a92UlCVFR9N8;
            Object[] objArr = r6.rtx2ld2ELZv4;
            int i2 = r6.wdg6QnbFHrFF;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((e82) obj2).PxuCJdSBwIXG == le0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            e82Var = (e82) obj2;
            z = true;
            if (e82Var == null) {
                le0Var.getClass();
                mm2.S9EYkSpbGuxq(1, le0Var);
                e82Var = new e82(le0Var);
                r6.lS5Rgt96tfkO(e82Var);
            }
            e82Var2 = this.OPXfSBeufaJ8;
            j = this.wdg6QnbFHrFF;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != VhhvGxCb8gfr) {
                gp1.PxuCJdSBwIXG("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + VhhvGxCb8gfr + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.RAsUl2FVSrh6) {
                try {
                    this.OPXfSBeufaJ8 = e82Var;
                    this.wdg6QnbFHrFF = VhhvGxCb8gfr;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            xw1 xw1Var = this.e9gEMXR7LXtO;
            Object obj3 = e82Var.lS5Rgt96tfkO;
            l81 l81Var3 = e82Var.TSizfFm2Yiuu;
            int i4 = e82Var.Y1f8riQaR6yg;
            e82Var.lS5Rgt96tfkO = obj;
            e82Var.TSizfFm2Yiuu = (l81) e82Var.a92UlCVFR9N8.RAsUl2FVSrh6(obj);
            if (e82Var.Y1f8riQaR6yg == -1) {
                e82Var.Y1f8riQaR6yg = Long.hashCode(s72.OPXfSBeufaJ8().RAsUl2FVSrh6());
            }
            sf0 sf0Var = e82Var.OPXfSBeufaJ8;
            f91 XL4ISE6Oc65B = sj0.XL4ISE6Oc65B();
            try {
                XL4ISE6Oc65B.lS5Rgt96tfkO(sf0Var);
                if (xw1Var == null) {
                    ae0Var.PxuCJdSBwIXG();
                    e82Var3 = e82Var;
                } else {
                    j72 j72Var = (j72) s72.lS5Rgt96tfkO.QrzZRwfaDlRX();
                    if (j72Var instanceof kl2) {
                        e82Var3 = e82Var;
                        if (((kl2) j72Var).EcgxDIVH5in8 == xi0.VhhvGxCb8gfr()) {
                            le0 le0Var2 = ((kl2) j72Var).XL4ISE6Oc65B;
                            le0 le0Var3 = ((kl2) j72Var).RfyTYNmI9Srp;
                            try {
                                ((kl2) j72Var).XL4ISE6Oc65B = s72.wdg6QnbFHrFF(xw1Var, le0Var2, true);
                                ((kl2) j72Var).RfyTYNmI9Srp = le0Var3;
                                ae0Var.PxuCJdSBwIXG();
                                ((kl2) j72Var).XL4ISE6Oc65B = le0Var2;
                                ((kl2) j72Var).RfyTYNmI9Srp = le0Var3;
                            } catch (Throwable th2) {
                                ((kl2) j72Var).XL4ISE6Oc65B = le0Var2;
                                ((kl2) j72Var).RfyTYNmI9Srp = le0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        e82Var3 = e82Var;
                    }
                    if (j72Var == null || (j72Var instanceof b91)) {
                        kl2Var = new kl2(j72Var instanceof b91 ? (b91) j72Var : null, xw1Var, null, true, false);
                    } else {
                        kl2Var = j72Var.S9EYkSpbGuxq(xw1Var);
                    }
                    try {
                        j72 wdg6QnbFHrFF = kl2Var.wdg6QnbFHrFF();
                        try {
                            ae0Var.PxuCJdSBwIXG();
                            j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                            kl2Var.TSizfFm2Yiuu();
                        } catch (Throwable th3) {
                            try {
                                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    kl2Var.TSizfFm2Yiuu();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    XL4ISE6Oc65B.dgRBjINgWbAK(XL4ISE6Oc65B.wdg6QnbFHrFF - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                XL4ISE6Oc65B.dgRBjINgWbAK(XL4ISE6Oc65B.wdg6QnbFHrFF - 1);
                e82 e82Var4 = e82Var3;
                Object obj4 = e82Var4.lS5Rgt96tfkO;
                obj4.getClass();
                int i5 = e82Var4.Y1f8riQaR6yg;
                l81 l81Var4 = e82Var4.TSizfFm2Yiuu;
                if (l81Var4 != null) {
                    try {
                        long[] jArr = l81Var4.PxuCJdSBwIXG;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                boolean z2 = z;
                                l81 l81Var5 = l81Var4;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j6;
                                            l81Var2 = l81Var5;
                                            Object obj5 = l81Var2.lS5Rgt96tfkO[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = l81Var2.TSizfFm2Yiuu[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    e82Var4.TSizfFm2Yiuu(obj4, obj5);
                                                }
                                                if (z3) {
                                                    l81Var2.a92UlCVFR9N8(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.RAsUl2FVSrh6) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j6;
                                            l81Var2 = l81Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j7 = j3;
                                        l81Var5 = l81Var2;
                                        j6 = j4 >> 8;
                                        j = j7;
                                    }
                                    l81Var = l81Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    l81Var = l81Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                l81Var4 = l81Var;
                                z = z2;
                                j = j3;
                            }
                            e82Var4.lS5Rgt96tfkO = obj3;
                            e82Var4.TSizfFm2Yiuu = l81Var3;
                            e82Var4.Y1f8riQaR6yg = i4;
                            synchronized (this.RAsUl2FVSrh6) {
                                this.OPXfSBeufaJ8 = e82Var2;
                                this.wdg6QnbFHrFF = j3;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.RAsUl2FVSrh6) {
                            this.OPXfSBeufaJ8 = e82Var2;
                            this.wdg6QnbFHrFF = j2;
                        }
                        throw th;
                    }
                }
                j3 = j;
                e82Var4.lS5Rgt96tfkO = obj3;
                e82Var4.TSizfFm2Yiuu = l81Var3;
                e82Var4.Y1f8riQaR6yg = i4;
                synchronized (this.RAsUl2FVSrh6) {
                }
            } catch (Throwable th9) {
                th = th9;
                XL4ISE6Oc65B.dgRBjINgWbAK(XL4ISE6Oc65B.wdg6QnbFHrFF - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:11:0x0078, B:13:0x0080, B:15:0x0090, B:17:0x0085, B:20:0x0021, B:23:0x002d, B:25:0x0041, B:27:0x004f, B:29:0x0059, B:31:0x0069, B:39:0x0074, B:42:0x0094), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lS5Rgt96tfkO(x12 x12Var) {
        int i;
        int i2;
        synchronized (this.RAsUl2FVSrh6) {
            try {
                f91 f91Var = this.a92UlCVFR9N8;
                int i3 = f91Var.wdg6QnbFHrFF;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = f91Var.rtx2ld2ELZv4;
                    if (i4 < i3) {
                        e82 e82Var = (e82) objArr[i4];
                        l81 l81Var = (l81) e82Var.a92UlCVFR9N8.dgRBjINgWbAK(x12Var);
                        if (l81Var != null) {
                            Object[] objArr2 = l81Var.lS5Rgt96tfkO;
                            int[] iArr = l81Var.TSizfFm2Yiuu;
                            long[] jArr = l81Var.PxuCJdSBwIXG;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                e82Var.TSizfFm2Yiuu(x12Var, obj);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (e82Var.a92UlCVFR9N8.wdg6QnbFHrFF()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = f91Var.rtx2ld2ELZv4;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (e82Var.a92UlCVFR9N8.wdg6QnbFHrFF()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        f91Var.wdg6QnbFHrFF = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
