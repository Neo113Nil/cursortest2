package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public final class NamedViewFactory implements ViewFactory {
    public static final NamedViewFactory INSTANCE = new NamedViewFactory();
    public final /* synthetic */ DecorativeViewFactory $$delegate_0 = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(Named.class), AnonymousClass1.INSTANCE, 12);

    /* renamed from: com.squareup.workflow1.ui.NamedViewFactory$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE;
        public static final AnonymousClass1 INSTANCE$1;
        public static final AnonymousClass1 INSTANCE$2;
        public final /* synthetic */ int $r8$classId;

        static {
            int i = 1;
            INSTANCE$1 = new AnonymousClass1(i, 1);
            INSTANCE = new AnonymousClass1(i, 0);
            INSTANCE$2 = new AnonymousClass1(i, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    Named named = (Named) obj;
                    named.getClass();
                    return named.wrapped;
                case 1:
                    BackButtonScreen backButtonScreen = (BackButtonScreen) obj;
                    backButtonScreen.getClass();
                    return backButtonScreen.wrapped;
                default:
                    View view = (View) obj;
                    view.getClass();
                    WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(view);
                    Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
                    if (showing == null) {
                        showing = null;
                    }
                    showing.getClass();
                    WorkflowViewState workflowViewStateOrNull2 = WorkflowViewStateKt.getWorkflowViewStateOrNull(view);
                    ViewEnvironment environment = workflowViewStateOrNull2 != null ? workflowViewStateOrNull2.getEnvironment() : null;
                    environment.getClass();
                    ViewShowRenderingKt.showRendering(view, showing, environment);
                    return Unit.INSTANCE;
            }
        }
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup) {
        Named named = (Named) obj;
        named.getClass();
        viewEnvironment.getClass();
        context.getClass();
        return this.$$delegate_0.buildView(named, viewEnvironment, context, viewGroup);
    }

    @Override // com.squareup.workflow1.ui.ViewFactory
    public final KClass getType() {
        return this.$$delegate_0.f1423type;
    }
}
