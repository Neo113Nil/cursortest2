package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2782lf {

    /* renamed from: c, reason: collision with root package name */
    public static final String f39399c = "lf";

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2542cb f39400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39401b;

    public AbstractC2782lf(InterfaceC2542cb interfaceC2542cb, String str) {
        this.f39400a = interfaceC2542cb;
        this.f39401b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T a(String str, float f4) {
        synchronized (this) {
            this.f39400a.a(str, f4);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T b(String str, String str2) {
        synchronized (this) {
            this.f39400a.a(str, str2);
        }
        return this;
    }

    public final C2808mf c(String str) {
        return new C2808mf(str, this.f39401b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T d(String str) {
        synchronized (this) {
            this.f39400a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.f39400a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T a(String str, String[] strArr) {
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
        this.f39400a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T b(String str, long j4) {
        synchronized (this) {
            this.f39400a.a(str, j4);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends AbstractC2782lf> T b(String str, int i4) {
        synchronized (this) {
            this.f39400a.a(i4, str);
        }
        return this;
    }

    public final <T extends AbstractC2782lf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j4) {
        return this.f39400a.getLong(str, j4);
    }

    public final int a(@NonNull String str, int i4) {
        return this.f39400a.getInt(str, i4);
    }

    public final String a(@NonNull String str, String str2) {
        return this.f39400a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC2782lf> T b(String str, boolean z4) {
        synchronized (this) {
            this.f39400a.a(str, z4);
        }
        return this;
    }

    public final boolean a(String str, boolean z4) {
        return this.f39400a.getBoolean(str, z4);
    }

    public final void b() {
        synchronized (this) {
            this.f39400a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f39400a.a(str);
    }
}
