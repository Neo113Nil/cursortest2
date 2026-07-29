package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    final HashMap f7969a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final HashMap f7970b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final HashSet f7971c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    final HashSet f7972d = new HashSet();
    final HashSet e = new HashSet();
    boolean f;

    final void a(cz czVar) {
        Iterator it = czVar.f7916b.iterator();
        while (it.hasNext()) {
            View view = (View) ((dr) it.next()).get();
            if (view != null) {
                ArrayList arrayList = (ArrayList) this.f7970b.get(view);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f7970b.put(view, arrayList);
                }
                arrayList.add(czVar.f);
            }
        }
    }
}
