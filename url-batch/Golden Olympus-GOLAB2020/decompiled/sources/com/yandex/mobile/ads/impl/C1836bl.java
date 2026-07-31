package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.C1836bl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1836bl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExecutorService f23854a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.bl$a */
    static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Bitmap f23855b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f23856c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Handler f23857d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final C1980hl f23858e;

        public a(@NotNull Bitmap originalBitmap, @NotNull zo1 listener, @NotNull Handler handler, @NotNull C1980hl blurredBitmapProvider) {
            Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
            this.f23855b = originalBitmap;
            this.f23856c = listener;
            this.f23857d = handler;
            this.f23858e = blurredBitmapProvider;
        }

        private final void a(final Bitmap bitmap) {
            this.f23857d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.B0
                @Override // java.lang.Runnable
                public final void run() {
                    C1836bl.a.a(C1836bl.a.this, bitmap);
                }
            });
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1980hl c1980hl = this.f23858e;
            Bitmap bitmap = this.f23855b;
            c1980hl.getClass();
            a(C1980hl.a(bitmap, 0.1d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, Bitmap blurredBitmap) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(blurredBitmap, "$blurredBitmap");
            this$0.f23856c.a(blurredBitmap);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bl$b */
    public interface b {
        void a(@NotNull Bitmap bitmap);
    }

    public C1836bl() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f23854a = newSingleThreadExecutor;
    }

    public final void a(@NotNull Bitmap bitmap, @NotNull zo1 listener) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23854a.execute(new a(bitmap, listener, new Handler(Looper.getMainLooper()), new C1980hl()));
    }
}
