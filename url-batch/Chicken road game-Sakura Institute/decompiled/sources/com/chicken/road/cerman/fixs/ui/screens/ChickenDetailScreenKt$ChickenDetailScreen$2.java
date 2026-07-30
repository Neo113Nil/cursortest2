package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.Repository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChickenDetailScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChickenDetailScreenKt$ChickenDetailScreen$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Chicken $c;
    final /* synthetic */ MutableState<Boolean> $editOpen$delegate;
    final /* synthetic */ NavController $nav;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;

    ChickenDetailScreenKt$ChickenDetailScreen$2(Chicken chicken, CoroutineScope coroutineScope, Repository repository, NavController navController, MutableState<Boolean> mutableState) {
        this.$c = chicken;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$nav = navController;
        this.$editOpen$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1440474509, i, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen.<anonymous> (ChickenDetailScreen.kt:74)");
            }
            if (this.$c != null) {
                composer.startReplaceGroup(2074755447);
                final MutableState<Boolean> mutableState = this.$editOpen$delegate;
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = ChickenDetailScreenKt$ChickenDetailScreen$2.invoke$lambda$1$lambda$0(MutableState.this);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                IconButtonKt.IconButton((Function0) rememberedValue, null, false, null, null, ComposableSingletons$ChickenDetailScreenKt.INSTANCE.m6690getLambda1$app_release(), composer, 196614, 30);
                composer.startReplaceGroup(2074758537);
                boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$repo) | composer.changed(this.$c) | composer.changedInstance(this.$nav);
                final CoroutineScope coroutineScope = this.$scope;
                final Repository repository = this.$repo;
                final Chicken chicken = this.$c;
                final NavController navController = this.$nav;
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$3$lambda$2;
                            invoke$lambda$3$lambda$2 = ChickenDetailScreenKt$ChickenDetailScreen$2.invoke$lambda$3$lambda$2(CoroutineScope.this, repository, chicken, navController);
                            return invoke$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                IconButtonKt.IconButton((Function0) rememberedValue2, null, false, null, null, ComposableSingletons$ChickenDetailScreenKt.INSTANCE.m6691getLambda2$app_release(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        ChickenDetailScreenKt.ChickenDetailScreen$lambda$9(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, Repository repository, Chicken chicken, NavController navController) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ChickenDetailScreenKt$ChickenDetailScreen$2$2$1$1(repository, chicken, navController, null), 3, null);
        return Unit.INSTANCE;
    }
}
