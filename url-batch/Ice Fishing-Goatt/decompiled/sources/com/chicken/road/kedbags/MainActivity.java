package com.chicken.road.kedbags;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.di.AppModule;
import com.chicken.road.kedbags.ui.AppRootKt;
import com.chicken.road.kedbags.ui.splash.SplashController;
import com.chicken.road.kedbags.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/chicken/road/kedbags/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1508846645, true, new Function2() { // from class: com.chicken.road.kedbags.MainActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$4(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    static final Unit onCreate$lambda$4(MainActivity mainActivity, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C19@795L39,20@870L45,21@946L288,21@928L306:MainActivity.kt#lz6mur");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508846645, i, -1, "com.chicken.road.kedbags.MainActivity.onCreate.<anonymous> (MainActivity.kt:19)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -1697318532, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = AppModule.INSTANCE.repository(mainActivity);
                composer.updateRememberedValue(rememberedValue);
            }
            final TreasureRepository treasureRepository = (TreasureRepository) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -1697316126, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = AppModule.INSTANCE.splashController(mainActivity);
                composer.updateRememberedValue(rememberedValue2);
            }
            final SplashController splashController = (SplashController) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ThemeKt.CluckFortuneTheme(ComposableLambdaKt.rememberComposableLambda(-609814138, true, new Function2() { // from class: com.chicken.road.kedbags.MainActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$4$lambda$3(TreasureRepository.this, splashController, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit onCreate$lambda$4$lambda$3(final TreasureRepository treasureRepository, final SplashController splashController, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C24@1070L11,25@1111L109,22@964L256:MainActivity.kt#lz6mur");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609814138, i, -1, "com.chicken.road.kedbags.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:22)");
            }
            SurfaceKt.m2207SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2095916405, true, new Function2() { // from class: com.chicken.road.kedbags.MainActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$4$lambda$3$lambda$2(TreasureRepository.this, splashController, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit onCreate$lambda$4$lambda$3$lambda$2(TreasureRepository treasureRepository, SplashController splashController, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C26@1133L69:MainActivity.kt#lz6mur");
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2095916405, i, -1, "com.chicken.road.kedbags.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:26)");
            }
            AppRootKt.AppRoot(treasureRepository, splashController, composer, TreasureRepository.$stable | (SplashController.$stable << 3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
