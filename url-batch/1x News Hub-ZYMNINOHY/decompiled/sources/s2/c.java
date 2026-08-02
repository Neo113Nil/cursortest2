package s2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements r2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f10322a;

    /* renamed from: b, reason: collision with root package name */
    public final m f10323b;

    public c(String str, m mVar) {
        this.f10322a = str;
        this.f10323b = mVar;
    }

    @Override // r2.f
    public final Iterator iterator() {
        return new b(this);
    }
}
