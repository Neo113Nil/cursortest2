package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2109n8 {

    /* renamed from: a, reason: collision with root package name */
    private final xf1 f29469a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f29470b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f29471c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f29472d;

    /* renamed from: e, reason: collision with root package name */
    private final String f29473e;

    /* renamed from: f, reason: collision with root package name */
    private final String f29474f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29475g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC2132o8 f29476h;

    private C2109n8(xf1 xf1Var, String str, List list) {
        EnumC2132o8 enumC2132o8 = EnumC2132o8.f29940d;
        ArrayList arrayList = new ArrayList();
        this.f29471c = arrayList;
        this.f29472d = new HashMap();
        this.f29469a = xf1Var;
        this.f29470b = null;
        this.f29473e = str;
        this.f29476h = enumC2132o8;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ta2 ta2Var = (ta2) it.next();
                this.f29472d.put(UUID.randomUUID().toString(), ta2Var);
            }
        }
        this.f29475g = null;
        this.f29474f = null;
    }

    public static C2109n8 a(xf1 xf1Var, String str, List list) {
        if (list != null) {
            return new C2109n8(xf1Var, str, list);
        }
        throw new IllegalArgumentException("VerificationScriptResources is null");
    }

    public final String b() {
        return this.f29475g;
    }

    public final String c() {
        return this.f29474f;
    }

    public final Map<String, ta2> d() {
        return Collections.unmodifiableMap(this.f29472d);
    }

    public final String e() {
        return this.f29473e;
    }

    public final xf1 f() {
        return this.f29469a;
    }

    public final List<ta2> g() {
        return Collections.unmodifiableList(this.f29471c);
    }

    public final WebView h() {
        return this.f29470b;
    }

    public final EnumC2132o8 a() {
        return this.f29476h;
    }
}
