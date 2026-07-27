package X;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final i f4324e = new i(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final i f4325i = new i(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final i f4326j = new i(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final i f4327k = new i(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final i f4328l = new i(1, 4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, int i4) {
        super(i2);
        this.f4329d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4329d) {
            case 0:
                ((k) obj).b(false);
                break;
            case 1:
                int i2 = ((b) obj).f4312a;
                break;
            case 2:
                int i4 = ((b) obj).f4312a;
                break;
        }
        return Boolean.valueOf(d.B((t) obj));
    }
}
