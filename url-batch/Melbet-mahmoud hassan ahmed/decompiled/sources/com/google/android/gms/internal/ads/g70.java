package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class g70 implements t70<eu0> {
    g70() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        WindowManager windowManager = (WindowManager) eu0Var2.getContext().getSystemService("window");
        y2.t.q();
        DisplayMetrics g02 = a3.g2.g0(windowManager);
        int i7 = g02.widthPixels;
        int i8 = g02.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) eu0Var2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i7));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i8));
        eu0Var2.t("locationReady", hashMap);
        io0.g("GET LOCATION COMPILED");
    }
}
