package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* loaded from: classes.dex */
public final class pc extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f10172i;

    /* renamed from: j, reason: collision with root package name */
    private final View f10173j;

    public pc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, View view, Activity activity) {
        super(gcVar, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", j8Var, i7, 62);
        this.f10173j = view;
        this.f10172i = activity;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (this.f10173j == null) {
            return;
        }
        boolean booleanValue = ((Boolean) sw.c().b(m10.P1)).booleanValue();
        Object[] objArr = (Object[]) this.f10654f.invoke(null, this.f10173j, this.f10172i, Boolean.valueOf(booleanValue));
        synchronized (this.f10653e) {
            this.f10653e.U(((Long) objArr[0]).longValue());
            this.f10653e.W(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.f10653e.V((String) objArr[2]);
            }
        }
    }
}
