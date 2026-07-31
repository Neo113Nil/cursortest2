package gbcorp.c312.merkmarker.info.ui.composable.shared;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMREmptyView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"MRKMREmptyView", "", "modifier", "Landroidx/compose/ui/Modifier;", "primaryText", "", "secondaryText", "icon", "Landroidx/compose/ui/graphics/painter/Painter;", "iconContentDescription", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMREmptyViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MRKMREmptyView$lambda$1(Modifier modifier, String str, String str2, Painter painter, String str3, int i, int i2, Composer composer, int i3) {
        MRKMREmptyView(modifier, str, str2, painter, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MRKMREmptyView(Modifier modifier, final String primaryText, String str, Painter painter, String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        int i5;
        String str4;
        int i6;
        final Painter painter2;
        final Modifier modifier3;
        final String str5;
        final String str6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        float f;
        Object obj;
        Painter painter3;
        String str7;
        String str8;
        Painter painter4 = painter;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Composer startRestartGroup = composer.startRestartGroup(-344102598);
        ComposerKt.sourceInformation(startRestartGroup, "C(MRKMREmptyView)N(modifier,primaryText,secondaryText,icon,iconContentDescription)26@930L955:MRKMREmptyView.kt#m5r16l");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(primaryText) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? startRestartGroup.changed(painter4) : startRestartGroup.changedInstance(painter4) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str4 = str2;
                i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
                    Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    String str9 = i8 != 0 ? null : str3;
                    if (i4 != 0) {
                        painter4 = null;
                    }
                    String str10 = i5 == 0 ? str4 : null;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-344102598, i6, -1, "gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyView (MRKMREmptyView.kt:25)");
                    }
                    float f2 = 5;
                    Arrangement.Vertical m786spacedByD5KLDUw = Arrangement.INSTANCE.m786spacedByD5KLDUw(Dp.m8227constructorimpl(f2), Alignment.INSTANCE.getCenterVertically());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m786spacedByD5KLDUw, centerHorizontally, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
                    Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 664786149, "C43@1488L10,38@1284L236:MRKMREmptyView.kt#m5r16l");
                    if (painter4 == null) {
                        startRestartGroup.startReplaceGroup(664773158);
                        startRestartGroup.endReplaceGroup();
                        painter3 = painter4;
                        modifier4 = companion;
                        str7 = str10;
                        obj = null;
                        f = f2;
                    } else {
                        startRestartGroup.startReplaceGroup(664773159);
                        ComposerKt.sourceInformation(startRestartGroup, "*32@1153L111");
                        modifier4 = companion;
                        f = f2;
                        Painter painter5 = painter4;
                        obj = null;
                        ImageKt.Image(painter5, str10, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, Painter.$stable | ((i6 >> 9) & 112), 124);
                        painter3 = painter5;
                        str7 = str10;
                        startRestartGroup.endReplaceGroup();
                    }
                    TextKt.m3259TextNvy7gAk(primaryText, PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(6), 0.0f, 2, obj), 0L, null, TextUnitKt.getSp(18), null, null, null, 0L, null, TextAlign.m8098boximpl(TextAlign.INSTANCE.m8105getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleLarge(), startRestartGroup, ((i6 >> 3) & 14) | 24624, 0, 130028);
                    startRestartGroup = startRestartGroup;
                    if (str9 == null) {
                        startRestartGroup.startReplaceGroup(665185923);
                        startRestartGroup.endReplaceGroup();
                        str8 = str9;
                    } else {
                        startRestartGroup.startReplaceGroup(665185924);
                        ComposerKt.sourceInformation(startRestartGroup, "*47@1563L40,54@1833L10,49@1617L252");
                        SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(f)), startRestartGroup, 6);
                        str8 = str9;
                        TextKt.m3259TextNvy7gAk(str8, PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(12), 0.0f, 2, null), 0L, null, TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.m8098boximpl(TextAlign.INSTANCE.m8105getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium(), startRestartGroup, 24624, 0, 130028);
                        startRestartGroup = startRestartGroup;
                        startRestartGroup.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str5 = str8;
                    modifier3 = modifier4;
                    painter2 = painter3;
                    str6 = str7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    painter2 = painter4;
                    modifier3 = modifier2;
                    str5 = str3;
                    str6 = str4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit MRKMREmptyView$lambda$1;
                            MRKMREmptyView$lambda$1 = MRKMREmptyViewKt.MRKMREmptyView$lambda$1(Modifier.this, primaryText, str5, painter2, str6, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return MRKMREmptyView$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            str4 = str2;
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        str4 = str2;
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
