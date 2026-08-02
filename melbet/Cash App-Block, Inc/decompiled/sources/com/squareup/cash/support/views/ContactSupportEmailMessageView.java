package com.squareup.cash.support.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ContactSupportEmailMessageView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupportEmailMessageView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1781506105);
        int i2 = (gapComposer.changedInstance(contactSupportEmailMessageViewModel$Editing) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (contactSupportEmailMessageViewModel$Editing == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1745563918, new TaxTooltipView$$ExternalSyntheticLambda0(6, contactSupportEmailMessageViewModel$Editing, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(this, contactSupportEmailMessageViewModel$Editing, function1, i, 17);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ContactSupportEmailMessageViewModel$Editing) obj, function1, gapComposer, 0);
    }
}
