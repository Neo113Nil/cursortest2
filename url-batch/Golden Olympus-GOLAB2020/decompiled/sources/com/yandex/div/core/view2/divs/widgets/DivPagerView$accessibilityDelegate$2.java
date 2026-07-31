package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerView$accessibilityDelegate$2 extends s implements Function0<AnonymousClass1> {
    final /* synthetic */ DivPagerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerView$accessibilityDelegate$2(DivPagerView divPagerView) {
        super(0);
        this.this$0 = divPagerView;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2$1] */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final AnonymousClass1 invoke() {
        RecyclerView recyclerView = this.this$0.getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        recyclerView.setDescendantFocusability(262144);
        return new r(this.this$0) { // from class: com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2.1
            final /* synthetic */ DivPagerView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RecyclerView.this);
                this.this$0 = r2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
            
                r0 = r4.this$0.getFocusedChildPos(r6);
             */
            @Override // androidx.core.view.C1280a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onRequestSendAccessibilityEvent(@NotNull ViewGroup host, @NotNull View child, @NotNull AccessibilityEvent event) {
                Integer focusedChildPos;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(child, "child");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getEventType() == 32768 && focusedChildPos != null) {
                    DivPagerView divPagerView = this.this$0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    int intValue = focusedChildPos.intValue();
                    if (divPagerView.getCurrentItem$div_release() != intValue) {
                        recyclerView2.performAccessibilityAction(intValue > divPagerView.getCurrentItem$div_release() ? Base64Utils.IO_BUFFER_SIZE : 8192, null);
                    }
                }
                return super.onRequestSendAccessibilityEvent(host, child, event);
            }
        };
    }
}
