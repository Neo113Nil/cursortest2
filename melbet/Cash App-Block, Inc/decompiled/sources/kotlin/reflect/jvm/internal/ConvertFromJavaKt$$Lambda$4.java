package kotlin.reflect.jvm.internal;

import android.os.Bundle;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.local.presenters.pos.LocalPosBrandOnboardingPresenter;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.cdf.document.DocumentUploadOpenCamera;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.screens.Back;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.DescriptorKMutableProperty0;
import kotlin.reflect.jvm.internal.DescriptorKMutableProperty1;
import kotlin.reflect.jvm.internal.DescriptorKMutableProperty2;
import kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN;
import kotlin.reflect.jvm.internal.DescriptorKPropertyN;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KotlinKMutableProperty0;
import kotlin.reflect.jvm.internal.KotlinKMutableProperty1;
import kotlin.reflect.jvm.internal.KotlinKMutablePropertyN;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.SimpleKType;

/* loaded from: classes9.dex */
public final class ConvertFromJavaKt$$Lambda$4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;

    public /* synthetic */ ConvertFromJavaKt$$Lambda$4(Object obj, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.arg$0;
        switch (i) {
            case 0:
                return (Class) obj;
            case 1:
                NavAction$$ExternalSyntheticOutline0.m((Object) null, ((LocalPosBrandOnboardingPresenter) obj).navigator);
                return Unit.INSTANCE;
            case 2:
                ((Navigator) ((RealBitcoinAmountPickerPresenter) obj).navigator).goTo(new BitcoinHome(null, null, null, null, 15));
                return Unit.INSTANCE;
            case 3:
                FilesetUploadPresenter filesetUploadPresenter = (FilesetUploadPresenter) obj;
                Analytics analytics = filesetUploadPresenter.analytics;
                BlockersData blockersData = filesetUploadPresenter.args.blockersData;
                String valueOf = String.valueOf(blockersData.clientScenario);
                String str = blockersData.flowToken;
                DocumentUploadOpenCamera.PermissionStatus permissionStatus = DocumentUploadOpenCamera.PermissionStatus.DENIED;
                str.getClass();
                analytics.track(new DocumentUploadOpenCamera(valueOf, str, permissionStatus), null);
                filesetUploadPresenter.navigator.goTo(new ProfileScreens.ErrorScreen(filesetUploadPresenter.stringManager.get(R.string.blockers_fileset_upload_camera_permission_denied), null, 14));
                return Unit.INSTANCE;
            case 4:
                CameraPositionState cameraPositionState = new CameraPositionState(new CameraPosition(new LatLng(0.0d, 0.0d), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                ((TooltipBoxKt$$ExternalSyntheticLambda2) obj).invoke(cameraPositionState);
                return cameraPositionState;
            case 5:
                return (Boolean) ((MutableTransitionState) obj).currentState$delegate.getValue();
            case 6:
                ((AmountDisplayKeypadListener) obj).onLongBackspace();
                return Unit.INSTANCE;
            case 7:
                ((BetterNavigator.ScreenNavigator) ((LocalEditorialPresenter) obj).navigator).goTo(Back.INSTANCE);
                return Unit.INSTANCE;
            case 8:
                DocumentStepFragment documentStepFragment = (DocumentStepFragment) obj;
                Bundle arguments = documentStepFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", documentStepFragment, " has null arguments");
                return null;
            case 9:
                GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) obj;
                Bundle arguments2 = governmentIdStepFragment.getArguments();
                if (arguments2 != null) {
                    return arguments2;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", governmentIdStepFragment, " has null arguments");
                return null;
            case 10:
                IntegrationStepFragment integrationStepFragment = (IntegrationStepFragment) obj;
                Bundle arguments3 = integrationStepFragment.getArguments();
                if (arguments3 != null) {
                    return arguments3;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", integrationStepFragment, " has null arguments");
                return null;
            case 11:
                InquiryWorkflowFragment inquiryWorkflowFragment = (InquiryWorkflowFragment) obj;
                Bundle arguments4 = inquiryWorkflowFragment.getArguments();
                if (arguments4 != null) {
                    return arguments4;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", inquiryWorkflowFragment, " has null arguments");
                return null;
            case 12:
                PermissionRequestFragment permissionRequestFragment = (PermissionRequestFragment) obj;
                Bundle arguments5 = permissionRequestFragment.getArguments();
                if (arguments5 != null) {
                    return arguments5;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", permissionRequestFragment, " has null arguments");
                return null;
            case 13:
                SelfieStepFragment selfieStepFragment = (SelfieStepFragment) obj;
                Bundle arguments6 = selfieStepFragment.getArguments();
                if (arguments6 != null) {
                    return arguments6;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", selfieStepFragment, " has null arguments");
                return null;
            case 14:
                UiStepFragment uiStepFragment = (UiStepFragment) obj;
                Bundle arguments7 = uiStepFragment.getArguments();
                if (arguments7 != null) {
                    return arguments7;
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Fragment ", uiStepFragment, " has null arguments");
                return null;
            case 15:
                Object obj2 = ((Ref$ObjectRef) obj).element;
                if (obj2 != null) {
                    return (SimpleKType) obj2;
                }
                Intrinsics.throwUninitializedPropertyAccessException("result");
                throw null;
            case 16:
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((AbstractKType) obj).computeJavaType;
                Type type2 = reflectProperties$LazySoftVal != null ? (Type) reflectProperties$LazySoftVal.invoke() : null;
                type2.getClass();
                return ReflectClassUtilKt.getParameterizedTypeArguments(type2);
            case 17:
                return new DescriptorKMutableProperty0.Setter((DescriptorKMutableProperty0) obj);
            case 18:
                return new DescriptorKMutableProperty1.Setter((DescriptorKMutableProperty1) obj);
            case 19:
                return new DescriptorKMutableProperty2.Setter((DescriptorKMutableProperty2) obj);
            case 20:
                return new DescriptorKMutablePropertyN.Setter((DescriptorKMutablePropertyN) obj);
            case 21:
                return ((DescriptorKProperty) obj).getCaller().getReturnType();
            case 22:
                return new DescriptorKPropertyN.Getter((DescriptorKPropertyN) obj);
            case 23:
                KPackageImpl.Data data = (KPackageImpl.Data) obj;
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data.kotlinClass$delegate;
                KProperty kProperty = KPackageImpl.Data.$$delegatedProperties[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) reflectProperties$LazySoftVal2.invoke();
                if (reflectKotlinClass == null) {
                    return MemberScope.Empty.INSTANCE;
                }
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data.moduleData$delegate;
                KProperty kProperty2 = KDeclarationContainerImpl.Data.$$delegatedProperties[0];
                Object invoke = reflectProperties$LazySoftVal3.invoke();
                invoke.getClass();
                return ((RuntimeModuleData) invoke).getPackagePartScopeCache().getPackagePartScope(reflectKotlinClass);
            case 24:
                return KClasses.createDefaultType((KClassImpl) ((KDeclarationContainerImpl) obj));
            case 25:
                return new KotlinKMutableProperty0.Setter((KotlinKMutableProperty0) obj);
            case 26:
                return new KotlinKMutableProperty1.Setter((KotlinKMutableProperty1) obj);
            case 27:
                return new KotlinKMutablePropertyN.Setter((KotlinKMutablePropertyN) obj);
            default:
                KotlinKNamedFunction kotlinKNamedFunction = (KotlinKNamedFunction) obj;
                Type extractContinuationArgument = GoogleMapKt.extractContinuationArgument(kotlinKNamedFunction);
                return extractContinuationArgument == null ? kotlinKNamedFunction.getCaller().getReturnType() : extractContinuationArgument;
        }
    }
}
