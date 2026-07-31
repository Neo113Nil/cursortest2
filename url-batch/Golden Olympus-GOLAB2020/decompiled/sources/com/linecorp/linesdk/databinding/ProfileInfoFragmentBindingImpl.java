package com.linecorp.linesdk.databinding;

import O.b;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.o;
import androidx.lifecycle.B;
import com.linecorp.linesdk.BR;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel;

/* loaded from: classes2.dex */
public class ProfileInfoFragmentBindingImpl extends ProfileInfoFragmentBinding {
    private static final o.i sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.displayNameGuide, 2);
    }

    public ProfileInfoFragmentBindingImpl(DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, o.mapBindings(dataBindingComponent, view, 3, (o.i) null, sViewsWithIds));
    }

    private boolean onChangeViewModelProfileName(B b4, int i4) {
        if (i4 != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.o
    protected void executeBindings() {
        long j4;
        synchronized (this) {
            j4 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        OpenChatInfoViewModel openChatInfoViewModel = this.mViewModel;
        long j5 = j4 & 7;
        String str = null;
        if (j5 != 0) {
            B profileName = openChatInfoViewModel != null ? openChatInfoViewModel.getProfileName() : null;
            updateLiveDataRegistration(0, profileName);
            if (profileName != null) {
                str = (String) profileName.f();
            }
        }
        if (j5 != 0) {
            b.b(this.displayNameEditText, str);
        }
    }

    @Override // androidx.databinding.o
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.o
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.o
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 != 0) {
            return false;
        }
        return onChangeViewModelProfileName((B) obj, i5);
    }

    @Override // androidx.databinding.o
    public boolean setVariable(int i4, Object obj) {
        if (BR.viewModel != i4) {
            return false;
        }
        setViewModel((OpenChatInfoViewModel) obj);
        return true;
    }

    @Override // com.linecorp.linesdk.databinding.ProfileInfoFragmentBinding
    public void setViewModel(OpenChatInfoViewModel openChatInfoViewModel) {
        this.mViewModel = openChatInfoViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    private ProfileInfoFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (EditText) objArr[1], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.displayNameEditText.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
