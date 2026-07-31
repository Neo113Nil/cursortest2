package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import com.yandex.mobile.ads.impl.InterfaceC1837bm;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class by1 implements InterfaceC1837bm {

    /* renamed from: j, reason: collision with root package name */
    private static final HashSet<File> f23966j = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f23967a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2004im f23968b;

    /* renamed from: c, reason: collision with root package name */
    private final tm f23969c;

    /* renamed from: d, reason: collision with root package name */
    private final C2052km f23970d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<InterfaceC1837bm.b>> f23971e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f23972f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23973g;

    /* renamed from: h, reason: collision with root package name */
    private long f23974h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1837bm.a f23975i;

    by1(File file, wq0 wq0Var, tm tmVar, C2052km c2052km) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f23967a = file;
        this.f23968b = wq0Var;
        this.f23969c = tmVar;
        this.f23970d = c2052km;
        this.f23971e = new HashMap<>();
        this.f23972f = new Random();
        this.f23973g = true;
        this.f23974h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new ay1(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized TreeSet c(String str) {
        TreeSet treeSet;
        try {
            sm a4 = this.f23969c.a(str);
            if (a4 != null && !a4.c()) {
                treeSet = new TreeSet((Collection) a4.b());
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized long d(String str, long j4, long j5) {
        sm a4;
        if (j5 == -1) {
            j5 = Long.MAX_VALUE;
        }
        a4 = this.f23969c.a(str);
        return a4 != null ? a4.a(j4, j5) : -j5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized om e(String str, long j4, long j5) {
        try {
            try {
                a();
                while (true) {
                    om c4 = c(str, j4, j5);
                    long j6 = j5;
                    long j7 = j4;
                    String str2 = str;
                    if (c4 != null) {
                        return c4;
                    }
                    wait();
                    str = str2;
                    j4 = j7;
                    j5 = j6;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void a(dy1 dy1Var) {
        this.f23969c.c(dy1Var.f30089b).a(dy1Var);
        ArrayList<InterfaceC1837bm.b> arrayList = this.f23971e.get(dy1Var.f30089b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, dy1Var);
            }
        }
        this.f23968b.a(this, dy1Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized long b(String str, long j4, long j5) {
        long j6;
        long j7 = j5 == -1 ? Long.MAX_VALUE : j4 + j5;
        long j8 = j7 >= 0 ? j7 : Long.MAX_VALUE;
        long j9 = j4;
        j6 = 0;
        while (j9 < j8) {
            long d4 = d(str, j9, j8 - j9);
            if (d4 > 0) {
                j6 += d4;
            } else {
                d4 = -d4;
            }
            j9 += d4;
        }
        return j6;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized cz b(String str) {
        return this.f23969c.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        long j4;
        if (!this.f23967a.exists()) {
            try {
                a(this.f23967a);
            } catch (InterfaceC1837bm.a e4) {
                this.f23975i = e4;
                return;
            }
        }
        File[] listFiles = this.f23967a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f23967a;
            ms0.b("SimpleCache", str);
            this.f23975i = new InterfaceC1837bm.a(str);
            return;
        }
        int length = listFiles.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                j4 = -1;
                break;
            }
            File file = listFiles[i4];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j4 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ms0.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i4++;
        }
        this.f23974h = j4;
        if (j4 == -1) {
            try {
                this.f23974h = b(this.f23967a);
            } catch (IOException e5) {
                String str2 = "Failed to create cache UID: " + this.f23967a;
                ms0.a("SimpleCache", str2, e5);
                this.f23975i = new InterfaceC1837bm.a(str2, e5);
                return;
            }
        }
        try {
            this.f23969c.a(this.f23974h);
            C2052km c2052km = this.f23970d;
            if (c2052km != null) {
                c2052km.a(this.f23974h);
                HashMap a4 = this.f23970d.a();
                a(this.f23967a, true, listFiles, a4);
                this.f23970d.a(a4.keySet());
            } else {
                a(this.f23967a, true, listFiles, null);
            }
            this.f23969c.b();
            try {
                this.f23969c.c();
            } catch (Throwable th) {
                ms0.a("SimpleCache", "Storing index file failed", th);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.f23967a;
            ms0.a("SimpleCache", str3, th2);
            this.f23975i = new InterfaceC1837bm.a(str3, th2);
        }
    }

    private void c(om omVar) {
        sm a4 = this.f23969c.a(omVar.f30089b);
        if (a4 == null || !a4.a(omVar)) {
            return;
        }
        if (this.f23970d != null) {
            String name = omVar.f30093f.getName();
            try {
                this.f23970d.a(name);
            } catch (IOException unused) {
                zu0.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f23969c.d(a4.f31839b);
        ArrayList<InterfaceC1837bm.b> arrayList = this.f23971e.get(omVar.f30089b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(omVar);
            }
        }
        this.f23968b.a(omVar);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized void a(String str, rr rrVar) {
        InterfaceC1837bm.a aVar;
        a();
        this.f23969c.a(str, rrVar);
        try {
            this.f23969c.c();
        } finally {
        }
    }

    public final synchronized void a() {
        InterfaceC1837bm.a aVar = this.f23975i;
        if (aVar != null) {
            throw aVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized void a(File file, long j4) {
        if (file.exists()) {
            if (j4 == 0) {
                file.delete();
                return;
            }
            dy1 a4 = dy1.a(file, j4, -9223372036854775807L, this.f23969c);
            a4.getClass();
            sm a5 = this.f23969c.a(a4.f30089b);
            a5.getClass();
            if (a5.c(a4.f30090c, a4.f30091d)) {
                long b4 = a5.a().b();
                if (b4 != -1 && a4.f30090c + a4.f30091d > b4) {
                    throw new IllegalStateException();
                }
                if (this.f23970d != null) {
                    try {
                        this.f23970d.a(file.getName(), a4.f30091d, a4.f30094g);
                    } catch (IOException e4) {
                        throw new InterfaceC1837bm.a(e4);
                    }
                }
                a(a4);
                try {
                    this.f23969c.c();
                    notifyAll();
                    return;
                } finally {
                    InterfaceC1837bm.a aVar = new InterfaceC1837bm.a(e4);
                }
            }
            throw new IllegalStateException();
        }
    }

    public by1(File file, wq0 wq0Var, a60 a60Var) {
        this(file, wq0Var, new tm(a60Var, file), new C2052km(a60Var));
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        Iterator<sm> it = this.f23969c.a().iterator();
        while (it.hasNext()) {
            Iterator<dy1> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                dy1 next = it2.next();
                if (next.f30093f.length() != next.f30091d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c((om) arrayList.get(i4));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized om c(String str, long j4, long j5) {
        dy1 b4;
        dy1 dy1Var;
        boolean z4;
        try {
            a();
            sm a4 = this.f23969c.a(str);
            if (a4 == null) {
                dy1Var = dy1.a(str, j4, j5);
            } else {
                while (true) {
                    b4 = a4.b(j4, j5);
                    if (!b4.f30092e || b4.f30093f.length() == b4.f30091d) {
                        break;
                    }
                    c();
                }
                dy1Var = b4;
            }
            if (dy1Var.f30092e) {
                if (this.f23973g) {
                    File file = dy1Var.f30093f;
                    file.getClass();
                    String name = file.getName();
                    long j6 = dy1Var.f30091d;
                    long currentTimeMillis = System.currentTimeMillis();
                    C2052km c2052km = this.f23970d;
                    if (c2052km != null) {
                        try {
                            c2052km.a(name, j6, currentTimeMillis);
                        } catch (IOException unused) {
                            ms0.d("SimpleCache", "Failed to update index with new touch timestamp.");
                        }
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    dy1 a5 = this.f23969c.a(str).a(dy1Var, currentTimeMillis, z4);
                    ArrayList<InterfaceC1837bm.b> arrayList = this.f23971e.get(dy1Var.f30089b);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).a(this, dy1Var, a5);
                        }
                    }
                    this.f23968b.a(this, dy1Var, a5);
                    dy1Var = a5;
                }
                return dy1Var;
            }
            if (this.f23969c.c(str).d(j4, dy1Var.f30091d)) {
                return dy1Var;
            }
            return null;
        } finally {
        }
    }

    private static void a(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ms0.b("SimpleCache", str);
        throw new InterfaceC1837bm.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized void b(om omVar) {
        sm a4 = this.f23969c.a(omVar.f30089b);
        a4.getClass();
        a4.a(omVar.f30090c);
        this.f23969c.d(a4.f31839b);
        notifyAll();
    }

    private void a(File file, boolean z4, File[] fileArr, HashMap hashMap) {
        long j4;
        long j5;
        if (fileArr == null || fileArr.length == 0) {
            if (z4) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z4 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), hashMap);
            } else if (!z4 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                C2028jm c2028jm = hashMap != null ? (C2028jm) hashMap.remove(name) : null;
                if (c2028jm != null) {
                    j4 = c2028jm.f27724a;
                    j5 = c2028jm.f27725b;
                } else {
                    j4 = -1;
                    j5 = -9223372036854775807L;
                }
                dy1 a4 = dy1.a(file2, j4, j5, this.f23969c);
                if (a4 != null) {
                    a(a4);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long b(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private static synchronized boolean c(File file) {
        boolean add;
        synchronized (by1.class) {
            add = f23966j.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized void a(String str) {
        Iterator it = c(str).iterator();
        while (it.hasNext()) {
            c((om) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized void a(om omVar) {
        c(omVar);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm
    public final synchronized File a(String str, long j4, long j5) {
        File file;
        long currentTimeMillis;
        int i4;
        try {
            a();
            sm a4 = this.f23969c.a(str);
            a4.getClass();
            if (a4.c(j4, j5)) {
                if (!this.f23967a.exists()) {
                    a(this.f23967a);
                    c();
                }
                this.f23968b.a(this, j5);
                file = new File(this.f23967a, Integer.toString(this.f23972f.nextInt(10)));
                if (!file.exists()) {
                    a(file);
                }
                currentTimeMillis = System.currentTimeMillis();
                i4 = a4.f31838a;
                int i5 = dy1.f24997k;
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(file, i4 + "." + j4 + "." + currentTimeMillis + ".v3.exo");
    }
}
