package K;

import f2.AbstractC0326c;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class X extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f734d;

    /* renamed from: e, reason: collision with root package name */
    public FileOutputStream f735e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f736g;

    /* renamed from: h, reason: collision with root package name */
    public int f737h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f736g = y3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f737h |= Integer.MIN_VALUE;
        return this.f736g.b(null, this);
    }
}
