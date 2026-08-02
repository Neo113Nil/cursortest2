package com.squareup.cash.transfers.views;

import android.content.Context;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.PendingTransfersConfirmationViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final class PendingTransfersConfirmationDialogView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingTransfersConfirmationDialogView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel, final Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-572675004);
        int i2 = i | (gapComposer.changedInstance(pendingTransfersConfirmationViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (pendingTransfersConfirmationViewModel == null) {
                gapComposer.startReplaceGroup(-950857558);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-950857557);
                ModalKt.Modal((Modifier) null, pendingTransfersConfirmationViewModel.title, pendingTransfersConfirmationViewModel.message, Expect_jvmKt.rememberComposableLambda(-2003830097, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        final PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel2 = pendingTransfersConfirmationViewModel;
                        Function1 function12 = function1;
                        Object[] objArr = 0;
                        char c = 1;
                        switch (i5) {
                            case 0:
                                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                int i6 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                modalButtonScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    boolean changed = gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(14, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final Object[] objArr2 = objArr == true ? 1 : 0;
                                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(2049172986, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i7 = objArr2;
                                            PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel3 = pendingTransfersConfirmationViewModel2;
                                            switch (i7) {
                                                case 0:
                                                    Composer composer3 = (Composer) obj5;
                                                    int intValue2 = ((Integer) obj6).intValue();
                                                    int i8 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.positiveButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    int i9 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.negativeButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, (57344 & (intValue << 12)) | 3072, 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                int i7 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                modalButtonScope2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(15, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    final char c2 = c == true ? 1 : 0;
                                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-112247699, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i72 = c2;
                                            PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel3 = pendingTransfersConfirmationViewModel2;
                                            switch (i72) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    int i8 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.positiveButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    int i9 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.negativeButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, ((intValue2 << 12) & 57344) | 3072, 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(544119408, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        final PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel2 = pendingTransfersConfirmationViewModel;
                        Function1 function12 = function1;
                        Object[] objArr = 0;
                        char c = 1;
                        switch (i5) {
                            case 0:
                                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                int i6 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                modalButtonScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    boolean changed = gapComposer2.changed(function12);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(14, function12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final int objArr2 = objArr == true ? 1 : 0;
                                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(2049172986, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i72 = objArr2;
                                            PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel3 = pendingTransfersConfirmationViewModel2;
                                            switch (i72) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    int i8 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.positiveButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    int i9 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.negativeButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, (57344 & (intValue << 12)) | 3072, 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                int i7 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                modalButtonScope2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(15, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    final int c2 = c == true ? 1 : 0;
                                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-112247699, new Function3() { // from class: com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i72 = c2;
                                            PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel3 = pendingTransfersConfirmationViewModel2;
                                            switch (i72) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    int i8 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.positiveButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    int i9 = PendingTransfersConfirmationDialogView.$r8$clinit;
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingTransfersConfirmationViewModel3.negativeButton, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, ((intValue2 << 12) & 57344) | 3072, 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), (Function3) null, gapComposer, 27648, 33);
                gapComposer.end(false);
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, pendingTransfersConfirmationViewModel, function1, i, 17);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PendingTransfersConfirmationViewModel) obj, function1, gapComposer, 0);
    }
}
