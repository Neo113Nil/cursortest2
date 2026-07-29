package com.tapjoy.internal;

import android.view.View;
import com.tapjoy.internal.di;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dk implements di {

    /* renamed from: a, reason: collision with root package name */
    private final di f7947a;

    public dk(di diVar) {
        this.f7947a = diVar;
    }

    @Override // com.tapjoy.internal.di
    public final JSONObject a(View view) {
        return dm.a(0, 0, 0, 0);
    }

    @Override // com.tapjoy.internal.di
    public final void a(View view, JSONObject jSONObject, di.a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        dd a2 = dd.a();
        if (a2 != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(a2.f7930b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View c2 = ((cz) it.next()).c();
                if (c2 != null && dq.b(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a3 = dq.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && dq.a((View) arrayList.get(size - 1)) > a3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.a((View) it2.next(), this.f7947a, jSONObject);
        }
    }
}
