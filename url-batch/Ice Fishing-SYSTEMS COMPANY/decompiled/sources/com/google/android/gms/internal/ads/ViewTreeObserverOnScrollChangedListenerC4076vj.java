package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnScrollChangedListenerC4076vj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final Context f34851n;

    /* renamed from: u, reason: collision with root package name */
    public View f34852u;

    public ViewTreeObserverOnScrollChangedListenerC4076vj(Context context) {
        super(context);
        this.f34851n = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC4076vj a(Context context, View view, Ut ut) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC4076vj viewTreeObserverOnScrollChangedListenerC4076vj = new ViewTreeObserverOnScrollChangedListenerC4076vj(context);
        List list = ut.f28177u;
        boolean isEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC4076vj.f34851n;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f6 = ((Vt) list.get(0)).f28315a;
            float f9 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC4076vj.setLayoutParams(new FrameLayout.LayoutParams((int) (f6 * f9), (int) (r5.f28316b * f9)));
        }
        viewTreeObserverOnScrollChangedListenerC4076vj.f34852u = view;
        viewTreeObserverOnScrollChangedListenerC4076vj.addView(view);
        C2837Wb c2837Wb = p2.j.f39798C.f39800B;
        ViewTreeObserverOnScrollChangedListenerC3534lg viewTreeObserverOnScrollChangedListenerC3534lg = new ViewTreeObserverOnScrollChangedListenerC3534lg(viewTreeObserverOnScrollChangedListenerC4076vj, viewTreeObserverOnScrollChangedListenerC4076vj);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3534lg.f29483n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC3534lg.v1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC3480kg viewTreeObserverOnGlobalLayoutListenerC3480kg = new ViewTreeObserverOnGlobalLayoutListenerC3480kg(viewTreeObserverOnScrollChangedListenerC4076vj, viewTreeObserverOnScrollChangedListenerC4076vj);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3480kg.f29483n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3480kg.v1(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = ut.f28154h0;
        JSONObject optJSONObject = jSONObject.optJSONObject(com.anythink.expressad.foundation.d.g.f18863j);
        if (optJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC4076vj.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC4076vj.b(optJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC4076vj.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC4076vj;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f34851n;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(com.anythink.basead.exoplayer.k.o.f8603c, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        C4907p c4907p = C4907p.f40108g;
        u2.d dVar = c4907p.f40109a;
        int b9 = u2.d.b(context, (int) optDouble);
        textView.setPadding(0, b9, 0, b9);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        u2.d dVar2 = c4907p.f40109a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, u2.d.b(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f34852u.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f34852u.setY(-r0[1]);
    }
}
