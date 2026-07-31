package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface zm1 {
    boolean V();

    boolean a(Bundle bundle);

    void b(Bundle bundle);

    JSONObject c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void d();

    void e();

    void f();

    void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void h(View view, MotionEvent motionEvent, View view2);

    void i(jy jyVar);

    void j(my myVar);

    void k(String str);

    void l(e60 e60Var);

    void m(View view, Map<String, WeakReference<View>> map);

    void n();

    void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6);

    void p(View view);

    void q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6);

    void r();

    void r0(Bundle bundle);

    void s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    JSONObject t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void y();
}
