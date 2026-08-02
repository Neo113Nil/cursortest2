package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nh extends Dialog implements aer, nw, ame {
    private final koi a;
    private final koi b;
    private ael c;
    private final brr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(Context context, int i) {
        super(context, i);
        context.getClass();
        this.d = yi.j(this);
        this.a = new kop(new nb(this, 2));
        this.b = new kop(new nb(this, 3));
    }

    private final ael a() {
        ael aelVar = this.c;
        if (aelVar != null) {
            return aelVar;
        }
        ael aelVar2 = new ael(this);
        this.c = aelVar2;
        return aelVar2;
    }

    public static final void g(nh nhVar) {
        super.onBackPressed();
    }

    @Override // defpackage.aer
    public final ael L() {
        return a();
    }

    @Override // defpackage.ame
    public final boe aE() {
        return (boe) this.d.a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        yl.d(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        yi.i(decorView3, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.nw
    public final oe f() {
        return (oe) this.b.a();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((ahh) this.a.a()).b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            oe f = f();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            f.d(onBackInvokedDispatcher);
        }
        this.d.i(bundle);
        a().b(aej.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.d.j(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a().b(aej.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().b(aej.ON_DESTROY);
        this.c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
