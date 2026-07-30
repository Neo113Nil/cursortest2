package com.baidu.mshield;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mshield.rp.Receiver;
import com.baidu.mshield.utility.g;
import com.baidu.mshield.x0.EngineImpl;
import com.baidu.sec.privacy.b.b;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MH {
    private static boolean isLoad = false;
    private static Receiver sdkRceiver;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8304a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f8305b;

        /* renamed from: com.baidu.mshield.MH$a$a, reason: collision with other inner class name */
        public class C0082a implements com.baidu.sec.privacy.a {
            public C0082a(a aVar) {
            }

            @Override // com.baidu.sec.privacy.a
            public boolean a() {
                com.baidu.mshield.b.c.a.b("MethodImpl.isAgreePolicy()=" + com.baidu.mshield.core.a.a());
                return com.baidu.mshield.core.a.a();
            }
        }

        public a(Context context, HashMap hashMap) {
            this.f8304a = context;
            this.f8305b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baidu.mshield.b.c.a.b("===pre isUserAuthPrv===");
            com.baidu.xclient.gdid.a.f(this.f8304a);
            b.a(this.f8304a, "mshield", new C0082a(this));
            com.baidu.mshield.b.a.a.f8309a = "985050001";
            if (MH.initAppkey(this.f8304a)) {
                com.baidu.mshield.utility.b.a(this.f8304a).b();
                String[] i8 = com.baidu.mshield.utility.a.i(this.f8304a);
                if (i8.length == 2) {
                    MH.registerSDKReceiver(this.f8304a);
                    String str = i8[0];
                    com.baidu.mshield.b.a.a.f8309a = str;
                    com.baidu.mshield.core.a.a(this.f8304a, str, i8[1], this.f8305b, 0);
                }
            }
        }
    }

    private MH() {
    }

    public static String getVersion(Context context) {
        return "4.2.6";
    }

    public static String gz(Context context) {
        return com.baidu.mshield.core.a.b(context);
    }

    public static String gzfi(Context context, String str, int i8, String str2, HashMap<String, String> hashMap) {
        try {
            if (com.baidu.mshield.utility.a.h(context) == 1) {
                if (!isLoad) {
                    init(context, hashMap);
                }
                return com.baidu.mshield.core.a.a(context, str, i8, str2);
            }
            Bundle bundle = new Bundle();
            bundle.putString("accountId", str);
            bundle.putInt("scene", i8);
            bundle.putString("para", str2);
            bundle.putBundle("property", obtainBundleFromProperties(hashMap));
            return g.a(context, "gzfi", bundle).getString("result", "");
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return "";
        }
    }

    public static String init(Context context, HashMap<String, String> hashMap) {
        try {
            if (com.baidu.mshield.utility.a.h(context) != 1) {
                return g.a(context, "init", obtainBundleFromProperties(hashMap)).getString("result", "");
            }
            if (!isLoad) {
                initPlugin(context, hashMap);
                isLoad = true;
            }
            return gz(context);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean initAppkey(Context context) {
        String[] c8 = com.baidu.mshield.utility.a.c(context);
        return !(c8 == null || c8.length != 2 || TextUtils.isEmpty(c8[0]) || TextUtils.isEmpty(c8[1])) || com.baidu.mshield.key.a.a(context);
    }

    private static void initPlugin(Context context, HashMap<String, String> hashMap) {
        new Thread(new a(context, hashMap)).start();
    }

    private static Bundle obtainBundleFromProperties(HashMap<String, String> hashMap) {
        Bundle bundle = new Bundle();
        if (hashMap != null) {
            try {
                for (String str : hashMap.keySet()) {
                    bundle.putString(str, hashMap.get(str));
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void registerSDKReceiver(Context context) {
        try {
            sdkRceiver = new Receiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.b.r.p");
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    context.registerReceiver(sdkRceiver, intentFilter, 4);
                } catch (Throwable th) {
                    com.baidu.mshield.utility.a.a(th);
                }
            } else {
                context.registerReceiver(sdkRceiver, intentFilter);
            }
        } catch (Throwable th2) {
            com.baidu.mshield.utility.a.a(th2);
        }
    }

    public static void setAgreePolicy(Context context, boolean z7) {
        try {
            if (com.baidu.mshield.utility.a.h(context) == 1) {
                com.baidu.mshield.core.a.a(z7);
            } else {
                Bundle bundle = new Bundle();
                bundle.putBoolean("_agree_policy", z7);
                g.a(context, "setAgreePolicy", bundle);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static void setAppStatus(Context context, boolean z7) {
        try {
            if (com.baidu.mshield.utility.a.h(context) != 1) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("_app_status", z7);
                g.a(context, "setAppStatus", bundle);
            } else if (isLoad) {
                com.baidu.mshield.core.a.b(z7);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static void ud(Context context, HashMap<String, String> hashMap) {
        try {
            if (com.baidu.mshield.utility.a.h(context) != 1) {
                g.a(context, "ud", obtainBundleFromProperties(hashMap));
            } else if (isLoad) {
                com.baidu.mshield.core.a.a(context, hashMap);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static void unInitPlugin(Context context) {
        try {
            unregisterSDKReceiver(context);
            EngineImpl.getInstance(context).unload();
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    private static void unregisterSDKReceiver(Context context) {
        try {
            Receiver receiver = sdkRceiver;
            if (receiver != null) {
                context.unregisterReceiver(receiver);
                sdkRceiver = null;
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static String gzfi(Context context, String str, int i8, HashMap<String, String> hashMap) {
        return gzfi(context, str, i8, null, hashMap);
    }
}
