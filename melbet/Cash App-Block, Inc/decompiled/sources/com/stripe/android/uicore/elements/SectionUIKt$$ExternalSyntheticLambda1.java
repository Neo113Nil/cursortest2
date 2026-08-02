package com.stripe.android.uicore.elements;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.portfolio.graphs.views.MooncakeInvestingGraphView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SectionUIKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ SectionUIKt$$ExternalSyntheticLambda1(Modifier modifier, Shape shape, boolean z, long j, BorderStroke borderStroke, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = shape;
        this.f$2 = z;
        this.f$3 = j;
        this.f$4 = borderStroke;
        this.f$5 = composableLambdaImpl;
        this.f$6 = i;
        this.f$7 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SectionUIKt.m4071SectionCardfWhpE4E(this.f$0, (Shape) obj5, this.f$2, this.f$3, (BorderStroke) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$7);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                InvestingGraphTabsViewKt.m3722MooncakeInvestingGraphRFMEUTM((InvestingGraphContentModel) obj5, this.f$0, (Function1) obj4, (MooncakeInvestingGraphView.LoaderYPosition) obj3, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2, this.f$7);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SectionUIKt$$ExternalSyntheticLambda1(InvestingGraphContentModel investingGraphContentModel, Modifier modifier, Function1 function1, MooncakeInvestingGraphView.LoaderYPosition loaderYPosition, boolean z, long j, int i, int i2) {
        this.f$1 = investingGraphContentModel;
        this.f$0 = modifier;
        this.f$4 = function1;
        this.f$5 = loaderYPosition;
        this.f$2 = z;
        this.f$3 = j;
        this.f$6 = i;
        this.f$7 = i2;
    }
}
