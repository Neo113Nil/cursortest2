package R;

import e2.InterfaceC0422a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final j f4030f = new j(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final j f4031g = new j(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, int i4) {
        super(i3);
        this.f4032e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f4032e) {
            case 0:
                return new i(new LinkedHashMap());
            default:
                return null;
        }
    }
}
