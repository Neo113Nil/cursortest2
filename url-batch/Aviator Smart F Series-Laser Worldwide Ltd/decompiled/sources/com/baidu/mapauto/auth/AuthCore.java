package com.baidu.mapauto.auth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.net.c;
import com.baidu.mapauto.auth.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class AuthCore {
    public static final String TAG = "AuthCore";
    public static final int TYPE_LICENSE_ALL = 3;
    public static final int TYPE_LICENSE_FILE = 1;
    public static final int TYPE_LICENSE_FUNCTION = 2;

    /* renamed from: a, reason: collision with root package name */
    public final com.baidu.mapauto.auth.data.license.impl.a f7703a;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.baidu.mapauto.auth.data.license.impl.b f7704b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f7705c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f7706d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.baidu.mapauto.auth.process.a f7707e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.baidu.mapauto.auth.process.b f7708f;

    /* renamed from: g, reason: collision with root package name */
    public String f7709g;

    /* renamed from: h, reason: collision with root package name */
    public String f7710h;

    /* renamed from: i, reason: collision with root package name */
    public String f7711i = "";

    public static class AuthParam extends HashMap<String, Object> {
        public static final String KEY_EXTRA_APP_VERSION = "extra_app_version";
        public static final String KEY_EXTRA_CUID = "extra_cuid";
        public static final String KEY_EXTRA_MODE = "extra_mode";
        public static final String KEY_EXTRA_MODEL = "extra_model";
        public static final String KEY_EXTRA_OS_VERSION = "extra_os_version";

        public AuthParam() {
        }

        public AuthParam(String str, String str2, String str3, String str4, String str5, int i8, Map<String, Object> map) {
            put("ak", str);
            put("channel", str2);
            put("device_id", str3);
            put("service_name", str4);
            put("function_name", str5);
            put("need_active", Integer.valueOf(i8));
            if (map != null) {
                putAll(map);
            }
            put(HttpConstants.SDK_VERSION_NAME, "1.0.0");
            put(HttpConstants.SDK_VERSION_CODE, 1);
        }

        public final AuthParam a() {
            AuthParam authParam = new AuthParam();
            for (String str : keySet()) {
                authParam.put(str, get(str));
            }
            return authParam;
        }

        public final String b() {
            Object obj = get("ak");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String c() {
            Object obj = get("channel");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String d() {
            Object obj = get("device_id");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final String e() {
            Object obj = get("service_name");
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public final boolean a(int i8) {
            boolean z7 = (TextUtils.isEmpty(b()) || TextUtils.isEmpty(e())) ? false : true;
            if ((i8 & 2) == 2) {
                z7 = z7 && !TextUtils.isEmpty(c());
            }
            return (i8 & 1) == 1 ? z7 && !TextUtils.isEmpty(d()) : z7;
        }
    }

    public class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return !TextUtils.isEmpty(str) && "https://api.map.baidu.com".contains(str);
        }
    }

    public static final class b implements ILicenseAuthListener {

        /* renamed from: a, reason: collision with root package name */
        public final ILicenseAuthListener f7712a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f7713b = new Handler(Looper.getMainLooper());

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map f7714a;

            public a(Map map) {
                this.f7714a = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LogUtil logUtil = LogUtil.getInstance();
                String str = AuthCore.TAG;
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("授权成功(回调 ");
                a8.append(b.this.f7712a);
                a8.append("): ");
                a8.append(this.f7714a);
                logUtil.i(str, a8.toString());
                ILicenseAuthListener iLicenseAuthListener = b.this.f7712a;
                if (iLicenseAuthListener != null) {
                    iLicenseAuthListener.onSuccess(this.f7714a);
                }
            }
        }

        /* renamed from: com.baidu.mapauto.auth.AuthCore$b$b, reason: collision with other inner class name */
        public class RunnableC0065b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f7716a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f7717b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Exception f7718c;

            public RunnableC0065b(int i8, String str, Exception exc) {
                this.f7716a = i8;
                this.f7717b = str;
                this.f7718c = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LogUtil logUtil = LogUtil.getInstance();
                String str = AuthCore.TAG;
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("授权失败(回调 ");
                a8.append(b.this.f7712a);
                a8.append("): code = ");
                a8.append(this.f7716a);
                a8.append(", msg = ");
                a8.append(this.f7717b);
                logUtil.e(str, a8.toString());
                ILicenseAuthListener iLicenseAuthListener = b.this.f7712a;
                if (iLicenseAuthListener != null) {
                    iLicenseAuthListener.onError(this.f7716a, this.f7717b, this.f7718c);
                }
            }
        }

        public b(ILicenseAuthListener iLicenseAuthListener) {
            this.f7712a = iLicenseAuthListener;
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public final void onError(int i8, String str, Exception exc) {
            RunnableC0065b runnableC0065b = new RunnableC0065b(i8, str, exc);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                runnableC0065b.run();
            } else {
                this.f7713b.post(runnableC0065b);
            }
        }

        @Override // com.baidu.mapauto.auth.ILicenseAuthListener
        public final void onSuccess(Map<String, Integer> map) {
            a aVar = new a(map);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                aVar.run();
            } else {
                this.f7713b.post(aVar);
            }
        }
    }

    public AuthCore() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(HttpConstants.SDK_VERSION_NAME, "1.0.0");
        hashMap.put(HttpConstants.SDK_VERSION_CODE, 1);
        this.f7703a = new com.baidu.mapauto.auth.data.license.impl.a(new com.baidu.mapauto.auth.net.a(new c.a().d().c().b().a(hashMap).a(new a()).a()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7705c = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 60L, timeUnit, new LinkedBlockingQueue());
        this.f7706d = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 60L, timeUnit, new LinkedBlockingQueue());
    }

    public final void a(Context context, AuthParam authParam, int i8, ILicenseAuthListener iLicenseAuthListener) {
        LogUtil.getInstance().i(TAG, "开始授权");
        b bVar = new b(iLicenseAuthListener);
        if (context == null) {
            bVar.onError(-1002, "context 不可以为空", null);
            return;
        }
        if (!authParam.a(i8)) {
            bVar.onError(-1002, "参数错误, 请确保 ak, channel, serviceName 、 file 类型下时的 deviceId 不为空", null);
            return;
        }
        this.f7709g = authParam.b();
        this.f7710h = authParam.d();
        this.f7711i = authParam.c();
        if (this.f7704b == null) {
            synchronized (AuthCore.class) {
                try {
                    if (this.f7704b == null) {
                        this.f7704b = new com.baidu.mapauto.auth.data.license.impl.b(new com.baidu.mapauto.auth.store.a(context));
                    }
                } finally {
                }
            }
        }
        if (this.f7707e == null) {
            synchronized (AuthCore.class) {
                try {
                    if (this.f7707e == null) {
                        this.f7707e = new com.baidu.mapauto.auth.process.a(3, this.f7703a, this.f7704b);
                    }
                } finally {
                }
            }
        }
        if (this.f7708f == null) {
            synchronized (AuthCore.class) {
                try {
                    if (this.f7708f == null) {
                        this.f7708f = new com.baidu.mapauto.auth.process.b(3, this.f7703a, this.f7704b);
                    }
                } finally {
                }
            }
        }
        if (this.f7704b instanceof com.baidu.mapauto.auth.data.license.impl.b) {
            com.baidu.mapauto.auth.data.license.impl.b bVar2 = this.f7704b;
            String b8 = authParam.b();
            authParam.c();
            authParam.e();
            Object obj = authParam.get("function_name");
            if (obj instanceof String) {
            }
            String d8 = authParam.d();
            bVar2.getClass();
            bVar2.f7739b = b8 + d8;
        }
        this.f7705c.submit(new com.baidu.mapauto.auth.a(this, i8, bVar, authParam));
    }

    public final HashMap a(Context context, String str, String str2, String str3, String str4, String str5, int i8) {
        LogUtil logUtil = LogUtil.getInstance();
        String str6 = TAG;
        logUtil.i(str6, "本地: 开始授权");
        if (context == null) {
            LogUtil.getInstance().i(str6, "本地: context 为空");
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(-1002, "context 不可以为空");
        }
        String str7 = TextUtils.isEmpty(str) ? this.f7709g : str;
        String str8 = TextUtils.isEmpty(str2) ? this.f7710h : str2;
        AuthParam authParam = new AuthParam(str7, TextUtils.isEmpty(str3) ? this.f7711i : str3, str8, str4, str5, 0, new HashMap(0));
        if (!authParam.a(i8)) {
            LogUtil.getInstance().i(str6, "本地: 核心参数检测失败");
            throw new BaseLicenseAuthDataStandardProcess.ProcessException(-1002, "参数错误, 请确保 ak, channel, serviceName 、 file 类型下时的 deviceId 不为空");
        }
        if (this.f7704b == null) {
            synchronized (AuthCore.class) {
                try {
                    if (this.f7704b == null) {
                        this.f7704b = new com.baidu.mapauto.auth.data.license.impl.b(new com.baidu.mapauto.auth.store.a(context));
                    }
                } finally {
                }
            }
        }
        if (this.f7704b instanceof com.baidu.mapauto.auth.data.license.impl.b) {
            com.baidu.mapauto.auth.data.license.impl.b bVar = this.f7704b;
            bVar.getClass();
            bVar.f7739b = str7 + str8;
        }
        ArrayList arrayList = new ArrayList(2);
        if ((i8 & 1) == 1) {
            arrayList.add(new com.baidu.mapauto.auth.process.a(2, this.f7703a, this.f7704b));
            LogUtil.getInstance().i(str6, "本地: 添加 license file 授权流程");
        }
        if ((i8 & 2) == 2) {
            arrayList.add(new com.baidu.mapauto.auth.process.b(2, this.f7703a, this.f7704b));
            LogUtil.getInstance().i(str6, "本地: 添加 license function 授权流程");
        }
        if (arrayList.isEmpty()) {
            LogUtil.getInstance().i(str6, "本地: 没有发现任何授权流程");
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                hashMap.putAll(((BaseLicenseAuthDataStandardProcess) it.next()).a(authParam));
            } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
                LogUtil logUtil2 = LogUtil.getInstance();
                String str9 = TAG;
                StringBuilder a8 = com.baidu.mapauto.auth.b.a("本地: 授权异常结束（");
                a8.append(e8.getMessage());
                a8.append(")");
                logUtil2.i(str9, a8.toString());
                throw e8;
            }
        }
        LogUtil.getInstance().i(TAG, "本地: 授权成功结束");
        return hashMap;
    }
}
