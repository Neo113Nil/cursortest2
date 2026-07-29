package com.cmplay.base.util.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.cmplay.base.util.c.a;
import com.cmplay.base.util.h;
import com.mopub.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ImageDownloadManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static d f3979b;

    /* renamed from: a, reason: collision with root package name */
    public Context f3980a;

    /* renamed from: c, reason: collision with root package name */
    private a f3981c;

    /* renamed from: d, reason: collision with root package name */
    private String f3982d = "";
    private boolean e = false;

    private d(Context context) {
        b(context);
    }

    public static d a(Context context) {
        if (f3979b == null) {
            f3979b = new d(context);
        }
        return f3979b;
    }

    public void b(Context context) {
        this.f3980a = context;
        if (!this.e) {
            this.f3981c = a.a(this.f3980a);
            if (this.f3980a.getCacheDir() != null) {
                this.f3982d = this.f3980a.getCacheDir().getAbsolutePath();
                this.f3981c.a(true);
                this.f3981c.a(this.f3982d);
            }
        }
        this.e = true;
    }

    public void a(ArrayList<String> arrayList, b bVar) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next(), bVar);
        }
    }

    public synchronized void a(final String str, final b bVar) {
        if (!TextUtils.isEmpty(str) && (str.startsWith(Constants.HTTP) || str.startsWith(Constants.HTTPS))) {
            this.f3981c.a(str, true, new a.InterfaceC0324a() { // from class: com.cmplay.base.util.c.d.1
                @Override // com.cmplay.base.util.c.a.InterfaceC0324a
                public void a(Bitmap bitmap, String str2) {
                    if (bitmap != null) {
                        String str3 = d.this.f3982d + "/" + e.b(str);
                        try {
                            Runtime.getRuntime().exec("chmod 777 " + str3);
                        } catch (Exception unused) {
                        }
                        if (bVar != null) {
                            bVar.a(bitmap, str2, str3);
                            return;
                        }
                        return;
                    }
                    if (bVar != null) {
                        bVar.a(str2, "Download image fail  imageUrl:" + str2);
                    }
                    h.a("图片下载失败  imageUrl:" + str2);
                }
            });
        }
    }
}
