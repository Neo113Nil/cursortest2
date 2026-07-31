package F;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class Q extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f300h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f301i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f302j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f303k;

    /* renamed from: l, reason: collision with root package name */
    public int f304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s2, I0.b bVar) {
        super(bVar);
        this.f303k = s2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f302j = obj;
        this.f304l |= Integer.MIN_VALUE;
        return S.a(this.f303k, this);
    }
}
