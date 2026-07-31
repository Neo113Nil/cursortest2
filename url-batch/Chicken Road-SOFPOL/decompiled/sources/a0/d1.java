package a0;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f45a;

    /* renamed from: b, reason: collision with root package name */
    public final List[] f46b;

    /* renamed from: c, reason: collision with root package name */
    public int f47c;

    /* renamed from: d, reason: collision with root package name */
    public int f48d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1 f50f;

    public d1(e1 e1Var, List list) {
        this.f50f = e1Var;
        this.f45a = list;
        this.f46b = new List[list.size()];
        if (list.isEmpty()) {
            w.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
