package X0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements W0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1151c;

    /* renamed from: d, reason: collision with root package name */
    public final i f1152d;

    public b(String str, int i2, int i3, i iVar) {
        this.f1149a = str;
        this.f1150b = i2;
        this.f1151c = i3;
        this.f1152d = iVar;
    }

    @Override // W0.b
    public final Iterator iterator() {
        return new a(this);
    }
}
