package com.anythink.basead.b.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.anythink.basead.b.b.j;
import com.anythink.basead.b.c.e;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.mraid.i;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.a.a;
import com.anythink.core.common.res.b;
import com.anythink.core.common.v.o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class c implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6057a = "c";

    /* renamed from: b, reason: collision with root package name */
    w f6058b;

    /* renamed from: c, reason: collision with root package name */
    y f6059c;

    /* renamed from: d, reason: collision with root package name */
    x f6060d;

    /* renamed from: f, reason: collision with root package name */
    private String f6062f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6063g;

    /* renamed from: h, reason: collision with root package name */
    private int f6064h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f6065j;

    /* renamed from: k, reason: collision with root package name */
    private b f6066k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> f6067l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f6068m;

    /* renamed from: e, reason: collision with root package name */
    com.anythink.core.common.t.b f6061e = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6330d, com.anythink.basead.d.g.f6347v));
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private boolean f6069n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6070o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6071p = false;

    /* renamed from: com.anythink.basead.b.c.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6078b;

        public AnonymousClass4(String str, String str2) {
            this.f6077a = str;
            this.f6078b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String str = this.f6077a;
                String str2 = this.f6078b;
                MraidWebView mraidWebView = new MraidWebView(t.b().g());
                i.a aVar = new i.a() { // from class: com.anythink.basead.b.c.c.4.1
                    @Override // com.anythink.basead.mraid.i.a
                    public final void a() {
                        c.this.a(2);
                    }

                    @Override // com.anythink.basead.mraid.i.a
                    public final void a(com.anythink.basead.d.f fVar) {
                        c.this.a(fVar);
                    }
                };
                c cVar = c.this;
                com.anythink.basead.mraid.i.a(str, str2, mraidWebView, aVar, cVar.f6058b, cVar.f6060d, 5, false);
            } catch (Throwable th) {
                c.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6313L, com.anythink.basead.d.g.f6322U + th.getMessage()));
            }
        }
    }

    /* renamed from: com.anythink.basead.b.c.c$6, reason: invalid class name */
    public class AnonymousClass6 implements a.InterfaceC0092a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6084c;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f6086e = false;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.core.common.t.b f6087f = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.b.c.c.6.1
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, "h5 template load timeout"), 7, "h5 template load timeout", 0L);
            }
        };

        public AnonymousClass6(long j9, long j10, boolean z8) {
            this.f6082a = j9;
            this.f6083b = j10;
            this.f6084c = z8;
            com.anythink.core.common.t.d.a().a(this.f6087f, j9, false);
        }

        private void b() {
            com.anythink.core.common.t.d.a().b(this.f6087f);
        }

        private void a() {
            com.anythink.core.common.t.d.a().a(this.f6087f, this.f6082a, false);
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0092a
        public final void a(String str, final String str2, final long j9) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(c.this.f6058b.an(), str)) {
                return;
            }
            if (c.this.f6059c.bE() == 1) {
                final String a9 = d.a((x) null, c.this.f6058b, 3);
                t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.c.6.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            WTWebView wTWebView = new WTWebView(t.b().g());
                            try {
                                int i = c.this.f6060d.f14320j;
                                Object aVar = (i == 1 || i == 3) ? new com.anythink.basead.webtemplet.adformat.intestitial.a() : i != 4 ? null : new com.anythink.basead.webtemplet.adformat.splash.a();
                                String str3 = a9;
                                String uri = new File(str2).toURI().toString();
                                l.a aVar2 = new l.a() { // from class: com.anythink.basead.b.c.c.6.2.1
                                    @Override // com.anythink.basead.webtemplet.l.a
                                    public final void a() {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        AnonymousClass6.this.a(true, a9, j9);
                                    }

                                    @Override // com.anythink.basead.webtemplet.l.a
                                    public final void a(com.anythink.basead.d.f fVar) {
                                        AnonymousClass6.this.a(fVar, TextUtils.equals(fVar.a(), com.anythink.basead.d.g.f6346u) ? 5 : 4, fVar.c(), j9);
                                    }
                                };
                                c cVar = c.this;
                                l.a(str3, uri, wTWebView, aVar2, cVar.f6058b, cVar.f6060d, 1, aVar);
                            } catch (Throwable th) {
                                AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6313L, com.anythink.basead.d.g.ab + th.getMessage()), 6, com.anythink.basead.d.g.f6322U + th.getMessage(), 0L);
                            }
                        } catch (Throwable th2) {
                            AnonymousClass6.this.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6313L, com.anythink.basead.d.g.ab + th2.getMessage()), 6, com.anythink.basead.d.g.f6322U + th2.getMessage(), 0L);
                        }
                    }
                });
            } else {
                a(false, (String) null, j9);
            }
        }

        @Override // com.anythink.core.common.res.a.a.InterfaceC0092a
        public final void a(String str, int i, String str2) {
            if (TextUtils.equals(c.this.f6058b.an(), str)) {
                a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.ac, com.anythink.basead.d.g.ac.concat(String.valueOf(str2))), i, str2, 0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z8, String str, long j9) {
            if (this.f6086e && z8 && !TextUtils.isEmpty(str)) {
                d.e(str);
            }
            a(true, (com.anythink.basead.d.f) null, 0, "", j9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.anythink.basead.d.f fVar, int i, String str, long j9) {
            a(false, fVar, i, str, j9);
        }

        private void a(boolean z8, com.anythink.basead.d.f fVar, int i, String str, long j9) {
            if (this.f6086e) {
                return;
            }
            this.f6086e = true;
            b();
            if (!z8) {
                c cVar = c.this;
                com.anythink.core.common.u.e.a(cVar.f6058b, cVar.f6060d, false, System.currentTimeMillis() - this.f6083b, i, str, 0L);
                if (this.f6084c) {
                    c.this.a(5);
                    return;
                } else {
                    c.this.a(fVar);
                    return;
                }
            }
            c cVar2 = c.this;
            com.anythink.core.common.u.e.a(cVar2.f6058b, cVar2.f6060d, System.currentTimeMillis() - this.f6083b, j9);
            c.this.a(5);
        }
    }

    public class a implements com.anythink.basead.b.a.d<Void, com.anythink.basead.d.f> {
        private a() {
        }

        private void b() {
            if (c.this.f6066k != null) {
                String unused = c.this.i;
                c.this.f6066k.a();
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a(com.anythink.basead.d.f fVar) {
            com.anythink.basead.d.f fVar2 = fVar;
            if (c.this.f6066k != null) {
                String unused = c.this.i;
                c.this.f6066k.a(fVar2);
            }
            c.c(c.this);
        }

        public /* synthetic */ a(c cVar, byte b9) {
            this();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.anythink.basead.d.f fVar) {
            if (c.this.f6066k != null) {
                String unused = c.this.i;
                c.this.f6066k.a(fVar);
            }
            c.c(c.this);
        }

        @Override // com.anythink.basead.b.a.d
        public final /* synthetic */ void a() {
            if (c.this.f6066k != null) {
                String unused = c.this.i;
                c.this.f6066k.a();
            }
            c.c(c.this);
        }
    }

    public interface b {
        void a();

        void a(com.anythink.basead.d.f fVar);
    }

    /* renamed from: com.anythink.basead.b.c.c$c, reason: collision with other inner class name */
    public static final class C0008c {

        /* renamed from: a, reason: collision with root package name */
        static final int f6095a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f6096b = 2;

        /* renamed from: c, reason: collision with root package name */
        static final int f6097c = 3;

        /* renamed from: d, reason: collision with root package name */
        static final int f6098d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f6099e = 5;

        private C0008c() {
        }
    }

    public c(String str, boolean z8, w wVar, x xVar) {
        this.f6062f = str;
        this.f6063g = z8;
        this.f6058b = wVar;
        this.f6060d = xVar;
        y yVar = xVar.f14325o;
        this.f6059c = yVar;
        this.f6064h = yVar.w();
        com.anythink.basead.b.c.b bVar = new com.anythink.basead.b.c.b();
        this.f6067l = bVar;
        bVar.a((com.anythink.basead.b.a.d) new a(this, (byte) 0));
    }

    private boolean c() {
        x xVar = this.f6060d;
        if (!xVar.f14327q || !String.valueOf(xVar.f14320j).equals("0")) {
            return false;
        }
        w wVar = this.f6058b;
        return (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f6060d.f14326p || TextUtils.isEmpty(this.f6058b.B())) ? false : true;
    }

    private void d() {
        if (this.f6058b.ab() <= 0 && this.f6058b.ac() <= 0) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    String B8 = c.this.f6058b.B();
                    com.anythink.core.common.u.b.a();
                    String a9 = com.anythink.core.common.u.b.a(c.this.f6060d);
                    com.anythink.core.common.u.b.a().a(a9).f13790d = System.currentTimeMillis();
                    c.a(c.this, B8);
                    com.anythink.core.common.u.b.a().a(a9).f13791e = System.currentTimeMillis();
                    c.this.f6058b.ab();
                    c.this.f6058b.ac();
                    com.anythink.core.common.u.b.a().a(a9).a();
                    c.this.a(3);
                }
            }, 4);
            return;
        }
        this.f6058b.ab();
        this.f6058b.ac();
        a(3);
    }

    private boolean e() {
        if (!this.f6058b.L() || !String.valueOf(this.f6060d.f14320j).equals("0")) {
            return false;
        }
        w wVar = this.f6058b;
        if (((wVar instanceof r) && !TextUtils.isEmpty(((r) wVar).d())) || this.f6060d.f14326p) {
            return false;
        }
        d.a(this.f6058b, this.f6059c);
        return true;
    }

    private void f() {
        if (!d.a(this.f6058b, this.f6059c)) {
            a(4);
            return;
        }
        if (this.f6058b.V() > 0 && this.f6058b.W() > 0) {
            this.f6058b.V();
            this.f6058b.W();
            a(4);
        } else {
            com.anythink.core.common.u.b.a();
            String a9 = com.anythink.core.common.u.b.a(this.f6060d);
            com.anythink.core.common.u.b.a().a(a9).f13792f = System.currentTimeMillis();
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
                    newFixedThreadPool.submit(new Runnable() { // from class: com.anythink.basead.b.c.c.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                String c4 = com.anythink.core.common.res.d.a(t.b().g()).c(4, o.a(c.this.f6058b.E()));
                                if (new File(c4).exists()) {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(c4);
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                    mediaMetadataRetriever.release();
                                    c.this.f6058b.k(Integer.parseInt(extractMetadata));
                                    c.this.f6058b.l(Integer.parseInt(extractMetadata2));
                                    c.this.f6058b.a(Long.parseLong(extractMetadata3));
                                    com.anythink.core.common.u.b.a();
                                    String a10 = com.anythink.core.common.u.b.a(c.this.f6060d);
                                    com.anythink.core.common.u.b.a().a(a10).f13793g = System.currentTimeMillis();
                                    com.anythink.core.common.u.b.a().a(a10).b();
                                }
                                synchronized (newFixedThreadPool) {
                                    newFixedThreadPool.notifyAll();
                                }
                            } catch (Throwable unused) {
                                c.this.a(4);
                            }
                        }
                    });
                    try {
                        synchronized (newFixedThreadPool) {
                            newFixedThreadPool.wait(com.anythink.basead.exoplayer.i.a.f8040f);
                        }
                        newFixedThreadPool.shutdownNow();
                        c.this.a(4);
                    } catch (Throwable unused) {
                        c.this.a(4);
                    }
                }
            }, 2);
        }
    }

    private void g() {
        e.a().b(this);
        com.anythink.core.common.t.d.a().b(this.f6061e);
    }

    private void h() {
        com.anythink.core.common.t.d.a().a(this.f6061e, this.f6064h, false);
    }

    private void i() {
        int i;
        x xVar = this.f6060d;
        if (xVar != null && xVar.f14325o != null) {
            Context g9 = t.b().g();
            try {
                i = Math.min(g9.getResources().getDisplayMetrics().widthPixels, g9.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                i = 0;
            }
            if (String.valueOf(this.f6060d.f14320j).equals("1") && !this.f6058b.L() && this.f6060d.f14325o.ap() != 1) {
                com.anythink.core.d.b k6 = i.k(com.anythink.core.d.d.a(g9));
                int aq = this.f6060d.f14325o.aq();
                List<String> p6 = aq != 2 ? aq != 3 ? aq != 5 ? null : k6.p() : k6.q() : k6.o();
                if (p6 != null && p6.size() > 0) {
                    for (String str : p6) {
                        if (!TextUtils.isEmpty(str) && !d.b(str, 3)) {
                            com.anythink.core.common.res.b.a(g9).a(new com.anythink.core.common.res.e(3, str), i, i, null);
                        }
                    }
                }
            }
            if (this.f6060d.f14325o.W() == 1 && !TextUtils.isEmpty(this.f6060d.f14325o.f())) {
                com.anythink.core.common.res.b.a(g9).a(new com.anythink.core.common.res.e(3, this.f6060d.f14325o.f()), i, i, null);
            }
            if (this.f6060d.f14325o.aQ() == 4 && !TextUtils.isEmpty(this.f6060d.f14325o.bb()) && !com.anythink.core.common.res.d.a(g9).b(3, o.a(this.f6060d.f14325o.bb()))) {
                this.f6060d.f14325o.bb();
                new com.anythink.basead.b.c.a(this.f6060d.f14325o.bb()).d();
            }
        }
        List<String> e6 = this.f6058b.e((w) this.f6059c);
        if (e6.isEmpty()) {
            return;
        }
        for (String str2 : e6) {
            if (!TextUtils.isEmpty(str2)) {
                d.b(str2, 3);
                if (!d.b(str2, 3)) {
                    D.y.f().a(new com.anythink.core.common.res.e(3, str2), new b.a() { // from class: com.anythink.basead.b.c.c.5
                        @Override // com.anythink.core.common.res.b.a
                        public final void onFail(String str3, String str4) {
                        }

                        @Override // com.anythink.core.common.res.b.a
                        public final void onSuccess(String str3, Bitmap bitmap) {
                        }
                    });
                }
            }
        }
    }

    private void j() {
        String an = this.f6058b.an();
        if (TextUtils.isEmpty(an)) {
            a(5);
            return;
        }
        com.anythink.core.common.res.a.a.a(t.b().g()).a(an, new AnonymousClass6(this.f6059c.bL(), System.currentTimeMillis(), this.f6059c.bF() == 1));
    }

    private void b() {
        List<String> b9 = this.f6058b.b(this.f6059c);
        b9.size();
        if (b9.size() > 0) {
            for (int i = 0; i < b9.size(); i++) {
                String str = b9.get(i);
                if (!d.f(str)) {
                    new f(this.f6062f, this.f6063g, this.f6058b, str).d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r13 != 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        boolean z8;
        w wVar;
        boolean z9;
        String an;
        c cVar;
        w wVar2 = this.f6058b;
        if (wVar2 != null && this.f6067l != null) {
            this.i = wVar2.v();
            this.f6066k = bVar;
            com.anythink.core.common.t.d.a().a(this.f6061e, this.f6064h, false);
            int ao = this.f6058b.ao();
            x xVar = this.f6060d;
            int i = xVar.f14320j;
            if (ao != 1) {
                if (ao == 2) {
                    this.f6068m = false;
                    if (this.f6059c != null) {
                        boolean z10 = i == 1 || i == 3;
                        this.f6067l.b(1);
                        if (z10) {
                            this.f6067l.b(2);
                            a();
                        }
                        if (this.f6068m) {
                            return;
                        }
                        boolean af = this.f6059c.af();
                        String a9 = com.anythink.basead.mraid.i.a(this.f6060d, this.f6058b);
                        if (TextUtils.isEmpty(a9)) {
                            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6313L, com.anythink.basead.d.g.f6319R));
                        } else if (!af) {
                            a(2);
                        } else {
                            t.b().b(new AnonymousClass4(d.b(this.f6060d, this.f6058b), a9));
                        }
                    }
                }
                i();
                return;
            }
            if (xVar.f14327q && String.valueOf(i).equals("0")) {
                w wVar3 = this.f6058b;
                if ((!(wVar3 instanceof r) || TextUtils.isEmpty(((r) wVar3).d())) && !this.f6060d.f14326p && !TextUtils.isEmpty(this.f6058b.B())) {
                    z8 = true;
                    this.f6070o = z8;
                    int i4 = z8 ? 2 : 1;
                    if (this.f6058b.L() && String.valueOf(this.f6060d.f14320j).equals("0")) {
                        wVar = this.f6058b;
                        if (((wVar instanceof r) || TextUtils.isEmpty(((r) wVar).d())) && !this.f6060d.f14326p) {
                            d.a(this.f6058b, this.f6059c);
                            z9 = true;
                            this.f6071p = z9;
                            if (z9) {
                                i4++;
                            }
                            if ((i != 1 || i == 3 || i == 4) && ao == 3) {
                                i4++;
                                an = this.f6058b.an();
                                if (!TextUtils.isEmpty(an)) {
                                    a(5);
                                } else {
                                    cVar = this;
                                    com.anythink.core.common.res.a.a.a(t.b().g()).a(an, cVar.new AnonymousClass6(this.f6059c.bL(), System.currentTimeMillis(), this.f6059c.bF() == 1));
                                    cVar.f6067l.b(i4);
                                    a();
                                    i();
                                    return;
                                }
                            }
                            cVar = this;
                            cVar.f6067l.b(i4);
                            a();
                            i();
                            return;
                        }
                    }
                    z9 = false;
                    this.f6071p = z9;
                    if (z9) {
                    }
                    if (i != 1) {
                    }
                    i4++;
                    an = this.f6058b.an();
                    if (!TextUtils.isEmpty(an)) {
                    }
                }
            }
            z8 = false;
            this.f6070o = z8;
            if (z8) {
            }
            if (this.f6058b.L()) {
                wVar = this.f6058b;
                if (wVar instanceof r) {
                }
                d.a(this.f6058b, this.f6059c);
                z9 = true;
                this.f6071p = z9;
                if (z9) {
                }
                if (i != 1) {
                }
                i4++;
                an = this.f6058b.an();
                if (!TextUtils.isEmpty(an)) {
                }
            }
            z9 = false;
            this.f6071p = z9;
            if (z9) {
            }
            if (i != 1) {
            }
            i4++;
            an = this.f6058b.an();
            if (!TextUtils.isEmpty(an)) {
            }
        } else {
            a(com.anythink.basead.d.g.a("-9999", com.anythink.basead.d.g.f6305C));
        }
    }

    public static /* synthetic */ void c(c cVar) {
        e.a().b(cVar);
        com.anythink.core.common.t.d.a().b(cVar.f6061e);
    }

    private void a() {
        List<String> a9 = this.f6058b.a((w) this.f6059c);
        if (a9 == null) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6338m, "Incomplete resource allocation! MissResource: ".concat(String.valueOf(this.f6058b.a()))));
            return;
        }
        int size = a9.size();
        if (size == 0) {
            b();
            a(1);
            return;
        }
        this.f6065j = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = a9.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (this.f6058b.I(str)) {
                    if (!d.a(this.f6058b, this.f6059c) && !this.f6065j.contains(str)) {
                        this.f6059c.ac();
                        this.f6065j.add(str);
                    }
                } else if (!d.f(str) && !this.f6065j.contains(str)) {
                    this.f6065j.add(str);
                }
            }
        }
        if (com.anythink.basead.b.e.c(this.f6058b, this.f6060d) && this.f6058b.L() && d.a(this.f6058b, this.f6059c) && !TextUtils.isEmpty(this.f6058b.B())) {
            this.f6065j.remove(this.f6058b.B());
        }
        int size2 = this.f6065j.size();
        if (size2 == 0) {
            b();
            a(1);
            return;
        }
        synchronized (this) {
            try {
                e.a().a(this);
                ArrayList arrayList = new ArrayList(this.f6065j);
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = (String) arrayList.get(i4);
                    boolean I2 = this.f6058b.I(str2);
                    int ac = this.f6059c.ac();
                    if (I2) {
                        if (d.a(this.f6058b, this.f6059c)) {
                            e.a().a(str2, ac);
                        } else {
                            new g(this.f6062f, this.f6058b, this.f6059c, this.f6060d).a();
                        }
                    } else if (!d.a(str2)) {
                        if (d.f(str2)) {
                            d.a(str2, 100);
                            e.a().a(str2, 100);
                        } else {
                            d.a(str2, 0);
                            new f(this.f6062f, this.f6063g, this.f6058b, str2).d();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str) {
        int i;
        int i4;
        int i9;
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(2000);
            openConnection.setReadTimeout(5000);
            InputStream inputStream2 = openConnection.getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream2, null, options);
                i4 = options.outWidth;
                try {
                    i9 = options.outHeight;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    i = i4;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i4 = i;
                        i9 = 0;
                        if (i4 < 0) {
                        }
                        if (i9 >= 0) {
                        }
                        this.f6058b.n(i4);
                        this.f6058b.o(r0);
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                i = 0;
                th.getMessage();
                th.printStackTrace();
                i4 = i;
                i9 = 0;
                if (i4 < 0) {
                }
                if (i9 >= 0) {
                }
                this.f6058b.n(i4);
                this.f6058b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i10 = i9 >= 0 ? i9 : 0;
        this.f6058b.n(i4);
        this.f6058b.o(i10);
    }

    private void a(boolean z8) {
        String a9 = com.anythink.basead.mraid.i.a(this.f6060d, this.f6058b);
        if (TextUtils.isEmpty(a9)) {
            a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6313L, com.anythink.basead.d.g.f6319R));
        } else if (!z8) {
            a(2);
        } else {
            t.b().b(new AnonymousClass4(d.b(this.f6060d, this.f6058b), a9));
        }
    }

    @Override // com.anythink.basead.b.c.e.a
    public final void a(String str, int i) {
        this.f6065j.size();
        synchronized (this) {
            try {
                d.a(str, i);
                List<String> list = this.f6065j;
                if (list != null) {
                    if (list.contains(str)) {
                        if (this.f6058b.I(str)) {
                            if (this.f6059c.ac() <= i) {
                            }
                        }
                        this.f6065j.remove(str);
                        if (this.f6058b.I(str)) {
                            h.a(this.f6058b, this.f6059c);
                        }
                        if (this.f6065j.isEmpty()) {
                            a(1);
                            return;
                        }
                        if (com.anythink.basead.b.e.c(this.f6058b, this.f6060d)) {
                            String B8 = this.f6058b.B();
                            if (TextUtils.equals(String.valueOf(this.f6060d.f14325o.F()), "2")) {
                                B8 = this.f6058b.d((w) this.f6059c);
                            }
                            if (this.f6058b.I(str) && !TextUtils.isEmpty(B8)) {
                                this.f6065j.remove(B8);
                                if (this.f6065j.isEmpty()) {
                                    a(1);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.anythink.basead.b.c.e.a
    public final void a(String str, com.anythink.basead.d.f fVar) {
        this.f6065j.size();
        fVar.c();
        synchronized (this) {
            char c4 = 65535;
            try {
                d.a(str, -1);
                List<String> list = this.f6065j;
                if (list != null) {
                    list.remove(str);
                }
                if (this.f6058b.I(str) && com.anythink.basead.b.e.c(this.f6058b, this.f6060d)) {
                    com.anythink.core.common.u.e.a(this.f6060d, this.f6058b, 1, fVar.c());
                }
                String valueOf = String.valueOf(this.f6060d.f14325o.F());
                switch (valueOf.hashCode()) {
                    case j.f5973W /* 48 */:
                        if (valueOf.equals("0")) {
                            c4 = 2;
                            break;
                        }
                        break;
                    case j.f5974X /* 49 */:
                        if (valueOf.equals("1")) {
                            c4 = 0;
                            break;
                        }
                        break;
                    case 50:
                        if (valueOf.equals("2")) {
                            c4 = 4;
                            break;
                        }
                        break;
                    case 51:
                        if (valueOf.equals("3")) {
                            c4 = 1;
                            break;
                        }
                        break;
                    case 52:
                        if (valueOf.equals("4")) {
                            c4 = 3;
                            break;
                        }
                        break;
                }
                if (c4 == 0 || c4 == 1) {
                    a(fVar);
                } else if (c4 == 2) {
                    a(1);
                } else if (c4 == 3 || c4 == 4) {
                    String B8 = this.f6058b.B();
                    if (TextUtils.equals(String.valueOf(this.f6060d.f14325o.F()), "2")) {
                        B8 = this.f6058b.d((w) this.f6059c);
                    }
                    if (!this.f6058b.I(str) && (TextUtils.isEmpty(B8) || !TextUtils.equals(B8, str))) {
                        a(fVar);
                        return;
                    }
                    if (TextUtils.isEmpty(B8)) {
                        a(fVar);
                        return;
                    }
                    if (this.f6058b.I(str) && this.f6065j.size() == 0) {
                        a(1);
                        return;
                    }
                    List<String> list2 = this.f6065j;
                    if (list2 == null || (!list2.contains(this.f6058b.E()) && !this.f6065j.contains(this.f6058b.B()))) {
                        a(fVar);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z8 = this.f6070o;
        if (i == 1 && !this.f6069n) {
            this.f6069n = true;
            if (z8) {
                d();
            }
            if (this.f6071p) {
                f();
            }
        }
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f6067l;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.d.f fVar) {
        fVar.c();
        this.f6068m = true;
        com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f> eVar = this.f6067l;
        if (eVar != null) {
            eVar.a((com.anythink.basead.b.a.e<Void, com.anythink.basead.d.f>) fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(c cVar, String str) {
        int i;
        int i4;
        int i9;
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(2000);
            openConnection.setReadTimeout(5000);
            InputStream inputStream2 = openConnection.getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream2, null, options);
                i4 = options.outWidth;
                try {
                    i9 = options.outHeight;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    i = i4;
                    try {
                        th.getMessage();
                        th.printStackTrace();
                        i4 = i;
                        i9 = 0;
                        if (i4 < 0) {
                        }
                        if (i9 >= 0) {
                        }
                        cVar.f6058b.n(i4);
                        cVar.f6058b.o(r0);
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
                i = 0;
                th.getMessage();
                th.printStackTrace();
                i4 = i;
                i9 = 0;
                if (i4 < 0) {
                }
                if (i9 >= 0) {
                }
                cVar.f6058b.n(i4);
                cVar.f6058b.o(r0);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i10 = i9 >= 0 ? i9 : 0;
        cVar.f6058b.n(i4);
        cVar.f6058b.o(i10);
    }
}
