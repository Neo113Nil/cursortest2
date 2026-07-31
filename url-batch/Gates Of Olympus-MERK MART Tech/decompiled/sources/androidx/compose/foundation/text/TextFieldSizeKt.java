package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldSize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "foundation", "typeface", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier textFieldMinSize$lambda$0;
                textFieldMinSize$lambda$0 = TextFieldSizeKt.textFieldMinSize$lambda$0(TextStyle.this, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return textFieldMinSize$lambda$0;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier textFieldMinSize$lambda$0(TextStyle textStyle, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(1582736677);
        ComposerKt.sourceInformation(composer, "C37@1534L7,38@1595L7,39@1650L7,41@1683L76,43@1788L341,52@2154L101,58@2373L488:TextFieldSize.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localFontFamilyResolver);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FontFamily.Resolver resolver = (FontFamily.Resolver) consume2;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutDirection layoutDirection = (LayoutDirection) consume3;
        ComposerKt.sourceInformationMarkerStart(composer, 591529713, "CC(remember):TextFieldSize.kt#9igjgp");
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection.ordinal());
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 591533338, "CC(remember):TextFieldSize.kt#9igjgp");
        boolean changed2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle m7702getFontStyle4Lr2A7w = textStyle2.m7702getFontStyle4Lr2A7w();
            int m7787unboximpl = m7702getFontStyle4Lr2A7w != null ? m7702getFontStyle4Lr2A7w.m7787unboximpl() : FontStyle.INSTANCE.m7791getNormal_LCdwA();
            FontSynthesis m7703getFontSynthesisZQGJjVo = textStyle2.m7703getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo7756resolveDPcqOEQ(fontFamily, fontWeight, m7787unboximpl, m7703getFontSynthesisZQGJjVo != null ? m7703getFontSynthesisZQGJjVo.m7800unboximpl() : FontSynthesis.INSTANCE.m7801getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        State state = (State) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 591544810, "CC(remember):TextFieldSize.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle, state.getValue());
            composer.updateRememberedValue(rememberedValue3);
        }
        final TextFieldSize textFieldSize = (TextFieldSize) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        textFieldSize.update(layoutDirection, density, resolver, textStyle2, state.getValue());
        Modifier.Companion companion = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 591552205, "CC(remember):TextFieldSize.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(textFieldSize);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function3() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult textFieldMinSize$lambda$0$4$0;
                    textFieldMinSize$lambda$0$4$0 = TextFieldSizeKt.textFieldMinSize$lambda$0$4$0(TextFieldSize.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return textFieldMinSize$lambda$0$4$0;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier layout = LayoutModifierKt.layout(companion, (Function3) rememberedValue4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return layout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult textFieldMinSize$lambda$0$4$0(TextFieldSize textFieldSize, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long minSize = textFieldSize.getMinSize();
        final Placeable mo6844measureBRTryo0 = measurable.mo6844measureBRTryo0(Constraints.m8170copyZbe2FdA$default(constraints.getValue(), RangesKt.coerceIn((int) (minSize >> 32), Constraints.m8182getMinWidthimpl(constraints.getValue()), Constraints.m8180getMaxWidthimpl(constraints.getValue())), 0, RangesKt.coerceIn((int) (minSize & 4294967295L), Constraints.m8181getMinHeightimpl(constraints.getValue()), Constraints.m8179getMaxHeightimpl(constraints.getValue())), 0, 10, null));
        return MeasureScope.layout$default(measureScope, mo6844measureBRTryo0.getWidth(), mo6844measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit textFieldMinSize$lambda$0$4$0$0;
                textFieldMinSize$lambda$0$4$0$0 = TextFieldSizeKt.textFieldMinSize$lambda$0$4$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return textFieldMinSize$lambda$0$4$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textFieldMinSize$lambda$0$4$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
