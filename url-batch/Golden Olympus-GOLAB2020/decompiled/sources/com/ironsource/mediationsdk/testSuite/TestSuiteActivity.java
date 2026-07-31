package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.bu;
import com.ironsource.hi;
import com.ironsource.nu;
import com.ironsource.su;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class TestSuiteActivity extends Activity implements hi {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f17929a;

    /* renamed from: b, reason: collision with root package name */
    private su f17930b;

    /* renamed from: c, reason: collision with root package name */
    private nu f17931c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        String b4 = new bu().b(this);
        if (b4 != null) {
            try {
                if (b4.length() != 0) {
                    return new JSONObject(b4);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f17929a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.hi
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f17929a = relativeLayout;
        setContentView(relativeLayout, c());
        su suVar = new su(this, this, b(), a());
        this.f17930b = suVar;
        nu nuVar = new nu(suVar);
        this.f17931c = nuVar;
        nuVar.d();
        RelativeLayout relativeLayout2 = this.f17929a;
        su suVar2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        su suVar3 = this.f17930b;
        if (suVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            suVar2 = suVar3;
        }
        relativeLayout2.addView(suVar2.d(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        nu nuVar = this.f17931c;
        su suVar = null;
        if (nuVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            nuVar = null;
        }
        nuVar.a();
        RelativeLayout relativeLayout = this.f17929a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        su suVar2 = this.f17930b;
        if (suVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            suVar = suVar2;
        }
        suVar.a();
        super.onDestroy();
    }

    @Override // com.ironsource.hi
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(TestSuiteActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        su suVar = this$0.f17930b;
        su suVar2 = null;
        if (suVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            suVar = null;
        }
        if (suVar.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f17929a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            su suVar3 = this$0.f17930b;
            if (suVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                suVar3 = null;
            }
            relativeLayout.removeView(suVar3.d());
            RelativeLayout relativeLayout2 = this$0.f17929a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            su suVar4 = this$0.f17930b;
            if (suVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                suVar4 = null;
            }
            relativeLayout2.addView(suVar4.c(), this$0.c());
            su suVar5 = this$0.f17930b;
            if (suVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                suVar2 = suVar5;
            }
            suVar2.b();
        }
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }
}
