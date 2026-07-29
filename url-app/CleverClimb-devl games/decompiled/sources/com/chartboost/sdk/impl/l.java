package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.google.android.gms.games.request.Requests;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3846b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f3847c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f3848d;
    private final AtomicReference<com.chartboost.sdk.Model.e> e;
    private final com.chartboost.sdk.Libraries.i f;
    private final com.chartboost.sdk.Tracking.a g;
    private final com.chartboost.sdk.Libraries.f h;

    /* renamed from: a, reason: collision with root package name */
    int f3845a = 1;
    private k i = null;
    private final PriorityQueue<j> j = new PriorityQueue<>();

    public l(Executor executor, com.chartboost.sdk.Libraries.f fVar, ah ahVar, ai aiVar, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, com.chartboost.sdk.Libraries.i iVar, com.chartboost.sdk.Tracking.a aVar) {
        this.f3846b = executor;
        this.h = fVar;
        this.f3847c = ahVar;
        this.f3848d = aiVar;
        this.e = atomicReference;
        this.f = iVar;
        this.g = aVar;
    }

    public synchronized void a(int i, Map<String, com.chartboost.sdk.Model.b> map, AtomicInteger atomicInteger, h hVar) {
        long b2 = this.f.b();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference(hVar);
        for (com.chartboost.sdk.Model.b bVar : map.values()) {
            this.j.add(new j(this.f, i, bVar.f3615b, bVar.f3616c, bVar.f3614a, atomicInteger, atomicReference, b2, atomicInteger2));
            b2 = b2;
        }
        if (this.f3845a == 1 || this.f3845a == 2) {
            d();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        switch (this.f3845a) {
            case 2:
                if ((this.i.f3844a.e == atomicInteger) && this.i.b()) {
                    this.i = null;
                    d();
                }
                break;
        }
    }

    public synchronized void a() {
        switch (this.f3845a) {
            case 1:
                CBLogging.a("Downloader", "Change state to PAUSED");
                this.f3845a = 4;
                break;
            case 2:
                if (this.i.b()) {
                    this.j.add(this.i.f3844a);
                    this.i = null;
                    CBLogging.a("Downloader", "Change state to PAUSED");
                    this.f3845a = 4;
                    break;
                } else {
                    CBLogging.a("Downloader", "Change state to PAUSING");
                    this.f3845a = 3;
                    break;
                }
        }
    }

    public synchronized void b() {
        switch (this.f3845a) {
            case 3:
                CBLogging.a("Downloader", "Change state to DOWNLOADING");
                this.f3845a = 2;
                break;
            case 4:
                CBLogging.a("Downloader", "Change state to IDLE");
                this.f3845a = 1;
                d();
                break;
        }
    }

    synchronized void a(k kVar, CBError cBError, ag agVar) {
        String str;
        String str2;
        switch (this.f3845a) {
            case 2:
            case 3:
                if (kVar == this.i) {
                    j jVar = kVar.f3844a;
                    this.i = null;
                    long millis = TimeUnit.NANOSECONDS.toMillis(kVar.g);
                    jVar.f.addAndGet((int) millis);
                    jVar.a(this.f3846b, cBError == null);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(kVar.h);
                    long millis3 = TimeUnit.NANOSECONDS.toMillis(kVar.i);
                    if (cBError == null) {
                        this.g.a(jVar.f3842c, millis, millis2, millis3);
                        CBLogging.a("Downloader", "Downloaded " + jVar.f3842c);
                    } else {
                        String b2 = cBError.b();
                        this.g.a(jVar.f3842c, b2, millis, millis2, millis3);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to download ");
                        sb.append(jVar.f3842c);
                        if (agVar != null) {
                            str = " Status code=" + agVar.f3707a;
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        if (b2 != null) {
                            str2 = " Error message=" + b2;
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        CBLogging.a("Downloader", sb.toString());
                    }
                    if (this.f3845a == 3) {
                        CBLogging.a("Downloader", "Change state to PAUSED");
                        this.f3845a = 4;
                        break;
                    } else {
                        d();
                        break;
                    }
                } else {
                    return;
                }
        }
    }

    private void d() {
        j poll;
        j peek;
        if (this.i != null && (peek = this.j.peek()) != null && this.i.f3844a.f3840a > peek.f3840a && this.i.b()) {
            this.j.add(this.i.f3844a);
            this.i = null;
        }
        while (this.i == null && (poll = this.j.poll()) != null) {
            if (poll.e.get() > 0) {
                File file = new File(this.h.d().f3587a, poll.f3843d);
                if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
                    CBLogging.b("Downloader", "Unable to create directory " + file.getPath());
                    poll.a(this.f3846b, false);
                } else {
                    File file2 = new File(file, poll.f3841b);
                    if (file2.exists()) {
                        this.h.c(file2);
                        poll.a(this.f3846b, true);
                    } else {
                        this.i = new k(this, this.f3848d, poll, file2);
                        this.f3847c.a(this.i);
                        this.g.a(poll.f3842c, poll.f3841b);
                    }
                }
            }
        }
        if (this.i != null) {
            if (this.f3845a != 2) {
                CBLogging.a("Downloader", "Change state to DOWNLOADING");
                this.f3845a = 2;
                return;
            }
            return;
        }
        if (this.f3845a != 1) {
            CBLogging.a("Downloader", "Change state to IDLE");
            this.f3845a = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c() {
        boolean z;
        if (this.f3845a != 1) {
            return;
        }
        try {
            CBLogging.a("Downloader", "########### Trimming the disk cache");
            File file = this.h.d().f3587a;
            ArrayList arrayList = new ArrayList();
            String[] list = file.list();
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (!str.equalsIgnoreCase(Requests.EXTRA_REQUESTS) && !str.equalsIgnoreCase("track") && !str.equalsIgnoreCase(com.umeng.analytics.pro.b.ac) && !str.equalsIgnoreCase("videoCompletionEvents") && !str.contains(".")) {
                        arrayList.addAll(CBUtility.a(new File(file, str), true));
                    }
                }
            }
            File[] fileArr = new File[arrayList.size()];
            arrayList.toArray(fileArr);
            if (fileArr.length > 1) {
                Arrays.sort(fileArr, new Comparator<File>() { // from class: com.chartboost.sdk.impl.l.1
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file3.lastModified()));
                    }
                });
            }
            if (fileArr.length > 0) {
                com.chartboost.sdk.Model.e eVar = this.e.get();
                long j = eVar.u;
                long b2 = this.h.b(this.h.d().g);
                long a2 = this.f.a();
                List<String> list2 = eVar.f3624d;
                CBLogging.a("Downloader", "Total local file count:" + fileArr.length);
                CBLogging.a("Downloader", "Video Folder Size in bytes :" + b2);
                CBLogging.a("Downloader", "Max Bytes allowed:" + j);
                int length = fileArr.length;
                long j2 = b2;
                int i = 0;
                while (i < length) {
                    File file2 = fileArr[i];
                    long j3 = j;
                    com.chartboost.sdk.Model.e eVar2 = eVar;
                    boolean z2 = TimeUnit.MILLISECONDS.toDays(a2 - file2.lastModified()) >= ((long) eVar.w);
                    boolean endsWith = file2.getName().endsWith(".tmp");
                    File parentFile = file2.getParentFile();
                    boolean contains = parentFile.getAbsolutePath().contains("/videos");
                    boolean z3 = j2 > j3 && contains;
                    if (file2.length() != 0 && !endsWith && !z2 && !list2.contains(parentFile.getName()) && !z3) {
                        z = false;
                        if (z) {
                            if (contains) {
                                j2 -= file2.length();
                            }
                            CBLogging.a("Downloader", "Deleting file at path:" + file2.getPath());
                            if (!file2.delete()) {
                                CBLogging.b("Downloader", "Unable to delete " + file2.getPath());
                            }
                        }
                        i++;
                        j = j3;
                        eVar = eVar2;
                    }
                    z = true;
                    if (z) {
                    }
                    i++;
                    j = j3;
                    eVar = eVar2;
                }
            }
            this.g.a(this.h.e());
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "reduceCacheSize", e);
        }
    }
}
