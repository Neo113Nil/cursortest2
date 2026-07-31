package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.processor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14568a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0141a interfaceC0141a, boolean z4) {
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ArrayList arrayList3 = (ArrayList) hashMap.get((Float) obj);
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                interfaceC0141a.a((View) obj2, this, jSONObject, z4);
            }
        }
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f14568a);
        int[] iArr = this.f14568a;
        return com.iab.omid.library.ironsrc.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0141a interfaceC0141a, boolean z4, boolean z5) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z4) {
                b(viewGroup, jSONObject, interfaceC0141a, z5);
            } else {
                a(viewGroup, jSONObject, interfaceC0141a, z5);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0141a interfaceC0141a, boolean z4) {
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            interfaceC0141a.a(viewGroup.getChildAt(i4), this, jSONObject, z4);
        }
    }
}
