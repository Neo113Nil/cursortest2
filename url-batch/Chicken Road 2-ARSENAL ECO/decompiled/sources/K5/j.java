package K5;

import H5.X;
import p5.EnumC0580a;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class j extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public k f1403f;

    /* renamed from: g, reason: collision with root package name */
    public d f1404g;

    /* renamed from: h, reason: collision with root package name */
    public m f1405h;

    /* renamed from: i, reason: collision with root package name */
    public X f1406i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1407j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1408k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f1409l;

    /* renamed from: m, reason: collision with root package name */
    public int f1410m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f1409l = kVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f1408k = obj;
        this.f1410m |= Integer.MIN_VALUE;
        this.f1409l.c(null, this);
        return EnumC0580a.f5697f;
    }
}
