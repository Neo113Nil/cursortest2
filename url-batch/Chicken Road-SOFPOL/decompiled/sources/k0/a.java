package k0;

import c6.m;
import java.util.Collection;
import java.util.List;
import u1.k0;
import u1.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4148f;

    public /* synthetic */ a(int i, int i8, l0 l0Var) {
        this.f4146d = i8;
        this.f4147e = l0Var;
        this.f4148f = i;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f4146d) {
            case 0:
                k0.g((k0) obj, (l0) this.f4147e, 0, -this.f4148f);
                return m.f1757a;
            case 1:
                k0.g((k0) obj, (l0) this.f4147e, -this.f4148f, 0);
                return m.f1757a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f4148f, (Collection) this.f4147e));
        }
    }

    public /* synthetic */ a(int i, Collection collection) {
        this.f4146d = 2;
        this.f4148f = i;
        this.f4147e = collection;
    }
}
