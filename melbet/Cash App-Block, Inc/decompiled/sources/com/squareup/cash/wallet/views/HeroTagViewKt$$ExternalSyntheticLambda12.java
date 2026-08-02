package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.IntRect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuToken;
import app.cash.local.screens.app.MenuPickerQuestion;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinNoteQuestion;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetResult;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.StampResult;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetQuestion;
import com.squareup.cash.card.onboarding.screens.StampQuestion;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditFullNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.instruments.screens.InstrumentSelectionResult;
import com.squareup.cash.instruments.screens.WhichInstrument;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.presenters.AllocationGroupWithPercentage;
import com.squareup.cash.paychecks.screens.CustomAllocationQuestion;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.payments.presenters.QuickPayState;
import com.squareup.cash.payments.screens.PaymentAmountQuestion;
import com.squareup.cash.payments.screens.PaymentAmountResult;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.pools.screens.PoolInvitePeopleQuestion;
import com.squareup.cash.pools.screens.PoolInvitePeopleResult;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.support.chat.screens.ChatTransactionPickerResult;
import com.squareup.cash.support.chat.screens.ChatTransactionQuestion;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroTagViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ HeroTagViewKt$$ExternalSyntheticLambda12(CardLockPresenter cardLockPresenter, MutableState mutableState) {
        this.$r8$classId = 21;
        this.f$0 = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05bb  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float min;
        float min2;
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        int i2 = -1;
        int i3 = 0;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                Offset offset = (Offset) obj;
                Size size = (Size) obj2;
                HeartScene heartScene = (HeartScene) mutableState.getValue();
                return Boolean.valueOf(heartScene != null ? heartScene.touchIntersectsHeart(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (size.packedValue >> 32)), Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax))) : false);
            case 1:
                IntRect intRect = (IntRect) obj;
                IntRect intRect2 = (IntRect) obj2;
                int i4 = intRect2.left;
                int i5 = intRect2.bottom;
                int i6 = intRect2.right;
                int i7 = intRect2.top;
                int i8 = intRect.right;
                int i9 = intRect.top;
                int i10 = intRect.bottom;
                int i11 = intRect.left;
                if (i4 < i8) {
                    if (i6 <= i11) {
                        min = 1.0f;
                    } else if (intRect2.getWidth() != 0) {
                        min = (((Math.min(intRect.right, i6) + Math.max(i11, i4)) / 2) - i4) / intRect2.getWidth();
                    }
                    if (i7 < i10) {
                        if (i5 <= i9) {
                            f = 1.0f;
                        } else if (intRect2.getHeight() != 0) {
                            f = (((Math.min(i10, i5) + Math.max(i9, i7)) / 2) - i7) / intRect2.getHeight();
                        }
                    }
                    mutableState.setValue(new TransformOrigin(ColorKt.TransformOrigin(min, f)));
                    return Unit.INSTANCE;
                }
                min = 0.0f;
                if (i7 < i10) {
                }
                mutableState.setValue(new TransformOrigin(ColorKt.TransformOrigin(min, f)));
                return Unit.INSTANCE;
            case 2:
                IntRect intRect3 = (IntRect) obj;
                IntRect intRect4 = (IntRect) obj2;
                int i12 = intRect4.left;
                int i13 = intRect4.bottom;
                int i14 = intRect4.right;
                int i15 = intRect4.top;
                int i16 = intRect3.right;
                int i17 = intRect3.top;
                int i18 = intRect3.bottom;
                int i19 = intRect3.left;
                if (i12 < i16) {
                    if (i14 <= i19) {
                        min2 = 1.0f;
                    } else if (intRect4.getWidth() != 0) {
                        min2 = (((Math.min(intRect3.right, i14) + Math.max(i19, i12)) / 2) - i12) / intRect4.getWidth();
                    }
                    if (i15 < i18) {
                        if (i13 <= i17) {
                            f = 1.0f;
                        } else if (intRect4.getHeight() != 0) {
                            f = (((Math.min(i18, i13) + Math.max(i17, i15)) / 2) - i15) / intRect4.getHeight();
                        }
                    }
                    mutableState.setValue(new TransformOrigin(ColorKt.TransformOrigin(min2, f)));
                    return Unit.INSTANCE;
                }
                min2 = 0.0f;
                if (i15 < i18) {
                }
                mutableState.setValue(new TransformOrigin(ColorKt.TransformOrigin(min2, f)));
                return Unit.INSTANCE;
            case 3:
                LocationMenu.Menu menu = (LocationMenu.Menu) obj2;
                ((MenuPickerQuestion) obj).getClass();
                String str = menu != null ? menu.token : null;
                mutableState.setValue(str != null ? new MenuToken(str) : null);
                return Unit.INSTANCE;
            case 4:
                ((MenuPickerQuestion) obj).getClass();
                mutableState.setValue((LocationMenu.Menu) obj2);
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj2;
                ((BitcoinNoteQuestion) obj).getClass();
                if (str2 != null) {
                    RealBitcoinAmountPickerPresenter.State state = (RealBitcoinAmountPickerPresenter.State) mutableState.getValue();
                    if (StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    mutableState.setValue(RealBitcoinAmountPickerPresenter.State.copy$default(state, null, str2, 3));
                }
                return Unit.INSTANCE;
            case 6:
                Object obj3 = (AddressResult) obj2;
                ((AddressSearchQuestion) obj).getClass();
                if (obj3 != null) {
                    mutableState.setValue(obj3);
                }
                return Unit.INSTANCE;
            case 7:
                StampResult stampResult = (StampResult) obj2;
                ((StampQuestion) obj).getClass();
                if ((stampResult != null ? stampResult.svgStamps : null) != null) {
                    CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) mutableState.getValue();
                    CardStudioViewModelV2.Content content = cardStudioViewModelV2 instanceof CardStudioViewModelV2.Content ? (CardStudioViewModelV2.Content) cardStudioViewModelV2 : null;
                    if (content != 0) {
                        mutableState.setValue(CardStudioViewModelV2.Content.copy$default(content, false, null, null, null, null, stampResult, false, 1535));
                    }
                }
                return Unit.INSTANCE;
            case 8:
                CardStudioMoreSheetResult cardStudioMoreSheetResult = (CardStudioMoreSheetResult) obj2;
                ((CardStudioMoreSheetQuestion) obj).getClass();
                if (cardStudioMoreSheetResult instanceof CardStudioMoreSheetResult.StartOver) {
                    CardStudioViewModelV2 cardStudioViewModelV22 = (CardStudioViewModelV2) mutableState.getValue();
                    CardStudioViewModelV2.Content content2 = cardStudioViewModelV22 instanceof CardStudioViewModelV2.Content ? (CardStudioViewModelV2.Content) cardStudioViewModelV22 : null;
                    if (content2 == 0) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(CardStudioViewModelV2.Content.copy$default(content2, ((CardStudioMoreSheetResult.StartOver) cardStudioMoreSheetResult).isShowingCashtag, null, null, null, null, null, true, IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS));
                } else if (cardStudioMoreSheetResult instanceof CardStudioMoreSheetResult.Done) {
                    CardStudioViewModelV2 cardStudioViewModelV23 = (CardStudioViewModelV2) mutableState.getValue();
                    CardStudioViewModelV2.Content content3 = cardStudioViewModelV23 instanceof CardStudioViewModelV2.Content ? (CardStudioViewModelV2.Content) cardStudioViewModelV23 : null;
                    if (content3 == 0) {
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(CardStudioViewModelV2.Content.copy$default(content3, ((CardStudioMoreSheetResult.Done) cardStudioMoreSheetResult).isShowingCashtag, null, null, null, null, null, false, 2045));
                } else if (!(cardStudioMoreSheetResult instanceof CardStudioMoreSheetResult.Dismissed) && cardStudioMoreSheetResult != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 9:
                Object obj4 = (AddressResult) obj2;
                ((AddressSearchQuestion) obj).getClass();
                if (obj4 != null) {
                    mutableState.setValue(obj4);
                }
                return Unit.INSTANCE;
            case 10:
                Object obj5 = (AddressResult) obj2;
                ((AddressSearchQuestion) obj).getClass();
                if (obj5 != null) {
                    mutableState.setValue(obj5);
                }
                return Unit.INSTANCE;
            case 11:
                Redacted redacted = (Redacted) obj2;
                ((DirectDepositEditFullNameScreen.FullNameQuestion) obj).getClass();
                if (redacted != null) {
                    mutableState.setValue((String) redacted.getValue());
                }
                return Unit.INSTANCE;
            case 12:
                Redacted redacted2 = (Redacted) obj2;
                ((DirectDepositEditCompanyNameScreen.CompanyNameQuestion) obj).getClass();
                if (redacted2 != null) {
                    mutableState.setValue((String) redacted2.getValue());
                }
                return Unit.INSTANCE;
            case 13:
                Object obj6 = (PaycheckDepositAllocation) obj2;
                ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) obj).getClass();
                if (obj6 != null) {
                    mutableState.setValue(obj6);
                }
                return Unit.INSTANCE;
            case 14:
                Redacted redacted3 = (Redacted) obj2;
                ((DirectDepositEditFullNameScreen.FullNameQuestion) obj).getClass();
                if (redacted3 != null) {
                    mutableState.setValue((String) redacted3.getValue());
                }
                return Unit.INSTANCE;
            case 15:
                Redacted redacted4 = (Redacted) obj2;
                ((DirectDepositEditCompanyNameScreen.CompanyNameQuestion) obj).getClass();
                if (redacted4 != null) {
                    mutableState.setValue((String) redacted4.getValue());
                }
                return Unit.INSTANCE;
            case 16:
                Object obj7 = (PaycheckDepositAllocation) obj2;
                ((DirectDepositEditPaycheckAllocationScreen.EditPaycheckQuestion) obj).getClass();
                if (obj7 != null) {
                    mutableState.setValue(obj7);
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (((String) mutableState.getValue()) == null) {
                        gapComposer.startReplaceGroup(-1976643004);
                    } else {
                        gapComposer.startReplaceGroup(-1976643003);
                        Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, (String) mutableState.getValue(), (Map) null, (Function1) null, false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                pointerInputChange.getClass();
                pointerInputChange.consume();
                mutableState.setValue(new Offset(Offset.m626plusMKHz9U(((Offset) mutableState.getValue()).packedValue, ((Offset) obj2).packedValue)));
                return Unit.INSTANCE;
            case 20:
                Map map = (Map) obj2;
                ((EditDistributionScreen.UpdatedAllocationQuestion) obj).getClass();
                if (map != null) {
                    List list = (List) mutableState.getValue();
                    list.getClass();
                    if (list.size() != map.size()) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("[distribution] has a size of ", map.size(), list.size(), ", but receiver has a size of "));
                        return null;
                    }
                    List<MultipleAllocationBlocker.Allocation> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (MultipleAllocationBlocker.Allocation allocation : list2) {
                        PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = allocation.destination;
                        Object obj8 = map.get(destinationAndShare.destination);
                        obj8.getClass();
                        arrayList.add(MultipleAllocationBlocker.Allocation.copy$default(allocation, PaycheckAllocationDistribution.DestinationAndShare.copy$default(destinationAndShare, ((Number) obj8).longValue())));
                    }
                    mutableState.setValue(arrayList);
                }
                return Unit.INSTANCE;
            case 21:
                Float f2 = (Float) obj2;
                ((CustomAllocationQuestion) obj).getClass();
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    ArrayList group = ColorResources_androidKt.group((List) mutableState.getValue());
                    Iterator it = group.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List list3 = ((AllocationGroupWithPercentage) it.next()).allocations;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (((MultipleAllocationBlocker.Allocation) it2.next()).editability instanceof MultipleAllocationBlocker.Allocation.Editable) {
                                        i2 = i3;
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                    mutableState.setValue(CardLockPresenter.distributionUpdated(group, i2, com.squareup.cash.paychecks.presenters.util.UtilsKt.getBasisPoints(floatValue)));
                }
                return Unit.INSTANCE;
            case 22:
                PaymentAmountResult paymentAmountResult = (PaymentAmountResult) obj2;
                ((PaymentAmountQuestion) obj).getClass();
                if (paymentAmountResult instanceof PaymentAmountResult.EditAmountResult) {
                    mutableState.setValue(((PaymentAmountResult.EditAmountResult) paymentAmountResult).amount);
                }
                return Unit.INSTANCE;
            case 23:
                MusicScreen.SelectedTrackResult selectedTrackResult = (MusicScreen.SelectedTrackResult) obj2;
                ((MusicScreen.MusicQuestion) obj).getClass();
                if (selectedTrackResult != null) {
                    mutableState.setValue(new SelectedTrack(selectedTrackResult.image, selectedTrackResult.title, selectedTrackResult.artist, selectedTrackResult.musicId));
                }
                return Unit.INSTANCE;
            case 24:
                PersonalizePaymentResult personalizePaymentResult = (PersonalizePaymentResult) obj2;
                ((PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion) obj).getClass();
                if (personalizePaymentResult != null) {
                    mutableState.setValue(QuickPayState.copy$default((QuickPayState) mutableState.getValue(), null, null, null, false, null, (String) personalizePaymentResult.note.getValue(), null, null, null, null, null, null, false, null, false, null, null, 262079));
                }
                return Unit.INSTANCE;
            case 25:
                InstrumentSelectionResult instrumentSelectionResult = (InstrumentSelectionResult) obj2;
                ((WhichInstrument) obj).getClass();
                mutableState.setValue(new InstrumentSelection(instrumentSelectionResult != null ? instrumentSelectionResult.token : null, instrumentSelectionResult != null ? instrumentSelectionResult.acceptedFeeAmount : null, (CashInstrumentType) null, 12));
                return Unit.INSTANCE;
            case 26:
                PoolInvitePeopleResult poolInvitePeopleResult = (PoolInvitePeopleResult) obj2;
                ((PoolInvitePeopleQuestion) obj).getClass();
                if (poolInvitePeopleResult != null) {
                    List list4 = (List) mutableState.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj9 : list4) {
                        if (!CollectionsKt.contains((Iterable) poolInvitePeopleResult.removed.getValue(), ((PoolParticipant) obj9).customer_identifier)) {
                            arrayList2.add(obj9);
                        }
                    }
                    mutableState.setValue(arrayList2);
                    mutableState.setValue(CollectionsKt.plus((Iterable) poolInvitePeopleResult.added.getValue(), (Collection) mutableState.getValue()));
                }
                return Unit.INSTANCE;
            case 27:
                ChatTransactionPickerResult chatTransactionPickerResult = (ChatTransactionPickerResult) obj2;
                ((ChatTransactionQuestion) obj).getClass();
                if (chatTransactionPickerResult instanceof ChatTransactionPickerResult.Success) {
                    mutableState.setValue(((ChatTransactionPickerResult.Success) chatTransactionPickerResult).token);
                }
                return Unit.INSTANCE;
            case 28:
                SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success supportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success = (SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success) obj2;
                ((SupportScreens.FlowScreens.SupportActivityPickerFullScreen.SelectTransactionQuestion) obj).getClass();
                if (supportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success != null) {
                    mutableState.setValue(supportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success.token);
                }
                return Unit.INSTANCE;
            default:
                SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result result = (SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.Result) obj2;
                ((SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion) obj).getClass();
                int i20 = result == null ? -1 : ArticlePresenter.WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
                if (i20 != -1) {
                    if (i20 == 1) {
                        mutableState.setValue(ArticlePresenter.IncidentsState.VIEWED);
                    } else if (i20 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HeroTagViewKt$$ExternalSyntheticLambda12(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }
}
