package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1433q;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2.A f10535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M2.A f10536e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1183B f10537i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10538j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1433q f10539k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(M2.A a4, M2.A a5, C1183B c1183b, boolean z4, C1433q c1433q) {
        super(1);
        this.f10535d = a4;
        this.f10536e = a5;
        this.f10537i = c1183b;
        this.f10538j = z4;
        this.f10539k = c1433q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1193i entry = (C1193i) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f10535d.f3576d = true;
        this.f10536e.f3576d = true;
        this.f10537i.o(entry, this.f10538j, this.f10539k);
        return Unit.f7487a;
    }
}
