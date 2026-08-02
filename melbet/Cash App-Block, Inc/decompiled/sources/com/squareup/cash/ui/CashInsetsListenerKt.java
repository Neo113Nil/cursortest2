package com.squareup.cash.ui;

import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.ui.CashInsets;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class CashInsetsListenerKt {
    public static final void LocalOwnersProvider(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(233973821);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(saveableStateHolder) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalViewModelStoreOwner.LocalViewModelStoreOwner.defaultProvidedValue$runtime(navBackStackEntry), LocalLifecycleOwnerKt.LocalLifecycleOwner.defaultProvidedValue$runtime(navBackStackEntry), LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner.defaultProvidedValue$runtime(navBackStackEntry)}, Expect_jvmKt.rememberComposableLambda(1808964477, new ButtonKt$Button$2.AnonymousClass1(9, saveableStateHolder, composableLambdaImpl), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(navBackStackEntry, saveableStateHolder, composableLambdaImpl, i, 12);
        }
    }

    public static final void SaveableStateProvider(SaveableStateHolder saveableStateHolder, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(832919318);
        int i2 = (gapComposer.changedInstance(saveableStateHolder) ? 4 : 2) | i | (gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16);
        if ((i2 & 19) == 18 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Navigation$$ExternalSyntheticLambda1(21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ReflectionFactory reflectionFactory = Reflection.factory;
            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(BackStackEntryIdViewModel.class);
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(BackStackEntryIdViewModel.class), function1);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) ViewModelKt.viewModel(orCreateKotlinClass, current, chunkIndexMerger.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer);
            backStackEntryIdViewModel.saveableStateHolderRef = new BiometricPrompt(saveableStateHolder);
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.id, composableLambdaImpl, gapComposer, ((i2 << 6) & 896) | (i2 & 112));
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(saveableStateHolder, composableLambdaImpl, i, 27);
        }
    }

    public static final WindowInsetsCompat combine(WindowInsetsCompat windowInsetsCompat, CashInsets cashInsets) {
        windowInsetsCompat.getClass();
        cashInsets.getClass();
        Insets insets = windowInsetsCompat.mImpl.getInsets(527);
        insets.getClass();
        Insets of = Insets.of(insets.left, insets.top, insets.right, Math.max(insets.bottom, Math.max(cashInsets.get(CashInsets.Type.InlineBottomNavigation).bottom, cashInsets.get(CashInsets.Type.FloatingBottomNavigation).bottom)));
        int i = Build.VERSION.SDK_INT;
        WindowInsetsCompat.BuilderImpl builderImpl36 = i >= 36 ? new WindowInsetsCompat.BuilderImpl36(windowInsetsCompat) : i >= 35 ? new WindowInsetsCompat.BuilderImpl35(windowInsetsCompat) : i >= 34 ? new WindowInsetsCompat.BuilderImpl34(windowInsetsCompat) : i >= 31 ? new WindowInsetsCompat.BuilderImpl31(windowInsetsCompat) : i >= 30 ? new WindowInsetsCompat.BuilderImpl30(windowInsetsCompat) : new WindowInsetsCompat.BuilderImpl29(windowInsetsCompat);
        builderImpl36.setInsets(519, of);
        builderImpl36.setInsets(8, Insets.NONE);
        WindowInsetsCompat build = builderImpl36.build();
        build.getClass();
        return build;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBills.deepLinkSpecs;
    }
}
