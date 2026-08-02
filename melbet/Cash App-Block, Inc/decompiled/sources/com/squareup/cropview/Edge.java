package com.squareup.cropview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.text.input.OffsetMapping;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TextCardViewModel;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.p2p.engine.api.v1.PaymentType;
import com.squareup.cash.scrubbing.OffsetMappingStrategy;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.AcceptanceState;
import com.squareup.protos.cash.cashidv.common.NotVerifiedBlockerTemplateName;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Edge {
    public static final /* synthetic */ Edge[] $VALUES;
    public static final Edge BOTTOM;
    public static final Set CORNER_BOTTOM_LEFT;
    public static final Set CORNER_BOTTOM_RIGHT;
    public static final Set CORNER_TOP_LEFT;
    public static final Set CORNER_TOP_RIGHT;
    public static final Companion Companion;
    public static final Edge LEFT;
    public static final Set MOVE;
    public static final Edge RIGHT;
    public static final Edge TOP;

    static {
        Edge edge = new Edge("LEFT", 0);
        LEFT = edge;
        Edge edge2 = new Edge("TOP", 1);
        TOP = edge2;
        Edge edge3 = new Edge("RIGHT", 2);
        RIGHT = edge3;
        Edge edge4 = new Edge("BOTTOM", 3);
        BOTTOM = edge4;
        $VALUES = new Edge[]{edge, edge2, edge3, edge4};
        Companion = new Companion(0);
        EnumSet allOf = EnumSet.allOf(Edge.class);
        allOf.getClass();
        MOVE = CollectionsKt.toSet(allOf);
        EnumSet of = EnumSet.of(edge2, edge);
        of.getClass();
        CORNER_TOP_LEFT = CollectionsKt.toSet(of);
        EnumSet of2 = EnumSet.of(edge2, edge3);
        of2.getClass();
        CORNER_TOP_RIGHT = CollectionsKt.toSet(of2);
        EnumSet of3 = EnumSet.of(edge4, edge);
        of3.getClass();
        CORNER_BOTTOM_LEFT = CollectionsKt.toSet(of3);
        EnumSet of4 = EnumSet.of(edge4, edge3);
        of4.getClass();
        CORNER_BOTTOM_RIGHT = CollectionsKt.toSet(of4);
    }

    public static Edge valueOf(String str) {
        return (Edge) Enum.valueOf(Edge.class, str);
    }

    public static Edge[] values() {
        return (Edge[]) $VALUES.clone();
    }

    public final class Companion implements ClientRenderableUi, OffsetMappingStrategy {
        public final /* synthetic */ int $r8$classId;

        public Companion(RealBleManager realBleManager) {
            this.$r8$classId = 5;
        }

        public static final void access$setLeftOf(List list) {
            Iterable<Pair> iterable;
            List list2 = list;
            list2.getClass();
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Object next = it.next();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    arrayList.add(new Pair(next, next2));
                    next = next2;
                }
                iterable = arrayList;
            } else {
                iterable = EmptyList.INSTANCE;
            }
            for (Pair pair : iterable) {
                ((Digit) pair.first).leftOf = (Digit) pair.second;
            }
        }

        public static ArrayList addCommas(List list) {
            ArrayList arrayList = new ArrayList();
            int beforeDecimal = getBeforeDecimal(list);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 1; i < beforeDecimal; i++) {
                if (i % 3 == 0) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Digit digit = (Digit) it.next();
                if (digit.isComma$amountview() && linkedHashSet.contains(Integer.valueOf(beforeDecimal))) {
                    arrayList.add(digit);
                    linkedHashSet.remove(Integer.valueOf(beforeDecimal));
                } else if (!digit.isComma$amountview()) {
                    boolean z = digit instanceof Digit.Number;
                    if (z && linkedHashSet.contains(Integer.valueOf(beforeDecimal))) {
                        arrayList.add(toDigit$amountview(','));
                        arrayList.add(digit);
                    } else if (z) {
                        arrayList.add(digit);
                    } else {
                        arrayList.add(digit);
                    }
                    beforeDecimal--;
                }
            }
            return arrayList;
        }

        public static List expandAfterFraction(int i, ArrayList arrayList) {
            if (!getHasDecimalPoint(arrayList)) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            int afterDecimal = i - getAfterDecimal(arrayList);
            for (int i2 = 0; i2 < afterDecimal; i2++) {
                arrayList2.add(new Digit.EmptyZero(i2));
            }
            return arrayList2;
        }

        public static EnumSet from(HorizontalRegion horizontalRegion, VerticalRegion verticalRegion) {
            EnumSet noneOf = EnumSet.noneOf(Edge.class);
            int ordinal = horizontalRegion.ordinal();
            if (ordinal == 0) {
                noneOf.add(Edge.LEFT);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                noneOf.add(Edge.RIGHT);
            }
            int ordinal2 = verticalRegion.ordinal();
            if (ordinal2 == 0) {
                noneOf.add(Edge.TOP);
            } else if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                noneOf.add(Edge.BOTTOM);
            }
            if (!noneOf.isEmpty()) {
                return noneOf;
            }
            EnumSet allOf = EnumSet.allOf(Edge.class);
            allOf.getClass();
            return allOf;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static C4BOnboardingFlowParameters.EntryPoint m3827fromValue(int i) {
            switch (i) {
                case 0:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                case 1:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_PROFILE;
                case 2:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_INFO_SETTING;
                case 3:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_P2P_WARNING_SWITCH_TO_BUSINESS;
                case 4:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_SWITCHER;
                case 5:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACCOUNT_FOOTER;
                case 6:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_ACTIVITY_ROW;
                case 7:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_PERSONAL_USE_ELIGIBILITY_VIOLATION;
                case 8:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_APPROVED_PUSH;
                case 9:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_APPROVED_EMAIL;
                case 10:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_PUSH;
                case 11:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_EMAIL;
                case 12:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_IN_APP_INLINE;
                case 13:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_C4B_AUTO_DOWNGRADED;
                case 14:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_PROFILE_UPSELL;
                case 15:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_HAS_ATTEMPTS_REMAINING_PUSH;
                case 16:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_HAS_ATTEMPTS_REMAINING_EMAIL;
                case 17:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_ATTEMPTS_EXHAUSTED_PUSH;
                case 18:
                    return C4BOnboardingFlowParameters.EntryPoint.ENTRY_POINT_BIDV_FAILED_ATTEMPTS_EXHAUSTED_EMAIL;
                default:
                    return null;
            }
        }

        public static int getAfterDecimal(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            int i = 0;
            boolean z = false;
            while (it.hasNext()) {
                Digit digit = (Digit) it.next();
                if (digit.isDecimalPoint$amountview()) {
                    z = true;
                } else if (((digit instanceof Digit.Number) && z) || ((digit instanceof Digit.EmptyZero) && z)) {
                    i++;
                }
            }
            return i;
        }

        public static int getBeforeDecimal(List list) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                Digit digit = (Digit) it.next();
                if (digit.isDecimalPoint$amountview()) {
                    break;
                }
                if (digit instanceof Digit.Number) {
                    i++;
                }
            }
            return i;
        }

        public static boolean getHasDecimalPoint(List list) {
            Object obj;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Digit) obj).isDecimalPoint$amountview()) {
                    break;
                }
            }
            return obj != null;
        }

        public static Digit toDigit$amountview(char c) {
            if ('0' <= c && c < ':') {
                return new Digit.Number(c - '0', false);
            }
            if (c == '.') {
                return new Digit.Symbol('.');
            }
            if (c == ',') {
                return new Digit.Symbol(',');
            }
            Path$$ExternalSyntheticBUOutline0.m$2(c, "char is not a digit or a decimal. char=");
            return null;
        }

        public void Content(NavigationCardViewModel navigationCardViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1990213422);
            int i2 = (gapComposer.changedInstance(navigationCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                TextCardKt.NavigationCard(navigationCardViewModel, null, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) navigationCardViewModel, (Function) function1, i, 5);
            }
        }

        @Override // com.squareup.cash.scrubbing.OffsetMappingStrategy
        public OffsetMapping createOffsetMapping(String str, ArrayList arrayList) {
            str.getClass();
            return new ToolbarTuckTargets(str, arrayList);
        }

        public /* synthetic */ Companion(int i) {
            this.$r8$classId = i;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static AcceptanceState m3828fromValue(int i) {
            if (i == 0) {
                return AcceptanceState.UNSPECIFIED;
            }
            if (i == 1) {
                return AcceptanceState.NOT_PRESENT;
            }
            if (i == 2) {
                return AcceptanceState.ACCEPTED;
            }
            if (i == 3) {
                return AcceptanceState.REJECTED;
            }
            if (i != 4) {
                return null;
            }
            return AcceptanceState.REVOKED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PaymentType m3825fromValue(int i) {
            switch (i) {
                case 0:
                    return PaymentType.PAYMENT_TYPE_UNSPECIFIED;
                case 1:
                    return PaymentType.PAYMENT_TYPE_P2P_FIAT;
                case 2:
                    return PaymentType.PAYMENT_TYPE_ALLOWANCE;
                case 3:
                    return PaymentType.PAYMENT_TYPE_INTERNAL_P2P_FIAT;
                case 4:
                    return PaymentType.PAYMENT_TYPE_MARKETING;
                case 5:
                    return PaymentType.PAYMENT_TYPE_SQUARE_PAYROLL;
                case 6:
                    return PaymentType.PAYMENT_TYPE_REFERRAL;
                case 7:
                    return PaymentType.PAYMENT_TYPE_MONEY_POOL_CONTRIBUTION;
                case 8:
                    return PaymentType.PAYMENT_TYPE_OON_MONEY_POOL_CONTRIBUTION;
                case 9:
                    return PaymentType.PAYMENT_TYPE_TIDAL_ARTIST_CONTRIBUTION;
                case 10:
                    return PaymentType.PAYMENT_TYPE_CASH_CARD_PURCHASE;
                case 11:
                    return PaymentType.PAYMENT_TYPE_REIMBURSEMENT;
                case 12:
                    return PaymentType.PAYMENT_TYPE_SPONSOR_DEPOSIT_TO_MANAGED_ACCOUNT;
                case 13:
                    return PaymentType.PAYMENT_TYPE_SPONSOR_WITHDRAWAL_FROM_MANAGED_ACCOUNT;
                case 14:
                    return PaymentType.PAYMENT_TYPE_OON_P2P_FIAT;
                case 15:
                    return PaymentType.PAYMENT_TYPE_PAYMENT;
                default:
                    return null;
            }
        }

        public void Content(TextCardViewModel textCardViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1766355577);
            int i2 = (gapComposer.changedInstance(textCardViewModel) ? 4 : 2) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                TextCardKt.TextCard(textCardViewModel, null, gapComposer, i2 & 14);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) textCardViewModel, (Function) function1, i, 10);
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TapToPay.OnboardingStatus m3826fromValue(int i) {
            if (i == 1) {
                return TapToPay.OnboardingStatus.NOT_TARGETED;
            }
            if (i == 2) {
                return TapToPay.OnboardingStatus.NOMINATED;
            }
            if (i == 3) {
                return TapToPay.OnboardingStatus.ACTIVATED;
            }
            if (i == 4) {
                return TapToPay.OnboardingStatus.DEACTIVATED;
            }
            if (i != 5) {
                return null;
            }
            return TapToPay.OnboardingStatus.ARCHIVED;
        }

        @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
        public /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, Composer composer) {
            switch (this.$r8$classId) {
                case 1:
                    Content((NavigationCardViewModel) obj, function1, composer, 0);
                    break;
                default:
                    Content((TextCardViewModel) obj, function1, composer, 0);
                    break;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static NotVerifiedBlockerTemplateName m3829fromValue(int i) {
            if (i == 0) {
                return NotVerifiedBlockerTemplateName.NOT_VERIFIED_UNSPECIFIED;
            }
            if (i == 1) {
                return NotVerifiedBlockerTemplateName.NOT_VERIFIED_DEFAULT;
            }
            if (i == 2) {
                return NotVerifiedBlockerTemplateName.NOT_VERIFIED_OPTIONAL_ONBOARDING;
            }
            if (i == 3) {
                return NotVerifiedBlockerTemplateName.NOT_VERIFIED_LOGGED_OUT;
            }
            if (i != 4) {
                return null;
            }
            return NotVerifiedBlockerTemplateName.NOT_VERIFIED_DENYLIST_APPEAL;
        }

        public static ComposePlatform.TextAlign fromValue(int i) {
            if (i == 0) {
                return ComposePlatform.TextAlign.TEXT_ALIGN_UNSPECIFIED;
            }
            if (i == 1) {
                return ComposePlatform.TextAlign.TEXT_ALIGN_START;
            }
            if (i == 2) {
                return ComposePlatform.TextAlign.TEXT_ALIGN_END;
            }
            if (i == 3) {
                return ComposePlatform.TextAlign.TEXT_ALIGN_CENTER;
            }
            if (i != 4) {
                return null;
            }
            return ComposePlatform.TextAlign.TEXT_ALIGN_JUSTIFY;
        }
    }
}
