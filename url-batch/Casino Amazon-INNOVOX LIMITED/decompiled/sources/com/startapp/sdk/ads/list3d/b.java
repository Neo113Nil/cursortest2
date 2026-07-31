package com.startapp.sdk.ads.list3d;

import android.view.View;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.va;
import java.util.ArrayList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f91a;

    public b(List3DActivity list3DActivity) {
        this.f91a = list3DActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List3DActivity list3DActivity = this.f91a;
        ArrayList arrayList = list3DActivity.h;
        String str = "";
        if (arrayList != null && !arrayList.isEmpty() && ((va) list3DActivity.h.get(0)).e != null) {
            str = ((va) list3DActivity.h.get(0)).e;
        }
        e0.a(list3DActivity, str, this.f91a.a());
        this.f91a.finish();
    }
}
