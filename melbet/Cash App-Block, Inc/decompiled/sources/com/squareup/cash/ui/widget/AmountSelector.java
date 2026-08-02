package com.squareup.cash.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.gridlayout.widget.GridLayout;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes6.dex */
public final class AmountSelector extends GridLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public AmountSelectorWidgetModel model;
    public final SharedFlowImpl selections;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setColumnCount(3);
        setRowCount(2);
        int i = 1;
        this.selections = FlowKt.MutableSharedFlow$default(1, 50, null, 4);
        int count = this.mVerticalAxis.getCount() * this.mHorizontalAxis.getCount();
        if (1 > count) {
            return;
        }
        while (true) {
            AmountOption amountOption = new AmountOption(context, null);
            amountOption.setOnClickListener(new AmountSelector$$ExternalSyntheticLambda0(this, i, 0));
            addView(amountOption);
            if (i == count) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void setAccentColor(int i) {
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof AmountOption) {
                ((AmountOption) view).setAccentColor(i);
            }
        }
    }

    public final void setModel(AmountSelectorWidgetModel amountSelectorWidgetModel) {
        amountSelectorWidgetModel.getClass();
        int count = this.mVerticalAxis.getCount() * this.mHorizontalAxis.getCount();
        List list = amountSelectorWidgetModel.items;
        if (list.size() > count) {
            throw new IllegalStateException(("Too many buttons " + list + " for " + count + " slots.").toString());
        }
        this.model = amountSelectorWidgetModel;
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Object obj : list2) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj;
                    View childAt = getChildAt(i);
                    childAt.getClass();
                    TextView textView = (TextView) childAt;
                    textView.setText(item.getLabel());
                    String accessibilityLabel = item.getAccessibilityLabel();
                    if (accessibilityLabel != null) {
                        textView.setContentDescription(accessibilityLabel);
                    }
                    textView.setEnabled(item.isEnabled());
                    if (item.isSelected()) {
                        setSelected(i);
                    }
                    arrayList.add(Unit.INSTANCE);
                    i = i3;
                }
                return;
            }
            Object next = viewGroupKt$iterator$1.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            ((View) next).setVisibility(i2 < list.size() ? 0 : 8);
            i2 = i4;
        }
    }

    public final void setSelected(int i) {
        if (this.model == null) {
            return;
        }
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                ViewGroupKt.get(this, i).setSelected(true);
                StateFlowKt.emitOrThrow(this.selections, Integer.valueOf(i));
                return;
            }
            ((View) viewGroupKt$iterator$1.next()).setSelected(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountSelector(Context context) {
        this(context, null);
        context.getClass();
    }
}
