package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.majelw.libystne.R;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ay extends Dialog implements id1, su1, uq1, zd2 {
    public kd1 m;
    public final xd2 n;
    public final y91 o;
    public final y91 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(Context context, int i) {
        super(context, i);
        context.getClass();
        this.n = new xd2(new yd2(this, new dj(11, this)));
        final int i2 = 0;
        this.o = ya1.b(new Function0(this) { // from class: zx
            public final /* synthetic */ ay n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ay ayVar = this.n;
                switch (i3) {
                    case 0:
                        jb0 jb0Var = new jb0();
                        ayVar.getNavigationEventDispatcher().b(jb0Var);
                        return jb0Var;
                    default:
                        return new ru1(new k3(10, ayVar));
                }
            }
        });
        final int i3 = 1;
        this.p = ya1.b(new Function0(this) { // from class: zx
            public final /* synthetic */ ay n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ay ayVar = this.n;
                switch (i32) {
                    case 0:
                        jb0 jb0Var = new jb0();
                        ayVar.getNavigationEventDispatcher().b(jb0Var);
                        return jb0Var;
                    default:
                        return new ru1(new k3(10, ayVar));
                }
            }
        });
    }

    public static void a(ay ayVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final kd1 b() {
        kd1 kd1Var = this.m;
        if (kd1Var != null) {
            return kd1Var;
        }
        kd1 kd1Var2 = new kd1(this, true);
        this.m = kd1Var2;
        return kd1Var2;
    }

    public final void c() {
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

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        return b();
    }

    @Override // defpackage.uq1
    public final tq1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.su1
    public final ru1 getOnBackPressedDispatcher() {
        return (ru1) this.p.getValue();
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.n.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((jb0) this.o.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ru1 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.n.a(bundle);
        b().f(yc1.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.n.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().f(yc1.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().f(yc1.ON_DESTROY);
        this.m = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
