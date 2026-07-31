package y2;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public L1.b f8842d;

    /* renamed from: e, reason: collision with root package name */
    public E2.b f8843e;

    /* renamed from: f, reason: collision with root package name */
    public LinkedHashMap f8844f;

    /* renamed from: g, reason: collision with root package name */
    public String f8845g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8846h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E2.b f8847i;

    /* renamed from: j, reason: collision with root package name */
    public int f8848j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(E2.b bVar, R1.a aVar) {
        super(aVar);
        this.f8847i = bVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f8846h = obj;
        this.f8848j |= Integer.MIN_VALUE;
        return E2.b.a(this.f8847i, null, this);
    }
}
