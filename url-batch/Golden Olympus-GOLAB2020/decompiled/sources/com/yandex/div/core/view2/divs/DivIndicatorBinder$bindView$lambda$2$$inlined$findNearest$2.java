package com.yandex.div.core.view2.divs;

import O1.Z;
import com.yandex.div.core.util.SearchRoute;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2 extends s implements Function1<Z, Unit> {
    final /* synthetic */ List $searchRoutes;
    final /* synthetic */ G $seekerRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2(List list, G g4) {
        super(1);
        this.$searchRoutes = list;
        this.$seekerRoute = g4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Z) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = this.$searchRoutes.iterator();
        while (it2.hasNext()) {
            ((SearchRoute) it2.next()).onLeave();
        }
        SearchRoute searchRoute = (SearchRoute) this.$seekerRoute.f41132b;
        if (searchRoute != null) {
            searchRoute.onLeave();
        }
    }
}
