package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.platform.comapi.walknavi.g.i.h.b;
import com.baidu.platform.comapi.walknavi.g.i.j.e;
import com.baidu.platform.comapi.walknavi.g.i.k.f;
import com.baidu.platform.comapi.walknavi.g.i.k.g;
import java.io.File;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9991a = true;

    /* renamed from: b, reason: collision with root package name */
    private Context f9992b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.a f9993c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.j.b f9994d;

    /* renamed from: f, reason: collision with root package name */
    private c f9996f;

    /* renamed from: g, reason: collision with root package name */
    private C0122b f9997g;

    /* renamed from: i, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.e.b f9999i;

    /* renamed from: l, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.h.b f10002l;

    /* renamed from: m, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.d f10003m;

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.j.c f9995e = null;

    /* renamed from: h, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.e.a f9998h = new com.baidu.platform.comapi.walknavi.g.i.e.a();

    /* renamed from: j, reason: collision with root package name */
    private d f10000j = d.INITIAL_STATE;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10001k = false;

    class a implements b.InterfaceC0123b {
        a() {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.b.InterfaceC0123b
        public void a(boolean z7, boolean z8) {
            b.this.f10001k = z8;
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("download so finished");
            if (z7) {
                b.this.d();
            } else {
                b.this.f9997g.a("download so failed");
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.h.b.InterfaceC0123b
        public void onDownloadProgress(int i8) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("so progress: " + i8);
            b.this.f9997g.a(i8 / 2);
        }
    }

    private enum d {
        INITIAL_STATE,
        QUERYING,
        DOWNLOADING,
        DOWNLOAD_FINISHED
    }

    public b(Context context) {
        this.f9992b = context;
        this.f10002l = new com.baidu.platform.comapi.walknavi.g.i.h.b(context);
        this.f10003m = new com.baidu.platform.comapi.walknavi.g.i.d(this.f9992b);
        f.b(this.f9992b.getPackageName());
    }

    private void h() {
        com.baidu.platform.comapi.walknavi.g.i.a aVar;
        d dVar = this.f10000j;
        if (dVar == d.INITIAL_STATE || dVar == d.DOWNLOAD_FINISHED) {
            a(this.f9998h);
            return;
        }
        if (dVar == d.QUERYING) {
            com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.f9993c;
            if (aVar2 != null) {
                aVar2.a(7, "query in progress");
                return;
            }
            return;
        }
        if (dVar != d.DOWNLOADING || (aVar = this.f9993c) == null) {
            return;
        }
        aVar.a(8, "download in progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f9994d = e.a(this.f9999i.d(), this.f9999i.f(), this.f9999i.e(), com.baidu.platform.comapi.walknavi.g.i.k.d.f10074d, this.f9997g);
    }

    private void e() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("download start");
        com.baidu.platform.comapi.walknavi.g.i.e.b bVar = this.f9999i;
        if (bVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ERROR!! bundle data is null");
        } else if (TextUtils.isEmpty(bVar.a())) {
            this.f9997g.a("so url is null");
        } else {
            this.f10002l.a(new a());
            this.f10002l.e(bVar.a());
        }
    }

    private void f() {
        com.baidu.platform.comapi.walknavi.g.i.e.b bVar = this.f9999i;
        if (bVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ERROR!! mARResource is null");
        } else {
            if (TextUtils.isEmpty(bVar.e())) {
                return;
            }
            this.f10000j = d.DOWNLOADING;
            this.f9997g = new C0122b(this);
            e();
        }
    }

    public void b(String str, com.baidu.platform.comapi.walknavi.g.i.a aVar) {
        c();
        f9991a = true;
        this.f9998h.a(str);
        this.f9998h.a(4);
        this.f9993c = aVar;
        if (g.a(this.f9992b) != null) {
            h();
            return;
        }
        com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.f9993c;
        if (aVar2 != null) {
            aVar2.a(1, "no network");
        }
    }

    public void c() {
        b();
        a();
    }

    public boolean g() {
        return this.f10002l.c();
    }

    private static class c implements com.baidu.platform.comapi.walknavi.g.i.j.f<JSONObject> {

        /* renamed from: a, reason: collision with root package name */
        private SoftReference<b> f10006a;

        public c(b bVar) {
            this.f10006a = new SoftReference<>(bVar);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(JSONObject jSONObject) {
            try {
                if (this.f10006a.get() != null) {
                    this.f10006a.get().a(jSONObject);
                }
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query onResponse exception: " + e8.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        public void a(String str) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("http error msg = " + str);
            try {
                if (this.f10006a.get() != null) {
                    this.f10006a.get().f10000j = d.INITIAL_STATE;
                    if (this.f10006a.get().f9993c != null) {
                        this.f10006a.get().f9993c.a(5, str);
                    }
                    this.f10006a.get().f9995e = null;
                }
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query onErrorResponse exception: " + e8.getMessage());
            }
        }

        public void a() {
            try {
                if (this.f10006a.get() != null) {
                    this.f10006a.get().f10000j = d.INITIAL_STATE;
                }
                this.f10006a.clear();
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("query destroy exception: " + e8.getMessage());
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.walknavi.g.i.b$b, reason: collision with other inner class name */
    private static class C0122b implements com.baidu.platform.comapi.walknavi.g.i.j.a<String> {

        /* renamed from: a, reason: collision with root package name */
        private SoftReference<b> f10005a;

        public C0122b(b bVar) {
            this.f10005a = new SoftReference<>(bVar);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        public void a(String str) {
            try {
                if (this.f10005a.get() != null) {
                    this.f10005a.get().f10000j = d.DOWNLOAD_FINISHED;
                    if (this.f10005a.get().f9993c != null) {
                        this.f10005a.get().f9993c.a(6, str);
                    }
                }
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onErrorResponse exception: " + e8.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(String str) {
            try {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download res finished");
                if (this.f10005a.get() != null) {
                    this.f10005a.get().f10000j = d.DOWNLOAD_FINISHED;
                    if (this.f10005a.get().f9993c != null) {
                        this.f10005a.get().f9993c.a(0, str);
                        if (this.f10005a.get().f9999i != null) {
                            this.f10005a.get().f10003m.a(this.f10005a.get().f9999i.d(), str);
                        }
                    }
                }
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onResponse exception: " + e8.getMessage());
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.a
        public void a(int i8) {
            try {
                if (this.f10005a.get() == null || this.f10005a.get().f9993c == null) {
                    return;
                }
                this.f10005a.get().f9993c.a(b(i8));
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onProgress exception: " + e8.getMessage());
            }
        }

        private int b(int i8) {
            return (this.f10005a.get() == null || !this.f10005a.get().f10001k) ? i8 : (i8 / 2) + 50;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.j.a
        public void a(boolean z7, float f8) {
            try {
                if (this.f10005a.get() != null) {
                    this.f10005a.get().f10000j = d.DOWNLOAD_FINISHED;
                    if (this.f10005a.get().f9993c != null) {
                        com.baidu.platform.comapi.walknavi.g.i.k.a.a("isUpdate=" + z7 + ", size=" + f8);
                        if (this.f10005a.get().f10002l != null && this.f10005a.get().f9999i != null && this.f10005a.get().f10002l.d(this.f10005a.get().f9999i.a())) {
                            z7 = true;
                        }
                        this.f10005a.get().f9993c.a(z7, f8);
                    }
                }
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download onUpdate exception: " + e8.getMessage());
            }
        }

        public void a() {
            try {
                if (this.f10005a.get() != null) {
                    this.f10005a.get().f10000j = d.INITIAL_STATE;
                }
                this.f10005a.clear();
            } catch (Exception e8) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("download destroy exception: " + e8.getMessage());
            }
        }
    }

    public void a(String str, com.baidu.platform.comapi.walknavi.g.i.a aVar) {
        c();
        f9991a = false;
        this.f9998h.a(str);
        this.f9998h.a(4);
        this.f9993c = aVar;
        if (g.a(this.f9992b) != null) {
            h();
            return;
        }
        com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.f9993c;
        if (aVar2 != null) {
            aVar2.a(1, "no network");
        }
    }

    private void b() {
        com.baidu.platform.comapi.walknavi.g.i.j.c cVar = this.f9995e;
        if (cVar != null) {
            cVar.a();
            this.f9995e = null;
        }
        c cVar2 = this.f9996f;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    public String a(String str) {
        if (this.f10002l.c()) {
            return this.f10003m.a(str);
        }
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("so not loaded");
        return "";
    }

    public boolean a(String str, boolean z7) {
        File[] listFiles;
        if (z7) {
            File file = new File(f.a(str, 4));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                String a8 = a(str);
                for (int i8 = 0; i8 < listFiles.length; i8++) {
                    File file2 = listFiles[i8];
                    if (file2 != null && !file2.getAbsolutePath().contains(a8)) {
                        f.a(new File(listFiles[i8].getAbsolutePath()));
                    }
                }
            }
            return true;
        }
        return f.a(new File(f.a(str, 4)));
    }

    private void a(com.baidu.platform.comapi.walknavi.g.i.e.a aVar) {
        this.f10000j = d.QUERYING;
        c cVar = new c(this);
        this.f9996f = cVar;
        com.baidu.platform.comapi.walknavi.g.i.j.c a8 = e.a(this.f9992b, aVar, cVar);
        this.f9995e = a8;
        if (a8 == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("Http Request Occur Error! Please Check");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        com.baidu.platform.comapi.walknavi.g.i.a aVar;
        if (jSONObject != null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("AR query response: " + jSONObject.toString());
        } else {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("AR query response is null");
        }
        com.baidu.platform.comapi.walknavi.g.i.e.b a8 = com.baidu.platform.comapi.walknavi.g.i.g.a.a(jSONObject);
        this.f9999i = a8;
        if (a8 == null && (aVar = this.f9993c) != null) {
            aVar.a(-1, "ar resource is null");
        }
        if (this.f9999i.b() != 0) {
            this.f10000j = d.INITIAL_STATE;
            int b8 = this.f9999i.b();
            if (b8 == 1051) {
                com.baidu.platform.comapi.walknavi.g.i.a aVar2 = this.f9993c;
                if (aVar2 != null) {
                    aVar2.a(3, this.f9999i.c());
                }
            } else if (b8 != 1052) {
                com.baidu.platform.comapi.walknavi.g.i.a aVar3 = this.f9993c;
                if (aVar3 != null) {
                    aVar3.a(-1, this.f9999i.c());
                }
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("error code = " + this.f9999i.b() + ", error msg = " + this.f9999i.c());
            } else {
                com.baidu.platform.comapi.walknavi.g.i.a aVar4 = this.f9993c;
                if (aVar4 != null) {
                    aVar4.a(4, this.f9999i.c());
                }
            }
            this.f9995e = null;
            return;
        }
        if (!this.f9999i.h() && this.f9999i.g()) {
            this.f9995e = null;
            f();
            return;
        }
        this.f10000j = d.INITIAL_STATE;
        com.baidu.platform.comapi.walknavi.g.i.a aVar5 = this.f9993c;
        if (aVar5 != null) {
            aVar5.a(2, "not support AR");
        }
        this.f9995e = null;
    }

    private void a() {
        com.baidu.platform.comapi.walknavi.g.i.j.b bVar = this.f9994d;
        if (bVar != null) {
            bVar.cancel(true);
            this.f9994d = null;
        }
        C0122b c0122b = this.f9997g;
        if (c0122b != null) {
            c0122b.a();
        }
        com.baidu.platform.comapi.walknavi.g.i.h.b bVar2 = this.f10002l;
        if (bVar2 != null) {
            bVar2.a();
        }
    }
}
