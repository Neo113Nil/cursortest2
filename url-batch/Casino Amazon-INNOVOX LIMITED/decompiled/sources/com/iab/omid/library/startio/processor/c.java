package com.iab.omid.library.startio.processor;

import android.view.View;
import com.iab.omid.library.startio.processor.a;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f45a;

    public c(a aVar) {
        this.f45a = aVar;
    }

    ArrayList a() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        com.iab.omid.library.startio.internal.c c = com.iab.omid.library.startio.internal.c.c();
        if (c != null) {
            Collection a2 = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a2.size() << 1) + 3);
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                View e = ((com.iab.omid.library.startio.adsession.a) it.next()).e();
                if (e != null && h.g(e) && (rootView = e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d((View) arrayList.get(size - 1)) > d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public JSONObject a(View view) {
        JSONObject a2 = com.iab.omid.library.startio.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.startio.utils.c.a(a2, e.a());
        return a2;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0015a interfaceC0015a, boolean z, boolean z2) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            interfaceC0015a.a((View) it.next(), this.f45a, jSONObject, z2);
        }
    }
}
