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
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class yb extends Dialog implements aq, g10 {
    public a f;
    public final f10 g;
    public final x40 h;
    public final x40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(Context context, int i) {
        super(context, i);
        context.getClass();
        this.g = new f10(this);
        this.h = new x40(new xb(0, this));
        this.i = new x40(new xb(1, this));
    }

    public static void b(yb ybVar) {
        super.onBackPressed();
    }

    @Override // defpackage.g10
    public final i3 a() {
        return this.g.b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final ew c() {
        return (ew) this.i.a();
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

    @Override // defpackage.aq
    public final a e() {
        a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f = aVar2;
        return aVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((yf) this.h.a()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ew c = c();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c.b(onBackInvokedDispatcher);
        }
        this.g.b(bundle);
        a aVar = this.f;
        if (aVar == null) {
            aVar = new a(this);
            this.f = aVar;
        }
        aVar.d(up.ON_CREATE);
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
        a aVar = this.f;
        if (aVar == null) {
            aVar = new a(this);
            this.f = aVar;
        }
        aVar.d(up.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a aVar = this.f;
        if (aVar == null) {
            aVar = new a(this);
            this.f = aVar;
        }
        aVar.d(up.ON_DESTROY);
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
