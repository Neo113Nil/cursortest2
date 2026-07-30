package P0;

import D5.x;
import I.T;
import I.Y;
import P.C0152q;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.attribution.RequestError;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import g2.C0448b;
import h0.C0465k;
import i.C0511M;
import i.C0533t;
import i.LayoutInflaterFactory2C0500B;
import j4.C0573b;
import j4.C0578g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0646b;
import l.InterfaceC0645a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C0822e;
import x5.C1020j;
import x5.InterfaceC1017g;
import y4.C1046o;

/* loaded from: classes.dex */
public final class e implements InterfaceC0645a, q6.d, s4.c, x4.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2193d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2194e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2195i;

    public /* synthetic */ e(int i2, Object obj, Object obj2, boolean z7) {
        this.f2193d = i2;
        this.f2194e = obj;
        this.f2195i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(e eVar, JSONArray jSONArray) {
        String str;
        int i2 = 0;
        int i5 = 0;
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            for (int i8 : S.i.c(4)) {
                if (i8 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i8 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i8 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i8 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b7 = S.i.b(i8);
                    if (b7 == 0) {
                        i2 |= 1;
                    } else if (b7 == 1) {
                        i2 |= 4;
                    } else if (b7 == 2) {
                        i2 |= 2;
                    } else if (b7 == 3) {
                        i2 |= 8;
                    }
                    if (i5 == 0) {
                        i5 = i2;
                    }
                }
            }
            throw new NoSuchFieldException(r4.f.i("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i5 == 2) {
                    return 0;
                }
                if (i5 != 4) {
                    return i5 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 10:
                return 11;
            case RequestError.STOP_TRACKING /* 11 */:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList i(e eVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            for (r4.g gVar : r4.g.values()) {
                if (gVar.f7471d.equals(string)) {
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(r4.g.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(r4.g.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(r4.f.i("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int j(e eVar, String str) {
        String str2;
        for (int i2 : S.i.c(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b7 = S.i.b(i2);
                if (b7 == 0) {
                    return 1;
                }
                if (b7 != 1) {
                    return b7 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(r4.f.i("No such SystemUiMode: ", str));
    }

    public static S1.a k(e eVar, JSONObject jSONObject) {
        return new S1.a(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? C4.p.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : C4.p.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    @Override // x4.n
    public void a(Exception exc) {
        ((e) this.f2195i).g(d4.c.N(exc));
    }

    @Override // l.InterfaceC0645a
    public boolean b(AbstractC0646b abstractC0646b, Menu menu) {
        return ((InterfaceC0645a) this.f2194e).b(abstractC0646b, menu);
    }

    @Override // l.InterfaceC0645a
    public boolean c(AbstractC0646b abstractC0646b, MenuItem menuItem) {
        return ((InterfaceC0645a) this.f2194e).c(abstractC0646b, menuItem);
    }

    @Override // l.InterfaceC0645a
    public boolean d(AbstractC0646b abstractC0646b, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0500B) this.f2195i).f5313I;
        WeakHashMap weakHashMap = T.f1153a;
        viewGroup.requestApplyInsets();
        return ((InterfaceC0645a) this.f2194e).d(abstractC0646b, menu);
    }

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        switch (this.f2193d) {
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                Object e7 = ((l) this.f2194e).e(new q6.l(new B(), eVar, (C0152q) this.f2195i), bVar);
                if (e7 != W5.a.f2787d) {
                    break;
                }
                break;
            default:
                Object e8 = ((q6.d) this.f2194e).e(new C1046o(eVar, (T.d) this.f2195i, 0), bVar);
                if (e8 != W5.a.f2787d) {
                    break;
                }
                break;
        }
        return Unit.f6114a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [i.m, java.lang.Object] */
    @Override // l.InterfaceC0645a
    public void f(AbstractC0646b abstractC0646b) {
        ((InterfaceC0645a) this.f2194e).f(abstractC0646b);
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) this.f2195i;
        if (layoutInflaterFactory2C0500B.f5309E != null) {
            layoutInflaterFactory2C0500B.f5347t.getDecorView().removeCallbacks(layoutInflaterFactory2C0500B.f5310F);
        }
        if (layoutInflaterFactory2C0500B.f5308D != null) {
            Y y7 = layoutInflaterFactory2C0500B.f5311G;
            if (y7 != null) {
                y7.b();
            }
            Y a7 = T.a(layoutInflaterFactory2C0500B.f5308D);
            a7.a(0.0f);
            layoutInflaterFactory2C0500B.f5311G = a7;
            a7.d(new C0533t(2, this));
        }
        layoutInflaterFactory2C0500B.f5349v.onSupportActionModeFinished(layoutInflaterFactory2C0500B.f5307C);
        layoutInflaterFactory2C0500B.f5307C = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0500B.f5313I;
        WeakHashMap weakHashMap = T.f1153a;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C0500B.J();
    }

    @Override // s4.c
    public void g(Object obj) {
        switch (this.f2193d) {
            case 10:
                D0.j jVar = (D0.j) this.f2195i;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) jVar.f330e;
                r4.m mVar = (r4.m) this.f2194e;
                concurrentLinkedQueue.remove(mVar);
                if (!((ConcurrentLinkedQueue) jVar.f330e).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + mVar.f7503a);
                    break;
                }
                break;
            default:
                ((C0578g) this.f2194e).a(((s4.m) ((i) ((l) this.f2195i).f2210i).f2202c).a(obj));
                break;
        }
    }

    public void l(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        ((ArrayList) this.f2194e).add(sb.toString());
    }

    public u5.d m() {
        Logger logger = N5.h.f1851l;
        N5.i iVar = new N5.i();
        N5.h hVar = new N5.h(iVar.f1857b, iVar.f1858c, iVar.f1859d, iVar.f1860e, iVar.f1861f, iVar.f1856a, iVar.f1862g.r());
        Logger logger2 = x.f399p;
        M5.a aVar = M5.a.f1769c;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        x xVar = new x(new ArrayList(), identityHashMap, arrayList, aVar, I5.a.f1290a, new C0511M(24).r());
        y5.m mVar = (y5.m) this.f2195i;
        if (mVar == null) {
            Logger logger3 = y5.m.f8696m;
            ArrayList arrayList2 = new ArrayList();
            M5.a aVar2 = M5.a.f1769c;
            G3.a aVar3 = new G3.a(12);
            ArrayList arrayList3 = new ArrayList();
            InterfaceC1017g.getDefault();
            mVar = new y5.m(aVar2, aVar3, arrayList2, new C1020j(arrayList3));
        }
        return new u5.d(hVar, xVar, mVar, (O4.a) this.f2194e);
    }

    public boolean n(j id) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2194e) {
            containsKey = ((LinkedHashMap) this.f2195i).containsKey(id);
        }
        return containsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory p(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f2195i) == null) {
            Context context = (Context) this.f2194e;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
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
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f2195i = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f2195i = map;
        }
        String str4 = (String) ((Map) this.f2195i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e7) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e7);
            return null;
        } catch (IllegalAccessException e8) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e8);
            return null;
        } catch (InstantiationException e9) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e9);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        }
    }

    public File q() {
        if (((File) this.f2194e) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2194e) == null) {
                        String str = "PersistedInstallation." + ((P1.g) this.f2195i).g() + ".json";
                        P1.g gVar = (P1.g) this.f2195i;
                        gVar.a();
                        File file = new File(gVar.f2270a.getNoBackupFilesDir(), str);
                        this.f2194e = file;
                        if (file.exists()) {
                            return (File) this.f2194e;
                        }
                        P1.g gVar2 = (P1.g) this.f2195i;
                        gVar2.a();
                        File file2 = new File(gVar2.f2270a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f2194e)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f2194e;
    }

    public Long r(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.f2194e;
        C0465k g7 = C0465k.g(1, "SELECT long_value FROM Preference where `key`=?");
        g7.f(1, str);
        workDatabase.b();
        Cursor J7 = V6.b.J(workDatabase, g7);
        try {
            Long l7 = null;
            if (J7.moveToFirst() && !J7.isNull(0)) {
                l7 = Long.valueOf(J7.getLong(0));
            }
            return l7;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public void s(C0448b c0448b) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0448b.f5020a);
            jSONObject.put("Status", S.i.b(c0448b.f5021b));
            jSONObject.put("AuthToken", c0448b.f5022c);
            jSONObject.put("RefreshToken", c0448b.f5023d);
            jSONObject.put("TokenCreationEpochInSecs", c0448b.f5025f);
            jSONObject.put("ExpiresInSecs", c0448b.f5024e);
            jSONObject.put("FisError", c0448b.f5026g);
            P1.g gVar = (P1.g) this.f2195i;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f2270a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(q())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // x4.n
    public void success(Object obj) {
        ArrayList arrayList = (ArrayList) this.f2194e;
        arrayList.add(0, (x4.f) obj);
        ((e) this.f2195i).g(arrayList);
    }

    public void t(d dVar) {
        WorkDatabase workDatabase = (WorkDatabase) this.f2194e;
        workDatabase.b();
        workDatabase.c();
        try {
            ((b) this.f2195i).f(dVar);
            workDatabase.o();
        } finally {
            workDatabase.k();
        }
    }

    public String toString() {
        switch (this.f2193d) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f2195i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f2194e;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0448b u() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(q());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i2 = C0448b.f5019h;
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        int i5 = S.i.c(5)[optInt];
        if (i5 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b8 = (byte) (((byte) (b7 | 2)) | 1);
        if (b8 == 3 && i5 != 0) {
            return new C0448b(optString, i5, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i5 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b8 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b8 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public H0.j v(j id) {
        H0.j jVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2194e) {
            jVar = (H0.j) ((LinkedHashMap) this.f2195i).remove(id);
        }
        return jVar;
    }

    public List w(String workSpecId) {
        List z7;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f2194e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2195i;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.a(((j) entry.getKey()).f2204a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f2195i).remove((j) it.next());
                }
                z7 = CollectionsKt.z(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public H0.j x(j id) {
        H0.j jVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2194e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2195i;
                Object obj = linkedHashMap.get(id);
                if (obj == null) {
                    obj = new H0.j(id);
                    linkedHashMap.put(id, obj);
                }
                jVar = (H0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public /* synthetic */ e(int i2, boolean z7) {
        this.f2193d = i2;
    }

    public /* synthetic */ e(Object obj, int i2, Object obj2) {
        this.f2193d = i2;
        this.f2195i = obj;
        this.f2194e = obj2;
    }

    public e(IBinder iBinder) {
        this.f2193d = 7;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2194e = new Messenger(iBinder);
            this.f2195i = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f2195i = new C0822e(iBinder);
            this.f2194e = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f2193d = 12;
        this.f2195i = obj;
        this.f2194e = new ArrayList();
    }

    public e(WorkDatabase workDatabase) {
        this.f2193d = 0;
        this.f2194e = workDatabase;
        this.f2195i = new b(workDatabase);
    }

    public e(int i2) {
        this.f2193d = i2;
        switch (i2) {
            case 2:
                this.f2194e = new C4.d(0);
                break;
            default:
                this.f2194e = new Object();
                this.f2195i = new LinkedHashMap();
                break;
        }
    }

    public e(P1.g gVar) {
        this.f2193d = 5;
        this.f2195i = gVar;
    }

    public e(Context context) {
        this.f2193d = 4;
        this.f2195i = null;
        this.f2194e = context;
    }

    public e(C0573b c0573b) {
        this.f2193d = 9;
        l4.b bVar = new l4.b(10, this);
        s4.q qVar = new s4.q(c0573b, "flutter/platform", s4.l.f7766a);
        this.f2194e = qVar;
        qVar.b(bVar);
    }
}
