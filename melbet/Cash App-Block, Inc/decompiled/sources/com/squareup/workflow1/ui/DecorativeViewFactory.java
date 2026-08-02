package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import androidx.glance.ImageKt$Image$3;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.viewbinding.ViewBinding;
import com.squareup.workflow1.InterceptedRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public final class DecorativeViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Function doShowRendering;
    public final Function map;

    /* renamed from: type, reason: collision with root package name */
    public final KClass f1423type;

    /* renamed from: com.squareup.workflow1.ui.DecorativeViewFactory$2, reason: invalid class name */
    public final class AnonymousClass2 extends Lambda implements Function4 {
        public final /* synthetic */ Object $map;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            super(4);
            this.$r8$classId = i;
            this.$map = obj;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = this.$r8$classId;
            Object obj5 = this.$map;
            switch (i) {
                case 0:
                    Function2 function2 = (Function2) obj2;
                    ViewEnvironment viewEnvironment = (ViewEnvironment) obj4;
                    ((View) obj).getClass();
                    function2.getClass();
                    obj3.getClass();
                    viewEnvironment.getClass();
                    function2.invoke(((Function1) obj5).invoke(obj3), viewEnvironment);
                    return Unit.INSTANCE;
                case 1:
                    int intValue = ((Number) obj).intValue();
                    int intValue2 = ((Number) obj2).intValue();
                    ((ViewStructure) obj5).setDimens(intValue, intValue2, 0, 0, ((Number) obj3).intValue() - intValue, ((Number) obj4).intValue() - intValue2);
                    return Unit.INSTANCE;
                default:
                    StatefulWorkflow statefulWorkflow = (StatefulWorkflow) obj;
                    String str = (String) obj3;
                    Function1 function1 = (Function1) obj4;
                    statefulWorkflow.getClass();
                    str.getClass();
                    function1.getClass();
                    return ((InterceptedRenderContext) obj5).baseRenderContext.renderChild(statefulWorkflow, obj2, str, function1);
            }
        }
    }

    public DecorativeViewFactory(KClass kClass, Function1 function1, int i) {
        int i2 = 0;
        int i3 = 8;
        Function anonymousClass2 = (i & 8) != 0 ? new AnonymousClass2(function1, i2) : BackButtonScreen$viewFactory$2.INSTANCE;
        kClass.getClass();
        SpacerKt$Spacer$3 spacerKt$Spacer$3 = new SpacerKt$Spacer$3(function1, i3);
        this.f1423type = kClass;
        this.map = spacerKt$Spacer$3;
        this.doShowRendering = anonymousClass2;
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        int i = this.$r8$classId;
        Function function = this.map;
        obj.getClass();
        viewEnvironment.getClass();
        context.getClass();
        switch (i) {
            case 0:
                Pair pair = (Pair) ((SpacerKt$Spacer$3) function).invoke(obj, viewEnvironment);
                Object obj2 = pair.first;
                ViewEnvironment viewEnvironment2 = (ViewEnvironment) pair.second;
                View buildView = ViewRegistryKt.buildView((ViewRegistry) viewEnvironment2.get(ViewRegistry.Companion), obj2, viewEnvironment2, context, viewGroup, null);
                WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(buildView);
                Function2 showRendering = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowRendering();
                showRendering.getClass();
                ViewShowRenderingKt.bindShowRendering(buildView, obj, viewEnvironment2, new ImageKt$Image$3(4, this, buildView, showRendering));
                return buildView;
            default:
                Function3 function3 = (Function3) function;
                if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                    context2 = context;
                }
                LayoutInflater cloneInContext = LayoutInflater.from(context2).cloneInContext(context);
                cloneInContext.getClass();
                ViewBinding viewBinding = (ViewBinding) function3.invoke(cloneInContext, viewGroup, Boolean.FALSE);
                LayoutRunner layoutRunner = (LayoutRunner) ((Function1) this.doShowRendering).invoke(viewBinding);
                View root = viewBinding.getRoot();
                root.getClass();
                ViewShowRenderingKt.bindShowRendering(root, obj, viewEnvironment, new SpacerKt$Spacer$3(layoutRunner, 9));
                View root2 = viewBinding.getRoot();
                root2.getClass();
                return root2;
        }
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final KClass getType() {
        switch (this.$r8$classId) {
        }
        return this.f1423type;
    }

    public DecorativeViewFactory(KClass kClass, Function3 function3, Function1 function1) {
        kClass.getClass();
        function3.getClass();
        function1.getClass();
        this.f1423type = kClass;
        this.map = function3;
        this.doShowRendering = function1;
    }
}
