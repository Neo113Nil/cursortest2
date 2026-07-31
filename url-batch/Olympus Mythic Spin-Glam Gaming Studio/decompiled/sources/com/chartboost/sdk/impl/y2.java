package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.O6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class y2 {
    public final Context a;
    public final l1 b;
    public final k9 c;
    public final i2 d;
    public final CoroutineDispatcher e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public volatile Job i;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference mo4828invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return y2.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            y2.this.b();
            y2.this.i = null;
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
        public final AtomicReference mo4828invoke() {
            return new AtomicReference(null);
        }
    }

    public static final class e extends Lambda implements Function0 {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicInteger mo4828invoke() {
            return new AtomicInteger();
        }
    }

    public y2(Context context, l1 android2, k9 ifa, i2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(ifa, "ifa");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = context;
        this.b = android2;
        this.c = ifa;
        this.d = base64Wrapper;
        this.e = ioDispatcher;
        this.f = LazyKt.lazy(d.b);
        this.g = LazyKt.lazy(e.b);
        this.h = LazyKt.lazy(a.b);
        f();
    }

    public final boolean a() {
        return true;
    }

    public final AtomicReference d() {
        return (AtomicReference) this.f.getValue();
    }

    public final AtomicInteger e() {
        return (AtomicInteger) this.g.getValue();
    }

    public final AtomicReference c() {
        return (AtomicReference) this.h.getValue();
    }

    public final s9 h() {
        if (this.i == null) {
            f();
            Unit unit = Unit.INSTANCE;
        }
        s9 s9Var = (s9) c().get();
        return s9Var == null ? a(this.a) : s9Var;
    }

    public final void f() {
        Job launch$default;
        try {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.e), null, null, new b(null), 3, null);
            this.i = launch$default;
        } catch (Throwable th) {
            xb.b("Error launching identity job", th);
        }
    }

    public final void b() {
        g();
        c().set(a(this.a));
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppSetIdInfo) obj);
            return Unit.INSTANCE;
        }

        public final void a(AppSetIdInfo appSetIdInfo) {
            y2.this.a(appSetIdInfo);
        }
    }

    public final void g() {
        try {
            if (a()) {
                Task a2 = this.b.a(this.a);
                if (a2 != null) {
                    final c cVar = new c();
                    a2.addOnSuccessListener(new OnSuccessListener() { // from class: com.chartboost.sdk.impl.y2$$ExternalSyntheticLambda0
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            y2.a(Function1.this, obj);
                        }
                    });
                }
            } else {
                xb.b("AppSetId dependency not present", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            xb.b("Error requesting AppSetId", e2);
        }
    }

    public /* synthetic */ y2(Context context, l1 l1Var, k9 k9Var, i2 i2Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, l1Var, k9Var, i2Var, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            b3.a(jSONObject, O6.X0, str);
        } else if (str2 != null) {
            b3.a(jSONObject, CommonUrlParts.UUID, str2);
        }
        String str4 = (String) d().get();
        if (str4 != null) {
            b3.a(jSONObject, "appsetid", str4);
        }
        if (str3 != null) {
            b3.a(jSONObject, "instance_id", str3);
        }
        i2 i2Var = this.d;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return i2Var.c(jSONObject2);
    }

    public final s9 a(Context context) {
        String str;
        try {
            h1 a2 = this.c.a();
            xb.b("IFA: " + a2, (Throwable) null, 2, (Object) null);
            String a3 = a2.a();
            xi b2 = a2.b();
            String a4 = this.c.a(context, b2 == xi.e);
            if (a3 != null) {
                a4 = "000000000";
            }
            String str2 = a4;
            str = Chartboost.instanceId;
            if (pg.a.d()) {
                pg.b(a3);
                pg.c(str2);
            }
            return new s9(b2, a(a3, str2, str), str2, a3, (String) d().get(), Integer.valueOf(e().get()), str);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message != null) {
                xb.b(message, (Throwable) null, 2, (Object) null);
            }
            return new s9(null, null, null, null, null, null, null, 127, null);
        }
    }

    public final void a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            d().set(appSetIdInfo.getId());
            e().set(appSetIdInfo.getScope());
        }
    }

    public static final void a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
