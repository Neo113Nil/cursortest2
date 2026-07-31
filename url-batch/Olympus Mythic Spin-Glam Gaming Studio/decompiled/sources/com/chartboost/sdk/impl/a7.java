package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
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

/* loaded from: classes9.dex */
public class a7 {
    public final Executor a;
    public final i3 b;
    public final j3 c;
    public final AtomicReference d;
    public final vh e;
    public final u8 f;
    public int g = 1;
    public a2 h = null;
    public final PriorityQueue i = new PriorityQueue();
    public final u7 j;

    public a7(Executor executor, u8 u8Var, i3 i3Var, j3 j3Var, AtomicReference atomicReference, vh vhVar, u7 u7Var) {
        this.a = executor;
        this.f = u8Var;
        this.b = i3Var;
        this.c = j3Var;
        this.d = atomicReference;
        this.e = vhVar;
        this.j = u7Var;
    }

    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.g == 2) {
            a2 a2Var = this.h;
            if (a2Var.m.g == atomicInteger && a2Var.b()) {
                this.h = null;
                d();
            }
        }
    }

    public synchronized void c() {
        try {
            int i = this.g;
            if (i == 3) {
                xb.a("Change state to DOWNLOADING", null);
                this.g = 2;
            } else if (i == 4) {
                xb.a("Change state to IDLE", null);
                this.g = 1;
                d();
            }
        } finally {
        }
    }

    public synchronized void a(af afVar, Map map, AtomicInteger atomicInteger, v1 v1Var, String str) {
        try {
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AtomicReference atomicReference = new AtomicReference(v1Var);
            for (u1 u1Var : map.values()) {
                this.i.add(new z1(afVar, u1Var.b, u1Var.c, u1Var.a, atomicInteger, atomicReference, atomicInteger2, str));
            }
            int i = this.g;
            if (i == 1 || i == 2) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        z1 z1Var;
        z1 z1Var2;
        if (this.h != null && (z1Var2 = (z1) this.i.peek()) != null && this.h.m.b.b() > z1Var2.b.b() && this.h.b()) {
            this.i.add(this.h.m);
            this.h = null;
        }
        while (this.h == null && (z1Var = (z1) this.i.poll()) != null) {
            if (z1Var.g.get() > 0) {
                File file = new File(this.f.a().a, z1Var.e);
                if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
                    xb.b("Unable to create directory " + file.getPath(), null);
                    z1Var.a(this.a, false);
                } else {
                    File file2 = new File(file, z1Var.c);
                    if (file2.exists()) {
                        this.f.d(file2);
                        z1Var.a(this.a, true);
                    } else {
                        a2 a2Var = new a2(this, this.c, z1Var, file2, this.b.a());
                        this.h = a2Var;
                        this.b.a(a2Var);
                    }
                }
            }
        }
        if (this.h != null) {
            if (this.g != 2) {
                xb.a("Change state to DOWNLOADING", null);
                this.g = 2;
                return;
            }
            return;
        }
        if (this.g != 1) {
            xb.a("Change state to IDLE", null);
            this.g = 1;
        }
    }

    public synchronized void b() {
        try {
        } catch (Exception e) {
            xb.b("reduceCacheSize", e);
        } finally {
        }
        if (this.g != 1) {
            return;
        }
        xb.a("########### Trimming the disk cache", null);
        File file = this.f.a().a;
        ArrayList arrayList = new ArrayList();
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str : list) {
                if (!str.equalsIgnoreCase("requests") && !str.equalsIgnoreCase("track") && !str.equalsIgnoreCase("session") && !str.equalsIgnoreCase("videoCompletionEvents") && !str.equalsIgnoreCase("precache") && !str.contains(".")) {
                    arrayList.addAll(p3.a(new File(file, str), true));
                }
            }
        }
        int size = arrayList.size();
        File[] fileArr = new File[size];
        arrayList.toArray(fileArr);
        if (size > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: com.chartboost.sdk.impl.a7$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareTo;
                    compareTo = Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                    return compareTo;
                }
            });
        }
        if (size > 0) {
            sg sgVar = (sg) this.d.get();
            long j = sgVar.n;
            u8 u8Var = this.f;
            long b = u8Var.b(u8Var.a().g);
            long a = this.e.a();
            List list2 = sgVar.d;
            xb.a("Total local file count:" + size, null);
            xb.a("Video Folder Size in bytes :" + b, null);
            xb.a("Max Bytes allowed:" + j, null);
            int i = 0;
            while (i < size) {
                File file2 = fileArr[i];
                long j2 = j;
                sg sgVar2 = sgVar;
                boolean z = TimeUnit.MILLISECONDS.toDays(a - file2.lastModified()) >= ((long) sgVar.p);
                boolean endsWith = file2.getName().endsWith(".tmp");
                File parentFile = file2.getParentFile();
                String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : null;
                boolean contains = absolutePath != null ? absolutePath.contains("/videos") : false;
                boolean z2 = b > j2 && contains;
                if (file2.length() != 0) {
                    if (!endsWith) {
                        if (!z) {
                            if (!list2.contains(parentFile.getName())) {
                                if (z2) {
                                }
                                i++;
                                sgVar = sgVar2;
                                j = j2;
                            }
                        }
                    }
                }
                if (contains) {
                    b -= file2.length();
                }
                xb.a("Deleting file at path:" + file2.getPath(), null);
                if (!file2.delete()) {
                    xb.b("Unable to delete " + file2.getPath(), null);
                    i++;
                    sgVar = sgVar2;
                    j = j2;
                }
                i++;
                sgVar = sgVar2;
                j = j2;
            }
        }
    }

    public synchronized void a(a2 a2Var, CBError cBError, h3 h3Var) {
        String str;
        try {
            int i = this.g;
            if (i == 2 || i == 3) {
                if (a2Var != this.h) {
                    return;
                }
                this.h = null;
                long millis = TimeUnit.NANOSECONDS.toMillis(a2Var.f);
                z1 z1Var = a2Var.m;
                z1Var.i.addAndGet((int) millis);
                z1Var.a(this.a, cBError == null);
                if (cBError == null) {
                    xb.a("Downloaded " + z1Var.d, null);
                } else {
                    String str2 = a2Var.m.f;
                    String errorDesc = cBError.getErrorDesc();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to download ");
                    sb.append(z1Var.d);
                    if (h3Var != null) {
                        str = " Status code=" + h3Var.b();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" Error message=");
                    sb.append(errorDesc);
                    xb.a(sb.toString(), null);
                    String str3 = "Name: " + z1Var.c + " Url: " + z1Var.d + " Error: " + errorDesc;
                    p7 a = this.j.a();
                    if (a != null) {
                        a.mo3222track(new l7(si.a.i, str3, str2, "", null));
                    }
                }
                if (this.g == 3) {
                    xb.a("Change state to PAUSED", null);
                    this.g = 4;
                } else {
                    d();
                }
            }
        } finally {
        }
    }

    public synchronized void a() {
        try {
            int i = this.g;
            if (i == 1) {
                xb.a("Change state to PAUSED", null);
                this.g = 4;
            } else if (i == 2) {
                if (this.h.b()) {
                    this.i.add(this.h.m);
                    this.h = null;
                    xb.a("Change state to PAUSED", null);
                    this.g = 4;
                } else {
                    xb.a("Change state to PAUSING", null);
                    this.g = 3;
                }
            }
        } finally {
        }
    }
}
