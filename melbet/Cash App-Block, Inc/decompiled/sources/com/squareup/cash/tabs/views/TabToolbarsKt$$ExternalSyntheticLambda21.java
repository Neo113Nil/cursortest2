package com.squareup.cash.tabs.views;

import android.content.Context;
import android.icu.text.MessageFormat;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import coil3.size.Dimension;
import coil3.size.RealSizeResolver;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.size.SizeResolver;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda21 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda21(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final int i2 = 1;
        final int i3 = this.f$0;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(1614462901);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext));
                builder.data = painterRequest.url;
                builder.sizeResolver = new RealSizeResolver(SizeKt.Size(i3, i3));
                builder.scale = Scale.FILL;
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, builder.build(), gapComposer, intValue & 14, 0);
                gapComposer.end(false);
                break;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer2.startReplaceGroup(1917301312);
                    for (int i4 = 0; i4 < i3; i4++) {
                        BitcoinPerformanceDetailsViewKt.BitcoinPerformanceLoadingShimmerRow(null, gapComposer2, 0);
                    }
                    gapComposer2.end(false);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer2, null);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, i3), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                } else if (i3 == 0) {
                    gapComposer4.startReplaceGroup(1480995843);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(1481066275);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                    gapComposer4.end(false);
                }
                break;
            case 4:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                int i5 = mo833measureBRTryo0.width;
                int i6 = mo833measureBRTryo0.height - i3;
                break;
            case 5:
                MeasureScope measureScope2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                measureScope2.getClass();
                measurable2.getClass();
                Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(((Constraints) obj3).value);
                int i7 = mo833measureBRTryo02.width;
                int i8 = mo833measureBRTryo02.height - i3;
                break;
            case 6:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue5 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                gapComposer5.startReplaceGroup(-979651892);
                ImageRequest.Builder builder2 = new ImageRequest.Builder((Context) gapComposer5.consume(AndroidCompositionLocals_androidKt.LocalContext));
                boolean changed = gapComposer5.changed(i3);
                Object rememberedValue = gapComposer5.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    final int i9 = r6 ? 1 : 0;
                    rememberedValue = new SizeResolver() { // from class: com.squareup.cash.genericelements.components.base.GenericArcadeBadgedAvatarKt$GenericArcadeBadgedAvatar$1$1$1
                        @Override // coil3.size.SizeResolver
                        public final Object size(Continuation continuation) {
                            switch (i9) {
                                case 0:
                                    int i10 = i3;
                                    return new Size(new Dimension.Pixels(i10), new Dimension.Pixels(i10));
                                case 1:
                                    int i11 = i3;
                                    return new Size(new Dimension.Pixels(i11), new Dimension.Pixels(i11));
                                default:
                                    int i12 = i3;
                                    return new Size(new Dimension.Pixels(i12), new Dimension.Pixels(i12));
                            }
                        }
                    };
                    gapComposer5.updateRememberedValue(rememberedValue);
                }
                builder2.sizeResolver = (SizeResolver) rememberedValue;
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, builder2.build(), gapComposer5, intValue5 & 14, 0);
                gapComposer5.end(false);
                break;
            case 7:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue6 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj2);
                gapComposer6.startReplaceGroup(-526199764);
                ImageRequest.Builder builder3 = new ImageRequest.Builder((Context) gapComposer6.consume(AndroidCompositionLocals_androidKt.LocalContext));
                boolean changed2 = gapComposer6.changed(i3);
                Object rememberedValue2 = gapComposer6.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SizeResolver() { // from class: com.squareup.cash.genericelements.components.base.GenericArcadeBadgedAvatarKt$GenericArcadeBadgedAvatar$1$1$1
                        @Override // coil3.size.SizeResolver
                        public final Object size(Continuation continuation) {
                            switch (i2) {
                                case 0:
                                    int i10 = i3;
                                    return new Size(new Dimension.Pixels(i10), new Dimension.Pixels(i10));
                                case 1:
                                    int i11 = i3;
                                    return new Size(new Dimension.Pixels(i11), new Dimension.Pixels(i11));
                                default:
                                    int i12 = i3;
                                    return new Size(new Dimension.Pixels(i12), new Dimension.Pixels(i12));
                            }
                        }
                    };
                    gapComposer6.updateRememberedValue(rememberedValue2);
                }
                builder3.sizeResolver = (SizeResolver) rememberedValue2;
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, builder3.build(), gapComposer6, intValue6 & 14, 0);
                gapComposer6.end(false);
                break;
            case 8:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue7 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj2);
                gapComposer7.startReplaceGroup(-1140954258);
                ImageRequest.Builder builder4 = new ImageRequest.Builder((Context) gapComposer7.consume(AndroidCompositionLocals_androidKt.LocalContext));
                boolean changed3 = gapComposer7.changed(i3);
                Object rememberedValue3 = gapComposer7.rememberedValue();
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    final int i10 = 2;
                    rememberedValue3 = new SizeResolver() { // from class: com.squareup.cash.genericelements.components.base.GenericArcadeBadgedAvatarKt$GenericArcadeBadgedAvatar$1$1$1
                        @Override // coil3.size.SizeResolver
                        public final Object size(Continuation continuation) {
                            switch (i10) {
                                case 0:
                                    int i102 = i3;
                                    return new Size(new Dimension.Pixels(i102), new Dimension.Pixels(i102));
                                case 1:
                                    int i11 = i3;
                                    return new Size(new Dimension.Pixels(i11), new Dimension.Pixels(i11));
                                default:
                                    int i12 = i3;
                                    return new Size(new Dimension.Pixels(i12), new Dimension.Pixels(i12));
                            }
                        }
                    };
                    gapComposer7.updateRememberedValue(rememberedValue3);
                }
                builder4.sizeResolver = (SizeResolver) rememberedValue3;
                AsyncImagePainter rememberAsyncImagePainter4 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, builder4.build(), gapComposer7, intValue7 & 14, 0);
                gapComposer7.end(false);
                break;
            case 9:
                Composer composer4 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer4;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String format2 = new MessageFormat(Room.stringResource(gapComposer8, R.string.investing_components_search_results)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i3), InquiryField.FloatField.TYPE2));
                    format2.getClass();
                    ViewfinderDefaults.SectionHeader(format2, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer8, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 10:
                MeasureScope measureScope3 = (MeasureScope) obj;
                Measurable measurable3 = (Measurable) obj2;
                measureScope3.getClass();
                measurable3.getClass();
                Placeable mo833measureBRTryo03 = measurable3.mo833measureBRTryo0(((Constraints) obj3).value);
                break;
            case 11:
                MeasureScope measureScope4 = (MeasureScope) obj;
                Measurable measurable4 = (Measurable) obj2;
                measureScope4.getClass();
                measurable4.getClass();
                Placeable mo833measureBRTryo04 = measurable4.mo833measureBRTryo0(((Constraints) obj3).value);
                break;
            case 12:
                Composer composer5 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer5;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Icons icons = Icons.InformationOutline16;
                    Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    long j = colors.semantic.text.subtle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    Trace.m1191Iconww6aTOc(icons, (String) null, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, ((Density) gapComposer9.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(Room.getSp(i3)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), ((Density) gapComposer9.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(Room.getSp(16))), j, gapComposer9, 54, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer6 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer6;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer10, i3), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer10, 0, 30);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer7 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, i3), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            default:
                Composer composer8 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer8;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer12, i3), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, gapComposer12, 0, 0, 131070);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
