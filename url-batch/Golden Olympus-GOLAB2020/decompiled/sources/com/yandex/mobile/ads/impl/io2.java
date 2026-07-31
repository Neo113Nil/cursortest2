package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.nn2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class io2 implements nn2 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f27303a = new int[2];

    @Override // com.yandex.mobile.ads.impl.nn2
    public final JSONObject a(View view) {
        if (view == null) {
            return yn2.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f27303a);
        int[] iArr = this.f27303a;
        return yn2.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.nn2
    public final void a(View view, JSONObject jSONObject, nn2.a aVar, boolean z4, boolean z5) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z4) {
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    ((v62) aVar).a(viewGroup.getChildAt(i4), this, jSONObject, z5);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
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
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) obj);
                int size2 = arrayList3.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    ((v62) aVar).a((View) obj2, this, jSONObject, z5);
                }
            }
        }
    }
}
