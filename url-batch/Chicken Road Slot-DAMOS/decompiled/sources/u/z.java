package u;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends wd.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final z f9570e;

    /* renamed from: i, reason: collision with root package name */
    public static final z f9571i;

    /* renamed from: r, reason: collision with root package name */
    public static final z f9572r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9573d;

    static {
        int i3 = 1;
        f9570e = new z(i3, 0);
        f9571i = new z(i3, 1);
        f9572r = new z(i3, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i3, int i10) {
        super(i3);
        this.f9573d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9573d) {
            case 0:
                long j = ((k1.i0) obj).f5328a;
                return new v.i(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 1:
                v.i iVar = (v.i) obj;
                float f3 = iVar.f9819a;
                float f10 = iVar.f9820b;
                return new k1.i0((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            default:
                return v.c.g(7, null);
        }
    }
}
