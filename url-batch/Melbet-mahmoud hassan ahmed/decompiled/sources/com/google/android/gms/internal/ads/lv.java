package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lv {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f8094a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List<String> f8095b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8096c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f8097d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f8098e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f8099f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f8100g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f8101h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f8102i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f8103j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f8104k = 60000;

    public final kv a() {
        return new kv(8, -1L, this.f8094a, -1, this.f8095b, this.f8096c, this.f8097d, false, null, null, null, null, this.f8098e, this.f8099f, this.f8100g, null, null, false, null, this.f8101h, this.f8102i, this.f8103j, this.f8104k, null);
    }

    public final lv b(Bundle bundle) {
        this.f8094a = bundle;
        return this;
    }

    public final lv c(int i7) {
        this.f8104k = i7;
        return this;
    }

    public final lv d(boolean z6) {
        this.f8096c = z6;
        return this;
    }

    public final lv e(List<String> list) {
        this.f8095b = list;
        return this;
    }

    public final lv f(String str) {
        this.f8102i = str;
        return this;
    }

    public final lv g(int i7) {
        this.f8097d = i7;
        return this;
    }

    public final lv h(int i7) {
        this.f8101h = i7;
        return this;
    }
}
