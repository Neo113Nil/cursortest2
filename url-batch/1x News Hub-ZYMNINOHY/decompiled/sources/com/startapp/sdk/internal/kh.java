package com.startapp.sdk.internal;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class kh extends TelephonyManager$CellInfoCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh f4064a;

    public kh(mh mhVar) {
        this.f4064a = mhVar;
    }

    public final void onCellInfo(List list) {
        this.f4064a.b(false);
    }
}
