package com.squareup.contour;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ContourLayout$emptyX$1 extends Lambda implements Function1 {
    public static final ContourLayout$emptyX$1 INSTANCE;
    public static final ContourLayout$emptyX$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new ContourLayout$emptyX$1(i, 0);
        INSTANCE$1 = new ContourLayout$emptyX$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContourLayout$emptyX$1(int i) {
        super(1);
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 1:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(0);
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(0);
            case 4:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            default:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContourLayout$emptyX$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContourLayout$emptyX$1(ContourLayout contourLayout, int i) {
        super(1);
        this.$r8$classId = i;
    }
}
