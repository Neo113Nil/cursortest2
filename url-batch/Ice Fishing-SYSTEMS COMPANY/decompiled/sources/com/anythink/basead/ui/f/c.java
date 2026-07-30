package com.anythink.basead.ui.f;

import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.v.m;
import java.util.Random;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final int f10944j = -999;

    /* renamed from: a, reason: collision with root package name */
    int f10945a;

    /* renamed from: b, reason: collision with root package name */
    int f10946b;

    /* renamed from: c, reason: collision with root package name */
    int f10947c;

    /* renamed from: d, reason: collision with root package name */
    int f10948d;

    /* renamed from: e, reason: collision with root package name */
    int f10949e;

    /* renamed from: f, reason: collision with root package name */
    int f10950f;

    /* renamed from: g, reason: collision with root package name */
    int f10951g;

    /* renamed from: h, reason: collision with root package name */
    int f10952h;
    public com.anythink.basead.d.a i;

    /* renamed from: k, reason: collision with root package name */
    private long f10953k;

    /* renamed from: l, reason: collision with root package name */
    private long f10954l;

    /* renamed from: m, reason: collision with root package name */
    private w f10955m;

    public c(w wVar) {
        this.f10955m = wVar;
    }

    public static int b(int i, int i4) {
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 11:
                return (i4 == 15 || i4 == 16 || i4 == 21 || i4 == 48 || i4 == 45 || i4 == 46) ? 1 : 0;
            case 12:
            case 13:
                return 1;
            default:
                return 0;
        }
    }

    private com.anythink.basead.d.a c(View view) {
        c cVar = new c(this.f10955m);
        cVar.b(view);
        return cVar.a(0, 13);
    }

    public final void a(int i, int i4, int i9, int i10) {
        this.f10945a = i;
        this.f10946b = i4;
        this.f10949e = i9;
        this.f10950f = i10;
        this.f10953k = System.currentTimeMillis();
        if (this.f10947c == 0 && this.f10948d == 0 && this.f10951g == 0 && this.f10952h == 0 && this.f10954l == 0) {
            this.f10947c = i;
            this.f10948d = i4;
            this.f10951g = i9;
            this.f10952h = i10;
            this.f10954l = System.currentTimeMillis() + new Random().nextInt(10) + 5;
        }
    }

    public final void b(int i, int i4, int i9, int i10) {
        this.f10947c = i;
        this.f10948d = i4;
        this.f10951g = i9;
        this.f10952h = i10;
        this.f10954l = System.currentTimeMillis();
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = 0;
        int i4 = iArr[0];
        int i9 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0) {
            width = m.j(t.b().g());
            i4 = 0;
        }
        if (height == 0) {
            height = m.k(t.b().g());
        } else {
            i = i9;
        }
        int b9 = b(width);
        int b10 = b(height);
        int i10 = i4 + b9;
        int i11 = i + b10;
        int random = ((int) (Math.random() * 15.0d)) + i10;
        int random2 = ((int) (Math.random() * 15.0d)) + i11;
        a(i10, i11, b9, b10);
        b(random, random2, random - i4, random2 - i);
    }

    public final com.anythink.basead.d.a a(int i) {
        return a(0, i);
    }

    public final com.anythink.basead.d.a a(int i, int i4) {
        com.anythink.basead.d.a aVar = new com.anythink.basead.d.a();
        aVar.f6265a = this.f10945a;
        aVar.f6266b = this.f10946b;
        aVar.f6267c = this.f10947c;
        aVar.f6268d = this.f10948d;
        aVar.f6269e = this.f10949e;
        aVar.f6270f = this.f10950f;
        aVar.f6271g = this.f10951g;
        aVar.f6272h = this.f10952h;
        aVar.f6274k = this.f10953k;
        aVar.f6275l = this.f10954l;
        aVar.f6277n = i;
        aVar.f6278o = i4;
        if (i == 2) {
            aVar.f6276m = com.anythink.core.express.c.a.a().c();
        }
        aVar.f6279p = this.i;
        return aVar;
    }

    private static int b(int i) {
        Random random = new Random();
        if (i <= 0) {
            return 0;
        }
        double d2 = i;
        int i4 = (int) (0.1d * d2);
        return random.nextInt((((int) (d2 * 0.9d)) - i4) + 1) + i4;
    }

    public final com.anythink.basead.d.a a(View view, int i, int i4) {
        w wVar;
        int b9 = b(i, i4);
        if (i == 4 && (wVar = this.f10955m) != null && wVar.ai() == 1) {
            c cVar = new c(this.f10955m);
            cVar.b(view);
            this.i = cVar.a(0, 13);
        }
        if (i == 5 || i == 6 || i == 7) {
            b(view);
            b9 = 0;
        }
        return a(b9, i4);
    }

    public final void a(View view) {
        b(view);
    }
}
