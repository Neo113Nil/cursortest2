package m1;

import j1.i;
import java.util.Collections;
import java.util.Iterator;
import n1.j;
import q1.AbstractC1180a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1113a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.b f9962b;

    public RunnableC1113a(B.b bVar, float f) {
        this.f9962b = bVar;
        this.f9961a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = ((C1114b) this.f9962b.f78b).f9967e;
        float f = this.f9961a;
        jVar.f10162a = f;
        if (jVar.f10165d == null) {
            jVar.f10165d = n1.c.f10148c;
        }
        Iterator it = Collections.unmodifiableCollection(jVar.f10165d.f10150b).iterator();
        while (it.hasNext()) {
            AbstractC1180a abstractC1180a = ((i) it.next()).f9544e;
            n1.i.f10160a.a(abstractC1180a.g(), "setDeviceVolume", Float.valueOf(f), abstractC1180a.f10229a);
        }
    }
}
