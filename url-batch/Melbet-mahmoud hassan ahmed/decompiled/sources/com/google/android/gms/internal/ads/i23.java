package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class i23 implements x03 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6497a;

    /* renamed from: b, reason: collision with root package name */
    private final j23 f6498b;

    /* renamed from: c, reason: collision with root package name */
    private final v23 f6499c;

    /* renamed from: d, reason: collision with root package name */
    private final u03 f6500d;

    i23(Object obj, j23 j23Var, v23 v23Var, u03 u03Var) {
        this.f6497a = obj;
        this.f6498b = j23Var;
        this.f6499c = v23Var;
        this.f6500d = u03Var;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        n9 F = o9.F();
        F.t(5);
        F.r(uo3.J(bArr));
        return Base64.encodeToString(F.o().d(), 11);
    }

    private final synchronized byte[] j(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e7) {
            this.f6500d.c(2007, System.currentTimeMillis() - currentTimeMillis, e7);
            return null;
        }
        return (byte[]) this.f6497a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f6497a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.x03
    public final synchronized String a(Context context, String str) {
        Map<String, Object> a7;
        a7 = this.f6499c.a();
        a7.put("f", "q");
        a7.put("ctx", context);
        a7.put("aid", null);
        return i(j(null, a7));
    }

    @Override // com.google.android.gms.internal.ads.x03
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f6497a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f6497a, hashMap);
            this.f6500d.d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e7) {
            throw new t23(2005, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.x03
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zza;
        zza = this.f6499c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return i(j(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.x03
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map<String, Object> c7;
        c7 = this.f6499c.c();
        c7.put("f", "v");
        c7.put("ctx", context);
        c7.put("aid", null);
        c7.put("view", view);
        c7.put("act", null);
        return i(j(null, c7));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e7) {
            throw new t23(2006, e7);
        }
        return ((Integer) this.f6497a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f6497a, new Object[0])).intValue();
    }

    final j23 f() {
        return this.f6498b;
    }

    public final synchronized void g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f6497a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f6497a, new Object[0]);
            this.f6500d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e7) {
            throw new t23(2003, e7);
        }
    }

    final synchronized boolean h() {
        try {
        } catch (Exception e7) {
            throw new t23(2001, e7);
        }
        return ((Boolean) this.f6497a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f6497a, new Object[0])).booleanValue();
    }
}
