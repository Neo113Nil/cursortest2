package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.xr0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes3.dex */
public final class yr0 implements xr0, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35298a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qx1 f35299b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f35300c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W1.h f35301d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f35302e;

    static final class a extends kotlin.jvm.internal.s implements Function0<SharedPreferences> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qx1.a(yr0.this.f35299b, yr0.this.f35300c, yr0.this.f35298a);
        }
    }

    public yr0(@NotNull Context context, @NotNull String fileName, @NotNull qx1 preferencesFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(preferencesFactory, "preferencesFactory");
        this.f35298a = fileName;
        this.f35299b = preferencesFactory;
        Context applicationContext = context.getApplicationContext();
        this.f35300c = applicationContext != null ? applicationContext : context;
        this.f35301d = W1.i.b(new a());
        this.f35302e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void clear() {
        ((SharedPreferences) this.f35301d.getValue()).edit().clear().apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    @Nullable
    public final String d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f35301d.getValue()).getString(key, null);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(@Nullable SharedPreferences sharedPreferences, @Nullable String str) {
        if (str != null) {
            Iterator it = this.f35302e.iterator();
            while (it.hasNext()) {
                xr0.a aVar = (xr0.a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    @NotNull
    public final Map<String, ?> a() {
        Map<String, ?> all = ((SharedPreferences) this.f35301d.getValue()).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final int b(int i4, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).contains(key);
        return ((SharedPreferences) this.f35301d.getValue()).getInt(key, i4);
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final boolean c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f35301d.getValue()).contains(key);
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final boolean a(@NotNull String key, boolean z4) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f35301d.getValue()).getBoolean(key, z4);
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    @Nullable
    public final Set<String> a(@NotNull String key, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f35301d.getValue()).getStringSet(key, set);
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final long b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f35301d.getValue()).getLong(key, 0L);
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(int i4, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().putInt(key, i4).apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void b(@NotNull String key, boolean z4) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().putBoolean(key, z4).apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(@NotNull String key, long j4) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().putLong(key, j4).apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().putString(key, str).apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(@NotNull String key, @Nullable HashSet hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().putStringSet(key, hashSet).apply();
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(@NotNull xr0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f35302e.isEmpty()) {
            ((SharedPreferences) this.f35301d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f35302e.add(new WeakReference(listener));
    }

    @Override // com.yandex.mobile.ads.impl.xr0
    public final void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f35301d.getValue()).edit().remove(key).apply();
    }
}
