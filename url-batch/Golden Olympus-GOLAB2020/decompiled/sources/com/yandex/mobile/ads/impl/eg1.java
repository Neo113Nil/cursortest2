package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface eg1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25287a = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f25288a = new a();

        private a() {
        }

        public static eg1 a(boolean z4) {
            Handler handler = new Handler(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new fg1(z4, handler);
        }
    }

    void a(long j4, @Nullable gg1 gg1Var);

    void a(@Nullable b52 b52Var);

    void invalidate();

    void pause();

    void resume();

    void stop();
}
