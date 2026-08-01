package B;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17c;

    public /* synthetic */ e(int i2, Object obj) {
        this.f16b = i2;
        this.f17c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16b) {
            case 0:
                break;
            case 1:
                ((I.c) this.f17c).f321b.f328e.prefetchDefaultFontManager();
                return;
            case 2:
                androidx.lifecycle.n nVar = (androidx.lifecycle.n) this.f17c;
                e0.h.e(nVar, "this$0");
                int i2 = nVar.f499b;
                androidx.lifecycle.j jVar = nVar.f503f;
                if (i2 == 0) {
                    nVar.f500c = true;
                    jVar.a(androidx.lifecycle.d.ON_PAUSE);
                }
                if (nVar.f498a == 0 && nVar.f500c) {
                    jVar.a(androidx.lifecycle.d.ON_STOP);
                    nVar.f501d = true;
                    return;
                }
                return;
            default:
                ((io.flutter.plugin.platform.j) this.f17c).e(false);
                return;
        }
        while (true) {
            g gVar = (g) this.f17c;
            ArrayList arrayList = gVar.f24f;
            if (arrayList.isEmpty() || gVar.f30l != null) {
                return;
            }
            ((C.d) arrayList.get(0)).f96a.run();
            arrayList.remove(0);
        }
    }
}
