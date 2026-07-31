package l1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends q6.j implements p6.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4768f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f4769g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4770e;

    static {
        int i = 0;
        f4768f = new f(i, 0);
        f4769g = new f(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i8) {
        super(i);
        this.f4770e = i8;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f4770e) {
            case 0:
                return new f1.k(new PathMeasure());
            default:
                return c6.m.f1757a;
        }
    }
}
