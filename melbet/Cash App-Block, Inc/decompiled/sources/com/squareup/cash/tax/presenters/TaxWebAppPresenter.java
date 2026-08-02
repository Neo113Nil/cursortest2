package com.squareup.cash.tax.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class TaxWebAppPresenter implements MoleculePresenter {
    public static final Set X_DOMAINS = ArraysKt___ArraysKt.toSet(new String[]{"x.com", "twitter.com", "t.co"});
    public final BlockersScreens.TaxWebViewScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealDeepLinkParser deepLinkParser;
    public final FeatureFlagManager featureFlagManager;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter$Factory$Impl routerFactory;
    public final RealTaxDesktopTooltipPreference taxDesktopTooltipPreference;
    public final RealTaxEntryTileUserDataProvider taxEntryTileUserDataProvider;
    public final RealUrlAuthenticator urlAuthenticator;

    public TaxWebAppPresenter(BlockersDataNavigator blockersDataNavigator, IntentLauncher intentLauncher, RealRouter$Factory$Impl realRouter$Factory$Impl, RealDeepLinkParser realDeepLinkParser, RealTaxDesktopTooltipPreference realTaxDesktopTooltipPreference, FeatureFlagManager featureFlagManager, RealUrlAuthenticator realUrlAuthenticator, RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider, BlockersScreens.TaxWebViewScreen taxWebViewScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        taxWebViewScreen.getClass();
        this.blockersDataNavigator = blockersDataNavigator;
        this.launcher = intentLauncher;
        this.routerFactory = realRouter$Factory$Impl;
        this.deepLinkParser = realDeepLinkParser;
        this.taxDesktopTooltipPreference = realTaxDesktopTooltipPreference;
        this.featureFlagManager = featureFlagManager;
        this.urlAuthenticator = realUrlAuthenticator;
        this.taxEntryTileUserDataProvider = realTaxEntryTileUserDataProvider;
        this.args = taxWebViewScreen;
        this.navigator = screenNavigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$authenticatedUrl(TaxWebAppPresenter taxWebAppPresenter, String str, ContinuationImpl continuationImpl) {
        TaxWebAppPresenter$authenticatedUrl$1 taxWebAppPresenter$authenticatedUrl$1;
        int i;
        String str2;
        if (continuationImpl instanceof TaxWebAppPresenter$authenticatedUrl$1) {
            taxWebAppPresenter$authenticatedUrl$1 = (TaxWebAppPresenter$authenticatedUrl$1) continuationImpl;
            int i2 = taxWebAppPresenter$authenticatedUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxWebAppPresenter$authenticatedUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = taxWebAppPresenter$authenticatedUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxWebAppPresenter$authenticatedUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str != null && !StringsKt.isBlank(str)) {
                        RealUrlAuthenticator realUrlAuthenticator = taxWebAppPresenter.urlAuthenticator;
                        taxWebAppPresenter$authenticatedUrl$1.label = 1;
                        obj = realUrlAuthenticator.authenticate(str, taxWebAppPresenter$authenticatedUrl$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return TaxWebAppViewModel.ErrorUrl.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                str2 = (String) obj;
                if (!StringsKt.contains((CharSequence) str2, (CharSequence) "{{token}}", false)) {
                    return new TaxWebAppViewModel.LoadUrl(str2);
                }
                return TaxWebAppViewModel.ErrorUrl.INSTANCE;
            }
        }
        taxWebAppPresenter$authenticatedUrl$1 = new TaxWebAppPresenter$authenticatedUrl$1(taxWebAppPresenter, continuationImpl);
        Object obj2 = taxWebAppPresenter$authenticatedUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxWebAppPresenter$authenticatedUrl$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (!StringsKt.contains((CharSequence) str2, (CharSequence) "{{token}}", false)) {
        }
        return TaxWebAppViewModel.ErrorUrl.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2026494738);
        String str = this.args.url;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(TaxWebAppViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$1 = new TaxWebAppPresenter$models$1$1(0, mutableState, this, str, (Continuation) null);
            gapComposer.updateRememberedValue(taxWebAppPresenter$models$1$1);
            rememberedValue2 = taxWebAppPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, mutableState, (MutableState) rememberedValue3, 6));
        TaxWebAppViewModel taxWebAppViewModel = (TaxWebAppViewModel) mutableState.getValue();
        gapComposer.end(false);
        return taxWebAppViewModel;
    }
}
