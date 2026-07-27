package z2;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;

/* renamed from: z2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422f extends AbstractC1420d implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1420d f11941e;

    /* renamed from: i, reason: collision with root package name */
    public final int f11942i;

    /* renamed from: j, reason: collision with root package name */
    public final int f11943j;

    public C1422f(AbstractC1420d list, int i2, int i4) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f11941e = list;
        this.f11942i = i2;
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int e4 = list.e();
        aVar.getClass();
        AbstractC1420d.a.d(i2, i4, e4);
        this.f11943j = i4 - i2;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f11943j;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11943j;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return this.f11941e.get(this.f11942i + i2);
    }
}
