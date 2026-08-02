package kotlin.reflect.jvm.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TextFieldLabelPosition$Attached;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;

/* loaded from: classes9.dex */
public final class ConvertFromMetadataKt$$Lambda$2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;
    public final Object arg$2;
    public final Object arg$3;

    public /* synthetic */ ConvertFromMetadataKt$$Lambda$2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
        this.arg$1 = obj2;
        this.arg$2 = obj3;
        this.arg$3 = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.arg$3;
        Object obj4 = this.arg$2;
        Object obj5 = this.arg$1;
        Object obj6 = this.arg$0;
        switch (i) {
            case 0:
                ClassLoader classLoader = (ClassLoader) obj6;
                TypeParameterTable typeParameterTable = (TypeParameterTable) obj5;
                Function0 function0 = (Function0) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                int intValue = ((Number) obj).intValue();
                KmTypeProjection kmTypeProjection = (KmTypeProjection) obj2;
                kmTypeProjection.getClass();
                DescriptorKCallable$$Lambda$6 descriptorKCallable$$Lambda$6 = function0 == null ? null : new DescriptorKCallable$$Lambda$6(new ConvertFromJavaKt$$Lambda$4(ref$ObjectRef, 15), intValue, 3);
                if (kmTypeProjection.equals(KmTypeProjection.STAR)) {
                    KTypeProjection.INSTANCE.getClass();
                    return KTypeProjection.star;
                }
                KmVariance variance = kmTypeProjection.getVariance();
                KVariance kVariance = variance != null ? ConvertFromMetadataKt.toKVariance(variance) : null;
                KmType type2 = kmTypeProjection.getType();
                return new KTypeProjection(type2 != null ? ConvertFromMetadataKt.toKType(type2, classLoader, typeParameterTable, descriptorKCallable$$Lambda$6) : null, kVariance);
            default:
                Composer composer = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier drawWithContent = ClipKt.drawWithContent(RulerKt.layoutId(Modifier.Companion.$$INSTANCE, "Container"), new MenuKt$$ExternalSyntheticLambda0(19, new CameraWrapper.i(0, 1, MutableState.class, (MutableState) obj6, "value", "getValue()Ljava/lang/Object;"), (PaddingValues) obj4, Icons$Filled.getMinimizedAlignment((TextFieldLabelPosition$Attached) obj5)));
                    ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, drawWithContent);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
