package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.util.Strings;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class TextFieldUIKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda14(String str, boolean z, int i) {
        this.$r8$classId = 1;
        this.f$1 = str;
        this.f$2 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        String str = this.f$1;
        boolean z = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(-435374195);
                    gapComposer.end(false);
                    if (z) {
                        gapComposer.startReplaceGroup(2064169160);
                    } else {
                        gapComposer.startReplaceGroup(2064169911);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(13);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
                    }
                    gapComposer.end(false);
                    FormLabelKt.FormLabel(0, 0, gapComposer, modifier, str);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BugReportingViewKt.Thumbnail(str, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer2, 6);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                    if (z) {
                        gapComposer2.startReplaceGroup(1362428491);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.linked_businesses_afterpay_label), (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1362662975);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(str);
                    if (z) {
                        KeyMappingKt.appendInlineContent(builder, "business_badge", "�");
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer3, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsJVMKt.mapOf(new Pair("business_badge", new InlineTextContent(new Placeholder(7, Room.getSp(20), Room.getSp(16)), AddFavoritesViewKt.lambda$1842087485))), (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (z) {
                        str = "";
                    }
                    TextKt.m509Text4IGK_g(str, SizeKt.fillMaxWidth(modifier, 1.0f), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, gapComposer4, 48, 0, 130556);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda14(String str, boolean z, int i, byte b) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$2 = z;
    }

    public /* synthetic */ TextFieldUIKt$$ExternalSyntheticLambda14(boolean z, String str) {
        this.$r8$classId = 4;
        this.f$2 = z;
        this.f$1 = str;
    }
}
