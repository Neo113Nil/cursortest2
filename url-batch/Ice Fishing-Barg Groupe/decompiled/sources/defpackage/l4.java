package defpackage;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements pe0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ l4(int i, int i2, Object obj) {
        this.rtx2ld2ELZv4 = i2;
        this.OPXfSBeufaJ8 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x02ec, code lost:
    
        if (r4 == null) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Collection] */
    @Override // defpackage.pe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        zy1 zy1Var;
        char c;
        char c2;
        ArrayList arrayList;
        Object obj3;
        vi1 vi1Var;
        Object obj4;
        CharSequence label;
        CharSequence title;
        char c3 = 7;
        zh zhVar = null;
        r13 = null;
        r13 = null;
        r13 = null;
        v32 v32Var = null;
        xs0 xs0Var = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return Boolean.valueOf(((xh2) this.OPXfSBeufaJ8).lS5Rgt96tfkO(vi0.bEKsvqmvPh2y((RectF) obj), vi0.bEKsvqmvPh2y((RectF) obj2)));
            case 1:
                ((Integer) obj2).getClass();
                xe.PxuCJdSBwIXG((n61) this.OPXfSBeufaJ8, (hp) obj, ki0.bEKsvqmvPh2y(1));
                return no2.PxuCJdSBwIXG;
            case 2:
                ju1 ju1Var = (ju1) this.OPXfSBeufaJ8;
                ((Integer) obj).getClass();
                if (obj2 instanceof io) {
                    io ioVar = (io) obj2;
                    w81 w81Var = ju1Var.rtx2ld2ELZv4;
                    if (w81Var == null) {
                        w81 w81Var2 = d02.PxuCJdSBwIXG;
                        w81Var = new w81();
                        ju1Var.rtx2ld2ELZv4 = w81Var;
                    }
                    w81Var.dgRBjINgWbAK(ioVar);
                    ju1Var.a92UlCVFR9N8.lS5Rgt96tfkO(ioVar);
                }
                if (obj2 instanceof yf0) {
                    ju1Var.e9gEMXR7LXtO((yf0) obj2);
                }
                if (obj2 instanceof zs1) {
                    ((zs1) obj2).TSizfFm2Yiuu();
                }
                return no2.PxuCJdSBwIXG;
            case 3:
                ((Integer) obj2).getClass();
                ov2.cpQdD2nAriOS((eh2) this.OPXfSBeufaJ8, (hp) obj, ki0.bEKsvqmvPh2y(1));
                return no2.PxuCJdSBwIXG;
            case 4:
                ye2 ye2Var = (ye2) this.OPXfSBeufaJ8;
                ((Integer) obj2).getClass();
                tf0 tf0Var = (tf0) ((hp) obj);
                tf0Var.IXK6ba3ucyzm(666084174);
                gg1 gg1Var = mp.PxuCJdSBwIXG;
                String str = ye2Var.lS5Rgt96tfkO;
                tf0Var.gPXPFXrUH4XX(false);
                return str;
            case 5:
                ((Integer) obj2).getClass();
                mm2.RAsUl2FVSrh6((wz) this.OPXfSBeufaJ8, (hp) obj, ki0.bEKsvqmvPh2y(1));
                return no2.PxuCJdSBwIXG;
            case 6:
                hp hpVar = (hp) obj;
                int intValue = ((Integer) obj2).intValue();
                tf0 tf0Var2 = (tf0) hpVar;
                if (tf0Var2.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    throw null;
                }
                tf0Var2.i68hK7ahKtgp();
                return no2.PxuCJdSBwIXG;
            case 7:
                ((Integer) obj2).getClass();
                ((vo0) this.OPXfSBeufaJ8).PxuCJdSBwIXG(ki0.bEKsvqmvPh2y(1), (hp) obj);
                return no2.PxuCJdSBwIXG;
            case 8:
                vy1 vy1Var = (vy1) obj;
                List list = (List) ((pe0) this.OPXfSBeufaJ8).rtx2ld2ELZv4(vy1Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    if (obj5 != null && (zy1Var = vy1Var.OPXfSBeufaJ8) != null && !zy1Var.Y1f8riQaR6yg(obj5)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj5).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 9:
                ((of2) this.OPXfSBeufaJ8).e9gEMXR7LXtO(((bf1) obj2).PxuCJdSBwIXG);
                return no2.PxuCJdSBwIXG;
            case 10:
                w71 w71Var = (w71) this.OPXfSBeufaJ8;
                Set set = (Set) obj;
                synchronized (w71Var.PxuCJdSBwIXG) {
                    try {
                        v81 v81Var = w71Var.lS5Rgt96tfkO;
                        e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(20, set, w71Var);
                        mm2.S9EYkSpbGuxq(1, e9gemxr7lxto);
                        Object[] objArr = v81Var.lS5Rgt96tfkO;
                        long[] jArr = v81Var.PxuCJdSBwIXG;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((j & 255) < 128) {
                                            e9gemxr7lxto.OPXfSBeufaJ8(objArr[(i2 << 3) + i4]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                    }
                                }
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                        w81 w81Var3 = w71Var.Y1f8riQaR6yg;
                        Object[] objArr2 = w81Var3.lS5Rgt96tfkO;
                        long[] jArr2 = w81Var3.PxuCJdSBwIXG;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j2 & 255) < 128) {
                                            ((v32) objArr2[(i5 << 3) + i7]).Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i6 != 8) {
                                    }
                                }
                                if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                        w71Var.Y1f8riQaR6yg.lS5Rgt96tfkO();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 11:
                ((Integer) obj2).getClass();
                ki0.Y1f8riQaR6yg((lb1) this.OPXfSBeufaJ8, (hp) obj, ki0.bEKsvqmvPh2y(1));
                return no2.PxuCJdSBwIXG;
            case 12:
                ht1 ht1Var = (ht1) this.OPXfSBeufaJ8;
                Set set2 = (Set) obj;
                synchronized (ht1Var.TSizfFm2Yiuu) {
                    try {
                        if (((dt1) ht1Var.S9EYkSpbGuxq.getValue()).compareTo(dt1.x50lh2ztY7Y5) >= 0) {
                            w81 w81Var4 = ht1Var.rtx2ld2ELZv4;
                            if (set2 instanceof e02) {
                                w81 w81Var5 = ((e02) set2).rtx2ld2ELZv4;
                                Object[] objArr3 = w81Var5.lS5Rgt96tfkO;
                                long[] jArr3 = w81Var5.PxuCJdSBwIXG;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j3 = jArr3[i8];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj6 = objArr3[(i8 << 3) + i10];
                                                    c2 = c3;
                                                    if (!(obj6 instanceof q92) || ((q92) obj6).a92UlCVFR9N8(1)) {
                                                        w81Var4.PxuCJdSBwIXG(obj6);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i10++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i8 != length3) {
                                            i8++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set2) {
                                    if (!(obj7 instanceof q92) || ((q92) obj7).a92UlCVFR9N8(1)) {
                                        w81Var4.PxuCJdSBwIXG(obj7);
                                    }
                                }
                            }
                            zhVar = ht1Var.pnx5pC0XzaCw();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (zhVar != null) {
                    ((bi) zhVar).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                }
                return no2.PxuCJdSBwIXG;
            case 13:
                iy1 iy1Var = (iy1) this.OPXfSBeufaJ8;
                int intValue2 = ((Integer) obj).intValue();
                fu fuVar = (fu) obj2;
                gu key = fuVar.getKey();
                fu S2OOm9zPNm0h = iy1Var.x50lh2ztY7Y5.S2OOm9zPNm0h(key);
                if (key != ih0.BRwzKIf41E4i) {
                    if (fuVar != S2OOm9zPNm0h) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    xs0 xs0Var2 = (xs0) S2OOm9zPNm0h;
                    xs0 xs0Var3 = (xs0) fuVar;
                    while (xs0Var3 != null) {
                        if (xs0Var3 != xs0Var2 && (xs0Var3 instanceof f02)) {
                            sj POWyO8hTM6YC = ((f02) xs0Var3).POWyO8hTM6YC();
                            xs0Var3 = POWyO8hTM6YC != null ? POWyO8hTM6YC.getParent() : null;
                        } else {
                            xs0Var = xs0Var3;
                            if (xs0Var == xs0Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + xs0Var + ", expected child of " + xs0Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (xs0Var == xs0Var2) {
                    }
                }
                return Integer.valueOf(intValue2);
            case 14:
                d12 d12Var = (d12) this.OPXfSBeufaJ8;
                fx1.KUoIVIumpKat(d12Var.GlTbNTgfSMqy(), null, new c12(d12Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 15:
                yt1 yt1Var = (yt1) this.OPXfSBeufaJ8;
                ((ao1) obj).PxuCJdSBwIXG();
                yt1Var.rtx2ld2ELZv4 = ((bf1) obj2).PxuCJdSBwIXG;
                return no2.PxuCJdSBwIXG;
            case 16:
                x52 x52Var = (x52) this.OPXfSBeufaJ8;
                Set set3 = (Set) obj;
                synchronized (x52Var.PxuCJdSBwIXG) {
                    try {
                        w81 w81Var6 = x52Var.Y1f8riQaR6yg;
                        if (w81Var6 != null) {
                            Object[] objArr4 = w81Var6.lS5Rgt96tfkO;
                            long[] jArr4 = w81Var6.PxuCJdSBwIXG;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j4 = jArr4[i11];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length4)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i11 << 3) + i13])) {
                                                    j4 >>= 8;
                                                    i13++;
                                                } else {
                                                    v32Var = x52Var.a92UlCVFR9N8;
                                                }
                                            } else if (i12 != 8) {
                                            }
                                        }
                                    }
                                    if (i11 != length4) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (zk.fkblLSN2bAgv(set3, x52Var.lS5Rgt96tfkO)) {
                            v32Var = x52Var.a92UlCVFR9N8;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (v32Var != null) {
                    v32Var.Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
                }
                return no2.PxuCJdSBwIXG;
            case 17:
                f82 f82Var = (f82) this.OPXfSBeufaJ8;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = f82Var.lS5Rgt96tfkO;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        arrayList = set4;
                    } else if (obj8 instanceof Set) {
                        arrayList = fx1.D0aTLcX6Uhyo(new Set[]{obj8, set4});
                    } else {
                        if (!(obj8 instanceof List)) {
                            mp.lS5Rgt96tfkO("Unexpected notification");
                            u9.Y1f8riQaR6yg();
                            return null;
                        }
                        arrayList = zk.wcHq2YQJmeHg((Collection) obj8, fx1.jJwa0q7P5wHq(set4));
                    }
                    while (!atomicReference.compareAndSet(obj8, arrayList)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (f82Var.TSizfFm2Yiuu()) {
                        f82Var.PxuCJdSBwIXG.OPXfSBeufaJ8(new uy1(11, f82Var));
                    }
                    return no2.PxuCJdSBwIXG;
                    break;
                }
            case 18:
                char[] cArr = (char[]) this.OPXfSBeufaJ8;
                CharSequence charSequence = (CharSequence) obj;
                int intValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int uVlwi32qvXeJ = ia2.uVlwi32qvXeJ(charSequence, cArr, intValue3, false);
                if (uVlwi32qvXeJ < 0) {
                    return null;
                }
                return new vi1(Integer.valueOf(uVlwi32qvXeJ), 1);
            case 19:
                List list2 = (List) this.OPXfSBeufaJ8;
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue4 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list2.size() == 1) {
                    int size2 = list2.size();
                    if (size2 == 0) {
                        rc1.RAsUl2FVSrh6("List is empty.");
                        return null;
                    }
                    if (size2 != 1) {
                        u9.XL4ISE6Oc65B("List has more than one element.");
                        return null;
                    }
                    String str2 = (String) list2.get(0);
                    int hVNtCUZb4tYH = ia2.hVNtCUZb4tYH(charSequence2, str2, intValue4, false, 4);
                    if (hVNtCUZb4tYH >= 0) {
                        vi1Var = new vi1(Integer.valueOf(hVNtCUZb4tYH), str2);
                        if (vi1Var == null) {
                            return new vi1(vi1Var.rtx2ld2ELZv4, Integer.valueOf(((String) vi1Var.OPXfSBeufaJ8).length()));
                        }
                        return null;
                    }
                    vi1Var = null;
                    if (vi1Var == null) {
                    }
                } else {
                    if (intValue4 < 0) {
                        intValue4 = 0;
                    }
                    br0 br0Var = new br0(intValue4, charSequence2.length(), 1);
                    int i14 = br0Var.wdg6QnbFHrFF;
                    int i15 = br0Var.OPXfSBeufaJ8;
                    if (charSequence2 instanceof String) {
                        if ((i14 > 0 && intValue4 <= i15) || (i14 < 0 && i15 <= intValue4)) {
                            while (true) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str3 = (String) obj4;
                                        if (str3.regionMatches(0, (String) charSequence2, intValue4, str3.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str4 = (String) obj4;
                                if (str4 != null) {
                                    vi1Var = new vi1(Integer.valueOf(intValue4), str4);
                                } else if (intValue4 != i15) {
                                    intValue4 += i14;
                                }
                            }
                        }
                        vi1Var = null;
                        if (vi1Var == null) {
                        }
                    } else {
                        if ((i14 > 0 && intValue4 <= i15) || (i14 < 0 && i15 <= intValue4)) {
                            int i16 = intValue4;
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str5 = (String) obj3;
                                        if (ia2.uURZJOrwXbxn(str5, 0, charSequence2, i16, str5.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str6 = (String) obj3;
                                if (str6 != null) {
                                    vi1Var = new vi1(Integer.valueOf(i16), str6);
                                } else if (i16 != i15) {
                                    i16 += i14;
                                }
                            }
                        }
                        vi1Var = null;
                        if (vi1Var == null) {
                        }
                    }
                }
            case 20:
                TextClassification textClassification = (TextClassification) this.OPXfSBeufaJ8;
                ((Integer) obj2).getClass();
                tf0 tf0Var3 = (tf0) ((hp) obj);
                tf0Var3.IXK6ba3ucyzm(950061013);
                gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                label = textClassification.getLabel();
                String valueOf = String.valueOf(label);
                tf0Var3.gPXPFXrUH4XX(false);
                return valueOf;
            case 21:
                RemoteAction remoteAction = (RemoteAction) this.OPXfSBeufaJ8;
                ((Integer) obj2).getClass();
                tf0 tf0Var4 = (tf0) ((hp) obj);
                tf0Var4.IXK6ba3ucyzm(-1376593684);
                gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                title = remoteAction.getTitle();
                String obj9 = title.toString();
                tf0Var4.gPXPFXrUH4XX(false);
                return obj9;
            case 22:
                ((Integer) obj2).getClass();
                gi2.PxuCJdSBwIXG((dj2) this.OPXfSBeufaJ8, (hp) obj, ki0.bEKsvqmvPh2y(1));
                return no2.PxuCJdSBwIXG;
            case 23:
                ((le0) this.OPXfSBeufaJ8).OPXfSBeufaJ8(obj);
                return no2.PxuCJdSBwIXG;
            case 24:
                return new wq0(((nd) this.OPXfSBeufaJ8).PxuCJdSBwIXG(0, (int) (((ir0) obj).PxuCJdSBwIXG >> 32), (cw0) obj2) << 32);
            default:
                return new wq0(((od) this.OPXfSBeufaJ8).PxuCJdSBwIXG(0, (int) (((ir0) obj).PxuCJdSBwIXG & 4294967295L)) & 4294967295L);
        }
    }

    public /* synthetic */ l4(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
