package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ae extends Dialog implements lx, sb0 {
    public nx f;
    public final i5 g;
    public final wg0 h;
    public final wg0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(Context context, int i) {
        super(context, i);
        context.getClass();
        this.g = new i5(new rb0(this, new h2(9, this)));
        final int i2 = 0;
        this.h = new wg0(new ir(this) { // from class: zd
            public final /* synthetic */ ae g;

            {
                this.g = this;
            }

            @Override // defpackage.ir
            public final Object a() {
                int i3 = i2;
                ae aeVar = this.g;
                switch (i3) {
                    case 0:
                        dk dkVar = new dk();
                        aeVar.c().a().c.a(dkVar);
                        return dkVar;
                    default:
                        return new y40(new r1(5, aeVar));
                }
            }
        });
        final int i3 = 1;
        this.i = new wg0(new ir(this) { // from class: zd
            public final /* synthetic */ ae g;

            {
                this.g = this;
            }

            @Override // defpackage.ir
            public final Object a() {
                int i32 = i3;
                ae aeVar = this.g;
                switch (i32) {
                    case 0:
                        dk dkVar = new dk();
                        aeVar.c().a().c.a(dkVar);
                        return dkVar;
                    default:
                        return new y40(new r1(5, aeVar));
                }
            }
        });
    }

    public static void b(ae aeVar) {
        super.onBackPressed();
    }

    @Override // defpackage.sb0
    public final i5 a() {
        return (i5) this.g.h;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final y40 c() {
        return (y40) this.i.getValue();
    }

    public final void d() {
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

    @Override // defpackage.lx
    public final nx e() {
        nx nxVar = this.f;
        if (nxVar != null) {
            return nxVar;
        }
        nx nxVar2 = new nx(this);
        this.f = nxVar2;
        return nxVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((dk) this.h.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            y40 c = c();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c.b(onBackInvokedDispatcher);
        }
        this.g.L(bundle);
        nx nxVar = this.f;
        if (nxVar == null) {
            nxVar = new nx(this);
            this.f = nxVar;
        }
        nxVar.d(fx.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.g.M(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        nx nxVar = this.f;
        if (nxVar == null) {
            nxVar = new nx(this);
            this.f = nxVar;
        }
        nxVar.d(fx.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        nx nxVar = this.f;
        if (nxVar == null) {
            nxVar = new nx(this);
            this.f = nxVar;
        }
        nxVar.d(fx.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
