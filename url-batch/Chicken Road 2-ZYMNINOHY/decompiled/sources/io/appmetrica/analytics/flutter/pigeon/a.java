package io.appmetrica.analytics.flutter.pigeon;

import T.U;
import android.app.usage.UsageStatsManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0525c2;
import io.appmetrica.analytics.impl.C0990u2;
import io.appmetrica.analytics.impl.EnumC1042w2;
import io.appmetrica.analytics.impl.I5;
import io.flutter.plugin.common.BasicMessageChannel;
import t0.C1434i;
import t0.l;
import t0.o;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BasicMessageChannel.MessageHandler, ActivationBarrierCallback, FunctionWithThrowable, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9832b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f9831a = i4;
        this.f9832b = obj;
    }

    @Override // t0.o
    public a0 a(int i4, U u4, int[] iArr) {
        l lVar = (l) this.f9832b;
        F j4 = I.j();
        for (int i5 = 0; i5 < u4.f2705a; i5++) {
            j4.b(new C1434i(i4, u4, i5, lVar, iArr[i5]));
        }
        return j4.f();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        EnumC1042w2 a3;
        a3 = C0990u2.a((C0525c2) this.f9832b, (UsageStatsManager) obj);
        return a3;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f9831a) {
            case 0:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f9832b, obj, reply);
                break;
            default:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f9832b, obj, reply);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        I5.a((I5) this.f9832b);
    }
}
