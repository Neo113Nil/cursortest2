package com.squareup.kotterknife;

import android.view.View;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.fillr.analytics.util.HttpService;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import com.squareup.util.cash.Countries;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredState;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.presentation.Async;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class KotterKnifeKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ KotterKnifeKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                int intValue = ((Integer) obj2).intValue();
                view.getClass();
                return view.findViewById(intValue);
            case 1:
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.BusinessInformative24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.work_views_job_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Time24, (String) null, (Modifier) null, 0L, gapComposer3, 54, 12);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.work_views_timecard_detail_shift_time), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.CategoryRestaurant24, (String) null, (Modifier) null, 0L, gapComposer5, 54, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.work_views_timecard_detail_breaks), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DepositPaper24, (String) null, (Modifier) null, 0L, gapComposer7, 54, 12);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.work_views_timecard_detail_cash_tips), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Note24, (String) null, (Modifier) null, 0L, gapComposer9, 54, 12);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.work_views_timecard_detail_shift_note), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer11 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.End, gapComposer11, 48);
                    int hashCode = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer11, Modifier.Companion.$$INSTANCE);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3834, 0L, (Composer) gapComposer11, (Modifier) null, ((Typography) gapComposer11.consume(staticProvidableCompositionLocal)).labelSmall, (TextLineBalancing) null, "12/3/25", (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3834, 0L, (Composer) gapComposer11, (Modifier) null, ((Typography) gapComposer11.consume(staticProvidableCompositionLocal)).labelSmall, (TextLineBalancing) null, "9:30 AM – 5:00 PM", (Map) null, (Function1) null, false);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer12 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Barista", (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Dec 3 at 9:00 AM  ·  Dec 3 at 5:15 PM", (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "None", (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "$0.00", (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer16 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "None", (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                WorkWebViewKt.WorkWebViewLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                WorkWebViewKt.WorkWebViewInvalidUrl((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                Composer composer17 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(1 & intValue18, (intValue18 & 3) != 2)) {
                    IconKt.m492Iconww6aTOc(Countries.painterResource(R.drawable.stripe_ic_material_close, 0, gapComposer17), Room.stringResource(gapComposer17, R.string.stripe_close), null, Color.White, gapComposer17, Painter.$stable | 3072, 4);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
                StripeRequest stripeRequest = (StripeRequest) obj2;
                httpURLConnection.getClass();
                stripeRequest.getClass();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(80000);
                httpURLConnection.setUseCaches(stripeRequest.getShouldCache());
                httpURLConnection.setRequestMethod(stripeRequest.getMethod().code);
                for (Map.Entry entry : stripeRequest.getHeaders().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (StripeRequest.Method.POST == stripeRequest.getMethod()) {
                    httpURLConnection.setDoOutput(true);
                    Map postHeaders = stripeRequest.getPostHeaders();
                    if (postHeaders != null) {
                        for (Map.Entry entry2 : postHeaders.entrySet()) {
                            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.getClass();
                        stripeRequest.writePostBody(outputStream);
                        outputStream.close();
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            case 21:
                ((String) obj).getClass();
                ((Throwable) obj2).getClass();
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AccountPickerScreenKt.AccountPickerScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                AccountPickerState accountPickerState = (AccountPickerState) obj;
                Async async = (Async) obj2;
                accountPickerState.getClass();
                async.getClass();
                return AccountPickerState.copy$default(accountPickerState, async, null, null, null, null, 62);
            case 24:
                AccountPickerState accountPickerState2 = (AccountPickerState) obj;
                Async async2 = (Async) obj2;
                accountPickerState2.getClass();
                async2.getClass();
                return AccountPickerState.copy$default(accountPickerState2, null, async2, null, null, null, 61);
            case 25:
                AccountPickerState accountPickerState3 = (AccountPickerState) obj;
                Async async3 = (Async) obj2;
                accountPickerState3.getClass();
                async3.getClass();
                return AccountPickerState.copy$default(accountPickerState3, null, null, async3, null, null, 55);
            case 26:
                AccountUpdateRequiredState accountUpdateRequiredState = (AccountUpdateRequiredState) obj;
                Async async4 = (Async) obj2;
                accountUpdateRequiredState.getClass();
                async4.getClass();
                return new AccountUpdateRequiredState(accountUpdateRequiredState.referrer, async4);
            case 27:
                ((Integer) obj2).getClass();
                HttpService.AttachPaymentScreen((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                Async async5 = (Async) obj2;
                ((AttachPaymentState) obj).getClass();
                async5.getClass();
                return new AttachPaymentState(async5);
            default:
                Composer composer18 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(1 & intValue19, (intValue19 & 3) != 2)) {
                    ListItemKt.ShapedIcon(Countries.painterResource(R.drawable.stripe_ic_warning, 0, gapComposer18), null, null, null, null, gapComposer18, Painter.$stable | 24576, 14);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ KotterKnifeKt$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
    }
}
