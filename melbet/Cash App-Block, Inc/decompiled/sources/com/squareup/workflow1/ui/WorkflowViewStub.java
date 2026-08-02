package com.squareup.workflow1.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class WorkflowViewStub extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public View actual;
    public int inflatedId;
    public Function2 replaceOldViewInParent;
    public boolean updatesVisibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.actual = this;
        this.updatesVisibility = true;
        this.inflatedId = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WorkflowViewStub, i, i2);
        obtainStyledAttributes.getClass();
        setInflatedId(obtainStyledAttributes.getResourceId(0, -1));
        this.updatesVisibility = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.replaceOldViewInParent = new SpacerKt$Spacer$3(this, 10);
    }

    @Override // android.view.View
    public final int getVisibility() {
        View view = this.actual;
        return (Intrinsics.areEqual(view, this) || view == null) ? super.getVisibility() : this.actual.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        View view;
        super.setBackground(drawable);
        if (Intrinsics.areEqual(this.actual, this) || (view = this.actual) == null || drawable == null) {
            return;
        }
        view.setBackground(drawable);
    }

    @Override // android.view.View
    public void setId(int i) {
        if (i == -1 || i != this.inflatedId) {
            super.setId(i);
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Intrinsics.stringPlus(getResources().getResourceName(i), "id must be distinct from inflatedId: "));
        }
    }

    public final void setInflatedId(int i) {
        if (i == -1 || i != getId()) {
            this.inflatedId = i;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Intrinsics.stringPlus(getResources().getResourceName(getId()), "inflatedId must be distinct from id: "));
        }
    }

    public final void setReplaceOldViewInParent(Function2<? super ViewGroup, ? super View, Unit> function2) {
        function2.getClass();
        this.replaceOldViewInParent = function2;
    }

    public final void setUpdatesVisibility(boolean z) {
        this.updatesVisibility = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view;
        super.setVisibility(i);
        if (Intrinsics.areEqual(this.actual, this) || (view = this.actual) == null) {
            return;
        }
        view.setVisibility(i);
    }

    public final void update(Object obj, ViewEnvironment viewEnvironment) {
        obj.getClass();
        viewEnvironment.getClass();
        View view = this.actual;
        if (!ViewShowRenderingKt.canShowRendering(view, obj)) {
            view = null;
        }
        if (view != null) {
            ViewShowRenderingKt.showRendering(view, obj, viewEnvironment);
            return;
        }
        ViewParent parent = this.actual.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            a$$ExternalSyntheticBUOutline0.m$1("WorkflowViewStub must have a non-null ViewGroup parent");
            return;
        }
        View view2 = this.actual;
        if (view2 != this) {
            view2.getClass();
            LifecycleOwner lifecycleOwner = DBUtil.get(view2);
            RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = lifecycleOwner instanceof RealWorkflowLifecycleOwner ? (RealWorkflowLifecycleOwner) lifecycleOwner : null;
            if (realWorkflowLifecycleOwner != null) {
                realWorkflowLifecycleOwner.destroyOnDetach();
            }
        }
        ViewRegistry viewRegistry = (ViewRegistry) viewEnvironment.get(ViewRegistry.Companion);
        Context context = viewGroup.getContext();
        context.getClass();
        View buildView = ViewRegistryKt.buildView(viewRegistry, obj, viewEnvironment, context, viewGroup, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(20));
        ViewShowRenderingKt.start(buildView);
        int i = this.inflatedId;
        if (i != -1) {
            buildView.setId(i);
        }
        if (this.updatesVisibility) {
            buildView.setVisibility(getVisibility());
        }
        Drawable background = getBackground();
        if (background != null) {
            buildView.setBackground(background);
        }
        SavedStateRegistryOwner savedStateRegistryOwner = Countries.get(this);
        ViewParent parent2 = getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (savedStateRegistryOwner != (viewGroup2 != null ? Countries.get(viewGroup2) : null)) {
            buildView.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
        }
        this.replaceOldViewInParent.invoke(viewGroup, buildView);
        this.actual = buildView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ WorkflowViewStub(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
