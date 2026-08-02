package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.avc;
import defpackage.drn;
import defpackage.egl;
import defpackage.esh;
import defpackage.etd;
import defpackage.euy;
import defpackage.evo;
import defpackage.hnu;
import defpackage.hso;
import defpackage.hti;
import defpackage.huf;
import defpackage.hvc;
import defpackage.hve;
import defpackage.hvi;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra("accountType");
                if (stringExtra != null) {
                    if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                        Bundle extras = intent.getExtras();
                        String string = extras != null ? extras.getString("authAccount") : null;
                        if (string != null && (string.contains("..") || string.contains("/") || string.contains("\\") || string.equals("."))) {
                            Log.w("AccountRemovedRecv", "Got an invalid account name for P/H. Exiting.");
                            return;
                        }
                        etd.f();
                        etd a = etd.a(context);
                        if (a == null) {
                            Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                            return;
                        }
                        BroadcastReceiver.PendingResult goAsync = goAsync();
                        hvi[] hviVarArr = new hvi[2];
                        hvi g = string != null ? hti.g(hvc.v(evo.b(a).a(new euy(string, 2), a.d())), new egl(a, string, 5), a.d()) : hve.a;
                        esh eshVar = new esh(3);
                        huf hufVar = huf.a;
                        hviVarArr[0] = hso.f(g, IOException.class, eshVar, hufVar);
                        hviVarArr[1] = string != null ? a.d().submit(new drn(context, string, 20)) : hve.a;
                        hnu.aW(hviVarArr).a(new avc(goAsync, 11), hufVar);
                    }
                }
            } catch (ClassCastException e) {
                Log.w("AccountRemovedRecv", "Invalid broadcast received: ", e);
            }
        }
    }
}
