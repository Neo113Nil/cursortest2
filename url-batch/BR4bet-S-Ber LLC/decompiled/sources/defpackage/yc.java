package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class yc extends Dialog implements ms, n40 {
    public os f;
    public final m40 g;
    public final a80 h;
    public final a80 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(Context context, int i) {
        super(context, i);
        context.getClass();
        this.g = new m40(this);
        final int i2 = 0;
        this.h = new a80(new rn(this) { // from class: xc
            public final /* synthetic */ yc g;

            {
                this.g = this;
            }

            @Override // defpackage.rn
            public final Object a() {
                int i3 = i2;
                yc ycVar = this.g;
                switch (i3) {
                    case 0:
                        xh xhVar = new xh();
                        ycVar.c().a().b(xhVar);
                        return xhVar;
                    default:
                        return new hz(new n1(5, ycVar));
                }
            }
        });
        final int i3 = 1;
        this.i = new a80(new rn(this) { // from class: xc
            public final /* synthetic */ yc g;

            {
                this.g = this;
            }

            @Override // defpackage.rn
            public final Object a() {
                int i32 = i3;
                yc ycVar = this.g;
                switch (i32) {
                    case 0:
                        xh xhVar = new xh();
                        ycVar.c().a().b(xhVar);
                        return xhVar;
                    default:
                        return new hz(new n1(5, ycVar));
                }
            }
        });
    }

    public static void b(yc ycVar) {
        super.onBackPressed();
    }

    @Override // defpackage.n40
    public final s3 a() {
        return this.g.b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final hz c() {
        return (hz) this.i.a();
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

    @Override // defpackage.ms
    public final os e() {
        os osVar = this.f;
        if (osVar != null) {
            return osVar;
        }
        os osVar2 = new os(this);
        this.f = osVar2;
        return osVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((xh) this.h.a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            hz c = c();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c.b(onBackInvokedDispatcher);
        }
        this.g.b(bundle);
        os osVar = this.f;
        if (osVar == null) {
            osVar = new os(this);
            this.f = osVar;
        }
        osVar.d(gs.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        os osVar = this.f;
        if (osVar == null) {
            osVar = new os(this);
            this.f = osVar;
        }
        osVar.d(gs.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        os osVar = this.f;
        if (osVar == null) {
            osVar = new os(this);
            this.f = osVar;
        }
        osVar.d(gs.ON_DESTROY);
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
