package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0416cf {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7141c = "cf";

    /* renamed from: a, reason: collision with root package name */
    public final Oa f7142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7143b;

    public AbstractC0416cf(Oa oa, String str) {
        this.f7142a = oa;
        this.f7143b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T a(String str, float f) {
        synchronized (this) {
            this.f7142a.a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T b(String str, String str2) {
        synchronized (this) {
            this.f7142a.a(str, str2);
        }
        return this;
    }

    public final C0442df c(String str) {
        return new C0442df(str, this.f7143b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T d(String str) {
        synchronized (this) {
            this.f7142a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f7142a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T a(String str, String[] strArr) {
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
        this.f7142a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T b(String str, long j3) {
        synchronized (this) {
            this.f7142a.a(str, j3);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T b(String str, int i3) {
        synchronized (this) {
            this.f7142a.a(i3, str);
        }
        return this;
    }

    public final <T extends AbstractC0416cf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j3) {
        return this.f7142a.getLong(str, j3);
    }

    public final int a(String str, int i3) {
        return this.f7142a.getInt(str, i3);
    }

    public final String a(String str, String str2) {
        return this.f7142a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0416cf> T b(String str, boolean z) {
        synchronized (this) {
            this.f7142a.a(str, z);
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return this.f7142a.getBoolean(str, z);
    }

    public final void b() {
        synchronized (this) {
            this.f7142a.b();
        }
    }

    public final boolean b(String str) {
        return this.f7142a.a(str);
    }
}
