package com.startapp.sdk.ads.list3d;

import E.AbstractC0005f;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.sb;
import com.startapp.sdk.internal.xf;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f6199a;

    public a(List3DActivity list3DActivity) {
        this.f6199a = list3DActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        sb sbVar;
        xf xfVar;
        String str = ((ob) this.f6199a.f6175h.get(i4)).f7380b;
        String[] strArr = ((ob) this.f6199a.f6175h.get(i4)).f7382d;
        String str2 = ((ob) this.f6199a.f6175h.get(i4)).f7384f;
        boolean z = ((ob) this.f6199a.f6175h.get(i4)).f7389k;
        boolean z4 = ((ob) this.f6199a.f6175h.get(i4)).f7390l;
        String str3 = ((ob) this.f6199a.f6175h.get(i4)).n;
        String str4 = ((ob) this.f6199a.f6175h.get(i4)).f7391m;
        Boolean bool = ((ob) this.f6199a.f6175h.get(i4)).f7392p;
        sbVar = this.f6199a.f6176i;
        rb a3 = sbVar.a(this.f6199a.f6173f);
        String[] strArr2 = ((ob) this.f6199a.f6175h.get(i4)).f7381c;
        a9 a9Var = a3.f7528a;
        String q4 = strArr2 != null ? AbstractC0005f.q(new StringBuilder(), TextUtils.join("^", strArr2), a3.f7530c) : null;
        HashMap hashMap = a9Var.f6654c;
        if (hashMap != null && (xfVar = (xf) hashMap.get(q4)) != null) {
            xfVar.a(null, null);
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            List3DActivity list3DActivity = this.f6199a;
            g0.a(str3, str4, str, list3DActivity, new TrackingParams(list3DActivity.f6174g));
            this.f6199a.finish();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean p2 = MetaData.E().p();
        Context applicationContext = this.f6199a.getApplicationContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean a4 = g0.a(applicationContext);
        if (z && !a4) {
            List3DActivity list3DActivity2 = this.f6199a;
            g0.a(list3DActivity2, str, strArr, str2, list3DActivity2.a(), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z4, bool, false, p2 ? new kb(this) : null);
            return;
        }
        List3DActivity list3DActivity3 = this.f6199a;
        g0.a(list3DActivity3, str, strArr, list3DActivity3.a(), z4 && !a4, false);
        if (p2) {
            this.f6199a.finish();
        }
    }
}
