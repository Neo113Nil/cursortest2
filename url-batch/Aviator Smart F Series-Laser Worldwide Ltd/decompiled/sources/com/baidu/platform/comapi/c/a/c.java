package com.baidu.platform.comapi.c.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.baidu.mapapi.JNIInitializer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f9001a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private b f9002b;

    /* renamed from: c, reason: collision with root package name */
    private a f9003c;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SharedPreferences f9004a;

        /* renamed from: b, reason: collision with root package name */
        private SharedPreferences.Editor f9005b;

        public a(SharedPreferences sharedPreferences) {
            this.f9004a = sharedPreferences;
        }
    }

    private c(b bVar) {
        if (JNIInitializer.getCachedContext() == null) {
            return;
        }
        this.f9002b = bVar;
        String a8 = bVar.a();
        if (!bVar.b()) {
            this.f9003c = new a(JNIInitializer.getCachedContext().getSharedPreferences(a8, 0));
            return;
        }
        Map<String, a> map = f9001a;
        a aVar = map.get(a8);
        if (aVar != null) {
            this.f9003c = aVar;
            return;
        }
        a aVar2 = new a(JNIInitializer.getCachedContext().getSharedPreferences(a8, 0));
        this.f9003c = aVar2;
        map.put(a8, aVar2);
    }

    public static c a(b bVar) {
        if (TextUtils.isEmpty(bVar.a())) {
            throw new IllegalArgumentException();
        }
        return new c(bVar);
    }

    public void b(String str, int i8) {
        synchronized (this.f9002b) {
            a();
            this.f9003c.f9005b.putInt(str, i8).apply();
        }
    }

    public int a(String str, int i8) {
        int i9;
        synchronized (this.f9002b) {
            i9 = this.f9003c.f9004a.getInt(str, i8);
        }
        return i9;
    }

    public void a(String str) {
        synchronized (this.f9002b) {
            a();
            this.f9003c.f9005b.remove(str).apply();
        }
    }

    private void a() {
        synchronized (this.f9002b) {
            try {
                a aVar = this.f9003c;
                if (aVar.f9005b != null) {
                    return;
                }
                aVar.f9005b = aVar.f9004a.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
