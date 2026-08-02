package net.idrnd.face.iad.capture.internal;

import android.util.Size;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.settings.InvestingSettingsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel$Entry$SubLabel$Highlight;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel$Entry$SubLabel$Standard;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.DropMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public abstract class s {
    public static final void EntryRow(InvestingSettingsViewModel.Entry entry, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier wrapContentHeight;
        int i2;
        long j;
        Modifier.Companion companion;
        entry.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1619745724);
        int i3 = 16;
        int i4 = i | (gapComposer2.changed(entry) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            long j2 = MooncakeTheme.getColors(gapComposer2).background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, j2, rectangleShapeKt$RectangleShape$1);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(i3, function1, entry);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, false, null, null, (Function0) rememberedValue, 15), 20.0f, 24.0f, 20.0f, 24.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int ordinal = entry.f1167type.ordinal();
            if (ordinal == 0) {
                i2 = R.drawable.icon_notifications_fill_32;
            } else if (ordinal == 1) {
                i2 = R.drawable.icon_recurring_automatic_32;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = R.drawable.investing_components_settings_auto_invest;
            }
            Painter painterResource = Countries.painterResource(i2, 0, gapComposer2);
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion2, 24.0f), 24.0f), MooncakeTheme.getColors(gapComposer2).background, rectangleShapeKt$RectangleShape$1);
            long j3 = MooncakeTheme.getColors(gapComposer2).icon;
            BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            int i5 = Painter.$stable;
            ImageKt.Image(painterResource, null, m177backgroundbw27NRU2, null, null, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer2, i5 | 48, 56);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), MooncakeTheme.getTypography(gapComposer2).smallTitle, (TextLineBalancing) null, entry.label, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            DropMode dropMode = entry.subLabel;
            if (dropMode == null) {
                gapComposer.startReplaceGroup(-653556617);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-653556616);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 10);
                String text = dropMode.getText();
                TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).identifier;
                if (dropMode instanceof InvestingSettingsViewModel$Entry$SubLabel$Standard) {
                    gapComposer.startReplaceGroup(-72747567);
                    j = MooncakeTheme.getColors(gapComposer).tertiaryIcon;
                    gapComposer.end(false);
                } else {
                    if (!(dropMode instanceof InvestingSettingsViewModel$Entry$SubLabel$Highlight)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -72749547, false);
                    }
                    gapComposer.startReplaceGroup(-72745591);
                    j = MooncakeTheme.getColors(gapComposer).tint;
                    gapComposer.end(false);
                }
                companion = companion2;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, text, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            Painter painterResource2 = Countries.painterResource(R.drawable.mooncake_chevron_right, 0, gapComposer);
            Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 24.0f), 24.0f), MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1);
            String str = entry.actionDescription;
            long j4 = MooncakeTheme.getColors(gapComposer).chevron;
            ImageKt.Image(painterResource2, str, m177backgroundbw27NRU3, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j4, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j4), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, i5, 56);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(entry, function1, i, 7);
        }
    }

    public static final void InvestSettings(InvestingSettingsViewModel investingSettingsViewModel, Function1 function1, Composer composer, int i) {
        investingSettingsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(185197670);
        int i2 = (gapComposer.changedInstance(investingSettingsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1609373537, new InvestingSettingsViewKt$$ExternalSyntheticLambda0(investingSettingsViewModel, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingSettingsViewKt$$ExternalSyntheticLambda0(investingSettingsViewModel, function1, i);
        }
    }

    public static String[] b() {
        Collection collection;
        String[] strArr = t.d;
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        List split = new Regex(":").split(0, str);
        if (!split.isEmpty()) {
            ListIterator listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.INSTANCE;
        String[] strArr2 = (String[]) collection.toArray(new String[0]);
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            if (!StringsKt__StringsJVMKt.endsWith(str2, "/", false)) {
                str2 = str2.concat("/");
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: default, reason: not valid java name */
    public static final MiSnapSettings.Camera.VideoRecord m4276default(MiSnapSettings.Camera.VideoRecord.Companion companion) {
        companion.getClass();
        MiSnapSettings.Camera.VideoRecord videoRecord = new MiSnapSettings.Camera.VideoRecord();
        Boolean bool = Boolean.FALSE;
        videoRecord.a = bool;
        videoRecord.b = bool;
        videoRecord.e = 1000000;
        videoRecord.d = new Size(720, 1280);
        videoRecord.c = MiSnapSettings.Camera.VideoRecord.VideoQuality.FHD;
        return videoRecord;
    }

    public static final int getVideoBitrate(MiSnapSettings.Camera.VideoRecord videoRecord) {
        videoRecord.getClass();
        Integer num = videoRecord.e;
        if (num != null && num.intValue() > 0) {
            return num.intValue();
        }
        Integer num2 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).e;
        num2.getClass();
        return num2.intValue();
    }

    public static final MiSnapSettings.Camera.VideoRecord.VideoQuality getVideoQuality(MiSnapSettings.Camera.VideoRecord videoRecord) {
        videoRecord.getClass();
        MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality = videoRecord.c;
        if (videoQuality != null) {
            return videoQuality;
        }
        MiSnapSettings.Camera.VideoRecord.VideoQuality videoQuality2 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).c;
        videoQuality2.getClass();
        return videoQuality2;
    }

    public static final Size getVideoResolution(MiSnapSettings.Camera.VideoRecord videoRecord) {
        videoRecord.getClass();
        Size size = videoRecord.d;
        if (size == null || (size.getWidth() <= 0 && size.getHeight() <= 0)) {
            Size size2 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).d;
            size2.getClass();
            return size2;
        }
        if (size.getWidth() <= 0 && size.getHeight() > 0) {
            Size size3 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).d;
            size3.getClass();
            return new Size(size3.getWidth(), size.getHeight());
        }
        if (size.getWidth() <= 0 || size.getHeight() > 0) {
            return size;
        }
        Size size4 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).d;
        size4.getClass();
        return new Size(size.getWidth(), size4.getHeight());
    }

    public static final MiSnapSettings.Camera.Profile requireProfile(MiSnapSettings.Camera camera) {
        camera.getClass();
        MiSnapSettings.Camera.Profile profile = camera.b;
        if (profile != null) {
            return profile;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required parameter 'profile' is missing from MiSnapSettings");
        return null;
    }

    public static final boolean shouldRecordSession(MiSnapSettings.Camera.VideoRecord videoRecord) {
        videoRecord.getClass();
        Boolean bool = videoRecord.a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = m4276default(MiSnapSettings.Camera.VideoRecord.Companion).a;
        bool2.getClass();
        return bool2.booleanValue();
    }
}
