package gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.AddShoppingCartKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRProductDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRProductDetailsScreenKt {
    public static final ComposableSingletons$MRKMRProductDetailsScreenKt INSTANCE = new ComposableSingletons$MRKMRProductDetailsScreenKt();

    /* renamed from: lambda$-1852225362, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f137lambda$1852225362 = ComposableLambdaKt.composableLambdaInstance(-1852225362, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ComposableSingletons$MRKMRProductDetailsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda__1852225362$lambda$0;
            lambda__1852225362$lambda$0 = ComposableSingletons$MRKMRProductDetailsScreenKt.lambda__1852225362$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda__1852225362$lambda$0;
        }
    });

    /* renamed from: lambda$-437441935, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f138lambda$437441935 = ComposableLambdaKt.composableLambdaInstance(-437441935, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ComposableSingletons$MRKMRProductDetailsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__437441935$lambda$0;
            lambda__437441935$lambda$0 = ComposableSingletons$MRKMRProductDetailsScreenKt.lambda__437441935$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__437441935$lambda$0;
        }
    });

    /* renamed from: getLambda$-1852225362$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m9564getLambda$1852225362$app_release() {
        return f137lambda$1852225362;
    }

    /* renamed from: getLambda$-437441935$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9565getLambda$437441935$app_release() {
        return f138lambda$437441935;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1852225362$lambda$0(RowScope FilledTonalButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(FilledTonalButton, "$this$FilledTonalButton");
        ComposerKt.sourceInformation(composer, "C185@8128L236,190@8393L54,192@8521L49,191@8476L293:MRKMRProductDetailsScreen.kt#1r68yl");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1852225362, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ComposableSingletons$MRKMRProductDetailsScreenKt.lambda$-1852225362.<anonymous> (MRKMRProductDetailsScreen.kt:185)");
            }
            IconKt.m2553Iconww6aTOc(AddShoppingCartKt.getAddShoppingCart(Icons.Rounded.INSTANCE), (String) null, SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(20)), 0L, composer, 432, 8);
            SpacerKt.Spacer(PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(6), 0.0f, 2, null), composer, 6);
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.button_add_to_cart_label, composer, 0), null, 0L, null, TextUnitKt.getSp(16), null, FontWeight.INSTANCE.getBold(), null, TextUnitKt.getSp(1.5d), null, null, 0L, 0, false, 0, 0, null, null, composer, 102260736, 0, 261806);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__437441935$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C206@9011L65,205@8961L189:MRKMRProductDetailsScreen.kt#1r68yl");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-437441935, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails.ComposableSingletons$MRKMRProductDetailsScreenKt.lambda$-437441935.<anonymous> (MRKMRProductDetailsScreen.kt:205)");
            }
            MRKMREmptyViewKt.MRKMREmptyView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.product_details_state_empty_primary_text, composer, 0), null, null, null, composer, 6, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
