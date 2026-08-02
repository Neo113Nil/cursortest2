package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcz implements Runnable, Comparable, bcv, bmn {
    public static final bbk a = new bbk("glide_thread_priority_override", null, bbk.a);
    private bbu A;
    private volatile boolean B;
    private boolean C;
    private int D;
    private int E;
    public azu d;
    public bbh e;
    public azw f;
    public int g;
    public int h;
    public bdg i;
    public bbl j;
    public int k;
    public Supplier l;
    public bbh m;
    public volatile bcw n;
    public volatile boolean o;
    public int p;
    public bdn q;
    public final cme r;
    public brn t;
    private final wq w;
    private Thread x;
    private bbh y;
    private Object z;
    public final bcx b = new bcx();
    private final List u = new ArrayList();
    private final bmq v = new bmq();
    public final iyh s = new iyh();
    public final bcy c = new bcy();

    public bcz(cme cmeVar, wq wqVar) {
        this.r = cmeVar;
        this.w = wqVar;
    }

    private final bcw g() {
        int i = this.D;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new bdw(this.b, this);
        }
        if (i2 == 2) {
            bcx bcxVar = this.b;
            return new bct(bcxVar.d(), bcxVar, this);
        }
        if (i2 == 3) {
            return new bea(this.b, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(afn.f(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a5 A[Catch: all -> 0x027a, TRY_LEAVE, TryCatch #18 {all -> 0x027a, blocks: (B:110:0x009a, B:112:0x00a5, B:114:0x00ac), top: B:109:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024a A[LOOP:1: B:111:0x00a3->B:169:0x024a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025a A[EDGE_INSN: B:170:0x025a->B:171:0x025a BREAK  A[LOOP:1: B:111:0x00a3->B:169:0x024a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025c A[Catch: all -> 0x0285, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0285, blocks: (B:172:0x025c, B:196:0x027f, B:197:0x0284), top: B:106:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026b A[Catch: all -> 0x0278, TRY_ENTER, TryCatch #17 {all -> 0x0278, blocks: (B:143:0x0146, B:145:0x014c, B:146:0x014f, B:148:0x0163, B:150:0x0175, B:151:0x0186, B:155:0x0199, B:160:0x01b4, B:163:0x01c0, B:165:0x01c4, B:166:0x01ef, B:167:0x020c, B:176:0x026b, B:177:0x0277, B:178:0x01e6, B:180:0x01fc, B:181:0x0209, B:157:0x01ae, B:184:0x0244, B:187:0x017a, B:188:0x0183, B:204:0x0131, B:217:0x0225, B:218:0x0236), top: B:142:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0063 A[Catch: all -> 0x0292, TryCatch #14 {all -> 0x0292, blocks: (B:90:0x003d, B:92:0x0051, B:96:0x0059, B:98:0x0063, B:105:0x0083, B:236:0x0071), top: B:89:0x003d }] */
    /* JADX WARN: Type inference failed for: r0v70, types: [bbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bbh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h() {
        boolean z;
        Object obj;
        bbu bbuVar;
        Object obj2;
        int i;
        boolean z2;
        Boolean bool;
        bbl bblVar;
        bbw a2;
        List list;
        int size;
        bdv bdvVar;
        int i2;
        bbu bbuVar2;
        List list2;
        int i3;
        bbl bblVar2;
        bdv a3;
        Class<?> cls;
        bdv bdvVar2;
        bbp bbpVar;
        int i4;
        bbo bboVar;
        boolean z3;
        bdv bdvVar3;
        Boolean bool2;
        Bitmap.Config config;
        Supplier supplier;
        Object obj3;
        Object obj4;
        bdv bdvVar4 = null;
        if (this.t.v(azp.class) && (supplier = this.l) != null) {
            obj3 = supplier.get();
            if (obj3 != null) {
                try {
                    int myTid = Process.myTid();
                    obj4 = this.l.get();
                    Process.setThreadPriority(myTid, ((Integer) obj4).intValue());
                } catch (IllegalArgumentException | SecurityException unused) {
                    this.l = null;
                }
            }
        }
        try {
            bbuVar = this.A;
            obj2 = this.z;
            i = this.E;
        } catch (bdr e) {
            e = e;
            z = true;
        }
        try {
            if (obj2 == null) {
                bbuVar.d();
                obj = null;
                z = true;
            } else {
                try {
                    double d = bmd.a;
                    SystemClock.elapsedRealtimeNanos();
                    bcx bcxVar = this.b;
                    bdt b = bcxVar.b(obj2.getClass());
                    bbl bblVar3 = this.j;
                    try {
                        try {
                            try {
                                try {
                                    if (i != 4 && !bcxVar.q) {
                                        z2 = false;
                                        bbk bbkVar = bhx.d;
                                        bool = (Boolean) bblVar3.b(bbkVar);
                                        if (bool != null) {
                                            if (bool.booleanValue() && !z2) {
                                                z2 = false;
                                            }
                                            bblVar = bblVar3;
                                            a2 = this.d.a().a(obj2);
                                            int i5 = this.g;
                                            int i6 = this.h;
                                            List list3 = (List) b.a.a();
                                            list = b.b;
                                            size = list.size();
                                            bdvVar = null;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 >= size) {
                                                    bbuVar2 = bbuVar;
                                                    z = true;
                                                    break;
                                                }
                                                bda bdaVar = (bda) list.get(i2);
                                                try {
                                                    List list4 = (List) bdaVar.b.a();
                                                    int i7 = i2;
                                                    try {
                                                        a3 = bdaVar.a(a2, i5, i6, bblVar, list4);
                                                        bblVar2 = bblVar;
                                                        z = true;
                                                        try {
                                                            try {
                                                                bdaVar.b.b(list4);
                                                                Class<?> cls2 = a3.c().getClass();
                                                                if (i != 4) {
                                                                    bbp a4 = this.b.a(cls2);
                                                                    i3 = i7;
                                                                    try {
                                                                        cls = cls2;
                                                                        Boolean bool3 = (Boolean) this.j.b(bhx.e);
                                                                        if (bool3 != null && bool3.booleanValue() && (bool2 = (Boolean) this.j.b(bhx.d)) != null && bool2.booleanValue()) {
                                                                            Object c = a3.c();
                                                                            Bitmap bitmap = c instanceof Bitmap ? (Bitmap) c : c instanceof BitmapDrawable ? ((BitmapDrawable) c).getBitmap() : null;
                                                                            if (bitmap != null) {
                                                                                Bitmap.Config config2 = bitmap.getConfig();
                                                                                config = Bitmap.Config.HARDWARE;
                                                                                if (config2 == config) {
                                                                                    bdvVar2 = a3;
                                                                                    bbuVar2 = bbuVar;
                                                                                    bbpVar = a4;
                                                                                }
                                                                            }
                                                                        }
                                                                        bbuVar2 = bbuVar;
                                                                        bdvVar2 = a4.b(this.d, a3, this.g, this.h);
                                                                        bbpVar = a4;
                                                                    } catch (bdr e2) {
                                                                        e = e2;
                                                                        bbuVar2 = bbuVar;
                                                                        list2 = list;
                                                                        list3.add(e);
                                                                        if (bdvVar == null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = i7;
                                                                    cls = cls2;
                                                                    bbuVar2 = bbuVar;
                                                                    bdvVar2 = a3;
                                                                    bbpVar = null;
                                                                }
                                                            } catch (bdr e3) {
                                                                e = e3;
                                                                i3 = i7;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        bdaVar.b.b(list4);
                                                        throw th2;
                                                    }
                                                } catch (bdr e4) {
                                                    e = e4;
                                                    bbuVar2 = bbuVar;
                                                    list2 = list;
                                                    i3 = i2;
                                                    bblVar2 = bblVar;
                                                    z = true;
                                                }
                                                try {
                                                    try {
                                                        if (!a3.equals(bdvVar2)) {
                                                            a3.e();
                                                        }
                                                        bcx bcxVar2 = this.b;
                                                        if (bcxVar2.c.a().c.b(bdvVar2.b()) != null) {
                                                            bboVar = bcxVar2.c.a().c.b(bdvVar2.b());
                                                            if (bboVar == null) {
                                                                throw new baa(bdvVar2.b());
                                                            }
                                                            i4 = bboVar.b();
                                                        } else {
                                                            i4 = 3;
                                                            bboVar = null;
                                                        }
                                                        bbh bbhVar = this.m;
                                                        List e5 = bcxVar2.e();
                                                        bdv bdvVar5 = bdvVar2;
                                                        int size2 = e5.size();
                                                        list2 = list;
                                                        int i8 = 0;
                                                        while (true) {
                                                            if (i8 >= size2) {
                                                                z3 = false;
                                                                break;
                                                            }
                                                            try {
                                                                List list5 = e5;
                                                                if (((bvw) e5.get(i8)).c.equals(bbhVar)) {
                                                                    z3 = true;
                                                                    break;
                                                                } else {
                                                                    i8++;
                                                                    e5 = list5;
                                                                }
                                                            } catch (bdr e6) {
                                                                e = e6;
                                                                list3.add(e);
                                                                if (bdvVar == null) {
                                                                }
                                                            }
                                                        }
                                                        if (!this.i.d(!z3, i, i4)) {
                                                            bdvVar3 = bdvVar5;
                                                        } else {
                                                            if (bboVar == null) {
                                                                throw new baa(bdvVar5.c().getClass());
                                                            }
                                                            bbh bdxVar = i4 + (-1) != 0 ? new bdx(bcxVar2.h(), this.m, this.e, this.g, this.h, bbpVar, cls, this.j) : new bcu(this.m, this.e);
                                                            bdvVar3 = bdu.d(bdvVar5);
                                                            iyh iyhVar = this.s;
                                                            iyhVar.a = bdxVar;
                                                            iyhVar.c = bboVar;
                                                            iyhVar.b = bdvVar3;
                                                        }
                                                        bdvVar = bdaVar.a.a(bdvVar3, bblVar2);
                                                    } catch (bdr e7) {
                                                        e = e7;
                                                        list2 = list;
                                                        list3.add(e);
                                                        if (bdvVar == null) {
                                                        }
                                                    }
                                                    if (bdvVar == null) {
                                                        break;
                                                    }
                                                    i2 = i3 + 1;
                                                    bblVar = bblVar2;
                                                    bbuVar = bbuVar2;
                                                    list = list2;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    b.a.b(list3);
                                                    throw th;
                                                }
                                            }
                                            if (bdvVar == null) {
                                                throw new bdr(b.c, new ArrayList(list3));
                                            }
                                            b.a.b(list3);
                                            a2.b();
                                            bbuVar2.d();
                                            bdvVar4 = bdvVar;
                                            obj = null;
                                        }
                                        bblVar3 = new bbl();
                                        bblVar3.c(this.j);
                                        bblVar3.d(bbkVar, Boolean.valueOf(z2));
                                        bblVar = bblVar3;
                                        a2 = this.d.a().a(obj2);
                                        int i52 = this.g;
                                        int i62 = this.h;
                                        List list32 = (List) b.a.a();
                                        list = b.b;
                                        size = list.size();
                                        bdvVar = null;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= size) {
                                            }
                                            i2 = i3 + 1;
                                            bblVar = bblVar2;
                                            bbuVar = bbuVar2;
                                            list = list2;
                                        }
                                        if (bdvVar == null) {
                                        }
                                    }
                                    list = b.b;
                                    size = list.size();
                                    bdvVar = null;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 >= size) {
                                        }
                                        i2 = i3 + 1;
                                        bblVar = bblVar2;
                                        bbuVar = bbuVar2;
                                        list = list2;
                                    }
                                    if (bdvVar == null) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                int i522 = this.g;
                                int i622 = this.h;
                                List list322 = (List) b.a.a();
                            } catch (Throwable th5) {
                                th = th5;
                                a2.b();
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            a2.b();
                            throw th;
                        }
                        a2 = this.d.a().a(obj2);
                    } catch (Throwable th7) {
                        th = th7;
                        bbuVar.d();
                        throw th;
                    }
                    z2 = true;
                    bbk bbkVar2 = bhx.d;
                    bool = (Boolean) bblVar3.b(bbkVar2);
                    if (bool != null) {
                    }
                    bblVar3 = new bbl();
                    bblVar3.c(this.j);
                    bblVar3.d(bbkVar2, Boolean.valueOf(z2));
                    bblVar = bblVar3;
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        } catch (bdr e8) {
            e = e8;
            obj = null;
            e.b(this.y, this.E, null);
            this.u.add(e);
            bdvVar4 = null;
            if (bdvVar4 != null) {
            }
        }
        if (bdvVar4 != null) {
            k();
            return;
        }
        int i9 = this.E;
        if (bdvVar4 instanceof bds) {
            ((bds) bdvVar4).d();
        }
        bdu bduVar = obj;
        if (this.s.m()) {
            bdvVar4 = bdu.d(bdvVar4);
            bduVar = bdvVar4;
        }
        if (this.t.v(azp.class)) {
            j();
        }
        l();
        bdn bdnVar = this.q;
        synchronized (bdnVar) {
            bdnVar.e = bdvVar4;
            bdnVar.k = i9;
        }
        synchronized (bdnVar) {
            bdnVar.b.a();
            if (bdnVar.j) {
                bdnVar.e.e();
                bdnVar.e();
            } else {
                bdm bdmVar = bdnVar.a;
                if (bdmVar.c()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (bdnVar.f) {
                    throw new IllegalStateException("Already have resource");
                }
                bdnVar.i = new bdp(bdnVar.e, bdnVar.d, bdnVar.c, bdnVar.l);
                boolean z4 = z;
                bdnVar.f = z4;
                bdm b2 = bdmVar.b();
                bdnVar.d(b2.a() + (z4 ? 1 : 0));
                bdnVar.m.b(bdnVar, bdnVar.c, bdnVar.i);
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    bdl bdlVar = (bdl) it.next();
                    bdlVar.a.execute(new bdk(bdnVar, bdlVar.b, 0));
                }
                bdnVar.c();
            }
        }
        this.D = 5;
        try {
            iyh iyhVar2 = this.s;
            if (iyhVar2.m()) {
                try {
                    this.r.e().c(iyhVar2.a, new bvw(iyhVar2.c, iyhVar2.b, this.j));
                    ((bdu) iyhVar2.b).f();
                } catch (Throwable th9) {
                    ((bdu) iyhVar2.b).f();
                    throw th9;
                }
            }
            if (this.c.b()) {
                c();
            }
        } finally {
            if (bduVar != 0) {
                bduVar.f();
            }
        }
    }

    private final void i() {
        if (this.t.v(azp.class)) {
            j();
        }
        l();
        bdr bdrVar = new bdr("Failed to load resource", new ArrayList(this.u));
        bdn bdnVar = this.q;
        synchronized (bdnVar) {
            bdnVar.g = bdrVar;
        }
        synchronized (bdnVar) {
            bdnVar.b.a();
            if (bdnVar.j) {
                bdnVar.e();
            } else {
                bdm bdmVar = bdnVar.a;
                if (bdmVar.c()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (bdnVar.h) {
                    throw new IllegalStateException("Already failed once");
                }
                bdnVar.h = true;
                bbh bbhVar = bdnVar.c;
                bdm b = bdmVar.b();
                bdnVar.d(b.a() + 1);
                bdnVar.m.b(bdnVar, bbhVar, null);
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    bdl bdlVar = (bdl) it.next();
                    bdlVar.a.execute(new bdk(bdnVar, bdlVar.b, 1));
                }
                bdnVar.c();
            }
        }
        if (this.c.c()) {
            c();
        }
    }

    private final void j() {
        Object obj;
        if (!this.t.v(azp.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.l;
        if (supplier != null) {
            obj = supplier.get();
            if (obj != null) {
                try {
                    Process.setThreadPriority(Process.myTid(), 9);
                } catch (IllegalArgumentException | SecurityException unused) {
                    this.l = null;
                }
            }
        }
    }

    private final void k() {
        this.x = Thread.currentThread();
        double d = bmd.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.o && this.n != null && !(z = this.n.c())) {
            this.D = e(this.D);
            this.n = g();
            if (this.D == 4) {
                f(2);
                return;
            }
        }
        if ((this.D == 6 || this.o) && !z) {
            i();
        }
    }

    private final void l() {
        this.v.a();
        if (this.B) {
            List list = this.u;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.B = true;
    }

    @Override // defpackage.bcv
    public final void b(bbh bbhVar, Exception exc, bbu bbuVar, int i) {
        bbuVar.d();
        bdr bdrVar = new bdr("Fetching data failed", Collections.singletonList(exc));
        bdrVar.b(bbhVar, i, bbuVar.a());
        this.u.add(bdrVar);
        if (Thread.currentThread() != this.x) {
            f(2);
        } else {
            k();
        }
    }

    @Override // defpackage.bmn
    public final bmq bp() {
        return this.v;
    }

    public final void c() {
        this.c.a();
        iyh iyhVar = this.s;
        iyhVar.a = null;
        iyhVar.c = null;
        iyhVar.b = null;
        bcx bcxVar = this.b;
        bcxVar.c = null;
        bcxVar.d = null;
        bcxVar.m = null;
        bcxVar.g = null;
        bcxVar.j = null;
        bcxVar.h = null;
        bcxVar.n = null;
        bcxVar.i = null;
        bcxVar.o = null;
        bcxVar.a.clear();
        bcxVar.k = false;
        bcxVar.b.clear();
        bcxVar.l = false;
        this.B = false;
        this.d = null;
        this.e = null;
        this.j = null;
        this.f = null;
        this.q = null;
        this.D = 0;
        this.n = null;
        this.x = null;
        this.m = null;
        this.z = null;
        this.E = 0;
        this.A = null;
        this.o = false;
        this.u.clear();
        this.w.b(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bcz bczVar = (bcz) obj;
        int compareTo = this.f.compareTo(bczVar.f);
        return compareTo == 0 ? this.k - bczVar.k : compareTo;
    }

    @Override // defpackage.bcv
    public final void d(bbh bbhVar, Object obj, bbu bbuVar, int i, bbh bbhVar2) {
        this.m = bbhVar;
        this.z = obj;
        this.A = bbuVar;
        this.E = i;
        this.y = bbhVar2;
        this.C = bbhVar != this.b.d().get(0);
        if (Thread.currentThread() == this.x) {
            h();
        } else {
            f(3);
        }
    }

    public final int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.i.b()) {
                return 2;
            }
            return e(2);
        }
        if (i2 == 1) {
            if (this.i.a()) {
                return 3;
            }
            return e(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(afn.f(i)));
    }

    public final void f(int i) {
        this.p = i;
        this.q.b().execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bbu bbuVar = this.A;
        try {
            try {
                try {
                    if (this.o) {
                        i();
                    } else {
                        int i = this.p;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            this.D = e(1);
                            this.n = g();
                            k();
                        } else if (i2 == 1) {
                            k();
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                            }
                            h();
                        }
                    }
                    if (bbuVar != null) {
                        bbuVar.d();
                    }
                } catch (bcs e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (this.D != 5) {
                    this.u.add(th);
                    i();
                }
                if (!this.o) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (bbuVar != null) {
                bbuVar.d();
            }
            throw th2;
        }
    }
}
