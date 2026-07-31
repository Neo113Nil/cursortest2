package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private n rootView;
    private boolean startFocused;
    private final q state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new o(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new q();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public q detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public f getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        q qVar = this.state;
        if (qVar.f2507b == null) {
            qVar.f2507b = new m(getContext());
        }
        if (this.state.f2506a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            q qVar2 = this.state;
            qVar2.f2506a = new s(windowManager, qVar2.f2507b);
        }
        this.container = new FrameLayout(getContext());
        new p(getContext(), this.state.f2506a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, q qVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new o(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = qVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
