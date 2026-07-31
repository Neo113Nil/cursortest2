package x6;

import java.util.Iterator;
import o.h0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8669a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8670b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.c f8671c;

    public /* synthetic */ d(Object obj, p6.c cVar, int i) {
        this.f8669a = i;
        this.f8670b = obj;
        this.f8671c = cVar;
    }

    @Override // x6.e
    public final Iterator iterator() {
        switch (this.f8669a) {
            case 0:
                return new c(this);
            default:
                return new h0(this);
        }
    }
}
