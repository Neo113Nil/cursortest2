package p2;

import java.util.UUID;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final d f7125h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f7126i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f7127j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7128g;

    static {
        int i7 = 0;
        f7125h = new d(i7, 0);
        f7126i = new d(i7, 1);
        f7127j = new d(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f7128g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f7128g) {
        }
        return UUID.randomUUID();
    }
}
