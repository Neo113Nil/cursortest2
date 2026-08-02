package com.squareup.cash.storage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.activity.ComponentActivity;
import androidx.credentials.CredentialManagerImpl;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.investing.components.welcome.InvestingStocksWelcomeView$Factory$Impl;
import com.squareup.cash.investing.components.welcome.StocksWelcomeAdapter;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.CachedAttestedKeyServiceFactory;
import com.squareup.cash.limits.presenters.LimitsPresenter$Factory$Impl;
import com.squareup.cash.limits.presenters.LimitsSectionPresenter$Factory$Impl;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$Factory$Impl;
import com.squareup.cash.money.booklet.MoneyTabBookletPresenter$Factory$Impl;
import com.squareup.cash.moneybot.components.plugins.GenieCardPlugin;
import com.squareup.cash.moneybot.presenters.plugins.GenieCardPresenter$Factory$Impl;
import com.squareup.cash.music.presenters.MusicPresenter$Factory$Impl;
import com.squareup.cash.nearby.presenters.NearbyOrderedListsPresenter$Factory$Impl;
import com.squareup.cash.nearby.presenters.NearbyPresentersFactory;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.nfc.presenters.NfcNotAvailablePresenter$Factory$Impl;
import com.squareup.cash.nfc.presenters.NfcPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.presenters.CountrySelectorPresenter$Factory$Impl;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$Factory$Impl;
import com.squareup.cash.passkeys.presenters.PasskeyBlockerPresenterFactory;
import com.squareup.cash.passkeys.presenters.PasskeyManagementPresenter$Factory$Impl;
import com.squareup.cash.passkeys.presenters.PasskeyUpsellPresenter$Factory$Impl;
import com.squareup.cash.pdf.presenter.PdfPresenterFactory;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$Factory$Impl;
import com.squareup.cash.persona.backend.PersonaActivityForResultLauncher;
import com.squareup.cash.persona.presenters.PersonaDidvPresenter$Factory$Impl;
import com.squareup.cash.plaid.real.RealPlaidLinkActivityLauncher;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$Factory$Impl;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticePresenter$Factory$Impl;
import com.squareup.cash.score.presenters.ScoreHomePresenter$Factory$Impl;
import com.squareup.cash.sharesheet.ShareSheetPresenter$Factory$Impl;
import com.squareup.cash.stablecoin.presenters.StablecoinHomePresenter$Factory$Impl;
import com.squareup.cash.storage.context.KeyedStorageContextWrapper;
import com.squareup.cash.stripe.real.RealStripeLinkActivityLauncher;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* loaded from: classes.dex */
public final class RealSandboxer {
    public static final Set preferencesKeepSet = SetsKt__SetsJVMKt.setOf("debug.xml");
    public final Context baseContext;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory baseContext;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.baseContext = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 0;
            InstanceFactory instanceFactory = this.baseContext;
            switch (i) {
                case 0:
                    Context context = (Context) instanceFactory.value;
                    context.getClass();
                    return new RealSandboxer(context);
                case 1:
                    Context context2 = (Context) instanceFactory.value;
                    context2.getClass();
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("cash", 0);
                    sharedPreferences.getClass();
                    return sharedPreferences;
                case 2:
                    InvestingStocksWelcomeView$Factory$Impl investingStocksWelcomeView$Factory$Impl = (InvestingStocksWelcomeView$Factory$Impl) instanceFactory.value;
                    investingStocksWelcomeView$Factory$Impl.getClass();
                    return new StocksWelcomeAdapter(investingStocksWelcomeView$Factory$Impl);
                case 3:
                    AttestedKeyService.Factory factory = (AttestedKeyService.Factory) instanceFactory.value;
                    factory.getClass();
                    return new CachedAttestedKeyServiceFactory(factory);
                case 4:
                    LimitsPresenter$Factory$Impl limitsPresenter$Factory$Impl = (LimitsPresenter$Factory$Impl) instanceFactory.value;
                    limitsPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(limitsPresenter$Factory$Impl, 12);
                case 5:
                    LimitsSectionPresenter$Factory$Impl limitsSectionPresenter$Factory$Impl = (LimitsSectionPresenter$Factory$Impl) instanceFactory.value;
                    limitsSectionPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(limitsSectionPresenter$Factory$Impl, 13);
                case 6:
                    LanguageDisclosurePresenter$Factory$Impl languageDisclosurePresenter$Factory$Impl = (LanguageDisclosurePresenter$Factory$Impl) instanceFactory.value;
                    languageDisclosurePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(languageDisclosurePresenter$Factory$Impl, 14);
                case 7:
                    MoneyTabBookletPresenter$Factory$Impl moneyTabBookletPresenter$Factory$Impl = (MoneyTabBookletPresenter$Factory$Impl) instanceFactory.value;
                    moneyTabBookletPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(moneyTabBookletPresenter$Factory$Impl, 16);
                case 8:
                    GenieCardPresenter$Factory$Impl genieCardPresenter$Factory$Impl = (GenieCardPresenter$Factory$Impl) instanceFactory.value;
                    GenieLogger genieLogger = new GenieLogger();
                    genieCardPresenter$Factory$Impl.getClass();
                    return new GenieCardPlugin(genieCardPresenter$Factory$Impl, genieLogger);
                case 9:
                    MusicPresenter$Factory$Impl musicPresenter$Factory$Impl = (MusicPresenter$Factory$Impl) instanceFactory.value;
                    musicPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(musicPresenter$Factory$Impl, 17);
                case 10:
                    NearbyOrderedListsPresenter$Factory$Impl nearbyOrderedListsPresenter$Factory$Impl = (NearbyOrderedListsPresenter$Factory$Impl) instanceFactory.value;
                    nearbyOrderedListsPresenter$Factory$Impl.getClass();
                    return new NearbyPresentersFactory(nearbyOrderedListsPresenter$Factory$Impl, i2);
                case 11:
                    Activity activity = (Activity) instanceFactory.value;
                    activity.getClass();
                    return new RealNfcPaymentsManager(activity);
                case 12:
                    NfcNotAvailablePresenter$Factory$Impl nfcNotAvailablePresenter$Factory$Impl = (NfcNotAvailablePresenter$Factory$Impl) instanceFactory.value;
                    nfcNotAvailablePresenter$Factory$Impl.getClass();
                    return new NfcPresenterModule$Companion$$ExternalSyntheticLambda0(nfcNotAvailablePresenter$Factory$Impl, i2);
                case 13:
                    CountrySelectorPresenter$Factory$Impl countrySelectorPresenter$Factory$Impl = (CountrySelectorPresenter$Factory$Impl) instanceFactory.value;
                    countrySelectorPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(countrySelectorPresenter$Factory$Impl, 18);
                case 14:
                    OnboardingLandingPresenter$Factory$Impl onboardingLandingPresenter$Factory$Impl = (OnboardingLandingPresenter$Factory$Impl) instanceFactory.value;
                    onboardingLandingPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(onboardingLandingPresenter$Factory$Impl, 19);
                case 15:
                    Activity activity2 = (Activity) instanceFactory.value;
                    activity2.getClass();
                    return new CredentialManagerImpl(activity2);
                case 16:
                    PasskeyUpsellPresenter$Factory$Impl passkeyUpsellPresenter$Factory$Impl = (PasskeyUpsellPresenter$Factory$Impl) instanceFactory.value;
                    passkeyUpsellPresenter$Factory$Impl.getClass();
                    return new PasskeyBlockerPresenterFactory(passkeyUpsellPresenter$Factory$Impl, i2);
                case 17:
                    PasskeyManagementPresenter$Factory$Impl passkeyManagementPresenter$Factory$Impl = (PasskeyManagementPresenter$Factory$Impl) instanceFactory.value;
                    passkeyManagementPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(passkeyManagementPresenter$Factory$Impl, 20);
                case 18:
                    PdfPreviewPresenter$Factory$Impl pdfPreviewPresenter$Factory$Impl = (PdfPreviewPresenter$Factory$Impl) instanceFactory.value;
                    pdfPreviewPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(pdfPreviewPresenter$Factory$Impl, i2);
                case 19:
                    ComponentActivity componentActivity = (ComponentActivity) instanceFactory.value;
                    componentActivity.getClass();
                    return new PersonaActivityForResultLauncher(componentActivity);
                case 20:
                    PersonaDidvPresenter$Factory$Impl personaDidvPresenter$Factory$Impl = (PersonaDidvPresenter$Factory$Impl) instanceFactory.value;
                    personaDidvPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(personaDidvPresenter$Factory$Impl, 21);
                case 21:
                    ComponentActivity componentActivity2 = (ComponentActivity) instanceFactory.value;
                    componentActivity2.getClass();
                    return new RealPlaidLinkActivityLauncher(componentActivity2, "RealPlaidLinkActivityLauncher");
                case 22:
                    PromotionsReferralsHomePresenter$Factory$Impl promotionsReferralsHomePresenter$Factory$Impl = (PromotionsReferralsHomePresenter$Factory$Impl) instanceFactory.value;
                    promotionsReferralsHomePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(promotionsReferralsHomePresenter$Factory$Impl, 23);
                case 23:
                    ConfirmFirstScheduledReloadNoticePresenter$Factory$Impl confirmFirstScheduledReloadNoticePresenter$Factory$Impl = (ConfirmFirstScheduledReloadNoticePresenter$Factory$Impl) instanceFactory.value;
                    confirmFirstScheduledReloadNoticePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(confirmFirstScheduledReloadNoticePresenter$Factory$Impl, 24);
                case 24:
                    ScoreHomePresenter$Factory$Impl scoreHomePresenter$Factory$Impl = (ScoreHomePresenter$Factory$Impl) instanceFactory.value;
                    scoreHomePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(scoreHomePresenter$Factory$Impl, 25);
                case 25:
                    ShareSheetPresenter$Factory$Impl shareSheetPresenter$Factory$Impl = (ShareSheetPresenter$Factory$Impl) instanceFactory.value;
                    shareSheetPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(shareSheetPresenter$Factory$Impl, 26);
                case 26:
                    StablecoinHomePresenter$Factory$Impl stablecoinHomePresenter$Factory$Impl = (StablecoinHomePresenter$Factory$Impl) instanceFactory.value;
                    stablecoinHomePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(stablecoinHomePresenter$Factory$Impl, 27);
                case 27:
                    Context context3 = (Context) instanceFactory.value;
                    context3.getClass();
                    return new RealStorage(context3);
                case 28:
                    ComponentActivity componentActivity3 = (ComponentActivity) instanceFactory.value;
                    componentActivity3.getClass();
                    return new RealStripeLinkActivityLauncher(componentActivity3, "RealStripeLinkActivityLauncher");
                default:
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    coroutineScope.getClass();
                    return new RealTabPublisher(coroutineScope);
            }
        }
    }

    public RealSandboxer(Context context) {
        this.baseContext = context;
    }

    public final List getAllActiveStorageLinks() {
        String str;
        Long longOrNull;
        JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Context context = this.baseContext;
        File cacheDir = context.getCacheDir();
        File filesDir = context.getFilesDir();
        File parentFile = context.getDatabasePath("dummy").getParentFile();
        parentFile.getClass();
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{cacheDir, filesDir, parentFile}).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String[] list = ((File) it.next()).list();
            if (list != null) {
                for (String str2 : list) {
                    str2.getClass();
                    Long longOrNull2 = StringsKt.toLongOrNull(10, str2);
                    if (longOrNull2 != null) {
                        linkedHashSet.add(Long.valueOf(longOrNull2.longValue()));
                    }
                }
            }
        }
        int i = KeyedStorageContextWrapper.$r8$clinit;
        Regex regex = new Regex("([0-9+])-.*".concat("\\.xml"));
        String str3 = Path.DIRECTORY_SEPARATOR;
        File dataDir = context.getDataDir();
        dataDir.getClass();
        Path path = Path.Companion.get(FilesKt__UtilsKt.resolve(dataDir, "shared_prefs"), false);
        if (jvmSystemFileSystem.exists(path)) {
            TransformingSequence map = SequencesKt___SequencesKt.map(new FilteringSequence(jvmSystemFileSystem.listRecursively(path), false, new StorageLinkQueries$$ExternalSyntheticLambda8(path, 28)), new MainActivity$$ExternalSyntheticLambda5(20));
            Iterator it2 = map.sequence.iterator();
            while (it2.hasNext()) {
                MatcherMatchResult matchEntire = regex.matchEntire((String) map.transformer.invoke(it2.next()));
                if (matchEntire != null && (str = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(1)) != null && (longOrNull = StringsKt.toLongOrNull(10, str)) != null) {
                    linkedHashSet.add(Long.valueOf(longOrNull.longValue()));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }
}
