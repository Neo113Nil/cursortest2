package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.ect;
import defpackage.esd;
import defpackage.ese;
import defpackage.hnu;
import defpackage.huf;
import defpackage.hvi;
import defpackage.jkd;
import defpackage.jkp;
import defpackage.jld;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                esd esdVar = (esd) jkp.v(esd.a, byteArrayExtra, jkd.a());
                BroadcastReceiver.PendingResult goAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((ese) declaredConstructor.newInstance(null)).a(context, esdVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                hvi aO = hnu.aO(arrayList);
                goAsync.getClass();
                aO.c(new ect(goAsync, 15), huf.a);
            } catch (jld e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
