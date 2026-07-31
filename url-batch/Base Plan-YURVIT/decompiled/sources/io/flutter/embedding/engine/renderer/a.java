package io.flutter.embedding.engine.renderer;

import android.os.Build;
import java.util.Iterator;
import k0.AbstractActivityC0187d;
import k0.C0190g;
import k0.I;
import k0.o;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2354b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2353a = i2;
        this.f2354b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
        switch (this.f2353a) {
            case 0:
                ((i) this.f2354b).f2391c = false;
                break;
            case 1:
                C0190g c0190g = (C0190g) this.f2354b;
                c0190g.f2678a.getClass();
                c0190g.f2685h = false;
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                o oVar = (o) this.f2354b;
                oVar.f2727m = false;
                Iterator it = oVar.f2726l.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        switch (this.f2353a) {
            case 0:
                ((i) this.f2354b).f2391c = true;
                break;
            case 1:
                C0190g c0190g = (C0190g) this.f2354b;
                AbstractActivityC0187d abstractActivityC0187d = c0190g.f2678a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0187d.reportFullyDrawn();
                } else {
                    abstractActivityC0187d.getClass();
                }
                c0190g.f2685h = true;
                c0190g.f2686i = true;
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                o oVar = (o) this.f2354b;
                oVar.f2727m = true;
                Iterator it = oVar.f2726l.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).b();
                }
                break;
            default:
                I i2 = (I) this.f2354b;
                i2.f2658a.setAlpha(1.0f);
                i iVar = i2.f2659b;
                if (iVar != null) {
                    iVar.c(this);
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
