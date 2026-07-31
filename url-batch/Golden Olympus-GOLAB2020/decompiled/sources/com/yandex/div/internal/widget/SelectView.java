package com.yandex.div.internal.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.K;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import e.AbstractC2405a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SelectView extends EllipsizedTextView {

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private Function1<? super Integer, Unit> onItemSelectedListener;

    @SuppressLint({"RestrictedApi"})
    @NotNull
    private final PopupWindow popupWindow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectView._init_$lambda$1(SelectView.this, view);
            }
        });
        final PopupWindow popupWindow = new PopupWindow(context, null, 0, 6, null);
        popupWindow.setModal(true);
        popupWindow.setAnchorView(this);
        popupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                SelectView.popupWindow$lambda$3$lambda$2(SelectView.this, popupWindow, adapterView, view, i4, j4);
            }
        });
        popupWindow.setOverlapAnchor(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setAdapter(popupWindow.getAdapter());
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SelectView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InputFocusTracker inputFocusTracker = this$0.focusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(this$0, inputFocusTracker);
        }
        this$0.popupWindow.resetPosition();
        this$0.popupWindow.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupWindow$lambda$3$lambda$2(SelectView this$0, PopupWindow this_apply, AdapterView adapterView, View view, int i4, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.sendAccessibilityEvent(4);
        Function1<? super Integer, Unit> function1 = this$0.onItemSelectedListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i4));
        }
        this_apply.dismiss();
    }

    @Nullable
    public final InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.popupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setCanOpenPopup(true);
        info.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4 && this.popupWindow.isShowing()) {
            this.popupWindow.show();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i4);
        if (i4 == 0 || !this.popupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public final void setFocusTracker(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public final void setItems(@NotNull List<String> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.popupWindow.getAdapter().setItems(items);
    }

    public final void setOnItemSelectedListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.onItemSelectedListener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static class PopupWindow extends K {

        @NotNull
        private final PopupAdapter adapter;

        @NotNull
        private final Context context;

        @Metadata
        public final class PopupAdapter extends BaseAdapter {

            @NotNull
            private List<String> items = CollectionsKt.emptyList();

            public PopupAdapter() {
            }

            private final TextView createView() {
                TextView textView = new TextView(PopupWindow.this.context, null, R.attr.spinnerDropDownItemStyle);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, BaseDivViewExtensionsKt.dpToPx(48, displayMetrics)));
                textView.setTextAlignment(5);
                return textView;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.items.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return i4;
            }

            public final void setItems(@NotNull List<String> newItems) {
                Intrinsics.checkNotNullParameter(newItems, "newItems");
                this.items = newItems;
                notifyDataSetChanged();
            }

            @Override // android.widget.Adapter
            @NotNull
            public String getItem(int i4) {
                return this.items.get(i4);
            }

            @Override // android.widget.Adapter
            @NotNull
            public TextView getView(int i4, @Nullable View view, @Nullable ViewGroup viewGroup) {
                if (view == null) {
                    view = createView();
                }
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                textView.setText(getItem(i4));
                return textView;
            }
        }

        public /* synthetic */ PopupWindow(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? AbstractC2405a.f36175B : i4);
        }

        @NotNull
        public PopupAdapter getAdapter() {
            return this.adapter;
        }

        public void resetPosition() {
            ListView listView = getListView();
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            }
        }

        @Override // androidx.appcompat.widget.K, j.e
        public void show() {
            if (getListView() == null) {
                super.show();
                ListView listView = getListView();
                if (listView != null) {
                    listView.setChoiceMode(1);
                }
            }
            super.show();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupWindow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.adapter = new PopupAdapter();
        }
    }
}
