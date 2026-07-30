package com.anythink.expressad.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.splash.a.b;
import com.anythink.expressad.splash.c.c;
import com.anythink.expressad.splash.c.g;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static String f20703c = "SplashLoadManager";

    /* renamed from: l, reason: collision with root package name */
    private static final int f20704l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f20705m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20706n = 3;

    /* renamed from: B, reason: collision with root package name */
    private int f20708B;

    /* renamed from: C, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20709C;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.foundation.d.d f20714b;

    /* renamed from: d, reason: collision with root package name */
    private String f20715d;

    /* renamed from: e, reason: collision with root package name */
    private String f20716e;

    /* renamed from: f, reason: collision with root package name */
    private long f20717f;

    /* renamed from: g, reason: collision with root package name */
    private long f20718g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.splash.d.b f20719h;

    /* renamed from: j, reason: collision with root package name */
    private ATSplashView f20720j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.f.c f20721k;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20722o;

    /* renamed from: p, reason: collision with root package name */
    private int f20723p;

    /* renamed from: q, reason: collision with root package name */
    private int f20724q;

    /* renamed from: r, reason: collision with root package name */
    private int f20725r;

    /* renamed from: s, reason: collision with root package name */
    private String f20726s;

    /* renamed from: t, reason: collision with root package name */
    private int f20727t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20728u;

    /* renamed from: v, reason: collision with root package name */
    private volatile boolean f20729v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.expressad.videocommon.d.c f20730w;

    /* renamed from: x, reason: collision with root package name */
    private i.d f20731x;

    /* renamed from: y, reason: collision with root package name */
    private String f20732y;

    /* renamed from: z, reason: collision with root package name */
    private int f20733z;

    /* renamed from: A, reason: collision with root package name */
    private String f20707A = "";

    /* renamed from: D, reason: collision with root package name */
    private String f20710D = "";

    /* renamed from: E, reason: collision with root package name */
    private Handler f20711E = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.e.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i4 = message.arg1;
                if (obj instanceof com.anythink.expressad.foundation.d.d) {
                    com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) obj;
                    e.a(e.this, i.a().b(dVar.b()), dVar, i4);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof com.anythink.expressad.foundation.d.d) {
                    e eVar = e.this;
                    eVar.b((com.anythink.expressad.foundation.d.d) obj2, eVar.f20727t);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i9 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(com.anythink.expressad.foundation.g.a.f19251q);
                    com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) ((Bundle) obj3).getSerializable("campaignex");
                    com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(i9 == 1 ? com.anythink.expressad.foundation.e.b.f19141e : i9 == 2 ? com.anythink.expressad.foundation.e.b.f19143g : com.anythink.expressad.foundation.e.b.f19113A);
                    cVar.a(string);
                    e eVar2 = e.this;
                    String unused = eVar2.f20726s;
                    int unused2 = e.this.f20727t;
                    eVar2.a(cVar, dVar2);
                }
            } catch (Exception e6) {
                com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19159x);
                cVar2.a((Throwable) e6);
                e eVar3 = e.this;
                String unused3 = eVar3.f20726s;
                int unused4 = e.this.f20727t;
                eVar3.a(cVar2, (com.anythink.expressad.foundation.d.d) null);
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private Runnable f20712F = new Runnable() { // from class: com.anythink.expressad.splash.c.e.2
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19146k);
            e eVar = e.this;
            String unused = eVar.f20726s;
            int unused2 = e.this.f20727t;
            eVar.a(cVar, (com.anythink.expressad.foundation.d.d) null);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    boolean f20713a = false;
    private Context i = t.b().g();

    /* renamed from: com.anythink.expressad.splash.c.e$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20739a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20740b;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f20739a = dVar;
            this.f20740b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File file;
            final File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f20739a.c());
                        try {
                            if (!file2.exists()) {
                                String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                String a9 = s.a(z.b(this.f20739a.c()));
                                if (TextUtils.isEmpty(a9)) {
                                    a9 = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(b9, a9.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            fileOutputStream2.write(("<script>" + com.anythink.core.common.v.z.a().b() + "</script>" + this.f20739a.c()).getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e6) {
                                            e = e6;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f20739a.j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                            if (!file2.exists()) {
                                            }
                                            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                                            e eVar = e.this;
                                            String unused = eVar.f20726s;
                                            eVar.a(cVar, this.f20739a);
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            file = file2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    file = null;
                }
                if (!file2.exists() && file2.isFile() && file2.canRead()) {
                    this.f20739a.b(file2.getAbsolutePath());
                    t.b().b(new Runnable() { // from class: com.anythink.expressad.splash.c.e.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar2 = e.this;
                            String str = "file:////" + file2.getAbsolutePath();
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            e.a(eVar2, str, anonymousClass4.f20739a, anonymousClass4.f20740b);
                        }
                    });
                } else {
                    com.anythink.expressad.foundation.e.c cVar2 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                    e eVar2 = e.this;
                    String unused2 = eVar2.f20726s;
                    eVar2.a(cVar2, this.f20739a);
                }
            } catch (Exception unused3) {
                com.anythink.expressad.foundation.e.c cVar3 = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19148m);
                e eVar3 = e.this;
                String unused4 = eVar3.f20726s;
                eVar3.a(cVar3, this.f20739a);
            }
        }
    }

    public e(String str, String str2, long j9) {
        this.f20716e = str;
        this.f20715d = str2;
        this.f20718g = j9;
    }

    private boolean f() {
        return this.f20722o;
    }

    private int g() {
        return this.f20723p;
    }

    private void h() {
        try {
            int i = this.f20733z + 1;
            this.f20733z = i;
            com.anythink.expressad.f.c cVar = this.f20721k;
            if (cVar != null && i <= cVar.t()) {
                return;
            }
            this.f20733z = 0;
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private static void i() {
    }

    private static void j() {
    }

    private void k() {
        this.f20733z = 0;
    }

    private static void l() {
    }

    private void m() {
        this.f20711E.removeCallbacks(this.f20712F);
    }

    /* renamed from: com.anythink.expressad.splash.c.e$7, reason: invalid class name */
    public class AnonymousClass7 implements g.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20751b;

        public AnonymousClass7(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f20750a = dVar;
            this.f20751b = i;
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a() {
            if (this.f20750a.t()) {
                return;
            }
            e.c(e.this, this.f20750a, this.f20751b);
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a(String str) {
            e.a(e.this, str, this.f20750a);
        }

        @Override // com.anythink.expressad.splash.c.g.b
        public final void a(int i) {
            if (i == 1) {
                e.c(e.this, this.f20750a, this.f20751b);
            } else {
                e.a(e.this, "readyState 2", this.f20750a);
            }
        }
    }

    private void e(com.anythink.expressad.foundation.d.d dVar, int i) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
    }

    private void f(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            return;
        }
        this.f20731x = new AnonymousClass5(dVar, i);
        com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
        eVar.b();
        eVar.a();
        eVar.a(dVar);
        eVar.a(dVar.aD() != null ? dVar.aD().f18689a : 0);
        i.a().b(dVar.b(), (i.a) this.f20731x);
    }

    private void g(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            b.a aVar = new b.a();
            aVar.b(this.f20715d).a(this.f20716e).a(this.f20722o).a(dVar).a(this.f20723p).h(this.f20708B);
            try {
                if (!TextUtils.isEmpty(dVar.b())) {
                    Uri parse = Uri.parse(dVar.b());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter("alecfc");
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            c unused = c.a.f20698a;
            a.a(this.f20720j, new com.anythink.expressad.splash.a.b(aVar), new AnonymousClass6(dVar, i));
        }
    }

    private void i(com.anythink.expressad.foundation.d.d dVar, int i) {
        this.f20730w = new AnonymousClass8(dVar);
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.anythink.expressad.videocommon.b.e.a().a(this.f20715d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f20730w);
        if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f20715d, dVar.B())) {
            com.anythink.expressad.videocommon.b.e.a().d(this.f20715d);
        } else {
            this.f20720j.setVideoReady(true);
            b(dVar, i);
        }
    }

    public final void b(boolean z8) {
        this.f20722o = z8;
    }

    public final void c() {
        if (this.f20719h != null) {
            this.f20719h = null;
        }
        if (this.f20730w != null) {
            this.f20730w = null;
        }
        if (this.f20731x != null) {
            this.f20731x = null;
        }
    }

    public final com.anythink.expressad.foundation.d.d d() {
        return this.f20714b;
    }

    private void d(final com.anythink.expressad.foundation.d.d dVar, final int i) {
        d.a(this.f20720j, dVar, new com.anythink.expressad.splash.view.a() { // from class: com.anythink.expressad.splash.c.e.3
            @Override // com.anythink.expressad.splash.view.a
            public final void a() {
                if (dVar.j() && e.this.f20720j != null) {
                    e.this.f20720j.setImageReady(true);
                    e.b(e.this, dVar, i);
                }
                e.this.b(dVar, i);
            }

            @Override // com.anythink.expressad.splash.view.a
            public final void b() {
                if (!dVar.j() || e.this.f20720j == null) {
                    return;
                }
                e.this.f20720j.setImageReady(false);
                com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19113A);
                e eVar = e.this;
                String unused = eVar.f20726s;
                eVar.a(cVar, dVar);
            }
        });
    }

    public final void b(int i) {
        this.f20723p = i;
    }

    /* renamed from: com.anythink.expressad.splash.c.e$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.splash.b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20748b;

        public AnonymousClass6(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f20747a = dVar;
            this.f20748b = i;
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(View view) {
            if (e.this.f20720j != null) {
                e.this.f20720j.setDynamicView(true);
                e.this.f20720j.setSplashNativeView(view);
                e.this.b(this.f20747a, this.f20748b);
            }
        }

        @Override // com.anythink.expressad.splash.b.a
        public final void a(String str) {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19120H);
            cVar.a(str);
            e eVar = e.this;
            String unused = eVar.f20726s;
            eVar.a(cVar, this.f20747a);
        }
    }

    public final void a(int i) {
        this.f20708B = i;
    }

    public final String b() {
        return l.a(this.f20709C);
    }

    /* renamed from: com.anythink.expressad.splash.c.e$5, reason: invalid class name */
    public class AnonymousClass5 implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20745b;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f20744a = dVar;
            this.f20745b = i;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f20744a;
            obtain.arg1 = this.f20745b;
            e.this.f20711E.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19143g);
            e eVar = e.this;
            String unused = eVar.f20726s;
            eVar.a(cVar, this.f20744a);
            Message obtain = Message.obtain();
            obtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f20744a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19251q, str);
            bundle.putInt("type", 2);
            obtain.obj = bundle;
            e.this.f20711E.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (!d.a(this.f20720j, dVar) || this.f20729v) {
            return;
        }
        m();
        this.f20714b = dVar;
        this.f20729v = true;
        com.anythink.expressad.splash.d.b bVar = this.f20719h;
        if (bVar != null) {
            bVar.a(dVar, i);
        }
    }

    private void h(com.anythink.expressad.foundation.d.d dVar, int i) {
        if (this.f20720j.isH5Ready()) {
            return;
        }
        this.f20720j.setH5Ready(true);
        b(dVar, i);
    }

    public final void a(boolean z8) {
        this.f20713a = z8;
    }

    /* renamed from: com.anythink.expressad.splash.c.e$8, reason: invalid class name */
    public class AnonymousClass8 implements com.anythink.expressad.videocommon.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20753a;

        public AnonymousClass8(com.anythink.expressad.foundation.d.d dVar) {
            this.f20753a = dVar;
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str) {
            e.this.f20720j.setVideoReady(true);
            String unused = e.f20703c;
            Message obtain = Message.obtain();
            obtain.obj = this.f20753a;
            obtain.what = 3;
            e.this.f20711E.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.c
        public final void a(String str, String str2) {
            e.this.f20720j.setVideoReady(false);
            com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19141e);
            cVar.a(str);
            e eVar = e.this;
            String unused = eVar.f20726s;
            int unused2 = e.this.f20727t;
            eVar.a(cVar, this.f20753a);
            String unused3 = e.f20703c;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f20753a);
            bundle.putString(com.anythink.expressad.foundation.g.a.f19251q, str);
            bundle.putInt("type", 1);
            obtain.obj = bundle;
            obtain.what = 2;
            e.this.f20711E.sendMessage(obtain);
        }
    }

    public final void a(com.anythink.expressad.f.c cVar) {
        this.f20721k = cVar;
    }

    public final void a(ATSplashView aTSplashView) {
        this.f20720j = aTSplashView;
    }

    private void c(com.anythink.expressad.foundation.d.d dVar, int i) {
        this.f20720j.clearResState();
        if (!TextUtils.isEmpty(dVar.b()) && !dVar.j()) {
            this.f20731x = new AnonymousClass5(dVar, i);
            com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
            eVar.b();
            eVar.a();
            eVar.a(dVar);
            eVar.a(dVar.aD() != null ? dVar.aD().f18689a : 0);
            i.a().b(dVar.b(), (i.a) this.f20731x);
        }
        if (dVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            this.f20730w = new AnonymousClass8(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f20715d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f20730w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f20715d, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f20715d);
            } else {
                this.f20720j.setVideoReady(true);
                b(dVar, i);
            }
        }
        if (TextUtils.isEmpty(dVar.bm())) {
            return;
        }
        d(dVar, i);
    }

    public final void a(int i, int i4) {
        this.f20725r = i;
        this.f20724q = i4;
    }

    public final String a() {
        return this.f20707A;
    }

    private void b(com.anythink.expressad.foundation.e.c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (this.f20729v) {
            return;
        }
        m();
        this.f20729v = true;
        if (cVar != null) {
            cVar.a(dVar);
        }
        com.anythink.expressad.splash.d.b bVar = this.f20719h;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList arrayList;
        com.anythink.expressad.foundation.e.c cVar;
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList2;
        this.f20729v = false;
        this.f20726s = "";
        this.f20727t = 2;
        com.anythink.expressad.foundation.d.d dVar = null;
        if (eVar == null || eVar.f18838K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar2 = eVar.f18838K.get(0);
            dVar2.l(this.f20715d);
            this.f20732y = eVar.c();
            if (dVar2.P() != 99 && (!TextUtils.isEmpty(dVar2.b()) || !TextUtils.isEmpty(dVar2.c()))) {
                if (v.a(dVar2)) {
                    dVar2.k(v.a(this.i, dVar2.bi()) ? 1 : 2);
                }
                if (l.a(this.i, dVar2)) {
                    arrayList.add(dVar2);
                } else {
                    this.f20710D = com.anythink.expressad.reward.a.d.f20392a;
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            h();
            arrayList.size();
            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (TextUtils.isEmpty(dVar3.b()) && (TextUtils.isEmpty(dVar3.c()) || !dVar3.c().contains("<MBTPLMARK>"))) {
                dVar3.a(false);
                dVar3.b(true);
            } else {
                dVar3.a(true);
                dVar3.b(false);
            }
            ATSplashView aTSplashView = this.f20720j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (dVar3.j()) {
                d(dVar3, 2);
            } else {
                ATSplashView aTSplashView2 = this.f20720j;
                if (aTSplashView2 != null) {
                    aTSplashView2.setSplashWebview();
                }
            }
            if (d.a(this.f20720j, dVar3)) {
                b(dVar3, 2);
                return;
            }
            this.f20720j.clearResState();
            if (!TextUtils.isEmpty(dVar3.b()) && !dVar3.j()) {
                this.f20731x = new AnonymousClass5(dVar3, 2);
                com.anythink.expressad.foundation.g.g.a.e eVar2 = new com.anythink.expressad.foundation.g.g.a.e();
                eVar2.b();
                eVar2.a();
                eVar2.a(dVar3);
                eVar2.a(dVar3.aD() != null ? dVar3.aD().f18689a : 0);
                i.a().b(dVar3.b(), (i.a) this.f20731x);
            }
            if (dVar3.j()) {
                return;
            }
            if (!TextUtils.isEmpty(dVar3.c())) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar3, 2));
            }
            if (!TextUtils.isEmpty(dVar3.T())) {
                this.f20730w = new AnonymousClass8(dVar3);
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(dVar3);
                com.anythink.expressad.videocommon.b.e.a().a(this.f20715d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f20730w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f20715d, dVar3.B())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f20715d);
                } else {
                    this.f20720j.setVideoReady(true);
                    b(dVar3, 2);
                }
            }
            if (TextUtils.isEmpty(dVar3.bm())) {
                return;
            }
            d(dVar3, 2);
            return;
        }
        if (this.f20710D.contains("INSTALLED")) {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19156u, com.anythink.expressad.reward.a.d.f20392a);
        } else {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19140d);
        }
        if (eVar != null && (arrayList2 = eVar.f18838K) != null && arrayList2.size() != 0) {
            dVar = eVar.f18838K.get(0);
        }
        a(cVar, dVar);
    }

    private List<com.anythink.expressad.foundation.d.d> b(com.anythink.expressad.foundation.d.e eVar) {
        if (eVar == null || eVar.f18838K == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = eVar.f18838K.get(0);
        dVar.l(this.f20715d);
        this.f20732y = eVar.c();
        if (dVar.P() != 99 && (!TextUtils.isEmpty(dVar.b()) || !TextUtils.isEmpty(dVar.c()))) {
            if (v.a(dVar)) {
                dVar.k(v.a(this.i, dVar.bi()) ? 1 : 2);
            }
            if (l.a(this.i, dVar)) {
                arrayList.add(dVar);
                return arrayList;
            }
            this.f20710D = com.anythink.expressad.reward.a.d.f20392a;
        }
        return arrayList;
    }

    public static /* synthetic */ void b(e eVar, com.anythink.expressad.foundation.d.d dVar, int i) {
        if (dVar.j()) {
            b.a aVar = new b.a();
            aVar.b(eVar.f20715d).a(eVar.f20716e).a(eVar.f20722o).a(dVar).a(eVar.f20723p).h(eVar.f20708B);
            try {
                if (!TextUtils.isEmpty(dVar.b())) {
                    Uri parse = Uri.parse(dVar.b());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter("alecfc");
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            c unused = c.a.f20698a;
            a.a(eVar.f20720j, new com.anythink.expressad.splash.a.b(aVar), eVar.new AnonymousClass6(dVar, i));
        }
    }

    public static /* synthetic */ void c(e eVar, com.anythink.expressad.foundation.d.d dVar, int i) {
        if (eVar.f20720j.isH5Ready()) {
            return;
        }
        eVar.f20720j.setH5Ready(true);
        eVar.b(dVar, i);
    }

    private void a(long j9) {
        this.f20711E.postDelayed(this.f20712F, j9);
    }

    public final void a(com.anythink.expressad.splash.d.b bVar) {
        this.f20719h = bVar;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        ATSplashView aTSplashView = this.f20720j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (dVar.j()) {
            d(dVar, i);
        } else {
            ATSplashView aTSplashView2 = this.f20720j;
            if (aTSplashView2 != null) {
                aTSplashView2.setSplashWebview();
            }
        }
        if (d.a(this.f20720j, dVar)) {
            b(dVar, i);
            return;
        }
        this.f20720j.clearResState();
        if (!TextUtils.isEmpty(dVar.b()) && !dVar.j()) {
            this.f20731x = new AnonymousClass5(dVar, i);
            com.anythink.expressad.foundation.g.g.a.e eVar = new com.anythink.expressad.foundation.g.g.a.e();
            eVar.b();
            eVar.a();
            eVar.a(dVar);
            eVar.a(dVar.aD() != null ? dVar.aD().f18689a : 0);
            i.a().b(dVar.b(), (i.a) this.f20731x);
        }
        if (dVar.j()) {
            return;
        }
        if (!TextUtils.isEmpty(dVar.c())) {
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar, i));
        }
        if (!TextUtils.isEmpty(dVar.T())) {
            this.f20730w = new AnonymousClass8(dVar);
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(dVar);
            com.anythink.expressad.videocommon.b.e.a().a(this.f20715d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f20730w);
            if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f20715d, dVar.B())) {
                com.anythink.expressad.videocommon.b.e.a().d(this.f20715d);
            } else {
                this.f20720j.setVideoReady(true);
                b(dVar, i);
            }
        }
        if (TextUtils.isEmpty(dVar.bm())) {
            return;
        }
        d(dVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.e.c cVar, com.anythink.expressad.foundation.d.d dVar) {
        if (this.f20728u) {
            this.f20728u = false;
        } else {
            b(cVar, dVar);
        }
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        g.c cVar = new g.c();
        cVar.c(this.f20715d);
        cVar.b(this.f20716e);
        cVar.a(dVar);
        cVar.a(str);
        cVar.b(this.f20722o);
        cVar.a(this.f20723p);
        cVar.a(this.f20713a);
        g.a.f20762a.a(this.f20720j, cVar, new AnonymousClass7(dVar, i));
    }

    private void a(String str, com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19145j);
        cVar.a(str);
        a(cVar, dVar);
    }

    private void a(com.anythink.expressad.foundation.d.e eVar, int i) {
        ArrayList arrayList;
        com.anythink.expressad.foundation.e.c cVar;
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList2;
        com.anythink.expressad.foundation.d.d dVar = null;
        if (eVar == null || eVar.f18838K == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            com.anythink.expressad.foundation.d.d dVar2 = eVar.f18838K.get(0);
            dVar2.l(this.f20715d);
            this.f20732y = eVar.c();
            if (dVar2.P() != 99 && (!TextUtils.isEmpty(dVar2.b()) || !TextUtils.isEmpty(dVar2.c()))) {
                if (v.a(dVar2)) {
                    dVar2.k(v.a(this.i, dVar2.bi()) ? 1 : 2);
                }
                if (l.a(this.i, dVar2)) {
                    arrayList.add(dVar2);
                } else {
                    this.f20710D = com.anythink.expressad.reward.a.d.f20392a;
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            h();
            arrayList.size();
            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) arrayList.get(0);
            if (TextUtils.isEmpty(dVar3.b()) && (TextUtils.isEmpty(dVar3.c()) || !dVar3.c().contains("<MBTPLMARK>"))) {
                dVar3.a(false);
                dVar3.b(true);
            } else {
                dVar3.a(true);
                dVar3.b(false);
            }
            ATSplashView aTSplashView = this.f20720j;
            if (aTSplashView != null) {
                aTSplashView.setDynamicView(false);
            }
            if (dVar3.j()) {
                d(dVar3, i);
            } else {
                ATSplashView aTSplashView2 = this.f20720j;
                if (aTSplashView2 != null) {
                    aTSplashView2.setSplashWebview();
                }
            }
            if (d.a(this.f20720j, dVar3)) {
                b(dVar3, i);
                return;
            }
            this.f20720j.clearResState();
            if (!TextUtils.isEmpty(dVar3.b()) && !dVar3.j()) {
                this.f20731x = new AnonymousClass5(dVar3, i);
                com.anythink.expressad.foundation.g.g.a.e eVar2 = new com.anythink.expressad.foundation.g.g.a.e();
                eVar2.b();
                eVar2.a();
                eVar2.a(dVar3);
                eVar2.a(dVar3.aD() != null ? dVar3.aD().f18689a : 0);
                i.a().b(dVar3.b(), (i.a) this.f20731x);
            }
            if (dVar3.j()) {
                return;
            }
            if (!TextUtils.isEmpty(dVar3.c())) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass4(dVar3, i));
            }
            if (!TextUtils.isEmpty(dVar3.T())) {
                this.f20730w = new AnonymousClass8(dVar3);
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add(dVar3);
                com.anythink.expressad.videocommon.b.e.a().a(this.f20715d, copyOnWriteArrayList, com.anythink.expressad.foundation.g.a.aZ, this.f20730w);
                if (!com.anythink.expressad.videocommon.b.e.a().a(com.anythink.expressad.foundation.g.a.aZ, this.f20715d, dVar3.B())) {
                    com.anythink.expressad.videocommon.b.e.a().d(this.f20715d);
                } else {
                    this.f20720j.setVideoReady(true);
                    b(dVar3, i);
                }
            }
            if (TextUtils.isEmpty(dVar3.bm())) {
                return;
            }
            d(dVar3, i);
            return;
        }
        if (this.f20710D.contains("INSTALLED")) {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19156u, com.anythink.expressad.reward.a.d.f20392a);
        } else {
            cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19140d);
        }
        if (eVar != null && (arrayList2 = eVar.f18838K) != null && arrayList2.size() != 0) {
            dVar = eVar.f18838K.get(0);
        }
        a(cVar, dVar);
    }

    public static /* synthetic */ void a(e eVar, String str, com.anythink.expressad.foundation.d.d dVar, int i) {
        g.c cVar = new g.c();
        cVar.c(eVar.f20715d);
        cVar.b(eVar.f20716e);
        cVar.a(dVar);
        cVar.a(str);
        cVar.b(eVar.f20722o);
        cVar.a(eVar.f20723p);
        cVar.a(eVar.f20713a);
        g.a.f20762a.a(eVar.f20720j, cVar, eVar.new AnonymousClass7(dVar, i));
    }

    public static /* synthetic */ void a(e eVar, String str, com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.e.c cVar = new com.anythink.expressad.foundation.e.c(com.anythink.expressad.foundation.e.b.f19145j);
        cVar.a(str);
        eVar.a(cVar, dVar);
    }
}
