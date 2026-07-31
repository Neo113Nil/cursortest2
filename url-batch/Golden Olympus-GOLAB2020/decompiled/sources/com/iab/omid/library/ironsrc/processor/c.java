package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f14567a;

    public c(a aVar) {
        this.f14567a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.ironsrc.internal.c c4 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c4 != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> a4 = c4.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a4.size() * 2) + 3);
            Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a4.iterator();
            while (it.hasNext()) {
                View c5 = it.next().c();
                if (c5 != null && h.g(c5) && (rootView = c5.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d4 = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > d4) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public JSONObject a(View view) {
        JSONObject a4 = com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.ironsrc.utils.c.a(a4, e.a());
        return a4;
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0141a interfaceC0141a, boolean z4, boolean z5) {
        ArrayList<View> a4 = a();
        int size = a4.size();
        int i4 = 0;
        while (i4 < size) {
            View view2 = a4.get(i4);
            i4++;
            interfaceC0141a.a(view2, this.f14567a, jSONObject, z5);
        }
    }
}
