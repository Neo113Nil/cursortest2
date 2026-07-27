package f0;

import Z.C0314k;
import android.graphics.PathMeasure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586g extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0586g f6385e = new C0586g(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0586g f6386i = new C0586g(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0586g(int i2, int i4) {
        super(i2);
        this.f6387d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6387d) {
            case 0:
                return new C0314k(new PathMeasure());
            default:
                return Unit.f7487a;
        }
    }
}
