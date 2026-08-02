package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class Xe {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11264c = "Xe";

    /* renamed from: a, reason: collision with root package name */
    public final Ha f11265a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11266b;

    public Xe(Ha ha, String str) {
        this.f11265a = ha;
        this.f11266b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, float f4) {
        synchronized (this) {
            this.f11265a.a(str, f4);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, String str2) {
        synchronized (this) {
            this.f11265a.a(str, str2);
        }
        return this;
    }

    public final Ye c(String str) {
        return new Ye(str, this.f11266b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T d(String str) {
        synchronized (this) {
            this.f11265a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f11265a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f11265a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, long j4) {
        synchronized (this) {
            this.f11265a.a(str, j4);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, int i4) {
        synchronized (this) {
            this.f11265a.a(i4, str);
        }
        return this;
    }

    public final <T extends Xe> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j4) {
        return this.f11265a.getLong(str, j4);
    }

    public final int a(String str, int i4) {
        return this.f11265a.getInt(str, i4);
    }

    public final String a(String str, String str2) {
        return this.f11265a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, boolean z) {
        synchronized (this) {
            this.f11265a.a(str, z);
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return this.f11265a.getBoolean(str, z);
    }

    public final void b() {
        synchronized (this) {
            this.f11265a.b();
        }
    }

    public final boolean b(String str) {
        return this.f11265a.a(str);
    }
}
