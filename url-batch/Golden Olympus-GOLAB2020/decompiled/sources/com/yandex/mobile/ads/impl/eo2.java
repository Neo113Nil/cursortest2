package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.nn2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eo2 implements nn2 {

    /* renamed from: a, reason: collision with root package name */
    private final nn2 f25378a;

    public eo2(io2 io2Var) {
        this.f25378a = io2Var;
    }

    @Override // com.yandex.mobile.ads.impl.nn2
    public final JSONObject a(View view) {
        return yn2.a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.nn2
    public final void a(View view, JSONObject jSONObject, nn2.a aVar, boolean z4, boolean z5) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        mn2 a4 = mn2.a();
        if (a4 != null) {
            Collection<ln2> c4 = a4.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c4.size() * 2) + 3);
            Iterator<ln2> it = c4.iterator();
            while (it.hasNext()) {
                View f4 = it.next().f();
                if (f4 != null && qo2.b(f4) && (rootView = f4.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a5 = qo2.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && qo2.a((View) arrayList.get(size - 1)) > a5) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            ((v62) aVar).a((View) obj, this.f25378a, jSONObject, z5);
        }
    }
}
