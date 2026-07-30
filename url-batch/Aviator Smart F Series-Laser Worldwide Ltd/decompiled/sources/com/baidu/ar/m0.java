package com.baidu.ar;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Log;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.s4;
import com.baidu.ar.util.SystemInfoUtil;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m0 implements ARPMessage.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public Context f2764a;

    /* renamed from: b, reason: collision with root package name */
    public ARPDataInteraction.c f2765b = new a(this);

    public class a implements ARPDataInteraction.c {
        public a(m0 m0Var) {
        }

        @Override // com.baidu.ar.arplay.core.engine.ARPDataInteraction.c
        public void a(String str, int i8, String str2, String str3) {
            SurfaceTexture d8 = zd.a().d(str);
            if (d8 != null) {
                try {
                    if (zd.a().c(str) != i8) {
                        zd.a().a(str, i8);
                    }
                    d8.updateTexImage();
                } catch (RuntimeException unused) {
                    zd.a().a(str, i8);
                }
            }
        }
    }

    public m0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2764a = applicationContext;
        com.baidu.ar.arplay.util.b.a(applicationContext);
        b();
    }

    public void a() {
        ARPMessage.getInstance().registerMessageHandler(0, this);
        ARPEngine.getInstance().initDataStore(this.f2764a.getSharedPreferences("baiduar_lua_data_store", 0));
    }

    public final void b() {
        ARPEngine.getInstance().setVideoUpdateCallback(this.f2765b);
    }

    public final void c(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        vd vdVar = new vd();
        if (hashMap.get("type") != null) {
            vdVar.b(a9.a(hashMap.get("type"), 0));
        }
        if (hashMap.get("interval") != null) {
            vdVar.a(a9.a(hashMap.get("interval"), 0));
        }
        if (hashMap.get("pattern") != null) {
            vdVar.a(a9.a(hashMap.get("pattern"), (String) null));
        }
        a(vdVar);
    }

    @Override // com.baidu.ar.arplay.core.message.ARPMessage.MessageHandler
    public void handleMessage(int i8, int i9, HashMap<String, Object> hashMap) {
        switch (i8) {
            case 0:
                if (i9 == -2) {
                    zd.a().d();
                    x0.g().h();
                    break;
                }
                break;
            case 8:
                ARPEngine.getInstance().onCaseLoadCompleted(hashMap);
                break;
            case 9:
                ARPEngine.getInstance().onCaseUnloadCompleted();
                break;
            case 1001:
            case 1003:
            case 1005:
            case 1007:
            case 1012:
                a(hashMap, i8);
                break;
            case 1021:
            case 1023:
            case 1025:
            case 1027:
                b(hashMap, i8);
                break;
            case 1401:
                b(hashMap);
                break;
            case 1501:
                c(hashMap);
                break;
            case 1901:
                a(hashMap);
                break;
        }
    }

    public final void a(pc pcVar) {
        a("phone_call");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + pcVar.a()));
        if (intent.resolveActivity(this.f2764a.getPackageManager()) != null) {
            this.f2764a.startActivity(intent);
        }
    }

    public final void b(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        pc pcVar = new pc();
        Object obj = hashMap.get("number");
        if (obj != null) {
            pcVar.a((String) obj);
        }
        a(pcVar);
    }

    public final void a(vd vdVar) {
        a("vibrate");
        int c8 = vdVar.c();
        if (c8 == 0) {
            wd.a(this.f2764a).a(vdVar.a());
            return;
        }
        if (c8 != 1) {
            return;
        }
        long[] jArr = null;
        String[] split = vdVar.b() != null ? vdVar.b().split(SystemInfoUtil.COMMA) : null;
        if (split != null && split.length > 0) {
            int length = split.length;
            jArr = new long[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    jArr[i8] = Long.parseLong(split[i8]);
                } catch (NumberFormatException e8) {
                    e8.printStackTrace();
                }
            }
        }
        wd.a(this.f2764a).a(jArr);
    }

    public final void b(HashMap<String, Object> hashMap, int i8) {
        if (hashMap == null) {
            return;
        }
        xd xdVar = new xd();
        if (hashMap.get("url") != null) {
            xdVar.c(a9.a(hashMap.get("url"), (String) null));
        }
        if (hashMap.get("id") != null) {
            xdVar.a(a9.a(hashMap.get("id"), (String) null));
        }
        if (hashMap.get("texture_id") != null) {
            xdVar.b(a9.a(hashMap.get("texture_id"), -1));
        }
        if (hashMap.get("loop") != null) {
            int a8 = a9.a(hashMap.get("loop"), 0);
            xdVar.a(a9.a(hashMap.get("loop"), 0));
            if (a8 <= 0) {
                xdVar.a(true);
            }
        }
        if (hashMap.get("target") != null) {
            xdVar.b(a9.a(hashMap.get("target"), (String) null));
        }
        if (hashMap.get("from_time") != null) {
            xdVar.a(a9.a(hashMap.get("from_time"), 0));
            Log.e("VideoTest", "bean fromTime: " + xdVar.a());
        }
        if (i8 == 1021) {
            zd.a().a(xdVar, hashMap);
            return;
        }
        if (i8 == 1023) {
            zd.a().b(xdVar, hashMap);
        } else if (i8 == 1025) {
            zd.a().c(xdVar, hashMap);
        } else {
            if (i8 != 1027) {
                return;
            }
            zd.a().d(xdVar, hashMap);
        }
    }

    public final void a(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", str);
        handleMessage(1801, 0, hashMap);
    }

    public final void a(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        String a8 = a9.a(hashMap.get("event_name"), "");
        s4.b bVar = new s4.b();
        if ("load_webview".equals(a8)) {
            bVar.f3197a = a9.a(hashMap.get("texture_id"), 0);
            bVar.f3201e = a9.a(hashMap.get(com.arthenica.ffmpegkit.x.KEY_WIDTH), 0);
            bVar.f3202f = a9.a(hashMap.get(com.arthenica.ffmpegkit.x.KEY_HEIGHT), 0);
            bVar.f3200d = a9.a(hashMap.get("url"), (String) null);
            bVar.f3198b = a9.a(hashMap.get("is_remote"), 0) == 1;
            t4.a().a(bVar);
            return;
        }
        if ("update_webview_js".equals(a8)) {
            bVar.f3197a = a9.a(hashMap.get("texture_id"), 0);
            bVar.f3199c = a9.a(hashMap.get("js_code"), (String) null);
            t4.a().e(bVar);
        } else if ("load_native_webview".equals(a8)) {
            bVar.f3200d = a9.a(hashMap.get("url"), (String) null);
            bVar.f3198b = a9.a(hashMap.get("is_remote"), 0) == 1;
            t4.a().c(bVar);
        }
    }

    public final void a(HashMap<String, Object> hashMap, int i8) {
        if (hashMap == null) {
            return;
        }
        r0 r0Var = new r0();
        if (hashMap.get("url") != null) {
            r0Var.c(a9.a(hashMap.get("url"), (String) null));
        }
        if (hashMap.get("delay") != null) {
            r0Var.a(((Float) hashMap.get("delay")).floatValue());
        }
        if (hashMap.get("id") != null) {
            r0Var.a(a9.a(hashMap.get("id"), (String) null));
        }
        if (hashMap.get("loop") != null) {
            int intValue = ((Integer) hashMap.get("loop")).intValue();
            r0Var.a(intValue);
            if (intValue <= 0) {
                r0Var.a(true);
            }
        }
        if (hashMap.get("target") != null) {
            r0Var.b(a9.a(hashMap.get("target"), (String) null));
        }
        if (hashMap.get("from_time") != null) {
            r0Var.a(a9.a(hashMap.get("from_time"), 0));
        }
        if (i8 == 1001) {
            x0.g().a(r0Var, hashMap);
            return;
        }
        if (i8 == 1003) {
            x0.g().b(r0Var, hashMap);
            return;
        }
        if (i8 == 1005) {
            x0.g().d(r0Var, hashMap);
        } else if (i8 == 1007) {
            x0.g().e(r0Var, hashMap);
        } else {
            if (i8 != 1012) {
                return;
            }
            x0.g().c(r0Var, hashMap);
        }
    }
}
