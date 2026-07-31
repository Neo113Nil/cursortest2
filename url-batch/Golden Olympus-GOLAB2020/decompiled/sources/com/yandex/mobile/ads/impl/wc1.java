package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.vi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wc1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f34002c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile wc1 f34003d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yy1 f34004a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d82 f34005b;

    public static final class a {
        private a() {
        }

        @NotNull
        public final wc1 a(@NotNull Context context) {
            wc1 wc1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            wc1 wc1Var2 = wc1.f34003d;
            if (wc1Var2 != null) {
                return wc1Var2;
            }
            synchronized (this) {
                wc1Var = wc1.f34003d;
                if (wc1Var == null) {
                    wc1Var = new wc1(context);
                    wc1.f34003d = wc1Var;
                }
            }
            return wc1Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public interface c {
        void a(@NotNull String str, @NotNull Bitmap bitmap);
    }

    /* synthetic */ wc1(Context context) {
        this(context, new ni0());
    }

    private static cq1 b(Context context) {
        int i4;
        Integer y4;
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && (y4 = a4.y()) != null) {
            if (y4.intValue() == 0) {
                y4 = null;
            }
            if (y4 != null) {
                i4 = y4.intValue();
                cq1 a5 = dq1.a(context, i4);
                a5.a();
                return a5;
            }
        }
        i4 = 4;
        cq1 a52 = dq1.a(context, i4);
        a52.a();
        return a52;
    }

    @NotNull
    public final d82 c() {
        return this.f34005b;
    }

    public static final class b implements vi0.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LruCache<String, Bitmap> f34006a;

        public b(@NotNull xc1 imageCache) {
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            this.f34006a = imageCache;
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        @Nullable
        public final Bitmap a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.f34006a.get(key);
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(@NotNull String key, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f34006a.put(key, bitmap);
        }
    }

    private static xc1 a(Context context) {
        int i4;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            i4 = kotlin.ranges.g.g(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            Object[] args = new Object[0];
            int i5 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            i4 = 5120;
        }
        return new xc1(kotlin.ranges.g.d(i4, 5120));
    }

    private wc1(Context context, ni0 ni0Var) {
        xc1 a4 = a(context);
        cq1 b4 = b(context);
        b bVar = new b(a4);
        this.f34005b = new d82(a4, ni0Var);
        this.f34004a = new yy1(b4, bVar, ni0Var);
    }

    @NotNull
    public final yy1 b() {
        return this.f34004a;
    }
}
