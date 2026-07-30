package com.iab.omid.library.toponad.processor;

import android.view.View;
import com.iab.omid.library.toponad.processor.a;
import com.iab.omid.library.toponad.utils.e;
import com.iab.omid.library.toponad.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f36433a;

    public c(a aVar) {
        this.f36433a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.toponad.internal.c c4 = com.iab.omid.library.toponad.internal.c.c();
        if (c4 != null) {
            Collection<com.iab.omid.library.toponad.adsession.a> a9 = c4.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a9.size() * 2) + 3);
            Iterator<com.iab.omid.library.toponad.adsession.a> it = a9.iterator();
            while (it.hasNext()) {
                View c9 = it.next().c();
                if (c9 != null && h.g(c9) && (rootView = c9.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d2 = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > d2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.toponad.processor.a
    public JSONObject a(View view) {
        JSONObject a9 = com.iab.omid.library.toponad.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.toponad.utils.c.a(a9, e.a());
        return a9;
    }

    @Override // com.iab.omid.library.toponad.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0169a interfaceC0169a, boolean z8, boolean z9) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0169a.a(it.next(), this.f36433a, jSONObject, z9);
        }
    }
}
