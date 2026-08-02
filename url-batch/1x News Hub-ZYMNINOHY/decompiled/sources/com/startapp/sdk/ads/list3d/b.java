package com.startapp.sdk.ads.list3d;

import android.view.View;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ob;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f3117a;

    public b(List3DActivity list3DActivity) {
        this.f3117a = list3DActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List3DActivity list3DActivity = this.f3117a;
        ArrayList arrayList = list3DActivity.f3092h;
        String str = "";
        if (arrayList != null && !arrayList.isEmpty() && ((ob) list3DActivity.f3092h.get(0)).f4248e != null) {
            str = ((ob) list3DActivity.f3092h.get(0)).f4248e;
        }
        g0.a(list3DActivity, str, this.f3117a.a());
        this.f3117a.finish();
    }
}
