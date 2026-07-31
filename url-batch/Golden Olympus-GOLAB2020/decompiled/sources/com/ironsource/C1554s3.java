package com.ironsource;

import a2.AbstractC1241b;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.InterfaceC1574u3;
import com.ironsource.b9;
import com.ironsource.fh;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3335j;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1554s3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f18940a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f18941b;

    @Metadata
    /* renamed from: com.ironsource.s3$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f18942a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final fh.e f18943b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f18944c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final JSONObject f18945d;

        public a(@NotNull String name, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f18942a = name;
            this.f18943b = productType;
            this.f18944c = demandSourceName;
            this.f18945d = params;
        }

        public static /* synthetic */ a a(a aVar, String str, fh.e eVar, String str2, JSONObject jSONObject, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aVar.f18942a;
            }
            if ((i4 & 2) != 0) {
                eVar = aVar.f18943b;
            }
            if ((i4 & 4) != 0) {
                str2 = aVar.f18944c;
            }
            if ((i4 & 8) != 0) {
                jSONObject = aVar.f18945d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        @NotNull
        public final fh.e b() {
            return this.f18943b;
        }

        @NotNull
        public final String c() {
            return this.f18944c;
        }

        @NotNull
        public final JSONObject d() {
            return this.f18945d;
        }

        @NotNull
        public final String e() {
            return this.f18944c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f18942a, aVar.f18942a) && this.f18943b == aVar.f18943b && Intrinsics.areEqual(this.f18944c, aVar.f18944c) && Intrinsics.areEqual(this.f18945d.toString(), aVar.f18945d.toString());
        }

        @NotNull
        public final String f() {
            return this.f18942a;
        }

        @NotNull
        public final JSONObject g() {
            return this.f18945d;
        }

        @NotNull
        public final fh.e h() {
            return this.f18943b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final JSONObject i() {
            JSONObject put = new JSONObject(this.f18945d.toString()).put(b9.h.f15490m, this.f18943b).put("demandSourceName", this.f18944c);
            Intrinsics.checkNotNullExpressionValue(put, "JSONObject(params.toStri…eName\", demandSourceName)");
            return put;
        }

        @NotNull
        public String toString() {
            return "CallbackResult(name=" + this.f18942a + ", productType=" + this.f18943b + ", demandSourceName=" + this.f18944c + ", params=" + this.f18945d + ')';
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull fh.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        @NotNull
        public final String a() {
            return this.f18942a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.s3$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    @Metadata
    /* renamed from: com.ironsource.s3$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18946a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f18948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f18949d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MotionEvent f18950e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f18948c = measurementManager;
            this.f18949d = uri;
            this.f18950e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable kotlin.coroutines.d dVar) {
            return ((c) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C1554s3.this.new c(this.f18948c, this.f18949d, this.f18950e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f18946a;
            if (i4 == 0) {
                ResultKt.a(obj);
                C1554s3 c1554s3 = C1554s3.this;
                MeasurementManager measurementManager = this.f18948c;
                Uri uri = this.f18949d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.f18950e;
                this.f18946a = 1;
                if (c1554s3.a(measurementManager, uri, motionEvent, this) == f4) {
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
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    @Metadata
    /* renamed from: com.ironsource.s3$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18951a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f18953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f18954d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MeasurementManager measurementManager, Uri uri, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f18953c = measurementManager;
            this.f18954d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable kotlin.coroutines.d dVar) {
            return ((d) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C1554s3.this.new d(this.f18953c, this.f18954d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f18951a;
            if (i4 == 0) {
                ResultKt.a(obj);
                C1554s3 c1554s3 = C1554s3.this;
                MeasurementManager measurementManager = this.f18953c;
                Uri uri = this.f18954d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.f18951a = 1;
                if (c1554s3.a(measurementManager, uri, null, this) == f4) {
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
    }

    static {
        String name = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        f18941b = name;
    }

    private final a a(Context context, InterfaceC1574u3.a aVar) {
        MeasurementManager a4 = C1495k1.a(context);
        if (a4 == null) {
            Logger.i(f18941b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC1574u3.a.b) {
                return a(aVar, a4);
            }
            if (aVar instanceof InterfaceC1574u3.a.C0165a) {
                return a((InterfaceC1574u3.a.C0165a) aVar, a4);
            }
            throw new W1.m();
        } catch (Exception e4) {
            o9.d().a(e4);
            return a(aVar, "failed to handle attribution, message: " + e4.getMessage());
        }
    }

    @NotNull
    public final a a(@NotNull Context context, @NotNull InterfaceC1574u3 message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC1574u3.a) {
            return a(context, (InterfaceC1574u3.a) message);
        }
        throw new W1.m();
    }

    private final a a(InterfaceC1574u3.a.C0165a c0165a, MeasurementManager measurementManager) {
        Uri parse = Uri.parse(c0165a.getUrl());
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC3335j.b(null, new c(measurementManager, parse, MotionEvent.obtain(uptimeMillis, uptimeMillis, c0165a.m(), c0165a.n().c(), c0165a.n().d(), c0165a.o()), null), 1, null);
        return a(c0165a);
    }

    private final a a(InterfaceC1574u3.a aVar) {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC1574u3.a.C0165a ? c9.f15700d : c9.f15701e));
        String c4 = aVar.c();
        fh.e b4 = aVar.b();
        String d4 = aVar.d();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new a(c4, b4, d4, params);
    }

    private final a a(InterfaceC1574u3.a aVar, MeasurementManager measurementManager) {
        AbstractC3335j.b(null, new d(measurementManager, Uri.parse(aVar.getUrl()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC1574u3 interfaceC1574u3, String str) {
        JSONObject put = new JSONObject().put("reason", str).put("type", interfaceC1574u3 instanceof InterfaceC1574u3.a.C0165a ? c9.f15700d : c9.f15701e);
        String a4 = interfaceC1574u3.a();
        fh.e b4 = interfaceC1574u3.b();
        String d4 = interfaceC1574u3.d();
        JSONObject put2 = new JSONObject().put("params", put);
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject().put(\"params\", payload)");
        return new a(a4, b4, d4, put2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, kotlin.coroutines.d dVar) {
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC1241b.c(dVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C1567t3.a(hVar));
        Object a4 = hVar.a();
        if (a4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }
}
