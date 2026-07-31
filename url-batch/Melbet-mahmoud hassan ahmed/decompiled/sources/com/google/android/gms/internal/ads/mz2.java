package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mz2 implements jz2 {

    /* renamed from: a, reason: collision with root package name */
    private final jz2 f8836a;

    public mz2(jz2 jz2Var) {
        this.f8836a = jz2Var;
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final JSONObject b(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final void c(View view, JSONObject jSONObject, iz2 iz2Var, boolean z6) {
        ArrayList arrayList = new ArrayList();
        az2 a7 = az2.a();
        if (a7 != null) {
            Collection<py2> b7 = a7.b();
            int size = b7.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator<py2> it = b7.iterator();
            while (it.hasNext()) {
                View f7 = it.next().f();
                if (f7 != null && (Build.VERSION.SDK_INT < 19 || f7.isAttachedToWindow())) {
                    if (f7.isShown()) {
                        View view2 = f7;
                        while (true) {
                            if (view2 == null) {
                                View rootView = f7.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float a8 = vz2.a(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i7 = size2 - 1;
                                        if (vz2.a((View) arrayList.get(i7)) <= a8) {
                                            break;
                                        } else {
                                            size2 = i7;
                                        }
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            } else if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i8 = 0; i8 < size3; i8++) {
            iz2Var.a((View) arrayList.get(i8), this.f8836a, jSONObject);
        }
    }
}
