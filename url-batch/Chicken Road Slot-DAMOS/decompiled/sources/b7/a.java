package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.d f1237b;

    /* renamed from: c, reason: collision with root package name */
    public final a7.b f1238c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1239d;

    public a(a7.d dVar, a7.b bVar, String str) {
        this.f1237b = dVar;
        this.f1238c = bVar;
        this.f1239d = str;
        this.f1236a = Arrays.hashCode(new Object[]{dVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return c7.c0.k(this.f1237b, aVar.f1237b) && c7.c0.k(this.f1238c, aVar.f1238c) && c7.c0.k(this.f1239d, aVar.f1239d);
    }

    public final int hashCode() {
        return this.f1236a;
    }
}
