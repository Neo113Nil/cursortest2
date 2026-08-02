package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class by {
    private final wo C;
    private final wo D;
    private final wo E;
    private final wo F;
    private final bk G;
    private oc H;
    private oc I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final e O;
    private final kee P;
    final ArrayList i;
    public final CopyOnWriteArrayList j;
    int k;
    public bl l;
    public bi m;
    public bd n;
    bd o;
    public oc p;
    ArrayDeque q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public ca v;
    public oe w;
    public final brr x;
    private boolean y;
    private ArrayList z;
    public final ArrayList a = new ArrayList();
    public final cd b = new cd();
    ArrayList c = new ArrayList();
    public final bm d = new bm(this);
    ae e = null;
    boolean f = false;
    public final ns g = new bp(this);
    public final AtomicInteger h = new AtomicInteger();
    private final Map A = DesugarCollections.synchronizedMap(new HashMap());
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());

    public by() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.i = new ArrayList();
        this.x = new brr(this);
        this.j = new CopyOnWriteArrayList();
        this.C = new be(this, 2);
        this.D = new be(this, 3);
        this.E = new be(this, 4);
        this.F = new be(this, 5);
        this.P = new kee(this);
        this.k = -1;
        this.G = new bq(this);
        this.O = new e();
        this.q = new ArrayDeque();
        this.N = new bo(this, 2, null);
    }

    public static boolean U(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set aa(ae aeVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = aeVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            bd bdVar = ((ce) arrayList.get(i)).b;
            if (bdVar != null && aeVar.j) {
                hashSet.add(bdVar);
            }
            i++;
        }
    }

    public static final boolean ab(bd bdVar) {
        if (bdVar.N && bdVar.O) {
            return true;
        }
        boolean z = false;
        for (bd bdVar2 : bdVar.E.b.e()) {
            if (bdVar2 != null) {
                z = ab(bdVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static final boolean ac(bd bdVar) {
        if (bdVar == null) {
            return true;
        }
        if (bdVar.O) {
            return bdVar.C == null || ac(bdVar.F);
        }
        return false;
    }

    static final void ae(bd bdVar) {
        if (U(2)) {
            Objects.toString(bdVar);
        }
        if (bdVar.J) {
            bdVar.J = false;
            bdVar.V = !bdVar.V;
        }
    }

    private final ViewGroup ak(bd bdVar) {
        ViewGroup viewGroup = bdVar.Q;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bdVar.H <= 0 || !this.m.b()) {
            return null;
        }
        View a = this.m.a(bdVar.H);
        if (a instanceof ViewGroup) {
            return (ViewGroup) a;
        }
        return null;
    }

    private final Set al() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((bd) ((gam) it.next()).e).Q;
            if (viewGroup != null) {
                hashSet.add(a.P(viewGroup, aj()));
            }
        }
        return hashSet;
    }

    private final void am() {
        if (X()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void an() {
        this.y = false;
        this.L.clear();
        this.K.clear();
    }

    private final void ao() {
        if (this.J) {
            this.J = false;
            au();
        }
    }

    private final void ap(boolean z) {
        if (this.y) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.l == null) {
            if (!this.u) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.l.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            am();
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:341:0x063c, code lost:
    
        if (r6 == r12) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07be A[Catch: all -> 0x0809, LOOP:35: B:454:0x07b8->B:456:0x07be, LOOP_END, TryCatch #0 {, blocks: (B:263:0x04e2, B:264:0x04ef, B:266:0x04f5, B:268:0x0501, B:272:0x050a, B:276:0x050d, B:277:0x0511, B:279:0x0517, B:281:0x0521, B:283:0x0529, B:284:0x052c, B:286:0x0540, B:289:0x0546, B:293:0x0531, B:295:0x0539, B:296:0x053c, B:298:0x054a, B:300:0x0550, B:303:0x0560, B:304:0x056c, B:306:0x0572, B:308:0x0587, B:312:0x0590, B:313:0x059a, B:315:0x05a0, B:317:0x05b7, B:321:0x05c0, B:323:0x05ca, B:324:0x05d0, B:325:0x05e6, B:327:0x05ec, B:329:0x0617, B:330:0x0621, B:332:0x0627, B:338:0x0641, B:343:0x0651, B:344:0x065b, B:346:0x0661, B:349:0x066e, B:354:0x0672, B:355:0x067b, B:357:0x0681, B:359:0x068b, B:360:0x068f, B:362:0x0695, B:364:0x069f, B:365:0x06ad, B:367:0x06b3, B:369:0x06c1, B:370:0x06ca, B:372:0x06d0, B:374:0x06e5, B:392:0x06e9, B:376:0x06ed, B:379:0x06f7, B:381:0x06ff, B:386:0x0703, B:388:0x0708, B:389:0x070b, B:395:0x0717, B:396:0x071c, B:398:0x0722, B:414:0x072e, B:417:0x0736, B:407:0x073c, B:410:0x0744, B:403:0x0748, B:421:0x0753, B:423:0x075a, B:425:0x0760, B:427:0x076e, B:429:0x0775, B:430:0x0779, B:432:0x077f, B:445:0x078f, B:446:0x0798, B:448:0x079e, B:450:0x07aa, B:453:0x07b3, B:454:0x07b8, B:456:0x07be, B:461:0x07d1, B:463:0x07d5, B:464:0x07f4, B:470:0x07de, B:472:0x07e8), top: B:262:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07d5 A[Catch: all -> 0x0809, TryCatch #0 {, blocks: (B:263:0x04e2, B:264:0x04ef, B:266:0x04f5, B:268:0x0501, B:272:0x050a, B:276:0x050d, B:277:0x0511, B:279:0x0517, B:281:0x0521, B:283:0x0529, B:284:0x052c, B:286:0x0540, B:289:0x0546, B:293:0x0531, B:295:0x0539, B:296:0x053c, B:298:0x054a, B:300:0x0550, B:303:0x0560, B:304:0x056c, B:306:0x0572, B:308:0x0587, B:312:0x0590, B:313:0x059a, B:315:0x05a0, B:317:0x05b7, B:321:0x05c0, B:323:0x05ca, B:324:0x05d0, B:325:0x05e6, B:327:0x05ec, B:329:0x0617, B:330:0x0621, B:332:0x0627, B:338:0x0641, B:343:0x0651, B:344:0x065b, B:346:0x0661, B:349:0x066e, B:354:0x0672, B:355:0x067b, B:357:0x0681, B:359:0x068b, B:360:0x068f, B:362:0x0695, B:364:0x069f, B:365:0x06ad, B:367:0x06b3, B:369:0x06c1, B:370:0x06ca, B:372:0x06d0, B:374:0x06e5, B:392:0x06e9, B:376:0x06ed, B:379:0x06f7, B:381:0x06ff, B:386:0x0703, B:388:0x0708, B:389:0x070b, B:395:0x0717, B:396:0x071c, B:398:0x0722, B:414:0x072e, B:417:0x0736, B:407:0x073c, B:410:0x0744, B:403:0x0748, B:421:0x0753, B:423:0x075a, B:425:0x0760, B:427:0x076e, B:429:0x0775, B:430:0x0779, B:432:0x077f, B:445:0x078f, B:446:0x0798, B:448:0x079e, B:450:0x07aa, B:453:0x07b3, B:454:0x07b8, B:456:0x07be, B:461:0x07d1, B:463:0x07d5, B:464:0x07f4, B:470:0x07de, B:472:0x07e8), top: B:262:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void aq(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        boolean z;
        Iterator it;
        Object obj2;
        Object obj3;
        boolean z2;
        Iterator it2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr;
        boolean z8 = ((ae) arrayList.get(i)).s;
        ArrayList arrayList3 = this.M;
        if (arrayList3 == null) {
            this.M = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.M;
        cd cdVar = this.b;
        arrayList4.addAll(cdVar.f());
        bd bdVar = this.o;
        int i9 = i;
        boolean z9 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i2) {
                boolean z10 = z8;
                boolean z11 = z9;
                int i11 = -1;
                this.M.clear();
                if (!z10 && this.k > 0) {
                    for (int i12 = i; i12 < i2; i12++) {
                        ArrayList arrayList5 = ((ae) arrayList.get(i12)).d;
                        int size = arrayList5.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            bd bdVar2 = ((ce) arrayList5.get(i13)).b;
                            if (bdVar2 != null && bdVar2.C != null) {
                                cdVar.l(ai(bdVar2));
                            }
                        }
                    }
                }
                int i14 = i;
                while (i14 < i2) {
                    ae aeVar = (ae) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        int i15 = i11;
                        aeVar.a(i15);
                        ArrayList arrayList6 = aeVar.d;
                        for (int size2 = arrayList6.size() + i15; size2 >= 0; size2--) {
                            ce ceVar = (ce) arrayList6.get(size2);
                            bd bdVar3 = ceVar.b;
                            if (bdVar3 != null) {
                                bdVar3.v = false;
                                bdVar3.al(true);
                                int i16 = aeVar.i;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                                bdVar3.ak(i17);
                                bdVar3.am(aeVar.r, aeVar.q);
                            }
                            switch (ceVar.a) {
                                case 1:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    by byVar = aeVar.a;
                                    byVar.L(bdVar3, true);
                                    byVar.J(bdVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ceVar.a);
                                case 3:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    aeVar.a.ah(bdVar3);
                                    break;
                                case 4:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    by byVar2 = aeVar.a;
                                    ae(bdVar3);
                                    break;
                                case 5:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    by byVar3 = aeVar.a;
                                    byVar3.L(bdVar3, true);
                                    byVar3.H(bdVar3);
                                    break;
                                case 6:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    aeVar.a.l(bdVar3);
                                    break;
                                case 7:
                                    bdVar3.ag(ceVar.d, ceVar.e, ceVar.f, ceVar.g);
                                    by byVar4 = aeVar.a;
                                    byVar4.L(bdVar3, true);
                                    byVar4.n(bdVar3);
                                    break;
                                case 8:
                                    aeVar.a.N(null);
                                    break;
                                case 9:
                                    aeVar.a.N(bdVar3);
                                    break;
                                case 10:
                                    ceVar.i = bdVar3.Z;
                                    aeVar.a.M(bdVar3, ceVar.h);
                                    break;
                            }
                        }
                    } else {
                        aeVar.a(1);
                        ArrayList arrayList7 = aeVar.d;
                        int size3 = arrayList7.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            ce ceVar2 = (ce) arrayList7.get(i19);
                            bd bdVar4 = ceVar2.b;
                            if (bdVar4 != null) {
                                bdVar4.v = false;
                                bdVar4.al(false);
                                bdVar4.ak(aeVar.i);
                                bdVar4.am(aeVar.q, aeVar.r);
                            }
                            switch (ceVar2.a) {
                                case 1:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    by byVar5 = aeVar.a;
                                    byVar5.L(bdVar4, false);
                                    byVar5.ah(bdVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + ceVar2.a);
                                case 3:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    aeVar.a.J(bdVar4);
                                    break;
                                case 4:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    aeVar.a.H(bdVar4);
                                    break;
                                case 5:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    aeVar.a.L(bdVar4, false);
                                    ae(bdVar4);
                                    break;
                                case 6:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    aeVar.a.n(bdVar4);
                                    break;
                                case 7:
                                    bdVar4.ag(ceVar2.d, ceVar2.e, ceVar2.f, ceVar2.g);
                                    by byVar6 = aeVar.a;
                                    byVar6.L(bdVar4, false);
                                    byVar6.l(bdVar4);
                                    break;
                                case 8:
                                    aeVar.a.N(bdVar4);
                                    break;
                                case 9:
                                    aeVar.a.N(null);
                                    break;
                                case 10:
                                    ceVar2.h = bdVar4.Z;
                                    aeVar.a.M(bdVar4, ceVar2.i);
                                    break;
                            }
                        }
                    }
                    i14++;
                    i11 = -1;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z11 && !this.i.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        linkedHashSet.addAll(aa((ae) arrayList.get(i20)));
                    }
                    if (this.e == null) {
                        ArrayList arrayList8 = this.i;
                        int size5 = arrayList8.size();
                        int i21 = 0;
                        while (i21 < size5) {
                            gux guxVar = (gux) arrayList8.get(i21);
                            Iterator it3 = linkedHashSet.iterator();
                            while (true) {
                                i4 = i21 + 1;
                                if (it3.hasNext()) {
                                    guxVar.a((bd) it3.next(), booleanValue);
                                }
                            }
                            i21 = i4;
                        }
                        ArrayList arrayList9 = this.i;
                        int size6 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size6) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (true) {
                                i3 = i22 + 1;
                                if (it4.hasNext()) {
                                }
                            }
                            i22 = i3;
                        }
                    }
                }
                for (int i23 = i; i23 < i2; i23++) {
                    ae aeVar2 = (ae) arrayList.get(i23);
                    if (booleanValue) {
                        ArrayList arrayList10 = aeVar2.d;
                        for (int size7 = arrayList10.size() - 1; size7 >= 0; size7--) {
                            bd bdVar5 = ((ce) arrayList10.get(size7)).b;
                            if (bdVar5 != null) {
                                ai(bdVar5).l();
                            }
                        }
                    } else {
                        ArrayList arrayList11 = aeVar2.d;
                        int size8 = arrayList11.size();
                        for (int i24 = 0; i24 < size8; i24++) {
                            bd bdVar6 = ((ce) arrayList11.get(i24)).b;
                            if (bdVar6 != null) {
                                ai(bdVar6).l();
                            }
                        }
                    }
                }
                I(this.k, true);
                Iterator it5 = i(arrayList, i, i2).iterator();
                while (it5.hasNext()) {
                    cn cnVar = (cn) it5.next();
                    cnVar.e = booleanValue;
                    List list = cnVar.b;
                    synchronized (list) {
                        cnVar.h();
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj = listIterator.previous();
                                cm cmVar = (cm) obj;
                                View view = cmVar.a.R;
                                view.getClass();
                                int N = a.N(view);
                                if (cmVar.h != 2 || N == 2) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                    }
                    ViewGroup viewGroup = cnVar.a;
                    if (viewGroup.isAttachedToWindow()) {
                        synchronized (list) {
                            List list2 = cnVar.c;
                            List<cm> q = ixc.q(list2);
                            list2.clear();
                            for (cm cmVar2 : q) {
                                cmVar2.d = !list.isEmpty() && cmVar2.a.u;
                            }
                            for (cm cmVar3 : q) {
                                if (cnVar.d) {
                                    if (U(2)) {
                                        Objects.toString(cmVar3);
                                    }
                                    cmVar3.a();
                                } else {
                                    if (U(2)) {
                                        Objects.toString(cmVar3);
                                    }
                                    cmVar3.e(viewGroup);
                                }
                                cnVar.d = false;
                                if (!cmVar3.c) {
                                    list2.add(cmVar3);
                                }
                            }
                            if (list.isEmpty()) {
                                z = booleanValue;
                                it = it5;
                            } else {
                                cnVar.h();
                                List<cm> q2 = ixc.q(list);
                                if (!q2.isEmpty()) {
                                    list.clear();
                                    list2.addAll(q2);
                                    boolean z12 = cnVar.e;
                                    Iterator it6 = q2.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            obj2 = it6.next();
                                            cm cmVar4 = (cm) obj2;
                                            View view2 = cmVar4.a.R;
                                            view2.getClass();
                                            if (a.N(view2) != 2 || cmVar4.h == 2) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    cm cmVar5 = (cm) obj2;
                                    ListIterator listIterator2 = q2.listIterator(q2.size());
                                    while (true) {
                                        if (listIterator2.hasPrevious()) {
                                            obj3 = listIterator2.previous();
                                            cm cmVar6 = (cm) obj3;
                                            View view3 = cmVar6.a.R;
                                            view3.getClass();
                                            ListIterator listIterator3 = listIterator2;
                                            if (a.N(view3) == 2 || cmVar6.h != 2) {
                                                listIterator2 = listIterator3;
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    cm cmVar7 = (cm) obj3;
                                    if (U(2)) {
                                        Objects.toString(cmVar5);
                                        Objects.toString(cmVar7);
                                    }
                                    ArrayList<ak> arrayList12 = new ArrayList();
                                    ArrayList arrayList13 = new ArrayList();
                                    bd bdVar7 = ((cm) ixc.h(q2)).a;
                                    Iterator it7 = q2.iterator();
                                    while (it7.hasNext()) {
                                        boolean z13 = booleanValue;
                                        az azVar = ((cm) it7.next()).a.U;
                                        Iterator it8 = it5;
                                        az azVar2 = bdVar7.U;
                                        azVar.b = azVar2.b;
                                        azVar.c = azVar2.c;
                                        azVar.d = azVar2.d;
                                        azVar.e = azVar2.e;
                                        it5 = it8;
                                        booleanValue = z13;
                                        viewGroup = viewGroup;
                                    }
                                    z = booleanValue;
                                    it = it5;
                                    ViewGroup viewGroup2 = viewGroup;
                                    for (cm cmVar8 : q2) {
                                        arrayList12.add(new ak(cmVar8, z12));
                                        if (z12) {
                                            z4 = cmVar8 == cmVar5;
                                        }
                                        arrayList13.add(new ao(cmVar8, z12, z4));
                                        cmVar8.c(new at(cnVar, cmVar8, 1));
                                    }
                                    ArrayList arrayList14 = new ArrayList();
                                    for (Object obj4 : arrayList13) {
                                        if (!((ao) obj4).b()) {
                                            arrayList14.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList15 = new ArrayList();
                                    Iterator it9 = arrayList14.iterator();
                                    while (it9.hasNext()) {
                                        ((ao) it9.next()).a();
                                    }
                                    Iterator it10 = arrayList15.iterator();
                                    while (it10.hasNext()) {
                                        ((ao) it10.next()).a();
                                    }
                                    ArrayList<ak> arrayList16 = new ArrayList();
                                    ArrayList arrayList17 = new ArrayList();
                                    Iterator it11 = arrayList12.iterator();
                                    while (it11.hasNext()) {
                                        ixc.v(arrayList17, ((ak) it11.next()).a.g);
                                    }
                                    boolean isEmpty = arrayList17.isEmpty();
                                    boolean z14 = false;
                                    for (ak akVar : arrayList12) {
                                        cm cmVar9 = akVar.a;
                                        Context context = viewGroup2.getContext();
                                        context.getClass();
                                        brr a = akVar.a(context);
                                        if (a != null) {
                                            if (a.b == null) {
                                                arrayList16.add(akVar);
                                            } else {
                                                bd bdVar8 = cmVar9.a;
                                                if (cmVar9.g.isEmpty()) {
                                                    if (cmVar9.h == 3) {
                                                        cmVar9.g();
                                                    }
                                                    cmVar9.d(new am(akVar));
                                                    z14 = true;
                                                } else if (U(2)) {
                                                    Objects.toString(bdVar8);
                                                }
                                            }
                                        }
                                    }
                                    for (ak akVar2 : arrayList16) {
                                        cm cmVar10 = akVar2.a;
                                        bd bdVar9 = cmVar10.a;
                                        if (isEmpty) {
                                            if (!z14) {
                                                cmVar10.d(new aj(akVar2));
                                            } else if (U(2)) {
                                                Objects.toString(bdVar9);
                                            }
                                        } else if (U(2)) {
                                            Objects.toString(bdVar9);
                                        }
                                    }
                                    Iterator it12 = q2.iterator();
                                    while (true) {
                                        boolean z15 = true;
                                        while (it12.hasNext()) {
                                            List list3 = ((cm) it12.next()).g;
                                            if (!list3.isEmpty()) {
                                                if (list3.isEmpty()) {
                                                    break;
                                                }
                                                Iterator it13 = list3.iterator();
                                                while (it13.hasNext()) {
                                                    if (!((ck) it13.next()).d()) {
                                                        break;
                                                    }
                                                }
                                            }
                                            z15 = false;
                                        }
                                        if (z15) {
                                            ArrayList arrayList18 = new ArrayList();
                                            Iterator it14 = q2.iterator();
                                            while (it14.hasNext()) {
                                                ixc.v(arrayList18, ((cm) it14.next()).g);
                                            }
                                            if (!arrayList18.isEmpty()) {
                                                z2 = true;
                                                it2 = q2.iterator();
                                                z3 = true;
                                                while (it2.hasNext()) {
                                                    z3 &= ((cm) it2.next()).a.u;
                                                }
                                                cnVar.d = (z3 || z2) ? false : true;
                                                if (z3) {
                                                    cnVar.g(q2);
                                                    cnVar.e(q2);
                                                } else if (z2) {
                                                    cnVar.g(q2);
                                                    int size9 = q2.size();
                                                    for (int i25 = 0; i25 < size9; i25++) {
                                                        cnVar.d((cm) q2.get(i25));
                                                    }
                                                }
                                                cnVar.e = false;
                                            }
                                        }
                                        z2 = false;
                                        it2 = q2.iterator();
                                        z3 = true;
                                        while (it2.hasNext()) {
                                        }
                                        cnVar.d = (z3 || z2) ? false : true;
                                        if (z3) {
                                        }
                                        cnVar.e = false;
                                    }
                                }
                            }
                            it5 = it;
                            booleanValue = z;
                        }
                    } else {
                        cnVar.f();
                        cnVar.e = false;
                    }
                }
                for (int i26 = i; i26 < i2; i26++) {
                    ae aeVar3 = (ae) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue() && aeVar3.c >= 0) {
                        aeVar3.c = -1;
                    }
                    if (aeVar3.t != null) {
                        for (int i27 = 0; i27 < aeVar3.t.size(); i27++) {
                            ((Runnable) aeVar3.t.get(i27)).run();
                        }
                        aeVar3.t = null;
                    }
                }
                if (z11) {
                    for (int i28 = 0; i28 < this.i.size(); i28++) {
                        gux guxVar2 = (gux) this.i.get(i28);
                        if (guxVar2.b) {
                            guxVar2.b = false;
                            gta.o();
                        } else {
                            gtt gttVar = guxVar2.a;
                            if (gttVar != null) {
                                gttVar.close();
                                guxVar2.a = null;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            ae aeVar4 = (ae) arrayList.get(i9);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i9)).booleanValue();
            ArrayList arrayList19 = this.M;
            if (booleanValue2) {
                z5 = z8;
                i5 = i9;
                z6 = z9;
                int i29 = 1;
                ArrayList arrayList20 = aeVar4.d;
                int size10 = arrayList20.size() - 1;
                while (size10 >= 0) {
                    ce ceVar3 = (ce) arrayList20.get(size10);
                    int i30 = ceVar3.a;
                    if (i30 != i29) {
                        if (i30 != 3) {
                            switch (i30) {
                                case 8:
                                    bdVar = null;
                                    break;
                                case 9:
                                    bdVar = ceVar3.b;
                                    break;
                                case 10:
                                    ceVar3.i = ceVar3.h;
                                    break;
                            }
                            size10--;
                            i29 = 1;
                        }
                        arrayList19.add(ceVar3.b);
                        size10--;
                        i29 = 1;
                    }
                    arrayList19.remove(ceVar3.b);
                    size10--;
                    i29 = 1;
                }
            } else {
                int i31 = 0;
                while (true) {
                    ArrayList arrayList21 = aeVar4.d;
                    if (i31 < arrayList21.size()) {
                        ce ceVar4 = (ce) arrayList21.get(i31);
                        boolean z16 = z8;
                        int i32 = ceVar4.a;
                        if (i32 != i10) {
                            if (i32 == 2) {
                                i6 = i9;
                                bd bdVar10 = ceVar4.b;
                                int i33 = bdVar10.H;
                                int size11 = arrayList19.size() - 1;
                                boolean z17 = false;
                                while (size11 >= 0) {
                                    boolean z18 = z9;
                                    bd bdVar11 = (bd) arrayList19.get(size11);
                                    int i34 = size11;
                                    if (bdVar11.H != i33) {
                                        i8 = i33;
                                    } else if (bdVar11 == bdVar10) {
                                        i8 = i33;
                                        z17 = true;
                                    } else {
                                        if (bdVar11 == bdVar) {
                                            i8 = i33;
                                            bArr = null;
                                            arrayList21.add(i31, new ce(9, bdVar11, null));
                                            i31++;
                                            bdVar = null;
                                        } else {
                                            i8 = i33;
                                            bArr = null;
                                        }
                                        ce ceVar5 = new ce(3, bdVar11, bArr);
                                        ceVar5.d = ceVar4.d;
                                        ceVar5.f = ceVar4.f;
                                        ceVar5.e = ceVar4.e;
                                        ceVar5.g = ceVar4.g;
                                        arrayList21.add(i31, ceVar5);
                                        arrayList19.remove(bdVar11);
                                        i31++;
                                        bdVar = bdVar;
                                    }
                                    size11 = i34 - 1;
                                    i33 = i8;
                                    z9 = z18;
                                }
                                z7 = z9;
                                i7 = 1;
                                if (z17) {
                                    arrayList21.remove(i31);
                                    i31--;
                                } else {
                                    ceVar4.a = 1;
                                    ceVar4.c = true;
                                    arrayList19.add(bdVar10);
                                }
                            } else if (i32 == 3 || i32 == 6) {
                                i6 = i9;
                                arrayList19.remove(ceVar4.b);
                                bd bdVar12 = ceVar4.b;
                                if (bdVar12 == bdVar) {
                                    arrayList21.add(i31, new ce(9, bdVar12));
                                    i31++;
                                    z7 = z9;
                                    bdVar = null;
                                    i7 = 1;
                                }
                                z7 = z9;
                                i7 = 1;
                            } else if (i32 == 7) {
                                i6 = i9;
                                i7 = 1;
                            } else if (i32 != 8) {
                                i6 = i9;
                                z7 = z9;
                                i7 = 1;
                            } else {
                                i6 = i9;
                                arrayList21.add(i31, new ce(9, bdVar, null));
                                ceVar4.c = true;
                                bdVar = ceVar4.b;
                                z7 = z9;
                                i31++;
                                i7 = 1;
                            }
                            i31 += i7;
                            i10 = i7;
                            z8 = z16;
                            i9 = i6;
                            z9 = z7;
                        } else {
                            i6 = i9;
                            i7 = i10;
                        }
                        z7 = z9;
                        arrayList19.add(ceVar4.b);
                        i31 += i7;
                        i10 = i7;
                        z8 = z16;
                        i9 = i6;
                        z9 = z7;
                    } else {
                        z5 = z8;
                        i5 = i9;
                        z6 = z9;
                    }
                }
            }
            z9 = z6 || aeVar4.j;
            i9 = i5 + 1;
            z8 = z5;
        }
    }

    private final void ar() {
        for (cn cnVar : al()) {
        }
    }

    private final void as(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((ae) arrayList.get(i)).s) {
                if (i2 != i) {
                    aq(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ae) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                aq(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            aq(arrayList, arrayList2, i2, size);
        }
    }

    private final void at(bd bdVar) {
        ViewGroup ak = ak(bdVar);
        if (ak == null || bdVar.t() + bdVar.u() + bdVar.v() + bdVar.w() <= 0) {
            return;
        }
        if (ak.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            ak.setTag(R.id.visible_removing_fragment_view_tag, bdVar);
        }
        ((bd) ak.getTag(R.id.visible_removing_fragment_view_tag)).al(bdVar.an());
    }

    private final void au() {
        for (gam gamVar : this.b.d()) {
            bd bdVar = (bd) gamVar.e;
            if (bdVar.S) {
                if (this.y) {
                    this.J = true;
                } else {
                    bdVar.S = false;
                    gamVar.l();
                }
            }
        }
    }

    public static bd e(View view) {
        while (view != null) {
            bd f = f(view);
            if (f != null) {
                return f;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static bd f(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof bd) {
            return (bd) tag;
        }
        return null;
    }

    public final void A() {
        this.s = false;
        this.t = false;
        this.v.g = false;
        B(5);
    }

    public final void B(int i) {
        try {
            this.y = true;
            for (gam gamVar : this.b.b.values()) {
                if (gamVar != null) {
                    gamVar.b = i;
                }
            }
            I(i, false);
            Iterator it = al().iterator();
            while (it.hasNext()) {
                ((cn) it.next()).f();
            }
            this.y = false;
            af(true);
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    public final void C() {
        this.t = true;
        this.v.g = true;
        B(4);
    }

    public final void D(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        cd cdVar = this.b;
        HashMap hashMap = cdVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (gam gamVar : hashMap.values()) {
                printWriter.print(str);
                if (gamVar != null) {
                    String valueOf = String.valueOf(str);
                    Object obj = gamVar.e;
                    printWriter.println(obj);
                    ((bd) obj).T(valueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = cdVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                bd bdVar = (bd) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(bdVar.toString());
            }
        }
        ArrayList arrayList2 = this.z;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                bd bdVar2 = (bd) this.z.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(bdVar2.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String valueOf2 = String.valueOf(str);
                ae aeVar = (ae) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aeVar.toString());
                aeVar.e(valueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.h.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    bv bvVar = (bv) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(bvVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.n);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.k);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
    }

    public final void E() {
        Iterator it = al().iterator();
        while (it.hasNext()) {
            ((cn) it.next()).f();
        }
    }

    final void F(bv bvVar, boolean z) {
        if (!z) {
            if (this.l == null) {
                if (!this.u) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            am();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.l == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(bvVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.l.d.removeCallbacks(this.N);
                    this.l.d.post(this.N);
                    P();
                }
            }
        }
    }

    final void G(bv bvVar, boolean z) {
        if (z && (this.l == null || this.u)) {
            return;
        }
        ap(z);
        ae aeVar = this.e;
        if (aeVar != null) {
            aeVar.b = false;
            aeVar.b();
            if (U(3)) {
                Objects.toString(this.e);
                Objects.toString(bvVar);
            }
            this.e.h(false, false);
            this.e.f(this.K, this.L);
            ArrayList arrayList = this.e.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bd bdVar = ((ce) arrayList.get(i)).b;
                if (bdVar != null) {
                    bdVar.u = false;
                }
            }
            this.e = null;
        }
        bvVar.f(this.K, this.L);
        this.y = true;
        try {
            as(this.K, this.L);
            an();
            P();
            ao();
            this.b.h();
        } catch (Throwable th) {
            an();
            throw th;
        }
    }

    final void H(bd bdVar) {
        if (U(2)) {
            Objects.toString(bdVar);
        }
        if (bdVar.J) {
            return;
        }
        bdVar.J = true;
        bdVar.V = true ^ bdVar.V;
        at(bdVar);
    }

    final void I(int i, boolean z) {
        bl blVar;
        if (this.l == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.k) {
            this.k = i;
            cd cdVar = this.b;
            ArrayList arrayList = cdVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gam gamVar = (gam) cdVar.b.get(((bd) arrayList.get(i2)).m);
                if (gamVar != null) {
                    gamVar.l();
                }
            }
            for (gam gamVar2 : cdVar.b.values()) {
                if (gamVar2 != null) {
                    gamVar2.l();
                    bd bdVar = (bd) gamVar2.e;
                    if (bdVar.t && !bdVar.aq()) {
                        boolean z2 = bdVar.v;
                        cdVar.m(gamVar2);
                    }
                }
            }
            au();
            if (this.r && (blVar = this.l) != null && this.k == 7) {
                blVar.d();
                this.r = false;
            }
        }
    }

    final void J(bd bdVar) {
        if (U(2)) {
            Objects.toString(bdVar);
            int i = bdVar.B;
        }
        boolean aq = bdVar.aq();
        if (bdVar.K && aq) {
            return;
        }
        this.b.i(bdVar);
        if (ab(bdVar)) {
            this.r = true;
        }
        bdVar.t = true;
        at(bdVar);
    }

    final void K(Parcelable parcelable) {
        gam gamVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.l.c.getClassLoader());
                this.B.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.l.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        cd cdVar = this.b;
        HashMap hashMap2 = cdVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        bz bzVar = (bz) bundle3.getParcelable("state");
        if (bzVar == null) {
            return;
        }
        cdVar.b.clear();
        ArrayList arrayList = bzVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle a = cdVar.a((String) arrayList.get(i), null);
            if (a != null) {
                bd bdVar = (bd) this.v.b.get(((cc) a.getParcelable("state")).b);
                if (bdVar != null) {
                    if (U(2)) {
                        Objects.toString(bdVar);
                    }
                    gamVar = new gam(this.x, cdVar, bdVar, a);
                } else {
                    gamVar = new gam(this.x, cdVar, this.l.c.getClassLoader(), g(), a);
                }
                Object obj = gamVar.e;
                bd bdVar2 = (bd) obj;
                bdVar2.i = a;
                bdVar2.C = this;
                if (U(2)) {
                    String str3 = bdVar2.m;
                    Objects.toString(obj);
                }
                gamVar.m(this.l.c.getClassLoader());
                cdVar.l(gamVar);
                gamVar.b = this.k;
            }
        }
        for (bd bdVar3 : new ArrayList(this.v.b.values())) {
            if (!cdVar.j(bdVar3.m)) {
                if (U(2)) {
                    Objects.toString(bdVar3);
                    Objects.toString(bzVar.a);
                }
                this.v.d(bdVar3);
                bdVar3.C = this;
                gam gamVar2 = new gam(this.x, cdVar, bdVar3);
                gamVar2.b = 1;
                gamVar2.l();
                bdVar3.t = true;
                gamVar2.l();
            }
        }
        ArrayList<String> arrayList2 = bzVar.b;
        cdVar.a.clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                bd b = cdVar.b(str4);
                if (b == null) {
                    throw new IllegalStateException(a.Z(str4, "No instantiated fragment for (", ")"));
                }
                if (U(2)) {
                    Objects.toString(b);
                }
                cdVar.g(b);
            }
        }
        af[] afVarArr = bzVar.c;
        if (afVarArr != null) {
            this.c = new ArrayList(afVarArr.length);
            int i2 = 0;
            while (true) {
                af[] afVarArr2 = bzVar.c;
                if (i2 >= afVarArr2.length) {
                    break;
                }
                af afVar = afVarArr2[i2];
                ae aeVar = new ae(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = afVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    ce ceVar = new ce();
                    int i5 = i3 + 1;
                    ceVar.a = iArr[i3];
                    if (U(2)) {
                        aeVar.toString();
                        int i6 = iArr[i5];
                    }
                    ceVar.h = aek.values()[afVar.c[i4]];
                    ceVar.i = aek.values()[afVar.d[i4]];
                    int i7 = i3 + 2;
                    ceVar.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    ceVar.d = i8;
                    int i9 = iArr[i3 + 3];
                    ceVar.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    ceVar.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    ceVar.g = i12;
                    aeVar.e = i8;
                    aeVar.f = i9;
                    aeVar.g = i11;
                    aeVar.h = i12;
                    aeVar.k(ceVar);
                    i4++;
                }
                aeVar.i = afVar.e;
                aeVar.l = afVar.f;
                aeVar.j = true;
                aeVar.m = afVar.h;
                aeVar.n = afVar.i;
                aeVar.o = afVar.j;
                aeVar.p = afVar.k;
                aeVar.q = afVar.l;
                aeVar.r = afVar.m;
                aeVar.s = afVar.n;
                aeVar.c = afVar.g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = afVar.b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str5 = (String) arrayList3.get(i13);
                    if (str5 != null) {
                        ((ce) aeVar.d.get(i13)).b = b(str5);
                    }
                    i13++;
                }
                aeVar.a(1);
                if (U(2)) {
                    int i14 = aeVar.c;
                    aeVar.toString();
                    PrintWriter printWriter = new PrintWriter(new cj());
                    aeVar.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(aeVar);
                i2++;
            }
        } else {
            this.c = new ArrayList();
        }
        this.h.set(bzVar.d);
        String str6 = bzVar.e;
        if (str6 != null) {
            bd b2 = b(str6);
            this.o = b2;
            w(b2);
        }
        ArrayList arrayList4 = bzVar.f;
        if (arrayList4 != null) {
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                this.A.put((String) arrayList4.get(i15), (ah) bzVar.g.get(i15));
            }
        }
        this.q = new ArrayDeque(bzVar.h);
    }

    final void L(bd bdVar, boolean z) {
        ViewGroup ak = ak(bdVar);
        if (ak == null || !(ak instanceof bj)) {
            return;
        }
        ((bj) ak).a = !z;
    }

    final void M(bd bdVar, aek aekVar) {
        if (!bdVar.equals(b(bdVar.m)) || (bdVar.D != null && bdVar.C != this)) {
            throw new IllegalArgumentException(a.ae(this, bdVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bdVar.Z = aekVar;
    }

    final void N(bd bdVar) {
        if (bdVar != null && (!bdVar.equals(b(bdVar.m)) || (bdVar.D != null && bdVar.C != this))) {
            throw new IllegalArgumentException(a.ae(this, bdVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bd bdVar2 = this.o;
        this.o = bdVar;
        w(bdVar2);
        w(this.o);
    }

    public final void O(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new cj());
        bl blVar = this.l;
        if (blVar == null) {
            try {
                D("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((bf) blVar).a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void P() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.g.f(true);
                if (U(3)) {
                    toString();
                }
            } else {
                boolean z = this.c.size() + (this.e != null ? 1 : 0) > 0 && W(this.n);
                if (U(3)) {
                    toString();
                }
                this.g.f(z);
            }
        }
    }

    final boolean Q(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null) {
                if (!bdVar.J ? bdVar.aC() ? true : bdVar.E.Q(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean R(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.k <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (bd bdVar : this.b.f()) {
            if (bdVar != null && ac(bdVar) && !bdVar.J) {
                if (bdVar.N && bdVar.O) {
                    bdVar.Y(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | bdVar.E.R(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bdVar);
                    z2 = true;
                }
            }
        }
        if (this.z != null) {
            for (int i = 0; i < this.z.size(); i++) {
                bd bdVar2 = (bd) this.z.get(i);
                if (arrayList != null) {
                    arrayList.contains(bdVar2);
                }
            }
        }
        this.z = arrayList;
        return z2;
    }

    public final boolean S(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null) {
                if (!bdVar.J ? (bdVar.N && bdVar.O && bdVar.as(menuItem)) ? true : bdVar.E.S(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean T(Menu menu) {
        boolean z;
        if (this.k <= 0) {
            return false;
        }
        boolean z2 = false;
        for (bd bdVar : this.b.f()) {
            if (bdVar != null && ac(bdVar) && !bdVar.J) {
                if (bdVar.N && bdVar.O) {
                    bdVar.ab(menu);
                    z = true;
                } else {
                    z = false;
                }
                if (bdVar.E.T(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean V() {
        bd bdVar = this.n;
        if (bdVar == null) {
            return true;
        }
        return bdVar.ao() && bdVar.G().V();
    }

    final boolean W(bd bdVar) {
        if (bdVar == null) {
            return true;
        }
        by byVar = bdVar.C;
        return bdVar.equals(byVar.o) && W(byVar.n);
    }

    public final boolean X() {
        return this.s || this.t;
    }

    public final void Y(gux guxVar) {
        this.i.add(guxVar);
    }

    public final void Z() {
        af(true);
        ar();
    }

    public final Bundle a() {
        af[] afVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        ar();
        E();
        af(true);
        this.s = true;
        this.v.g = true;
        cd cdVar = this.b;
        HashMap hashMap = cdVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (gam gamVar : hashMap.values()) {
            if (gamVar != null) {
                Object obj = gamVar.e;
                bd bdVar = (bd) obj;
                cdVar.a(bdVar.m, gamVar.h());
                arrayList2.add(bdVar.m);
                if (U(2)) {
                    Objects.toString(obj);
                    Objects.toString(bdVar.i);
                }
            }
        }
        HashMap hashMap2 = cdVar.c;
        if (!hashMap2.isEmpty()) {
            ArrayList arrayList3 = cdVar.a;
            synchronized (arrayList3) {
                afVarArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        bd bdVar2 = (bd) it.next();
                        arrayList.add(bdVar2.m);
                        if (U(2)) {
                            String str = bdVar2.m;
                            Objects.toString(bdVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                afVarArr = new af[size];
                for (int i = 0; i < size; i++) {
                    afVarArr[i] = new af((ae) this.c.get(i));
                    if (U(2)) {
                        Objects.toString(this.c.get(i));
                    }
                }
            }
            bz bzVar = new bz();
            bzVar.a = arrayList2;
            bzVar.b = arrayList;
            bzVar.c = afVarArr;
            bzVar.d = this.h.get();
            bd bdVar3 = this.o;
            if (bdVar3 != null) {
                bzVar.e = bdVar3.m;
            }
            ArrayList arrayList4 = bzVar.f;
            Map map = this.A;
            arrayList4.addAll(map.keySet());
            bzVar.g.addAll(map.values());
            bzVar.h = new ArrayList(this.q);
            bundle.putParcelable("state", bzVar);
            Map map2 = this.B;
            for (String str2 : map2.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str2)), (Bundle) map2.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) hashMap2.get(str3));
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean ad(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        if (!this.c.isEmpty()) {
            if (i < 0) {
                i3 = i2 != 0 ? 0 : this.c.size() - 1;
            } else {
                int size = this.c.size() - 1;
                while (size >= 0 && i != ((ae) this.c.get(size)).c) {
                    size--;
                }
                if (size >= 0) {
                    if (i2 != 0) {
                        while (size > 0) {
                            int i4 = size - 1;
                            if (i != ((ae) this.c.get(i4)).c) {
                                break;
                            }
                            size = i4;
                        }
                    } else if (size != this.c.size() - 1) {
                        i3 = size + 1;
                    }
                }
                i3 = size;
            }
            if (i3 >= 0) {
                return false;
            }
            for (int size2 = this.c.size() - 1; size2 >= i3; size2--) {
                arrayList.add((ae) this.c.remove(size2));
                arrayList2.add(true);
            }
            return true;
        }
        i3 = -1;
        if (i3 >= 0) {
        }
    }

    public final void af(boolean z) {
        ae aeVar;
        ap(z);
        if (!this.f && (aeVar = this.e) != null) {
            aeVar.b = false;
            aeVar.b();
            if (U(3)) {
                Objects.toString(this.e);
                Objects.toString(this.a);
            }
            this.e.h(false, false);
            this.a.add(0, this.e);
            ArrayList arrayList = this.e.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bd bdVar = ((ce) arrayList.get(i)).b;
                if (bdVar != null) {
                    bdVar.u = false;
                }
            }
            this.e = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        z2 |= ((bv) arrayList4.get(i2)).f(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.l.d.removeCallbacks(this.N);
                    if (!z2) {
                        break;
                    }
                    this.y = true;
                    try {
                        as(this.K, this.L);
                    } finally {
                        an();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.l.d.removeCallbacks(this.N);
                    throw th;
                }
            }
        }
        P();
        ao();
        this.b.h();
    }

    public final boolean ag(int i) {
        af(false);
        ap(true);
        bd bdVar = this.o;
        if (bdVar != null && bdVar.F().ag(0)) {
            return true;
        }
        boolean ad = ad(this.K, this.L, -1, i);
        if (ad) {
            this.y = true;
            try {
                as(this.K, this.L);
            } finally {
                an();
            }
        }
        P();
        ao();
        this.b.h();
        return ad;
    }

    final gam ah(bd bdVar) {
        String str = bdVar.Y;
        if (str != null) {
            ado.a(bdVar, str);
        }
        if (U(2)) {
            Objects.toString(bdVar);
        }
        gam ai = ai(bdVar);
        bdVar.C = this;
        cd cdVar = this.b;
        cdVar.l(ai);
        if (!bdVar.K) {
            cdVar.g(bdVar);
            bdVar.t = false;
            if (bdVar.R == null) {
                bdVar.V = false;
            }
            if (ab(bdVar)) {
                this.r = true;
            }
        }
        return ai;
    }

    final gam ai(bd bdVar) {
        cd cdVar = this.b;
        gam k = cdVar.k(bdVar.m);
        if (k != null) {
            return k;
        }
        gam gamVar = new gam(this.x, cdVar, bdVar);
        gamVar.m(this.l.c.getClassLoader());
        gamVar.b = this.k;
        return gamVar;
    }

    final e aj() {
        bd bdVar = this.n;
        return bdVar != null ? bdVar.C.aj() : this.O;
    }

    public final bd b(String str) {
        return this.b.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [bd] */
    public final bd c(int i) {
        ?? r2;
        cd cdVar = this.b;
        ArrayList arrayList = cdVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                Iterator it = cdVar.b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r2 = 0;
                        break;
                    }
                    gam gamVar = (gam) it.next();
                    if (gamVar != null) {
                        r2 = gamVar.e;
                        if (((bd) r2).G == i) {
                            break;
                        }
                    }
                }
            } else {
                r2 = (bd) arrayList.get(size);
                if (r2 != 0 && r2.G == i) {
                    break;
                }
            }
        }
        return (bd) r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bd d(String str) {
        bd bdVar;
        cd cdVar = this.b;
        if (str != null) {
            ArrayList arrayList = cdVar.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                bdVar = (bd) arrayList.get(size);
                if (bdVar != null && str.equals(bdVar.I)) {
                    break;
                }
            }
            return bdVar;
        }
        bdVar = null;
        if (str != null) {
            Iterator it = cdVar.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                gam gamVar = (gam) it.next();
                if (gamVar != null) {
                    Object obj = gamVar.e;
                    if (str.equals(((bd) obj).I)) {
                        bdVar = obj;
                        break;
                    }
                }
            }
        }
        return bdVar;
    }

    public final bk g() {
        bd bdVar = this.n;
        return bdVar != null ? bdVar.C.g() : this.G;
    }

    public final List h() {
        return this.b.f();
    }

    final Set i(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((ae) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                bd bdVar = ((ce) arrayList2.get(i3)).b;
                if (bdVar != null && (viewGroup = bdVar.Q) != null) {
                    hashSet.add(cn.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void j(cb cbVar) {
        this.j.add(cbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ame, bl] */
    /* JADX WARN: Type inference failed for: r4v8, types: [bl, oi] */
    public final void k(bl blVar, bi biVar, bd bdVar) {
        ca caVar;
        if (this.l != null) {
            throw new IllegalStateException("Already attached");
        }
        this.l = blVar;
        this.m = biVar;
        this.n = bdVar;
        if (bdVar != null) {
            j(new br());
        } else if (blVar instanceof cb) {
            j(blVar);
        }
        if (this.n != null) {
            P();
        }
        if (blVar instanceof nw) {
            oe f = blVar.f();
            this.w = f;
            f.b(bdVar != null ? bdVar : blVar, this.g);
        }
        int i = 0;
        if (bdVar != null) {
            ca caVar2 = bdVar.C.v;
            HashMap hashMap = caVar2.c;
            caVar = (ca) hashMap.get(bdVar.m);
            if (caVar == null) {
                caVar = new ca(caVar2.e);
                hashMap.put(bdVar.m, caVar);
            }
            this.v = caVar;
        } else {
            if (blVar instanceof agl) {
                caVar = (ca) new agj(blVar.O(), ca.a).a(ca.class);
                this.v = caVar;
            } else {
                caVar = new ca(false);
                this.v = caVar;
            }
            bdVar = null;
        }
        caVar.g = X();
        this.b.d = caVar;
        ?? r4 = this.l;
        if ((r4 instanceof ame) && bdVar == null) {
            boe aE = r4.aE();
            aE.b("android:support:fragments", new bn(this, i));
            Bundle a = aE.a("android:support:fragments");
            if (a != null) {
                K(a);
            }
        }
        ?? r42 = this.l;
        if (r42 instanceof oi) {
            oh c = r42.c();
            String concat = bdVar != null ? String.valueOf(bdVar.m).concat(":") : "";
            om omVar = new om();
            bs bsVar = new bs(this, 0);
            String concat2 = "FragmentManager:".concat(concat);
            this.p = c.a(concat2.concat("StartActivityForResult"), omVar, bsVar);
            this.H = c.a(concat2.concat("StartIntentSenderForResult"), new bt(), new bs(this, 2));
            this.I = c.a(concat2.concat("RequestPermissions"), new ol(), new bs(this, 1));
        }
        bl blVar2 = this.l;
        if (blVar2 instanceof up) {
            ((bf) blVar2).a.r(this.C);
        }
        bl blVar3 = this.l;
        if (blVar3 instanceof uq) {
            wo woVar = this.D;
            bg bgVar = ((bf) blVar3).a;
            woVar.getClass();
            bgVar.i.add(woVar);
        }
        bl blVar4 = this.l;
        if (blVar4 instanceof ul) {
            wo woVar2 = this.E;
            bg bgVar2 = ((bf) blVar4).a;
            woVar2.getClass();
            bgVar2.k.add(woVar2);
        }
        bl blVar5 = this.l;
        if (blVar5 instanceof um) {
            wo woVar3 = this.F;
            bg bgVar3 = ((bf) blVar5).a;
            woVar3.getClass();
            bgVar3.l.add(woVar3);
        }
        bl blVar6 = this.l;
        if ((blVar6 instanceof xk) && bdVar == null) {
            kee keeVar = this.P;
            bg bgVar4 = ((bf) blVar6).a;
            keeVar.getClass();
            bvw bvwVar = bgVar4.n;
            ((CopyOnWriteArrayList) bvwVar.b).add(keeVar);
            bvwVar.c.run();
        }
    }

    final void l(bd bdVar) {
        if (U(2)) {
            Objects.toString(bdVar);
        }
        if (bdVar.K) {
            bdVar.K = false;
            if (bdVar.s) {
                return;
            }
            this.b.g(bdVar);
            if (U(2)) {
                Objects.toString(bdVar);
            }
            if (ab(bdVar)) {
                this.r = true;
            }
        }
    }

    final void m() {
        if (U(3)) {
            Objects.toString(this.e);
        }
        ae aeVar = this.e;
        if (aeVar != null) {
            aeVar.b = false;
            aeVar.b();
            ae aeVar2 = this.e;
            bo boVar = new bo(this, 0);
            if (aeVar2.t == null) {
                aeVar2.t = new ArrayList();
            }
            aeVar2.t.add(boVar);
            this.e.h(false, true);
            this.f = true;
            Z();
            this.f = false;
            this.e = null;
        }
    }

    final void n(bd bdVar) {
        if (U(2)) {
            Objects.toString(bdVar);
        }
        if (bdVar.K) {
            return;
        }
        bdVar.K = true;
        if (bdVar.s) {
            if (U(2)) {
                Objects.toString(bdVar);
            }
            this.b.i(bdVar);
            if (ab(bdVar)) {
                this.r = true;
            }
            at(bdVar);
        }
    }

    public void noteStateNotSaved() {
        if (this.l == null) {
            return;
        }
        this.s = false;
        this.t = false;
        this.v.g = false;
        for (bd bdVar : this.b.f()) {
            if (bdVar != null) {
                bdVar.E.noteStateNotSaved();
            }
        }
    }

    public final void o() {
        this.s = false;
        this.t = false;
        this.v.g = false;
        B(4);
    }

    final void p(Configuration configuration, boolean z) {
        if (z && (this.l instanceof up)) {
            O(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null) {
                bdVar.onConfigurationChanged(configuration);
                if (z) {
                    bdVar.E.p(configuration, true);
                }
            }
        }
    }

    final void q() {
        this.s = false;
        this.t = false;
        this.v.g = false;
        B(1);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void r() {
        this.u = true;
        af(true);
        E();
        bl blVar = this.l;
        if (blVar instanceof agl ? this.b.d.f : true ^ ((Activity) blVar.c).isChangingConfigurations()) {
            Iterator it = this.A.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ah) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.b((String) it2.next(), false);
                }
            }
        }
        B(-1);
        bl blVar2 = this.l;
        if (blVar2 instanceof uq) {
            wo woVar = this.D;
            bg bgVar = ((bf) blVar2).a;
            woVar.getClass();
            bgVar.i.remove(woVar);
        }
        bl blVar3 = this.l;
        if (blVar3 instanceof up) {
            wo woVar2 = this.C;
            bg bgVar2 = ((bf) blVar3).a;
            woVar2.getClass();
            bgVar2.h.remove(woVar2);
        }
        bl blVar4 = this.l;
        if (blVar4 instanceof ul) {
            wo woVar3 = this.E;
            bg bgVar3 = ((bf) blVar4).a;
            woVar3.getClass();
            bgVar3.k.remove(woVar3);
        }
        bl blVar5 = this.l;
        if (blVar5 instanceof um) {
            wo woVar4 = this.F;
            bg bgVar4 = ((bf) blVar5).a;
            woVar4.getClass();
            bgVar4.l.remove(woVar4);
        }
        bl blVar6 = this.l;
        if ((blVar6 instanceof xk) && this.n == null) {
            kee keeVar = this.P;
            bg bgVar5 = ((bf) blVar6).a;
            keeVar.getClass();
            bvw bvwVar = bgVar5.n;
            ((CopyOnWriteArrayList) bvwVar.b).remove(keeVar);
            if (((yg) bvwVar.a.remove(keeVar)) != null) {
                throw null;
            }
            bvwVar.c.run();
        }
        this.l = null;
        this.m = null;
        this.n = null;
        if (this.w != null) {
            this.g.e();
            this.w = null;
        }
        oc ocVar = this.p;
        if (ocVar != null) {
            ocVar.a();
            this.H.a();
            this.I.a();
        }
    }

    final void s(boolean z) {
        if (z && (this.l instanceof uq)) {
            O(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null) {
                bdVar.onLowMemory();
                if (z) {
                    bdVar.E.s(true);
                }
            }
        }
    }

    final void t(boolean z, boolean z2) {
        if (z2 && (this.l instanceof ul)) {
            O(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null && z2) {
                bdVar.E.t(z, true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bd bdVar = this.n;
        if (bdVar != null) {
            sb.append(bdVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.n)));
            sb.append("}");
        } else {
            bl blVar = this.l;
            if (blVar != null) {
                sb.append(blVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.l)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        for (bd bdVar : this.b.e()) {
            if (bdVar != null) {
                bdVar.E.u();
            }
        }
    }

    public final void v(Menu menu) {
        if (this.k <= 0) {
            return;
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null && !bdVar.J) {
                bdVar.E.v(menu);
            }
        }
    }

    public final void w(bd bdVar) {
        if (bdVar == null || !bdVar.equals(b(bdVar.m))) {
            return;
        }
        boolean W = bdVar.C.W(bdVar);
        Boolean bool = bdVar.r;
        if (bool == null || bool.booleanValue() != W) {
            bdVar.r = Boolean.valueOf(W);
            by byVar = bdVar.E;
            byVar.P();
            byVar.w(byVar.o);
        }
    }

    public final void x() {
        if (this.e != null) {
            m();
        }
        B(5);
    }

    final void y(boolean z, boolean z2) {
        if (z2 && (this.l instanceof um)) {
            O(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (bd bdVar : this.b.f()) {
            if (bdVar != null && z2) {
                bdVar.E.y(z, true);
            }
        }
    }

    public final void z() {
        this.s = false;
        this.t = false;
        this.v.g = false;
        B(7);
    }
}
