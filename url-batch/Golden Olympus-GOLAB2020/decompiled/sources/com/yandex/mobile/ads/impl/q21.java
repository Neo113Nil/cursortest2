package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q21 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f30646c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile q21 f30647d;

    /* renamed from: a, reason: collision with root package name */
    private final int f30648a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<eu0, j21> f30649b;

    public static final class a {
        private a() {
        }

        @NotNull
        public final q21 a(@NotNull Context context) {
            q21 q21Var;
            Intrinsics.checkNotNullParameter(context, "context");
            q21 q21Var2 = q21.f30647d;
            if (q21Var2 != null) {
                return q21Var2;
            }
            synchronized (this) {
                try {
                    q21Var = q21.f30647d;
                    if (q21Var == null) {
                        int i4 = ew1.f25476l;
                        du1 a4 = ew1.a.a().a(context);
                        q21 q21Var3 = new q21(a4 != null ? a4.E() : 0, 0);
                        q21.f30647d = q21Var3;
                        q21Var = q21Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return q21Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private q21(int i4) {
        this.f30648a = i4;
        this.f30649b = new WeakHashMap<>();
    }

    @Nullable
    public final j21 b(@NotNull eu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f30649b.remove(media);
    }

    public final boolean a(@NotNull eu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f30649b.containsKey(media);
    }

    public final boolean b() {
        return this.f30649b.size() == this.f30648a;
    }

    public /* synthetic */ q21(int i4, int i5) {
        this(i4);
    }

    public final void a(@NotNull j21 mraidWebView, @NotNull eu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        if (this.f30649b.size() < this.f30648a) {
            this.f30649b.put(media, mraidWebView);
        }
    }
}
