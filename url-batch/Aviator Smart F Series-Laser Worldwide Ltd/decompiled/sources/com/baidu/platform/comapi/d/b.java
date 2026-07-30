package com.baidu.platform.comapi.d;

import android.util.Log;
import com.baidu.mapsdkplatform.comapi.map.e;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.baidu.platform.comapi.util.NetworkUtil;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comapi.util.j;
import com.baidu.platform.comjni.base.networkdetect.NANetworkDetect;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private NANetworkDetect f9006a;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a("netchanged");
        }
    }

    /* renamed from: com.baidu.platform.comapi.d.b$b, reason: collision with other inner class name */
    private static final class C0103b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f9008a = new b(null);
    }

    /* synthetic */ b(com.baidu.platform.comapi.d.a aVar) {
        this();
    }

    public void b(String str) {
        String netType = SysOSUtil.getInstance().getNetType();
        Log.d("NetworkLogic", "onNetWorkChanged-" + str + ", oldType = " + netType);
        if (str == null || str.equals(netType)) {
            return;
        }
        j.c().submit(new a());
    }

    private b() {
    }

    public static b a() {
        return C0103b.f9008a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (e.b() <= 0) {
            return;
        }
        Log.d("NetworkLogic", "NetworkDetect");
        if (this.f9006a == null) {
            this.f9006a = new NANetworkDetect();
        }
        String currentNetMode = NetworkUtil.getCurrentNetMode(JNIInitializer.getCachedContext());
        SysOSUtil.getInstance().updateNetType(currentNetMode);
        if (this.f9006a != null) {
            try {
                JsonBuilder jsonBuilder = new JsonBuilder();
                jsonBuilder.object();
                try {
                    jsonBuilder.key("nettype").value(Integer.parseInt(currentNetMode));
                } catch (NumberFormatException unused) {
                    jsonBuilder.key("nettype").value(-1);
                }
                jsonBuilder.key("telecomtype").value(NetworkUtil.getNetworkOperatorType(JNIInitializer.getCachedContext()));
                jsonBuilder.key("triggerType").value(str);
                jsonBuilder.endObject();
                this.f9006a.a(jsonBuilder.toString());
            } catch (Exception unused2) {
            }
        }
    }
}
