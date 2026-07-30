package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.npc.ArBridge;
import com.baidu.ar.npc.BaiduArView;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c implements ArBridge.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    private Context f10012a;

    /* renamed from: b, reason: collision with root package name */
    private BaiduArView f10013b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.f.a f10014c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10015d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10016e = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(200L);
                com.baidu.platform.comapi.walknavi.g.i.i.a.b().a();
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("statistic exception when destroy: " + e8.getMessage());
            }
        }
    }

    public c(Context context, com.baidu.platform.comapi.walknavi.g.i.f.a aVar) {
        this.f10012a = context.getApplicationContext();
        this.f10014c = aVar;
    }

    public void a() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("destroy");
        this.f10015d = true;
        BaiduArView baiduArView = this.f10013b;
        if (baiduArView != null) {
            baiduArView.onPause();
        }
        ArBridge.getInstance().removeMessageHandeler(this);
        ArBridge.getInstance().destroyCase();
        com.baidu.platform.comapi.walknavi.g.i.i.a.b().a("end_ar");
        new Thread(new a()).start();
    }

    public BaiduArView b() {
        if (this.f10013b == null) {
            this.f10013b = new BaiduArView(this.f10012a);
        }
        return this.f10013b;
    }

    public void c() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("pause");
        this.f10015d = true;
        BaiduArView baiduArView = this.f10013b;
        if (baiduArView != null) {
            baiduArView.onPause();
        }
    }

    public void d() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("pauseByUser");
        this.f10015d = true;
        ArBridge.getInstance().onPauseByUser();
    }

    public void e() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("resume");
        this.f10015d = false;
        BaiduArView baiduArView = this.f10013b;
        if (baiduArView != null) {
            baiduArView.onResume();
        }
    }

    public void f() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("resumeByUser");
        this.f10015d = false;
        ArBridge.getInstance().onResumeByUser();
    }

    @Override // com.baidu.ar.npc.ArBridge.MessageHandler
    public void handleMessage(int i8, int i9, HashMap<String, Object> hashMap) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("aMessageType = " + i8 + ", aParams = " + hashMap);
        com.baidu.platform.comapi.walknavi.g.i.f.a aVar = this.f10014c;
        if (aVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ARCallback is null");
            return;
        }
        if (i8 == 9) {
            if (hashMap != null) {
                try {
                    if (Integer.parseInt(String.valueOf(hashMap.get("succeeded"))) == 1) {
                        this.f10016e = true;
                    }
                } catch (Exception e8) {
                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("MSG_CASE_INIT_COMPLETED error: " + e8.getMessage());
                }
            }
            this.f10014c.a(1, hashMap);
            return;
        }
        if (i8 == 1001) {
            aVar.a(4, hashMap);
            return;
        }
        if (i8 == 1003) {
            aVar.a(5, hashMap);
            return;
        }
        if (i8 == 1005) {
            aVar.a(6, hashMap);
            return;
        }
        if (i8 == 1007) {
            aVar.a(7, hashMap);
            return;
        }
        if (i8 != 1901) {
            return;
        }
        if ("animation_end".equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.f10014c.a(2, hashMap);
        } else if ("click".equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.f10014c.a(3, hashMap);
        } else if ("animation_failed".equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.f10014c.a(8, hashMap);
        }
    }

    public void a(String str, String str2) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("runScript, mIsPaused=" + this.f10015d + ", mInitCompleted=" + this.f10016e);
        if (this.f10015d || !this.f10016e) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("lua is null");
            return;
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("runScript, lua: " + str);
        ArBridge.getInstance().sendLuaScriptToEngine(str.replace("dfk7fghdsf7d33e", str2));
    }

    public void a(float f8, float f9, float f10, String str) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setEuler, mIsPaused=" + this.f10015d + ", mInitCompleted=" + this.f10016e);
        if (this.f10015d || !this.f10016e) {
            return;
        }
        ArBridge.getInstance().setEuler(f8, f9, f10, str);
    }

    public void a(float f8) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setFrustum, mIsPaused=" + this.f10015d + ", mInitCompleted=" + this.f10016e);
        if (this.f10015d || !this.f10016e) {
            return;
        }
        float width = (b().getWidth() == 0 || b().getHeight() == 0) ? 0.0f : b().getWidth() / b().getHeight();
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setFrustum, aspect=" + width);
        ArBridge.getInstance().setFrustum(f8, width);
    }
}
