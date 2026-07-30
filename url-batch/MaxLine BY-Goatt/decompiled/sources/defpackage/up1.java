package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class up1 {
    public int A;
    public final ArrayList B;
    public final sk2 C;
    public final k62 D;
    public final Context a;
    public final Activity b;
    public rp1 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final bi g;
    public final vo2 h;
    public final vo2 i;
    public final m62 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public id1 o;
    public hp1 p;
    public final CopyOnWriteArrayList q;
    public zc1 r;
    public final ep1 s;
    public final tm t;
    public final boolean u;
    public final dr1 v;
    public final LinkedHashMap w;
    public Function1 x;
    public g40 y;
    public final LinkedHashMap z;

    public up1(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        Iterator it = aj2.c(context, bl0.G).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) obj;
        this.g = new bi();
        ah0 ah0Var = ah0.m;
        this.h = zm3.f(ah0Var);
        vo2 f = zm3.f(ah0Var);
        this.i = f;
        this.j = new m62(f);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList();
        this.r = zc1.n;
        this.s = new ep1(0, this);
        this.t = new tm(2, this);
        this.u = true;
        dr1 dr1Var = new dr1();
        this.v = dr1Var;
        this.w = new LinkedHashMap();
        this.z = new LinkedHashMap();
        dr1Var.a(new tp1(dr1Var));
        dr1Var.a(new p3(this.a));
        this.B = new ArrayList();
        ya1.b(new u(19, this));
        sk2 m = s93.m(2, hq.n);
        this.C = m;
        this.D = new k62(m);
    }

    public static op1 d(op1 op1Var, int i, boolean z) {
        rp1 rp1Var;
        if (op1Var.r == i) {
            return op1Var;
        }
        if (op1Var instanceof rp1) {
            rp1Var = (rp1) op1Var;
        } else {
            rp1Var = op1Var.n;
            rp1Var.getClass();
        }
        return rp1Var.e(i, rp1Var, z);
    }

    public static void k(up1 up1Var, String str, dq1 dq1Var, int i) {
        if ((i & 2) != 0) {
            dq1Var = null;
        }
        up1Var.getClass();
        if (up1Var.c == null) {
            b71.l("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", up1Var, 46);
            return;
        }
        rp1 h = up1Var.h(up1Var.g);
        mp1 g = h.g(str, true, h);
        if (g == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + up1Var.c);
        }
        op1 op1Var = g.m;
        Bundle a = op1Var.a(g.n);
        if (a == null) {
            a = new Bundle();
        }
        Intent intent = new Intent();
        int i2 = op1.u;
        String str2 = op1Var.s;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : BuildConfig.FLAVOR);
        parse.getClass();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        up1Var.j(op1Var, a, dq1Var);
    }

    public static /* synthetic */ void o(up1 up1Var, cp1 cp1Var) {
        up1Var.n(cp1Var, false, new bi());
    }

    public final void a(op1 op1Var, Bundle bundle, cp1 cp1Var, List list) {
        Object obj;
        Object obj2;
        op1 op1Var2 = cp1Var.n;
        boolean z = op1Var2 instanceof za0;
        bi biVar = this.g;
        if (!z) {
            while (!biVar.isEmpty() && (((cp1) biVar.last()).n instanceof za0) && m(((cp1) biVar.last()).n.r, true, false)) {
            }
        }
        bi biVar2 = new bi();
        boolean z2 = op1Var instanceof rp1;
        Context context = this.a;
        Object obj3 = null;
        if (z2) {
            op1 op1Var3 = op1Var2;
            do {
                op1Var3.getClass();
                op1Var3 = op1Var3.n;
                if (op1Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.b(((cp1) obj2).n, op1Var3)) {
                                break;
                            }
                        }
                    }
                    cp1 cp1Var2 = (cp1) obj2;
                    if (cp1Var2 == null) {
                        cp1Var2 = nm1.n(context, op1Var3, bundle, g(), this.p);
                    }
                    biVar2.addFirst(cp1Var2);
                    if (!biVar.isEmpty() && ((cp1) biVar.last()).n == op1Var3) {
                        o(this, (cp1) biVar.last());
                    }
                }
                if (op1Var3 == null) {
                    break;
                }
            } while (op1Var3 != op1Var);
        }
        op1 op1Var4 = biVar2.isEmpty() ? op1Var2 : ((cp1) biVar2.first()).n;
        while (op1Var4 != null && c(op1Var4.r) != op1Var4) {
            op1Var4 = op1Var4.n;
            if (op1Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.b(((cp1) obj).n, op1Var4)) {
                            break;
                        }
                    }
                }
                cp1 cp1Var3 = (cp1) obj;
                if (cp1Var3 == null) {
                    cp1Var3 = nm1.n(context, op1Var4, op1Var4.a(bundle2), g(), this.p);
                }
                biVar2.addFirst(cp1Var3);
            }
        }
        if (!biVar2.isEmpty()) {
            op1Var2 = ((cp1) biVar2.first()).n;
        }
        while (!biVar.isEmpty() && (((cp1) biVar.last()).n instanceof rp1)) {
            op1 op1Var5 = ((cp1) biVar.last()).n;
            op1Var5.getClass();
            if (((rp1) op1Var5).v.c(op1Var2.r) != null) {
                break;
            } else {
                o(this, (cp1) biVar.last());
            }
        }
        cp1 cp1Var4 = (cp1) (biVar.isEmpty() ? null : biVar.n[biVar.m]);
        if (cp1Var4 == null) {
            cp1Var4 = (cp1) (biVar2.isEmpty() ? null : biVar2.n[biVar2.m]);
        }
        if (!Intrinsics.b(cp1Var4 != null ? cp1Var4.n : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                op1 op1Var6 = ((cp1) previous).n;
                rp1 rp1Var = this.c;
                rp1Var.getClass();
                if (Intrinsics.b(op1Var6, rp1Var)) {
                    obj3 = previous;
                    break;
                }
            }
            cp1 cp1Var5 = (cp1) obj3;
            if (cp1Var5 == null) {
                rp1 rp1Var2 = this.c;
                rp1Var2.getClass();
                rp1 rp1Var3 = this.c;
                rp1Var3.getClass();
                cp1Var5 = nm1.n(context, rp1Var2, rp1Var3.a(bundle), g(), this.p);
            }
            biVar2.addFirst(cp1Var5);
        }
        Iterator it = biVar2.iterator();
        while (it.hasNext()) {
            cp1 cp1Var6 = (cp1) it.next();
            Object obj4 = this.w.get(this.v.b(cp1Var6.n.m));
            if (obj4 == null) {
                b71.h(q40.p(new StringBuilder("NavigatorBackStack for "), op1Var.m, " should already be created"));
                return;
            }
            ((fp1) obj4).a(cp1Var6);
        }
        biVar.addAll(biVar2);
        biVar.addLast(cp1Var);
        ArrayList F = zv.F(biVar2, cp1Var);
        int size = F.size();
        int i = 0;
        while (i < size) {
            Object obj5 = F.get(i);
            i++;
            cp1 cp1Var7 = (cp1) obj5;
            rp1 rp1Var4 = cp1Var7.n.n;
            if (rp1Var4 != null) {
                i(cp1Var7, e(rp1Var4.r));
            }
        }
    }

    public final boolean b() {
        bi biVar;
        while (true) {
            biVar = this.g;
            if (biVar.isEmpty() || !(((cp1) biVar.last()).n instanceof rp1)) {
                break;
            }
            o(this, (cp1) biVar.last());
        }
        cp1 cp1Var = (cp1) biVar.f();
        ArrayList arrayList = this.B;
        if (cp1Var != null) {
            arrayList.add(cp1Var);
        }
        this.A++;
        s();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList N = zv.N(arrayList);
            arrayList.clear();
            int size = N.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = N.get(i2);
                i2++;
                cp1 cp1Var2 = (cp1) obj;
                Iterator it = this.q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        b71.o();
                        return false;
                    }
                    op1 op1Var = cp1Var2.n;
                    cp1Var2.a();
                    throw null;
                }
                this.C.q(cp1Var2);
            }
            ArrayList arrayList2 = new ArrayList(biVar);
            vo2 vo2Var = this.h;
            vo2Var.getClass();
            vo2Var.j(null, arrayList2);
            ArrayList p = p();
            vo2 vo2Var2 = this.i;
            vo2Var2.getClass();
            vo2Var2.j(null, p);
        }
        return cp1Var != null;
    }

    public final op1 c(int i) {
        op1 op1Var;
        rp1 rp1Var = this.c;
        if (rp1Var == null) {
            return null;
        }
        if (rp1Var.r == i) {
            return rp1Var;
        }
        cp1 cp1Var = (cp1) this.g.f();
        if (cp1Var == null || (op1Var = cp1Var.n) == null) {
            op1Var = this.c;
            op1Var.getClass();
        }
        return d(op1Var, i, false);
    }

    public final cp1 e(int i) {
        Object obj;
        bi biVar = this.g;
        ListIterator listIterator = biVar.listIterator(biVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((cp1) obj).n.r == i) {
                break;
            }
        }
        cp1 cp1Var = (cp1) obj;
        if (cp1Var != null) {
            return cp1Var;
        }
        StringBuilder n = in1.n(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        cp1 cp1Var2 = (cp1) biVar.f();
        n.append(cp1Var2 != null ? cp1Var2.n : null);
        throw new IllegalArgumentException(n.toString().toString());
    }

    public final rp1 f() {
        rp1 rp1Var = this.c;
        if (rp1Var != null) {
            rp1Var.getClass();
            return rp1Var;
        }
        lh.g("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final zc1 g() {
        return this.o == null ? zc1.o : this.r;
    }

    public final rp1 h(bi biVar) {
        op1 op1Var;
        cp1 cp1Var = (cp1) biVar.f();
        if (cp1Var == null || (op1Var = cp1Var.n) == null) {
            op1Var = this.c;
            op1Var.getClass();
        }
        if (op1Var instanceof rp1) {
            return (rp1) op1Var;
        }
        rp1 rp1Var = op1Var.n;
        rp1Var.getClass();
        return rp1Var;
    }

    public final void i(cp1 cp1Var, cp1 cp1Var2) {
        this.k.put(cp1Var, cp1Var2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(cp1Var2) == null) {
            linkedHashMap.put(cp1Var2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(cp1Var2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ed, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00fa, code lost:
    
        if (r27.r == r5.r) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        if (r15.equals(r5) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        r5 = new defpackage.bi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if ((r12.size() - 1) < r14) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        r6 = (defpackage.cp1) defpackage.vv.p(r12);
        r(r6);
        r17 = new defpackage.cp1(r6.m, r6.n, r6.n.a(r28), r6.p, r6.q, r6.r, r6.s);
        r17.p = r6.p;
        r6 = r6.w;
        r6.getClass();
        r17.w = r6;
        r17.b();
        r5.addFirst(r17);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        r25 = r3;
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r3.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r6 = (defpackage.cp1) r3.next();
        r7 = r6.n.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0167, code lost:
    
        i(r6, e(r7.r));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        r12.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0174, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
    
        if (r3.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        r5 = (defpackage.cp1) r3.next();
        r6 = r10.b(r5.n.m);
        r7 = r5.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018e, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        if (r7 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        r11 = kotlin.Unit.a;
        r6.c(r7);
        r6 = r6.b();
        r7 = r6.a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        r11 = defpackage.zv.N((java.util.Collection) r6.e.m.getValue());
        r12 = r11.listIterator(r11.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bd, code lost:
    
        if (r12.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(((defpackage.cp1) r12.previous()).r, r5.r) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cf, code lost:
    
        r12 = r12.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d7, code lost:
    
        r11.set(r12, r5);
        r5 = r6.b;
        r5.getClass();
        r5.j(null, r11);
        r5 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e5, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x022b A[LOOP:1: B:19:0x0225->B:21:0x022b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(op1 op1Var, Bundle bundle, dq1 dq1Var) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        ListIterator listIterator;
        int i;
        boolean z3;
        Iterator it;
        LinkedHashMap linkedHashMap2 = this.w;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((fp1) it2.next()).d = true;
        }
        y72 y72Var = new y72();
        if (dq1Var != null) {
            boolean z4 = dq1Var.e;
            boolean z5 = dq1Var.d;
            int i2 = dq1Var.c;
            if (i2 != -1) {
                z = m(i2, z5, z4);
                Bundle a = op1Var.a(bundle);
                if (dq1Var != null && dq1Var.b) {
                    if (this.m.containsKey(Integer.valueOf(op1Var.r))) {
                        y72Var.m = q(op1Var.r, a, dq1Var);
                        linkedHashMap = linkedHashMap2;
                        z2 = false;
                        t();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((fp1) it.next()).d = false;
                        }
                        if (!z || y72Var.m || z2) {
                            b();
                        } else {
                            s();
                            return;
                        }
                    }
                }
                dr1 dr1Var = this.v;
                if (dq1Var != null && dq1Var.a) {
                    bi biVar = this.g;
                    cp1 cp1Var = (cp1) biVar.f();
                    listIterator = biVar.listIterator(biVar.a());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            i = -1;
                            break;
                        } else if (((cp1) listIterator.previous()).n == op1Var) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i != -1) {
                        if (op1Var instanceof rp1) {
                            int i3 = rp1.z;
                            Sequence c = aj2.c((rp1) op1Var, bl0.L);
                            bl0 bl0Var = bl0.J;
                            c.getClass();
                            List e = dj2.e(new ps2(c, bl0Var, 1));
                            if (biVar.o - i == e.size()) {
                                List subList = biVar.subList(i, biVar.o);
                                z3 = true;
                                ArrayList arrayList = new ArrayList(rv.l(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((cp1) it3.next()).n.r));
                                }
                            }
                        } else {
                            z3 = true;
                            if (cp1Var != null) {
                                op1 op1Var2 = cp1Var.n;
                                if (op1Var2 != null) {
                                }
                            }
                        }
                        if (!z2) {
                            cp1 n = nm1.n(this.a, op1Var, a, g(), this.p);
                            cr1 b = dr1Var.b(op1Var.m);
                            List c2 = pv.c(n);
                            this.x = new gc(y72Var, this, op1Var, a);
                            b.d(c2, dq1Var);
                            this.x = null;
                        }
                        t();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z) {
                        }
                        b();
                    }
                }
                linkedHashMap = linkedHashMap2;
                z2 = false;
                if (!z2) {
                }
                t();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z) {
                }
                b();
            }
        }
        z = false;
        Bundle a2 = op1Var.a(bundle);
        if (dq1Var != null) {
            if (this.m.containsKey(Integer.valueOf(op1Var.r))) {
            }
        }
        dr1 dr1Var2 = this.v;
        if (dq1Var != null) {
            bi biVar2 = this.g;
            cp1 cp1Var2 = (cp1) biVar2.f();
            listIterator = biVar2.listIterator(biVar2.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        linkedHashMap = linkedHashMap2;
        z2 = false;
        if (!z2) {
        }
        t();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        b();
    }

    public final void l() {
        bi biVar = this.g;
        if (biVar.isEmpty()) {
            return;
        }
        cp1 cp1Var = (cp1) biVar.f();
        op1 op1Var = cp1Var != null ? cp1Var.n : null;
        op1Var.getClass();
        if (m(op1Var.r, true, false)) {
            b();
        }
    }

    public final boolean m(int i, boolean z, boolean z2) {
        op1 op1Var;
        boolean z3;
        bi biVar = this.g;
        if (biVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zv.G(biVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                op1Var = null;
                break;
            }
            op1 op1Var2 = ((cp1) it.next()).n;
            cr1 b = this.v.b(op1Var2.m);
            if (z || op1Var2.r != i) {
                arrayList.add(b);
            }
            if (op1Var2.r == i) {
                op1Var = op1Var2;
                break;
            }
        }
        if (op1Var == null) {
            int i2 = op1.u;
            Log.i("NavController", "Ignoring popBackStack to destination " + ll3.E(this.a, i) + " as it was not found on the current back stack");
            return false;
        }
        y72 y72Var = new y72();
        bi biVar2 = new bi();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z3 = z2;
                break;
            }
            int i4 = i3 + 1;
            cr1 cr1Var = (cr1) arrayList.get(i3);
            y72 y72Var2 = new y72();
            cp1 cp1Var = (cp1) biVar.last();
            z3 = z2;
            this.y = new g40(y72Var2, y72Var, this, z3, biVar2);
            cr1Var.e(cp1Var, z3);
            this.y = null;
            if (!y72Var2.m) {
                break;
            }
            i3 = i4;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.m;
            if (!z) {
                Sequence c = aj2.c(op1Var, bl0.H);
                gp1 gp1Var = new gp1(this, 0);
                c.getClass();
                xl0 xl0Var = new xl0(new ps2(c, gp1Var, 0));
                while (xl0Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((op1) xl0Var.next()).r);
                    dp1 dp1Var = (dp1) (biVar2.isEmpty() ? null : biVar2.n[biVar2.m]);
                    linkedHashMap.put(valueOf, dp1Var != null ? dp1Var.m : null);
                }
            }
            if (!biVar2.isEmpty()) {
                dp1 dp1Var2 = (dp1) biVar2.first();
                int i5 = dp1Var2.n;
                String str = dp1Var2.m;
                Sequence c2 = aj2.c(c(i5), bl0.I);
                gp1 gp1Var2 = new gp1(this, 1);
                c2.getClass();
                xl0 xl0Var2 = new xl0(new ps2(c2, gp1Var2, 0));
                while (xl0Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((op1) xl0Var2.next()).r), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.n.put(str, biVar2);
                }
            }
        }
        t();
        return y72Var.m;
    }

    public final void n(cp1 cp1Var, boolean z, bi biVar) {
        hp1 hp1Var;
        m62 m62Var;
        Set set;
        bi biVar2 = this.g;
        cp1 cp1Var2 = (cp1) biVar2.last();
        if (!Intrinsics.b(cp1Var2, cp1Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(cp1Var.n);
            op1 op1Var = cp1Var2.n;
            sb.append(", which is not the top of the back stack (");
            sb.append(op1Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        vv.p(biVar2);
        fp1 fp1Var = (fp1) this.w.get(this.v.b(cp1Var2.n.m));
        boolean z2 = true;
        if ((fp1Var == null || (m62Var = fp1Var.f) == null || (set = (Set) m62Var.m.getValue()) == null || !set.contains(cp1Var2)) && !this.l.containsKey(cp1Var2)) {
            z2 = false;
        }
        zc1 zc1Var = cp1Var2.t.c;
        zc1 zc1Var2 = zc1.o;
        if (zc1Var.compareTo(zc1Var2) >= 0) {
            if (z) {
                cp1Var2.w = zc1Var2;
                cp1Var2.b();
                biVar.addFirst(new dp1(cp1Var2));
            }
            if (z2) {
                cp1Var2.w = zc1Var2;
                cp1Var2.b();
            } else {
                cp1Var2.w = zc1.m;
                cp1Var2.b();
                r(cp1Var2);
            }
        }
        if (z || z2 || (hp1Var = this.p) == null) {
            return;
        }
        String str = cp1Var2.r;
        str.getClass();
        t53 t53Var = (t53) hp1Var.b.remove(str);
        if (t53Var != null) {
            t53Var.a();
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((fp1) it.next()).f.m.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                cp1 cp1Var = (cp1) obj;
                if (!arrayList.contains(cp1Var) && cp1Var.w.compareTo(zc1.p) < 0) {
                    arrayList2.add(obj);
                }
            }
            vv.o(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            cp1 cp1Var2 = (cp1) next;
            if (!arrayList.contains(cp1Var2) && cp1Var2.w.compareTo(zc1.p) >= 0) {
                arrayList3.add(next);
            }
        }
        vv.o(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((cp1) obj2).n instanceof rp1)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, dq1 dq1Var) {
        op1 f;
        cp1 cp1Var;
        op1 op1Var;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        b6 b6Var = new b6(str, 2);
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((Boolean) b6Var.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
        bi biVar = (bi) s03.e(this.n).remove(str);
        ArrayList arrayList = new ArrayList();
        cp1 cp1Var2 = (cp1) this.g.f();
        if (cp1Var2 == null || (f = cp1Var2.n) == null) {
            f = f();
        }
        if (biVar != null) {
            Iterator it2 = biVar.iterator();
            while (it2.hasNext()) {
                dp1 dp1Var = (dp1) it2.next();
                op1 d = d(f, dp1Var.n, true);
                Context context = this.a;
                if (d == null) {
                    int i3 = op1.u;
                    b71.k("Restore State failed: destination ", ll3.E(context, dp1Var.n), " cannot be found from the current destination ", f);
                    return false;
                }
                arrayList.add(dp1Var.a(context, d, g(), this.p));
                f = d;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((cp1) obj).n instanceof rp1)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (true) {
            String str2 = null;
            if (i5 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i5);
            i5++;
            cp1 cp1Var3 = (cp1) obj2;
            List list = (List) zv.C(arrayList2);
            if (list != null && (cp1Var = (cp1) zv.B(list)) != null && (op1Var = cp1Var.n) != null) {
                str2 = op1Var.m;
            }
            if (Intrinsics.b(str2, cp1Var3.n.m)) {
                list.add(cp1Var3);
            } else {
                arrayList2.add(qv.h(cp1Var3));
            }
        }
        y72 y72Var = new y72();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            cr1 b = this.v.b(((cp1) zv.u(list2)).n.m);
            this.x = new aa(y72Var, arrayList, new a82(), this, bundle, 2);
            b.d(list2, dq1Var);
            this.x = null;
        }
        return y72Var.m;
    }

    public final void r(cp1 cp1Var) {
        cp1Var.getClass();
        cp1 cp1Var2 = (cp1) this.k.remove(cp1Var);
        if (cp1Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(cp1Var2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            fp1 fp1Var = (fp1) this.w.get(this.v.b(cp1Var2.n.m));
            if (fp1Var != null) {
                fp1Var.b(cp1Var2);
            }
            linkedHashMap.remove(cp1Var2);
        }
    }

    public final void s() {
        AtomicInteger atomicInteger;
        m62 m62Var;
        Set set;
        ArrayList N = zv.N(this.g);
        if (N.isEmpty()) {
            return;
        }
        op1 op1Var = ((cp1) zv.B(N)).n;
        ArrayList arrayList = new ArrayList();
        if (op1Var instanceof za0) {
            Iterator it = zv.G(N).iterator();
            while (it.hasNext()) {
                op1 op1Var2 = ((cp1) it.next()).n;
                arrayList.add(op1Var2);
                if (!(op1Var2 instanceof za0) && !(op1Var2 instanceof rp1)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = zv.G(N).iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                int size = N.size();
                while (i < size) {
                    Object obj = N.get(i);
                    i++;
                    cp1 cp1Var = (cp1) obj;
                    zc1 zc1Var = (zc1) hashMap.get(cp1Var);
                    if (zc1Var != null) {
                        cp1Var.getClass();
                        cp1Var.w = zc1Var;
                        cp1Var.b();
                    } else {
                        cp1Var.b();
                    }
                }
                return;
            }
            cp1 cp1Var2 = (cp1) it2.next();
            zc1 zc1Var2 = cp1Var2.w;
            op1 op1Var3 = cp1Var2.n;
            if (op1Var != null && op1Var3.r == op1Var.r) {
                zc1 zc1Var3 = zc1.q;
                if (zc1Var2 != zc1Var3) {
                    fp1 fp1Var = (fp1) this.w.get(this.v.b(op1Var3.m));
                    if (Intrinsics.b((fp1Var == null || (m62Var = fp1Var.f) == null || (set = (Set) m62Var.m.getValue()) == null) ? null : Boolean.valueOf(set.contains(cp1Var2)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.l.get(cp1Var2)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(cp1Var2, zc1.p);
                    } else {
                        hashMap.put(cp1Var2, zc1Var3);
                    }
                }
                op1 op1Var4 = (op1) zv.v(arrayList);
                if (op1Var4 != null && op1Var4.r == op1Var3.r) {
                    if (arrayList.isEmpty()) {
                        ch2.k("List is empty.");
                        return;
                    }
                    arrayList.remove(0);
                }
                op1Var = op1Var.n;
            } else if (arrayList.isEmpty() || op1Var3.r != ((op1) zv.u(arrayList)).r) {
                cp1Var2.w = zc1.o;
                cp1Var2.b();
            } else {
                if (arrayList.isEmpty()) {
                    ch2.k("List is empty.");
                    return;
                }
                op1 op1Var5 = (op1) arrayList.remove(0);
                if (zc1Var2 == zc1.q) {
                    cp1Var2.w = zc1.p;
                    cp1Var2.b();
                } else {
                    zc1 zc1Var4 = zc1.p;
                    if (zc1Var2 != zc1Var4) {
                        hashMap.put(cp1Var2, zc1Var4);
                    }
                }
                rp1 rp1Var = op1Var5.n;
                if (rp1Var != null && !arrayList.contains(rp1Var)) {
                    arrayList.add(rp1Var);
                }
            }
        }
    }

    public final void t() {
        int i;
        boolean z = false;
        if (this.u) {
            bi biVar = this.g;
            if (biVar == null || !biVar.isEmpty()) {
                Iterator it = biVar.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((cp1) it.next()).n instanceof rp1) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.t.e(z);
    }
}
