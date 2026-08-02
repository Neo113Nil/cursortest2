package com.startapp.sdk.ads.list3d;

import android.view.View;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ob;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f6200a;

    public b(List3DActivity list3DActivity) {
        this.f6200a = list3DActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List3DActivity list3DActivity = this.f6200a;
        ArrayList arrayList = list3DActivity.f6175h;
        String str = "";
        if (arrayList != null && !arrayList.isEmpty() && ((ob) list3DActivity.f6175h.get(0)).f7383e != null) {
            str = ((ob) list3DActivity.f6175h.get(0)).f7383e;
        }
        g0.a(list3DActivity, str, this.f6200a.a());
        this.f6200a.finish();
    }
}
