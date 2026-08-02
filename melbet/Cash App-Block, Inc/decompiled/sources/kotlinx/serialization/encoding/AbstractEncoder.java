package kotlinx.serialization.encoding;

import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.unit.Density;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.compose.components.MarkdownComponentModel;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter;
import com.mikepenz.markdown.model.DefaultMarkdownAnimation;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownExtendedSpans;
import com.mikepenz.markdown.model.DefaultMarkdownInlineContent;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.mikepenz.markdown.model.ImageWidth;
import com.mikepenz.markdown.model.NoOpImageTransformerImpl;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.coroutines.AwaitKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.json.JsonElementBuildersKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;

/* loaded from: classes9.dex */
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
    public static final void MarkdownInlineImageWithSize(String str, ASTNodeImpl aSTNodeImpl, NoOpImageTransformerImpl noOpImageTransformerImpl, Density density, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1323501824);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(noOpImageTransformerImpl) : gapComposer.changedInstance(noOpImageTransformerImpl) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 8339) != 8338)) {
            str.getClass();
            gapComposer.startReplaceGroup(1643297092);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(643371412);
            gapComposer.end(false);
            if (Size.m639equalsimpl0(9205357640488583168L, 9205357640488583168L)) {
                gapComposer.startReplaceGroup(643537666);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(643480006);
                boolean changed = gapComposer.changed(9205357640488583168L) | ((i2 & 57344) == 16384);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda6(2, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
                gapComposer.end(false);
            }
            ((DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents)).inlineImage.invoke(new MarkdownComponentModel(str, aSTNodeImpl, (DefaultMarkdownTypography) gapComposer.consume(ComposeLocalKt.LocalMarkdownTypography)), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(str, aSTNodeImpl, noOpImageTransformerImpl, density, function1, i, 6);
        }
    }

    public static final void MarkdownText(AnnotatedString annotatedString, final ASTNodeImpl aSTNodeImpl, Modifier modifier, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        String str;
        long j;
        boolean z;
        Map map;
        long j2;
        char c;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        int floatToRawIntBits3;
        annotatedString.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1464041784);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(annotatedString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            long j3 = ((DefaultMarkdownColors) gapComposer2.consume(ComposeLocalKt.LocalMarkdownColors)).text;
            DefaultMarkdownAnimation defaultMarkdownAnimation = (DefaultMarkdownAnimation) gapComposer2.consume(ComposeLocalKt.LocalMarkdownAnimations);
            NoOpImageTransformerImpl noOpImageTransformerImpl = (NoOpImageTransformerImpl) gapComposer2.consume(ComposeLocalKt.LocalImageTransformer);
            DefaultMarkdownInlineContent defaultMarkdownInlineContent = (DefaultMarkdownInlineContent) gapComposer2.consume(ComposeLocalKt.LocalMarkdownInlineContent);
            ImageWidth imageWidth = (ImageWidth) gapComposer2.consume(ComposeLocalKt.LocalImageWidth);
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            int i3 = i2;
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(new Size(9205357640488583168L));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SnapshotStateMap();
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new DateInputKt$$ExternalSyntheticLambda5(26, mutableState2);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier modifier2 = (Modifier) defaultMarkdownAnimation.animateTextSize.invoke(RulerKt.onPlaced(modifier, (Function1) rememberedValue4));
            gapComposer2.startReplaceGroup(1805157461);
            snapshotStateMap.getClass();
            PersistentOrderedMap persistentOrderedMap = PersistentOrderedMap.EMPTY;
            persistentOrderedMap.getClass();
            PersistentMap persistentMap = persistentOrderedMap;
            if (!snapshotStateMap.isEmpty()) {
                PersistentOrderedMapBuilder persistentOrderedMapBuilder = new PersistentOrderedMapBuilder(persistentOrderedMap);
                persistentOrderedMapBuilder.putAll(snapshotStateMap);
                persistentMap = persistentOrderedMapBuilder.build();
            }
            Map map2 = defaultMarkdownInlineContent.inlineContent;
            long j4 = ((Size) mutableState2.getValue()).packedValue;
            boolean changed = ((i3 & 112) == 32) | gapComposer2.changed(map2);
            int i4 = i3 & 14;
            boolean changed2 = gapComposer2.changed(j4) | changed | (i4 == 4) | gapComposer2.changed(noOpImageTransformerImpl) | gapComposer2.changed(imageWidth.ordinal()) | gapComposer2.changed(persistentMap);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy) {
                Map map3 = defaultMarkdownInlineContent.inlineContent;
                PersistentMap persistentMap2 = persistentMap;
                long j5 = ((Size) mutableState2.getValue()).packedValue;
                CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda2 = new CartBannerViewKt$$ExternalSyntheticLambda2(snapshotStateMap, 15);
                List stringAnnotations = annotatedString.getStringAnnotations(annotatedString.text.length());
                ArrayList arrayList = new ArrayList();
                Iterator it = stringAnnotations.iterator();
                while (true) {
                    str = "MARKDOWN_IMAGE_URL_";
                    if (!it.hasNext()) {
                        break;
                    }
                    CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda22 = cartBannerViewKt$$ExternalSyntheticLambda2;
                    Object next = it.next();
                    Iterator it2 = it;
                    long j6 = j5;
                    if (StringsKt__StringsJVMKt.startsWith((String) ((AnnotatedString.Range) next).item, "MARKDOWN_IMAGE_URL_", false)) {
                        arrayList.add(next);
                    }
                    cartBannerViewKt$$ExternalSyntheticLambda2 = cartBannerViewKt$$ExternalSyntheticLambda22;
                    it = it2;
                    j5 = j6;
                }
                final CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda23 = cartBannerViewKt$$ExternalSyntheticLambda2;
                long j7 = j5;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (hashSet.add((String) ((AnnotatedString.Range) next2).item)) {
                        arrayList2.add(next2);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    AnnotatedString.Range range = (AnnotatedString.Range) it4.next();
                    final String removePrefix = StringsKt.removePrefix(str, (String) range.item);
                    Size size = (Size) ((PersistentOrderedMap) persistentMap2).get(removePrefix);
                    PersistentMap persistentMap3 = persistentMap2;
                    long j8 = size != null ? size.packedValue : 9205357640488583168L;
                    noOpImageTransformerImpl.getClass();
                    density.getClass();
                    String str2 = str;
                    if (j7 == 9205357640488583168L) {
                        c = ' ';
                        floatToRawIntBits = (Float.floatToRawIntBits(200.0f) << 32) | (Float.floatToRawIntBits(200.0f) & BodyPartID.bodyIdMax);
                        map = map3;
                    } else {
                        if (j8 == 9205357640488583168L) {
                            map = map3;
                            float min = Math.min(200.0f, Math.min(density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax))), density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j7 >> 32)))));
                            floatToRawIntBits2 = Float.floatToRawIntBits(min);
                            floatToRawIntBits3 = Float.floatToRawIntBits(min);
                        } else {
                            map = map3;
                            float mo232toDpu2uoSUM = density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j8 >> 32)));
                            float mo232toDpu2uoSUM2 = density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j8 & BodyPartID.bodyIdMax)));
                            float mo232toDpu2uoSUM3 = density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j7 >> 32)));
                            float min2 = Math.min(mo232toDpu2uoSUM2, density.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax))));
                            int ordinal = imageWidth.ordinal();
                            if (ordinal == 0) {
                                mo232toDpu2uoSUM3 = Math.min(mo232toDpu2uoSUM, mo232toDpu2uoSUM3);
                            } else if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            if (mo232toDpu2uoSUM3 < mo232toDpu2uoSUM || min2 < mo232toDpu2uoSUM2) {
                                int ordinal2 = imageWidth.ordinal();
                                if (ordinal2 == 0) {
                                    float min3 = Math.min(mo232toDpu2uoSUM3 / mo232toDpu2uoSUM, min2 / mo232toDpu2uoSUM2);
                                    j2 = j3;
                                    long floatToRawIntBits4 = (Float.floatToRawIntBits(mo232toDpu2uoSUM2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(mo232toDpu2uoSUM) << 32);
                                    c = ' ';
                                    floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)) * min3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits4 & BodyPartID.bodyIdMax)) * min3) & BodyPartID.bodyIdMax);
                                    final Density density2 = density;
                                    final NoOpImageTransformerImpl noOpImageTransformerImpl2 = noOpImageTransformerImpl;
                                    linkedHashMap.put(range.item, new InlineTextContent(new Placeholder(3, density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits >> c))), density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)))), new ComposableLambdaImpl(new Function3() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTextKt$buildImageInlineContent$3$3
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            String str3 = (String) obj;
                                            Composer composer2 = (Composer) obj2;
                                            int intValue = ((Number) obj3).intValue();
                                            str3.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((GapComposer) composer2).changed(str3) ? 4 : 2;
                                            }
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                                CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda24 = cartBannerViewKt$$ExternalSyntheticLambda23;
                                                boolean changed3 = gapComposer3.changed(cartBannerViewKt$$ExternalSyntheticLambda24);
                                                String str4 = removePrefix;
                                                boolean changed4 = changed3 | gapComposer3.changed(str4);
                                                Object rememberedValue6 = gapComposer3.rememberedValue();
                                                if (changed4 || rememberedValue6 == Composer.Companion.Empty) {
                                                    rememberedValue6 = new CombinedModifier$$ExternalSyntheticLambda0(9, cartBannerViewKt$$ExternalSyntheticLambda24, str4);
                                                    gapComposer3.updateRememberedValue(rememberedValue6);
                                                }
                                                AbstractEncoder.MarkdownInlineImageWithSize(str3, ASTNodeImpl.this, noOpImageTransformerImpl2, density2, (Function1) rememberedValue6, gapComposer3, intValue & 14);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 936180579)));
                                    noOpImageTransformerImpl = noOpImageTransformerImpl2;
                                    str = str2;
                                    map3 = map;
                                    density = density2;
                                    j3 = j2;
                                    persistentMap2 = persistentMap3;
                                } else if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                } else {
                                    floatToRawIntBits = (Float.floatToRawIntBits(mo232toDpu2uoSUM3) << 32) | (Float.floatToRawIntBits((mo232toDpu2uoSUM3 / mo232toDpu2uoSUM) * mo232toDpu2uoSUM2) & BodyPartID.bodyIdMax);
                                }
                            } else {
                                int ordinal3 = imageWidth.ordinal();
                                if (ordinal3 == 0) {
                                    floatToRawIntBits = (Float.floatToRawIntBits(min2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(mo232toDpu2uoSUM3) << 32);
                                } else if (ordinal3 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                } else {
                                    float f = (mo232toDpu2uoSUM3 / mo232toDpu2uoSUM) * mo232toDpu2uoSUM2;
                                    floatToRawIntBits2 = Float.floatToRawIntBits(mo232toDpu2uoSUM3);
                                    floatToRawIntBits3 = Float.floatToRawIntBits(f);
                                }
                            }
                            j2 = j3;
                            c = ' ';
                            final Density density22 = density;
                            final NoOpImageTransformerImpl noOpImageTransformerImpl22 = noOpImageTransformerImpl;
                            linkedHashMap.put(range.item, new InlineTextContent(new Placeholder(3, density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits >> c))), density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)))), new ComposableLambdaImpl(new Function3() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTextKt$buildImageInlineContent$3$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    String str3 = (String) obj;
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Number) obj3).intValue();
                                    str3.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((GapComposer) composer2).changed(str3) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                        CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda24 = cartBannerViewKt$$ExternalSyntheticLambda23;
                                        boolean changed3 = gapComposer3.changed(cartBannerViewKt$$ExternalSyntheticLambda24);
                                        String str4 = removePrefix;
                                        boolean changed4 = changed3 | gapComposer3.changed(str4);
                                        Object rememberedValue6 = gapComposer3.rememberedValue();
                                        if (changed4 || rememberedValue6 == Composer.Companion.Empty) {
                                            rememberedValue6 = new CombinedModifier$$ExternalSyntheticLambda0(9, cartBannerViewKt$$ExternalSyntheticLambda24, str4);
                                            gapComposer3.updateRememberedValue(rememberedValue6);
                                        }
                                        AbstractEncoder.MarkdownInlineImageWithSize(str3, ASTNodeImpl.this, noOpImageTransformerImpl22, density22, (Function1) rememberedValue6, gapComposer3, intValue & 14);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, true, 936180579)));
                            noOpImageTransformerImpl = noOpImageTransformerImpl22;
                            str = str2;
                            map3 = map;
                            density = density22;
                            j3 = j2;
                            persistentMap2 = persistentMap3;
                        }
                        c = ' ';
                        floatToRawIntBits = (floatToRawIntBits2 << 32) | (floatToRawIntBits3 & BodyPartID.bodyIdMax);
                    }
                    j2 = j3;
                    final Density density222 = density;
                    final NoOpImageTransformerImpl noOpImageTransformerImpl222 = noOpImageTransformerImpl;
                    linkedHashMap.put(range.item, new InlineTextContent(new Placeholder(3, density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits >> c))), density.mo238toSp0xMU5do(Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)))), new ComposableLambdaImpl(new Function3() { // from class: com.mikepenz.markdown.compose.elements.MarkdownTextKt$buildImageInlineContent$3$3
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            String str3 = (String) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Number) obj3).intValue();
                            str3.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(str3) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda24 = cartBannerViewKt$$ExternalSyntheticLambda23;
                                boolean changed3 = gapComposer3.changed(cartBannerViewKt$$ExternalSyntheticLambda24);
                                String str4 = removePrefix;
                                boolean changed4 = changed3 | gapComposer3.changed(str4);
                                Object rememberedValue6 = gapComposer3.rememberedValue();
                                if (changed4 || rememberedValue6 == Composer.Companion.Empty) {
                                    rememberedValue6 = new CombinedModifier$$ExternalSyntheticLambda0(9, cartBannerViewKt$$ExternalSyntheticLambda24, str4);
                                    gapComposer3.updateRememberedValue(rememberedValue6);
                                }
                                AbstractEncoder.MarkdownInlineImageWithSize(str3, ASTNodeImpl.this, noOpImageTransformerImpl222, density222, (Function1) rememberedValue6, gapComposer3, intValue & 14);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 936180579)));
                    noOpImageTransformerImpl = noOpImageTransformerImpl222;
                    str = str2;
                    map3 = map;
                    density = density222;
                    j3 = j2;
                    persistentMap2 = persistentMap3;
                }
                j = j3;
                z = true;
                rememberedValue5 = MapsKt__MapsKt.plus(map3, linkedHashMap);
                gapComposer2.updateRememberedValue(rememberedValue5);
            } else {
                j = j3;
                z = true;
            }
            Map map4 = (Map) rememberedValue5;
            gapComposer2.end(false);
            boolean changed3 = gapComposer2.changed(j) | ((i3 & 57344) == 16384 ? z : false);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new CaptureCheckFaceKt$$ExternalSyntheticLambda7(mutableState, function2, j, 1);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            gapComposer = gapComposer2;
            JsonElementBuildersKt.m4212MarkdownBasicTexteIOHA4g(annotatedString, textStyle, modifier2, 0L, 0L, 0L, 0L, 0, false, 0, 0, map4, (Function1) rememberedValue6, gapComposer, i4 | ((i3 >> 6) & 112), 0, 65528);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(annotatedString, aSTNodeImpl, modifier, textStyle, function2, i, 5);
        }
    }

    public static final void OrderTypeSelection(final InvestingOrderTypeSelectionViewModel investingOrderTypeSelectionViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(953144631);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(investingOrderTypeSelectionViewModel) : gapComposer.changedInstance(investingOrderTypeSelectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (investingOrderTypeSelectionViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.investing.components.ordertype.selection.OrderTypeSelectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    AbstractEncoder.OrderTypeSelection(investingOrderTypeSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AbstractEncoder.OrderTypeSelection(investingOrderTypeSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1468890188, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(6, (Object) investingOrderTypeSelectionViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: com.squareup.cash.investing.components.ordertype.selection.OrderTypeSelectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            AbstractEncoder.OrderTypeSelection(investingOrderTypeSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            AbstractEncoder.OrderTypeSelection(investingOrderTypeSelectionViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z) {
        encodeValue(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeBooleanElement(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        encodeElement(serialDescriptor, i);
        encodeBoolean(z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        encodeValue(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeByteElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, byte b) {
        primitiveArrayDescriptor.getClass();
        encodeElement(primitiveArrayDescriptor, i);
        encodeByte(b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c) {
        encodeValue(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeCharElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, char c) {
        primitiveArrayDescriptor.getClass();
        encodeElement(primitiveArrayDescriptor, i);
        encodeChar(c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d) {
        encodeValue(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeDoubleElement(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        encodeElement(serialDescriptor, i);
        encodeDouble(d);
    }

    public void encodeElement(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        encodeValue(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f) {
        encodeValue(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeFloatElement(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        encodeElement(serialDescriptor, i);
        encodeFloat(f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public Encoder encodeInlineElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i) {
        primitiveArrayDescriptor.getClass();
        encodeElement(primitiveArrayDescriptor, i);
        return encodeInline(primitiveArrayDescriptor.getElementDescriptor(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i) {
        encodeValue(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeIntElement(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        encodeElement(serialDescriptor, i);
        encodeInt(i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j) {
        encodeValue(Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeLongElement(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        encodeElement(serialDescriptor, i);
        encodeLong(j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        encodeElement(serialDescriptor, i);
        encodeNullableSerializableValue(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        encodeElement(serialDescriptor, i);
        encodeSerializableValue(kSerializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s) {
        encodeValue(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeShortElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, short s) {
        primitiveArrayDescriptor.getClass();
        encodeElement(primitiveArrayDescriptor, i);
        encodeShort(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeString(String str) {
        str.getClass();
        encodeValue(str);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeStringElement(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        encodeElement(serialDescriptor, i);
        encodeString(str);
    }

    public void encodeValue(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        sb.append(reflectionFactory.getOrCreateKotlinClass(cls));
        sb.append(" is not supported by ");
        sb.append(reflectionFactory.getOrCreateKotlinClass(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    public static final void MarkdownText(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Modifier modifier, MarkdownElementType markdownElementType, JWECryptoParts jWECryptoParts, Composer composer, int i) {
        int i2;
        JWECryptoParts jWECryptoParts2;
        int i3;
        JWECryptoParts annotatorSettings;
        ASTNodeImpl aSTNodeImpl2;
        str.getClass();
        aSTNodeImpl.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(150337670);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(textStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(markdownElementType) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                i3 = i2 & (-458753);
                annotatorSettings = jWECryptoParts;
            } else {
                i3 = i2 & (-458753);
                annotatorSettings = AwaitKt.annotatorSettings(gapComposer);
            }
            gapComposer.endDefaults();
            if (markdownElementType == null || (aSTNodeImpl2 = ASTUtilKt.findChildOfType(aSTNodeImpl, markdownElementType)) == null) {
                aSTNodeImpl2 = aSTNodeImpl;
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.pushStyle(textStyle.spanStyle);
            AnnotatedStringKtxKt.buildMarkdownAnnotatedString(builder, str, aSTNodeImpl2, annotatorSettings);
            builder.pop();
            MarkdownText(builder.toAnnotatedString(), aSTNodeImpl, modifier, textStyle, (ExtendedSpans) null, gapComposer, (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
            jWECryptoParts2 = annotatorSettings;
        } else {
            gapComposer.skipToGroupEnd();
            jWECryptoParts2 = jWECryptoParts;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(str, aSTNodeImpl, textStyle, modifier, markdownElementType, jWECryptoParts2, i);
        }
    }

    public static final void MarkdownText(AnnotatedString annotatedString, ASTNodeImpl aSTNodeImpl, Modifier modifier, TextStyle textStyle, ExtendedSpans extendedSpans, Composer composer, int i) {
        ExtendedSpans extendedSpans2;
        ExtendedSpans extendedSpans3;
        int i2;
        boolean z;
        AnnotatedString annotatedString2;
        Function2 function2;
        Modifier modifier2;
        String str;
        ArrayList arrayList;
        int i3;
        int i4;
        String str2;
        TextLinkStyles textLinkStyles;
        LinkAnnotation clickable;
        SpanStyle spanStyle;
        SpanStyle spanStyle2;
        SpanStyle spanStyle3;
        SpanStyle spanStyle4;
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1940250318);
        int i5 = (i & 6) == 0 ? (gapComposer.changed(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                i2 = i5 & (-57345);
                extendedSpans3 = extendedSpans;
            } else {
                Function2 function22 = ((DefaultMarkdownExtendedSpans) gapComposer.consume(ComposeLocalKt.LocalMarkdownExtendedSpans)).extendedSpans;
                if (function22 == null) {
                    gapComposer.startReplaceGroup(-327106713);
                    gapComposer.end(false);
                    extendedSpans3 = null;
                } else {
                    gapComposer.startReplaceGroup(-564741158);
                    extendedSpans3 = (ExtendedSpans) function22.invoke(gapComposer, 0);
                    gapComposer.end(false);
                }
                i2 = i5 & (-57345);
            }
            gapComposer.endDefaults();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (extendedSpans3 != null) {
                gapComposer.startReplaceGroup(-326959431);
                boolean z2 = (i2 & 14) == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy) {
                    List list = extendedSpans3.painters;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    String str3 = annotatedString.text;
                    builder.append(str3);
                    builder.addStringAnnotation("extended_spans_marker", 0, 0, String.valueOf(extendedSpans3.hashCode()));
                    List spanStyles = annotatedString.getSpanStyles();
                    int size = spanStyles.size();
                    int i6 = 0;
                    while (true) {
                        str = "rounded_corner_span";
                        if (i6 >= size) {
                            break;
                        }
                        AnnotatedString.Range range = (AnnotatedString.Range) spanStyles.get(i6);
                        Object obj = range.item;
                        int i7 = range.end;
                        int i8 = range.start;
                        int size2 = list.size();
                        int i9 = i6;
                        int i10 = 0;
                        while (i10 < size2) {
                            int i11 = size2;
                            SpanStyle spanStyle5 = (SpanStyle) obj;
                            ((RoundedCornerSpanPainter) list.get(i10)).getClass();
                            spanStyle5.getClass();
                            String str4 = str3;
                            List list2 = spanStyles;
                            long j = spanStyle5.background;
                            if (j != 16) {
                                builder.addStringAnnotation("rounded_corner_span", i8, i7, j == 16 ? "null" : String.valueOf(ColorKt.m694toArgb8_81llA(j)));
                                spanStyle5 = SpanStyle.m973copyGSF8kmg$default(spanStyle5, 0L, null, Color.Unspecified, 63487);
                            }
                            obj = spanStyle5;
                            i10++;
                            size2 = i11;
                            str3 = str4;
                            spanStyles = list2;
                        }
                        builder.addStyle((SpanStyle) obj, i8, i7);
                        i6 = i9 + 1;
                    }
                    String str5 = str3;
                    List list3 = annotatedString.paragraphStylesOrNull;
                    if (list3 == null) {
                        list3 = EmptyList.INSTANCE;
                    }
                    int size3 = list3.size();
                    int i12 = 0;
                    while (true) {
                        arrayList = builder.annotations;
                        if (i12 >= size3) {
                            break;
                        }
                        AnnotatedString.Range range2 = (AnnotatedString.Range) list3.get(i12);
                        arrayList.add(new AnnotatedString.Builder.MutableRange((ParagraphStyle) range2.item, range2.start, range2.end, 8));
                        i12++;
                        list3 = list3;
                        size3 = size3;
                    }
                    List stringAnnotations = annotatedString.getStringAnnotations(str5.length());
                    int size4 = stringAnnotations.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        AnnotatedString.Range range3 = (AnnotatedString.Range) stringAnnotations.get(i13);
                        builder.addStringAnnotation(range3.tag, range3.start, range3.end, (String) range3.item);
                        i13++;
                        stringAnnotations = stringAnnotations;
                    }
                    List ttsAnnotations = annotatedString.getTtsAnnotations(str5.length());
                    int i14 = 0;
                    for (int size5 = ttsAnnotations.size(); i14 < size5; size5 = size5) {
                        AnnotatedString.Range range4 = (AnnotatedString.Range) ttsAnnotations.get(i14);
                        arrayList.add(new AnnotatedString.Builder.MutableRange((VerbatimTtsAnnotation) range4.item, range4.start, range4.end, 8));
                        i14++;
                        ttsAnnotations = ttsAnnotations;
                    }
                    List urlAnnotations = annotatedString.getUrlAnnotations(str5.length());
                    int i15 = 0;
                    for (int size6 = urlAnnotations.size(); i15 < size6; size6 = size6) {
                        AnnotatedString.Range range5 = (AnnotatedString.Range) urlAnnotations.get(i15);
                        arrayList.add(new AnnotatedString.Builder.MutableRange((UrlAnnotation) range5.item, range5.start, range5.end, 8));
                        i15++;
                        urlAnnotations = urlAnnotations;
                    }
                    List linkAnnotations = annotatedString.getLinkAnnotations(0, str5.length());
                    int size7 = linkAnnotations.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        AnnotatedString.Range range6 = (AnnotatedString.Range) linkAnnotations.get(i16);
                        Object obj2 = range6.item;
                        int i17 = range6.start;
                        int i18 = range6.end;
                        int size8 = list.size();
                        List list4 = linkAnnotations;
                        int i19 = 0;
                        Object obj3 = obj2;
                        while (i19 < size8) {
                            LinkAnnotation linkAnnotation = (LinkAnnotation) obj3;
                            ((RoundedCornerSpanPainter) list.get(i19)).getClass();
                            linkAnnotation.getClass();
                            int i20 = size8;
                            TextLinkStyles styles = linkAnnotation.getStyles();
                            SpanStyle spanStyle6 = styles != null ? styles.style : null;
                            List list5 = list;
                            if (spanStyle6 != null) {
                                long j2 = spanStyle6.background;
                                if (j2 != 16) {
                                    builder.addStringAnnotation(str, i17, i18, j2 == 16 ? "null" : String.valueOf(ColorKt.m694toArgb8_81llA(j2)));
                                    TextLinkStyles styles2 = linkAnnotation.getStyles();
                                    if (styles2 != null) {
                                        i3 = i19;
                                        SpanStyle spanStyle7 = styles2.style;
                                        SpanStyle spanStyle8 = styles2.focusedStyle;
                                        SpanStyle m973copyGSF8kmg$default = spanStyle7 != null ? SpanStyle.m973copyGSF8kmg$default(spanStyle7, 0L, null, Color.Unspecified, 63487) : null;
                                        if (spanStyle8 != null) {
                                            spanStyle = spanStyle8;
                                            spanStyle2 = SpanStyle.m973copyGSF8kmg$default(spanStyle, 0L, null, Color.Unspecified, 63487);
                                        } else {
                                            spanStyle = spanStyle8;
                                            spanStyle2 = null;
                                        }
                                        if (spanStyle != null) {
                                            i4 = size7;
                                            spanStyle3 = SpanStyle.m973copyGSF8kmg$default(spanStyle, 0L, null, Color.Unspecified, 63487);
                                        } else {
                                            i4 = size7;
                                            spanStyle3 = null;
                                        }
                                        if (spanStyle != null) {
                                            SpanStyle m973copyGSF8kmg$default2 = SpanStyle.m973copyGSF8kmg$default(spanStyle, 0L, null, Color.Unspecified, 63487);
                                            str2 = str;
                                            spanStyle4 = m973copyGSF8kmg$default2;
                                        } else {
                                            str2 = str;
                                            spanStyle4 = null;
                                        }
                                        textLinkStyles = new TextLinkStyles(m973copyGSF8kmg$default, spanStyle2, spanStyle3, spanStyle4);
                                    } else {
                                        i3 = i19;
                                        i4 = size7;
                                        str2 = str;
                                        textLinkStyles = null;
                                    }
                                    if (linkAnnotation instanceof LinkAnnotation.Url) {
                                        LinkAnnotation.Url url = (LinkAnnotation.Url) linkAnnotation;
                                        clickable = new LinkAnnotation.Url(url.url, textLinkStyles, url.linkInteractionListener);
                                    } else if (linkAnnotation instanceof LinkAnnotation.Clickable) {
                                        LinkAnnotation.Clickable clickable2 = (LinkAnnotation.Clickable) linkAnnotation;
                                        clickable = new LinkAnnotation.Clickable(clickable2.tag, textLinkStyles, clickable2.linkInteractionListener);
                                    } else {
                                        OptionalProvider$$ExternalSyntheticLambda0.m$1(linkAnnotation, "Unsupported LinkAnnotation type: ");
                                        return;
                                    }
                                    linkAnnotation = clickable;
                                    i19 = i3 + 1;
                                    size8 = i20;
                                    list = list5;
                                    str = str2;
                                    size7 = i4;
                                    obj3 = linkAnnotation;
                                }
                            }
                            i3 = i19;
                            i4 = size7;
                            str2 = str;
                            i19 = i3 + 1;
                            size8 = i20;
                            list = list5;
                            str = str2;
                            size7 = i4;
                            obj3 = linkAnnotation;
                        }
                        List list6 = list;
                        int i21 = size7;
                        String str6 = str;
                        LinkAnnotation linkAnnotation2 = (LinkAnnotation) obj3;
                        if (linkAnnotation2 instanceof LinkAnnotation.Url) {
                            builder.addLink((LinkAnnotation.Url) linkAnnotation2, i17, i18);
                        } else if (linkAnnotation2 instanceof LinkAnnotation.Clickable) {
                            arrayList.add(new AnnotatedString.Builder.MutableRange((LinkAnnotation.Clickable) linkAnnotation2, i17, i18, 8));
                            i16++;
                            linkAnnotations = list4;
                            list = list6;
                            str = str6;
                            size7 = i21;
                        }
                        i16++;
                        linkAnnotations = list4;
                        list = list6;
                        str = str6;
                        size7 = i21;
                    }
                    rememberedValue = builder.toAnnotatedString();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                z = false;
                gapComposer.end(false);
                annotatedString2 = (AnnotatedString) rememberedValue;
            } else {
                z = false;
                gapComposer.startReplaceGroup(-326869159);
                gapComposer.end(false);
                annotatedString2 = annotatedString;
            }
            if (extendedSpans3 == null) {
                gapComposer.startReplaceGroup(-326699683);
                gapComposer.end(z);
                function2 = null;
            } else {
                gapComposer.startReplaceGroup(-326699682);
                boolean changed = gapComposer.changed(extendedSpans3);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new DateInputKt$DateInputTextField$3(extendedSpans3, 3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                function2 = (Function2) rememberedValue2;
                gapComposer.end(false);
            }
            if (extendedSpans3 != null) {
                modifier.getClass();
                modifier2 = ClipKt.drawBehind(modifier, new xg$$ExternalSyntheticLambda9(extendedSpans3, 20));
            } else {
                modifier2 = modifier;
            }
            MarkdownText(annotatedString2, aSTNodeImpl, modifier2, textStyle, function2, gapComposer, i2 & 7280);
            extendedSpans2 = extendedSpans3;
        } else {
            gapComposer.skipToGroupEnd();
            extendedSpans2 = extendedSpans;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(annotatedString, aSTNodeImpl, modifier, textStyle, extendedSpans2, i, 4);
        }
    }

    public static final void MarkdownText(String str, ASTNodeImpl aSTNodeImpl, Modifier modifier, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1766930086);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(textStyle) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            } else if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            gapComposer.endDefaults();
            MarkdownText(new AnnotatedString(str), aSTNodeImpl, modifier3, textStyle, (ExtendedSpans) null, gapComposer, i3 & 8176);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(str, aSTNodeImpl, modifier2, textStyle, i, i2, 3);
        }
    }
}
