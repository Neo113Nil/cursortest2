package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xb implements zi1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public Object TSizfFm2Yiuu;
    public final Object Y1f8riQaR6yg;
    public Object a92UlCVFR9N8;
    public Object e9gEMXR7LXtO;
    public final Object lS5Rgt96tfkO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    public xb(v8 v8Var, dj2 dj2Var, List list, hy hyVar, ob0 ob0Var) {
        int i;
        int i2;
        List list2;
        v8 v8Var2 = v8Var;
        dj2 dj2Var2 = dj2Var;
        this.PxuCJdSBwIXG = 2;
        this.lS5Rgt96tfkO = v8Var2;
        this.TSizfFm2Yiuu = list;
        final int i3 = 0;
        ae0 ae0Var = new ae0(this) { // from class: s71
            public final /* synthetic */ xb OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i4 = i3;
                yi1 yi1Var = null;
                int i5 = 1;
                xb xbVar = this.OPXfSBeufaJ8;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xbVar.a92UlCVFR9N8;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float PxuCJdSBwIXG = ((yi1) r0).PxuCJdSBwIXG.PxuCJdSBwIXG();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i5);
                                    float PxuCJdSBwIXG2 = ((yi1) obj).PxuCJdSBwIXG.PxuCJdSBwIXG();
                                    r0 = z;
                                    if (Float.compare(PxuCJdSBwIXG, PxuCJdSBwIXG2) < 0) {
                                        r0 = obj;
                                        PxuCJdSBwIXG = PxuCJdSBwIXG2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            yi1Var = r0;
                        }
                        yi1 yi1Var2 = yi1Var;
                        return Float.valueOf(yi1Var2 != null ? yi1Var2.PxuCJdSBwIXG.PxuCJdSBwIXG() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xbVar.a92UlCVFR9N8;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float TSizfFm2Yiuu = ((yi1) r02).PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i5);
                                    float TSizfFm2Yiuu2 = ((yi1) obj2).PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                    r02 = z2;
                                    if (Float.compare(TSizfFm2Yiuu, TSizfFm2Yiuu2) < 0) {
                                        r02 = obj2;
                                        TSizfFm2Yiuu = TSizfFm2Yiuu2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            yi1Var = r02;
                        }
                        yi1 yi1Var3 = yi1Var;
                        return Float.valueOf(yi1Var3 != null ? yi1Var3.PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu() : 0.0f);
                }
            }
        };
        pz0 pz0Var = pz0.OPXfSBeufaJ8;
        this.Y1f8riQaR6yg = vi0.ryVscX7ZL4Ux(pz0Var, ae0Var);
        final int i4 = 1;
        this.e9gEMXR7LXtO = vi0.ryVscX7ZL4Ux(pz0Var, new ae0(this) { // from class: s71
            public final /* synthetic */ xb OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i42 = i4;
                yi1 yi1Var = null;
                int i5 = 1;
                xb xbVar = this.OPXfSBeufaJ8;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xbVar.a92UlCVFR9N8;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float PxuCJdSBwIXG = ((yi1) r0).PxuCJdSBwIXG.PxuCJdSBwIXG();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i5);
                                    float PxuCJdSBwIXG2 = ((yi1) obj).PxuCJdSBwIXG.PxuCJdSBwIXG();
                                    r0 = z;
                                    if (Float.compare(PxuCJdSBwIXG, PxuCJdSBwIXG2) < 0) {
                                        r0 = obj;
                                        PxuCJdSBwIXG = PxuCJdSBwIXG2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            yi1Var = r0;
                        }
                        yi1 yi1Var2 = yi1Var;
                        return Float.valueOf(yi1Var2 != null ? yi1Var2.PxuCJdSBwIXG.PxuCJdSBwIXG() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xbVar.a92UlCVFR9N8;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float TSizfFm2Yiuu = ((yi1) r02).PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i5);
                                    float TSizfFm2Yiuu2 = ((yi1) obj2).PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu();
                                    r02 = z2;
                                    if (Float.compare(TSizfFm2Yiuu, TSizfFm2Yiuu2) < 0) {
                                        r02 = obj2;
                                        TSizfFm2Yiuu = TSizfFm2Yiuu2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            yi1Var = r02;
                        }
                        yi1 yi1Var3 = yi1Var;
                        return Float.valueOf(yi1Var3 != null ? yi1Var3.PxuCJdSBwIXG.OPXfSBeufaJ8.TSizfFm2Yiuu() : 0.0f);
                }
            }
        });
        bj1 bj1Var = dj2Var2.lS5Rgt96tfkO;
        v8 v8Var3 = w8.PxuCJdSBwIXG;
        ArrayList arrayList = v8Var2.dgRBjINgWbAK;
        String str = v8Var2.OPXfSBeufaJ8;
        p50 p50Var = p50.rtx2ld2ELZv4;
        List d = arrayList != null ? zk.d(arrayList, new db0(6)) : p50Var;
        ArrayList arrayList2 = new ArrayList();
        da daVar = new da();
        int size = d.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            u8 u8Var = (u8) d.get(i5);
            bj1 PxuCJdSBwIXG = bj1Var.PxuCJdSBwIXG((bj1) u8Var.PxuCJdSBwIXG);
            int i7 = u8Var.lS5Rgt96tfkO;
            int i8 = u8Var.TSizfFm2Yiuu;
            if (i7 > i8) {
                fp0.PxuCJdSBwIXG("Reversed range is not supported");
            }
            while (i6 < i7 && !daVar.isEmpty()) {
                u8 u8Var2 = (u8) daVar.last();
                List list3 = d;
                int i9 = u8Var2.TSizfFm2Yiuu;
                p50 p50Var2 = p50Var;
                Object obj = u8Var2.PxuCJdSBwIXG;
                if (i7 < i9) {
                    arrayList2.add(new u8(i6, i7, obj));
                    i6 = i7;
                    d = list3;
                    p50Var = p50Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new u8(i6, i9, obj));
                    i6 = u8Var2.TSizfFm2Yiuu;
                    while (!daVar.isEmpty() && i6 == ((u8) daVar.last()).TSizfFm2Yiuu) {
                        daVar.removeLast();
                    }
                    d = list3;
                    p50Var = p50Var2;
                    size = i10;
                }
            }
            List list4 = d;
            p50 p50Var3 = p50Var;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new u8(i6, i7, bj1Var));
                i6 = i7;
            }
            u8 u8Var3 = (u8) daVar.RAsUl2FVSrh6();
            if (u8Var3 != null) {
                int i12 = u8Var3.TSizfFm2Yiuu;
                Object obj2 = u8Var3.PxuCJdSBwIXG;
                int i13 = u8Var3.lS5Rgt96tfkO;
                if (i13 == i7 && i12 == i8) {
                    daVar.removeLast();
                    daVar.addLast(new u8(i7, i8, ((bj1) obj2).PxuCJdSBwIXG(PxuCJdSBwIXG)));
                } else if (i13 == i12) {
                    arrayList2.add(new u8(i13, i12, obj2));
                    daVar.removeLast();
                    daVar.addLast(new u8(i7, i8, PxuCJdSBwIXG));
                } else {
                    if (i12 < i8) {
                        throw new IllegalArgumentException();
                    }
                    daVar.addLast(new u8(i7, i8, ((bj1) obj2).PxuCJdSBwIXG(PxuCJdSBwIXG)));
                }
            } else {
                daVar.addLast(new u8(i7, i8, PxuCJdSBwIXG));
            }
            i5++;
            d = list4;
            p50Var = p50Var3;
            size = i11;
        }
        p50 p50Var4 = p50Var;
        while (i6 <= str.length() && !daVar.isEmpty()) {
            u8 u8Var4 = (u8) daVar.last();
            Object obj3 = u8Var4.PxuCJdSBwIXG;
            int i14 = u8Var4.TSizfFm2Yiuu;
            arrayList2.add(new u8(i6, i14, obj3));
            while (!daVar.isEmpty() && i14 == ((u8) daVar.last()).TSizfFm2Yiuu) {
                daVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str.length()) {
            arrayList2.add(new u8(i6, str.length(), bj1Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new u8(0, 0, bj1Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            u8 u8Var5 = (u8) arrayList2.get(i15);
            int i16 = u8Var5.lS5Rgt96tfkO;
            int i17 = u8Var5.TSizfFm2Yiuu;
            String substring = i16 != i17 ? str.substring(i16, i17) : "";
            List PxuCJdSBwIXG2 = w8.PxuCJdSBwIXG(v8Var2, i16, i17, new wnqUPcAvl7HT(2));
            v8 v8Var4 = new v8(substring, PxuCJdSBwIXG2 == null ? p50Var4 : PxuCJdSBwIXG2);
            bj1 bj1Var2 = (bj1) u8Var5.PxuCJdSBwIXG;
            int i18 = bj1Var2.lS5Rgt96tfkO;
            nf2.Companion.getClass();
            if (i18 == 0) {
                i2 = size2;
                bj1Var2 = new bj1(bj1Var2.PxuCJdSBwIXG, bj1Var.lS5Rgt96tfkO, bj1Var2.TSizfFm2Yiuu, bj1Var2.Y1f8riQaR6yg, bj1Var2.e9gEMXR7LXtO, bj1Var2.a92UlCVFR9N8, bj1Var2.RAsUl2FVSrh6, bj1Var2.rtx2ld2ELZv4, bj1Var2.OPXfSBeufaJ8);
            } else {
                i2 = size2;
            }
            dj2 dj2Var3 = new dj2(dj2Var2.PxuCJdSBwIXG, bj1Var.PxuCJdSBwIXG(bj1Var2));
            ?? r6 = v8Var4.rtx2ld2ELZv4;
            p50 p50Var5 = r6 == 0 ? p50Var4 : r6;
            List list5 = (List) this.TSizfFm2Yiuu;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i19 = 0;
            while (i19 < size3) {
                u8 u8Var6 = (u8) list5.get(i19);
                bj1 bj1Var3 = bj1Var;
                int i20 = u8Var6.lS5Rgt96tfkO;
                dj2 dj2Var4 = dj2Var3;
                int i21 = u8Var6.TSizfFm2Yiuu;
                if (w8.lS5Rgt96tfkO(i16, i17, i20, i21)) {
                    if (i16 > i20 || i21 > i17) {
                        fp0.PxuCJdSBwIXG("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new u8(i20 - i16, i21 - i16, u8Var6.PxuCJdSBwIXG));
                } else {
                    list2 = list5;
                }
                i19++;
                list5 = list2;
                dj2Var3 = dj2Var4;
                bj1Var = bj1Var3;
            }
            arrayList3.add(new yi1(new q4(substring, dj2Var3, p50Var5, arrayList4, ob0Var, hyVar), i16, i17));
            i15++;
            v8Var2 = v8Var;
            dj2Var2 = dj2Var;
            size2 = i2;
        }
        this.a92UlCVFR9N8 = arrayList3;
    }

    public float OPXfSBeufaJ8(int i, boolean z) {
        Layout layout = (Layout) this.lS5Rgt96tfkO;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    @Override // defpackage.zi1
    public float PxuCJdSBwIXG() {
        return ((Number) ((nx0) this.Y1f8riQaR6yg).getValue()).floatValue();
    }

    public void QrzZRwfaDlRX(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.lS5Rgt96tfkO).put(str, obj);
        l92 l92Var = (l92) ((LinkedHashMap) this.Y1f8riQaR6yg).get(str);
        if (l92Var != null) {
            l92Var.rtx2ld2ELZv4(obj);
        }
        l92 l92Var2 = (l92) ((LinkedHashMap) this.e9gEMXR7LXtO).get(str);
        if (l92Var2 != null) {
            l92Var2.rtx2ld2ELZv4(obj);
        }
    }

    public za1 RAsUl2FVSrh6(int i) {
        da daVar = new da();
        eb1 eb1Var = (eb1) this.e9gEMXR7LXtO;
        eb1Var.getClass();
        daVar.addLast(eb1Var);
        while (!daVar.isEmpty()) {
            za1 za1Var = (za1) daVar.removeFirst();
            if (za1Var.OPXfSBeufaJ8.lS5Rgt96tfkO == i) {
                return za1Var;
            }
            if (za1Var instanceof eb1) {
                Iterator it = ((eb1) za1Var).iterator();
                while (true) {
                    gb1 gb1Var = (gb1) it;
                    if (gb1Var.hasNext()) {
                        daVar.addLast((za1) gb1Var.next());
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.zi1
    public float TSizfFm2Yiuu() {
        return ((Number) ((nx0) this.e9gEMXR7LXtO).getValue()).floatValue();
    }

    public di Y1f8riQaR6yg(wb wbVar, ae0 ae0Var) {
        int i;
        int i2;
        int i3;
        xt1 xt1Var = new xt1();
        xt1Var.rtx2ld2ELZv4 = -1;
        synchronized (this.lS5Rgt96tfkO) {
            Throwable th = (Throwable) this.TSizfFm2Yiuu;
            if (th != null) {
                wbVar.lS5Rgt96tfkO(th);
                di.Companion.getClass();
                return ci.lS5Rgt96tfkO;
            }
            bb bbVar = (bb) this.Y1f8riQaR6yg;
            do {
                i = bbVar.get();
                i2 = i + 1;
            } while (!bbVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            xt1Var.rtx2ld2ELZv4 = (i2 >>> 27) & 15;
            ((p81) this.e9gEMXR7LXtO).PxuCJdSBwIXG(wbVar);
            if (z && ae0Var != null) {
                try {
                    ae0Var.PxuCJdSBwIXG();
                } catch (Throwable th2) {
                    synchronized (this.lS5Rgt96tfkO) {
                        try {
                            if (((Throwable) this.TSizfFm2Yiuu) == null) {
                                this.TSizfFm2Yiuu = th2;
                                p81 p81Var = (p81) this.e9gEMXR7LXtO;
                                Object[] objArr = p81Var.PxuCJdSBwIXG;
                                int i5 = p81Var.lS5Rgt96tfkO;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((wb) objArr[i6]).lS5Rgt96tfkO(th2);
                                }
                                ((p81) this.e9gEMXR7LXtO).Y1f8riQaR6yg();
                                bb bbVar2 = (bb) this.Y1f8riQaR6yg;
                                do {
                                    i3 = bbVar2.get();
                                } while (!bbVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new op0(new vb(wbVar, this, xt1Var, i4));
        }
    }

    public ce2 a92UlCVFR9N8() {
        ArrayList arrayList = (ArrayList) this.a92UlCVFR9N8;
        Intent intent = (Intent) this.Y1f8riQaR6yg;
        eb1 eb1Var = (eb1) this.e9gEMXR7LXtO;
        za1 za1Var = null;
        if (eb1Var == null) {
            u9.rtx2ld2ELZv4("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            u9.rtx2ld2ELZv4("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ua1 ua1Var = (ua1) obj;
            int i2 = ua1Var.PxuCJdSBwIXG;
            Bundle bundle = ua1Var.lS5Rgt96tfkO;
            za1 RAsUl2FVSrh6 = RAsUl2FVSrh6(i2);
            if (RAsUl2FVSrh6 == null) {
                xa1 xa1Var = za1.Companion;
                q3 q3Var = (q3) this.TSizfFm2Yiuu;
                xa1Var.getClass();
                throw new IllegalArgumentException("Navigation destination " + xa1.PxuCJdSBwIXG(q3Var, i2) + " cannot be found in the navigation graph " + eb1Var);
            }
            for (int i3 : RAsUl2FVSrh6.lS5Rgt96tfkO(za1Var)) {
                arrayList2.add(Integer.valueOf(i3));
                arrayList3.add(bundle);
            }
            za1Var = RAsUl2FVSrh6;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", zk.h(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        ce2 ce2Var = new ce2((Context) this.lS5Rgt96tfkO);
        ce2Var.PxuCJdSBwIXG(new Intent(intent));
        ArrayList arrayList4 = ce2Var.rtx2ld2ELZv4;
        int size2 = arrayList4.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Intent intent2 = (Intent) arrayList4.get(i4);
            if (intent2 != null) {
                intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return ce2Var;
    }

    public int cpQdD2nAriOS(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.lS5Rgt96tfkO).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((cs0.gPXPFXrUH4XX(charAt, 8192) < 0 || cs0.gPXPFXrUH4XX(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public int dgRBjINgWbAK(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.TSizfFm2Yiuu;
        int S2OOm9zPNm0h = fx1.S2OOm9zPNm0h(arrayList, Integer.valueOf(i));
        int i2 = S2OOm9zPNm0h < 0 ? -(S2OOm9zPNm0h + 1) : S2OOm9zPNm0h + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi e9gEMXR7LXtO(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.lS5Rgt96tfkO;
        ArrayList arrayList = (ArrayList) this.TSizfFm2Yiuu;
        ArrayList arrayList2 = (ArrayList) this.Y1f8riQaR6yg;
        boolean[] zArr = (boolean[]) this.e9gEMXR7LXtO;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int intValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = (char[]) this.a92UlCVFR9N8;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(x50lh2ztY7Y5(i))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.a92UlCVFR9N8;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.a92UlCVFR9N8 = cArr2;
        return bidi;
    }

    public void gPXPFXrUH4XX() {
        ArrayList arrayList = (ArrayList) this.a92UlCVFR9N8;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((ua1) obj).PxuCJdSBwIXG;
            if (RAsUl2FVSrh6(i2) == null) {
                xa1 xa1Var = za1.Companion;
                q3 q3Var = (q3) this.TSizfFm2Yiuu;
                xa1Var.getClass();
                throw new IllegalArgumentException("Navigation destination " + xa1.PxuCJdSBwIXG(q3Var, i2) + " cannot be found in the navigation graph " + ((eb1) this.e9gEMXR7LXtO));
            }
        }
    }

    @Override // defpackage.zi1
    public boolean lS5Rgt96tfkO() {
        ArrayList arrayList = (ArrayList) this.a92UlCVFR9N8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((yi1) arrayList.get(i)).PxuCJdSBwIXG.lS5Rgt96tfkO()) {
                return true;
            }
        }
        return false;
    }

    public e0 r3s1LDPKFs1S() {
        e0 e0Var = new e0(false);
        e0Var.OPXfSBeufaJ8 = (gm0) this.lS5Rgt96tfkO;
        e0Var.wdg6QnbFHrFF = (String) this.TSizfFm2Yiuu;
        e0Var.x50lh2ztY7Y5 = (ih0) this.e9gEMXR7LXtO;
        e0Var.dgRBjINgWbAK = ((hj0) this.Y1f8riQaR6yg).TSizfFm2Yiuu();
        return e0Var;
    }

    public void rtx2ld2ELZv4(le0 le0Var) {
        int i;
        synchronized (this.lS5Rgt96tfkO) {
            try {
                p81 p81Var = (p81) this.e9gEMXR7LXtO;
                this.e9gEMXR7LXtO = (p81) this.a92UlCVFR9N8;
                this.a92UlCVFR9N8 = p81Var;
                bb bbVar = (bb) this.Y1f8riQaR6yg;
                do {
                    i = bbVar.get();
                } while (!bbVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = p81Var.lS5Rgt96tfkO;
                for (int i3 = 0; i3 < i2; i3++) {
                    le0Var.OPXfSBeufaJ8(p81Var.a92UlCVFR9N8(i3));
                }
                p81Var.Y1f8riQaR6yg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 4:
                ih0 ih0Var = (ih0) this.e9gEMXR7LXtO;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.TSizfFm2Yiuu);
                sb.append(", url=");
                sb.append((gm0) this.lS5Rgt96tfkO);
                hj0 hj0Var = (hj0) this.Y1f8riQaR6yg;
                if (hj0Var.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : hj0Var) {
                        int i2 = i + 1;
                        if (i < 0) {
                            fx1.mFd1aGiJX24N();
                            throw null;
                        }
                        vi1 vi1Var = (vi1) obj;
                        String str = (String) vi1Var.rtx2ld2ELZv4;
                        String str2 = (String) vi1Var.OPXfSBeufaJ8;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (kv2.wdg6QnbFHrFF(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i2;
                    }
                    sb.append(']');
                }
                if (!cs0.wdg6QnbFHrFF(ih0Var, ih0.QrzZRwfaDlRX)) {
                    sb.append(", tags=");
                    sb.append(ih0Var);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public float wdg6QnbFHrFF(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.lS5Rgt96tfkO;
        if (!z2) {
            return OPXfSBeufaJ8(i, z);
        }
        int rZjpSjn4zoMv = xi0.rZjpSjn4zoMv(layout, i, z2);
        int lineStart = layout.getLineStart(rZjpSjn4zoMv);
        int lineEnd = layout.getLineEnd(rZjpSjn4zoMv);
        if (i != lineStart && i != lineEnd) {
            return OPXfSBeufaJ8(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return OPXfSBeufaJ8(i, z);
        }
        int dgRBjINgWbAK = dgRBjINgWbAK(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(x50lh2ztY7Y5(dgRBjINgWbAK))) == -1;
        int cpQdD2nAriOS = cpQdD2nAriOS(lineEnd, lineStart);
        int x50lh2ztY7Y5 = x50lh2ztY7Y5(dgRBjINgWbAK);
        int i4 = lineStart - x50lh2ztY7Y5;
        int i5 = cpQdD2nAriOS - x50lh2ztY7Y5;
        Bidi e9gEMXR7LXtO = e9gEMXR7LXtO(dgRBjINgWbAK);
        Bidi createLineBidi = e9gEMXR7LXtO != null ? e9gEMXR7LXtO.createLineBidi(i4, i5) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(rZjpSjn4zoMv) : layout.getLineRight(rZjpSjn4zoMv);
        }
        int runCount = createLineBidi.getRunCount();
        ew0[] ew0VarArr = new ew0[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            ew0VarArr[i6] = new ew0(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, ew0VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (ew0VarArr[i8].PxuCJdSBwIXG == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == ew0VarArr[i3].TSizfFm2Yiuu) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(rZjpSjn4zoMv) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(ew0VarArr[i3 - 1].PxuCJdSBwIXG) : layout.getPrimaryHorizontal(ew0VarArr[i3 + 1].PxuCJdSBwIXG) : layout.getLineRight(rZjpSjn4zoMv);
        }
        int cpQdD2nAriOS2 = i > cpQdD2nAriOS ? cpQdD2nAriOS(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (ew0VarArr[i9].lS5Rgt96tfkO == cpQdD2nAriOS2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == ew0VarArr[i2].TSizfFm2Yiuu) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(rZjpSjn4zoMv) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(ew0VarArr[i2 - 1].lS5Rgt96tfkO) : layout.getPrimaryHorizontal(ew0VarArr[i2 + 1].lS5Rgt96tfkO) : layout.getLineRight(rZjpSjn4zoMv);
    }

    public int x50lh2ztY7Y5(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.TSizfFm2Yiuu).get(i - 1)).intValue();
    }

    public xb() {
        this.PxuCJdSBwIXG = 0;
        this.lS5Rgt96tfkO = new Object();
        this.Y1f8riQaR6yg = new bb(0);
        this.e9gEMXR7LXtO = new p81();
        this.a92UlCVFR9N8 = new p81();
    }

    public xb(Layout layout) {
        this.PxuCJdSBwIXG = 1;
        this.lS5Rgt96tfkO = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int rxipThha848g = ia2.rxipThha848g(((Layout) this.lS5Rgt96tfkO).getText(), '\n', i, 4);
            i = rxipThha848g < 0 ? ((Layout) this.lS5Rgt96tfkO).getText().length() : rxipThha848g + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.lS5Rgt96tfkO).getText().length());
        this.TSizfFm2Yiuu = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.Y1f8riQaR6yg = arrayList2;
        this.e9gEMXR7LXtO = new boolean[((ArrayList) this.TSizfFm2Yiuu).size()];
        ((ArrayList) this.TSizfFm2Yiuu).size();
    }

    public xb(e0 e0Var) {
        this.PxuCJdSBwIXG = 4;
        gm0 gm0Var = (gm0) e0Var.OPXfSBeufaJ8;
        if (gm0Var != null) {
            this.lS5Rgt96tfkO = gm0Var;
            this.TSizfFm2Yiuu = (String) e0Var.wdg6QnbFHrFF;
            this.Y1f8riQaR6yg = ((jd0) e0Var.dgRBjINgWbAK).PxuCJdSBwIXG();
            this.e9gEMXR7LXtO = (ih0) e0Var.x50lh2ztY7Y5;
            return;
        }
        u9.rtx2ld2ELZv4("url == null");
        throw null;
    }

    public xb(Map map) {
        this.PxuCJdSBwIXG = 5;
        map.getClass();
        this.lS5Rgt96tfkO = new LinkedHashMap(map);
        this.TSizfFm2Yiuu = new LinkedHashMap();
        this.Y1f8riQaR6yg = new LinkedHashMap();
        this.e9gEMXR7LXtO = new LinkedHashMap();
        this.a92UlCVFR9N8 = new zm(2, this);
    }

    public xb(lb1 lb1Var) {
        Intent launchIntentForPackage;
        this.PxuCJdSBwIXG = 3;
        lb1Var.getClass();
        Context context = lb1Var.PxuCJdSBwIXG;
        context.getClass();
        this.lS5Rgt96tfkO = context;
        this.TSizfFm2Yiuu = new q3(context, (byte) 0);
        int i = 1;
        c80 c80Var = new c80(new fy(new hd2(z32.ngxnMNrpiKat(context, new xy0(17)), new xy0(18), i), new vz1(15), i));
        Activity activity = (Activity) (!c80Var.hasNext() ? null : c80Var.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.Y1f8riQaR6yg = launchIntentForPackage;
        this.a92UlCVFR9N8 = new ArrayList();
        this.e9gEMXR7LXtO = lb1Var.lS5Rgt96tfkO.RAsUl2FVSrh6();
    }
}
