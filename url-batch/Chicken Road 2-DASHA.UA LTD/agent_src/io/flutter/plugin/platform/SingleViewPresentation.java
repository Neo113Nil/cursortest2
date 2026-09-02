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
    private m rootView;
    private boolean startFocused;
    private final p state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, g gVar, a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new n(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new p();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public p detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        p pVar = this.state;
        if (pVar.f692b == null) {
            pVar.f692b = new l(getContext());
        }
        if (this.state.f691a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            p pVar2 = this.state;
            pVar2.f691a = new r(windowManager, pVar2.f692b);
        }
        this.container = new FrameLayout(getContext());
        new o(getContext(), this.state.f691a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, p pVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new n(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = pVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
