package j1;

import android.graphics.Path;
import android.graphics.PointF;
import c1.C0537a;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.CL;
import e1.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f38505a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f6, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f6));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(p.f8630b, i));
    }

    public static int d(float f6, float f9) {
        int i = (int) f6;
        int i4 = (int) f9;
        int i9 = i / i4;
        int i10 = i % i4;
        if (!((i ^ i4) >= 0) && i10 != 0) {
            i9--;
        }
        return i - (i4 * i9);
    }

    public static void e(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f37286b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f38505a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = kVar.f37285a;
            if (i >= arrayList.size()) {
                break;
            }
            C0537a c0537a = (C0537a) arrayList.get(i);
            PointF pointF3 = c0537a.f5654a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = c0537a.f5655b;
            PointF pointF5 = c0537a.f5656c;
            if (equals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (kVar.f37287c) {
            path3.close();
        }
    }

    public static float f(float f6, float f9, float f10) {
        return CL.a(f9, f6, f10, f6);
    }

    public static void g(c1.e eVar, int i, ArrayList arrayList, c1.e eVar2, Z0.k kVar) {
        if (eVar.a(i, kVar.getName())) {
            String name = kVar.getName();
            c1.e eVar3 = new c1.e(eVar2);
            eVar3.f5679a.add(name);
            c1.e eVar4 = new c1.e(eVar3);
            eVar4.f5680b = kVar;
            arrayList.add(eVar4);
        }
    }
}
