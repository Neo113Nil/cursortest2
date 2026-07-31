package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface mo1 extends View.OnClickListener, View.OnTouchListener {
    void C3(String str, View view, boolean z6);

    View d();

    FrameLayout f();

    ao h();

    x3.a i();

    String j();

    Map<String, WeakReference<View>> k();

    JSONObject l();

    Map<String, WeakReference<View>> m();

    JSONObject n();

    Map<String, WeakReference<View>> o();

    View q0(String str);
}
