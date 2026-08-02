package K;

import f2.AbstractC0326c;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class O extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public Object f706d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f707e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f708g;

    /* renamed from: h, reason: collision with root package name */
    public int f709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f708g = p3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f709h |= Integer.MIN_VALUE;
        return P.a(this.f708g, this);
    }
}
