package Z1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f3473d;

    public j(int i3) {
        this.f3473d = i3;
    }

    @Override // Z1.f
    public final int d() {
        return this.f3473d;
    }

    public final String toString() {
        u.f3481a.getClass();
        String a3 = v.a(this);
        i.e(a3, "renderLambdaToString(...)");
        return a3;
    }
}
