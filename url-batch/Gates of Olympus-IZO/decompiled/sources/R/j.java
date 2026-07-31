package R;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final j f3157f = new j(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final j f3158g = new j(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, int i4) {
        super(i3);
        this.f3159e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f3159e) {
            case 0:
                return new i(new LinkedHashMap());
            default:
                return null;
        }
    }
}
