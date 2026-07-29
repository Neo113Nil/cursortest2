package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class ImprintHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9149a = "ImprintHandler";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9151c = ".imprint";
    private static Context k;
    private com.umeng.commonsdk.statistics.internal.d e;
    private a h = new a();
    private com.umeng.commonsdk.statistics.proto.d i = null;

    /* renamed from: b, reason: collision with root package name */
    private static Object f9150b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9152d = "pbl0".getBytes();
    private static Map<String, ArrayList<UMImprintChangeCallback>> f = new HashMap();
    private static Object g = new Object();
    private static ImprintHandler j = null;

    private ImprintHandler(Context context) {
        k = context.getApplicationContext();
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (j == null) {
                j = new ImprintHandler(context);
                j.e();
            }
            imprintHandler = j;
        }
        return imprintHandler;
    }

    private static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (g) {
            try {
                int i = 0;
                if (f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f.get(str);
                    int size = arrayList.size();
                    com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i < size) {
                        if (uMImprintChangeCallback == arrayList.get(i)) {
                            com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i)) {
                            com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    com.umeng.commonsdk.statistics.common.d.c("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(k, th);
            }
        }
    }

    private static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (g) {
            try {
                if (f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f.get(str);
                    if (uMImprintChangeCallback != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        com.umeng.commonsdk.statistics.common.d.c("--->>> removeCallback: before remove: callbacks size is: " + size);
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (uMImprintChangeCallback == arrayList.get(i)) {
                                com.umeng.commonsdk.statistics.common.d.c("--->>> removeCallback: remove index " + i);
                                arrayList.remove(i);
                                break;
                            }
                            i++;
                        }
                        com.umeng.commonsdk.statistics.common.d.c("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            com.umeng.commonsdk.statistics.common.d.c("--->>> removeCallback: remove key from map: key = " + str);
                            f.remove(str);
                        }
                    }
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(k, th);
            }
        }
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        a(str, uMImprintChangeCallback);
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        b(str, uMImprintChangeCallback);
    }

    public void a(com.umeng.commonsdk.statistics.internal.d dVar) {
        this.e = dVar;
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                sb.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).b());
            }
            sb.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).e());
            sb.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).h());
        }
        sb.append(dVar.f9242b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
        if (!dVar.i().equals(a(dVar))) {
            return false;
        }
        for (com.umeng.commonsdk.statistics.proto.e eVar : dVar.c().values()) {
            byte[] reverseHexString = DataHelper.reverseHexString(eVar.h());
            byte[] a2 = a(eVar);
            for (int i = 0; i < 4; i++) {
                if (reverseHexString[i] != a2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.e());
        byte[] array = allocate.array();
        byte[] bArr = f9152d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (array[i] ^ bArr[i]);
        }
        return bArr2;
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        com.umeng.commonsdk.statistics.proto.d a2;
        boolean z;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.d("Imprint is null");
                return;
            }
            return;
        }
        if (!c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e("Imprint is not valid");
                return;
            }
            return;
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.d("Imprint is ok");
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            com.umeng.commonsdk.statistics.proto.d dVar2 = this.i;
            String str = null;
            String i = dVar2 == null ? null : dVar2.i();
            if (dVar2 == null) {
                a2 = d(dVar);
            } else {
                a2 = a(dVar2, dVar, hashMap);
            }
            this.i = a2;
            if (a2 != null) {
                str = a2.i();
            }
            z = !a(i, str);
        }
        if (this.i != null) {
            boolean z2 = AnalyticsConstants.UM_DEBUG;
            if (z) {
                this.h.a(this.i);
                if (this.e != null) {
                    this.e.onImprintChanged(this.h);
                }
            }
        }
        if (hashMap.size() > 0) {
            synchronized (g) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && f.containsKey(key)) {
                        com.umeng.commonsdk.statistics.common.d.c("--->>> target imprint key is: " + key + "; value is: " + value);
                        ArrayList<UMImprintChangeCallback> arrayList = f.get(key);
                        if (arrayList != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                arrayList.get(i2).onImprintValueChanged(key, value);
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map<String, String> map) {
        if (dVar2 == null) {
            return dVar;
        }
        Map<String, com.umeng.commonsdk.statistics.proto.e> c2 = dVar.c();
        for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar2.c().entrySet()) {
            if (entry.getValue().d()) {
                c2.put(entry.getKey(), entry.getValue());
                synchronized (g) {
                    String key = entry.getKey();
                    String str = entry.getValue().f9249a;
                    if (!TextUtils.isEmpty(key) && f.containsKey(key) && f.get(key) != null) {
                        map.put(key, str);
                    }
                }
            } else {
                String key2 = entry.getKey();
                c2.remove(key2);
                this.h.a(key2);
            }
        }
        dVar.a(dVar2.f());
        dVar.a(a(dVar));
        return dVar;
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.e> c2 = dVar.c();
        ArrayList arrayList = new ArrayList(c2.size() / 2);
        for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : c2.entrySet()) {
            if (!entry.getValue().d()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2.remove((String) it.next());
        }
        return dVar;
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d a() {
        return this.i;
    }

    public a b() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e() {
        ?? r2;
        File filesDir = k.getFilesDir();
        String str = f9151c;
        File file = new File(filesDir, f9151c);
        synchronized (f9150b) {
            if (file.exists()) {
                ?? r0 = null;
                byte[] bArr = null;
                try {
                    try {
                        r2 = k.openFileInput(f9151c);
                        try {
                            byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(r2);
                            HelperUtils.safeClose((InputStream) r2);
                            bArr = readStreamToByteArray;
                            str = r2;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            HelperUtils.safeClose((InputStream) r2);
                            str = r2;
                            if (bArr != null) {
                            }
                        }
                    } catch (Throwable th) {
                        String str2 = str;
                        th = th;
                        r0 = str2;
                        HelperUtils.safeClose((InputStream) r0);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    r2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose((InputStream) r0);
                    throw th;
                }
                if (bArr != null) {
                    try {
                        com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                        new com.umeng.commonsdk.proguard.l().a(dVar, bArr);
                        this.i = dVar;
                        this.h.a(dVar);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    public void c() {
        if (this.i == null) {
            return;
        }
        try {
            synchronized (f9150b) {
                byte[] a2 = new com.umeng.commonsdk.proguard.r().a(this.i);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(k.getFilesDir(), f9151c));
                try {
                    fileOutputStream.write(a2);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean d() {
        return new File(k.getFilesDir(), f9151c).delete();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, String> f9153a = new HashMap();

        a() {
        }

        public synchronized void a(String str) {
            if (this.f9153a != null && this.f9153a.size() > 0 && !TextUtils.isEmpty(str) && this.f9153a.containsKey(str)) {
                this.f9153a.remove(str);
            }
        }

        a(com.umeng.commonsdk.statistics.proto.d dVar) {
            a(dVar);
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
            if (dVar == null) {
                return;
            }
            b(dVar);
        }

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d dVar) {
            com.umeng.commonsdk.statistics.proto.e eVar;
            if (dVar != null) {
                if (dVar.e()) {
                    Map<String, com.umeng.commonsdk.statistics.proto.e> c2 = dVar.c();
                    for (String str : c2.keySet()) {
                        if (!TextUtils.isEmpty(str) && (eVar = c2.get(str)) != null) {
                            String b2 = eVar.b();
                            if (!TextUtils.isEmpty(b2)) {
                                this.f9153a.put(str, b2);
                                if (AnalyticsConstants.UM_DEBUG) {
                                    Log.i(ImprintHandler.f9149a, "imKey is " + str + ", imValue is " + b2);
                                }
                            }
                        }
                    }
                }
            }
        }

        public synchronized String a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f9153a.size() > 0) {
                String str3 = this.f9153a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }
}
