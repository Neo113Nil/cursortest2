package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.chartboost.sdk.impl.c0;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zg {
    public final SharedPreferences a;
    public final String b;
    public volatile long c;
    public final int d;
    public final AtomicInteger e;
    public final AtomicInteger f;
    public final AtomicInteger g;
    public tg h;

    public zg(SharedPreferences mPrefs) {
        Intrinsics.checkNotNullParameter(mPrefs, "mPrefs");
        this.a = mPrefs;
        this.e = new AtomicInteger(0);
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
        this.h = new tg() { // from class: com.chartboost.sdk.impl.zg$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.tg
            public final boolean a() {
                return zg.h();
            }
        };
        this.b = a();
        this.c = SystemClock.uptimeMillis();
        int e = e() + 1;
        Integer valueOf = e < 0 ? null : Integer.valueOf(e);
        this.d = valueOf != null ? valueOf.intValue() : Integer.MAX_VALUE;
        g();
    }

    public static final boolean h() {
        return false;
    }

    public final void a(c0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, c0.b.g)) {
            this.e.incrementAndGet();
        } else if (Intrinsics.areEqual(type, c0.c.g)) {
            this.f.incrementAndGet();
        } else if (Intrinsics.areEqual(type, c0.a.g)) {
            this.g.incrementAndGet();
        }
    }

    public final ah i() {
        return new ah(this.b, c(), this.d, b(c0.a.g), b(c0.c.g), b(c0.b.g));
    }

    public final String d() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final long c() {
        if (this.h.a()) {
            return SystemClock.uptimeMillis() - this.c;
        }
        return 0L;
    }

    public final void f() {
        this.c = SystemClock.uptimeMillis();
    }

    public final void a(tg tgVar) {
        Intrinsics.checkNotNullParameter(tgVar, "<set-?>");
        this.h = tgVar;
    }

    public final int b(c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            return this.e.get();
        }
        if (Intrinsics.areEqual(c0Var, c0.c.g)) {
            return this.f.get();
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            return this.g.get();
        }
        return 0;
    }

    public final int e() {
        return this.a.getInt("session_key", 0);
    }

    public final void g() {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor edit = this.a.edit();
        if (edit == null || (putInt = edit.putInt("session_key", this.d)) == null) {
            return;
        }
        putInt.apply();
    }

    public final String a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return u2.a(uuid);
    }
}
