package com.withpersona.sdk2.inquiry.integration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import coil3.size.ViewSizeResolver$size$3$1;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class IntegrationView implements AndroidViewRendering, Parcelable {
    public static final Parcelable.Creator<IntegrationView> CREATOR = new RawExtraction.Creator(27);
    public final List componentNameToAction;
    public final boolean isLoading;
    public final NavigationState navigationState;
    public final Function0 onBack;
    public final Function0 onCancel;
    public final UiComponentScreen uiScreen;
    public final DecorativeViewFactory viewFactory;

    public IntegrationView(UiComponentScreen uiComponentScreen, NavigationState navigationState, Function0 function0, Function0 function02, List list, boolean z) {
        uiComponentScreen.getClass();
        navigationState.getClass();
        function0.getClass();
        function02.getClass();
        list.getClass();
        this.uiScreen = uiComponentScreen;
        this.navigationState = navigationState;
        this.onBack = function0;
        this.onCancel = function02;
        this.componentNameToAction = list;
        this.isLoading = z;
        Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(14);
        StateFlowKt$combineState$2 stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(3, this, IntegrationView.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V", 0, 8);
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(IntegrationView.class), IntegrationView$special$$inlined$getViewFactoryForScreen$default$1.INSTANCE, new ViewSizeResolver$size$3$1(12, uiComponentScreen, equals$$ExternalSyntheticLambda0, stateFlowKt$combineState$2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.uiScreen, i);
        parcel.writeParcelable(this.navigationState, i);
        parcel.writeSerializable((Serializable) this.onBack);
        parcel.writeSerializable((Serializable) this.onCancel);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.componentNameToAction, parcel);
        while (m.hasNext()) {
            parcel.writeSerializable((Serializable) m.next());
        }
        parcel.writeInt(this.isLoading ? 1 : 0);
    }
}
