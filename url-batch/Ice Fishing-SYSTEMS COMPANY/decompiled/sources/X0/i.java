package X0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import f1.C4493d;
import j1.AbstractC4591d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3671c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f3672d;

    /* renamed from: e, reason: collision with root package name */
    public float f3673e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3674f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3675g;

    /* renamed from: h, reason: collision with root package name */
    public s.l f3676h;
    public s.e i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3677j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f3678k;

    /* renamed from: l, reason: collision with root package name */
    public float f3679l;

    /* renamed from: m, reason: collision with root package name */
    public float f3680m;

    /* renamed from: n, reason: collision with root package name */
    public float f3681n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3682o;

    /* renamed from: a, reason: collision with root package name */
    public final D f3669a = new D();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3670b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f3683p = 0;

    public final void a(String str) {
        AbstractC4591d.b(str);
        this.f3670b.add(str);
    }

    public final float b() {
        return (long) (((this.f3680m - this.f3679l) / this.f3681n) * 1000.0f);
    }

    public final Map c() {
        float c4 = j1.j.c();
        if (c4 != this.f3673e) {
            for (Map.Entry entry : this.f3672d.entrySet()) {
                HashMap hashMap = this.f3672d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f6 = this.f3673e / c4;
                int i = (int) (xVar.f3766a * f6);
                int i4 = (int) (xVar.f3767b * f6);
                x xVar2 = new x(i, i4, xVar.f3768c, xVar.f3769d, xVar.f3770e);
                Bitmap bitmap = xVar.f3771f;
                if (bitmap != null) {
                    xVar2.f3771f = Bitmap.createScaledBitmap(bitmap, i, i4, true);
                }
                hashMap.put(str, xVar2);
            }
        }
        this.f3673e = c4;
        return this.f3672d;
    }

    public final c1.h d(String str) {
        int size = this.f3675g.size();
        for (int i = 0; i < size; i++) {
            c1.h hVar = (c1.h) this.f3675g.get(i);
            String str2 = hVar.f5683a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f3677j.iterator();
        while (it.hasNext()) {
            sb.append(((C4493d) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
