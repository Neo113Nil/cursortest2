package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.vi0;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f30787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zi0 f30788b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vi0 f30789c;

    public interface a {
        boolean a();
    }

    public interface b {
        void a(@Nullable Bitmap bitmap);
    }

    public static final class c implements vi0.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f30792c;

        c(String str, b bVar) {
            this.f30791b = str;
            this.f30792c = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@Nullable hi2 hi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.vi0.d
        public final void a(@Nullable vi0.c cVar, boolean z4) {
            Bitmap b4 = cVar.b();
            if (b4 != null) {
                qi0 qi0Var = qi0.this;
                String str = this.f30791b;
                b bVar = this.f30792c;
                qi0Var.f30788b.a(MapsKt.mapOf(TuplesKt.to(str, b4)));
                bVar.a(b4);
            }
        }
    }

    public /* synthetic */ qi0(Context context, a aVar, zi0 zi0Var) {
        this(context, aVar, zi0Var, wc1.f34002c.a(context).b());
    }

    public final void a(@NotNull ej0 imageValue, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bitmap b4 = this.f30788b.b(imageValue);
        if (b4 != null) {
            listener.a(b4);
            return;
        }
        listener.a(this.f30788b.a(imageValue));
        if (this.f30787a.a()) {
            String f4 = imageValue.f();
            int a4 = imageValue.a();
            this.f30789c.a(f4, new c(f4, listener), imageValue.g(), a4);
        }
    }

    public qi0(@NotNull Context context, @NotNull a configuration, @NotNull zi0 imageProvider, @NotNull vi0 imageLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f30787a = configuration;
        this.f30788b = imageProvider;
        this.f30789c = imageLoader;
    }
}
