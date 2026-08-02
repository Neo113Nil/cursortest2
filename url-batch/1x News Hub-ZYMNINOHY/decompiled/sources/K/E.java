package K;

import f2.AbstractC0326c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class E extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public Object f661d;

    /* renamed from: e, reason: collision with root package name */
    public Object f662e;
    public Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.q f663g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f664h;

    /* renamed from: i, reason: collision with root package name */
    public int f665i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f666j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N f667k;

    /* renamed from: l, reason: collision with root package name */
    public int f668l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f667k = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f666j = obj;
        this.f668l |= Integer.MIN_VALUE;
        return N.f(this.f667k, false, this);
    }
}
