package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nz2 implements jz2 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f9404a = new int[2];

    @Override // com.google.android.gms.internal.ads.jz2
    public final JSONObject b(View view) {
        if (view == null) {
            return sz2.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f9404a);
        int[] iArr = this.f9404a;
        return sz2.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final void c(View view, JSONObject jSONObject, iz2 iz2Var, boolean z6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z6 || Build.VERSION.SDK_INT < 21) {
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    iz2Var.a(viewGroup.getChildAt(i8), this, jSONObject);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
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
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i10));
                int size2 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    i7 = i10 + 1;
                    if (i11 < size2) {
                        iz2Var.a((View) arrayList3.get(i11), this, jSONObject);
                        i11++;
                    }
                }
                i10 = i7;
            }
        }
    }
}
