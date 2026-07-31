package R;

import e2.InterfaceC0424c;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final e f4012f = new e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final e f4013g = new e(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i4) {
        super(i3);
        this.f4014e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4014e) {
            case 0:
                return new i((Map) obj);
            default:
                return obj;
        }
    }
}
