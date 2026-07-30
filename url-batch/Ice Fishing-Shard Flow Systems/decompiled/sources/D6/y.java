package D6;

import R5.InterfaceC0168h;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.W;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import c1.InterfaceC0289b;
import com.onesignal.core.activities.PermissionsActivity;
import i1.InterfaceC0543c;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.I;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements InterfaceC0168h, InterfaceC0289b {

    /* renamed from: e, reason: collision with root package name */
    public Object f634e;

    /* renamed from: l, reason: collision with root package name */
    public Object f636l;

    /* renamed from: m, reason: collision with root package name */
    public Object f637m = I.c();

    /* renamed from: d, reason: collision with root package name */
    public Object f633d = "GET";

    /* renamed from: i, reason: collision with root package name */
    public Object f635i = new C4.d(2);

    public static y a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        y yVar = new y();
        yVar.f636l = new ArrayDeque();
        yVar.f634e = sharedPreferences;
        yVar.f633d = "topic_operation_queue";
        yVar.f635i = ",";
        yVar.f637m = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) yVar.f636l)) {
            try {
                ((ArrayDeque) yVar.f636l).clear();
                String string = ((SharedPreferences) yVar.f634e).getString((String) yVar.f633d, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) yVar.f635i)) {
                    String[] split = string.split((String) yVar.f635i, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) yVar.f636l).add(str);
                        }
                    }
                    return yVar;
                }
                return yVar;
            } finally {
            }
        }
    }

    public void b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ((C4.d) this.f635i).i(name, value);
    }

    public boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        P1.g gVar = (P1.g) this.f633d;
        gVar.a();
        Context context = gVar.f2270a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void d(String method, A a7) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (a7 == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(r4.f.d("method ", method, " must have a request body.").toString());
            }
        } else if (!V6.b.I(method)) {
            throw new IllegalArgumentException(r4.f.d("method ", method, " must not have a request body.").toString());
        }
        this.f633d = method;
        this.f636l = a7;
    }

    public void e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((C4.d) this.f635i).h(name);
    }

    @Override // Q5.a
    public Object get() {
        return new f1.b((Executor) ((Q5.a) this.f634e).get(), (b1.e) ((Q5.a) this.f633d).get(), (g1.c) ((D0.j) this.f635i).get(), (h1.d) ((Q5.a) this.f636l).get(), (InterfaceC0543c) ((Q5.a) this.f637m).get());
    }

    @Override // R5.InterfaceC0168h
    public Object getValue() {
        W w4 = (W) this.f637m;
        if (w4 != null) {
            return w4;
        }
        D0.j jVar = new D0.j((b0) ((PermissionsActivity.f) this.f633d).invoke(), (Z) ((PermissionsActivity.e) this.f635i).invoke(), (b0.c) ((PermissionsActivity.g) this.f636l).invoke());
        C0643h c0643h = (C0643h) this.f634e;
        Intrinsics.checkNotNullParameter(c0643h, "<this>");
        Class a7 = c0643h.a();
        Intrinsics.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        W G4 = jVar.G(a7);
        this.f637m = G4;
        return G4;
    }
}
