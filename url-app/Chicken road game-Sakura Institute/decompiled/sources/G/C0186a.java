package G;

import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* renamed from: G.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186a extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0186a f2785e = new C0186a(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0186a f2786i = new C0186a(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0186a(int i2, int i4) {
        super(i2);
        this.f2787d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2787d) {
            case 0:
                return Looper.getMainLooper() != null ? D.f2644d : D0.f2646d;
            default:
                C0192d.x("Unexpected call to default provider");
                throw null;
        }
    }
}
