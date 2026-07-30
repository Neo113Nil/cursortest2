package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gt1 extends jc2 implements qe0 {
    public w81 BRwzKIf41E4i;
    public int EcgxDIVH5in8;
    public w81 QrzZRwfaDlRX;
    public w81 RfyTYNmI9Srp;
    public /* synthetic */ x6 S9EYkSpbGuxq;
    public final /* synthetic */ ht1 VhhvGxCb8gfr;
    public Set XL4ISE6Oc65B;
    public List cpQdD2nAriOS;
    public w81 gPXPFXrUH4XX;
    public List r3s1LDPKFs1S;
    public List x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt1(ht1 ht1Var, bt btVar) {
        super(3, btVar);
        this.VhhvGxCb8gfr = ht1Var;
    }

    public static final void S9EYkSpbGuxq(ht1 ht1Var, List list, List list2, List list3, w81 w81Var, w81 w81Var2, w81 w81Var3, w81 w81Var4) {
        char c;
        long j;
        long j2;
        synchronized (ht1Var.TSizfFm2Yiuu) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    zp zpVar = (zp) list3.get(i);
                    zpVar.PxuCJdSBwIXG();
                    ht1Var.nLZGh9p8gVSu(zpVar);
                }
                list3.clear();
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    zp zpVar2 = (zp) objArr[(i2 << 3) + i4];
                                    zpVar2.PxuCJdSBwIXG();
                                    ht1Var.nLZGh9p8gVSu(zpVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                w81Var.lS5Rgt96tfkO();
                Object[] objArr2 = w81Var2.lS5Rgt96tfkO;
                long[] jArr2 = w81Var2.PxuCJdSBwIXG;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((zp) objArr2[(i5 << 3) + i7]).RAsUl2FVSrh6();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                w81Var2.lS5Rgt96tfkO();
                w81Var3.lS5Rgt96tfkO();
                Object[] objArr3 = w81Var4.lS5Rgt96tfkO;
                long[] jArr3 = w81Var4.PxuCJdSBwIXG;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    zp zpVar3 = (zp) objArr3[(i8 << 3) + i10];
                                    zpVar3.PxuCJdSBwIXG();
                                    ht1Var.nLZGh9p8gVSu(zpVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                w81Var4.lS5Rgt96tfkO();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void VhhvGxCb8gfr(List list, ht1 ht1Var) {
        list.clear();
        synchronized (ht1Var.TSizfFm2Yiuu) {
            try {
                ArrayList arrayList = ht1Var.dgRBjINgWbAK;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((n71) arrayList.get(i));
                }
                ht1Var.dgRBjINgWbAK.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:6:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01d9 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        x6 x6Var;
        w81 w81Var;
        w81 w81Var2;
        List list;
        Set set;
        final List list2;
        w81 w81Var3;
        List list3;
        w81 w81Var4;
        final List list4;
        final w81 w81Var5;
        final List list5;
        final w81 w81Var6;
        ht1 ht1Var;
        Object obj2;
        bi biVar;
        su suVar;
        x6 x6Var2;
        p81 p81Var;
        su suVar2 = su.rtx2ld2ELZv4;
        int i = this.EcgxDIVH5in8;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            x6Var = this.S9EYkSpbGuxq;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            w81 w81Var7 = d02.PxuCJdSBwIXG;
            w81Var = new w81();
            w81 w81Var8 = new w81();
            w81 w81Var9 = new w81();
            e02 e02Var = new e02(w81Var9);
            w81Var2 = new w81();
            list = arrayList;
            set = e02Var;
            list2 = arrayList2;
            w81Var3 = w81Var9;
            list3 = arrayList3;
            w81Var4 = w81Var8;
            synchronized (this.VhhvGxCb8gfr.TSizfFm2Yiuu) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w81 w81Var10 = this.RfyTYNmI9Srp;
                set = this.XL4ISE6Oc65B;
                w81Var3 = this.BRwzKIf41E4i;
                w81Var4 = this.gPXPFXrUH4XX;
                w81Var = this.QrzZRwfaDlRX;
                list3 = this.r3s1LDPKFs1S;
                list2 = this.cpQdD2nAriOS;
                list = this.x50lh2ztY7Y5;
                x6 x6Var3 = this.S9EYkSpbGuxq;
                ng0.tmVwIGCQF4zR(obj);
                w81Var2 = w81Var10;
                x6Var = x6Var3;
                ht1 ht1Var2 = this.VhhvGxCb8gfr;
                synchronized (ht1Var2.TSizfFm2Yiuu) {
                    try {
                        if (ht1Var2.x50lh2ztY7Y5.wdg6QnbFHrFF()) {
                            p81 lS5Rgt96tfkO = x71.lS5Rgt96tfkO(ht1Var2.x50lh2ztY7Y5);
                            ht1Var2.x50lh2ztY7Y5.PxuCJdSBwIXG();
                            op0 op0Var = ht1Var2.cpQdD2nAriOS;
                            ((v81) op0Var.OPXfSBeufaJ8).PxuCJdSBwIXG();
                            ((v81) op0Var.wdg6QnbFHrFF).PxuCJdSBwIXG();
                            ht1Var2.QrzZRwfaDlRX.PxuCJdSBwIXG();
                            p81Var = new p81(lS5Rgt96tfkO.lS5Rgt96tfkO);
                            Object[] objArr = lS5Rgt96tfkO.PxuCJdSBwIXG;
                            int i4 = lS5Rgt96tfkO.lS5Rgt96tfkO;
                            suVar = suVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                n71 n71Var = (n71) objArr[i5];
                                p81Var.PxuCJdSBwIXG(new vi1(n71Var, ht1Var2.r3s1LDPKFs1S.RAsUl2FVSrh6(n71Var)));
                                i5 = i6 + 1;
                                x6Var = x6Var;
                                objArr = objArr;
                            }
                            x6Var2 = x6Var;
                            ht1Var2.r3s1LDPKFs1S.PxuCJdSBwIXG();
                        } else {
                            suVar = suVar2;
                            x6Var2 = x6Var;
                            p81Var = pe1.lS5Rgt96tfkO;
                            p81Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                int i7 = p81Var.lS5Rgt96tfkO;
                for (int i8 = 0; i8 < i7; i8++) {
                    vi1 vi1Var = (vi1) objArr2[i8];
                }
                m9 m9Var = this.VhhvGxCb8gfr.lS5Rgt96tfkO;
                ((bb) m9Var.OPXfSBeufaJ8).set(0);
                ((xb) m9Var.wdg6QnbFHrFF).rtx2ld2ELZv4(new xy0(27));
                suVar2 = suVar;
                x6Var = x6Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.VhhvGxCb8gfr.TSizfFm2Yiuu) {
                }
                ht1 ht1Var3 = this.VhhvGxCb8gfr;
                this.S9EYkSpbGuxq = x6Var;
                this.x50lh2ztY7Y5 = list;
                this.cpQdD2nAriOS = list2;
                this.r3s1LDPKFs1S = list3;
                this.QrzZRwfaDlRX = w81Var;
                this.gPXPFXrUH4XX = w81Var4;
                this.BRwzKIf41E4i = w81Var3;
                this.XL4ISE6Oc65B = set;
                this.RfyTYNmI9Srp = w81Var2;
                this.EcgxDIVH5in8 = i3;
                if (ht1Var3.aF05bpZJlKEP()) {
                    obj2 = no2.PxuCJdSBwIXG;
                } else {
                    bi biVar2 = new bi(i3, ng0.IAToe7bXGz4N(this));
                    biVar2.ZbWwgt3aGe7A();
                    synchronized (ht1Var3.TSizfFm2Yiuu) {
                        if (ht1Var3.aF05bpZJlKEP()) {
                            biVar = biVar2;
                        } else {
                            ht1Var3.XL4ISE6Oc65B = biVar2;
                            biVar = null;
                        }
                    }
                    if (biVar != null) {
                        biVar.RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                    }
                    obj2 = biVar2.VhhvGxCb8gfr();
                    if (obj2 != su.rtx2ld2ELZv4) {
                        obj2 = no2.PxuCJdSBwIXG;
                    }
                }
                if (obj2 != suVar2) {
                    List list6 = list;
                    w81Var5 = w81Var;
                    w81Var6 = w81Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final w81 w81Var11 = w81Var4;
                    final w81 w81Var12 = w81Var3;
                    ht1Var = this.VhhvGxCb8gfr;
                    bt1 bt1Var = ht1.Companion;
                    if (ht1Var.xfACYKDMU6Dj()) {
                        List list7 = list4;
                        w81Var2 = w81Var6;
                        w81Var = w81Var5;
                        list = list5;
                        list3 = list7;
                        w81Var3 = w81Var12;
                        w81Var4 = w81Var11;
                        set = set2;
                        synchronized (this.VhhvGxCb8gfr.TSizfFm2Yiuu) {
                        }
                    } else {
                        final ht1 ht1Var4 = this.VhhvGxCb8gfr;
                        le0 le0Var = new le0() { // from class: ft1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj3) {
                                boolean IAToe7bXGz4N;
                                boolean z;
                                Object[] objArr3;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                List list12;
                                w81 w81Var13;
                                Object[] objArr4;
                                ht1 ht1Var5 = ht1.this;
                                w81 w81Var14 = w81Var12;
                                w81 w81Var15 = w81Var6;
                                List list13 = list5;
                                List list14 = list2;
                                w81 w81Var16 = w81Var5;
                                List list15 = list4;
                                w81 w81Var17 = w81Var11;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (ht1Var5.TSizfFm2Yiuu) {
                                    IAToe7bXGz4N = ht1Var5.IAToe7bXGz4N();
                                }
                                if (IAToe7bXGz4N) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((xb) ht1Var5.PxuCJdSBwIXG.wdg6QnbFHrFF).rtx2ld2ELZv4(new u2(1, longValue));
                                        j72.Companion.getClass();
                                        i72.a92UlCVFR9N8();
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    ht1Var5.xfACYKDMU6Dj();
                                    synchronized (ht1Var5.TSizfFm2Yiuu) {
                                        try {
                                            f91 f91Var = ht1Var5.OPXfSBeufaJ8;
                                            Object[] objArr5 = f91Var.rtx2ld2ELZv4;
                                            int i9 = f91Var.wdg6QnbFHrFF;
                                            z = 0;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list13.add((zp) objArr5[i10]);
                                            }
                                            ht1Var5.OPXfSBeufaJ8.RAsUl2FVSrh6();
                                        } finally {
                                        }
                                    }
                                    w81Var14.lS5Rgt96tfkO();
                                    w81Var15.lS5Rgt96tfkO();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                zp zpVar = (zp) list13.get(i11);
                                                zp J54yh1s3n4Aq = ht1Var5.J54yh1s3n4Aq(zpVar, w81Var14);
                                                if (J54yh1s3n4Aq != null) {
                                                    list15.add(J54yh1s3n4Aq);
                                                }
                                                w81Var15.PxuCJdSBwIXG(zpVar);
                                            }
                                            list13.clear();
                                            if (w81Var14.rtx2ld2ELZv4() || ht1Var5.OPXfSBeufaJ8.wdg6QnbFHrFF != 0) {
                                                synchronized (ht1Var5.TSizfFm2Yiuu) {
                                                    try {
                                                        List kpCQ9veP6n3I = ht1Var5.kpCQ9veP6n3I();
                                                        int size2 = kpCQ9veP6n3I.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            zp zpVar2 = (zp) kpCQ9veP6n3I.get(i12);
                                                            if (!w81Var15.TSizfFm2Yiuu(zpVar2) && zpVar2.VhhvGxCb8gfr(set3)) {
                                                                list13.add(zpVar2);
                                                            }
                                                        }
                                                        f91 f91Var2 = ht1Var5.OPXfSBeufaJ8;
                                                        int i13 = f91Var2.wdg6QnbFHrFF;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = f91Var2.rtx2ld2ELZv4;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            zp zpVar3 = (zp) objArr3[i14];
                                                            if (!w81Var15.TSizfFm2Yiuu(zpVar3) && !list13.contains(zpVar3)) {
                                                                list13.add(zpVar3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                Object[] objArr6 = f91Var2.rtx2ld2ELZv4;
                                                                objArr6[i14 - i15] = objArr6[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        Arrays.fill(objArr3, i16, i13, (Object) null);
                                                        f91Var2.wdg6QnbFHrFF = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    gt1.VhhvGxCb8gfr(list14, ht1Var5);
                                                    while (!list14.isEmpty()) {
                                                        List tmVwIGCQF4zR = ht1Var5.tmVwIGCQF4zR(list14, w81Var14);
                                                        w81Var16.getClass();
                                                        Iterator it = tmVwIGCQF4zR.iterator();
                                                        while (it.hasNext()) {
                                                            w81Var16.dgRBjINgWbAK(it.next());
                                                        }
                                                        gt1.VhhvGxCb8gfr(list14, ht1Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    ht1Var5.EpkonXwzFgDB(th2, null);
                                                    gt1.S9EYkSpbGuxq(ht1Var5, list13, list14, list15, w81Var16, w81Var17, w81Var14, w81Var15);
                                                }
                                            }
                                            z = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                ht1Var5.EpkonXwzFgDB(th3, null);
                                                gt1.S9EYkSpbGuxq(ht1Var5, list13, list14, list15, w81Var16, w81Var17, w81Var14, w81Var15);
                                            } finally {
                                                list13.clear();
                                            }
                                        }
                                    }
                                    j72.Companion.getClass();
                                    j72 OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
                                    j72 kl2Var = OPXfSBeufaJ8 instanceof b91 ? new kl2((b91) OPXfSBeufaJ8, null, null, true, false) : new ll2(OPXfSBeufaJ8, null, true, z);
                                    try {
                                        j72 wdg6QnbFHrFF = kl2Var.wdg6QnbFHrFF();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i17 = z; i17 < size3; i17++) {
                                                        w81Var17.PxuCJdSBwIXG((zp) list15.get(i17));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i18 = z; i18 < size4; i18++) {
                                                        ((zp) list15.get(i18)).Y1f8riQaR6yg();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        ht1Var5.EpkonXwzFgDB(th4, null);
                                                        gt1.S9EYkSpbGuxq(ht1Var5, list13, list14, list15, w81Var16, w81Var17, w81Var14, w81Var15);
                                                        j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                                        return no2.PxuCJdSBwIXG;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (w81Var16.rtx2ld2ELZv4()) {
                                                try {
                                                    w81Var17.wdg6QnbFHrFF(w81Var16);
                                                    Object[] objArr7 = w81Var16.lS5Rgt96tfkO;
                                                    long[] jArr = w81Var16.PxuCJdSBwIXG;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i19 = 0;
                                                        j = 255;
                                                        while (true) {
                                                            long j2 = jArr[i19];
                                                            list8 = list13;
                                                            list9 = list14;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                                for (int i21 = 0; i21 < i20; i21++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        try {
                                                                            ((zp) objArr7[(i19 << 3) + i21]).a92UlCVFR9N8();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                ht1Var5.EpkonXwzFgDB(th, null);
                                                                                gt1.S9EYkSpbGuxq(ht1Var5, list8, list9, list15, w81Var16, w81Var17, w81Var14, w81Var15);
                                                                                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                                                                return no2.PxuCJdSBwIXG;
                                                                            } finally {
                                                                                w81Var16.lS5Rgt96tfkO();
                                                                            }
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i20 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i19 == length) {
                                                                break;
                                                            }
                                                            i19++;
                                                            list13 = list8;
                                                            list14 = list9;
                                                        }
                                                    } else {
                                                        list8 = list13;
                                                        list9 = list14;
                                                        j = 255;
                                                    }
                                                    list13 = list8;
                                                    list14 = list9;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    list8 = list13;
                                                    list9 = list14;
                                                }
                                            } else {
                                                j = 255;
                                            }
                                            if (w81Var17.rtx2ld2ELZv4()) {
                                                try {
                                                    Object[] objArr8 = w81Var17.lS5Rgt96tfkO;
                                                    long[] jArr2 = w81Var17.PxuCJdSBwIXG;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i22 = 0;
                                                        while (true) {
                                                            try {
                                                                long j3 = jArr2[i22];
                                                                list12 = list15;
                                                                w81Var13 = w81Var16;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j3 & j) < 128) {
                                                                            try {
                                                                                ((zp) objArr8[(i22 << 3) + i24]).RAsUl2FVSrh6();
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                try {
                                                                                    ht1Var5.EpkonXwzFgDB(th, null);
                                                                                    gt1.S9EYkSpbGuxq(ht1Var5, list10, list11, list12, w81Var13, w81Var17, w81Var14, w81Var15);
                                                                                    j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                                                                    return no2.PxuCJdSBwIXG;
                                                                                } finally {
                                                                                    w81Var17.lS5Rgt96tfkO();
                                                                                }
                                                                            }
                                                                        }
                                                                        j3 >>= 8;
                                                                        i24++;
                                                                        objArr8 = objArr8;
                                                                    }
                                                                    objArr4 = objArr8;
                                                                    if (i23 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr4 = objArr8;
                                                                }
                                                                if (i22 == length2) {
                                                                    break;
                                                                }
                                                                i22++;
                                                                w81Var16 = w81Var13;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                list12 = list15;
                                                                w81Var13 = w81Var16;
                                                                ht1Var5.EpkonXwzFgDB(th, null);
                                                                gt1.S9EYkSpbGuxq(ht1Var5, list10, list11, list12, w81Var13, w81Var17, w81Var14, w81Var15);
                                                                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                                                return no2.PxuCJdSBwIXG;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                            kl2Var.TSizfFm2Yiuu();
                                            synchronized (ht1Var5.TSizfFm2Yiuu) {
                                                if (ht1Var5.pnx5pC0XzaCw() != null) {
                                                    mp.PxuCJdSBwIXG("unexpected to get continuation here");
                                                }
                                            }
                                            j72.Companion.getClass();
                                            s72.OPXfSBeufaJ8().cpQdD2nAriOS();
                                            w81Var15.lS5Rgt96tfkO();
                                            w81Var14.lS5Rgt96tfkO();
                                            ht1Var5.BRwzKIf41E4i = null;
                                            return no2.PxuCJdSBwIXG;
                                        } catch (Throwable th10) {
                                            j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                                            throw th10;
                                        }
                                    } finally {
                                        kl2Var.TSizfFm2Yiuu();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.S9EYkSpbGuxq = x6Var;
                        this.x50lh2ztY7Y5 = list5;
                        this.cpQdD2nAriOS = list2;
                        this.r3s1LDPKFs1S = list4;
                        this.QrzZRwfaDlRX = w81Var5;
                        this.gPXPFXrUH4XX = w81Var11;
                        this.BRwzKIf41E4i = w81Var12;
                        this.XL4ISE6Oc65B = set2;
                        this.RfyTYNmI9Srp = w81Var6;
                        this.EcgxDIVH5in8 = i2;
                        if (x6Var.PxuCJdSBwIXG(this, le0Var) != suVar2) {
                            List list8 = list4;
                            w81Var2 = w81Var6;
                            w81Var = w81Var5;
                            list = list5;
                            list3 = list8;
                            w81Var3 = w81Var12;
                            w81Var4 = w81Var11;
                            set = set2;
                            ht1 ht1Var22 = this.VhhvGxCb8gfr;
                            synchronized (ht1Var22.TSizfFm2Yiuu) {
                            }
                        }
                    }
                }
                return suVar2;
            }
            w81 w81Var13 = this.RfyTYNmI9Srp;
            set = this.XL4ISE6Oc65B;
            w81Var3 = this.BRwzKIf41E4i;
            w81Var4 = this.gPXPFXrUH4XX;
            w81 w81Var14 = this.QrzZRwfaDlRX;
            List list9 = this.r3s1LDPKFs1S;
            list2 = this.cpQdD2nAriOS;
            List list10 = this.x50lh2ztY7Y5;
            x6 x6Var4 = this.S9EYkSpbGuxq;
            ng0.tmVwIGCQF4zR(obj);
            w81Var6 = w81Var13;
            x6Var = x6Var4;
            list4 = list9;
            list5 = list10;
            w81Var5 = w81Var14;
            final Set set22 = set;
            final w81 w81Var112 = w81Var4;
            final w81 w81Var122 = w81Var3;
            ht1Var = this.VhhvGxCb8gfr;
            bt1 bt1Var2 = ht1.Companion;
            if (ht1Var.xfACYKDMU6Dj()) {
            }
        }
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        gt1 gt1Var = new gt1(this.VhhvGxCb8gfr, (bt) obj3);
        gt1Var.S9EYkSpbGuxq = (x6) obj2;
        gt1Var.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
        return su.rtx2ld2ELZv4;
    }
}
