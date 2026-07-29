package com.facebook.ads.internal.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.aiming.mdt.utils.Constants;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5175b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5176c;
    private Messenger e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5177d = false;
    private final ServiceConnection f = new ServiceConnection() { // from class: com.facebook.ads.internal.k.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f5177d = true;
            a.this.e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.setData(a.this.b());
            try {
                a.this.e.send(obtain);
            } catch (RemoteException e) {
                com.facebook.ads.internal.q.d.a.a(e, a.this.f5174a);
            }
            a.this.f5174a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                a.this.f5174a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
            a.this.e = null;
            a.this.f5177d = false;
        }
    };

    public a(Context context, String str, String str2) {
        this.f5174a = context;
        this.f5175b = str;
        this.f5176c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PROTOCOL_VERSION", 1);
        bundle.putString("PARAM_AN_UUID", this.f5176c);
        bundle.putString("PARAM_REQUEST_ID", this.f5175b);
        return bundle;
    }

    public void a() {
        Intent intent = new Intent();
        intent.setClassName(Constants.PKG_FB, "com.facebook.audiencenetwork.AudienceNetworkService");
        try {
            if (this.f5174a.bindService(intent, this.f, 1)) {
                return;
            }
            this.f5174a.unbindService(this.f);
        } catch (Exception e) {
            com.facebook.ads.internal.q.d.a.a(e, this.f5174a);
        }
    }
}
