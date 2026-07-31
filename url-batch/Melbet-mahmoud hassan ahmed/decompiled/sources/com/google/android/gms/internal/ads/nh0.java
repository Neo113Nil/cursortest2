package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class nh0 extends zd implements ph0 {
    nh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.ph0
    public final void N2(List<Uri> list) {
        Parcel E = E();
        E.writeTypedList(list);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.ph0
    public final void u(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(2, E);
    }
}
