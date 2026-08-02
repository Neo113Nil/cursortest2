package com.squareup.kotterknife;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.PayCellViewModel;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.views.shift.ShiftSectionView2Kt;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.uicore.elements.FieldValidationMessage$Error;
import com.stripe.android.uicore.elements.SectionUIKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public final /* synthetic */ class KotterKnifeKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ KotterKnifeKt$$ExternalSyntheticLambda1(KotterKnifeKt$$ExternalSyntheticLambda0 kotterKnifeKt$$ExternalSyntheticLambda0, int i, Context context) {
        this.$r8$classId = 0;
        this.f$0 = kotterKnifeKt$$ExternalSyntheticLambda0;
        this.f$1 = i;
        this.f$2 = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                KProperty kProperty = (KProperty) obj2;
                kProperty.getClass();
                View view = (View) ((KotterKnifeKt$$ExternalSyntheticLambda0) obj4).invoke(obj, Integer.valueOf(i2));
                if (view != null) {
                    return view;
                }
                throw new IllegalStateException(String.format("View '%s' ('%s' -> 0x%x) not found.", Arrays.copyOf(new Object[]{kProperty.getName(), context.getResources().getResourceName(i2), Integer.valueOf(i2)}, 3)));
            case 1:
                ((Integer) obj2).getClass();
                SellerCardKt.WorkHomeView((WorkHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.ClockInBottomSheetView((ClockInBottomSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockStatusBadge((ClockInOverlayViewModel.Loaded) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockInOverlayView((ClockInOverlayViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.DeclareCashTipBottomSheetView((DeclareCashTipBottomSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.TakeBreakBottomSheetView((TakeBreakBottomSheetViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayHomeView((PayHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                PayCellViewKt.PaySectionView((PayCellViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                PayCellViewKt.PaySectionLoaded((PayCellViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                PayCellViewKt.TaxFormsListView((TaxFormsListViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                ShiftListViewKt.ShiftNoteView((ShiftNoteViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.ShiftSectionView2((ShiftSection2ViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.EmptyShiftSection2((ShiftSection2ViewModel.Empty) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ShiftSectionView2Kt.LoadedShiftSection2((ShiftSection2ViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).intValue();
                TimecardDetailViewKt.TimecardDetailView((TimecardDetailViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).intValue();
                ListItemKt.NoSupportedPaymentMethodTypeAccountsErrorContent((AccountNoneEligibleForPaymentMethodError) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).intValue();
                ListItemKt.ListItem((BulletUI) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ((Destination) obj4).Composable((NavBackStackEntry) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                BottomSheetKt.LifecycleAwareContent((LifecycleOwner) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                TextKt.FinancialConnectionsTopAppBar((TopAppBarState) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SectionUIKt.SectionValidationMessage((FieldValidationMessage$Error) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ KotterKnifeKt$$ExternalSyntheticLambda1(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
