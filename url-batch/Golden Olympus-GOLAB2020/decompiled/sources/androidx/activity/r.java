package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.C1356w;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.d0;
import h0.AbstractC2438g;
import h0.C2435d;
import h0.C2436e;
import h0.InterfaceC2437f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r extends Dialog implements InterfaceC1354u, y, InterfaceC2437f {
    private C1356w _lifecycleRegistry;
    private final w onBackPressedDispatcher;
    private final C2436e savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i4) {
        super(context, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = C2436e.f36696d.a(this);
        this.onBackPressedDispatcher = new w(new Runnable() { // from class: androidx.activity.q
            @Override // java.lang.Runnable
            public final void run() {
                r.c(r.this);
            }
        });
    }

    private final C1356w b() {
        C1356w c1356w = this._lifecycleRegistry;
        if (c1356w != null) {
            return c1356w;
        }
        C1356w c1356w2 = new C1356w(this);
        this._lifecycleRegistry = c1356w2;
        return c1356w2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1354u
    public AbstractC1346l getLifecycle() {
        return b();
    }

    @Override // androidx.activity.y
    public final w getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // h0.InterfaceC2437f
    public C2435d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        d0.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        B.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        AbstractC2438g.a(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            wVar.o(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(bundle);
        b().g(AbstractC1346l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().g(AbstractC1346l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().g(AbstractC1346l.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
