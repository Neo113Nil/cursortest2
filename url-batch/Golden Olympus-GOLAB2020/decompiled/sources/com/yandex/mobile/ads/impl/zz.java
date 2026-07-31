package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.yandex.mobile.ads.impl.InterfaceC1852cd;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.x42;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class zz {

    /* renamed from: h, reason: collision with root package name */
    public static final i32<String> f35820h = new i32() { // from class: com.yandex.mobile.ads.impl.Lm
        @Override // com.yandex.mobile.ads.impl.i32
        public final Object get() {
            String a4;
            a4 = zz.a();
            return a4;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f35821i = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final x42.d f35822a;

    /* renamed from: b, reason: collision with root package name */
    private final x42.b f35823b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f35824c;

    /* renamed from: d, reason: collision with root package name */
    private final i32<String> f35825d;

    /* renamed from: e, reason: collision with root package name */
    private wh1 f35826e;

    /* renamed from: f, reason: collision with root package name */
    private x42 f35827f;

    /* renamed from: g, reason: collision with root package name */
    private String f35828g;

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f35829a;

        /* renamed from: b, reason: collision with root package name */
        private int f35830b;

        /* renamed from: c, reason: collision with root package name */
        private long f35831c;

        /* renamed from: d, reason: collision with root package name */
        private dw0.b f35832d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f35833e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f35834f;

        public a(String str, int i4, dw0.b bVar) {
            this.f35829a = str;
            this.f35830b = i4;
            this.f35831c = bVar == null ? -1L : bVar.f35795d;
            if (bVar == null || !bVar.a()) {
                return;
            }
            this.f35832d = bVar;
        }

        public final boolean a(InterfaceC1852cd.a aVar) {
            long j4 = this.f35831c;
            if (j4 == -1) {
                return false;
            }
            dw0.b bVar = aVar.f24175d;
            if (bVar == null) {
                return this.f35830b != aVar.f24174c;
            }
            if (bVar.f35795d > j4) {
                return true;
            }
            if (this.f35832d == null) {
                return false;
            }
            int a4 = aVar.f24173b.a(bVar.f35792a);
            int a5 = aVar.f24173b.a(this.f35832d.f35792a);
            dw0.b bVar2 = aVar.f24175d;
            if (bVar2.f35795d < this.f35832d.f35795d || a4 < a5) {
                return false;
            }
            if (a4 > a5) {
                return true;
            }
            if (!bVar2.a()) {
                int i4 = aVar.f24175d.f35796e;
                return i4 == -1 || i4 > this.f35832d.f35793b;
            }
            dw0.b bVar3 = aVar.f24175d;
            int i5 = bVar3.f35793b;
            int i6 = bVar3.f35794c;
            dw0.b bVar4 = this.f35832d;
            int i7 = bVar4.f35793b;
            return i5 > i7 || (i5 == i7 && i6 > bVar4.f35794c);
        }
    }

    public zz() {
        this(f35820h);
    }

    public final synchronized void a(InterfaceC1852cd.a aVar) {
        wh1 wh1Var;
        this.f35828g = null;
        Iterator<a> it = this.f35824c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f35833e && (wh1Var = this.f35826e) != null) {
                ((vv0) wh1Var).b(aVar, next.f35829a);
            }
        }
    }

    public final synchronized String b() {
        return this.f35828g;
    }

    public final synchronized void d(InterfaceC1852cd.a aVar) {
        try {
            this.f35826e.getClass();
            x42 x42Var = this.f35827f;
            this.f35827f = aVar.f24173b;
            Iterator<a> it = this.f35824c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                x42 x42Var2 = this.f35827f;
                int i4 = next.f35830b;
                if (i4 >= x42Var.b()) {
                    if (i4 < x42Var2.b()) {
                    }
                    i4 = -1;
                } else {
                    x42Var.a(i4, zz.this.f35822a, 0L);
                    for (int i5 = zz.this.f35822a.f34432p; i5 <= zz.this.f35822a.f34433q; i5++) {
                        int a4 = x42Var2.a(x42Var.a(i5));
                        if (a4 != -1) {
                            i4 = x42Var2.a(a4, zz.this.f35823b, false).f34405d;
                            break;
                        }
                    }
                    i4 = -1;
                }
                next.f35830b = i4;
                if (i4 != -1) {
                    dw0.b bVar = next.f35832d;
                    if (bVar != null && x42Var2.a(bVar.f35792a) == -1) {
                    }
                    if (next.a(aVar)) {
                    }
                }
                it.remove();
                if (next.f35833e) {
                    if (next.f35829a.equals(this.f35828g)) {
                        this.f35828g = null;
                    }
                    ((vv0) this.f35826e).b(aVar, next.f35829a);
                }
            }
            b(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zz(i32<String> i32Var) {
        this.f35825d = i32Var;
        this.f35822a = new x42.d();
        this.f35823b = new x42.b();
        this.f35824c = new HashMap<>();
        this.f35827f = x42.f34401b;
    }

    private void b(InterfaceC1852cd.a aVar) {
        dw0.b bVar;
        if (aVar.f24173b.c()) {
            this.f35828g = null;
            return;
        }
        a aVar2 = this.f35824c.get(this.f35828g);
        this.f35828g = a(aVar.f24174c, aVar.f24175d).f35829a;
        c(aVar);
        dw0.b bVar2 = aVar.f24175d;
        if (bVar2 == null || !bVar2.a()) {
            return;
        }
        if (aVar2 != null) {
            long j4 = aVar2.f35831c;
            dw0.b bVar3 = aVar.f24175d;
            if (j4 == bVar3.f35795d && (bVar = aVar2.f35832d) != null && bVar.f35793b == bVar3.f35793b && bVar.f35794c == bVar3.f35794c) {
                return;
            }
        }
        dw0.b bVar4 = aVar.f24175d;
        a(aVar.f24174c, new dw0.b(bVar4.f35792a, bVar4.f35795d));
        this.f35826e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r1.f35795d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(InterfaceC1852cd.a aVar) {
        try {
            this.f35826e.getClass();
        } finally {
        }
        if (aVar.f24173b.c()) {
            return;
        }
        a aVar2 = this.f35824c.get(this.f35828g);
        dw0.b bVar = aVar.f24175d;
        if (bVar != null && aVar2 != null) {
            long j4 = aVar2.f35831c;
            if (j4 == -1) {
                if (aVar2.f35830b != aVar.f24174c) {
                    return;
                }
            }
        }
        a a4 = a(aVar.f24174c, bVar);
        if (this.f35828g == null) {
            this.f35828g = a4.f35829a;
        }
        dw0.b bVar2 = aVar.f24175d;
        if (bVar2 != null && bVar2.a()) {
            dw0.b bVar3 = aVar.f24175d;
            Object obj = bVar3.f35792a;
            a a5 = a(aVar.f24174c, new dw0.b(bVar3.f35793b, bVar3.f35795d, obj));
            if (!a5.f35833e) {
                a5.f35833e = true;
                aVar.f24173b.a(aVar.f24175d.f35792a, this.f35823b);
                Math.max(0L, u82.b(this.f35823b.f34407f) + u82.b(this.f35823b.b(aVar.f24175d.f35793b)));
                this.f35826e.getClass();
            }
        }
        if (!a4.f35833e) {
            a4.f35833e = true;
            this.f35826e.getClass();
        }
        if (a4.f35829a.equals(this.f35828g) && !a4.f35834f) {
            a4.f35834f = true;
            ((vv0) this.f35826e).a(aVar, a4.f35829a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a() {
        byte[] bArr = new byte[12];
        f35821i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a a(int i4, dw0.b bVar) {
        long j4;
        a aVar = null;
        long j5 = Long.MAX_VALUE;
        for (a aVar2 : this.f35824c.values()) {
            if (aVar2.f35831c == -1 && i4 == aVar2.f35830b && bVar != null) {
                aVar2.f35831c = bVar.f35795d;
            }
            if (bVar == null) {
                if (i4 == aVar2.f35830b) {
                    j4 = aVar2.f35831c;
                    if (j4 == -1 || j4 < j5) {
                        aVar = aVar2;
                        j5 = j4;
                    } else if (j4 == j5) {
                        int i5 = u82.f32873a;
                        if (aVar.f35832d != null && aVar2.f35832d != null) {
                            aVar = aVar2;
                        }
                    }
                }
            } else {
                dw0.b bVar2 = aVar2.f35832d;
                if (bVar2 == null) {
                    if (!bVar.a() && bVar.f35795d == aVar2.f35831c) {
                        j4 = aVar2.f35831c;
                        if (j4 == -1) {
                        }
                        aVar = aVar2;
                        j5 = j4;
                    }
                } else if (bVar.f35795d == bVar2.f35795d && bVar.f35793b == bVar2.f35793b && bVar.f35794c == bVar2.f35794c) {
                    j4 = aVar2.f35831c;
                    if (j4 == -1) {
                    }
                    aVar = aVar2;
                    j5 = j4;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f35825d.get();
        a aVar3 = new a(str, i4, bVar);
        this.f35824c.put(str, aVar3);
        return aVar3;
    }

    public final synchronized String a(x42 x42Var, dw0.b bVar) {
        return a(x42Var.a(bVar.f35792a, this.f35823b).f34405d, bVar).f35829a;
    }

    public final void a(wh1 wh1Var) {
        this.f35826e = wh1Var;
    }

    public final synchronized void a(InterfaceC1852cd.a aVar, int i4) {
        try {
            this.f35826e.getClass();
            boolean z4 = i4 == 0;
            Iterator<a> it = this.f35824c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(aVar)) {
                    it.remove();
                    if (next.f35833e) {
                        boolean equals = next.f35829a.equals(this.f35828g);
                        if (z4 && equals) {
                            boolean unused = next.f35834f;
                        }
                        if (equals) {
                            this.f35828g = null;
                        }
                        ((vv0) this.f35826e).b(aVar, next.f35829a);
                    }
                }
            }
            b(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
