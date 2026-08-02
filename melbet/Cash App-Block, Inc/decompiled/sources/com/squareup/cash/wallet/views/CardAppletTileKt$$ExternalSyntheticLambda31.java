package com.squareup.cash.wallet.views;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.views.GraphicsError;
import com.squareup.cash.observability.types.ErrorReporter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda31 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardRegistry f$0;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda31(CardRegistry cardRegistry, int i) {
        this.$r8$classId = i;
        this.f$0 = cardRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        final int i2 = 1;
        final CardRegistry cardRegistry = this.f$0;
        switch (i) {
            case 0:
                Exception exc = (Exception) obj;
                exc.getClass();
                if (cardRegistry != null) {
                    cardRegistry.errorReporter.report(new GraphicsError(exc), defaultSamplingStrategy);
                }
                return Unit.INSTANCE;
            case 1:
                ((DisposableEffectScope) obj).getClass();
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$5$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        CardRegistry cardRegistry2 = cardRegistry;
                        switch (i3) {
                            case 0:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardRegistry2.sharedSceneCount$delegate;
                                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState.getIntValue() == 0) {
                                    CardScene cardScene = cardRegistry2.sharedScene;
                                    if (cardScene != null) {
                                        cardScene.dispose();
                                    }
                                    cardRegistry2.sharedScene = null;
                                    Engine engine = cardRegistry2.sceneEngine;
                                    if (engine != null) {
                                        engine.shutdown();
                                    }
                                    cardRegistry2.sceneEngine = null;
                                    cardRegistry2.sharedSceneError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case 1:
                                cardRegistry2.cardNuxAnimation$delegate.setValue(null);
                                break;
                            case 2:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = cardRegistry2.sharedNuxHeroCount$delegate;
                                parcelableSnapshotMutableIntState2.setIntValue(parcelableSnapshotMutableIntState2.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState2.getIntValue() == 0) {
                                    CardNuxState cardNuxState = cardRegistry2.sharedNuxHero;
                                    if (cardNuxState != null) {
                                        Lazy lazy = cardNuxState.lazySwampEngine;
                                        Lazy lazy2 = cardNuxState.lazyCardGridNuxScene;
                                        Lazy lazy3 = cardNuxState.lazyCardScene;
                                        CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                                        if (currentTextureState != null) {
                                            currentTextureState.destroyTextures();
                                            currentTextureState.engine.destroy();
                                        }
                                        if (lazy3.isInitialized()) {
                                            ((CardScene) lazy3.getValue()).dispose();
                                        }
                                        if (lazy2.isInitialized()) {
                                            ((CardGridNuxScene) lazy2.getValue()).dispose();
                                        }
                                        if (lazy.isInitialized()) {
                                            ((Engine) lazy.getValue()).shutdown();
                                        }
                                    }
                                    cardRegistry2.sharedNuxHero = null;
                                    break;
                                }
                                break;
                            case 3:
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = cardRegistry2.tagEngineCount$delegate;
                                parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState3.getIntValue() == 0) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((PageTagSlot) it.next()).dispose();
                                    }
                                    linkedHashMap.clear();
                                    Engine engine2 = cardRegistry2.tagEngine;
                                    if (engine2 != null) {
                                        engine2.shutdown();
                                    }
                                    cardRegistry2.tagEngine = null;
                                    cardRegistry2.tagEngineError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedCache$delegate;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = cardRegistry2.sharedCacheCount$delegate;
                                parcelableSnapshotMutableIntState4.setIntValue(parcelableSnapshotMutableIntState4.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState4.getIntValue() == 0) {
                                    CardTextureState cardTextureState = (CardTextureState) parcelableSnapshotMutableState.getValue();
                                    if (cardTextureState != null) {
                                        cardTextureState.destroyTextures();
                                        cardTextureState.engine.destroy();
                                    }
                                    parcelableSnapshotMutableState.setValue(null);
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 2:
                ((DisposableEffectScope) obj).getClass();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardRegistry.sharedSceneCount$delegate;
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                final int i3 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$5$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        CardRegistry cardRegistry2 = cardRegistry;
                        switch (i32) {
                            case 0:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = cardRegistry2.sharedSceneCount$delegate;
                                parcelableSnapshotMutableIntState2.setIntValue(parcelableSnapshotMutableIntState2.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState2.getIntValue() == 0) {
                                    CardScene cardScene = cardRegistry2.sharedScene;
                                    if (cardScene != null) {
                                        cardScene.dispose();
                                    }
                                    cardRegistry2.sharedScene = null;
                                    Engine engine = cardRegistry2.sceneEngine;
                                    if (engine != null) {
                                        engine.shutdown();
                                    }
                                    cardRegistry2.sceneEngine = null;
                                    cardRegistry2.sharedSceneError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case 1:
                                cardRegistry2.cardNuxAnimation$delegate.setValue(null);
                                break;
                            case 2:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState22 = cardRegistry2.sharedNuxHeroCount$delegate;
                                parcelableSnapshotMutableIntState22.setIntValue(parcelableSnapshotMutableIntState22.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState22.getIntValue() == 0) {
                                    CardNuxState cardNuxState = cardRegistry2.sharedNuxHero;
                                    if (cardNuxState != null) {
                                        Lazy lazy = cardNuxState.lazySwampEngine;
                                        Lazy lazy2 = cardNuxState.lazyCardGridNuxScene;
                                        Lazy lazy3 = cardNuxState.lazyCardScene;
                                        CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                                        if (currentTextureState != null) {
                                            currentTextureState.destroyTextures();
                                            currentTextureState.engine.destroy();
                                        }
                                        if (lazy3.isInitialized()) {
                                            ((CardScene) lazy3.getValue()).dispose();
                                        }
                                        if (lazy2.isInitialized()) {
                                            ((CardGridNuxScene) lazy2.getValue()).dispose();
                                        }
                                        if (lazy.isInitialized()) {
                                            ((Engine) lazy.getValue()).shutdown();
                                        }
                                    }
                                    cardRegistry2.sharedNuxHero = null;
                                    break;
                                }
                                break;
                            case 3:
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = cardRegistry2.tagEngineCount$delegate;
                                parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState3.getIntValue() == 0) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((PageTagSlot) it.next()).dispose();
                                    }
                                    linkedHashMap.clear();
                                    Engine engine2 = cardRegistry2.tagEngine;
                                    if (engine2 != null) {
                                        engine2.shutdown();
                                    }
                                    cardRegistry2.tagEngine = null;
                                    cardRegistry2.tagEngineError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedCache$delegate;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = cardRegistry2.sharedCacheCount$delegate;
                                parcelableSnapshotMutableIntState4.setIntValue(parcelableSnapshotMutableIntState4.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState4.getIntValue() == 0) {
                                    CardTextureState cardTextureState = (CardTextureState) parcelableSnapshotMutableState.getValue();
                                    if (cardTextureState != null) {
                                        cardTextureState.destroyTextures();
                                        cardTextureState.engine.destroy();
                                    }
                                    parcelableSnapshotMutableState.setValue(null);
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 3:
                ((DisposableEffectScope) obj).getClass();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = cardRegistry.sharedNuxHeroCount$delegate;
                parcelableSnapshotMutableIntState2.setIntValue(parcelableSnapshotMutableIntState2.getIntValue() + 1);
                final int i4 = 2;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$5$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i4;
                        CardRegistry cardRegistry2 = cardRegistry;
                        switch (i32) {
                            case 0:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState22 = cardRegistry2.sharedSceneCount$delegate;
                                parcelableSnapshotMutableIntState22.setIntValue(parcelableSnapshotMutableIntState22.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState22.getIntValue() == 0) {
                                    CardScene cardScene = cardRegistry2.sharedScene;
                                    if (cardScene != null) {
                                        cardScene.dispose();
                                    }
                                    cardRegistry2.sharedScene = null;
                                    Engine engine = cardRegistry2.sceneEngine;
                                    if (engine != null) {
                                        engine.shutdown();
                                    }
                                    cardRegistry2.sceneEngine = null;
                                    cardRegistry2.sharedSceneError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case 1:
                                cardRegistry2.cardNuxAnimation$delegate.setValue(null);
                                break;
                            case 2:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState222 = cardRegistry2.sharedNuxHeroCount$delegate;
                                parcelableSnapshotMutableIntState222.setIntValue(parcelableSnapshotMutableIntState222.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState222.getIntValue() == 0) {
                                    CardNuxState cardNuxState = cardRegistry2.sharedNuxHero;
                                    if (cardNuxState != null) {
                                        Lazy lazy = cardNuxState.lazySwampEngine;
                                        Lazy lazy2 = cardNuxState.lazyCardGridNuxScene;
                                        Lazy lazy3 = cardNuxState.lazyCardScene;
                                        CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                                        if (currentTextureState != null) {
                                            currentTextureState.destroyTextures();
                                            currentTextureState.engine.destroy();
                                        }
                                        if (lazy3.isInitialized()) {
                                            ((CardScene) lazy3.getValue()).dispose();
                                        }
                                        if (lazy2.isInitialized()) {
                                            ((CardGridNuxScene) lazy2.getValue()).dispose();
                                        }
                                        if (lazy.isInitialized()) {
                                            ((Engine) lazy.getValue()).shutdown();
                                        }
                                    }
                                    cardRegistry2.sharedNuxHero = null;
                                    break;
                                }
                                break;
                            case 3:
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = cardRegistry2.tagEngineCount$delegate;
                                parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState3.getIntValue() == 0) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((PageTagSlot) it.next()).dispose();
                                    }
                                    linkedHashMap.clear();
                                    Engine engine2 = cardRegistry2.tagEngine;
                                    if (engine2 != null) {
                                        engine2.shutdown();
                                    }
                                    cardRegistry2.tagEngine = null;
                                    cardRegistry2.tagEngineError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedCache$delegate;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = cardRegistry2.sharedCacheCount$delegate;
                                parcelableSnapshotMutableIntState4.setIntValue(parcelableSnapshotMutableIntState4.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState4.getIntValue() == 0) {
                                    CardTextureState cardTextureState = (CardTextureState) parcelableSnapshotMutableState.getValue();
                                    if (cardTextureState != null) {
                                        cardTextureState.destroyTextures();
                                        cardTextureState.engine.destroy();
                                    }
                                    parcelableSnapshotMutableState.setValue(null);
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 4:
                ((DisposableEffectScope) obj).getClass();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = cardRegistry.sharedCacheCount$delegate;
                parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() + 1);
                final int i5 = 4;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$5$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i5;
                        CardRegistry cardRegistry2 = cardRegistry;
                        switch (i32) {
                            case 0:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState22 = cardRegistry2.sharedSceneCount$delegate;
                                parcelableSnapshotMutableIntState22.setIntValue(parcelableSnapshotMutableIntState22.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState22.getIntValue() == 0) {
                                    CardScene cardScene = cardRegistry2.sharedScene;
                                    if (cardScene != null) {
                                        cardScene.dispose();
                                    }
                                    cardRegistry2.sharedScene = null;
                                    Engine engine = cardRegistry2.sceneEngine;
                                    if (engine != null) {
                                        engine.shutdown();
                                    }
                                    cardRegistry2.sceneEngine = null;
                                    cardRegistry2.sharedSceneError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case 1:
                                cardRegistry2.cardNuxAnimation$delegate.setValue(null);
                                break;
                            case 2:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState222 = cardRegistry2.sharedNuxHeroCount$delegate;
                                parcelableSnapshotMutableIntState222.setIntValue(parcelableSnapshotMutableIntState222.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState222.getIntValue() == 0) {
                                    CardNuxState cardNuxState = cardRegistry2.sharedNuxHero;
                                    if (cardNuxState != null) {
                                        Lazy lazy = cardNuxState.lazySwampEngine;
                                        Lazy lazy2 = cardNuxState.lazyCardGridNuxScene;
                                        Lazy lazy3 = cardNuxState.lazyCardScene;
                                        CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                                        if (currentTextureState != null) {
                                            currentTextureState.destroyTextures();
                                            currentTextureState.engine.destroy();
                                        }
                                        if (lazy3.isInitialized()) {
                                            ((CardScene) lazy3.getValue()).dispose();
                                        }
                                        if (lazy2.isInitialized()) {
                                            ((CardGridNuxScene) lazy2.getValue()).dispose();
                                        }
                                        if (lazy.isInitialized()) {
                                            ((Engine) lazy.getValue()).shutdown();
                                        }
                                    }
                                    cardRegistry2.sharedNuxHero = null;
                                    break;
                                }
                                break;
                            case 3:
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState32 = cardRegistry2.tagEngineCount$delegate;
                                parcelableSnapshotMutableIntState32.setIntValue(parcelableSnapshotMutableIntState32.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState32.getIntValue() == 0) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((PageTagSlot) it.next()).dispose();
                                    }
                                    linkedHashMap.clear();
                                    Engine engine2 = cardRegistry2.tagEngine;
                                    if (engine2 != null) {
                                        engine2.shutdown();
                                    }
                                    cardRegistry2.tagEngine = null;
                                    cardRegistry2.tagEngineError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedCache$delegate;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = cardRegistry2.sharedCacheCount$delegate;
                                parcelableSnapshotMutableIntState4.setIntValue(parcelableSnapshotMutableIntState4.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState4.getIntValue() == 0) {
                                    CardTextureState cardTextureState = (CardTextureState) parcelableSnapshotMutableState.getValue();
                                    if (cardTextureState != null) {
                                        cardTextureState.destroyTextures();
                                        cardTextureState.engine.destroy();
                                    }
                                    parcelableSnapshotMutableState.setValue(null);
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 5:
                ((DisposableEffectScope) obj).getClass();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = cardRegistry.tagEngineCount$delegate;
                parcelableSnapshotMutableIntState4.setIntValue(parcelableSnapshotMutableIntState4.getIntValue() + 1);
                final int i6 = 3;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$5$6$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i6;
                        CardRegistry cardRegistry2 = cardRegistry;
                        switch (i32) {
                            case 0:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState22 = cardRegistry2.sharedSceneCount$delegate;
                                parcelableSnapshotMutableIntState22.setIntValue(parcelableSnapshotMutableIntState22.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState22.getIntValue() == 0) {
                                    CardScene cardScene = cardRegistry2.sharedScene;
                                    if (cardScene != null) {
                                        cardScene.dispose();
                                    }
                                    cardRegistry2.sharedScene = null;
                                    Engine engine = cardRegistry2.sceneEngine;
                                    if (engine != null) {
                                        engine.shutdown();
                                    }
                                    cardRegistry2.sceneEngine = null;
                                    cardRegistry2.sharedSceneError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case 1:
                                cardRegistry2.cardNuxAnimation$delegate.setValue(null);
                                break;
                            case 2:
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState222 = cardRegistry2.sharedNuxHeroCount$delegate;
                                parcelableSnapshotMutableIntState222.setIntValue(parcelableSnapshotMutableIntState222.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState222.getIntValue() == 0) {
                                    CardNuxState cardNuxState = cardRegistry2.sharedNuxHero;
                                    if (cardNuxState != null) {
                                        Lazy lazy = cardNuxState.lazySwampEngine;
                                        Lazy lazy2 = cardNuxState.lazyCardGridNuxScene;
                                        Lazy lazy3 = cardNuxState.lazyCardScene;
                                        CardTextureState currentTextureState = cardNuxState.getCurrentTextureState();
                                        if (currentTextureState != null) {
                                            currentTextureState.destroyTextures();
                                            currentTextureState.engine.destroy();
                                        }
                                        if (lazy3.isInitialized()) {
                                            ((CardScene) lazy3.getValue()).dispose();
                                        }
                                        if (lazy2.isInitialized()) {
                                            ((CardGridNuxScene) lazy2.getValue()).dispose();
                                        }
                                        if (lazy.isInitialized()) {
                                            ((Engine) lazy.getValue()).shutdown();
                                        }
                                    }
                                    cardRegistry2.sharedNuxHero = null;
                                    break;
                                }
                                break;
                            case 3:
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState32 = cardRegistry2.tagEngineCount$delegate;
                                parcelableSnapshotMutableIntState32.setIntValue(parcelableSnapshotMutableIntState32.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState32.getIntValue() == 0) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((PageTagSlot) it.next()).dispose();
                                    }
                                    linkedHashMap.clear();
                                    Engine engine2 = cardRegistry2.tagEngine;
                                    if (engine2 != null) {
                                        engine2.shutdown();
                                    }
                                    cardRegistry2.tagEngine = null;
                                    cardRegistry2.tagEngineError$delegate.setValue(Boolean.FALSE);
                                    break;
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry2.sharedCache$delegate;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState42 = cardRegistry2.sharedCacheCount$delegate;
                                parcelableSnapshotMutableIntState42.setIntValue(parcelableSnapshotMutableIntState42.getIntValue() - 1);
                                if (parcelableSnapshotMutableIntState42.getIntValue() == 0) {
                                    CardTextureState cardTextureState = (CardTextureState) parcelableSnapshotMutableState.getValue();
                                    if (cardTextureState != null) {
                                        cardTextureState.destroyTextures();
                                        cardTextureState.engine.destroy();
                                    }
                                    parcelableSnapshotMutableState.setValue(null);
                                    break;
                                }
                                break;
                        }
                    }
                };
            default:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                if (cardRegistry != null) {
                    cardRegistry.errorReporter.report(new GraphicsError(exc2), defaultSamplingStrategy);
                }
                return Unit.INSTANCE;
        }
    }
}
