package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC1532p1;
import com.ironsource.C1454e2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class gn extends AbstractC1532p1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(@NotNull C1525o1 adTools, @NotNull hn adUnitData, @NotNull in listener) {
        super(adTools, adUnitData, listener, null, 8, null);
        String format;
        int b4;
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Placement g4 = g();
        IronLog.INTERNAL.verbose("placement = " + g4);
        if (g4 == null || TextUtils.isEmpty(g4.getPlacementName())) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{g4 == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b4 = C1426a2.b(adUnitData.b().a());
        } else {
            format = null;
            b4 = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b4, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1424a0 a(gn this$0, C1431b0 adInstanceData, C1473h0 adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new ym(new C1585w2(this$0.f(), C1454e2.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC1532p1.a());
    }

    @Override // com.ironsource.AbstractC1532p1
    @NotNull
    protected InterfaceC1445d0 a() {
        return new InterfaceC1445d0() { // from class: com.ironsource.U0
            @Override // com.ironsource.InterfaceC1445d0
            public final AbstractC1424a0 a(C1431b0 c1431b0, C1473h0 c1473h0) {
                AbstractC1424a0 a4;
                a4 = gn.a(gn.this, c1431b0, c1473h0);
                return a4;
            }
        };
    }
}
