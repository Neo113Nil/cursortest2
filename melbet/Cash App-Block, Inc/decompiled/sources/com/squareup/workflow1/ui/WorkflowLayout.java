package com.squareup.workflow1.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.squareup.cash.R;
import kotlin.Unit;

/* loaded from: classes8.dex */
public final class WorkflowLayout extends FrameLayout {
    public SparseArray restoredChildState;
    public final WorkflowViewStub showing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (getId() == -1) {
            setId(R.id.workflow_layout);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.showing = workflowViewStub;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Unit unit = null;
        SavedState savedState = parcelable instanceof SavedState ? (SavedState) parcelable : null;
        if (savedState != null) {
            this.restoredChildState = savedState.childState;
            super.onRestoreInstanceState(((SavedState) parcelable).getSuperState());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.showing.actual.saveHierarchyState(sparseArray);
        return new SavedState(onSaveInstanceState, sparseArray);
    }

    public final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR();
        public final SparseArray childState;

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
            SparseArray readSparseArray = parcel.readSparseArray(SavedState.class.getClassLoader());
            readSparseArray.getClass();
            this.childState = readSparseArray;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeSparseArray(this.childState);
        }

        public SavedState(Parcelable parcelable, SparseArray sparseArray) {
            super(parcelable);
            this.childState = sparseArray;
        }
    }
}
