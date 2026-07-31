package k0;

import d7.m;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements v.i {

    /* renamed from: a, reason: collision with root package name */
    public final long f4159a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4160b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final m f4161c;

    public g(v.j jVar, long j7) {
        this.f4159a = j7;
        this.f4161c = new m(jVar.f7419a, this);
    }

    @Override // v.i
    public final d7.f a() {
        return this.f4161c;
    }
}
