package com.squareup.contour;

import androidx.compose.ui.focus.FocusTargetNode;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ContourLayout$matchParentX$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $marginLeft;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContourLayout$matchParentX$1(int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$marginLeft = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$marginLeft;
        switch (i) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left + i2);
            case 1:
                return Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(i2));
            case 2:
                return Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(i2));
            case 3:
                return Boolean.valueOf(((FocusTargetNode) obj).m607assignFocus3ESFkO8(i2));
            case 4:
                return Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(i2));
            case 5:
                return Boolean.valueOf(((FocusTargetNode) obj).m608requestFocus3ESFkO8(i2));
            default:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - i2);
        }
    }
}
