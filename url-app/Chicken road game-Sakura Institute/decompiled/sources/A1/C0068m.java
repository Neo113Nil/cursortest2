package A1;

import android.content.Context;
import com.chicken.road.kedro.laqer.village.VillagePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z1.AbstractC1366J;
import z1.C1374S;
import z1.C1379e;
import z2.C1400D;

/* renamed from: A1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0068m implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f630e;

    public /* synthetic */ C0068m(int i2, Object obj) {
        this.f629d = i2;
        this.f630e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i2 = 0;
        Object obj = this.f630e;
        switch (this.f629d) {
            case 0:
                C1400D.l(AbstractC1366J.f11825k, new C0070n(i2, (C1379e) obj));
                AbstractC1366J.b();
                return Unit.f7487a;
            case 1:
                C1400D.l(AbstractC1366J.f11824j, new C0070n(3, (C1374S) obj));
                AbstractC1366J.b();
                return Unit.f7487a;
            case 2:
                B1.q qVar = VillagePageActivity.Companion;
                Context applicationContext = ((VillagePageActivity) obj).getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return new B1.I(applicationContext);
            case 3:
                g3.f fVar = (g3.f) obj;
                return Integer.valueOf(i3.M.d(fVar, fVar.f6803k));
            default:
                return j0.c.n("kotlin.Unit", g3.i.f6810k, new SerialDescriptor[0], new C0070n(5, (i3.L) obj));
        }
    }
}
