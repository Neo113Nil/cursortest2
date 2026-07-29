package com.dancingbogo.skyrolline.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.dancingbogo.skyrolline.GameApp;
import com.ijinshan.cloudconfig.deepcloudconfig.ConfigInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CloudConfigGetter.java */
/* loaded from: classes2.dex */
public class a implements c {

    /* renamed from: b, reason: collision with root package name */
    private static a f4556b;

    /* renamed from: c, reason: collision with root package name */
    private String f4558c = "unknow";

    /* renamed from: d, reason: collision with root package name */
    private Handler f4559d = new Handler(Looper.getMainLooper()) { // from class: com.dancingbogo.skyrolline.cloud.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    a.this.f4557a.a(null);
                    break;
                case 1:
                    a.this.f4557a.b(null);
                    break;
            }
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private c f4557a = new com.dancingbogo.skyrolline.cloud.a.a();

    private a() {
    }

    public static a a() {
        if (f4556b == null) {
            synchronized (a.class) {
                if (f4556b == null) {
                    f4556b = new a();
                }
            }
        }
        return f4556b;
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public List<String> a(int i, String str) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            List<ConfigInfo> a2 = com.ijinshan.cloudconfig.deepcloudconfig.a.a().a(Integer.valueOf(i), str);
            ArrayList arrayList = new ArrayList();
            if (a2 != null) {
                for (ConfigInfo configInfo : a2) {
                    if (configInfo != null && configInfo.getData() != null) {
                        arrayList.add(configInfo.getData());
                    }
                }
            }
            return arrayList;
        }
        return this.f4557a.a(i, str);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public String b(int i, String str) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.a.a().b(Integer.valueOf(i), str);
        }
        return this.f4557a.b(i, str);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public String a(int i, String str, String str2, String str3) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.b.a(Integer.valueOf(i), str, str2, str3);
        }
        return this.f4557a.a(i, str, str2, str3);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public int a(int i, String str, String str2, int i2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.b.a(Integer.valueOf(i), str, str2, i2);
        }
        return this.f4557a.a(i, str, str2, i2);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public long a(int i, String str, String str2, long j) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.b.a(Integer.valueOf(i), str, str2, j);
        }
        return this.f4557a.a(i, str, str2, j);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public boolean a(int i, String str, String str2, boolean z) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.b.a(Integer.valueOf(i), str, str2, z);
        }
        return this.f4557a.a(i, str, str2, z);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public double a(int i, String str, String str2, double d2) {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            return com.ijinshan.cloudconfig.deepcloudconfig.b.a(Integer.valueOf(i), str, str2, d2);
        }
        return this.f4557a.a(i, str, str2, d2);
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public void a(Context context) {
        if (context == null) {
            context = GameApp.f4485a;
        }
        if (com.dancingbogo.skyrolline.c.a.a()) {
            b.a(context).a();
        } else {
            this.f4559d.sendEmptyMessage(0);
        }
    }

    @Override // com.dancingbogo.skyrolline.cloud.c
    public void b(Context context) {
        if (context == null) {
            context = GameApp.f4485a;
        }
        if (com.dancingbogo.skyrolline.c.a.a()) {
            b.a(context).b();
        } else {
            this.f4559d.sendEmptyMessage(1);
        }
    }
}
