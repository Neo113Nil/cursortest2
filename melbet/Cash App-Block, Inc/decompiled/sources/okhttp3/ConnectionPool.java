package okhttp3;

import android.content.SharedPreferences;
import android.os.Debug;
import android.view.View;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadj;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadm;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.i18n.phonenumbers.internal.RegexCache$LRUCache$1;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.LiteRegisterAliasHelperKt;
import com.squareup.cash.blockers.presenters.RegisterAliasHelper;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.common.moneyformatter.MoneyFormatter;
import com.squareup.cash.interaction.InteractionScreenViewLogger;
import com.squareup.cash.interaction.InteractionScreenViewLogger$logInteractionResult$1;
import com.squareup.cash.interaction.UiInteractionLatencyAnalyzer;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBip21Parser$parse$1;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinAddressParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.RealLightningInvoiceParser;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.KeyStore;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import okio.PriorityQueue;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InteractionResult;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ConnectionPool implements OnSuccessListener, OnFailureListener, OnCanceledListener, RegisterAliasHelper, MoneyFormatter, OnParticleSystemUpdateListener, OnCompleteListener {
    public Object delegate;

    public ConnectionPool(int i, boolean z) {
        switch (i) {
            case 1:
                this.delegate = new CountDownLatch(1);
                break;
            case 2:
                this.delegate = new AtomicBoolean(false);
                break;
            case 17:
                this.delegate = KeyStore.getInstance("AndroidKeyStore");
                break;
            case 21:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.delegate = emptyMap;
                break;
            case 28:
                this.delegate = new LinkedHashSet();
                break;
            default:
                TimeUnit.MINUTES.getClass();
                TaskRunner taskRunner = TaskRunner.INSTANCE;
                taskRunner.getClass();
                this.delegate = new RealConnectionPool(taskRunner);
                break;
        }
    }

    public static boolean hostEndsWithDomain(String str, List list) {
        if (str != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.endsWith(str, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public RegisterAliasViewModel buildInitialViewModel(BlockersScreens.RegisterAliasScreen registerAliasScreen) {
        BlockersScreens.RegisterAliasScreen.Mode mode = registerAliasScreen.mode;
        BlockersData blockersData = registerAliasScreen.blockersData;
        boolean z = blockersData.flow == BlockersData.Flow.ONBOARDING;
        Region region = blockersData.region;
        if (region == Region.USA) {
            region = LiteRegisterAliasHelperKt.LITE_FALLBACK_REGION;
        }
        Country country = Regions.toCountry(region);
        return new RegisterAliasViewModel(registerAliasScreen.headline, getTitleText(registerAliasScreen, true, true, mode), hintText(registerAliasScreen, true, true, mode), mode == BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL ? RegisterAliasViewModel.Mode.EMAIL : RegisterAliasViewModel.Mode.SMS, false, PhoneNumbers.getCountryCallingCode(country.name()), null, ((AndroidStringManager) this.delegate).get(R.string.blockers_next), blockersData.accentColor, z && blockersData.clientScenario != ClientScenario.RECOVER_ACCOUNT, registerAliasScreen.skippable, false, country, !z || registerAliasScreen.dismissButtonEnabled, true);
    }

    public Pattern getPatternForRegex(String str) {
        Object obj;
        PriorityQueue priorityQueue = (PriorityQueue) this.delegate;
        synchronized (priorityQueue) {
            obj = ((RegexCache$LRUCache$1) priorityQueue.f1547array).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        PriorityQueue priorityQueue2 = (PriorityQueue) this.delegate;
        synchronized (priorityQueue2) {
            ((RegexCache$LRUCache$1) priorityQueue2.f1547array).put(str, compile);
        }
        return compile;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String getTitleText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        return DimensionKt.resolveTitleText((AndroidStringManager) this.delegate, registerAliasScreen, true, true, mode);
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String hintText(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        return DimensionKt.resolveHintText((AndroidStringManager) this.delegate, registerAliasScreen, true, true, mode);
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean isCountrySelectorEnabled() {
        return false;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean isModeSwitchable(BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.delegate).countDown();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.delegate;
        Exception exception = task.getException();
        if (exception != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(exception));
        } else if (task.isCanceled()) {
            cancellableContinuationImpl.cancel(null);
        } else {
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.delegate).countDown();
    }

    public void onInteractionResult(InteractionResult interactionResult) {
        String str;
        InteractionScreenViewLogger interactionScreenViewLogger = ((UiInteractionLatencyAnalyzer) this.delegate).interactionScreenViewLogger;
        if (interactionResult instanceof InteractionResult.Canceled) {
            str = "Canceled";
        } else {
            if (!(interactionResult instanceof InteractionResult.Finished)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            str = "Finished";
        }
        String str2 = str;
        if (interactionResult instanceof InteractionResult.Finished) {
            JobKt.launch$default(interactionScreenViewLogger.scope, interactionScreenViewLogger.ioDispatcher, null, new InteractionScreenViewLogger$logInteractionResult$1(interactionResult, interactionScreenViewLogger, str2, Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapAllocatedSize(), null), 2);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.delegate).countDown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r0 == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r0 == r2) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parse(String str, ContinuationImpl continuationImpl) {
        RealBip21Parser$parse$1 realBip21Parser$parse$1;
        int i;
        SizeMap sizeMap;
        BitcoinAddress bitcoinAddress;
        String uriQueryParam;
        BitcoinAddress bitcoinAddress2;
        String str2;
        LightningInvoice lightningInvoice;
        BitcoinAddress bitcoinAddress3;
        String str3;
        SizeMap sizeMap2;
        String str4 = str;
        RealBitcoinAddressParser realBitcoinAddressParser = (RealBitcoinAddressParser) this.delegate;
        if (continuationImpl instanceof RealBip21Parser$parse$1) {
            realBip21Parser$parse$1 = (RealBip21Parser$parse$1) continuationImpl;
            int i2 = realBip21Parser$parse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBip21Parser$parse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBip21Parser$parse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBip21Parser$parse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!StringsKt.isBlank(str4)) {
                        String replaceFirst = StringsKt__StringsJVMKt.startsWith(str4, "bitcoin://", true) ? str4 : StringsKt__StringsJVMKt.startsWith(str4, "bitcoin:", true) ? StringsKt__StringsJVMKt.replaceFirst(str4, "bitcoin:", "bitcoin://", true) : null;
                        if (replaceFirst == null) {
                            realBip21Parser$parse$1.L$0 = str4;
                            realBip21Parser$parse$1.label = 1;
                            obj = realBitcoinAddressParser.parse(str4, realBip21Parser$parse$1);
                        } else {
                            sizeMap = new SizeMap(replaceFirst);
                            String access$getBitcoinAddress = zzadj.access$getBitcoinAddress(sizeMap);
                            if (access$getBitcoinAddress != null) {
                                realBip21Parser$parse$1.L$0 = str4;
                                realBip21Parser$parse$1.L$2 = sizeMap;
                                realBip21Parser$parse$1.L$3 = null;
                                realBip21Parser$parse$1.label = 2;
                                obj = realBitcoinAddressParser.parse(access$getBitcoinAddress, realBip21Parser$parse$1);
                            } else {
                                bitcoinAddress = null;
                                uriQueryParam = zzadm.getUriQueryParam(sizeMap, "lightning");
                                if (uriQueryParam != null) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    str4 = realBip21Parser$parse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    String str5 = str4;
                    BitcoinAddress bitcoinAddress4 = (BitcoinAddress) obj;
                    if (bitcoinAddress4 != null) {
                        return new BitcoinPayment(str5, bitcoinAddress4, false, (LightningInvoice) null, (Long) null, 56);
                    }
                } else {
                    if (i == 2) {
                        SizeMap sizeMap3 = realBip21Parser$parse$1.L$2;
                        String str6 = realBip21Parser$parse$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        sizeMap = sizeMap3;
                        str4 = str6;
                        bitcoinAddress = (BitcoinAddress) obj;
                        uriQueryParam = zzadm.getUriQueryParam(sizeMap, "lightning");
                        if (uriQueryParam != null) {
                            bitcoinAddress2 = bitcoinAddress;
                            str2 = str4;
                            lightningInvoice = null;
                            if (bitcoinAddress2 == null) {
                            }
                            return new BitcoinPayment(str2, bitcoinAddress2, true, lightningInvoice, zzadj.access$getBitcoinAmount(sizeMap), 32);
                        }
                        realBip21Parser$parse$1.L$0 = str4;
                        realBip21Parser$parse$1.L$2 = sizeMap;
                        realBip21Parser$parse$1.L$3 = bitcoinAddress;
                        realBip21Parser$parse$1.label = 3;
                        LightningInvoice parse = RealLightningInvoiceParser.parse(uriQueryParam);
                        if (parse != coroutineSingletons) {
                            String str7 = str4;
                            bitcoinAddress3 = bitcoinAddress;
                            obj = parse;
                            str3 = str7;
                            sizeMap2 = sizeMap;
                            lightningInvoice = (LightningInvoice) obj;
                            bitcoinAddress2 = bitcoinAddress3;
                            sizeMap = sizeMap2;
                            str2 = str3;
                            if (bitcoinAddress2 == null) {
                            }
                            return new BitcoinPayment(str2, bitcoinAddress2, true, lightningInvoice, zzadj.access$getBitcoinAmount(sizeMap), 32);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitcoinAddress3 = realBip21Parser$parse$1.L$3;
                    sizeMap2 = realBip21Parser$parse$1.L$2;
                    str3 = realBip21Parser$parse$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    lightningInvoice = (LightningInvoice) obj;
                    bitcoinAddress2 = bitcoinAddress3;
                    sizeMap = sizeMap2;
                    str2 = str3;
                    if (bitcoinAddress2 == null || lightningInvoice != null) {
                        return new BitcoinPayment(str2, bitcoinAddress2, true, lightningInvoice, zzadj.access$getBitcoinAmount(sizeMap), 32);
                    }
                }
                return null;
            }
        }
        realBip21Parser$parse$1 = new RealBip21Parser$parse$1(this, continuationImpl);
        Object obj2 = realBip21Parser$parse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBip21Parser$parse$1.label;
        if (i != 0) {
        }
        return null;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public boolean showUpdatedTerms(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig) {
        aliasType.getClass();
        countryOnboardingConfig.getClass();
        return true;
    }

    @Override // com.squareup.cash.blockers.presenters.RegisterAliasHelper
    public String termsText(BlockersScreens.RegisterAliasScreen registerAliasScreen, AliasType aliasType, CountryOnboardingConfig countryOnboardingConfig) {
        aliasType.getClass();
        countryOnboardingConfig.getClass();
        return null;
    }

    public ConnectionPool(RealBitcoinAddressParser realBitcoinAddressParser, RealLightningInvoiceParser realLightningInvoiceParser) {
        this.delegate = realBitcoinAddressParser;
    }

    public ConnectionPool(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.delegate = sharedPreferences;
    }

    public ConnectionPool(int i) {
        final PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.size = i;
        final int m$2 = Boxes$$ExternalSyntheticOutline1.m$2(i, 4, 3, 1);
        priorityQueue.f1547array = new LinkedHashMap(m$2) { // from class: com.google.i18n.phonenumbers.internal.RegexCache$LRUCache$1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry entry) {
                return size() > PriorityQueue.this.size;
            }
        };
        this.delegate = priorityQueue;
    }

    public ConnectionPool(View view) {
        view.getClass();
        this.delegate = view;
    }

    public /* synthetic */ ConnectionPool(Object obj) {
        this.delegate = obj;
    }
}
