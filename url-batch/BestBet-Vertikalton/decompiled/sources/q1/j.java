package q1;

import K.C0025v;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r1.c f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.a f3823b;

    public j(r1.c cVar, Y0.a aVar) {
        this.f3822a = cVar;
        this.f3823b = aVar;
    }

    @Override // q1.d
    public final Iterator iterator() {
        return new C0025v(this);
    }
}
