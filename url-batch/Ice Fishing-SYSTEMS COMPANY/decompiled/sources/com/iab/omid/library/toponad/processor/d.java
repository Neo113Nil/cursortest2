package com.iab.omid.library.toponad.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.toponad.processor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f36434a = new int[2];

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0169a interfaceC0169a, boolean z8) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0169a.a((View) it2.next(), this, jSONObject, z8);
            }
        }
    }

    @Override // com.iab.omid.library.toponad.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.toponad.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f36434a);
        int[] iArr = this.f36434a;
        return com.iab.omid.library.toponad.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.toponad.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0169a interfaceC0169a, boolean z8, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z8) {
                b(viewGroup, jSONObject, interfaceC0169a, z9);
            } else {
                a(viewGroup, jSONObject, interfaceC0169a, z9);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0169a interfaceC0169a, boolean z8) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC0169a.a(viewGroup.getChildAt(i), this, jSONObject, z8);
        }
    }
}
