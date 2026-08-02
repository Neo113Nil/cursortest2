package defpackage;

import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil;
import androidx.camera.camera2.impl.RejectOperationCameraCaptureSession;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry;
import androidx.camera.video.internal.config.FormatComboRegistry;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.selection.DefaultTextSelectionColors_androidKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.backported.fixes.BackportedFixManager;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.transition.Transition;
import com.stripe.android.financialconnections.model.serializer.BodyEntrySerializer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashSetSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class Size$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Size$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j = 0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                return EnumsKt.createAnnotatedEnumSerializer("Size", Size.values(), new String[]{"x-small", "small", "medium"}, new Annotation[][]{null, null, null});
            case 1:
                return EnumsKt.createAnnotatedEnumSerializer("Alignment", Alignment.values(), new String[]{"left", "center", "right"}, new Annotation[][]{null, null, null});
            case 2:
                return new HashSetSerializer(BodyEntrySerializer.INSTANCE, 1);
            case 3:
                return new HashSetSerializer(FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE, 1);
            case 4:
                return Alignment.Companion.serializer();
            case 5:
                return Size.Companion.serializer();
            case 6:
                return Alignment.Companion.serializer();
            case 7:
                return VerticalAlignment.Companion.serializer();
            case 8:
                return EnumsKt.createAnnotatedEnumSerializer("VerticalAlignment", VerticalAlignment.values(), new String[]{"default", "centered"}, new Annotation[][]{null, null});
            case 9:
                return UUID.randomUUID().toString();
            case 10:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalActivityResultRegistryOwner.LocalComposition;
                return null;
            case 11:
                Lazy lazy = GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS$delegate;
                ArrayList arrayList = new ArrayList();
                SurfaceCombination surfaceCombination = new SurfaceCombination();
                StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
                SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1080P_16_9;
                StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
                arrayList.add(surfaceCombination);
                SurfaceCombination surfaceCombination2 = new SurfaceCombination();
                SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.S720P_16_9;
                surfaceCombination2.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2));
                arrayList.add(surfaceCombination2);
                SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM_16_9;
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize, configSize3));
                SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.UHD;
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize, configSize4));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize, SurfaceConfig.ConfigSize.S1440P_16_9));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize, configSize));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize2, configSize3));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize2, configSize4));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize2, configSize));
                SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.X_VGA;
                SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.MAXIMUM_4_3;
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(configSize5, configSize6));
                arrayList.addAll(GuaranteedConfigurationsUtil.createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_4_3, configSize6));
                return arrayList;
            case 12:
                ArrayList arrayList2 = new ArrayList();
                SurfaceCombination surfaceCombination3 = new SurfaceCombination();
                StreamUseCase streamUseCase3 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
                SurfaceConfig.ConfigSize configSize7 = SurfaceConfig.ConfigSize.S1080P_16_9;
                StreamUseCase streamUseCase4 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination3, Transition.AnonymousClass1.create(configType2, configSize7, streamUseCase4), configType2, configSize7, streamUseCase4);
                SurfaceCombination m = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList2, surfaceCombination3);
                m.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize7, streamUseCase4));
                m.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, SurfaceConfig.ConfigSize.S1440P_16_9, streamUseCase4));
                arrayList2.add(m);
                SurfaceCombination surfaceCombination4 = new SurfaceCombination();
                surfaceCombination4.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize7, streamUseCase4));
                surfaceCombination4.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, SurfaceConfig.ConfigSize.UHD, streamUseCase4));
                arrayList2.add(surfaceCombination4);
                SurfaceCombination surfaceCombination5 = new SurfaceCombination();
                surfaceCombination5.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize7, streamUseCase4));
                CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination5, Transition.AnonymousClass1.create(SurfaceConfig.ConfigType.YUV, configSize7, streamUseCase4), configType2, configSize7, streamUseCase4);
                arrayList2.add(surfaceCombination5);
                return arrayList2;
            case 13:
                return new RejectOperationCameraCaptureSession();
            case 14:
                Lazy lazy2 = BackportedFixQuirk.backportedFixManager$delegate;
                return new BackportedFixManager();
            case 15:
                String str = DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i2 = 0;
                Object obj = linkedHashMap.get(0);
                if (obj == null) {
                    obj = new LinkedHashMap();
                    linkedHashMap.put(0, obj);
                }
                new Sniffer(i2, (Map) obj, i).support(ArraysKt___ArraysKt.filterNotNull(new String[]{"video/avc", "video/mp4v-es", "video/3gpp", DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_DOLBY_VISION_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_AV1_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_APV_GATED}), (List) DynamicRangeFormatComboRegistry.standardMp4Audios$delegate.getValue());
                Object obj2 = linkedHashMap.get(1);
                if (obj2 == null) {
                    obj2 = new LinkedHashMap();
                    linkedHashMap.put(1, obj2);
                }
                new Sniffer(i, (Map) obj2, i).support(ArraysKt___ArraysKt.filterNotNull(new String[]{"video/x-vnd.on2.vp8", DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_VP9_GATED}), (List) DynamicRangeFormatComboRegistry.standardWebmAudios$delegate.getValue());
                Pair pair = new Pair(DynamicRange.SDR, new FormatComboRegistry(linkedHashMap));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Object obj3 = linkedHashMap2.get(0);
                if (obj3 == null) {
                    obj3 = new LinkedHashMap();
                    linkedHashMap2.put(0, obj3);
                }
                new Sniffer(i2, (Map) obj3, i).support(ArraysKt___ArraysKt.filterNotNull(new String[]{DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_AV1_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_APV_GATED}), (List) DynamicRangeFormatComboRegistry.standardMp4Audios$delegate.getValue());
                Pair pair2 = new Pair(DynamicRange.HLG_10_BIT, new FormatComboRegistry(linkedHashMap2));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Object obj4 = linkedHashMap3.get(0);
                if (obj4 == null) {
                    obj4 = new LinkedHashMap();
                    linkedHashMap3.put(0, obj4);
                }
                new Sniffer(i2, (Map) obj4, i).support(ArraysKt___ArraysKt.filterNotNull(new String[]{DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_AV1_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_APV_GATED}), (List) DynamicRangeFormatComboRegistry.standardMp4Audios$delegate.getValue());
                Object obj5 = linkedHashMap3.get(1);
                if (obj5 == null) {
                    obj5 = new LinkedHashMap();
                    linkedHashMap3.put(1, obj5);
                }
                new Sniffer(i, (Map) obj5, i).support(CollectionsKt__CollectionsKt.listOfNotNull(DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_VP9_GATED), (List) DynamicRangeFormatComboRegistry.standardWebmAudios$delegate.getValue());
                Pair pair3 = new Pair(DynamicRange.HDR10_10_BIT, new FormatComboRegistry(linkedHashMap3));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Object obj6 = linkedHashMap4.get(0);
                if (obj6 == null) {
                    obj6 = new LinkedHashMap();
                    linkedHashMap4.put(0, obj6);
                }
                new Sniffer(i2, (Map) obj6, i).support(ArraysKt___ArraysKt.filterNotNull(new String[]{DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_HEVC_GATED, DynamicRangeFormatComboRegistry.MIMETYPE_VIDEO_AV1_GATED}), (List) DynamicRangeFormatComboRegistry.standardMp4Audios$delegate.getValue());
                return MapsKt__MapsKt.mutableMapOf(pair, pair2, pair3, new Pair(DynamicRange.HDR10_PLUS_10_BIT, new FormatComboRegistry(linkedHashMap4)), new Pair(DynamicRange.DOLBY_VISION_8_BIT, DynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()), new Pair(DynamicRange.DOLBY_VISION_10_BIT, DynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()));
            case 16:
                return ArraysKt___ArraysKt.filterNotNull(new String[]{"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"});
            case 17:
                return ArraysKt___ArraysKt.filterNotNull(new String[]{"audio/vorbis", DynamicRangeFormatComboRegistry.MIMETYPE_AUDIO_OPUS_GATED});
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                float f = DragGestureDetectorKt.mouseToTouchSlopRatio;
                return Boolean.TRUE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return new SolidColor(ColorKt.Color(1308617531));
            case 24:
                return new IntOffset(j);
            case 25:
                return new IntOffset(j);
            case 26:
                return new SelectionRegistrarImpl(1L);
            case 27:
                return DefaultTextSelectionColors_androidKt.DefaultTextSelectionColors;
            case 28:
                return ColorsKt.m489lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 4095);
            default:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ContentAlphaKt.LocalContentAlpha;
                return Float.valueOf(1.0f);
        }
    }
}
