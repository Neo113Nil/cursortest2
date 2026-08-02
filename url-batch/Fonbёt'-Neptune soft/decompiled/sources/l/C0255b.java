package l;

import java.util.Iterator;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255b extends i1.a implements Iterator {

    /* renamed from: i, reason: collision with root package name */
    public final C0256c f3113i;

    /* renamed from: j, reason: collision with root package name */
    public C0256c f3114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3115k;

    public C0255b(C0256c c0256c, C0256c c0256c2, int i2) {
        this.f3115k = i2;
        this.f3113i = c0256c2;
        this.f3114j = c0256c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3114j != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0256c c0256c;
        C0256c c0256c2 = this.f3114j;
        C0256c c0256c3 = this.f3113i;
        if (c0256c2 != c0256c3 && c0256c3 != null) {
            switch (this.f3115k) {
                case 0:
                    c0256c = c0256c2.f3118g;
                    break;
                default:
                    c0256c = c0256c2.f3119h;
                    break;
            }
        } else {
            c0256c = null;
        }
        this.f3114j = c0256c;
        return c0256c2;
    }
}
