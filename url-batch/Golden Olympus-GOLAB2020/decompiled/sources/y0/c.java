package y0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.agconnect.core.ServiceDiscovery;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.InterfaceC3512a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46727a;

    private static class b implements Serializable, Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((Integer) entry.getValue()).intValue() - ((Integer) entry2.getValue()).intValue();
        }
    }

    c(Context context) {
        this.f46727a = context;
    }

    private InterfaceC3512a b(String str) {
        StringBuilder sb;
        String sb2;
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC3512a.class.isAssignableFrom(cls)) {
                android.support.v4.media.session.b.a(Class.forName(str).newInstance());
                return null;
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e4) {
            sb2 = "Can not found service class, " + e4.getMessage();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (IllegalAccessException e5) {
            e = e5;
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (InstantiationException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        }
    }

    private List c() {
        int i4;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Bundle d4 = d();
        if (d4 != null) {
            HashMap hashMap = new HashMap(10);
            Iterator<String> it = d4.keySet().iterator();
            while (true) {
                i4 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(d4.getString(next))) {
                    String[] split = next.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length == 2) {
                        try {
                            hashMap.put(split[0], Integer.valueOf(split[1]));
                        } catch (NumberFormatException e4) {
                            sb = new StringBuilder();
                            sb.append("registrar configuration format error:");
                            next = e4.getMessage();
                        }
                    } else if (split.length == 1) {
                        hashMap.put(split[0], 1000);
                    } else {
                        sb = new StringBuilder();
                        sb.append("registrar configuration error, ");
                        sb.append(next);
                        Log.e("AGC_Registrar", sb.toString());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new b());
            int size = arrayList2.size();
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                arrayList.add(((Map.Entry) obj).getKey());
            }
        }
        return arrayList;
    }

    private Bundle d() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.f46727a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f46727a, (Class<?>) ServiceDiscovery.class), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e4.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }

    public List a() {
        Log.i("AGC_Registrar", "getServices");
        List c4 = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = c4.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
        Log.i("AGC_Registrar", "services:" + arrayList.size());
        return arrayList;
    }
}
