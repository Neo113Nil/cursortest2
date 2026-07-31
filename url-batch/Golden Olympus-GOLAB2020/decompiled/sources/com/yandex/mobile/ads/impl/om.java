package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import java.io.File;

/* loaded from: classes3.dex */
public class om implements Comparable<om> {

    /* renamed from: b, reason: collision with root package name */
    public final String f30089b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30090c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30091d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30092e;

    /* renamed from: f, reason: collision with root package name */
    public final File f30093f;

    /* renamed from: g, reason: collision with root package name */
    public final long f30094g;

    public om(String str, long j4, long j5, long j6, File file) {
        this.f30089b = str;
        this.f30090c = j4;
        this.f30091d = j5;
        this.f30092e = file != null;
        this.f30093f = file;
        this.f30094g = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(om omVar) {
        om omVar2 = omVar;
        if (!this.f30089b.equals(omVar2.f30089b)) {
            return this.f30089b.compareTo(omVar2.f30089b);
        }
        long j4 = this.f30090c - omVar2.f30090c;
        if (j4 == 0) {
            return 0;
        }
        return j4 < 0 ? -1 : 1;
    }

    public final String toString() {
        return b9.i.f15550d + this.f30090c + ", " + this.f30091d + b9.i.f15552e;
    }
}
