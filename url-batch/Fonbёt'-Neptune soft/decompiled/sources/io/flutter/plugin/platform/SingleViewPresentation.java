package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import b.InterfaceC0163a;

@InterfaceC0163a
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0223a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private q rootView;
    private boolean startFocused;
    private final t state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, g gVar, C0223a c0223a, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0223a;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        t tVar = new t();
        this.state = tVar;
        tVar.f2684a = gVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public t detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        q qVar = this.rootView;
        if (qVar != null) {
            qVar.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        return this.state.f2684a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        t tVar = this.state;
        if (tVar.f2686c == null) {
            tVar.f2686c = new p(getContext());
        }
        if (this.state.f2685b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            t tVar2 = this.state;
            tVar2.f2685b = new B(windowManager, tVar2.f2686c);
        }
        this.container = new FrameLayout(getContext());
        s sVar = new s(getContext(), this.state.f2685b, this.outerContext);
        View view = this.state.f2684a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(sVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        q qVar = new q(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = qVar;
        qVar.addView(this.container);
        this.rootView.addView(this.state.f2686c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0223a c0223a, t tVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new r(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0223a;
        this.state = tVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
