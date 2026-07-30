package com.anythink.basead.exoplayer.j.a;

import java.io.File;

/* loaded from: classes.dex */
public class e implements Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8218b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8219c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8220d;

    /* renamed from: e, reason: collision with root package name */
    public final File f8221e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8222f;

    private e(String str, long j9, long j10) {
        this(str, j9, j10, com.anythink.basead.exoplayer.b.f6539b, null);
    }

    public final boolean a() {
        return this.f8219c == -1;
    }

    public final boolean b() {
        return !this.f8220d;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        if (!this.f8217a.equals(eVar2.f8217a)) {
            return this.f8217a.compareTo(eVar2.f8217a);
        }
        long j9 = this.f8218b - eVar2.f8218b;
        if (j9 == 0) {
            return 0;
        }
        return j9 < 0 ? -1 : 1;
    }

    public e(String str, long j9, long j10, long j11, File file) {
        this.f8217a = str;
        this.f8218b = j9;
        this.f8219c = j10;
        this.f8220d = file != null;
        this.f8221e = file;
        this.f8222f = j11;
    }

    private int a(e eVar) {
        if (!this.f8217a.equals(eVar.f8217a)) {
            return this.f8217a.compareTo(eVar.f8217a);
        }
        long j9 = this.f8218b - eVar.f8218b;
        if (j9 == 0) {
            return 0;
        }
        return j9 < 0 ? -1 : 1;
    }
}
