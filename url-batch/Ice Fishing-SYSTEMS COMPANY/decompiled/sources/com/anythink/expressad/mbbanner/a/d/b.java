package com.anythink.expressad.mbbanner.a.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.mbbanner.a.b.e;
import com.anythink.expressad.mbbanner.a.c.d;
import com.anythink.expressad.mbbanner.a.c.f;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20052a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Context f20053b;

    /* renamed from: d, reason: collision with root package name */
    private e f20055d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.e.a f20056e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.b f20057f;

    /* renamed from: g, reason: collision with root package name */
    private d f20058g;

    /* renamed from: c, reason: collision with root package name */
    private int f20054c = 0;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f20059h = false;
    private Timer i = new Timer();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<String> f20060j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f20061k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f20062l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f20063m = false;

    /* renamed from: n, reason: collision with root package name */
    private String f20064n = "";

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20066b;

        public AnonymousClass1(String str, com.anythink.expressad.foundation.d.d dVar) {
            this.f20065a = str;
            this.f20066b = dVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (b.this.f20059h) {
                return;
            }
            b.b(b.this);
            b.this.a(this.f20065a, -1, "", false, this.f20066b);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.d.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.e f20068a;

        public AnonymousClass2(com.anythink.expressad.foundation.d.e eVar) {
            this.f20068a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<com.anythink.expressad.foundation.d.d> arrayList;
            String unused = b.f20052a;
            com.anythink.expressad.foundation.d.e eVar = this.f20068a;
            if (eVar != null && (arrayList = eVar.f18838K) != null && arrayList.size() > 0) {
                Context unused2 = b.this.f20053b;
                com.anythink.expressad.mbbanner.a.e.b.a();
            }
            String unused3 = b.f20052a;
        }
    }

    public b(Context context, e eVar, com.anythink.expressad.mbbanner.a.c.b bVar, com.anythink.expressad.mbbanner.a.e.a aVar) {
        this.f20053b = context.getApplicationContext();
        this.f20055d = eVar;
        this.f20057f = bVar;
        this.f20056e = aVar;
    }

    public static /* synthetic */ boolean b(b bVar) {
        bVar.f20059h = true;
        return true;
    }

    public static class a implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        private b f20070a;

        /* renamed from: b, reason: collision with root package name */
        private String f20071b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20072c;

        public a(b bVar, String str, com.anythink.expressad.foundation.d.d dVar) {
            this.f20070a = bVar;
            this.f20071b = str;
            this.f20072c = dVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            b bVar = this.f20070a;
            if (bVar != null) {
                bVar.a(this.f20071b, 1, str, true, this.f20072c);
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            b bVar = this.f20070a;
            if (bVar != null) {
                bVar.a(this.f20071b, 1, str2, false, this.f20072c);
            }
        }
    }

    private void b(String str, com.anythink.expressad.foundation.d.d dVar) {
        this.i.schedule(new AnonymousClass1(str, dVar), 60000L);
    }

    private int c() {
        try {
            int b9 = this.f20055d.b();
            if (b9 > this.f20055d.c()) {
                return 0;
            }
            return b9;
        } catch (Exception e6) {
            e6.printStackTrace();
            return 0;
        }
    }

    private void a(String str) {
        if (this.f20063m) {
            return;
        }
        if ((this.f20061k || this.f20062l) && this.f20060j.size() == 0) {
            this.f20059h = true;
            this.f20063m = true;
            this.i.cancel();
            this.f20056e.a(this.f20057f, str);
            this.f20058g.a(str);
        }
    }

    private void b(String str, String str2, com.anythink.expressad.foundation.d.d dVar) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f fVar = new f(this, str, dVar);
        new com.anythink.expressad.foundation.g.g.a.e().a(dVar);
        i.a().a(str2, fVar);
    }

    private void b(com.anythink.expressad.foundation.d.e eVar) {
        new Thread(new AnonymousClass2(eVar)).start();
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar) {
        this.f20059h = true;
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19113A);
        cVar.b(str);
        cVar.a(dVar);
        this.f20056e.b(this.f20057f, cVar);
        this.f20058g.a(str);
    }

    private String b() {
        return this.f20055d.a();
    }

    private void b(String str) {
        this.f20055d.a(str);
    }

    private void b(String str, List<com.anythink.expressad.foundation.d.d> list) {
        int i = this.f20054c;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    i += list.size();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                return;
            }
        }
        if (i > this.f20055d.c()) {
            i = 0;
        }
        if (y.b(str)) {
            this.f20055d.a(i);
        }
    }

    public final void a(String str, int i, String str2, boolean z8, com.anythink.expressad.foundation.d.d dVar) {
        if (!z8) {
            this.i.cancel();
            this.f20059h = true;
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19113A);
            cVar.b(str);
            cVar.a(dVar);
            this.f20056e.b(this.f20057f, cVar);
            this.f20058g.a(str);
            return;
        }
        if (i == 1) {
            synchronized (this) {
                try {
                    this.f20060j.remove(str2);
                    if (this.f20060j.size() == 0) {
                        a(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (i == 2) {
            this.f20062l = true;
            a(str);
        } else if (i == 3) {
            this.f20061k = true;
            a(str);
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.e eVar, d dVar) {
        com.anythink.expressad.foundation.e.c cVar;
        com.anythink.expressad.foundation.d.d dVar2;
        this.f20058g = dVar;
        if (eVar == null) {
            com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19140d);
            cVar2.b(str);
            this.f20056e.a(this.f20057f, cVar2);
            this.f20058g.a(str);
            return;
        }
        List<com.anythink.expressad.foundation.d.d> a9 = a(eVar);
        new Thread(new AnonymousClass2(eVar)).start();
        int i = 0;
        if (a9.size() == 0) {
            if (this.f20064n.contains("INSTALLED")) {
                cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19156u, com.anythink.expressad.reward.a.d.f20392a);
            } else {
                cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19140d);
            }
            cVar.b(str);
            ArrayList<com.anythink.expressad.foundation.d.d> arrayList = eVar.f18838K;
            if (arrayList != null && arrayList.size() > 0 && (dVar2 = eVar.f18838K.get(0)) != null) {
                cVar.a(dVar2);
            }
            this.f20056e.a(this.f20057f, cVar);
            this.f20058g.a(str);
            return;
        }
        com.anythink.expressad.foundation.d.d dVar3 = a9.get(0);
        this.i.schedule(new AnonymousClass1(str, dVar3), 60000L);
        this.f20055d.a(eVar.c());
        int i4 = this.f20054c;
        try {
            if (a9.size() > 0) {
                i4 += a9.size();
            }
            if (i4 > this.f20055d.c()) {
                i4 = 0;
            }
            if (y.b(str)) {
                this.f20055d.a(i4);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        String trim = dVar3.p().trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!TextUtils.isEmpty(trim)) {
                f fVar = new f(this, str, dVar3);
                new com.anythink.expressad.foundation.g.g.a.e().a(dVar3);
                i.a().a(trim, fVar);
            }
            if (a9.size() > 0) {
                while (i < a9.size()) {
                    a9.get(i).d(dVar3.p());
                    a9.get(i).a(true);
                    i++;
                }
            }
        } else {
            String trim2 = dVar3.q().trim();
            if (!TextUtils.isEmpty(trim2)) {
                String a10 = a(str, trim2, dVar3);
                if (a9.size() > 0) {
                    while (i < a9.size()) {
                        a9.get(i).e(a10);
                        a9.get(i).a(trim2.contains("<MBTPLMARK>"));
                        i++;
                    }
                }
            } else {
                this.f20062l = true;
                this.f20061k = true;
            }
        }
        a(str, a9);
    }

    private List<com.anythink.expressad.foundation.d.d> a(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            try {
                ArrayList<com.anythink.expressad.foundation.d.d> arrayList2 = eVar.f18838K;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList<com.anythink.expressad.foundation.d.d> arrayList3 = eVar.f18838K;
                    arrayList3.size();
                    for (int i = 0; i < arrayList3.size(); i++) {
                        com.anythink.expressad.foundation.d.d dVar = arrayList3.get(i);
                        if (dVar != null) {
                            if (dVar.P() != 99) {
                                if (TextUtils.isEmpty(dVar.p()) && TextUtils.isEmpty(dVar.q()) && TextUtils.isEmpty(dVar.bm())) {
                                }
                                if (v.a(dVar)) {
                                    dVar.k(v.a(this.f20053b, dVar.bi()) ? 1 : 2);
                                }
                                if (l.a(this.f20053b, dVar)) {
                                    arrayList.add(dVar);
                                } else {
                                    this.f20064n = com.anythink.expressad.reward.a.d.f20392a;
                                }
                            }
                        }
                    }
                    arrayList.size();
                    return arrayList;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.d dVar : list) {
            if (!TextUtils.isEmpty(dVar.bm())) {
                this.f20060j.add(dVar.bm());
                com.anythink.expressad.foundation.g.d.b.a(this.f20053b).a(dVar.bm(), new a(this, str, dVar));
            }
        }
    }

    private String a(String str, String str2, com.anythink.expressad.foundation.d.d dVar) {
        File file;
        Throwable th;
        File file2;
        FileOutputStream fileOutputStream;
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                    String a9 = s.a(z.b(str2));
                    if (TextUtils.isEmpty(a9)) {
                        a9 = String.valueOf(System.currentTimeMillis());
                    }
                    file2 = new File(b9, a9.concat(".html"));
                    Uri.parse(str2).getPath();
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.flush();
            str3 = file2.getAbsolutePath();
            fileOutputStream.close();
        } catch (Exception e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            file = new File(str3);
            if (!file.exists()) {
            }
            a(str, 2, str2, false, dVar);
            return str3;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    throw th;
                }
            }
            throw th;
        }
        file = new File(str3);
        if (!file.exists() && file.isFile() && file.canRead()) {
            a(str, 2, str2, true, dVar);
        } else {
            a(str, 2, str2, false, dVar);
        }
        return str3;
    }
}
