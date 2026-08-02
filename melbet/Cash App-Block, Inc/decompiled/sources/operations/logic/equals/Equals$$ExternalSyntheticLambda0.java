package operations.logic.equals;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.constraintlayout.widget.ConstraintLayout;
import bo.app.h2$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpPagerItem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.modules.SerializersModuleKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class Equals$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Equals$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(((Integer) obj).intValue() == ((Integer) obj2).intValue());
            case 1:
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
                int intValue = ((Integer) obj2).intValue();
                intrinsicMeasurable.getClass();
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(intValue));
            case 2:
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj;
                int intValue2 = ((Integer) obj2).intValue();
                intrinsicMeasurable2.getClass();
                return Integer.valueOf(intrinsicMeasurable2.minIntrinsicWidth(intValue2));
            case 3:
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj;
                int intValue3 = ((Integer) obj2).intValue();
                intrinsicMeasurable3.getClass();
                return Integer.valueOf(intrinsicMeasurable3.minIntrinsicHeight(intValue3));
            case 4:
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                int intValue4 = ((Integer) obj2).intValue();
                intrinsicMeasurable4.getClass();
                return Integer.valueOf(intrinsicMeasurable4.maxIntrinsicWidth(intValue4));
            case 5:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding = (Pi2GenericUiStepScreenBinding) obj;
                pi2GenericUiStepScreenBinding.getClass();
                ((Map) obj2).getClass();
                ConstraintLayout constraintLayout = pi2GenericUiStepScreenBinding.rootView;
                constraintLayout.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
                return Unit.INSTANCE;
            case 6:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding2 = (Pi2GenericUiStepScreenBinding) obj;
                pi2GenericUiStepScreenBinding2.getClass();
                ((Map) obj2).getClass();
                ConstraintLayout constraintLayout2 = pi2GenericUiStepScreenBinding2.rootView;
                constraintLayout2.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout2, 15);
                return Unit.INSTANCE;
            case 7:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 8:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 9:
                ((File) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 10:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 11:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 12:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 13:
                ((List) obj).getClass();
                ((CameraProperties) obj2).getClass();
                return Unit.INSTANCE;
            case 14:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding3 = (Pi2GenericUiStepScreenBinding) obj;
                pi2GenericUiStepScreenBinding3.getClass();
                ((Map) obj2).getClass();
                ConstraintLayout constraintLayout3 = pi2GenericUiStepScreenBinding3.rootView;
                constraintLayout3.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout3, 15);
                return Unit.INSTANCE;
            case 15:
                SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem = (SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem) obj;
                SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem2 = (SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem) obj2;
                selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.getClass();
                selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.selfie.absoluteFilePath, selfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem2.selfie.absoluteFilePath));
            case 16:
                obj.getClass();
                obj2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
            case 17:
                HelpPagerItem helpPagerItem = (HelpPagerItem) obj;
                HelpPagerItem helpPagerItem2 = (HelpPagerItem) obj2;
                helpPagerItem.getClass();
                helpPagerItem2.getClass();
                if (Intrinsics.areEqual(helpPagerItem.description, helpPagerItem2.description) && Intrinsics.areEqual(helpPagerItem.localAsset, helpPagerItem2.localAsset)) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 18:
                ((Boolean) obj2).booleanValue();
                ((UiComponent) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 20:
                ((Links) obj).getClass();
                ((Links) obj2).getClass();
                return Boolean.TRUE;
            case 21:
                ((Links) obj).getClass();
                ((Links) obj2).getClass();
                return Boolean.TRUE;
            case 22:
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                kClass.getClass();
                list.getClass();
                ArrayList serializersForParameters = SerializersKt.serializersForParameters(SerializersModuleKt.EmptySerializersModule, list, true);
                serializersForParameters.getClass();
                return SerializersKt.parametrizedSerializerOrNull(kClass, serializersForParameters, new h2$$ExternalSyntheticLambda0(list, 11));
            case 23:
                KClass kClass2 = (KClass) obj;
                List list2 = (List) obj2;
                kClass2.getClass();
                list2.getClass();
                ArrayList serializersForParameters2 = SerializersKt.serializersForParameters(SerializersModuleKt.EmptySerializersModule, list2, true);
                serializersForParameters2.getClass();
                KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kClass2, serializersForParameters2, new h2$$ExternalSyntheticLambda0(list2, 12));
                if (parametrizedSerializerOrNull != null) {
                    return BuiltinSerializersKt.getNullable(parametrizedSerializerOrNull);
                }
                return null;
            case 24:
                return Boolean.valueOf(((Integer) obj).intValue() == ((Integer) obj2).intValue());
            case 25:
                return Boolean.valueOf(((Integer) obj).intValue() == ((Integer) obj2).intValue());
            case 26:
                return Boolean.valueOf(((Integer) obj).intValue() == ((Integer) obj2).intValue());
            case 27:
                return Boolean.valueOf(((Integer) obj).intValue() > ((Integer) obj2).intValue());
            case 28:
                return Boolean.valueOf(((Integer) obj).intValue() >= ((Integer) obj2).intValue());
            default:
                return Boolean.valueOf(((Integer) obj).intValue() < ((Integer) obj2).intValue());
        }
    }
}
