package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0567cf {

    /* renamed from: c, reason: collision with root package name */
    public static final String f7997c = "cf";

    /* renamed from: a, reason: collision with root package name */
    public final Oa f7998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7999b;

    public AbstractC0567cf(Oa oa, String str) {
        this.f7998a = oa;
        this.f7999b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T a(String str, float f3) {
        synchronized (this) {
            this.f7998a.a(str, f3);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T b(String str, String str2) {
        synchronized (this) {
            this.f7998a.a(str, str2);
        }
        return this;
    }

    public final C0593df c(String str) {
        return new C0593df(str, this.f7999b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T d(String str) {
        synchronized (this) {
            this.f7998a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f7998a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T a(String str, String[] strArr) {
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
        this.f7998a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T b(String str, long j2) {
        synchronized (this) {
            this.f7998a.a(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T b(String str, int i2) {
        synchronized (this) {
            this.f7998a.a(i2, str);
        }
        return this;
    }

    public final <T extends AbstractC0567cf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j2) {
        return this.f7998a.getLong(str, j2);
    }

    public final int a(String str, int i2) {
        return this.f7998a.getInt(str, i2);
    }

    public final String a(String str, String str2) {
        return this.f7998a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC0567cf> T b(String str, boolean z) {
        synchronized (this) {
            this.f7998a.a(str, z);
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return this.f7998a.getBoolean(str, z);
    }

    public final void b() {
        synchronized (this) {
            this.f7998a.b();
        }
    }

    public final boolean b(String str) {
        return this.f7998a.a(str);
    }
}
