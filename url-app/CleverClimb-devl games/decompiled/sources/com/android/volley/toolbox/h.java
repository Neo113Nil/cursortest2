package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.n;
import com.android.volley.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ImageLoader.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.android.volley.m f2345a;

    /* renamed from: b, reason: collision with root package name */
    private int f2346b;

    /* renamed from: c, reason: collision with root package name */
    private final b f2347c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, a> f2348d;
    private final HashMap<String, a> e;
    private final Handler f;
    private Runnable g;

    /* compiled from: ImageLoader.java */
    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    /* compiled from: ImageLoader.java */
    public interface d extends n.a {
        void a(c cVar, boolean z);
    }

    public c a(String str, d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        a();
        String a2 = a(str, i, i2, scaleType);
        Bitmap a3 = this.f2347c.a(a2);
        if (a3 != null) {
            c cVar = new c(a3, str, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, str, a2, dVar);
        dVar.a(cVar2, true);
        a aVar = this.f2348d.get(a2);
        if (aVar != null) {
            aVar.a(cVar2);
            return cVar2;
        }
        com.android.volley.l<Bitmap> a4 = a(str, i, i2, scaleType, a2);
        this.f2345a.a(a4);
        this.f2348d.put(a2, new a(a4, cVar2));
        return cVar2;
    }

    protected com.android.volley.l<Bitmap> a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new i(str, new n.b<Bitmap>() { // from class: com.android.volley.toolbox.h.1
            @Override // com.android.volley.n.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(Bitmap bitmap) {
                h.this.a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new n.a() { // from class: com.android.volley.toolbox.h.2
            @Override // com.android.volley.n.a
            public void onErrorResponse(s sVar) {
                h.this.a(str2, sVar);
            }
        });
    }

    protected void a(String str, Bitmap bitmap) {
        this.f2347c.a(str, bitmap);
        a remove = this.f2348d.remove(str);
        if (remove != null) {
            remove.f2356c = bitmap;
            a(str, remove);
        }
    }

    protected void a(String str, s sVar) {
        a remove = this.f2348d.remove(str);
        if (remove != null) {
            remove.a(sVar);
            a(str, remove);
        }
    }

    /* compiled from: ImageLoader.java */
    public class c {

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f2359b;

        /* renamed from: c, reason: collision with root package name */
        private final d f2360c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2361d;
        private final String e;

        public c(Bitmap bitmap, String str, String str2, d dVar) {
            this.f2359b = bitmap;
            this.e = str;
            this.f2361d = str2;
            this.f2360c = dVar;
        }

        public void a() {
            if (this.f2360c == null) {
                return;
            }
            a aVar = (a) h.this.f2348d.get(this.f2361d);
            if (aVar == null) {
                a aVar2 = (a) h.this.e.get(this.f2361d);
                if (aVar2 != null) {
                    aVar2.b(this);
                    if (aVar2.e.size() == 0) {
                        h.this.e.remove(this.f2361d);
                        return;
                    }
                    return;
                }
                return;
            }
            if (aVar.b(this)) {
                h.this.f2348d.remove(this.f2361d);
            }
        }

        public Bitmap b() {
            return this.f2359b;
        }

        public String c() {
            return this.e;
        }
    }

    /* compiled from: ImageLoader.java */
    private class a {

        /* renamed from: b, reason: collision with root package name */
        private final com.android.volley.l<?> f2355b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f2356c;

        /* renamed from: d, reason: collision with root package name */
        private s f2357d;
        private final LinkedList<c> e = new LinkedList<>();

        public a(com.android.volley.l<?> lVar, c cVar) {
            this.f2355b = lVar;
            this.e.add(cVar);
        }

        public void a(s sVar) {
            this.f2357d = sVar;
        }

        public s a() {
            return this.f2357d;
        }

        public void a(c cVar) {
            this.e.add(cVar);
        }

        public boolean b(c cVar) {
            this.e.remove(cVar);
            if (this.e.size() != 0) {
                return false;
            }
            this.f2355b.f();
            return true;
        }
    }

    private void a(String str, a aVar) {
        this.e.put(str, aVar);
        if (this.g == null) {
            this.g = new Runnable() { // from class: com.android.volley.toolbox.h.3
                @Override // java.lang.Runnable
                public void run() {
                    for (a aVar2 : h.this.e.values()) {
                        Iterator it = aVar2.e.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar.f2360c != null) {
                                if (aVar2.a() == null) {
                                    cVar.f2359b = aVar2.f2356c;
                                    cVar.f2360c.a(cVar, false);
                                } else {
                                    cVar.f2360c.onErrorResponse(aVar2.a());
                                }
                            }
                        }
                    }
                    h.this.e.clear();
                    h.this.g = null;
                }
            };
            this.f.postDelayed(this.g, this.f2346b);
        }
    }

    private void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    private static String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }
}
