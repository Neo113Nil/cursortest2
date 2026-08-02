package kotlin.ranges;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.Color;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadKey;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrefixMap;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.util.Bytes;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsUsageStats;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.growtools.presenters.manager.roundups.OriginSpecificData;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsOriginSpecificDataUtilsKt$getAvatar$1;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public interface ClosedRange {

    /* loaded from: classes9.dex */
    public abstract class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object access$getAvatar(RoundUpsAutomationTarget roundUpsAutomationTarget, Lazy lazy, boolean z, ContinuationImpl continuationImpl) {
            RoundUpsOriginSpecificDataUtilsKt$getAvatar$1 roundUpsOriginSpecificDataUtilsKt$getAvatar$1;
            int i;
            String str;
            if (continuationImpl instanceof RoundUpsOriginSpecificDataUtilsKt$getAvatar$1) {
                roundUpsOriginSpecificDataUtilsKt$getAvatar$1 = (RoundUpsOriginSpecificDataUtilsKt$getAvatar$1) continuationImpl;
                int i2 = roundUpsOriginSpecificDataUtilsKt$getAvatar$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    roundUpsOriginSpecificDataUtilsKt$getAvatar$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = roundUpsOriginSpecificDataUtilsKt$getAvatar$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = roundUpsOriginSpecificDataUtilsKt$getAvatar$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!(roundUpsAutomationTarget instanceof RoundUpsAutomationTarget.InvestmentEntity)) {
                            if (roundUpsAutomationTarget instanceof RoundUpsAutomationTarget.CryptoCurrency) {
                                zzd zzdVar = Icons.Companion;
                                return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("FF9MIq"), null, ColorModel.Bitcoin.INSTANCE, false, false, null, false, null, null, 130015));
                            }
                            if (!(roundUpsAutomationTarget instanceof RoundUpsAutomationTarget.SavingsBalance)) {
                                if (roundUpsAutomationTarget instanceof RoundUpsAutomationTarget.SavingsGoals) {
                                    return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.EmojiAvatar(((RoundUpsAutomationTarget.SavingsGoals) roundUpsAutomationTarget).iconId);
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (!z && (str = ((RoundUpsAutomationTarget.SavingsBalance) roundUpsAutomationTarget).iconId) != null) {
                                return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.EmojiAvatar(str);
                            }
                            zzd zzdVar2 = Icons.Companion;
                            Icon icon = new Icon("rph4y6");
                            Color.Token token = ArcadeColors.BrandCashGreen;
                            token.getClass();
                            return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, null, null, icon, null, new ColorModel.Arcade(token.id), false, false, null, false, null, null, 130015));
                        }
                        String str2 = ((RoundUpsAutomationTarget.InvestmentEntity) roundUpsAutomationTarget).identifier;
                        roundUpsOriginSpecificDataUtilsKt$getAvatar$1.label = 1;
                        obj = FlowKt.first(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(((CashAccountDatabaseImpl) lazy.initializer).investmentEntityQueries.forToken(str2)), (CoroutineContext) lazy.value), roundUpsOriginSpecificDataUtilsKt$getAvatar$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Investment_entity investment_entity = (Investment_entity) obj;
                    Image image = investment_entity.icon;
                    com.squareup.protos.cash.ui.Color color = investment_entity.entity_color;
                    color.getClass();
                    return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, image, null, null, null, new ColorModel.Accented(color), false, false, null, false, null, null, 130039));
                }
            }
            roundUpsOriginSpecificDataUtilsKt$getAvatar$1 = new RoundUpsOriginSpecificDataUtilsKt$getAvatar$1(continuationImpl);
            Object obj2 = roundUpsOriginSpecificDataUtilsKt$getAvatar$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = roundUpsOriginSpecificDataUtilsKt$getAvatar$1.label;
            if (i != 0) {
            }
            Investment_entity investment_entity2 = (Investment_entity) obj2;
            Image image2 = investment_entity2.icon;
            com.squareup.protos.cash.ui.Color color2 = investment_entity2.entity_color;
            color2.getClass();
            return new GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar(new StackedAvatarViewModel.Avatar(null, null, null, image2, null, null, null, new ColorModel.Accented(color2), false, false, null, false, null, null, 130039));
        }

        public static final OriginSpecificData.TotalStats bitcoinStats(RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo, GapComposer gapComposer) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = realBitcoinRoundUpsRepo.bitcoinRoundUpsUsageStats;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
            BitcoinRoundUpsUsageStats bitcoinRoundUpsUsageStats = (BitcoinRoundUpsUsageStats) collectAsState.getValue();
            Integer valueOf = bitcoinRoundUpsUsageStats != null ? Integer.valueOf(bitcoinRoundUpsUsageStats.numberOfExecutions) : null;
            BitcoinRoundUpsUsageStats bitcoinRoundUpsUsageStats2 = (BitcoinRoundUpsUsageStats) collectAsState.getValue();
            return new OriginSpecificData.TotalStats(valueOf, bitcoinRoundUpsUsageStats2 != null ? bitcoinRoundUpsUsageStats2.amount : null);
        }

        public static AesGcmJce create(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
            Bytes outputPrefix;
            List arrayList;
            HashMap hashMap = new HashMap();
            for (int i = 0; i < ((List) keysetHandle.entries).size(); i++) {
                KeysetHandle.Entry at = keysetHandle.getAt(i);
                if (at.keyStatus.equals(KeyStatus.ENABLED)) {
                    TransactorKt key = at.getKey();
                    if (key instanceof AeadKey) {
                        outputPrefix = ((AeadKey) key).getOutputPrefix();
                    } else {
                        if (!(key instanceof LegacyProtoKey)) {
                            throw new GeneralSecurityException("Cannot get output prefix for key of class " + key.getClass().getName() + " with parameters " + key.getParameters());
                        }
                        outputPrefix = ((LegacyProtoKey) key).getOutputPrefix();
                    }
                    com.google.mlkit.vision.text.zzd zzdVar = new com.google.mlkit.vision.text.zzd((Aead) primitiveRegistry$$ExternalSyntheticLambda0.create(at), at.id);
                    byte[] bArr = outputPrefix.data;
                    if (bArr.length != 0 && bArr.length != 5) {
                        a$$ExternalSyntheticBUOutline0.m$6("PrefixMap only supports 0 and 5 byte prefixes");
                        return null;
                    }
                    if (hashMap.containsKey(outputPrefix)) {
                        arrayList = (List) hashMap.get(outputPrefix);
                    } else {
                        arrayList = new ArrayList();
                        hashMap.put(outputPrefix, arrayList);
                    }
                    arrayList.add(zzdVar);
                }
            }
            keysetHandle.getAnnotationsOrNull();
            new com.google.mlkit.vision.text.zzd((Aead) primitiveRegistry$$ExternalSyntheticLambda0.create(keysetHandle.getPrimary$1()), keysetHandle.getPrimary$1().id);
            new PrefixMap(hashMap);
            return new AesGcmJce();
        }

        public static boolean isEmpty(ClosedRange closedRange) {
            return closedRange.getStart().compareTo(closedRange.getEndInclusive()) > 0;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();
}
