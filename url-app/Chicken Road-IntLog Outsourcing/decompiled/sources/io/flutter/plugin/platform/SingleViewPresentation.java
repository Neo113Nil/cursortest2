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
    private o rootView;
    private boolean startFocused;
    private final r state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, g gVar, a aVar, int i2, View.OnFocusChangeListener onFocusChangeListener) {
        super(new p(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new r();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public r detachState() {
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
        r rVar = this.state;
        if (rVar.f10263b == null) {
            rVar.f10263b = new n(getContext());
        }
        if (this.state.f10262a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            r rVar2 = this.state;
            rVar2.f10262a = new t(windowManager, rVar2.f10263b);
        }
        this.container = new FrameLayout(getContext());
        new q(getContext(), this.state.f10262a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, a aVar, r rVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new p(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = rVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
