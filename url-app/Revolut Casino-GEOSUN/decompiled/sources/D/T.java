package D;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class T extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f138h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f139i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f140j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f141k;

    /* renamed from: l, reason: collision with root package name */
    public int f142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u2, y0.b bVar) {
        super(bVar);
        this.f141k = u2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f140j = obj;
        this.f142l |= Integer.MIN_VALUE;
        return U.a(this.f141k, this);
    }
}
