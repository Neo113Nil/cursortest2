package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yw implements ev, mr0, c00, tw, uf, at0 {
    public static final Object h = new Object();
    public static fq1 i;
    public final /* synthetic */ int d;
    public Object e;
    public Object g;

    public yw(int i2) {
        this.d = i2;
        switch (i2) {
            case 19:
                this.e = new zm1(0);
                this.g = new zm1(0);
                break;
            case 21:
                this.e = new vn0();
                this.g = new vn0();
                break;
            case 23:
                this.e = new eo0(new jd0[16]);
                break;
            case 29:
                this.e = new LinkedHashMap();
                this.g = new LinkedHashMap();
                break;
        }
    }

    public static yw e(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e2) {
            e = e2;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new yw(fileChannel, 7, fileLock);
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    public static Task h(Context context, Intent intent, boolean z) {
        fq1 fq1Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (h) {
            try {
                if (i == null) {
                    i = new fq1(context);
                }
                fq1Var = i;
            } finally {
            }
        }
        if (!z) {
            return fq1Var.b(intent).f(new kz0(), new af(18));
        }
        if (o91.i().p(context)) {
            synchronized (op.o) {
                try {
                    op.s(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        op.p.a();
                    }
                    fq1Var.b(intent).addOnCompleteListener(new m2(4, intent));
                } finally {
                }
            }
        } else {
            fq1Var.b(intent);
        }
        return t80.p(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void j(jd0 jd0Var) {
        if (jd0Var.T > 0) {
            if (jd0Var.K.d == fd0.i && !jd0Var.o() && !jd0Var.p() && !jd0Var.U && jd0Var.G()) {
                zl0 zl0Var = (zl0) jd0Var.J.g;
                if ((zl0Var.h & 256) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 256) != 0) {
                            zq zqVar = zl0Var;
                            ?? r5 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof u40) {
                                    u40 u40Var = (u40) zqVar;
                                    u40Var.n(op.G(u40Var, 256));
                                } else if ((zqVar.g & 256) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i2 = 0;
                                    zqVar = zqVar;
                                    r5 = r5;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 256) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r5.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r5.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zqVar = op.o(r5);
                            }
                        }
                        if ((zl0Var.h & 256) == 0) {
                            break;
                        } else {
                            zl0Var = zl0Var.j;
                        }
                    }
                }
            }
            jd0Var.S = false;
            eo0 x = jd0Var.x();
            Object[] objArr = x.d;
            int i3 = x.g;
            for (int i4 = 0; i4 < i3; i4++) {
                j((jd0) objArr[i4]);
            }
        }
    }

    @Override // defpackage.ev
    public Object a() {
        return (hl1) this.e;
    }

    @Override // defpackage.ev
    public boolean b(CharSequence charSequence, int i2, int i3, yj1 yj1Var) {
        if ((yj1Var.c & 4) > 0) {
            return true;
        }
        if (((hl1) this.e) == null) {
            this.e = new hl1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((a60) this.g).getClass();
        ((hl1) this.e).setSpan(new zj1(yj1Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.at0
    public List c(Integer num) {
        List c = ((at0) this.e).c(null);
        db1 db1Var = (db1) this.g;
        int i2 = db1Var.v;
        return i2 < 0 ? c : CollectionsKt.u(uq1.x(db1Var, num, i2, Integer.valueOf(db1Var.E(db1Var.b, i2))), c);
    }

    @Override // defpackage.uf
    public void cancel() {
        if (((ha) this.g).compareAndSet(1, 1)) {
            return;
        }
        ((kc) this.e).invoke();
    }

    @Override // defpackage.mr0
    public void d(Exception exc) {
        tf tfVar = (tf) this.e;
        if (tfVar.v() instanceof yp0) {
            Context context = ((rz) this.g).a;
            context.getClass();
            String str = null;
            String string = context.getApplicationContext().getSharedPreferences("feather_firebase_push_token", 0).getString("push_token", null);
            if (string != null && !StringsKt.n(string)) {
                str = string;
            }
            i31 i31Var = k31.d;
            tfVar.l(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e7, code lost:
    
        if (r7.f(r8, r0) != r2) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    @Override // defpackage.c00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(d00 d00Var, dn dnVar) {
        i00 i00Var;
        int i2;
        Throwable th;
        d51 d51Var;
        xo xoVar;
        yw ywVar;
        l00 l00Var;
        int i3;
        ws wsVar;
        int i4 = 1;
        switch (this.d) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (dnVar instanceof i00) {
                    i00Var = (i00) dnVar;
                    int i5 = i00Var.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        i00Var.i = i5 - Integer.MIN_VALUE;
                        Object obj = i00Var.h;
                        tn tnVar = tn.d;
                        i2 = i00Var.i;
                        if (i2 != 0) {
                            ca0.v(obj);
                            CoroutineContext coroutineContext = i00Var.e;
                            coroutineContext.getClass();
                            d51 d51Var2 = new d51(d00Var, coroutineContext);
                            try {
                                xoVar = (xo) this.e;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                i00Var.k = this;
                                i00Var.l = d00Var;
                                i00Var.m = d51Var2;
                                i00Var.i = 1;
                                if (xoVar.b(d51Var2, i00Var) != tnVar) {
                                    ywVar = this;
                                    d51Var = d51Var2;
                                }
                                return tnVar;
                            } catch (Throwable th3) {
                                th = th3;
                                d51Var = d51Var2;
                                d51Var.m();
                                throw th;
                            }
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ca0.v(obj);
                                return Unit.a;
                            }
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d51Var = i00Var.m;
                        d00Var = i00Var.l;
                        ywVar = i00Var.k;
                        try {
                            ca0.v(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            d51Var.m();
                            throw th;
                        }
                        d51Var.m();
                        c00 c00Var = (c00) ywVar.g;
                        i00Var.k = null;
                        i00Var.l = null;
                        i00Var.m = null;
                        i00Var.i = 2;
                        break;
                    }
                }
                i00Var = new i00(this, dnVar);
                Object obj2 = i00Var.h;
                tn tnVar2 = tn.d;
                i2 = i00Var.i;
                if (i2 != 0) {
                }
                d51Var.m();
                c00 c00Var2 = (c00) ywVar.g;
                i00Var.k = null;
                i00Var.l = null;
                i00Var.m = null;
                i00Var.i = 2;
            case RequestError.STOP_TRACKING /* 11 */:
                Object f = ((c00) this.e).f(new k00(new v11(), d00Var, (Function2) this.g), dnVar);
                return f == tn.d ? f : Unit.a;
            default:
                if (dnVar instanceof l00) {
                    l00Var = (l00) dnVar;
                    int i6 = l00Var.i;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        l00Var.i = i6 - Integer.MIN_VALUE;
                        Object obj3 = l00Var.h;
                        tn tnVar3 = tn.d;
                        i3 = l00Var.i;
                        if (i3 != 0) {
                            ca0.v(obj3);
                            yw ywVar2 = (yw) this.e;
                            ws wsVar2 = new ws((yo) this.g, i4, d00Var);
                            try {
                                l00Var.k = wsVar2;
                                l00Var.i = 1;
                                if (ywVar2.f(wsVar2, l00Var) == tnVar3) {
                                    return tnVar3;
                                }
                            } catch (a e) {
                                e = e;
                                wsVar = wsVar2;
                                if (e.d != wsVar) {
                                }
                                return Unit.a;
                            }
                        } else {
                            if (i3 != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            wsVar = l00Var.k;
                            try {
                                ca0.v(obj3);
                            } catch (a e2) {
                                e = e2;
                                if (e.d != wsVar) {
                                    throw e;
                                }
                                return Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                }
                l00Var = new l00(this, dnVar);
                Object obj32 = l00Var.h;
                tn tnVar32 = tn.d;
                i3 = l00Var.i;
                if (i3 != 0) {
                }
                return Unit.a;
        }
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.e).add(str + "=" + String.valueOf(obj));
    }

    @Override // defpackage.o01
    public Object get() {
        return new ql0((Context) ((l90) this.e).d, (i8) ((s40) this.g).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory k(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.g) == null) {
            Context context = (Context) this.e;
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
                    this.g = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.g = map;
        }
        String str4 = (String) ((Map) this.g).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public File l() {
        if (((File) this.e) == null) {
            synchronized (this) {
                try {
                    if (((File) this.e) == null) {
                        ez ezVar = (ez) this.g;
                        ezVar.a();
                        this.e = new File(ezVar.a.getFilesDir(), "PersistedInstallation." + ((ez) this.g).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.e;
    }

    public void m(wb wbVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", wbVar.a);
            jSONObject.put("Status", qy0.v(wbVar.b));
            jSONObject.put("AuthToken", wbVar.c);
            jSONObject.put("RefreshToken", wbVar.d);
            jSONObject.put("TokenCreationEpochInSecs", wbVar.f);
            jSONObject.put("ExpiresInSecs", wbVar.e);
            jSONObject.put("FisError", wbVar.g);
            ez ezVar = (ez) this.g;
            ezVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", ezVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(l())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public AutofillId n(long j) {
        return ((ContentCaptureSession) this.e).newAutofillId(((View) this.g).getAutofillId(), j);
    }

    public void o(k20 k20Var) {
        w21 w21Var = (w21) this.g;
        sc1 sc1Var = (sc1) this.e;
        int i2 = k20Var.b;
        int i3 = 0;
        if (i2 == 0) {
            w21Var.execute(new lf(sc1Var, i3, k20Var.a));
        } else {
            w21Var.execute(new mf(i2, i3, sc1Var));
        }
    }

    public Task p(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.e;
        kz0 kz0Var = (kz0) this.g;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? t80.i(kz0Var, new Callable() { // from class: ww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                o91 i3 = o91.i();
                i3.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) i3.h).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (i3) {
                    try {
                        str = (String) i3.d;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        i3.d = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        i3.d = serviceInfo.name;
                                    }
                                    str = (String) i3.d;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (i3.p(context2)) {
                        startService = op.M(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i2 = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).g(kz0Var, new en() { // from class: xw
            @Override // defpackage.en
            public final Object n(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : yw.h(context, intent, z2).f(new kz0(), new af(17));
            }
        }) : h(context, intent, z2);
    }

    public wb q() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
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
        int i2 = wb.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = qy0.w(5)[optInt];
        if (i3 == 0) {
            l.b("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new wb(optString, i3, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        af.i(sb, "Missing required properties:");
        return null;
    }

    public void r() {
        try {
            ((FileLock) this.g).release();
            ((FileChannel) this.e).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void s() {
        if (((u70) this.g) != null) {
            this.g = null;
            ((eh) this.e).D0(true);
        }
    }

    public String toString() {
        switch (this.d) {
            case 2:
                return "AnimationResult(endReason=" + ((n7) this.g) + ", endState=" + ((q7) this.e) + ')';
            case 22:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.g.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.e;
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

    public /* synthetic */ yw(Object obj) {
        this.d = 22;
        this.g = obj;
        this.e = new ArrayList();
    }

    public yw(zr1 zr1Var, a60 a60Var) {
        this.d = 3;
        this.g = "ClientTelemetry.API";
        this.e = zr1Var;
    }

    public yw(kc kcVar) {
        this.d = 24;
        this.e = kcVar;
        this.g = new ha(0);
    }

    public yw(ExecutorService executorService) {
        this.d = 28;
        this.g = new s9(0);
        this.e = executorService;
    }

    public yw(Context context, int i2) {
        this.d = i2;
        switch (i2) {
            case 4:
                context.getClass();
                this.e = context;
                this.g = new s40(6, ((ro) n8.b.a(context, n8.a[0]).e).o());
                break;
            case 17:
                this.g = null;
                this.e = context;
                break;
            default:
                this.e = context;
                this.g = new kz0();
                break;
        }
    }

    public yw(ez ezVar) {
        this.d = 26;
        this.g = ezVar;
    }

    public yw(pe0 pe0Var) {
        this.d = 14;
        this.e = pe0Var;
        ln0 ln0Var = qq0.a;
        this.g = new ln0();
    }

    public /* synthetic */ yw(Object obj, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.g = obj2;
    }

    public yw(ArrayList arrayList, ArrayList arrayList2) {
        this.d = 13;
        int size = arrayList.size();
        this.e = new int[size];
        this.g = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.e)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.g)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public yw(int i2, int i3) {
        this.d = 13;
        this.e = new int[]{i2, i3};
        this.g = new float[]{0.0f, 1.0f};
    }

    public yw(int i2, int i3, int i4) {
        this.d = 13;
        this.e = new int[]{i2, i3, i4};
        this.g = new float[]{0.0f, 0.5f, 1.0f};
    }

    public yw(eh ehVar) {
        this.d = 1;
        this.e = ehVar;
    }
}
