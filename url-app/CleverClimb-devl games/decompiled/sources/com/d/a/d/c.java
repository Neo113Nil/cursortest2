package com.d.a.d;

import java.util.Iterator;
import java.util.List;

/* compiled from: RequestInfo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f4455a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4456b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4457c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4458d;
    private final int e;
    private final long f;
    private final long g;
    private final int h;
    private final List<a> i;
    private final int j;

    public c(long j, int i, String str, String str2, int i2, long j2, long j3, int i3, List<a> list, int i4) {
        if (str == null) {
            throw new NullPointerException("Url cannot be null");
        }
        if (str2 == null) {
            throw new NullPointerException("FilePath cannot be null");
        }
        if (list == null) {
            throw new NullPointerException("Headers cannot be null");
        }
        this.f4455a = j;
        this.f4456b = i;
        this.f4457c = str;
        this.f4458d = str2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = list;
        this.j = i4;
    }

    public long a() {
        return this.f4455a;
    }

    public int b() {
        return this.f4456b;
    }

    public String c() {
        return this.f4457c;
    }

    public String d() {
        return this.f4458d;
    }

    public int e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public List<a> i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(",");
        }
        if (this.i.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return "{id:" + this.f4455a + ",status:" + this.f4456b + ",url:" + this.f4457c + ",filePath:" + this.f4458d + ",progress:" + this.e + ",fileSize:" + this.g + ",error:" + this.h + ",headers:{" + sb.toString() + "},priority:" + this.j + "}";
    }
}
