package x6;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8675a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8676b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.c f8677c;

    public /* synthetic */ i(e eVar, p6.c cVar, int i) {
        this.f8675a = i;
        this.f8676b = eVar;
        this.f8677c = cVar;
    }

    @Override // x6.e
    public final Iterator iterator() {
        switch (this.f8675a) {
            case 0:
                return new c(this);
            default:
                return new j(this);
        }
    }
}
