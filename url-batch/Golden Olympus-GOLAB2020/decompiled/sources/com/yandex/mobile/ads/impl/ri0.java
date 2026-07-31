package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.ri0;
import com.yandex.mobile.ads.impl.vi0;
import com.yandex.mobile.ads.impl.wc1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q2.u;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;

/* loaded from: classes3.dex */
public final class ri0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vi0 f31215a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wc1.c f31216b;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.ImageLoadManager$loadImageFlow$1", f = "ImageLoadManager.kt", l = {78}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<q2.r, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f31226b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31227c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<ej0> f31229e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<ej0> set, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f31229e = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            b bVar = ri0.this.new b(this.f31229e, dVar);
            bVar.f31227c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((q2.r) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f31226b;
            if (i4 == 0) {
                ResultKt.a(obj);
                q2.r rVar = (q2.r) this.f31227c;
                ri0.this.a(this.f31229e, new a(rVar));
                this.f31226b = 1;
                if (q2.p.b(rVar, null, this, 1, null) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }

        public static final class a implements nj0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q2.r f31230a;

            a(q2.r rVar) {
                this.f31230a = rVar;
            }

            @Override // com.yandex.mobile.ads.impl.nj0
            public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                this.f31230a.r(new pi0(url, bitmap));
            }

            @Override // com.yandex.mobile.ads.impl.nj0
            public final void a(@NotNull Map<String, Bitmap> images) {
                Intrinsics.checkNotNullParameter(images, "images");
                u.a.a(this.f31230a.m(), null, 1, null);
            }
        }
    }

    public static final class c implements nj0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f31231a;

        c(C3345o c3345o) {
            this.f31231a = c3345o;
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.nj0
        public final void a(@NotNull Map<String, Bitmap> images) {
            Intrinsics.checkNotNullParameter(images, "images");
            InterfaceC3343n interfaceC3343n = this.f31231a;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(new oj0.a(images)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ri0(Context context) {
        this(context, r0, r0.b(), r0.c());
        wc1 a4 = wc1.f34002c.a(context);
    }

    @NotNull
    public final InterfaceC3396f a(@NotNull Set<ej0> imageValuesToLoad) {
        Intrinsics.checkNotNullParameter(imageValuesToLoad, "imageValuesToLoad");
        return AbstractC3398h.d(new b(imageValuesToLoad, null));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final vi0 f31217a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<ej0> f31218b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final nj0 f31219c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Handler f31220d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final AtomicInteger f31221e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final vz0 f31222f;

        public a(@NotNull vi0 imageLoader, @NotNull Set<ej0> imageValues, @NotNull nj0 imagesFetchListener, @NotNull Handler handler, @NotNull AtomicInteger imageCounter, @NotNull vz0 memoryUtils) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(imageValues, "imageValues");
            Intrinsics.checkNotNullParameter(imagesFetchListener, "imagesFetchListener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(imageCounter, "imageCounter");
            Intrinsics.checkNotNullParameter(memoryUtils, "memoryUtils");
            this.f31217a = imageLoader;
            this.f31218b = imageValues;
            this.f31219c = imagesFetchListener;
            this.f31220d = handler;
            this.f31221e = imageCounter;
            this.f31222f = memoryUtils;
        }

        public static final void a(a aVar, Map map) {
            if (aVar.f31221e.decrementAndGet() == 0) {
                aVar.f31219c.a(map);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.ri0$a$a, reason: collision with other inner class name */
        public static final class C0201a implements vi0.d {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Map<String, Bitmap> f31224b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ej0 f31225c;

            C0201a(Map<String, Bitmap> map, ej0 ej0Var) {
                this.f31224b = map;
                this.f31225c = ej0Var;
            }

            @Override // com.yandex.mobile.ads.impl.qq1.a
            public final void a(@NotNull hi2 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                ap0.a(error);
                a.a(a.this, this.f31224b);
            }

            @Override // com.yandex.mobile.ads.impl.vi0.d
            public final void a(@NotNull vi0.c response, boolean z4) {
                Intrinsics.checkNotNullParameter(response, "response");
                String f4 = this.f31225c.f();
                Bitmap b4 = response.b();
                if (b4 != null) {
                    if (f4 != null) {
                        this.f31224b.put(f4, b4);
                        a.this.f31219c.a(f4, b4);
                    }
                    a.a(a.this, this.f31224b);
                }
            }
        }

        private final boolean a(ej0 ej0Var) {
            int a4 = ej0Var.a();
            int g4 = ej0Var.g();
            this.f31222f.getClass();
            if (vz0.a() >= (a4 * g4 * 4) + 1048576.0f) {
                return true;
            }
            ap0.d(new Object[0]);
            return false;
        }

        public final void a() {
            final HashMap hashMap = new HashMap();
            for (final ej0 ej0Var : this.f31218b) {
                final String f4 = ej0Var.f();
                final int a4 = ej0Var.a();
                final int g4 = ej0Var.g();
                ap0.e(f4);
                if (a(ej0Var)) {
                    this.f31220d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Pc
                        @Override // java.lang.Runnable
                        public final void run() {
                            ri0.a.a(ri0.a.this, f4, g4, a4, hashMap, ej0Var);
                        }
                    });
                } else if (this.f31221e.decrementAndGet() == 0) {
                    this.f31219c.a(hashMap);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, String fetchUrl, int i4, int i5, Map loadedImages, ej0 imageValue) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fetchUrl, "$fetchUrl");
            Intrinsics.checkNotNullParameter(loadedImages, "$loadedImages");
            Intrinsics.checkNotNullParameter(imageValue, "$imageValue");
            this$0.f31217a.a(fetchUrl, this$0.new C0201a(loadedImages, imageValue), i4, i5);
        }
    }

    public final void a(@NotNull Set<ej0> imageValuesToLoad, @NotNull nj0 imagesFetchListener) {
        Intrinsics.checkNotNullParameter(imageValuesToLoad, "imageValuesToLoad");
        Intrinsics.checkNotNullParameter(imagesFetchListener, "imagesFetchListener");
        if (imageValuesToLoad.isEmpty()) {
            imagesFetchListener.a(MapsKt.emptyMap());
        } else {
            new a(this.f31215a, imageValuesToLoad, imagesFetchListener, new Handler(Looper.getMainLooper()), new AtomicInteger(imageValuesToLoad.size()), new vz0()).a();
        }
    }

    public ri0(@NotNull Context context, @NotNull wc1 networkingImage, @NotNull vi0 imageLoader, @NotNull wc1.c urlBitmapCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkingImage, "networkingImage");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(urlBitmapCache, "urlBitmapCache");
        this.f31215a = imageLoader;
        this.f31216b = urlBitmapCache;
    }

    public final void a(@NotNull LinkedHashMap images) {
        Intrinsics.checkNotNullParameter(images, "images");
        for (Map.Entry entry : images.entrySet()) {
            this.f31216b.a((String) entry.getKey(), (Bitmap) entry.getValue());
        }
    }

    @Nullable
    public final Object a(@NotNull Set<ej0> set, @NotNull kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        a(set, new c(c3345o));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
