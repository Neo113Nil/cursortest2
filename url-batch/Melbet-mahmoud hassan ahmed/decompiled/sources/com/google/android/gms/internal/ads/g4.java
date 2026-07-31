package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    private String f5447a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f5448b;

    /* renamed from: c, reason: collision with root package name */
    private final i6 f5449c = new i6();

    /* renamed from: d, reason: collision with root package name */
    private final oc f5450d = new oc(null);

    /* renamed from: e, reason: collision with root package name */
    private final List f5451e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private final e73<xm> f5452f = e73.w();

    /* renamed from: g, reason: collision with root package name */
    private final rf f5453g = new rf();

    public final g4 a(String str) {
        this.f5447a = str;
        return this;
    }

    public final g4 b(Uri uri) {
        this.f5448b = uri;
        return this;
    }

    public final zo c() {
        Uri uri = this.f5448b;
        xl xlVar = uri != null ? new xl(uri, null, null, null, this.f5451e, null, this.f5452f, null, null) : null;
        String str = this.f5447a;
        if (str == null) {
            str = "";
        }
        return new zo(str, new ma(this.f5449c, null), xlVar, new th(this.f5453g), fu.f5219t, null);
    }
}
