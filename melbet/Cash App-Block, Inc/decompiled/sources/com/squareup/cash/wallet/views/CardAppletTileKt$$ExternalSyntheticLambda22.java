package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.pools.views.PoolToastKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda22 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda22(Modifier modifier, boolean z, List list, boolean z2, boolean z3, boolean z4, int i) {
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$2 = list;
        this.f$3 = z2;
        this.f$4 = z3;
        this.f$5 = z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                CardAppletTileKt.RevolvingCardWithPill(this.f$0, this.f$1, (List) this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                PoolToastKt.PoolMoreOptionsBottomSheet((Function1) this.f$2, this.f$0, this.f$1, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda22(Function1 function1, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$4 = z3;
        this.f$5 = z4;
    }
}
