package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.appsflyer.v;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.firebase.iid.FirebaseInstanceIdService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ah {
    static boolean a(Context context) {
        return c(context) | b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if ((r6.getPackageManager().queryIntentServices(r2, 0).size() > 0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean b(Context context) {
        if (i.c().d()) {
            return false;
        }
        try {
            Class.forName("com.google.android.gms.iid.InstanceIDListenerService");
            Intent intent = new Intent("com.google.android.gms.iid.InstanceID", null, context, GcmInstanceIdListener.class);
            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID", null, context, InstanceIDListenerService.class);
            if (!(context.getPackageManager().queryIntentServices(intent, 0).size() > 0)) {
            }
            if (context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.c2dm.intent.RECEIVE", null, context, Class.forName("com.google.android.gms.gcm.GcmReceiver")), 0).size() > 0) {
                String packageName = context.getPackageName();
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append(".permission.C2D_MESSAGE");
                if (v.a.a(context, sb.toString())) {
                    return true;
                }
                d.e("Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation.");
            } else {
                d.e("Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation.");
            }
        } catch (ClassNotFoundException e) {
            d.a(e.getMessage());
        } catch (Throwable th) {
            d.a("An error occurred while trying to verify manifest declarations: ", th);
        }
        return false;
    }

    private static boolean c(Context context) {
        Intent intent;
        Intent intent2;
        if (i.c().d()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            intent = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, k.class);
            intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, FirebaseInstanceIdService.class);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            d.a("An error occurred while trying to verify manifest declarations: ", th);
        }
        if (!(context.getPackageManager().queryIntentServices(intent, 0).size() > 0)) {
            if (!(context.getPackageManager().queryIntentServices(intent2, 0).size() > 0)) {
                d.e("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(WeakReference<Context> weakReference, String str) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            String str2 = (String) cls.getDeclaredMethod("getToken", String.class, String.class).invoke(cls.getDeclaredMethod(com.cmplay.base.util.ipc.a.FORCE_STATIC_METHOD, Context.class).invoke(cls, weakReference.get()), str, "GCM");
            if (str2 != null) {
                return str2;
            }
            d.e("Couldn't get token using reflection.");
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            d.a("Couldn't get token using GoogleCloudMessaging. ", th);
            return null;
        }
    }

    static void a(Context context, q qVar) {
        StringBuilder sb = new StringBuilder("updateServerUninstallToken called with: ");
        sb.append(qVar.toString());
        d.d(sb.toString());
        q a2 = q.a(j.a().a("afUninstallToken"));
        if (context.getSharedPreferences("appsflyer-data", 0).getBoolean("sentRegisterRequestToAF", false) && a2.a() != null && a2.a().equals(qVar.a())) {
            return;
        }
        j.a().a("afUninstallToken", qVar.toString());
        i.c().b(context, qVar.a());
    }

    static class a extends AsyncTask<Void, Void, String> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f3435a;

        /* renamed from: b, reason: collision with root package name */
        private String f3436b;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ String doInBackground(Void[] voidArr) {
            return a();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String a2 = j.a().a("afUninstallToken");
            q qVar = new q(str2);
            if (a2 == null) {
                ah.a(this.f3435a.get(), qVar);
                return;
            }
            q a3 = q.a(a2);
            if (a3.a(qVar)) {
                ah.a(this.f3435a.get(), a3);
            }
        }

        a(WeakReference<Context> weakReference) {
            this.f3435a = weakReference;
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            super.onPreExecute();
            this.f3436b = j.a().a("gcmProjectNumber");
        }

        private String a() {
            try {
                if (this.f3436b != null) {
                    return ah.b(this.f3435a, this.f3436b);
                }
                return null;
            } catch (Throwable th) {
                d.a("Error registering for uninstall feature", th);
                return null;
            }
        }
    }
}
