package com.squareup.cash.wallet.views;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletCardSchemeViewKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PrepurchaseCardData.Toggle f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ WalletCardSchemeViewKt$$ExternalSyntheticLambda18(PrepurchaseCardData.Toggle toggle, String str, Function1 function1, boolean z) {
        this.f$0 = toggle;
        this.f$1 = str;
        this.f$2 = function1;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = null;
        Function0 function0 = null;
        function1 = null;
        Function1 function12 = this.f$2;
        String str = this.f$1;
        PrepurchaseCardData.Toggle toggle = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (toggle.loading) {
                        gapComposer.startReplaceGroup(-567404669);
                        gapComposer.end(false);
                    } else if (str != null) {
                        gapComposer.startReplaceGroup(-567346698);
                        boolean changed = gapComposer.changed(function12);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ViewGroups$$ExternalSyntheticLambda0(9, function12);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function1 = (Function1) rememberedValue;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-567238013);
                        gapComposer.end(false);
                    }
                    Function1 function13 = function1;
                    ModalKt.Toggle(this.f$3, null, function13, (toggle.state == ToggleEntryPointData.ToggleState.DISABLED && function13 == null) ? false : true, Expect_jvmKt.rememberComposableLambda(18554326, new CardAppletTile$$ExternalSyntheticLambda1(toggle, 5), gapComposer), gapComposer, 24576, 2);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str2 = toggle.text;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(345988283);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(345988284);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.append(str2);
                        boolean z = this.f$3;
                        if (z) {
                            builder.append(" ");
                            KeyMappingKt.appendInlineContent(builder, "<info_icon>", "�");
                        }
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        if (z) {
                            gapComposer2.startReplaceGroup(714859563);
                            if (str == null) {
                                gapComposer2.startReplaceGroup(715019677);
                            } else {
                                gapComposer2.startReplaceGroup(715019678);
                                boolean changed2 = gapComposer2.changed(function12) | gapComposer2.changed(str);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function12, str, 28);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                function0 = (Function0) rememberedValue2;
                            }
                            gapComposer2.end(false);
                            map = MapsKt__MapsJVMKt.mapOf(new Pair("<info_icon>", UtilsKt.inlineInfoIcon(function0)));
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(715139214);
                            gapComposer2.end(false);
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        }
                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2046, 0L, (Composer) gapComposer2, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, map, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WalletCardSchemeViewKt$$ExternalSyntheticLambda18(PrepurchaseCardData.Toggle toggle, boolean z, String str, Function1 function1) {
        this.f$0 = toggle;
        this.f$3 = z;
        this.f$1 = str;
        this.f$2 = function1;
    }
}
