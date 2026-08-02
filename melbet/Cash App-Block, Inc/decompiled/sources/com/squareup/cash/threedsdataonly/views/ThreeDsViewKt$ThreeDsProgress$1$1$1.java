package com.squareup.cash.threedsdataonly.views;

import androidx.camera.video.Recorder;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class ThreeDsViewKt$ThreeDsProgress$1$1$1 implements Function1 {
    public static final ThreeDsViewKt$ThreeDsProgress$1$1$1 INSTANCE = new ThreeDsViewKt$ThreeDsProgress$1$1$1(0);
    public static final ThreeDsViewKt$ThreeDsProgress$1$1$1 INSTANCE$1 = new ThreeDsViewKt$ThreeDsProgress$1$1$1(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ThreeDsViewKt$ThreeDsProgress$1$1$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ConstrainScope constrainScope = (ConstrainScope) obj;
                constrainScope.getClass();
                constrainScope.centerTo(constrainScope.parent);
                break;
            default:
                ConstrainScope constrainScope2 = (ConstrainScope) obj;
                constrainScope2.getClass();
                Recorder.AnonymousClass4 anonymousClass4 = constrainScope2.bottom;
                ConstrainedLayoutReference constrainedLayoutReference = constrainScope2.parent;
                Recorder.AnonymousClass4.m112linkToVpY3zN4$default(anonymousClass4, constrainedLayoutReference.bottom, RecyclerView.DECELERATION_RATE, 6);
                ConstrainScope.centerHorizontallyTo$default(constrainScope2, constrainedLayoutReference);
                break;
        }
        return Unit.INSTANCE;
    }
}
