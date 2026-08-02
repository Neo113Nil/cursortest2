package com.stripe.android.uicore.image;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes7.dex */
public final /* synthetic */ class StripeImageKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda3(LazyListState lazyListState, String str, Function1 function1, Async async, Function2 function2, InstitutionPickerState.Payload payload, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = 4;
        this.f$1 = lazyListState;
        this.f$0 = str;
        this.f$2 = function1;
        this.f$3 = async;
        this.f$5 = function2;
        this.f$6 = payload;
        this.f$7 = function0;
        this.f$8 = function02;
        this.f$9 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$8;
        Function function = this.f$7;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                StripeImageKt.StripeImage((String) obj9, (DefaultStripeImageLoader) obj8, (Modifier) obj7, (Painter) obj6, (BiasAlignment) obj5, (Function3) obj4, (Function3) function, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AvatarsKt.ActivityScrollableEmbeddedView((ActivityEmbeddedViewModel) obj9, (Function1) obj8, (Modifier) obj7, (LazyListState) obj6, (PaddingValues) obj5, (Function3) obj4, (Function2) obj3, (Function3) function, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeNote((String) obj9, (String) obj8, (ImmutableList) obj6, (String) obj5, (Function0) obj4, (Function1) function, (Function0) obj3, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                RevolvingInteractiveCardsKt.FilamentCardContent((CardNuxState) obj9, (Function0) obj8, (CardModelView) obj7, (FiniteAnimationSpec) obj6, (Function0) obj5, (Function0) obj4, (Function1) function, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                InstitutionPickerScreenKt.LoadedContent((LazyListState) obj8, (String) obj9, (Function1) obj7, (Async) obj6, (Function2) obj5, (InstitutionPickerState.Payload) obj4, (Function0) function, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                LinkAccountPickerScreenKt.LinkAccountPickerLoaded((LazyListState) obj9, (Async) obj8, (Async) obj7, (Function1) obj6, (Function0) obj5, (Function1) obj4, (Function0) function, (TextResource.Text) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda3(ActivityEmbeddedViewModel activityEmbeddedViewModel, Function1 function1, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Function3 function3, Function2 function2, Function3 function32, int i) {
        this.$r8$classId = 1;
        this.f$0 = activityEmbeddedViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = lazyListState;
        this.f$5 = paddingValues;
        this.f$6 = function3;
        this.f$8 = function2;
        this.f$7 = function32;
        this.f$9 = i;
    }

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Function function, Function function2, Object obj6, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$5 = obj5;
        this.f$6 = function;
        this.f$7 = function2;
        this.f$8 = obj6;
        this.f$9 = i;
    }

    public /* synthetic */ StripeImageKt$$ExternalSyntheticLambda3(String str, String str2, ImmutableList immutableList, String str3, Function0 function0, Function1 function1, Function0 function02, Modifier modifier, int i) {
        this.$r8$classId = 2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = immutableList;
        this.f$5 = str3;
        this.f$6 = function0;
        this.f$7 = function1;
        this.f$8 = function02;
        this.f$2 = modifier;
        this.f$9 = i;
    }
}
