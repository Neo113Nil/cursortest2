package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3542lo {

    /* renamed from: e, reason: collision with root package name */
    public final String f32597e;

    /* renamed from: f, reason: collision with root package name */
    public final C3381io f32598f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32594b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f32595c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32596d = false;

    /* renamed from: a, reason: collision with root package name */
    public final t2.E f32593a = p2.j.f39798C.f39808h.g();

    public C3542lo(C3381io c3381io, String str) {
        this.f32597e = str;
        this.f32598f = c3381io;
    }

    public final synchronized void a(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue()) {
            HashMap e6 = e();
            e6.put(NativeAdvancedJsUtils.f18064p, "adapter_init_started");
            e6.put("ancn", str);
            this.f32594b.add(e6);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue()) {
            HashMap e6 = e();
            e6.put(NativeAdvancedJsUtils.f18064p, "adapter_init_finished");
            e6.put("ancn", str);
            this.f32594b.add(e6);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue()) {
            HashMap e6 = e();
            e6.put(NativeAdvancedJsUtils.f18064p, "adapter_init_finished");
            e6.put("ancn", str);
            e6.put("rqe", str2);
            this.f32594b.add(e6);
        }
    }

    public final synchronized void d() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue() && !this.f32595c) {
            HashMap e6 = e();
            e6.put(NativeAdvancedJsUtils.f18064p, "init_started");
            this.f32594b.add(e6);
            this.f32595c = true;
        }
    }

    public final HashMap e() {
        C3381io c3381io = this.f32598f;
        c3381io.getClass();
        HashMap hashMap = new HashMap(c3381io.f31998a);
        p2.j.f39798C.f39810k.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f32593a.t() ? "" : this.f32597e);
        return hashMap;
    }
}
