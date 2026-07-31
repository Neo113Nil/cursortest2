package q6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f6198d;

    public j(int i) {
        this.f6198d = i;
    }

    @Override // q6.f
    public final int c() {
        return this.f6198d;
    }

    public final String toString() {
        t.f6206a.getClass();
        String a8 = u.a(this);
        i.d(a8, "renderLambdaToString(...)");
        return a8;
    }
}
