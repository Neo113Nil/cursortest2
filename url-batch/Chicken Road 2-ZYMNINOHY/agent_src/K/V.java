package K;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class V extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public FileOutputStream f1315a;

    /* renamed from: b, reason: collision with root package name */
    public FileOutputStream f1316b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f1318d;

    /* renamed from: e, reason: collision with root package name */
    public int f1319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w4, h3.c cVar) {
        super(cVar);
        this.f1318d = w4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1317c = obj;
        this.f1319e |= Integer.MIN_VALUE;
        return this.f1318d.b(this, null);
    }
}
