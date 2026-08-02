package com.squareup.contour.constraints;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.focus.FocusTargetNode;
import com.bugsnag.android.TraceParser$parse$1;
import com.squareup.contour.ContourLayout;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes4.dex */
public final class SizeConfigSmartLambdas$wrapContent$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $axis;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeConfigSmartLambdas$wrapContent$1(Object obj, int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$view = obj;
        this.$axis = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int paddingTop;
        int paddingBottom;
        int i;
        int i2 = this.$r8$classId;
        int i3 = this.$axis;
        Object obj2 = this.$view;
        switch (i2) {
            case 0:
                ((Number) obj).intValue();
                ContourLayout contourLayout = (ContourLayout) obj2;
                Integer num = (Integer) SequencesKt___SequencesKt.maxOrNull(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(new LinesSequence(contourLayout, 3), SizeConfigSmartLambdas$wrapContent$1$1$1.INSTANCE), new TraceParser$parse$1(12, contourLayout, this)));
                if (num != null) {
                    i = num.intValue();
                } else {
                    int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i3);
                    if (ordinal == 0) {
                        paddingTop = contourLayout.getPaddingTop();
                        paddingBottom = contourLayout.getPaddingBottom();
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        paddingTop = contourLayout.getPaddingLeft();
                        paddingBottom = contourLayout.getPaddingRight();
                    }
                    i = paddingTop + paddingBottom;
                }
                return Integer.valueOf(i);
            default:
                Boolean valueOf = Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(i3));
                ((Ref$ObjectRef) obj2).element = valueOf;
                return valueOf;
        }
    }
}
