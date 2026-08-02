package com.squareup.cash.support.chat.views;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 1:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 2:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 3:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 4:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 5:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 6:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan));
            case 7:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 9:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((BodyViewModel$ActionBodyViewModel.Action) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                ((FormattedPaymentHistoryActivityItem) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w());
            case 18:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return new YInt(layoutSpec2.getParent().m4372bottomh0YXg9w());
            case 19:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 20:
                ContourLayout.LayoutSpec layoutSpec3 = (ContourLayout.LayoutSpec) obj;
                layoutSpec3.getClass();
                return new YInt(layoutSpec3.getParent().m4372bottomh0YXg9w());
            case 21:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 22:
                ContourLayout.LayoutSpec layoutSpec4 = (ContourLayout.LayoutSpec) obj;
                layoutSpec4.getClass();
                return new YInt(layoutSpec4.getParent().m4372bottomh0YXg9w());
            case 23:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 24:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 25:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver2, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver3, 1.0f);
                return Unit.INSTANCE;
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
