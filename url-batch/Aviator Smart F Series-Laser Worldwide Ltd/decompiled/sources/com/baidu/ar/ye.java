package com.baidu.ar;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ye {

    /* renamed from: a, reason: collision with root package name */
    public g7 f3778a = new se();

    /* renamed from: b, reason: collision with root package name */
    public i7 f3779b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3780c;

    public class a implements h7 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3781a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3782b;

        public a(String str, String str2) {
            this.f3781a = str;
            this.f3782b = str2;
        }

        @Override // com.baidu.ar.h7
        public void a(int i8, String str, boolean z7) {
        }

        @Override // com.baidu.ar.h7
        public void onError(int i8, String str) {
            h.a(str);
            if (ye.this.f3779b != null) {
                ye.this.f3779b.a(i8, str);
            }
        }

        @Override // com.baidu.ar.h7
        public void onOpen() {
            ye.this.a(this.f3781a, this.f3782b);
            if (ye.this.f3779b != null) {
                ye.this.f3779b.a(true);
            }
        }

        @Override // com.baidu.ar.h7
        public void a(String str) {
            ye.this.a(str);
        }
    }

    public ye(i7 i7Var) {
        this.f3779b = i7Var;
    }

    public void b() {
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            g7Var.release();
        }
    }

    public void c() {
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            g7Var.a();
        }
    }

    public void d() {
        String str = NotificationCompat.CATEGORY_MESSAGE + System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("requestId", str);
        hashMap.put("action", "AUDIO_QUERY_INTERRUPT");
        String jSONObject = new JSONObject(hashMap).toString();
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            g7Var.a(jSONObject);
        }
    }

    public void a() {
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    public void b(String str, String str2) {
        this.f3780c = false;
        String b8 = qc.a().b(str);
        vb vbVar = new vb();
        vbVar.d(NotificationCompat.CATEGORY_MESSAGE + System.currentTimeMillis());
        vbVar.a(str2);
        vbVar.c("arkit");
        vbVar.b(b8);
        String jSONObject = vbVar.e().toString();
        this.f3778a.a(jSONObject);
        i7 i7Var = this.f3779b;
        if (i7Var != null) {
            i7Var.a(jSONObject);
        }
    }

    public final void a(String str) {
        char c8;
        String str2;
        try {
            wb a8 = wb.a(str);
            if (a8 == null) {
                return;
            }
            String a9 = a8.a();
            switch (a9.hashCode()) {
                case -1072073501:
                    if (a9.equals("AUDIO_QUERY_INTERRUPT")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -619950265:
                    if (a9.equals("THREEJS")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 291286536:
                    if (a9.equals("DOWN_CLIENT")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1669334218:
                    if (a9.equals("CONNECT")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2079549205:
                    if (a9.equals("DOWN_SUBTITLE")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            if (c8 != 0) {
                if (c8 == 1) {
                    if (this.f3780c) {
                        return;
                    }
                    yb a10 = a8.d() ? yb.a(new JSONObject(a8.b())) : null;
                    i7 i7Var = this.f3779b;
                    if (i7Var != null) {
                        i7Var.a(a10);
                        return;
                    }
                    return;
                }
                if (c8 == 2) {
                    if (a8.d()) {
                        i7 i7Var2 = this.f3779b;
                        if (i7Var2 != null) {
                            i7Var2.a(a8);
                            return;
                        }
                        return;
                    }
                    i7 i7Var3 = this.f3779b;
                    if (i7Var3 != null) {
                        i7Var3.a((wb) null);
                        return;
                    }
                    return;
                }
                if (c8 == 3) {
                    xb a11 = a8.d() ? xb.a(new JSONObject(a8.b())) : null;
                    i7 i7Var4 = this.f3779b;
                    if (i7Var4 != null) {
                        i7Var4.a(a11);
                        return;
                    }
                    return;
                }
                if (c8 != 4) {
                    return;
                } else {
                    str2 = "record stop";
                }
            } else {
                str2 = "socket is connected";
            }
            h.a("DIGITAL_STATE", str2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        ub ubVar = new ub();
        ubVar.a(str);
        ubVar.b(str2);
        vb vbVar = new vb();
        vbVar.a("CONNECT");
        vbVar.c("arkit");
        vbVar.d("conn" + System.currentTimeMillis());
        vbVar.b(ubVar.c().toString());
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            g7Var.a(vbVar.e().toString());
        }
    }

    public void a(String str, String str2, String str3) {
        this.f3778a.b(str);
        this.f3778a.a(new a(str2, str3));
        this.f3778a.c();
    }

    public void a(byte[] bArr) {
        g7 g7Var = this.f3778a;
        if (g7Var != null) {
            if (bArr != null) {
                this.f3780c = true;
                g7Var.a(bArr);
            } else {
                d();
                this.f3780c = false;
            }
        }
    }
}
