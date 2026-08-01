package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class cc extends Dialog implements nq, mw, x10 {
    private a _lifecycleRegistry;
    private final bq onBackPressedDispatcher$delegate;
    private final bq onBackPressedInput$delegate;
    private final w10 savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(Context context, int i) {
        super(context, i);
        context.getClass();
        this.savedStateRegistryController = new w10(this);
        this.onBackPressedInput$delegate = new d50(new bc(0, this));
        this.onBackPressedDispatcher$delegate = new d50(new bc(1, this));
    }

    public static void a(cc ccVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.nq
    public iq getLifecycle() {
        a aVar = this._lifecycleRegistry;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this._lifecycleRegistry = aVar2;
        return aVar2;
    }

    public iv getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().a().c;
    }

    @Override // defpackage.mw
    public final lw getOnBackPressedDispatcher() {
        return (lw) ((d50) this.onBackPressedDispatcher$delegate).a();
    }

    @Override // defpackage.x10
    public v10 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        ((qf) ((d50) this.onBackPressedInput$delegate).a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            lw onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.b(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.b(bundle);
        a aVar = this._lifecycleRegistry;
        if (aVar == null) {
            aVar = new a(this);
            this._lifecycleRegistry = aVar;
        }
        aVar.e(gq.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.savedStateRegistryController.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a aVar = this._lifecycleRegistry;
        if (aVar == null) {
            aVar = new a(this);
            this._lifecycleRegistry = aVar;
        }
        aVar.e(gq.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a aVar = this._lifecycleRegistry;
        if (aVar == null) {
            aVar = new a(this);
            this._lifecycleRegistry = aVar;
        }
        aVar.e(gq.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
