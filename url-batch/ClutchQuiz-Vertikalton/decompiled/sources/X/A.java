package X;

import g.AbstractActivityC0136i;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public boolean f924a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f925b;

    /* renamed from: c, reason: collision with root package name */
    public a.w f926c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f927e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractActivityC0136i abstractActivityC0136i, int i) {
        this(true);
        this.d = i;
        this.f927e = abstractActivityC0136i;
    }

    public A(boolean z2) {
        this.f924a = z2;
        this.f925b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(I i) {
        this(false);
        this.d = 0;
        this.f927e = i;
    }
}
