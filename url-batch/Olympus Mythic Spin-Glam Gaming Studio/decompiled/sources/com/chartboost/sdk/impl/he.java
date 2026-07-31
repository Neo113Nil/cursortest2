package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.R;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class he {
    public final Context a;
    public final dh b;
    public final jg c;
    public final AtomicReference d;
    public final CoroutineDispatcher e;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return he.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Omid.activate(he.this.a);
                xb.a("OMSDK is initialized successfully!", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                xb.b("OMSDK initialization exception", e);
            }
            return Unit.INSTANCE;
        }
    }

    public he(Context context, dh sharedPrefsHelper, jg resourcesLoader, AtomicReference sdkConfig, CoroutineDispatcher mainDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.a = context;
        this.b = sharedPrefsHelper;
        this.c = resourcesLoader;
        this.d = sdkConfig;
        this.e = mainDispatcher;
    }

    public final boolean f() {
        try {
            return Omid.isActive();
        } catch (Exception e) {
            xb.a("OMSDK error when checking isActive", e);
            return false;
        }
    }

    public final String i() {
        return "Chartboost";
    }

    public final void e() {
        if (!g()) {
            xb.a("OMSDK initialize is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        if (!f()) {
            try {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.e), null, null, new a(null), 3, null);
                return;
            } catch (Exception e) {
                xb.b("Error launching om activate job", e);
                return;
            }
        }
        xb.a("OMSDK initialize is already active!", (Throwable) null, 2, (Object) null);
    }

    public /* synthetic */ he(Context context, dh dhVar, jg jgVar, AtomicReference atomicReference, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dhVar, jgVar, atomicReference, (i & 16) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    public final boolean g() {
        ce d;
        sg sgVar = (sg) this.d.get();
        if (sgVar == null || (d = sgVar.d()) == null) {
            return false;
        }
        return d.g();
    }

    public final boolean h() {
        ce d;
        sg sgVar = (sg) this.d.get();
        if (sgVar == null || (d = sgVar.d()) == null) {
            return false;
        }
        return d.d();
    }

    public final List d() {
        ce d;
        List e;
        sg sgVar = (sg) this.d.get();
        return (sgVar == null || (d = sgVar.d()) == null || (e = d.e()) == null) ? CollectionsKt.emptyList() : e;
    }

    public final ce b() {
        sg sgVar = (sg) this.d.get();
        ce d = sgVar != null ? sgVar.d() : null;
        return d == null ? new ce(false, false, 0, 0, 0L, 0, null, 127, null) : d;
    }

    public final Partner c() {
        try {
            return Partner.createPartner(i(), "9.12.1");
        } catch (Exception e) {
            xb.b("Omid Partner exception", e);
            return null;
        }
    }

    public final String a() {
        return a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
    }

    public final String a(int i, String str) {
        try {
            String a2 = this.b.a(str);
            return a2 == null ? a(str, i) : a2;
        } catch (Exception e) {
            xb.b("OmidJS exception", e);
            return null;
        }
    }

    public final String a(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        if (!g()) {
            xb.b("OMSDK injectOmidJsIntoHtml is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return html;
        }
        if (!Omid.isActive()) {
            return html;
        }
        try {
            String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(a(), html);
            Intrinsics.checkNotNull(injectScriptContentIntoHtml);
            return injectScriptContentIntoHtml;
        } catch (Exception e) {
            xb.b("OmidJS injection exception", e);
            return html;
        }
    }

    public final String a(String str, int i) {
        try {
            String a2 = this.c.a(i);
            if (a2 == null) {
                return null;
            }
            this.b.a(str, a2);
            return a2;
        } catch (Exception e) {
            xb.b("OmidJS resource file exception", e);
            return null;
        }
    }
}
