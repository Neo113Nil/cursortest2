package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class tg extends TelephonyManager.CellInfoCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vg f444a;

    public tg(vg vgVar) {
        this.f444a = vgVar;
    }

    @Override // android.telephony.TelephonyManager.CellInfoCallback
    public final void onCellInfo(List list) {
        this.f444a.b(false);
    }
}
