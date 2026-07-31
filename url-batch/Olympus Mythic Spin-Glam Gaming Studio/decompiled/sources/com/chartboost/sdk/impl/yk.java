package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.al;
import com.chartboost.sdk.impl.xk;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class yk implements xk, al.a {
    public final lk a;
    public final b8 b;
    public final Function1 c;
    public final CoroutineDispatcher d;
    public final Lazy e;
    public final Lazy f;
    public g8 g;
    public Job h;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h8 invoke(Context c) {
            Intrinsics.checkNotNullParameter(c, "c");
            return new h8(c, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap mo4828invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return yk.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long i2 = yk.this.a.i();
                this.b = 1;
                if (DelayKt.delay(i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            yk.this.h = null;
            try {
                xk.a.a(yk.this, null, 0, false, 7, null);
            } catch (IllegalStateException e) {
                xb.b("Cannot start download", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap mo4828invoke() {
            return new ConcurrentHashMap();
        }
    }

    public yk(lk policy, b8 downloadManager, Function1 fileCachingFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.a = policy;
        this.b = downloadManager;
        this.c = fileCachingFactory;
        this.d = dispatcher;
        this.e = LazyKt.lazy(b.b);
        this.f = LazyKt.lazy(d.b);
    }

    public final ConcurrentHashMap b() {
        return (ConcurrentHashMap) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.xk
    public hk b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (hk) a().get(filename);
    }

    @Override // com.chartboost.sdk.impl.xk
    public void a(String url, String filename, boolean z, t0 t0Var) {
        hk a2;
        hk b2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        xb.a("downloadVideoFile() - url: " + url + ", filename: " + filename + ", showImmediately: " + z + ", callback: " + t0Var, (Throwable) null, 2, (Object) null);
        if (t0Var != null) {
            b().put(url, t0Var);
        }
        File c2 = c(filename);
        if (c2 == null || (a2 = a(c2, url)) == null || (b2 = b(a2)) == null || c(b2) == null) {
            xb.a("downloadVideoFile() - cache file is null", (Throwable) null, 2, (Object) null);
        }
        xk.a.a(this, filename, 0, z, 2, null);
    }

    public /* synthetic */ yk(lk lkVar, b8 b8Var, Function1 function1, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lkVar, b8Var, (i & 4) != 0 ? a.b : function1, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final File c(String str) {
        g8 g8Var = this.g;
        if (g8Var != null) {
            return g8Var.a(str);
        }
        return null;
    }

    public final void d() {
        Job launch$default;
        if (this.h == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.d), null, null, new c(null), 3, null);
            this.h = launch$default;
        }
    }

    public final ConcurrentHashMap a() {
        return (ConcurrentHashMap) this.e.getValue();
    }

    public final void e(hk hkVar) {
        x6 x6Var;
        if (this.a.g()) {
            d();
            x6Var = x6.f;
        } else {
            x6Var = x6.d;
        }
        a(hkVar, x6Var);
    }

    public final void d(hk hkVar) {
        xb.a("startForcedDownload() - " + hkVar, (Throwable) null, 2, (Object) null);
        this.a.a();
        this.b.a(hkVar);
    }

    public final void c() {
        x6 x6Var;
        if (this.a.g()) {
            d();
            x6Var = x6.f;
        } else {
            x6Var = x6.d;
        }
        if (x6Var == x6.d) {
            this.a.a();
        }
        this.b.a(x6Var);
    }

    public final hk b(hk hkVar) {
        a().put(hkVar.d(), hkVar);
        return hkVar;
    }

    @Override // com.chartboost.sdk.impl.xk
    public int a(hk hkVar) {
        if (hkVar != null) {
            return fg.a(this.b.d(hkVar.d()));
        }
        return 0;
    }

    @Override // com.chartboost.sdk.impl.xk
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        xb.a("initialize()", (Throwable) null, 2, (Object) null);
        this.g = (g8) this.c.invoke(context);
        b8 b8Var = this.b;
        b8Var.a();
        b8Var.a(this);
        b8Var.b();
    }

    public final hk c(hk hkVar) {
        xb.a("queueDownload() - asset: " + hkVar, (Throwable) null, 2, (Object) null);
        a(hkVar, x6.e);
        return hkVar;
    }

    @Override // com.chartboost.sdk.impl.xk
    public boolean a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        return this.b.a(videoFilename);
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String uri, String videoFileName, CBError cBError) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("onError() - uri " + uri + ", videoFileName " + videoFileName + ", error " + cBError, (Throwable) null, 2, (Object) null);
        b().remove(uri);
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("onSuccess() - uri " + uri + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        b().remove(uri);
        xk.a.a(this, null, 0, false, 7, null);
    }

    public final void a(hk hkVar, x6 x6Var) {
        xb.a("sendDownloadToDownloadManager() - " + hkVar, (Throwable) null, 2, (Object) null);
        if (x6Var == x6.d) {
            this.a.a();
        }
        this.b.a(hkVar, x6Var);
    }

    @Override // com.chartboost.sdk.impl.xk
    public void a(String str, int i, boolean z) {
        Unit unit;
        hk hkVar;
        xb.a("startDownloadIfPossible() - filename " + str + ", forceDownload " + z, (Throwable) null, 2, (Object) null);
        if (str == null || (hkVar = (hk) a().get(str)) == null) {
            unit = null;
        } else {
            xb.a("startDownloadIfPossible() - asset: " + hkVar, (Throwable) null, 2, (Object) null);
            if (z) {
                d(hkVar);
            } else {
                e(hkVar);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            xb.a("startDownloadIfPossible() - null asset, resume next download in Download Manager index", (Throwable) null, 2, (Object) null);
            c();
        }
    }

    @Override // com.chartboost.sdk.impl.al.a
    public void a(String url, String videoFileName, long j, t0 t0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        xb.a("tempFileIsReady() - url " + url + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        if (t0Var == null) {
            t0Var = (t0) b().get(url);
        }
        if (t0Var != null) {
            t0Var.a(url);
        }
    }

    public final hk a(File file, String str) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        hk hkVar = new hk(str, name, file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(hkVar.a());
        return hkVar;
    }
}
