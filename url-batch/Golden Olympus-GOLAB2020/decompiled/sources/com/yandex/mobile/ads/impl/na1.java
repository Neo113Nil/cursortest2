package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.p30;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class na1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final n30 f29527a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, td2> f29528b;

    public na1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context appContext = context.getApplicationContext();
        int i4 = ce2.f24188c;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.f29527a = ce2.b(appContext);
        this.f29528b = new ConcurrentHashMap<>();
    }

    public final void a(@NotNull String url, @NotNull td2 videoCacheListener, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoCacheListener, "videoCacheListener");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (this.f29527a == null) {
            videoCacheListener.b();
            a();
            return;
        }
        p30 a4 = new p30.b(Uri.parse(url), requestId).a();
        this.f29528b.put(requestId, videoCacheListener);
        this.f29527a.a(new fj2(requestId, videoCacheListener));
        this.f29527a.a(a4);
        this.f29527a.a();
    }

    public final void a() {
        Iterator<Map.Entry<String, td2>> it = this.f29528b.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            n30 n30Var = this.f29527a;
            if (n30Var != null) {
                n30Var.a(key);
            }
        }
        this.f29528b.clear();
    }

    public final void a(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        n30 n30Var = this.f29527a;
        if (n30Var != null) {
            n30Var.a(requestId);
        }
        this.f29528b.remove(requestId);
    }
}
