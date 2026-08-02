package l;

import androidx.lifecycle.m;
import java.util.Map;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256c implements Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.b f3116e;

    /* renamed from: f, reason: collision with root package name */
    public final m f3117f;

    /* renamed from: g, reason: collision with root package name */
    public C0256c f3118g;

    /* renamed from: h, reason: collision with root package name */
    public C0256c f3119h;

    public C0256c(io.flutter.embedding.engine.renderer.b bVar, m mVar) {
        this.f3116e = bVar;
        this.f3117f = mVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0256c)) {
            return false;
        }
        C0256c c0256c = (C0256c) obj;
        return this.f3116e.equals(c0256c.f3116e) && this.f3117f.equals(c0256c.f3117f);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3116e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3117f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3116e.hashCode() ^ this.f3117f.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3116e + "=" + this.f3117f;
    }
}
