package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvn implements goo, gol {
    private static final hkh a = hkh.l("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver");
    private final fvm b;

    public fvn(fvm fvmVar) {
        this.b = fvmVar;
    }

    @Override // defpackage.goo
    public final hvi a(Intent intent) {
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver", "onReceive", 40, "DeviceAccountsChangedReceiver.java")).s("DeviceAccountsChangedReceiver#onReceive");
        fvm fvmVar = this.b;
        if (fvmVar.c()) {
            return hnu.aJ(null);
        }
        fvmVar.b();
        return fvmVar.a();
    }

    @Override // defpackage.gol
    public final long b() {
        return -1L;
    }

    @Override // defpackage.gol
    public final /* synthetic */ long c() {
        return -1L;
    }
}
