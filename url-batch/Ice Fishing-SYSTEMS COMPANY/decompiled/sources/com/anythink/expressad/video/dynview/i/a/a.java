package com.anythink.expressad.video.dynview.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.g.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f21370b;

    /* renamed from: a, reason: collision with root package name */
    private final String f21371a = "ChoiceOneDrawBitBg";

    /* renamed from: c, reason: collision with root package name */
    private View f21372c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f21373d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f21374e;

    private a() {
    }

    public final void b() {
        if (this.f21372c != null) {
            this.f21372c = null;
        }
        Bitmap bitmap = this.f21373d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f21373d.recycle();
            this.f21373d = null;
        }
        Bitmap bitmap2 = this.f21374e;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f21374e.recycle();
        this.f21374e = null;
    }

    public static a a() {
        a aVar;
        if (f21370b != null) {
            return f21370b;
        }
        synchronized (a.class) {
            try {
                if (f21370b == null) {
                    f21370b = new a();
                }
                aVar = f21370b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.f21372c = view;
        int e6 = cVar.e();
        float d2 = cVar.d();
        float c4 = cVar.c();
        try {
            List<d> g9 = cVar.g();
            String a9 = g9.get(0) != null ? s.a(g9.get(0).bm()) : "";
            String a10 = g9.get(1) != null ? s.a(g9.get(1).bm()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(a9) || !map.containsKey(a9)) ? null : map.get(a9);
            if (!TextUtils.isEmpty(a10) && map.containsKey(a10)) {
                bitmap = map.get(a10);
            }
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            a(e6, d2, c4, bitmap2);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private synchronized void a(final int i, final float f6, final float f9, final Bitmap bitmap) {
        try {
            try {
                try {
                    com.anythink.expressad.foundation.g.i.a.b().execute(new Runnable() { // from class: com.anythink.expressad.video.dynview.i.a.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Bitmap a9 = h.a(bitmap);
                                Bitmap a10 = h.a(bitmap);
                                final a.C0135a a11 = com.anythink.expressad.video.dynview.g.a.a();
                                a11.a(i).a(a9).b(a10);
                                if (i == 2) {
                                    float f10 = f6;
                                    float f11 = f9;
                                    if (f10 > f11) {
                                        a11.a(f10).b(f9);
                                    } else {
                                        a11.a(f11).b(f6);
                                    }
                                } else {
                                    a11.a(f6).b(f9);
                                }
                                if (a.this.f21372c != null) {
                                    a.this.f21372c.post(new Runnable() { // from class: com.anythink.expressad.video.dynview.i.a.a.1.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (a.this.f21372c != null) {
                                                a11.b();
                                                a.this.f21372c.setBackgroundDrawable(a11.b());
                                            }
                                        }
                                    });
                                }
                            } catch (Exception e6) {
                                e6.getMessage();
                            }
                        }
                    });
                } catch (Exception e6) {
                    e = e6;
                    e.getMessage();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
