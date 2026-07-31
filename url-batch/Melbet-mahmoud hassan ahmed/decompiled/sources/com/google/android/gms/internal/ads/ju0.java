package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ju0 implements nb3<Map<String, String>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f7250a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7251b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f7252c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ lu0 f7253d;

    ju0(lu0 lu0Var, List list, String str, Uri uri) {
        this.f7253d = lu0Var;
        this.f7250a = list;
        this.f7251b = str;
        this.f7252c = uri;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(Map<String, String> map) {
        this.f7253d.m(map, this.f7250a, this.f7251b);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        io0.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f7252c)));
    }
}
