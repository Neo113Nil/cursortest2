package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cqm implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final cqi e;
    public ComponentName f;
    final /* synthetic */ cqj g;

    public cqm(cqj cqjVar, cqi cqiVar) {
        this.g = cqjVar;
        this.e = cqiVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, new cql(serviceConnection2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011a A[Catch: all -> 0x0141, TryCatch #1 {all -> 0x0141, blocks: (B:10:0x00d7, B:15:0x0103, B:18:0x010d, B:19:0x0116, B:21:0x011a, B:25:0x012b, B:27:0x012e, B:28:0x0131, B:32:0x0112, B:33:0x00e4, B:35:0x00e8, B:38:0x00f8), top: B:9:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #1 {all -> 0x0141, blocks: (B:10:0x00d7, B:15:0x0103, B:18:0x010d, B:19:0x0116, B:21:0x011a, B:25:0x012b, B:27:0x012e, B:28:0x0131, B:32:0x0112, B:33:0x00e4, B:35:0x00e8, B:38:0x00f8), top: B:9:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d A[Catch: cra -> 0x0147, TryCatch #5 {cra -> 0x0147, blocks: (B:3:0x0004, B:5:0x0011, B:44:0x001e, B:46:0x0022, B:48:0x002c, B:54:0x003e, B:58:0x007d, B:61:0x00af, B:62:0x0064, B:65:0x006f, B:68:0x0088, B:69:0x00ab, B:50:0x0047, B:51:0x004e, B:72:0x0043, B:73:0x0046, B:75:0x0052), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final clg d(Executor executor) {
        Intent intent;
        Bundle bundle;
        Intent intent2;
        ContentProviderClient acquireUnstableContentProviderClient;
        boolean z;
        clg clgVar;
        try {
            Context context = this.g.c;
            cqi cqiVar = this.e;
            Uri uri = crf.a;
            String str = cqiVar.a;
            if (str == null) {
                intent = new Intent().setComponent(cqiVar.c);
            } else {
                if (cqiVar.e) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("serviceActionBundleKey", str);
                    try {
                        acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(crf.a);
                    } catch (RemoteException | IllegalArgumentException e) {
                        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundle = null;
                    }
                    if (acquireUnstableContentProviderClient == null) {
                        throw new RemoteException("Failed to acquire ContentProviderClient");
                    }
                    try {
                        bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                        acquireUnstableContentProviderClient.release();
                        if (bundle != null) {
                            intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                            if (intent2 == null) {
                                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                                if (pendingIntent != null) {
                                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                                    throw new cra(new clg(1, 25, pendingIntent, null, null));
                                }
                            } else {
                                if (intent2 == null) {
                                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                                }
                                intent = intent2;
                            }
                        }
                        intent2 = null;
                        if (intent2 == null) {
                        }
                        intent = intent2;
                    } catch (Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                } else {
                    intent = null;
                }
                if (intent == null) {
                    intent = new Intent(str).setPackage(cqiVar.b);
                }
            }
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(csp.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                cqj cqjVar = this.g;
                Context context2 = cqjVar.c;
                cqi cqiVar2 = this.e;
                ComponentName component = intent.getComponent();
                if (component != null) {
                    try {
                        z = false;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if ((csr.b(context2).b(component.getPackageName(), 0).flags & 2097152) != 0) {
                        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                        this.c = z;
                        if (z) {
                            this.b = 2;
                            try {
                                csi.a(context2, this);
                            } catch (IllegalArgumentException unused2) {
                            }
                            clgVar = new clg(1, 16, null, null, null);
                        } else {
                            cqjVar.d.sendMessageDelayed(cqjVar.d.obtainMessage(1, cqiVar2), cqjVar.e);
                            clgVar = clg.a;
                        }
                        return clgVar;
                    }
                }
                if (executor == null) {
                    executor = null;
                }
                z = (!csp.c() || executor == null) ? context2.bindService(intent, this, 4225) : context2.bindService(intent, 4225, executor, this);
                this.c = z;
                if (z) {
                }
                return clgVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (cra e2) {
            return e2.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cqj cqjVar = this.g;
        synchronized (cqjVar.b) {
            cqjVar.d.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cqj cqjVar = this.g;
        synchronized (cqjVar.b) {
            cqjVar.d.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
