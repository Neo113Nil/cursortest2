package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.l8;
import com.startapp.sdk.internal.ra;
import com.startapp.sdk.internal.va;
import com.startapp.sdk.internal.ya;
import com.startapp.sdk.internal.za;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f90a;

    public a(List3DActivity list3DActivity) {
        this.f90a = list3DActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        za zaVar;
        ff ffVar;
        String str = ((va) this.f90a.h.get(i)).b;
        String[] strArr = ((va) this.f90a.h.get(i)).d;
        String str2 = ((va) this.f90a.h.get(i)).f;
        boolean z = ((va) this.f90a.h.get(i)).k;
        boolean z2 = ((va) this.f90a.h.get(i)).l;
        String str3 = ((va) this.f90a.h.get(i)).n;
        String str4 = ((va) this.f90a.h.get(i)).m;
        Boolean bool = ((va) this.f90a.h.get(i)).p;
        zaVar = this.f90a.i;
        ya a2 = zaVar.a(this.f90a.f);
        String[] strArr2 = ((va) this.f90a.h.get(i)).c;
        l8 l8Var = a2.f508a;
        String str5 = strArr2 != null ? TextUtils.join("^", strArr2) + a2.c : null;
        HashMap hashMap = l8Var.c;
        if (hashMap != null && (ffVar = (ff) hashMap.get(str5)) != null) {
            ffVar.a(null, null);
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            List3DActivity list3DActivity = this.f90a;
            e0.a(str3, str4, str, list3DActivity, new TrackingParams(list3DActivity.g));
            this.f90a.finish();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean o = MetaData.A().o();
        Context applicationContext = this.f90a.getApplicationContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean a3 = e0.a(applicationContext);
        if (z && !a3) {
            List3DActivity list3DActivity2 = this.f90a;
            e0.a(list3DActivity2, str, strArr, str2, list3DActivity2.a(), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z2, bool, false, o ? new ra(this) : null);
            return;
        }
        List3DActivity list3DActivity3 = this.f90a;
        e0.a(list3DActivity3, str, strArr, list3DActivity3.a(), z2 && !a3, false);
        if (o) {
            this.f90a.finish();
        }
    }
}
