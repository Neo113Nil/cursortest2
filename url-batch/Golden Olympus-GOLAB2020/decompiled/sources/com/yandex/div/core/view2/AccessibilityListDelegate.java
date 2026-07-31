package com.yandex.div.core.view2;

import B.w;
import Z1.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.core.view.AbstractC1293g0;
import androidx.core.view.C1280a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.yandex.div.core.view2.AccessibilityListDelegate;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AccessibilityListDelegate extends r {
    private boolean isItemsFocusActive;

    @Nullable
    private C1280a itemDelegate;

    @NotNull
    private final ArrayList<ViewAccessibilityState> list;

    @NotNull
    private final BackHandlingRecyclerView recyclerView;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener visibilityListener;

    @Metadata
    public final class ItemAccessibilityDelegate extends r.a {
        public ItemAccessibilityDelegate() {
            super(AccessibilityListDelegate.this);
        }

        @Override // androidx.recyclerview.widget.r.a, androidx.core.view.C1280a
        public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull w info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            info.k0(H.b(Button.class).c());
            AccessibilityListDelegate.this.updateItemAccessibility(host);
        }
    }

    @Metadata
    private static final class ViewAccessibilityState {
        private final int accessibilityState;

        @NotNull
        private final WeakReference<View> view;

        public ViewAccessibilityState(@NotNull WeakReference<View> view, int i4) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.accessibilityState = i4;
        }

        public final int getAccessibilityState() {
            return this.accessibilityState;
        }

        @NotNull
        public final WeakReference<View> getView() {
            return this.view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityListDelegate(@NotNull BackHandlingRecyclerView recyclerView) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        this.list = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w1.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AccessibilityListDelegate.visibilityListener$lambda$0(AccessibilityListDelegate.this);
            }
        };
        this.visibilityListener = onGlobalLayoutListener;
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
                AccessibilityListDelegate.this.clearItemsFocus();
            }
        });
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            updateItemAccessibility(recyclerView.getChildAt(i4));
        }
        this.recyclerView.setOnBackClickListener(new BackKeyPressedHelper.OnBackClickListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.3
            @Override // com.yandex.div.core.view2.backbutton.BackKeyPressedHelper.OnBackClickListener
            public boolean onBackClick() {
                return AccessibilityListDelegate.this.onBackPressed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearItemsFocus() {
        setItemsFocusActive(false);
        restoreAccessibilityState();
    }

    private final void focusChildren() {
        setItemsFocusActive(true);
        makeInaccessibleAllOtherViews(this.recyclerView);
        View firstChild = getFirstChild(this.recyclerView);
        View unwrap = firstChild != null ? getUnwrap(firstChild) : null;
        if (unwrap != null) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(unwrap);
        }
    }

    private final void focusContainer() {
        BaseDivViewExtensionsKt.gainAccessibilityFocus(this.recyclerView);
        clearItemsFocus();
    }

    private final View getFirstChild(ViewGroup viewGroup) {
        return (View) k.A(AbstractC1293g0.b(viewGroup), a.b(AccessibilityListDelegate$firstChild$1.INSTANCE, AccessibilityListDelegate$firstChild$2.INSTANCE));
    }

    private final View getUnwrap(View view) {
        View child;
        return (!(view instanceof DivViewWrapper) || (child = ((DivViewWrapper) view).getChild()) == null) ? view : child;
    }

    private final void makeInaccessibleAllOtherViews(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || Intrinsics.areEqual(viewGroup, viewGroup2.getRootView())) {
            return;
        }
        for (View view : AbstractC1293g0.b(viewGroup2)) {
            if (!Intrinsics.areEqual(view, viewGroup) && view.getImportantForAccessibility() != 4) {
                this.list.add(new ViewAccessibilityState(new WeakReference(view), view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
        makeInaccessibleAllOtherViews(viewGroup2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onBackPressed() {
        if (!this.isItemsFocusActive) {
            return false;
        }
        focusContainer();
        return true;
    }

    private final void restoreAccessibilityState() {
        ArrayList<ViewAccessibilityState> arrayList = this.list;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            ViewAccessibilityState viewAccessibilityState = arrayList.get(i4);
            i4++;
            ViewAccessibilityState viewAccessibilityState2 = viewAccessibilityState;
            View view = viewAccessibilityState2.getView().get();
            if (view != null) {
                view.setImportantForAccessibility(viewAccessibilityState2.getAccessibilityState());
            }
        }
        this.list.clear();
    }

    private final void setItemsFocusActive(boolean z4) {
        if (this.isItemsFocusActive == z4) {
            return;
        }
        this.isItemsFocusActive = z4;
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemAccessibility(View view) {
        view.setImportantForAccessibility(this.isItemsFocusActive ? 1 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void visibilityListener$lambda$0(AccessibilityListDelegate this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isItemsFocusActive || this$0.recyclerView.getVisibility() == 0) {
            return;
        }
        this$0.clearItemsFocus();
    }

    @Override // androidx.recyclerview.widget.r
    @NotNull
    public C1280a getItemDelegate() {
        C1280a c1280a = this.itemDelegate;
        if (c1280a != null) {
            return c1280a;
        }
        ItemAccessibilityDelegate itemAccessibilityDelegate = new ItemAccessibilityDelegate();
        this.itemDelegate = itemAccessibilityDelegate;
        return itemAccessibilityDelegate;
    }

    @Override // androidx.recyclerview.widget.r, androidx.core.view.C1280a
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull w info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.k0(this.isItemsFocusActive ? H.b(RecyclerView.class).c() : H.b(Button.class).c());
        info.a(16);
        info.l0(true);
        info.w0(true);
        info.E0(true);
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i4));
        }
    }

    @Override // androidx.recyclerview.widget.r, androidx.core.view.C1280a
    public boolean performAccessibilityAction(@NotNull View host, int i4, @Nullable Bundle bundle) {
        boolean z4;
        Intrinsics.checkNotNullParameter(host, "host");
        if (i4 == 16) {
            focusChildren();
            z4 = true;
        } else {
            z4 = false;
        }
        return super.performAccessibilityAction(host, i4, bundle) || z4;
    }
}
