package com.withpersona.sdk2.inquiry.ui;

import android.view.View;
import com.withpersona.sdk2.inquiry.steps.ui.ComponentView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda13 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ComponentView f$1;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda13(Function1 function1, ComponentView componentView, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = componentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        ComponentView componentView = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(componentView.component);
                break;
            case 1:
                function1.invoke(componentView.component);
                break;
            case 2:
                function1.invoke(componentView.component);
                break;
            default:
                function1.invoke(componentView.component);
                break;
        }
    }
}
