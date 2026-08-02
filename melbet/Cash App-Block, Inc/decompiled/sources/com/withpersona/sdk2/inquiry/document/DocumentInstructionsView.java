package com.withpersona.sdk2.inquiry.document;

import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.size.ViewSizeResolver$size$3$1;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda13;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class DocumentInstructionsView implements AndroidViewRendering, DocumentWorkflow.Screen {
    public final UiStepBottomSheet bottomSheet;
    public final List componentNamesToActions;
    public final NavigationState navigationState;
    public final Function0 onBack;
    public final Function0 onCancel;
    public final UiComponentScreen uiScreen;
    public final DecorativeViewFactory viewFactory;

    public DocumentInstructionsView(UiComponentScreen uiComponentScreen, List list, NavigationState navigationState, Function0 function0, Function0 function02, UiStepBottomSheet uiStepBottomSheet) {
        list.getClass();
        navigationState.getClass();
        this.uiScreen = uiComponentScreen;
        this.componentNamesToActions = list;
        this.navigationState = navigationState;
        this.onBack = function0;
        this.onCancel = function02;
        this.bottomSheet = uiStepBottomSheet;
        Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(5);
        StateFlowKt$combineState$2 stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(3, this, DocumentInstructionsView.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0, 6);
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(DocumentInstructionsView.class), DocumentInstructionsView$special$$inlined$getViewFactoryForScreen$default$1.INSTANCE, new ViewSizeResolver$size$3$1(11, uiComponentScreen, equals$$ExternalSyntheticLambda0, stateFlowKt$combineState$2));
    }

    @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.Screen
    public final UiStepBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }

    public final void showRendering$document_release(Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding, final DocumentInstructionsView documentInstructionsView, Map map) {
        pi2GenericUiStepScreenBinding.getClass();
        documentInstructionsView.getClass();
        map.getClass();
        Iterator it = this.componentNamesToActions.iterator();
        while (true) {
            final int i = 1;
            if (!it.hasNext()) {
                NavigationState navigationState = documentInstructionsView.navigationState;
                final int i2 = 0;
                Function0 function0 = new Function0(documentInstructionsView) { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda2
                    public final /* synthetic */ DocumentInstructionsView f$0;

                    {
                        this.f$0 = documentInstructionsView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        DocumentInstructionsView documentInstructionsView2 = this.f$0;
                        switch (i3) {
                            case 0:
                                documentInstructionsView2.onBack.invoke();
                                break;
                            default:
                                documentInstructionsView2.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                Function0 function02 = new Function0(documentInstructionsView) { // from class: com.withpersona.sdk2.inquiry.document.DocumentInstructionsView$$ExternalSyntheticLambda2
                    public final /* synthetic */ DocumentInstructionsView f$0;

                    {
                        this.f$0 = documentInstructionsView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        DocumentInstructionsView documentInstructionsView2 = this.f$0;
                        switch (i3) {
                            case 0:
                                documentInstructionsView2.onBack.invoke();
                                break;
                            default:
                                documentInstructionsView2.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                Pi2NavigationBar pi2NavigationBar = pi2GenericUiStepScreenBinding.navigationBar;
                ConstraintLayout constraintLayout = pi2GenericUiStepScreenBinding.rootView;
                constraintLayout.getClass();
                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout);
                return;
            }
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            Function1 function1 = (Function1) pair.second;
            ComponentView componentView = (ComponentView) map.get(str);
            if (componentView != null) {
                componentView.view.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda13(function1, componentView, 1));
            }
        }
    }
}
