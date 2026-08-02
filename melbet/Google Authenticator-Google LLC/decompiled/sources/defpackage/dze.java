package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dze {
    public final Object a;
    public Object b;

    public dze(dpo dpoVar) {
        this.a = new CopyOnWriteArrayList();
        this.b = dpoVar;
    }

    public final dqu a() {
        Object obj = this.b;
        if (obj != null) {
            return new dqu((gzp) this.a, (dih) obj);
        }
        throw new IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public final void b(dpq dpqVar) {
        ((CopyOnWriteArrayList) this.a).add(dpqVar);
    }

    public final void c(dpq dpqVar) {
        ((CopyOnWriteArrayList) this.a).remove(dpqVar);
    }

    public final void d(dpo dpoVar) {
        if (iwo.b(dpoVar, this.b)) {
            return;
        }
        this.b = dpoVar;
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ((dpq) it.next()).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cew e(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (this.b == null) {
            Object obj = this.a;
            try {
                packageManager = ((Context) obj).getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName((Context) obj, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj2 = bundle.get(str2);
                            if ((obj2 instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj2).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.b = map;
        }
        String str4 = (String) this.b.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (cew) Class.forName(str4).asSubclass(cew.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
            return null;
        }
    }

    public dze(Context context) {
        this.b = null;
        this.a = context;
    }

    public dze(Object obj) {
        this.a = obj;
    }

    public dze(byte[] bArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public dze() {
        this.a = gyf.a;
    }
}
