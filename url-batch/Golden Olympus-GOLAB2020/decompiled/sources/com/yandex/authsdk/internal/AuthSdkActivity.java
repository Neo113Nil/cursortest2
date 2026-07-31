package com.yandex.authsdk.internal;

import W1.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.d;
import c.InterfaceC1375a;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import j1.C3184a;
import j1.d;
import k1.j;
import k1.k;
import k1.n;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC3247m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import l1.AbstractC3253b;
import l1.c;

@Metadata
/* loaded from: classes2.dex */
public final class AuthSdkActivity extends d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22295f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f22296g = AuthSdkActivity.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private l1.d f22297c;

    /* renamed from: d, reason: collision with root package name */
    private YandexAuthOptions f22298d;

    /* renamed from: e, reason: collision with root package name */
    private c f22299e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b implements InterfaceC1375a, InterfaceC3247m {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1375a) && (obj instanceof InterfaceC3247m)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3247m
        public final e getFunctionDelegate() {
            return new p(1, AuthSdkActivity.this, AuthSdkActivity.class, "onGetResult", "onGetResult(Ljava/lang/Object;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // c.InterfaceC1375a
        public final void onActivityResult(Object obj) {
            AuthSdkActivity.this.B(((Result) obj).h());
        }
    }

    private final void A(Exception exc) {
        j jVar = j.f40993a;
        YandexAuthOptions yandexAuthOptions = this.f22298d;
        if (yandexAuthOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            yandexAuthOptions = null;
        }
        String TAG = f22296g;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        jVar.b(yandexAuthOptions, TAG, "Unknown error:", exc);
        Intent intent = new Intent();
        intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new C3184a("unknown.error"));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Object obj) {
        YandexAuthOptions yandexAuthOptions = null;
        if (Result.f(obj)) {
            YandexAuthToken yandexAuthToken = (YandexAuthToken) obj;
            j jVar = j.f40993a;
            YandexAuthOptions yandexAuthOptions2 = this.f22298d;
            if (yandexAuthOptions2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                yandexAuthOptions2 = null;
            }
            String TAG = f22296g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            jVar.a(yandexAuthOptions2, TAG, "Token received");
            if (yandexAuthToken != null) {
                Intent intent = new Intent();
                intent.putExtra("com.yandex.authsdk.EXTRA_TOKEN", yandexAuthToken);
                setResult(-1, intent);
            }
        }
        Throwable d4 = Result.d(obj);
        if (d4 != null) {
            j jVar2 = j.f40993a;
            YandexAuthOptions yandexAuthOptions3 = this.f22298d;
            if (yandexAuthOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
            } else {
                yandexAuthOptions = yandexAuthOptions3;
            }
            String TAG2 = f22296g;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            jVar2.a(yandexAuthOptions, TAG2, "Error received");
            Intent intent2 = new Intent();
            intent2.putExtra("com.yandex.authsdk.EXTRA_ERROR", d4);
            setResult(-1, intent2);
        }
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, androidx.activity.j, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.a aVar = j1.d.f40854b;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        n a4 = aVar.a(intent);
        this.f22298d = a4.b();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        String packageName = getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        PackageManager packageManager = getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
        c cVar = new c(applicationContext, new k(packageName, packageManager, a4.b()));
        this.f22299e = cVar;
        AbstractC3253b a5 = cVar.a(a4.a().c());
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(a5.a(), new b());
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul….contract, ::onGetResult)");
        if (bundle != null) {
            this.f22297c = l1.d.values()[bundle.getInt("com.yandex.authsdk.STATE_LOGIN_TYPE")];
            return;
        }
        try {
            this.f22297c = a5.b();
            registerForActivityResult.a(a4);
        } catch (Exception e4) {
            A(e4);
        }
    }

    @Override // androidx.activity.j, androidx.core.app.h, android.app.Activity
    public void onSaveInstanceState(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onSaveInstanceState(state);
        l1.d dVar = this.f22297c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginType");
            dVar = null;
        }
        state.putInt("com.yandex.authsdk.STATE_LOGIN_TYPE", dVar.ordinal());
    }
}
