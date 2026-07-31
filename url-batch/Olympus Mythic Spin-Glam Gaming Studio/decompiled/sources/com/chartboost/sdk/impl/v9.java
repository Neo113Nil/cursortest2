package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.widget.ImageView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.bk;
import com.chartboost.sdk.impl.i4;
import com.chartboost.sdk.impl.sd;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes3.dex */
public final class v9 extends m2 {
    public static final a z = new a(null);
    public final Context n;
    public final URL o;
    public final y4 p;
    public final sd q;
    public final he r;
    public final y2 s;
    public final List t;
    public Function0 u;
    public final AtomicBoolean v;
    public final Mutex w;
    public ImageView x;
    public Bitmap y;

    public static final class b extends Lambda implements Function0 {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = v9.this.a((Context) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ Context g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Continuation continuation) {
            super(2, continuation);
            this.g = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return v9.this.new d(this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00fe A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x001d, B:8:0x00f8, B:10:0x00fe, B:12:0x0104, B:14:0x0114, B:15:0x0117, B:16:0x0182, B:21:0x011d, B:23:0x0123, B:25:0x0141, B:27:0x0151, B:28:0x0154, B:30:0x016c, B:32:0x0172, B:33:0x017f), top: B:6:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x011d A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x001d, B:8:0x00f8, B:10:0x00fe, B:12:0x0104, B:14:0x0114, B:15:0x0117, B:16:0x0182, B:21:0x011d, B:23:0x0123, B:25:0x0141, B:27:0x0151, B:28:0x0154, B:30:0x016c, B:32:0x0172, B:33:0x017f), top: B:6:0x001d }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            v9 v9Var;
            Context context;
            Mutex mutex2;
            Throwable th;
            Context context2;
            v9 v9Var2;
            Object obj2;
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    xb.a("Image load initiated: url=" + v9.this.o + ", auctionId=" + v9.this.q().c() + ", hasCompanionData=" + (v9.this.p != null), (Throwable) null, 2, (Object) null);
                    mutex = v9.this.w;
                    v9 v9Var3 = v9.this;
                    Context context3 = this.g;
                    this.b = mutex;
                    this.c = v9Var3;
                    this.d = context3;
                    this.e = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    v9Var = v9Var3;
                    context = context3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context2 = (Context) this.d;
                        v9Var2 = (v9) this.c;
                        mutex2 = (Mutex) this.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            obj2 = ((Result) obj).getValue();
                            if (Result.m8028isFailureimpl(obj2)) {
                                Bitmap A = v9Var2.A();
                                if (A == null) {
                                    xb.b("Bitmap was null after successful load for URL: " + v9Var2.o, (Throwable) null, 2, (Object) null);
                                    if (v9Var2.p != null && ((Boolean) v9Var2.B().mo4828invoke()).booleanValue()) {
                                        v9Var2.z();
                                    }
                                    v9Var2.a(nh.f);
                                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Bitmap was null after successful load", null, 2, null)));
                                    mutex = mutex2;
                                    mutex2 = mutex;
                                    obj2 = m8023constructorimpl;
                                } else {
                                    ImageView C = v9Var2.C();
                                    if (C == null) {
                                        Context applicationContext = context2.getApplicationContext();
                                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                        C = v9Var2.a(A, applicationContext);
                                    }
                                    v9Var2.a(C);
                                }
                            } else {
                                if (v9Var2.p != null && ((Boolean) v9Var2.B().mo4828invoke()).booleanValue()) {
                                    v9Var2.z();
                                }
                                v9Var2.a(nh.f);
                            }
                            Result m8022boximpl = Result.m8022boximpl(obj2);
                            mutex2.unlock(null);
                            return m8022boximpl;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    context = (Context) this.d;
                    v9Var = (v9) this.c;
                    Mutex mutex3 = (Mutex) this.b;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                if (v9Var.C() != null && v9Var.A() != null) {
                    xb.a("Image already loaded, skipping: url=" + v9Var.o + ", auctionId=" + v9Var.q().c(), (Throwable) null, 2, (Object) null);
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                    mutex2 = mutex;
                    obj2 = m8023constructorimpl;
                    Result m8022boximpl2 = Result.m8022boximpl(obj2);
                    mutex2.unlock(null);
                    return m8022boximpl2;
                }
                URL url = v9Var.o;
                this.b = mutex;
                this.c = v9Var;
                this.d = context;
                this.e = 2;
                Object a = v9Var.a(url, this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = context;
                v9Var2 = v9Var;
                mutex2 = mutex;
                obj2 = a;
                if (Result.m8028isFailureimpl(obj2)) {
                }
                Result m8022boximpl22 = Result.m8022boximpl(obj2);
                mutex2.unlock(null);
                return m8022boximpl22;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = v9.this.a((URL) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public Object b;
        public Object c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ URL g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(URL url, Continuation continuation) {
            super(2, continuation);
            this.g = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = v9.this.new f(this.g, continuation);
            fVar.e = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8023constructorimpl;
            v9 v9Var;
            URL url;
            wd wdVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.e;
                    v9Var = v9.this;
                    URL url2 = this.g;
                    Result.Companion companion = Result.INSTANCE;
                    sd sdVar = v9Var.q;
                    String url3 = url2.toString();
                    Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                    this.e = v9Var;
                    this.b = url2;
                    this.c = coroutineScope;
                    this.d = 1;
                    obj = sd.a.a(sdVar, url3, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    url = url2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (URL) this.b;
                    v9Var = (v9) this.e;
                    ResultKt.throwOnFailure(obj);
                }
                wdVar = (wd) obj;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (!wdVar.f()) {
                String c = v9Var.q().c();
                int e = wdVar.e();
                Throwable d = wdVar.d();
                xb.b("ImageRenderable download failed: url=" + url + ", auctionId=" + c + ", statusCode=" + e + ", errorMessage=" + (d != null ? d.getMessage() : null), (Throwable) null, 2, (Object) null);
                Throwable d2 = wdVar.d();
                if (d2 != null) {
                    throw d2;
                }
                throw new IOException("Failed to download image: " + wdVar.e());
            }
            byte[] b = wdVar.b();
            if (b == null) {
                xb.b("ImageRenderable response body null: url=" + url + ", auctionId=" + v9Var.q().c() + ", statusCode=" + wdVar.e(), (Throwable) null, 2, (Object) null);
                throw new IOException("Response body was null for URL: " + url);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
                if (decodeStream == null) {
                    xb.b("ImageRenderable bitmap decode failed: url=" + url + ", auctionId=" + v9Var.q().c() + ", bytesReceived=" + b.length, (Throwable) null, 2, (Object) null);
                    throw new IOException("Failed to decode image from URL: " + url);
                }
                v9Var.a(decodeStream);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(byteArrayInputStream, null);
                int length = b.length;
                Bitmap A = v9Var.A();
                Integer boxInt = A != null ? Boxing.boxInt(A.getWidth()) : null;
                Bitmap A2 = v9Var.A();
                xb.a("ImageRenderable loaded successfully: url=" + url + ", bytesDownloaded=" + length + ", bitmapSize=" + boxInt + VastAttributes.HORIZONTAL_POSITION + (A2 != null ? Boxing.boxInt(A2.getHeight()) : null), (Throwable) null, 2, (Object) null);
                m8023constructorimpl = Result.m8023constructorimpl(unit);
                URL url4 = this.g;
                v9 v9Var2 = v9.this;
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl == null) {
                    return Result.m8022boximpl(Result.m8023constructorimpl(Unit.INSTANCE));
                }
                xb.b("ImageRenderable load failed: url=" + url4 + ", auctionId=" + v9Var2.q().c() + ", errorType=" + m8026exceptionOrNullimpl.getClass().getSimpleName(), m8026exceptionOrNullimpl);
                return Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(v9Var2.a(m8026exceptionOrNullimpl, url4))));
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(Context context, URL imageUrl, y4 y4Var, wf renderableConfig, a0 adMarkupConfig, sd networkClient, di trackerComponent, rh telemetryManager, u adFormat, Mediation mediation, he openMeasurementManager, y2 cbIdentity, List vastErrorTrackingEvents) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        Intrinsics.checkNotNullParameter(vastErrorTrackingEvents, "vastErrorTrackingEvents");
        this.n = context;
        this.o = imageUrl;
        this.p = y4Var;
        this.q = networkClient;
        this.r = openMeasurementManager;
        this.s = cbIdentity;
        this.t = vastErrorTrackingEvents;
        this.u = b.b;
        this.v = new AtomicBoolean(false);
        this.w = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.chartboost.sdk.impl.vf
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImageView k() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return this.x;
        }
        throw new IllegalStateException("nextAd() must be called from the main thread for ImageRenderable.");
    }

    public final Function0 B() {
        return this.u;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ImageView C() {
        return this.x;
    }

    public final Bitmap A() {
        return this.y;
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(ac macroContext) {
            Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
            macroContext.a(v9.this.p());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ac) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    d dVar = new d(context, null);
                    cVar.d = 1;
                    obj = BuildersKt.withContext(main, dVar, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        if (this.v.compareAndSet(false, true)) {
            for (qi qiVar : this.t) {
                oj.a.a(bk.f.b, new ck(null, qi.a(qiVar, null, null, 0, null, MapsKt.plus(qiVar.b(), TuplesKt.to("VAST_ERROR_CODE", 603)), null, 47, null), this.n, this.r, this.s, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        }
    }

    @Override // com.chartboost.sdk.impl.m2
    public void y() {
        List<qi> i;
        y4 y4Var = this.p;
        if (y4Var != null && (i = y4Var.i()) != null) {
            for (qi qiVar : i) {
                if (Intrinsics.areEqual(qiVar.a(), "creativeView")) {
                    oj.a.a(bk.e.b, new ck(null, qiVar, this.n, this.r, this.s, null, null, null, null, null, null, null, null, null, 16353, null));
                }
            }
        }
        super.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, Continuation continuation) {
        e eVar;
        int i;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
                Object obj = eVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    f fVar = new f(url, null);
                    eVar.d = 1;
                    obj = BuildersKt.withContext(io2, fVar, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final void a(Bitmap bitmap) {
        this.y = bitmap;
    }

    public final void a(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.u = function0;
    }

    public final void a(ImageView imageView) {
        this.x = imageView;
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(nh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.x = null;
        Bitmap bitmap = this.y;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.y = null;
        xb.a("Image stopped and resources cleaned: url=" + this.o + ", auctionId=" + q().c() + ", reason=" + reason, (Throwable) null, 2, (Object) null);
    }

    public final ChartboostError a(Throwable th, URL url) {
        ChartboostError unknown;
        if (th instanceof ChartboostError) {
            return (ChartboostError) th;
        }
        if (th instanceof IOException) {
            unknown = new ChartboostError.Load.AssetUnavailable(url.toString(), "Failed to load image from URL: " + url, th);
        } else {
            unknown = new ChartboostError.Load.Unknown("Failed to load image from URL: " + url, th instanceof Exception ? (Exception) th : new Exception(th));
        }
        return unknown;
    }

    @Override // com.chartboost.sdk.impl.vf
    public void a(boolean z2, Integer num, Integer num2, i4 i4Var) {
        Unit unit;
        List emptyList;
        zf j;
        y4 y4Var = this.p;
        if (y4Var != null) {
            String b2 = y4Var.b();
            zb a2 = cc.a(this.n, this.r, this.s, new g());
            List c2 = y4Var.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
            Iterator it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(cc.a((String) it.next(), a2));
            }
            a(b2, z2);
            if (i4Var == null || (emptyList = i4Var.b()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (r().a(new i4.c(CollectionsKt.plus((Collection) emptyList, (Iterable) arrayList), b2), z2) && (j = j()) != null) {
                j.f();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.b("Got to an ImageRenderable click without a clickthrough or companion ad data.", (Throwable) null, 2, (Object) null);
        }
    }

    public final ImageView a(Bitmap bitmap, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmap);
        return imageView;
    }
}
