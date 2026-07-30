package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Region;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nq0 implements ro, lz0, yn, li, c00, tm1 {
    public final /* synthetic */ int d;
    public Object e;

    public nq0(Context context) {
        boolean isEmpty;
        this.d = 13;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.e = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public static boolean B(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String F(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public long[] A() {
        JSONArray t = t("gcm.n.vibrate_timings");
        if (t == null) {
            return null;
        }
        try {
            if (t.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = t.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = t.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + t + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void C(View view, int i, boolean z) {
        ((AutofillManager) this.e).notifyViewVisibilityChanged(view, i, z);
    }

    public Bundle D() {
        Bundle bundle = (Bundle) this.e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public e30 E(yw ywVar, d4 d4Var) {
        long j;
        boolean z;
        long F;
        aj0 aj0Var = (aj0) this.e;
        List list = (List) ywVar.e;
        aj0 aj0Var2 = new aj0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            sx0 sx0Var = (sx0) list.get(i);
            long j2 = sx0Var.a;
            rx0 rx0Var = (rx0) aj0Var.b(j2);
            if (rx0Var == null) {
                j = sx0Var.b;
                F = sx0Var.d;
                z = false;
            } else {
                long j3 = rx0Var.a;
                j = j3;
                z = rx0Var.c;
                F = d4Var.F(rx0Var.b);
            }
            long j4 = sx0Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            aj0Var2.d(j4, new qx0(j4, sx0Var.b, sx0Var.d, sx0Var.e, sx0Var.f, j, F, z, sx0Var.g, sx0Var.i, sx0Var.j, sx0Var.k));
            boolean z2 = sx0Var.e;
            if (z2) {
                aj0Var.d(j2, new rx0(sx0Var.b, sx0Var.c, z2));
            } else {
                aj0Var.e(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new e30(aj0Var2, ywVar);
    }

    @Override // defpackage.tm1, defpackage.qm1
    public boolean a() {
        ((o91) this.e).getClass();
        return false;
    }

    @Override // defpackage.qm1
    public long b(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return ((o91) this.e).b(v7Var, v7Var2, v7Var3);
    }

    @Override // defpackage.ro
    public Object c(Function2 function2, dn dnVar) {
        return ((ro) this.e).c(new fy0(function2, null, 0), dnVar);
    }

    @Override // defpackage.li
    public long d() {
        return ((d41) this.e).b;
    }

    @Override // defpackage.yn
    public Object e(xn xnVar) {
        return ((eb0) this.e).invoke(xnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.c00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(d00 d00Var, dn dnVar) {
        q qVar;
        int i;
        d51 d51Var;
        if (dnVar instanceof q) {
            qVar = (q) dnVar;
            int i2 = qVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.k = i2 - Integer.MIN_VALUE;
                Object obj = qVar.i;
                tn tnVar = tn.d;
                i = qVar.k;
                if (i != 0) {
                    ca0.v(obj);
                    CoroutineContext coroutineContext = qVar.e;
                    coroutineContext.getClass();
                    d51 d51Var2 = new d51(d00Var, coroutineContext);
                    try {
                        qVar.h = d51Var2;
                        qVar.k = 1;
                        try {
                            Object b = ((Function2) this.e).b(d51Var2, qVar);
                            if (b != tnVar) {
                                b = Unit.a;
                            }
                            if (b == tnVar) {
                                return tnVar;
                            }
                            d51Var = d51Var2;
                        } catch (Throwable th) {
                            th = th;
                            d51Var = d51Var2;
                            d51Var.m();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d51Var = qVar.h;
                    try {
                        ca0.v(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        d51Var.m();
                        throw th;
                    }
                }
                d51Var.m();
                return Unit.a;
            }
        }
        qVar = new q(this, dnVar);
        Object obj2 = qVar.i;
        tn tnVar2 = tn.d;
        i = qVar.k;
        if (i != 0) {
        }
        d51Var.m();
        return Unit.a;
    }

    @Override // defpackage.qm1
    public v7 h(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return ((o91) this.e).h(j, v7Var, v7Var2, v7Var3);
    }

    @Override // defpackage.lz0
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lz0
    public void k(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    @Override // defpackage.qm1
    public v7 m(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return ((o91) this.e).m(j, v7Var, v7Var2, v7Var3);
    }

    @Override // defpackage.qm1
    public v7 n(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return ((o91) this.e).n(v7Var, v7Var2, v7Var3);
    }

    @Override // defpackage.ro
    public c00 o() {
        return ((ro) this.e).o();
    }

    public long p(long j) {
        tq tqVar = (tq) this.e;
        tqVar.getClass();
        if (xm1.b(j) <= 0.0f || xm1.c(j) <= 0.0f) {
            o80.b("maximumVelocity should be a positive value. You specified=" + ((Object) xm1.f(j)));
        }
        return ca0.d(((zm1) tqVar.b).b(xm1.b(j)), ((zm1) tqVar.c).b(xm1.c(j)));
    }

    public zz q(int i) {
        switch (this.d) {
            case 16:
                return ((a00[]) this.e)[i];
            case 17:
                return (a00) this.e;
            default:
                return (zz) this.e;
        }
    }

    public boolean r(String str) {
        String z = z(str);
        return "1".equals(z) || Boolean.parseBoolean(z);
    }

    public Integer s(String str) {
        String z = z(str);
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(z));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + F(str) + "(" + z + ") into an int");
            return null;
        }
    }

    public JSONArray t(String str) {
        String z = z(str);
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        try {
            return new JSONArray(z);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + F(str) + ": " + z + ", falling back to default");
            return null;
        }
    }

    public int[] u() {
        JSONArray t = t("gcm.n.light_settings");
        if (t == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (t.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(t.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = t.optInt(1);
            iArr[2] = t.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + t + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + t + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] v(String str) {
        JSONArray t = t(str.concat("_loc_args"));
        if (t == null) {
            return null;
        }
        int length = t.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = t.optString(i);
        }
        return strArr;
    }

    public String w(String str) {
        return z(str.concat("_loc_key"));
    }

    public Long x() {
        String z = z("gcm.n.event_time");
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(z));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + F("gcm.n.event_time") + "(" + z + ") into a long");
            return null;
        }
    }

    public String y(Resources resources, String str, String str2) {
        String z = z(str2);
        if (!TextUtils.isEmpty(z)) {
            return z;
        }
        String w = w(str2);
        if (TextUtils.isEmpty(w)) {
            return null;
        }
        int identifier = resources.getIdentifier(w, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", F(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] v = v(str2);
        if (v == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, v);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + F(str2) + ": " + Arrays.toString(v) + " Default value will be used.", e);
            return null;
        }
    }

    public String z(String str) {
        Bundle bundle = (Bundle) this.e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public /* synthetic */ nq0(int i, boolean z) {
        this.d = i;
    }

    public nq0(int i) {
        this.d = i;
        switch (i) {
            case 3:
                this.e = new aj0();
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                this.e = new Region();
                break;
            case 20:
                this.e = new tq();
                break;
            default:
                this.e = new j50(26);
                break;
        }
    }

    public nq0(nr nrVar) {
        this.d = 12;
        this.e = new vz(mc1.a, nrVar);
    }

    public /* synthetic */ nq0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public nq0(Bundle bundle) {
        this.d = 0;
        if (bundle != null) {
            this.e = new Bundle(bundle);
        } else {
            l.b("data");
            throw null;
        }
    }

    public nq0(long[] jArr) {
        hn0 hn0Var;
        this.d = 11;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            hn0Var = new hn0(copyOf.length);
            int i = hn0Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = hn0Var.a;
                    if (jArr2.length < length) {
                        hn0Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = hn0Var.a;
                    int i2 = hn0Var.b;
                    if (i != i2) {
                        w9.b(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    w9.b(copyOf, jArr3, i, 0, copyOf.length);
                    hn0Var.b += copyOf.length;
                }
            } else {
                throw new IndexOutOfBoundsException("");
            }
        } else {
            hn0Var = new hn0(16);
        }
        this.e = hn0Var;
    }

    public nq0(float f, v7 v7Var) {
        nq0 nq0Var;
        this.d = 19;
        int[] iArr = rm1.a;
        if (v7Var != null) {
            nq0Var = new nq0(v7Var, f);
        } else {
            nq0Var = new nq0(f);
        }
        this.e = new o91(nq0Var);
    }

    public nq0(v7 v7Var, float f) {
        this.d = 16;
        int b = v7Var.b();
        a00[] a00VarArr = new a00[b];
        for (int i = 0; i < b; i++) {
            a00VarArr[i] = new a00(f, v7Var.a(i));
        }
        this.e = a00VarArr;
    }

    public nq0(float f) {
        this.d = 17;
        this.e = new a00(f, 0.01f);
    }
}
