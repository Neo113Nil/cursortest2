package android.support.constraint.a;

import android.support.constraint.a.g;
import java.util.ArrayList;

/* compiled from: Goal.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    ArrayList<g> f1437a = new ArrayList<>();

    g a() {
        int size = this.f1437a.size();
        g gVar = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            g gVar2 = this.f1437a.get(i2);
            for (int i3 = 5; i3 >= 0; i3--) {
                float f = gVar2.e[i3];
                if (gVar == null && f < 0.0f && i3 >= i) {
                    gVar = gVar2;
                    i = i3;
                }
                if (f > 0.0f && i3 > i) {
                    gVar = null;
                    i = i3;
                }
            }
        }
        return gVar;
    }

    private void b(e eVar) {
        this.f1437a.clear();
        for (int i = 1; i < eVar.f1440b; i++) {
            g gVar = eVar.f1441c.f1436c[i];
            for (int i2 = 0; i2 < 6; i2++) {
                gVar.e[i2] = 0.0f;
            }
            gVar.e[gVar.f1446c] = 1.0f;
            if (gVar.f == g.a.ERROR) {
                this.f1437a.add(gVar);
            }
        }
    }

    void a(e eVar) {
        b(eVar);
        int size = this.f1437a.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.f1437a.get(i);
            if (gVar.f1445b != -1) {
                a aVar = eVar.a(gVar.f1445b).f1433d;
                int i2 = aVar.f1388a;
                for (int i3 = 0; i3 < i2; i3++) {
                    g a2 = aVar.a(i3);
                    if (a2 != null) {
                        float b2 = aVar.b(i3);
                        for (int i4 = 0; i4 < 6; i4++) {
                            float[] fArr = a2.e;
                            fArr[i4] = fArr[i4] + (gVar.e[i4] * b2);
                        }
                        if (!this.f1437a.contains(a2)) {
                            this.f1437a.add(a2);
                        }
                    }
                }
                gVar.a();
            }
        }
    }

    public String toString() {
        String str = "Goal: ";
        int size = this.f1437a.size();
        for (int i = 0; i < size; i++) {
            str = str + this.f1437a.get(i).b();
        }
        return str;
    }
}
