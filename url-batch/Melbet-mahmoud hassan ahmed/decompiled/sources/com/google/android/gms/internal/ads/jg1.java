package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class jg1 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f7119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7120b = 1;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f7121c = Collections.emptyMap();

    /* renamed from: d, reason: collision with root package name */
    private long f7122d;

    /* renamed from: e, reason: collision with root package name */
    private int f7123e;

    public final jg1 a(int i7) {
        this.f7123e = 6;
        return this;
    }

    public final jg1 b(Map<String, String> map) {
        this.f7121c = map;
        return this;
    }

    public final jg1 c(long j7) {
        this.f7122d = j7;
        return this;
    }

    public final jg1 d(Uri uri) {
        this.f7119a = uri;
        return this;
    }

    public final li1 e() {
        Uri uri = this.f7119a;
        if (uri != null) {
            return new li1(uri, this.f7121c, this.f7122d, this.f7123e);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
