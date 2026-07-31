package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Vk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f38436d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f38437e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f38438f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f38439g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f38440h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f38441i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f38442a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    protected final C2756kf f38443b;

    /* renamed from: c, reason: collision with root package name */
    public Ab f38444c;

    public Vk(@NonNull C2756kf c2756kf, @NonNull String str) {
        this.f38443b = c2756kf;
        this.f38442a = str;
        Ab ab = new Ab();
        try {
            String h4 = c2756kf.h(str);
            if (!TextUtils.isEmpty(h4)) {
                ab = new Ab(h4);
            }
        } catch (Throwable unused) {
        }
        this.f38444c = ab;
    }

    public final Vk a(long j4) {
        a(f38440h, Long.valueOf(j4));
        return this;
    }

    public final Vk b(long j4) {
        a(f38437e, Long.valueOf(j4));
        return this;
    }

    public final Long c() {
        return this.f38444c.a(f38440h);
    }

    public final Vk d(long j4) {
        a(f38438f, Long.valueOf(j4));
        return this;
    }

    public final Long e() {
        return this.f38444c.a(f38439g);
    }

    public final Long f() {
        return this.f38444c.a(f38438f);
    }

    public final Long g() {
        return this.f38444c.a(f38436d);
    }

    public final boolean h() {
        return this.f38444c.length() > 0;
    }

    public final Boolean i() {
        Ab ab = this.f38444c;
        ab.getClass();
        try {
            return Boolean.valueOf(ab.getBoolean(f38441i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Vk a(boolean z4) {
        a(f38441i, Boolean.valueOf(z4));
        return this;
    }

    public final void b() {
        this.f38443b.e(this.f38442a, this.f38444c.toString());
        this.f38443b.b();
    }

    public final Vk c(long j4) {
        a(f38439g, Long.valueOf(j4));
        return this;
    }

    public final Long d() {
        return this.f38444c.a(f38437e);
    }

    public final Vk e(long j4) {
        a(f38436d, Long.valueOf(j4));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f38444c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f38444c = new Ab();
        b();
    }
}
