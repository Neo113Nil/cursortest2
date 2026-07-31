package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e10<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f4453a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4454b;

    /* renamed from: c, reason: collision with root package name */
    private final T f4455c;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ e10(int i7, String str, Object obj, d10 d10Var) {
        this.f4453a = i7;
        this.f4454b = str;
        this.f4455c = obj;
        sw.a().d(this);
    }

    public static e10<Float> f(int i7, String str, float f7) {
        return new a10(1, str, Float.valueOf(f7));
    }

    public static e10<Integer> g(int i7, String str, int i8) {
        return new y00(1, str, Integer.valueOf(i8));
    }

    public static e10<Long> h(int i7, String str, long j7) {
        return new z00(1, str, Long.valueOf(j7));
    }

    public static e10<Boolean> i(int i7, String str, Boolean bool) {
        return new x00(i7, str, bool);
    }

    public static e10<String> j(int i7, String str, String str2) {
        return new b10(1, str, str2);
    }

    public static e10<String> k(int i7, String str) {
        e10<String> j7 = j(1, "gads:sdk_core_constants:experiment_id", null);
        sw.a().c(j7);
        return j7;
    }

    protected abstract T a(JSONObject jSONObject);

    public abstract T b(Bundle bundle);

    protected abstract T c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, T t6);

    public final int e() {
        return this.f4453a;
    }

    public final T l() {
        return this.f4455c;
    }

    public final String m() {
        return this.f4454b;
    }
}
