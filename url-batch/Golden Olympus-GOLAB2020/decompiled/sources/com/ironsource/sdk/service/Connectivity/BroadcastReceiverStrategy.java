package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.Cif;
import com.ironsource.jf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.y8;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BroadcastReceiverStrategy implements Cif {

    /* renamed from: a, reason: collision with root package name */
    private final jf f19545a;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f19546b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b4 = y8.b(context);
            if (b4.equals("none")) {
                BroadcastReceiverStrategy.this.f19545a.a();
            } else {
                BroadcastReceiverStrategy.this.f19545a.a(b4, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(jf jfVar) {
        this.f19545a = jfVar;
    }

    @Override // com.ironsource.Cif
    public void b(Context context) {
        try {
            context.registerReceiver(this.f19546b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.Cif
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.Cif
    public void a() {
        this.f19546b = null;
    }

    @Override // com.ironsource.Cif
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f19546b);
        } catch (IllegalArgumentException e4) {
            o9.d().a(e4);
        } catch (Exception e5) {
            o9.d().a(e5);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e5);
        }
    }
}
