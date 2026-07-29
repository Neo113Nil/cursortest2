package com.cmplay.internalpush.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.cmplay.base.util.c.d;
import com.cmplay.base.util.c.e;
import com.cmplay.base.util.h;
import com.cmplay.internalpush.ipc.IpcSpHelper;
import com.cmplay.internalpush.k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ImagePathUtil.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f4165b;

    /* renamed from: a, reason: collision with root package name */
    public Context f4166a;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f4167c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f4168d;
    private com.cmplay.base.util.c.b f;
    private boolean e = false;
    private ArrayList<com.cmplay.internalpush.a.a.a> g = new ArrayList<>();
    private HashMap<String, ArrayList<String>> h = new HashMap<>();
    private HashMap<String, Long> i = new HashMap<>();

    /* compiled from: ImagePathUtil.java */
    public interface a {
        void a(String str, String str2);
    }

    private b() {
    }

    public static b a() {
        if (f4165b == null) {
            f4165b = new b();
        }
        return f4165b;
    }

    public void a(Context context) {
        this.f4166a = context;
        if (!this.e) {
            this.f4167c = new HandlerThread("cloud_imgdown_thread");
            this.f4167c.start();
            this.f4168d = new Handler(this.f4167c.getLooper());
        }
        this.e = true;
    }

    public void a(com.cmplay.internalpush.a.a.a aVar) {
        if (this.g.contains(aVar)) {
            return;
        }
        this.g.add(aVar);
    }

    public void b() {
        for (int i = 0; i < this.g.size(); i++) {
            final com.cmplay.internalpush.a.a.a aVar = this.g.get(i);
            this.f4168d.post(new Runnable() { // from class: com.cmplay.internalpush.a.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    aVar.c();
                }
            });
        }
    }

    public synchronized String a(int i, String str) {
        String b2;
        b2 = com.ijinshan.cloudconfig.a.b(i, str);
        if (TextUtils.isEmpty(b2)) {
            com.ijinshan.cloudconfig.d.a.a("zzb_cloud", "CloudHelper.getData数据为空时 reloadData()");
            com.ijinshan.cloudconfig.a.d();
            b2 = com.ijinshan.cloudconfig.a.b(i, str);
        }
        IpcSpHelper.getInstance().sp_setBooleanValue(str, !TextUtils.isEmpty(b2));
        return b2;
    }

    public void a(final String str, ArrayList<String> arrayList, final a aVar) {
        final String str2 = str + "_";
        IpcSpHelper.getInstance().sp_removeSomeKey(str2, "");
        if (arrayList == null || arrayList.size() == 0) {
            int i = 0;
            if (TextUtils.equals(str, "open_screen_scene")) {
                i = 1;
            } else if (TextUtils.equals(str, "section_result_card")) {
                i = 2;
            } else if (TextUtils.equals(str, "section_setting_card")) {
                i = 3;
            } else if (TextUtils.equals(str, "section_family_popup")) {
                i = 5;
            }
            if (k.a() != null) {
                this.i.put(str, Long.valueOf(System.currentTimeMillis()));
                k.a().a(i);
                return;
            }
            return;
        }
        this.h.put(str, new ArrayList<>(new HashSet(arrayList)));
        d.a(this.f4166a).a(arrayList, new com.cmplay.base.util.c.b() { // from class: com.cmplay.internalpush.a.a.b.2
            @Override // com.cmplay.base.util.c.b
            public void a(String str3, String str4) {
                if (b.this.f != null) {
                    b.this.f.a(str3, str4);
                }
                h.a("图片下载失败：" + str3);
            }

            @Override // com.cmplay.base.util.c.b
            public void a(Bitmap bitmap, String str3, String str4) {
                h.a("图片下载成功：" + str4);
                IpcSpHelper.getInstance().sp_setStringValue(str2 + str3, str4);
                if (aVar != null) {
                    aVar.a(str3, str4);
                }
                b.this.a(str, str3);
            }
        });
    }

    public synchronized void a(String str, String str2) {
        ArrayList<String> arrayList = this.h.get(str);
        if (arrayList != null && this.f4166a != null) {
            String absolutePath = this.f4166a.getCacheDir() != null ? this.f4166a.getCacheDir().getAbsolutePath() : "";
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!new File(absolutePath + "/" + e.b(it.next())).exists()) {
                        return;
                    }
                }
                int i = 0;
                if (TextUtils.equals(str, "open_screen_scene")) {
                    i = 1;
                } else if (TextUtils.equals(str, "section_result_card")) {
                    i = 2;
                } else if (TextUtils.equals(str, "section_setting_card")) {
                    i = 3;
                } else if (TextUtils.equals(str, "section_family_popup")) {
                    i = 5;
                }
                if (!this.i.containsKey(str) || System.currentTimeMillis() - this.i.get(str).longValue() >= 1000) {
                    h.a("zzb_img", "通知 ：" + i);
                    if (i != 0 && k.a() != null) {
                        this.i.put(str, Long.valueOf(System.currentTimeMillis()));
                        k.a().a(i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String a(Context context, String str, String str2) {
        return IpcSpHelper.getInstance().sp_getStringValue(str + "_" + str2, "");
    }
}
