package R;

import java.util.Map;

/* loaded from: classes.dex */
public final class e extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3139f = new e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final e f3140g = new e(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i4) {
        super(i3);
        this.f3141e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3141e) {
            case 0:
                return new i((Map) obj);
            default:
                return obj;
        }
    }
}
