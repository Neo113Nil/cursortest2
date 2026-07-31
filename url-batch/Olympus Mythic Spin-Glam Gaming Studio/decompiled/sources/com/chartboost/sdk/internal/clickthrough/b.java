package com.chartboost.sdk.internal.clickthrough;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.chartboost.sdk.impl.dj;
import com.chartboost.sdk.impl.ej;
import com.chartboost.sdk.impl.gj;
import com.chartboost.sdk.impl.hb;
import com.chartboost.sdk.impl.m4;
import com.chartboost.sdk.impl.p4;
import com.chartboost.sdk.impl.xb;
import com.chartboost.sdk.internal.clickthrough.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public abstract class b {

    public static final class a extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = b.a(null, null, null, null, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    /* renamed from: com.chartboost.sdk.internal.clickthrough.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0238b extends FunctionReferenceImpl implements Function1 {
        public static final C0238b b = new C0238b();

        public C0238b() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class d extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = b.a(null, null, null, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public static final e b = new e();

        public e() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class f extends Lambda implements Function1 {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.b = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return EmbeddedBrowserActivity.INSTANCE.a(this.b, url);
        }
    }

    public static final class g extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object b = b.b(null, null, null, null, null, this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m8022boximpl(b);
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1 {
        public static final h b = new h();

        public h() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class i extends Lambda implements Function1 {
        public static final i b = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class j extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            Object c = b.c(null, null, null, null, null, this);
            return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Result.m8022boximpl(c);
        }
    }

    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1 {
        public static final k b = new k();

        public k() {
            super(1, Uri.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Uri invoke(String str) {
            return Uri.parse(str);
        }
    }

    public static final class l extends Lambda implements Function1 {
        public static final l b = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Intent("android.intent.action.VIEW", it);
        }
    }

    public static final class m extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Intent d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.c = context;
            this.d = intent;
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.c);
            p0.startActivity(p1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.c, b.b(this.d));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(1:27))(2:28|29))(2:30|31))|12|13|(1:15)|16))|34|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        j jVar;
        int i2;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.d = i3 - Integer.MIN_VALUE;
                Object obj = jVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = jVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    xb.a("Attempting to open unsecure link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                    if (!ejVar.c()) {
                        throw a.b.b;
                    }
                    if (!a(ejVar, function1)) {
                        throw a.c.b;
                    }
                    Intent intent = (Intent) function12.invoke(function1.invoke(ejVar.b()));
                    jVar.b = ejVar;
                    jVar.d = 1;
                    if (a(context, intent, coroutineDispatcher, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ejVar = (ej) jVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                dj djVar = new dj("openUnsecureLink");
                xb.a("Successfully opened unsecure link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                Object m8023constructorimpl = Result.m8023constructorimpl(djVar);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    xb.e("Failed to open unsecure link. Url: " + ejVar.b() + ", Reason: " + m8026exceptionOrNullimpl, null, 2, null);
                }
                return m8023constructorimpl;
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = jVar.d;
        if (i2 != 0) {
        }
        dj djVar2 = new dj("openUnsecureLink");
        xb.a("Successfully opened unsecure link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
        Object m8023constructorimpl2 = Result.m8023constructorimpl(djVar2);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl != null) {
        }
        return m8023constructorimpl2;
    }

    public static final boolean a(ej ejVar) {
        return ejVar.a() == m4.d;
    }

    public static final boolean b(ej ejVar) {
        return ejVar.a() == m4.e;
    }

    public static /* synthetic */ Object c(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = p4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = k.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = l.b;
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return c(ejVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(1:27))(2:28|29))(2:30|31))|12|13|(1:15)|16))|34|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        g gVar;
        int i2;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.d = i3 - Integer.MIN_VALUE;
                Object obj = gVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    xb.a("Attempting to open in native browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                    if (ejVar.c()) {
                        if (b(ejVar)) {
                            Intent intent = (Intent) function12.invoke(function1.invoke(gj.b(ejVar).b()));
                            gVar.b = ejVar;
                            gVar.d = 1;
                            if (a(context, intent, coroutineDispatcher, gVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw a.d.b;
                        }
                    } else {
                        throw a.b.b;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ejVar = (ej) gVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                dj djVar = new dj("openInNativeBrowser");
                xb.a("Successfully opened in native browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                Object m8023constructorimpl = Result.m8023constructorimpl(djVar);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    xb.e("Failed to open in native browser. Url: " + ejVar.b() + ", Reason: " + m8026exceptionOrNullimpl, null, 2, null);
                }
                return m8023constructorimpl;
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.d;
        if (i2 != 0) {
        }
        dj djVar2 = new dj("openInNativeBrowser");
        xb.a("Successfully opened in native browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
        Object m8023constructorimpl2 = Result.m8023constructorimpl(djVar2);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl != null) {
        }
        return m8023constructorimpl2;
    }

    public static /* synthetic */ Object b(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = p4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = h.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = i.b;
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return b(ejVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Intent b(Intent intent) {
        intent.setFlags(268435456);
        return intent;
    }

    public static final boolean a(ej ejVar, Function1 function1) {
        if (ejVar != null) {
            return Intrinsics.areEqual(((Uri) function1.invoke(ejVar.b())).getScheme(), "http");
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(1:27))(2:28|29))(2:30|31))|12|13|(1:15)|16))|34|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ej ejVar, Context context, hb hbVar, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        a aVar;
        int i2;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.d = i3 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = aVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    xb.a("Attempting to open deep link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                    if (ejVar.c()) {
                        if (hbVar.b(ejVar.b())) {
                            Intent intent = (Intent) function12.invoke(function1.invoke(ejVar.b()));
                            aVar.b = ejVar;
                            aVar.d = 1;
                            if (a(context, intent, coroutineDispatcher, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw a.C0237a.b;
                        }
                    } else {
                        throw a.b.b;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ejVar = (ej) aVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                dj djVar = new dj("openDeepLink");
                xb.a("Successfully opened deep link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                Object m8023constructorimpl = Result.m8023constructorimpl(djVar);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    xb.e("Failed to open deep link. Url: " + ejVar.b() + ", Reason: " + m8026exceptionOrNullimpl, null, 2, null);
                }
                return m8023constructorimpl;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = aVar.d;
        if (i2 != 0) {
        }
        dj djVar2 = new dj("openDeepLink");
        xb.a("Successfully opened deep link. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
        Object m8023constructorimpl2 = Result.m8023constructorimpl(djVar2);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl != null) {
        }
        return m8023constructorimpl2;
    }

    public static /* synthetic */ Object a(ej ejVar, Context context, hb hbVar, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = p4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            hbVar = p4.b();
        }
        hb hbVar2 = hbVar;
        if ((i2 & 8) != 0) {
            function1 = C0238b.b;
        }
        Function1 function13 = function1;
        if ((i2 & 16) != 0) {
            function12 = c.b;
        }
        Function1 function14 = function12;
        if ((i2 & 32) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return a(ejVar, context2, hbVar2, function13, function14, coroutineDispatcher, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(2:23|(2:25|(1:27))(2:28|29))(2:30|31))|12|13|(1:15)|16))|34|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        d dVar;
        int i2;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i3 = dVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.d = i3 - Integer.MIN_VALUE;
                Object obj = dVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dVar.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    xb.a("Attempting to open in embedded browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                    if (ejVar.c()) {
                        if (a(ejVar)) {
                            function1.invoke(ejVar.b());
                            Intent intent = (Intent) function12.invoke(gj.b(ejVar).b());
                            dVar.b = ejVar;
                            dVar.d = 1;
                            if (a(context, intent, coroutineDispatcher, dVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw a.d.b;
                        }
                    } else {
                        throw a.b.b;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ejVar = (ej) dVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                dj djVar = new dj("openInEmbeddedBrowser");
                xb.a("Successfully opened in embedded browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
                Object m8023constructorimpl = Result.m8023constructorimpl(djVar);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    xb.e("Failed to open in embedded browser. Url: " + ejVar.b() + ", Reason: " + m8026exceptionOrNullimpl, null, 2, null);
                }
                return m8023constructorimpl;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dVar.d;
        if (i2 != 0) {
        }
        dj djVar2 = new dj("openInEmbeddedBrowser");
        xb.a("Successfully opened in embedded browser. Url: " + ejVar.b(), (Throwable) null, 2, (Object) null);
        Object m8023constructorimpl2 = Result.m8023constructorimpl(djVar2);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl != null) {
        }
        return m8023constructorimpl2;
    }

    public static /* synthetic */ Object a(ej ejVar, Context context, Function1 function1, Function1 function12, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            context = p4.a();
        }
        Context context2 = context;
        if ((i2 & 4) != 0) {
            function1 = e.b;
        }
        Function1 function13 = function1;
        if ((i2 & 8) != 0) {
            function12 = new f(context2);
        }
        Function1 function14 = function12;
        if ((i2 & 16) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return a(ejVar, context2, function13, function14, coroutineDispatcher, continuation);
    }

    public static final Object a(Context context, Intent intent, CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        Object withContext = BuildersKt.withContext(coroutineDispatcher, new m(context, intent, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
