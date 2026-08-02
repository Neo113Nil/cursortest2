package com.stripe.android.model.parsers;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda2;
import com.appsflyer.AdRevenueScheme;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewPagerViewModel;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.BankAccount;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenizationMethod;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.face.iad.capture.Plane;
import net.oneformapp.helper.matching.POPMatchingFactory;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class TokenJsonParser implements ModelJsonParser {
    public static final void EducationStoryViewPagerContent(int i, EducationStoryViewPagerViewModel educationStoryViewPagerViewModel, ColorModel colorModel, Composer composer, int i2) {
        int i3;
        educationStoryViewPagerViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(260509707);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changedInstance(educationStoryViewPagerViewModel) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(colorModel) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ChromeConfigKt.ChromeConfig(null, ChromeSystemIconColor.ALWAYS_LIGHT, null, null, null, null, null, gapComposer, 48, 125);
            ArrayList arrayList = educationStoryViewPagerViewModel.storyViewModels;
            boolean changedInstance = gapComposer.changedInstance(arrayList);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new n$$ExternalSyntheticLambda2(8, arrayList);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(i, (Function0) rememberedValue, gapComposer, i3 & 14, 2);
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, Color.Black, ColorKt.RectangleShape), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, null, null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-2124183598, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(9, rememberPagerState, arrayList, colorModel), gapComposer), gapComposer, 0, 24576, 16382);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(i, educationStoryViewPagerViewModel, colorModel, i2, 8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Token parse(JSONObject jSONObject) {
        Object obj;
        CardBrand cardBrand;
        Iterator it;
        Object obj2;
        CardFunding cardFunding;
        Iterator it2;
        Card card;
        String str;
        String str2;
        Object obj3;
        String optString = StripeJsonUtils.optString("id", jSONObject);
        Long valueOf = !jSONObject.has("created") ? null : Long.valueOf(jSONObject.optLong("created"));
        KClasses$$Lambda$1 kClasses$$Lambda$1 = Token.Type.Companion;
        String optString2 = StripeJsonUtils.optString("type", jSONObject);
        kClasses$$Lambda$1.getClass();
        Iterator it3 = Token.Type.$ENTRIES.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((Token.Type) obj).code.equals(optString2)) {
                break;
            }
        }
        Token.Type type2 = (Token.Type) obj;
        if (type2 == null || optString == null || valueOf == null) {
            return null;
        }
        boolean z = jSONObject.has("used") && jSONObject.optBoolean("used", false);
        boolean z2 = jSONObject.has("livemode") && jSONObject.optBoolean("livemode", false);
        String str3 = null;
        Date date = new Date(TimeUnit.SECONDS.toMillis(valueOf.longValue()));
        int ordinal = type2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return new Token(optString, type2, date, z2, z, null, null, 96);
            }
            Token.Type type3 = Token.Type.BankAccount;
            JSONObject optJSONObject = jSONObject.optJSONObject("bank_account");
            if (optJSONObject == null) {
                return null;
            }
            String optString3 = StripeJsonUtils.optString("id", optJSONObject);
            String optString4 = StripeJsonUtils.optString("account_holder_name", optJSONObject);
            LinkResolverDef linkResolverDef = BankAccount.Type.Companion;
            String optString5 = StripeJsonUtils.optString("account_holder_type", optJSONObject);
            linkResolverDef.getClass();
            Iterator it4 = BankAccount.Type.$ENTRIES.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    str2 = str3;
                    obj3 = str2;
                    break;
                }
                obj3 = it4.next();
                str2 = str3;
                if (((BankAccount.Type) obj3).code.equals(optString5)) {
                    break;
                }
                str3 = str2;
            }
            BankAccount.Type type4 = (BankAccount.Type) obj3;
            String optString6 = StripeJsonUtils.optString("bank_name", optJSONObject);
            String optString7 = optJSONObject.optString(AdRevenueScheme.COUNTRY);
            if (optString7 == null || "null".equals(optString7) || optString7.length() == 0) {
                optString7 = str2;
            }
            String str4 = (optString7 == null || optString7.length() != 2) ? str2 : optString7;
            String optCurrency = StripeJsonUtils.optCurrency(optJSONObject);
            String optString8 = StripeJsonUtils.optString("fingerprint", optJSONObject);
            String optString9 = StripeJsonUtils.optString("last4", optJSONObject);
            String optString10 = StripeJsonUtils.optString("routing_number", optJSONObject);
            Plane plane = BankAccount.Status.Companion;
            String optString11 = StripeJsonUtils.optString("status", optJSONObject);
            plane.getClass();
            Iterator it5 = BankAccount.Status.$ENTRIES.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (((BankAccount.Status) next).code.equals(optString11)) {
                    str2 = next;
                    break;
                }
            }
            return new Token(optString, type3, date, z2, z, new BankAccount(optString3, optString4, type4, optString6, str4, optCurrency, optString8, optString9, optString10, (BankAccount.Status) str2), null, 64);
        }
        Object obj4 = null;
        Token.Type type5 = Token.Type.Card;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("card");
        if (optJSONObject2 == null) {
            return null;
        }
        if ("card".equals(optJSONObject2.optString("object"))) {
            Integer valueOf2 = !optJSONObject2.has("exp_month") ? null : Integer.valueOf(optJSONObject2.optInt("exp_month"));
            int intValue = valueOf2 != null ? valueOf2.intValue() : -1;
            Integer valueOf3 = (intValue < 1 || intValue > 12) ? null : Integer.valueOf(intValue);
            Integer valueOf4 = !optJSONObject2.has("exp_year") ? null : Integer.valueOf(optJSONObject2.optInt("exp_year"));
            int intValue2 = valueOf4 != null ? valueOf4.intValue() : -1;
            Integer valueOf5 = intValue2 < 0 ? null : Integer.valueOf(intValue2);
            String optString12 = StripeJsonUtils.optString("address_city", optJSONObject2);
            String optString13 = StripeJsonUtils.optString("address_line1", optJSONObject2);
            String optString14 = StripeJsonUtils.optString("address_line1_check", optJSONObject2);
            String optString15 = StripeJsonUtils.optString("address_line2", optJSONObject2);
            String optString16 = StripeJsonUtils.optString("address_country", optJSONObject2);
            String optString17 = StripeJsonUtils.optString("address_state", optJSONObject2);
            String optString18 = StripeJsonUtils.optString("address_zip", optJSONObject2);
            String optString19 = StripeJsonUtils.optString("address_zip_check", optJSONObject2);
            String optString20 = StripeJsonUtils.optString("brand", optJSONObject2);
            if (optString20 != null) {
                switch (optString20.hashCode()) {
                    case -993787207:
                        if (optString20.equals("Diners Club")) {
                            cardBrand = CardBrand.DinersClub;
                            break;
                        }
                        break;
                    case -298759312:
                        if (optString20.equals("American Express")) {
                            cardBrand = CardBrand.AmericanExpress;
                            break;
                        }
                        break;
                    case -231891079:
                        if (optString20.equals("UnionPay")) {
                            cardBrand = CardBrand.UnionPay;
                            break;
                        }
                        break;
                    case -46205774:
                        if (optString20.equals("MasterCard")) {
                            cardBrand = CardBrand.MasterCard;
                            break;
                        }
                        break;
                    case 73257:
                        if (optString20.equals("JCB")) {
                            cardBrand = CardBrand.JCB;
                            break;
                        }
                        break;
                    case 2666593:
                        if (optString20.equals("Visa")) {
                            cardBrand = CardBrand.Visa;
                            break;
                        }
                        break;
                    case 337828873:
                        if (optString20.equals("Discover")) {
                            cardBrand = CardBrand.Discover;
                            break;
                        }
                        break;
                }
                CardBrand cardBrand2 = cardBrand;
                String nullIfNullOrEmpty = StripeJsonUtils.nullIfNullOrEmpty(optJSONObject2.optString(AdRevenueScheme.COUNTRY));
                String str5 = (nullIfNullOrEmpty == null && nullIfNullOrEmpty.length() == 2) ? nullIfNullOrEmpty : null;
                String optString21 = StripeJsonUtils.optString("customer", optJSONObject2);
                String optCurrency2 = StripeJsonUtils.optCurrency(optJSONObject2);
                String optString22 = StripeJsonUtils.optString("cvc_check", optJSONObject2);
                KClasses$$Lambda$1 kClasses$$Lambda$12 = CardFunding.Companion;
                String optString23 = StripeJsonUtils.optString("funding", optJSONObject2);
                kClasses$$Lambda$12.getClass();
                it = CardFunding.$ENTRIES.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                    } else {
                        obj2 = it.next();
                        String str6 = ((CardFunding) obj2).code;
                        if (optString23 != null) {
                            str = optString23.toLowerCase(Locale.ROOT);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str6.equals(str)) {
                        }
                    }
                }
                cardFunding = (CardFunding) obj2;
                if (cardFunding == null) {
                    cardFunding = CardFunding.Unknown;
                }
                CardFunding cardFunding2 = cardFunding;
                String optString24 = StripeJsonUtils.optString("fingerprint", optJSONObject2);
                String optString25 = StripeJsonUtils.optString("id", optJSONObject2);
                String optString26 = StripeJsonUtils.optString("last4", optJSONObject2);
                String optString27 = StripeJsonUtils.optString("name", optJSONObject2);
                POPMatchingFactory pOPMatchingFactory = TokenizationMethod.Companion;
                String optString28 = StripeJsonUtils.optString("tokenization_method", optJSONObject2);
                pOPMatchingFactory.getClass();
                it2 = TokenizationMethod.$ENTRIES.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Object next2 = it2.next();
                        if (CollectionsKt.contains(((TokenizationMethod) next2).code, optString28)) {
                            obj4 = next2;
                        }
                    }
                }
                card = new Card(valueOf3, valueOf5, optString27, optString13, optString14, optString15, optString12, optString17, optString18, optString19, optString16, optString26, cardBrand2, cardFunding2, optString24, str5, optCurrency2, optString21, optString22, optString25, (TokenizationMethod) obj4);
            }
            cardBrand = CardBrand.Unknown;
            CardBrand cardBrand22 = cardBrand;
            String nullIfNullOrEmpty2 = StripeJsonUtils.nullIfNullOrEmpty(optJSONObject2.optString(AdRevenueScheme.COUNTRY));
            if (nullIfNullOrEmpty2 == null) {
            }
            String optString212 = StripeJsonUtils.optString("customer", optJSONObject2);
            String optCurrency22 = StripeJsonUtils.optCurrency(optJSONObject2);
            String optString222 = StripeJsonUtils.optString("cvc_check", optJSONObject2);
            KClasses$$Lambda$1 kClasses$$Lambda$122 = CardFunding.Companion;
            String optString232 = StripeJsonUtils.optString("funding", optJSONObject2);
            kClasses$$Lambda$122.getClass();
            it = CardFunding.$ENTRIES.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            cardFunding = (CardFunding) obj2;
            if (cardFunding == null) {
            }
            CardFunding cardFunding22 = cardFunding;
            String optString242 = StripeJsonUtils.optString("fingerprint", optJSONObject2);
            String optString252 = StripeJsonUtils.optString("id", optJSONObject2);
            String optString262 = StripeJsonUtils.optString("last4", optJSONObject2);
            String optString272 = StripeJsonUtils.optString("name", optJSONObject2);
            POPMatchingFactory pOPMatchingFactory2 = TokenizationMethod.Companion;
            String optString282 = StripeJsonUtils.optString("tokenization_method", optJSONObject2);
            pOPMatchingFactory2.getClass();
            it2 = TokenizationMethod.$ENTRIES.iterator();
            while (true) {
                if (!it2.hasNext()) {
                }
            }
            card = new Card(valueOf3, valueOf5, optString272, optString13, optString14, optString15, optString12, optString17, optString18, optString19, optString16, optString262, cardBrand22, cardFunding22, optString242, str5, optCurrency22, optString212, optString222, optString252, (TokenizationMethod) obj4);
        } else {
            card = null;
        }
        return new Token(optString, type5, date, z2, z, null, card, 32);
    }

    public static int zza(int i, int i2) {
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
