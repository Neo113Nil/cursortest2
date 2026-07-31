package x1;

import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i8) {
        super(1);
        this.f8529e = i8;
        this.f8530f = i;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f8529e) {
            case 0:
                return Boolean.valueOf(((d1.n) obj).v0(this.f8530f));
            default:
                return Boolean.valueOf(((View) obj).getId() == this.f8530f);
        }
    }
}
