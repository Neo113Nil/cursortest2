package nl.dionsegijn.konfetti.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ValueInsets;
import androidx.glance.ImageKt$Image$3;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.TraceParser$parse$1;
import com.squareup.cash.R;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.profile.views.OpenSourceKt$OpenSource$1$1$2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.wire.MoshiJsonIntegration;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import nl.dionsegijn.konfetti.core.models.CoreRectImpl;
import nl.dionsegijn.konfetti.xml.image.ImageStore;

/* loaded from: classes6.dex */
public abstract class KonfettiViewKt {
    public static List a;

    public static final void KonfettiView(Modifier modifier, List list, OpenSourceKt$OpenSource$1$1$2 openSourceKt$OpenSource$1$1$2, Composer composer, int i) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-882086200);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        gapComposer.startReplaceableGroup(-492369756);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        gapComposer.end(false);
        MutableState mutableState = (MutableState) rememberedValue;
        gapComposer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(0L);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        gapComposer.end(false);
        MutableState mutableState2 = (MutableState) rememberedValue2;
        gapComposer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(new CoreRectImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        gapComposer.end(false);
        MutableState mutableState3 = (MutableState) rememberedValue3;
        gapComposer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = new ImageStore();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        gapComposer.end(false);
        ImageStore imageStore = (ImageStore) rememberedValue4;
        Updater.LaunchedEffect(gapComposer, Unit.INSTANCE, new HeroCardViewKt$Render$1$4$1(ref$ObjectRef, list, imageStore, mutableState2, mutableState, openSourceKt$OpenSource$1$1$2, mutableState3, (Continuation) null));
        gapComposer.startReplaceableGroup(1157296644);
        boolean changed = gapComposer.changed(mutableState3);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == obj) {
            rememberedValue5 = new InterceptedRenderContext$send$1(mutableState3, 9);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        gapComposer.end(false);
        CanvasKt.Canvas(0, gapComposer, ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue5), new TraceParser$parse$1(16, mutableState, imageStore));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.block = new ImageKt$Image$3(modifier, list, openSourceKt$OpenSource$1$1$2, i, 5);
    }

    public static final StockContentModel asContentModel(InvestmentEntityWithPrice investmentEntityWithPrice, StockMetric stockMetric, boolean z, boolean z2, boolean z3, AndroidStringManager androidStringManager, MoneyFormatter moneyFormatter) {
        String str;
        String symbol;
        CurrentPrice price;
        Money money;
        Image icon = investmentEntityWithPrice.getIcon();
        icon.getClass();
        InvestingCryptoAvatarContentModel$Image investingCryptoAvatarContentModel$Image = new InvestingCryptoAvatarContentModel$Image(icon, MoshiJsonIntegration.toModel(investmentEntityWithPrice.getAccentColor()));
        String displayName = investmentEntityWithPrice.getDisplayName();
        InvestmentEntityToken token = investmentEntityWithPrice.getToken();
        String str2 = null;
        if (z && investmentEntityWithPrice.getReleaseStage() == SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO) {
            symbol = androidStringManager.get(R.string.upcoming_stocks_subtitle);
        } else {
            if (!z) {
                str = null;
                String str3 = (z3 || investmentEntityWithPrice.getReleaseStage() != SyncInvestmentEntity.ReleaseStage.PREVIEW_FOR_IPO) ? null : androidStringManager.get(R.string.investing_upcoming_stocks_label);
                price = investmentEntityWithPrice.getPrice();
                if (price != null && (money = price.current_price) != null) {
                    str2 = moneyFormatter.format(money);
                }
                return new StockContentModel(investingCryptoAvatarContentModel$Image, displayName, str, stockMetric, token, z2, str3, str2);
            }
            symbol = investmentEntityWithPrice.getSymbol();
        }
        str = symbol;
        if (z3) {
        }
        price = investmentEntityWithPrice.getPrice();
        if (price != null) {
            str2 = moneyFormatter.format(money);
        }
        return new StockContentModel(investingCryptoAvatarContentModel$Image, displayName, str, stockMetric, token, z2, str3, str2);
    }

    public static /* synthetic */ void setResults$workflow_release(List list) {
        list.getClass();
        a = list;
    }
}
