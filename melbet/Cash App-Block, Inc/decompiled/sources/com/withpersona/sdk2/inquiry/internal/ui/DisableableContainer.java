package com.withpersona.sdk2.inquiry.internal.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zznf;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.Compatible;
import com.squareup.workflow1.ui.WorkflowViewState;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import com.squareup.workflow1.ui.backstack.ViewStateCache$Saved;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import io.noties.markwon.MarkwonConfiguration;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DisableableContainer extends FrameLayout {
    public static final UiScreenRunner.Companion Companion = new UiScreenRunner.Companion(5);
    public final Recorder.AnonymousClass4 viewStateCache;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DisableableContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.pi2_disableable_container, this);
        int i3 = R.id.overlay;
        if (ViewBindings.findChildViewById(this, R.id.overlay) != null) {
            i3 = R.id.view_container;
            if (((FrameLayout) ViewBindings.findChildViewById(this, R.id.view_container)) != null) {
                this.viewStateCache = new Recorder.AnonymousClass4(1);
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SavedStateRegistryOwner stateRegistryOwnerFromViewTreeOrContext = zznf.stateRegistryOwnerFromViewTreeOrContext(this);
        WorkflowViewState workflowViewStateOrNull = WorkflowViewStateKt.getWorkflowViewStateOrNull(this);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        if (showing == null) {
            showing = null;
        }
        showing.getClass();
        Compatible compatible = showing instanceof Compatible ? (Compatible) showing : null;
        String compatibilityKey = compatible != null ? compatible.getCompatibilityKey() : null;
        if (compatibilityKey == null) {
            compatibilityKey = showing.getClass().getName();
        }
        ((MarkwonConfiguration) this.viewStateCache.this$0).attachToParentRegistry(Intrinsics.stringPlus("", compatibilityKey), stateRegistryOwnerFromViewTreeOrContext);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((MarkwonConfiguration) this.viewStateCache.this$0).detachFromParentRegistry();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        SavedState savedState = parcelable instanceof SavedState ? (SavedState) parcelable : null;
        if (savedState == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
            return;
        }
        ViewStateCache$Saved viewStateCache$Saved = savedState.savedViewState;
        Recorder.AnonymousClass4 anonymousClass4 = this.viewStateCache;
        anonymousClass4.getClass();
        viewStateCache$Saved.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) anonymousClass4.val$audioErrorConsumer;
        linkedHashMap.clear();
        linkedHashMap.putAll(viewStateCache$Saved.viewStates);
        super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        Recorder.AnonymousClass4 anonymousClass4 = this.viewStateCache;
        anonymousClass4.getClass();
        return new SavedState(onSaveInstanceState, new ViewStateCache$Saved(anonymousClass4));
    }

    public final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR();
        public final ViewStateCache$Saved savedViewState;

        public final class CREATOR implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Parcelable readParcelable = parcel.readParcelable(ViewStateCache$Saved.class.getClassLoader());
            readParcelable.getClass();
            this.savedViewState = (ViewStateCache$Saved) readParcelable;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.savedViewState, i);
        }

        public SavedState(Parcelable parcelable, ViewStateCache$Saved viewStateCache$Saved) {
            super(parcelable);
            this.savedViewState = viewStateCache$Saved;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisableableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisableableContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisableableContainer(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
