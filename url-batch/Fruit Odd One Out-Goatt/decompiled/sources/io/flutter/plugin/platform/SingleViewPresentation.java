package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private l rootView;
    private boolean startFocused;
    private final o state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new m(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new o();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public o detachState() {
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
        o oVar = this.state;
        if (oVar.f538b == null) {
            oVar.f538b = new k(getContext());
        }
        if (this.state.f537a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            o oVar2 = this.state;
            oVar2.f537a = new q(windowManager, oVar2.f538b);
        }
        this.container = new FrameLayout(getContext());
        new n(getContext(), this.state.f537a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, o oVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new m(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = oVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
