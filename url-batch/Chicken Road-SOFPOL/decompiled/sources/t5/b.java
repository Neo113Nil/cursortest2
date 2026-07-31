package t5;

import android.graphics.Typeface;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends h3.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f6901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f6902f;

    public b(d dVar, r rVar) {
        this.f6902f = dVar;
        this.f6901e = rVar;
    }

    @Override // h3.b
    public final void d(int i) {
        this.f6902f.f6919n = true;
        this.f6901e.G(i);
    }

    @Override // h3.b
    public final void e(Typeface typeface) {
        d dVar = this.f6902f;
        dVar.f6921p = Typeface.create(typeface, dVar.f6910d);
        dVar.f6919n = true;
        this.f6901e.H(dVar.f6921p, false);
    }
}
