package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkm implements bmc {
    final /* synthetic */ Context a;

    public bkm(Context context) {
        this.a = context;
    }

    @Override // defpackage.bmc
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
