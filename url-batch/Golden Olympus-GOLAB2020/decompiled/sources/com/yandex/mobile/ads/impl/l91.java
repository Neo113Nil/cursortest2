package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ur0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f28482a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f28483b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f28484c;

    private static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f28485b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final wq1 f28486c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final n91 f28487d;

        public a(@NotNull Context context, @NotNull mp1 reporter, @NotNull C2360y7<String> adResponse, @NotNull wq1 responseConverterListener, @NotNull n91 nativeResponseParser) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(reporter, "reporter");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(responseConverterListener, "responseConverterListener");
            Intrinsics.checkNotNullParameter(nativeResponseParser, "nativeResponseParser");
            this.f28485b = adResponse;
            this.f28486c = responseConverterListener;
            this.f28487d = nativeResponseParser;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n61 a4 = this.f28487d.a(this.f28485b);
            if (a4 != null) {
                this.f28486c.a(a4);
            } else {
                this.f28486c.a(C1942g7.k());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l91(Context context, mp1 mp1Var) {
        this(context, mp1Var, ur0.a.a().c());
        int i4 = ur0.f33232f;
    }

    public final void a(@NotNull C2360y7<String> adResponse, @NotNull wq1 responseConverterListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(responseConverterListener, "responseConverterListener");
        Context appContext = this.f28484c;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        mp1 mp1Var = this.f28482a;
        this.f28483b.execute(new a(appContext, mp1Var, adResponse, responseConverterListener, new n91(appContext, mp1Var)));
    }

    public l91(@NotNull Context context, @NotNull mp1 reporter, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f28482a = reporter;
        this.f28483b = executor;
        this.f28484c = context.getApplicationContext();
    }
}
