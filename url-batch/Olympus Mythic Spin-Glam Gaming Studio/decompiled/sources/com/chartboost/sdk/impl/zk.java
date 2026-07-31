package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.al;
import com.chartboost.sdk.impl.xk;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class zk implements al.a, xk {
    public final i3 a;
    public final lk b;
    public final j3 c;
    public final u8 d;
    public final th e;
    public final ScheduledExecutorService f;
    public final Queue g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public AtomicInteger k;
    public final Runnable l;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public zk(i3 networkRequestService, lk policy, j3 j3Var, u8 u8Var, th tempHelper, ScheduledExecutorService backgroundExecutor) {
        Intrinsics.checkNotNullParameter(networkRequestService, "networkRequestService");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        this.a = networkRequestService;
        this.b = policy;
        this.c = j3Var;
        this.d = u8Var;
        this.e = tempHelper;
        this.f = backgroundExecutor;
        this.g = new ConcurrentLinkedQueue();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new AtomicInteger(1);
        this.l = new Runnable() { // from class: com.chartboost.sdk.impl.zk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zk.a(zk.this);
            }
        };
    }

    public final a a(String str, String str2, boolean z, t0 t0Var, boolean z2, File file) {
        if (z) {
            if (!z2) {
                xb.a("Not downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                if (t0Var != null) {
                    hk hkVar = (hk) this.j.get(str2);
                    if (Intrinsics.areEqual(hkVar != null ? hkVar.d() : null, str2) || this.i.containsKey(str)) {
                        this.i.put(str, t0Var);
                        return a.d;
                    }
                }
            } else {
                if (this.i.containsKey(str)) {
                    xb.a("Already downloading for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    pg.a("Already downloading for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, t0Var);
                    return a.b;
                }
                if (t0Var != null) {
                    xb.a("Register callback for show operation: " + str2, (Throwable) null, 2, (Object) null);
                    pg.a("Register callback for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, t0Var);
                    return a.b;
                }
            }
            if (t0Var != null) {
                xb.a("Register callback for show operation: " + str2, (Throwable) null, 2, (Object) null);
                pg.a("Register callback for show operation: " + str2);
                this.i.put(str, t0Var);
            }
        } else if (b(str, str2) || z2) {
            xb.a("Already queued or downloading for cache operation: " + str2, (Throwable) null, 2, (Object) null);
            pg.a("Already queued or downloading for cache operation: " + str2);
            return a.b;
        }
        return a.c;
    }

    @Override // com.chartboost.sdk.impl.xk
    public hk b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (hk) this.j.get(filename);
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((hk) obj).a()), Long.valueOf(((hk) obj2).a()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("CAN_NOT_DOWNLOAD", 0);
        public static final a c = new a("CREATE_ASSET_AND_DOWNLOAD", 1);
        public static final a d = new a("BRING_TO_FRONT_QUEUE_AND_DOWNLOAD", 2);
        public static final /* synthetic */ a[] e;
        public static final /* synthetic */ EnumEntries f;

        static {
            a[] a = a();
            e = a;
            f = EnumEntriesKt.enumEntries(a);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public a(String str, int i) {
        }
    }

    public final boolean c() {
        j3 j3Var = this.c;
        return j3Var != null && j3Var.e() && !this.b.g() && this.h.isEmpty();
    }

    public final void c(hk hkVar) {
        if (pg.a.d()) {
            File file = new File(hkVar.f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final void c(String str) {
        for (hk hkVar : new LinkedList(this.g)) {
            if (hkVar != null && Intrinsics.areEqual(hkVar.g(), str)) {
                this.g.remove(hkVar);
            }
        }
    }

    public final void h(hk hkVar) {
        xb.a("startDownloadNow: " + hkVar.g(), (Throwable) null, 2, (Object) null);
        if (a(hkVar.d())) {
            pg.a("File already downloaded or downloading: " + hkVar.d());
            String g = hkVar.g();
            t0 t0Var = (t0) this.i.remove(g);
            if (t0Var != null) {
                t0Var.a(g);
                return;
            }
            return;
        }
        pg.a("Start downloading " + hkVar.g());
        this.b.a();
        this.h.add(hkVar.g());
        j3 j3Var = this.c;
        File e = hkVar.e();
        Intrinsics.checkNotNull(e);
        this.a.a(new al(j3Var, e, hkVar.g(), this, af.e, this.a.a()));
    }

    public boolean g(hk hkVar) {
        if (hkVar == null || !e(hkVar)) {
            return false;
        }
        File e = hkVar.e();
        String d = hkVar.d();
        u8 u8Var = this.d;
        if (u8Var == null || !u8Var.a(e)) {
            return false;
        }
        this.j.remove(d);
        return true;
    }

    public final boolean f(hk hkVar) {
        return this.e.b(hkVar.b(), hkVar.d());
    }

    public final File d(hk hkVar) {
        return this.e.a(hkVar.b(), hkVar.d());
    }

    public final boolean e(hk hkVar) {
        u8 u8Var;
        if (hkVar == null || hkVar.e() == null || (u8Var = this.d) == null) {
            return false;
        }
        return u8Var.c(hkVar.e());
    }

    public final void a() {
        if (b()) {
            Collection values = this.j.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator it = CollectionsKt.sortedWith(values, new c()).iterator();
            while (it.hasNext()) {
                g((hk) it.next());
                if (!b()) {
                    return;
                }
            }
        }
    }

    public final hk d(String str) {
        Object obj;
        if (str == null) {
            obj = this.g.poll();
        } else {
            hk hkVar = null;
            for (hk hkVar2 : this.g) {
                if (Intrinsics.areEqual(hkVar2.d(), str)) {
                    hkVar = hkVar2;
                }
            }
            obj = hkVar;
        }
        hk hkVar3 = (hk) obj;
        if (hkVar3 != null) {
            c(hkVar3);
        }
        return hkVar3;
    }

    public final boolean b(String str, String str2) {
        if (this.g.size() <= 0) {
            return false;
        }
        for (hk hkVar : this.g) {
            if (Intrinsics.areEqual(hkVar.g(), str) && Intrinsics.areEqual(hkVar.d(), str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        u8 u8Var = this.d;
        if (u8Var == null) {
            return false;
        }
        return this.b.b(u8Var.b(u8Var.b()));
    }

    public final void b(hk hkVar) {
        if (pg.a.d()) {
            File file = new File(hkVar.f());
            try {
                file.createNewFile();
                file.setLastModified(oh.a());
            } catch (IOException e) {
                xb.b("Error while creating queue empty file: " + e, (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final void a(String str, String str2, File file, File file2) {
        File d;
        u8 u8Var = this.d;
        String absolutePath = (u8Var == null || (d = u8Var.d()) == null) ? null : d.getAbsolutePath();
        hk hkVar = new hk(str, str2, file, file2, 0L, absolutePath + File.separator + str2, 0L, 80, null);
        file.setLastModified(hkVar.a());
        b(hkVar);
        this.j.putIfAbsent(str2, hkVar);
        this.g.offer(hkVar);
    }

    public static final void a(zk this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a((String) null, this$0.k.incrementAndGet(), false);
    }

    @Override // com.chartboost.sdk.impl.xk
    public synchronized void a(String url, String filename, boolean z, t0 t0Var) {
        try {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(filename, "filename");
            xb.a("downloadVideoFile: " + url, (Throwable) null, 2, (Object) null);
            u8 u8Var = this.d;
            File b2 = u8Var != null ? u8Var.b() : null;
            u8 u8Var2 = this.d;
            int i = b.a[a(url, filename, z, t0Var, a(filename), u8Var2 != null ? u8Var2.a(b2, filename) : null).ordinal()];
            if (i == 2) {
                a(url, filename, new File(b2, filename), b2);
                if (!z) {
                    filename = null;
                }
                a(filename, this.k.get(), z);
            } else if (i == 3) {
                xk.a.a(this, filename, 0, true, 2, null);
            }
        } finally {
        }
    }

    @Override // com.chartboost.sdk.impl.xk
    public int a(hk hkVar) {
        if (hkVar == null) {
            return 0;
        }
        if (e(hkVar)) {
            return 5;
        }
        File d = d(hkVar);
        long length = d != null ? d.length() : 0L;
        if (hkVar.c() == 0) {
            return 0;
        }
        return fg.a(length / hkVar.c());
    }

    @Override // com.chartboost.sdk.impl.xk
    public void a(Context context) {
        File[] c2;
        Intrinsics.checkNotNullParameter(context, "context");
        u8 u8Var = this.d;
        if (u8Var == null || (c2 = u8Var.c()) == null) {
            return;
        }
        Intrinsics.checkNotNull(c2);
        int length = c2.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            File file = c2[i];
            if (file.exists()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.contains$default(name, ".tmp", z, 2, (Object) null)) {
                    u8Var.a(file);
                    return;
                }
            }
            lk lkVar = this.b;
            Intrinsics.checkNotNull(file);
            if (lkVar.a(file)) {
                u8Var.a(file);
            } else {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                hk hkVar = new hk("", name2, file, u8Var.b(), file.lastModified(), null, file.length(), 32, null);
                ConcurrentHashMap concurrentHashMap = this.j;
                String name3 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                concurrentHashMap.put(name3, hkVar);
            }
            i++;
            z = false;
        }
    }

    @Override // com.chartboost.sdk.impl.xk
    public boolean a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        hk b2 = b(videoFilename);
        return (b2 != null && f(b2)) || (b2 != null && e(b2));
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String uri, String videoFileName, CBError cBError) {
        String str;
        Unit unit;
        File e;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("onError: " + uri, (Throwable) null, 2, (Object) null);
        if (cBError == null || (str = cBError.getErrorDesc()) == null) {
            str = "Unknown error";
        }
        hk b2 = b(videoFileName);
        if (b2 != null && (e = b2.e()) != null) {
            e.delete();
        }
        if (cBError == null || cBError.getType() != CBError.Internal.INTERNET_UNAVAILABLE) {
            c(uri);
            t0 t0Var = (t0) this.i.get(uri);
            if (t0Var != null) {
                t0Var.a(uri);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } else if (b2 != null) {
            this.g.add(b2);
            b(b2);
        }
        this.i.remove(uri);
        this.j.remove(videoFileName);
        a((String) null, this.k.get(), false);
        xb.b("Video download failed: " + uri + " with error " + str, (Throwable) null, 2, (Object) null);
        pg.a("Video downloaded failed " + uri + " with error " + str);
        this.h.remove(uri);
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("onSuccess: " + uri, (Throwable) null, 2, (Object) null);
        pg.a("Video downloaded success " + uri);
        a();
        this.h.remove(uri);
        this.i.remove(uri);
        this.k = new AtomicInteger(1);
        c(uri);
        a((String) null, this.k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.xk
    public void a(String str, int i, boolean z) {
        xb.a("startDownloadIfPossible: " + str, (Throwable) null, 2, (Object) null);
        if (this.g.size() > 0) {
            if (!z && !c()) {
                pg.a("Can't cache next video at the moment");
                this.f.schedule(this.l, i * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            hk d = d(str);
            if (d != null) {
                h(d);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String url, String videoFileName, long j, t0 t0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("tempFileIsReady: " + videoFileName, (Throwable) null, 2, (Object) null);
        hk b2 = b(videoFileName);
        if (j > 0 && b2 != null) {
            b2.a(j);
        }
        if (b2 != null) {
            this.j.remove(videoFileName);
        }
        if (t0Var == null) {
            t0Var = (t0) this.i.get(url);
        }
        if (t0Var != null) {
            t0Var.a(url);
        }
    }
}
