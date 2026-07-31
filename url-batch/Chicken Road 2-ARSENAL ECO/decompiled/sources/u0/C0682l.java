package u0;

import H1.A;
import U0.t;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import b5.C0266a;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.strategylink.Row.Five.R;
import f5.C0387a;
import h4.C0409a;
import j5.InterfaceC0438a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.logging.Logger;
import n6.u;
import n6.v;
import n6.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.C0572a;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682l implements F0.b, O3.c, b4.g, v {

    /* renamed from: f, reason: collision with root package name */
    public Object f5989f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5990g;

    public /* synthetic */ C0682l(Object obj) {
        this.f5990g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(C0682l c0682l, JSONArray jSONArray) {
        String str;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            for (int i10 : N.p.d(4)) {
                if (i10 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i10 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i10 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i10 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int c7 = N.p.c(i10);
                    if (c7 == 0) {
                        i7 |= 1;
                    } else if (c7 == 1) {
                        i7 |= 4;
                    } else if (c7 == 2) {
                        i7 |= 2;
                    } else if (c7 == 3) {
                        i7 |= 8;
                    }
                    if (i8 == 0) {
                        i8 = i7;
                    }
                }
            }
            throw new NoSuchFieldException(C1.c.h("No such DeviceOrientation: ", string));
        }
        if (i7 == 0) {
            return -1;
        }
        switch (i7) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i8 == 2) {
                    return 0;
                }
                if (i8 != 4) {
                    return i8 != 8 ? 1 : 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
        }
    }

    public static ArrayList e(C0682l c0682l, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            for (N3.f fVar : N3.f.values()) {
                if (fVar.f1697f.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(N3.f.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(N3.f.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(C1.c.h("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int f(C0682l c0682l, String str) {
        String str2;
        for (int i7 : N.p.d(4)) {
            if (i7 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i7 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i7 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i7 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int c7 = N.p.c(i7);
                if (c7 == 0) {
                    return 1;
                }
                if (c7 != 1) {
                    return c7 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(C1.c.h("No such SystemUiMode: ", str));
    }

    public static N3.e g(C0682l c0682l, JSONObject jSONObject) {
        return new N3.e(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? C1.c.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : C1.c.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    @Override // n6.v
    public u b() {
        return (b6.g) this.f5989f;
    }

    @Override // b4.g
    public b4.f build() {
        return (R4.l) ((A) this.f5989f).a(V3.a.f2706i, (String) this.f5990g);
    }

    @Override // n6.v
    public w c() {
        return (b6.h) this.f5990g;
    }

    @Override // O3.c
    public void d(ByteBuffer byteBuffer, F3.f fVar) {
        B0.c cVar = (B0.c) this.f5990g;
        O3.j jVar = (O3.j) cVar.f73i;
        try {
            ((O3.i) this.f5989f).g(jVar.g(byteBuffer), new N3.j(this, 1, fVar));
        } catch (RuntimeException e4) {
            Log.e("MethodChannel#" + ((String) cVar.f71g), "Failed to handle method call", e4);
            fVar.a(jVar.d(e4.getMessage(), Log.getStackTraceString(e4)));
        }
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        U0.h hVar = new U0.h(4);
        R0.g gVar = new R0.g();
        Object obj = ((InterfaceC0438a) this.f5989f).get();
        InterfaceC0438a interfaceC0438a = (InterfaceC0438a) this.f5990g;
        return new K0.h(hVar, gVar, K0.a.f1343f, (K0.j) obj, interfaceC0438a);
    }

    public N4.d h() {
        Logger logger = g5.h.f4296i;
        g5.i iVar = new g5.i();
        g5.h hVar = new g5.h(iVar.f4302b, iVar.f4303c, iVar.f4304d, iVar.f4305e, iVar.f4306f, iVar.f4301a, iVar.f4307g.a());
        Logger logger2 = W4.w.f2841m;
        C0387a c0387a = C0387a.f4248c;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        W4.w wVar = new W4.w(new ArrayList(), identityHashMap, arrayList, c0387a, C0266a.f3620a, new Q4.j(0).a());
        R4.n nVar = (R4.n) this.f5990g;
        if (nVar == null) {
            Logger logger3 = R4.n.f2127j;
            ArrayList arrayList2 = new ArrayList();
            C0387a c0387a2 = C0387a.f4248c;
            C4.d dVar = new C4.d(10);
            ArrayList arrayList3 = new ArrayList();
            Q4.f.getDefault();
            nVar = new R4.n(c0387a2, dVar, arrayList2, new Q4.i(arrayList3));
        }
        return new N4.d(hVar, wVar, nVar, (C0409a) this.f5989f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory i(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f5990g) == null) {
            Context context = (Context) this.f5989f;
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
                    this.f5990g = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f5990g = map;
        }
        String str4 = (String) ((Map) this.f5990g).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e4) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e4);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e8) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e8);
            return null;
        } catch (NoSuchMethodException e9) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e9);
            return null;
        } catch (InvocationTargetException e10) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e10);
            return null;
        }
    }

    public File j() {
        if (((File) this.f5989f) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f5989f) == null) {
                        m1.g gVar = (m1.g) this.f5990g;
                        gVar.a();
                        this.f5989f = new File(gVar.f5425a.getFilesDir(), "PersistedInstallation." + ((m1.g) this.f5990g).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f5989f;
    }

    public String k(String str) {
        String str2 = (String) this.f5990g;
        Resources resources = (Resources) this.f5989f;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void l(C1.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f189a);
            jSONObject.put("Status", N.p.c(aVar.f190b));
            jSONObject.put("AuthToken", aVar.f191c);
            jSONObject.put("RefreshToken", aVar.f192d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f194f);
            jSONObject.put("ExpiresInSecs", aVar.f193e);
            jSONObject.put("FisError", aVar.f195g);
            m1.g gVar = (m1.g) this.f5990g;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f5425a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(j())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public C1.a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
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
        int i7 = N.p.d(5)[optInt];
        if (i7 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i7 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C1.a(optString, i7, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void n(int i7, int i8, int i9, int i10) {
        C0572a c0572a = (C0572a) this.f5990g;
        c0572a.f5639i.set(i7, i8, i9, i10);
        Rect rect = c0572a.f5638h;
        super/*android.view.View*/.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
    }

    public /* synthetic */ C0682l(Object obj, Object obj2) {
        this.f5989f = obj;
        this.f5990g = obj2;
    }

    public C0682l(Context context, int i7) {
        switch (i7) {
            case 8:
                t.f(context);
                Resources resources = context.getResources();
                this.f5989f = resources;
                this.f5990g = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.f5990g = null;
                this.f5989f = context;
                break;
        }
    }

    public C0682l(U.a aVar) {
        this.f5989f = new b6.g(aVar, ((c6.f) aVar.f2485e).f().b(), -1L);
        this.f5990g = new b6.h(aVar, ((c6.f) aVar.f2485e).f().c(), -1L);
    }
}
