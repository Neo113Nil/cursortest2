package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.Nullable;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MaterialThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if ((r50 & 4) != 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(Colors colors, Typography typography, Shapes shapes, final Function2 content, Composer composer, final int i, final int i2) {
        final Colors colors2;
        int i3;
        final Typography typography2;
        Shapes shapes2;
        Typography typography3;
        final Shapes shapes3;
        final Typography typography4;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-891417079);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                colors2 = colors;
                if (startRestartGroup.changed(colors2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                colors2 = colors;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            colors2 = colors;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                typography2 = typography;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            typography2 = typography;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                shapes2 = shapes;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            shapes2 = shapes;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
            } else {
                if ((i2 & 1) != 0) {
                    colors2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -897;
                }
                final int i7 = i3;
                Shapes shapes4 = shapes2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = r14.m788copypvPzIIM((r43 & 1) != 0 ? r14.m796getPrimary0d7_KjU() : 0L, (r43 & 2) != 0 ? r14.m797getPrimaryVariant0d7_KjU() : 0L, (r43 & 4) != 0 ? r14.m798getSecondary0d7_KjU() : 0L, (r43 & 8) != 0 ? r14.m799getSecondaryVariant0d7_KjU() : 0L, (r43 & 16) != 0 ? r14.m789getBackground0d7_KjU() : 0L, (r43 & 32) != 0 ? r14.m800getSurface0d7_KjU() : 0L, (r43 & 64) != 0 ? r14.m790getError0d7_KjU() : 0L, (r43 & 128) != 0 ? r14.m793getOnPrimary0d7_KjU() : 0L, (r43 & 256) != 0 ? r14.m794getOnSecondary0d7_KjU() : 0L, (r43 & 512) != 0 ? r14.m791getOnBackground0d7_KjU() : 0L, (r43 & 1024) != 0 ? r14.m795getOnSurface0d7_KjU() : 0L, (r43 & 2048) != 0 ? r14.m792getOnError0d7_KjU() : 0L, (r43 & 4096) != 0 ? colors2.isLight() : false);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Colors colors3 = (Colors) rememberedValue;
                ColorsKt.updateColorsFrom(colors3, colors2);
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors3), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6))), IndicationKt.getLocalIndication().provides(RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, startRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes4), TextSelectionColorsKt.getLocalTextSelectionColors().provides(MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors3, startRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1740102967, true, new Function2() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i8) {
                        if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                            TextStyle body1 = Typography.this.getBody1();
                            final Function2 function2 = content;
                            final int i9 = i7;
                            TextKt.ProvideTextStyle(body1, ComposableLambdaKt.composableLambda(composer2, 181426554, true, new Function2() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i10) {
                                    if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        MaterialTheme_androidKt.PlatformMaterialTheme(Function2.this, composer3, (i9 >> 9) & 14);
                                    }
                                }
                            }), composer2, 48);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 56);
                typography3 = typography2;
                shapes3 = shapes4;
                typography4 = typography3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            typography4 = typography2;
            shapes3 = shapes2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                MaterialThemeKt.MaterialTheme(Colors.this, typography4, shapes3, content, composer2, i | 1, i2);
            }
        });
    }
}
