package com.facebook.ads.internal.p.b;

import java.io.File;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    public final File f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.ads.internal.p.b.a.c f5318b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.ads.internal.p.b.a.a f5319c;

    c(File file, com.facebook.ads.internal.p.b.a.c cVar, com.facebook.ads.internal.p.b.a.a aVar) {
        this.f5317a = file;
        this.f5318b = cVar;
        this.f5319c = aVar;
    }

    File a(String str) {
        return new File(this.f5317a, this.f5318b.a(str));
    }
}
