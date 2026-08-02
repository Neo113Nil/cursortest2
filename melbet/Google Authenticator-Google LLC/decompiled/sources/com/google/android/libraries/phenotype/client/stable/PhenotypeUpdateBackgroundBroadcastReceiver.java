package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.bpp;
import defpackage.etd;
import defpackage.euy;
import defpackage.evm;
import defpackage.evo;
import defpackage.hoq;
import defpackage.hti;
import defpackage.hvc;
import defpackage.iac;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        evm evmVar;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.Z(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            etd a = etd.a(context);
            if (a == null) {
                etd.f();
                hoq.H(false);
                return;
            }
            Map a2 = evm.a(context);
            if (a2.isEmpty() || (evmVar = (evm) a2.get(stringExtra)) == null || !evmVar.b.equals(iac.FILE)) {
                return;
            }
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            final hvc w = ((hvc) hti.g(hvc.v(hti.f(hvc.v(evo.b(a).d()), new euy(stringExtra, 3), a.d())), new bpp((Object) evmVar, stringExtra, (Object) a, 4), a.d())).w(25L, TimeUnit.SECONDS, a.d());
            w.c(new Runnable() { // from class: evu
                @Override // java.lang.Runnable
                public final void run() {
                    hvc hvcVar = hvc.this;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    try {
                        try {
                            hnu.aR(hvcVar);
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.ah(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, a.d());
        }
    }
}
