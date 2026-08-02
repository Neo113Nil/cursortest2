package I2;

import F2.i;
import J2.c;
import J2.j;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.b f1131b;

    public a(B.b bVar, float f4) {
        this.f1131b = bVar;
        this.f1130a = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = ((b) this.f1131b.f149b).f1136e;
        float f4 = this.f1130a;
        jVar.f1187a = f4;
        if (jVar.f1190d == null) {
            jVar.f1190d = c.f1173c;
        }
        Iterator it = Collections.unmodifiableCollection(jVar.f1190d.f1175b).iterator();
        while (it.hasNext()) {
            M2.a aVar = ((i) it.next()).f785e;
            J2.i.f1185a.a(aVar.g(), "setDeviceVolume", Float.valueOf(f4), aVar.f1749a);
        }
    }
}
