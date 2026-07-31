package com.yandex.authsdk.internal;

import a2.AbstractC1241b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.browser.customtabs.b;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.AbstractC1355v;
import androidx.lifecycle.C1349o;
import androidx.lifecycle.f0;
import com.yandex.authsdk.YandexAuthOptions;
import java.util.UUID;
import k1.g;
import k1.h;
import k1.m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.AbstractC3337k;
import o2.H0;
import o2.InterfaceC3316J;
import o2.Z;

@Metadata
/* loaded from: classes2.dex */
public final class ChromeTabLoginActivity extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f22301d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private h f22302c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f22303i = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            return uuid;
        }
    }

    static final class c extends l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f22304l;

        public static final class a extends s implements Function0 {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ChromeTabLoginActivity f22306i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChromeTabLoginActivity chromeTabLoginActivity) {
                super(0);
                this.f22306i = chromeTabLoginActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f22306i.setResult(0);
                this.f22306i.finish();
                return Unit.f41027a;
            }
        }

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return ChromeTabLoginActivity.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f22304l;
            if (i4 == 0) {
                ResultKt.a(obj);
                AbstractC1346l lifecycle = ChromeTabLoginActivity.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
                ChromeTabLoginActivity chromeTabLoginActivity = ChromeTabLoginActivity.this;
                AbstractC1346l.b bVar = AbstractC1346l.b.RESUMED;
                H0 p4 = Z.c().p();
                boolean i5 = p4.i(getContext());
                if (!i5) {
                    if (lifecycle.getCurrentState() == AbstractC1346l.b.DESTROYED) {
                        throw new C1349o();
                    }
                    if (lifecycle.getCurrentState().compareTo(bVar) >= 0) {
                        chromeTabLoginActivity.setResult(0);
                        chromeTabLoginActivity.finish();
                        Unit unit = Unit.f41027a;
                    }
                }
                a aVar = new a(chromeTabLoginActivity);
                this.f22304l = 1;
                if (f0.a(lifecycle, bVar, i5, p4, aVar, this) == f4) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((c) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    private final void A(Uri uri) {
        h hVar = this.f22302c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginHandler");
            hVar = null;
        }
        setResult(-1, hVar.c(uri));
        finish();
    }

    private final void z(String str, String str2) {
        androidx.browser.customtabs.b a4 = new b.d().a();
        Intrinsics.checkNotNullExpressionValue(a4, "builder.build()");
        a4.f11000a.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + getPackageName()));
        a4.f11000a.setPackage(str2);
        a4.a(this, Uri.parse(str));
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, androidx.activity.j, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        if (((YandexAuthOptions) g.e(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class)) == null) {
            finish();
            return;
        }
        h hVar = new h(new k1.l(this), b.f22303i, new m());
        this.f22302c = hVar;
        if (bundle == null) {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            z(hVar.a(intent2), getIntent().getStringExtra("com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME"));
        }
        AbstractC3337k.d(AbstractC1355v.a(this), Z.c(), null, new c(null), 2, null);
    }

    @Override // androidx.activity.j, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data != null) {
            A(data);
        }
    }
}
