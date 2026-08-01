package d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import b7.h;
import b7.i;
import b7.s;
import b7.w;
import b7.y;
import c2.g0;
import c2.k;
import c2.y1;
import c6.l;
import c7.n;
import c7.q;
import e7.e;
import j0.v;
import j0.x;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import k1.p;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import m.c0;
import org.json.JSONArray;
import org.json.JSONException;
import w7.g;
import x2.j;
import x3.f;
import y0.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements f, w, d, i {

    /* renamed from: i, reason: collision with root package name */
    public static volatile c f3699i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3700d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3701e;

    public c(Context context) {
        boolean isEmpty;
        this.f3700d = 12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3701e = sharedPreferences;
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
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
            }
        }
    }

    public static boolean p(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String u(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // b7.w
    public void a() {
        y yVar = (y) this.f3701e;
        Lock lock = yVar.f1397d;
        lock.lock();
        try {
            yVar.f1405n = new s(yVar, yVar.f1402k, yVar.f1403l, yVar.g, yVar.f1404m, lock, yVar.f1399f);
            yVar.f1405n.g();
            yVar.f1398e.signalAll();
        } finally {
            yVar.f1397d.unlock();
        }
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        Parcel obtain;
        g gVar = (g) obj2;
        switch (this.f3700d) {
            case 17:
                e7.b bVar = (e7.b) ((e7.a) obj).m();
                q qVar = (q) this.f3701e;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bVar.f2666f);
                int i3 = m7.a.f6567a;
                obtain.writeInt(1);
                qVar.writeToParcel(obtain, 0);
                try {
                    bVar.f2665e.transact(1, obtain, null, 1);
                    obtain.recycle();
                    gVar.a(null);
                    return;
                } finally {
                }
            default:
                e7.c cVar = (e7.c) ((e) obj).m();
                n nVar = (n) this.f3701e;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(cVar.f2666f);
                int i10 = m7.a.f6567a;
                if (nVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    nVar.writeToParcel(obtain, 0);
                }
                try {
                    cVar.f2665e.transact(1, obtain, null, 1);
                    obtain.recycle();
                    gVar.a(null);
                    return;
                } finally {
                }
        }
    }

    @Override // x3.f
    public Object c(Function2 function2, nd.i iVar) {
        return ((f) this.f3701e).c(new b4.b(function2, null, 0), iVar);
    }

    @Override // b7.w
    public boolean e() {
        return true;
    }

    @Override // b7.w
    public void g() {
        y yVar = (y) this.f3701e;
        Iterator it = yVar.f1401i.values().iterator();
        while (it.hasNext()) {
            ((c7.i) it.next()).d();
        }
        yVar.f1407p.f1378p = Collections.EMPTY_SET;
    }

    @Override // x3.f
    public je.e h() {
        return ((f) this.f3701e).h();
    }

    public void i(g0 g0Var) {
        if (!g0Var.E()) {
            z1.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((y1) this.f3701e).add(g0Var);
    }

    public boolean j(String str) {
        String n10 = n(str);
        return "1".equals(n10) || Boolean.parseBoolean(n10);
    }

    public Integer k(String str) {
        String n10 = n(str);
        if (TextUtils.isEmpty(n10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(n10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + u(str) + "(" + n10 + ") into an int");
            return null;
        }
    }

    public JSONArray l(String str) {
        String n10 = n(str);
        if (TextUtils.isEmpty(n10)) {
            return null;
        }
        try {
            return new JSONArray(n10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + u(str) + ": " + n10 + ", falling back to default");
            return null;
        }
    }

    public String m(Resources resources, String str, String str2) {
        String[] strArr;
        String n10 = n(str2);
        if (!TextUtils.isEmpty(n10)) {
            return n10;
        }
        String n11 = n(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(n11)) {
            return null;
        }
        int identifier = resources.getIdentifier(n11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", u(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray l10 = l(str2.concat("_loc_args"));
        if (l10 == null) {
            strArr = null;
        } else {
            int length = l10.length();
            strArr = new String[length];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = l10.optString(i3);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + u(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e2);
            return null;
        }
    }

    public String n(String str) {
        Bundle bundle = (Bundle) this.f3701e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long o() {
        switch (this.f3700d) {
            case 25:
                j0.f fVar = (j0.f) this.f3701e;
                long o6 = fVar.H.o();
                if (o6 != 16) {
                    return o6;
                }
                v vVar = (v) k.h(fVar, x.f4898a);
                if (vVar != null) {
                    long j = vVar.f4896a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((p) k.h(fVar, j0.d.f4803a)).f5342a;
            default:
                return ((j0.y) this.f3701e).f4901b;
        }
    }

    public void q(View view, int i3, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f3701e).notifyViewVisibilityChanged(view, i3, z10);
        }
    }

    public Bundle r() {
        Bundle bundle = (Bundle) this.f3701e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public boolean s(g0 g0Var) {
        if (!g0Var.E()) {
            z1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((y1) this.f3701e).remove(g0Var);
    }

    public void t(j jVar) {
        ((Region) this.f3701e).set(jVar.f10325a, jVar.f10326b, jVar.f10327c, jVar.f10328d);
    }

    public String toString() {
        switch (this.f3700d) {
            case 9:
                return ((y1) this.f3701e).toString();
            default:
                return super.toString();
        }
    }

    @Override // b7.w
    public void b(int i3) {
    }

    @Override // b7.w
    public void d(Bundle bundle) {
    }

    public /* synthetic */ c(int i3, boolean z10) {
        this.f3700d = i3;
    }

    public c(h hVar, b7.e eVar) {
        this.f3700d = 8;
        this.f3701e = hVar;
    }

    public c(int i3) {
        this.f3700d = i3;
        switch (i3) {
            case 9:
                this.f3701e = new y1(k.f1592a);
                break;
            case 13:
                y0.c cVar = new y0.c();
                this.f3701e = cVar;
                if (!cVar.f10572e) {
                    if (cVar.f10573i) {
                        z0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.f10573i = true;
                    break;
                }
                break;
            case 27:
                this.f3701e = new Region();
                break;
            case 29:
                this.f3701e = null;
                break;
            default:
                this.f3701e = new HashSet();
                break;
        }
    }

    public c(boolean z10) {
        this.f3700d = 3;
        this.f3701e = new AtomicBoolean(z10);
    }

    public /* synthetic */ c(int i3, Object obj) {
        this.f3700d = i3;
        this.f3701e = obj;
    }

    public c(Bundle bundle) {
        this.f3700d = 11;
        this.f3701e = new Bundle(bundle);
    }

    public c(c0 c0Var) {
        this.f3700d = 16;
        this.f3701e = new e4.g(c0Var);
    }

    public c(m.n nVar) {
        this.f3700d = 15;
        this.f3701e = new l(nVar);
    }

    public c(long[] jArr) {
        s.y yVar;
        this.f3700d = 2;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            yVar = new s.y(copyOf.length);
            int i3 = yVar.f8398b;
            if (i3 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i3;
                    long[] jArr2 = yVar.f8397a;
                    if (jArr2.length < length) {
                        yVar.f8397a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = yVar.f8397a;
                    int i10 = yVar.f8398b;
                    if (i3 != i10) {
                        kotlin.collections.v.e(jArr3, jArr3, copyOf.length + i3, i3, i10);
                    }
                    kotlin.collections.v.e(copyOf, jArr3, i3, 0, copyOf.length);
                    yVar.f8398b += copyOf.length;
                }
            } else {
                i0.g("");
                throw null;
            }
        } else {
            yVar = new s.y(16);
        }
        this.f3701e = yVar;
    }

    @Override // b7.w
    public void f(z6.b bVar, a7.d dVar, boolean z10) {
    }
}
