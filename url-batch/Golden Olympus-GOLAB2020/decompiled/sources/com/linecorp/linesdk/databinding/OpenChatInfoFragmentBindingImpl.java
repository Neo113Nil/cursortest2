package com.linecorp.linesdk.databinding;

import O.a;
import O.b;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
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
public class OpenChatInfoFragmentBindingImpl extends OpenChatInfoFragmentBinding {
    private static final o.i sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ScrollView mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.nameMaxTextView, 4);
        sparseIntArray.put(R.id.name_divider, 5);
        sparseIntArray.put(R.id.descriptionMaxTextView, 6);
        sparseIntArray.put(R.id.description_detail, 7);
        sparseIntArray.put(R.id.description_divider, 8);
        sparseIntArray.put(R.id.category_title, 9);
        sparseIntArray.put(R.id.categoryLabelTextView, 10);
        sparseIntArray.put(R.id.category_guide, 11);
        sparseIntArray.put(R.id.category_divider, 12);
        sparseIntArray.put(R.id.searchIncludedContainer, 13);
        sparseIntArray.put(R.id.search_title, 14);
        sparseIntArray.put(R.id.search_description, 15);
    }

    public OpenChatInfoFragmentBindingImpl(DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, o.mapBindings(dataBindingComponent, view, 16, (o.i) null, sViewsWithIds));
    }

    private boolean onChangeViewModelChatroomName(B b4, int i4) {
        if (i4 != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelDescription(B b4, int i4) {
        if (i4 != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelIsSearchIncluded(B b4, int i4) {
        if (i4 != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    @Override // androidx.databinding.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void executeBindings() {
        long j4;
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j4 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        OpenChatInfoViewModel openChatInfoViewModel = this.mViewModel;
        boolean z4 = false;
        String str3 = null;
        if ((31 & j4) != 0) {
            if ((j4 & 25) != 0) {
                B chatroomName = openChatInfoViewModel != null ? openChatInfoViewModel.getChatroomName() : null;
                updateLiveDataRegistration(0, chatroomName);
                if (chatroomName != null) {
                    str = (String) chatroomName.f();
                    if ((j4 & 26) == 0) {
                        B description = openChatInfoViewModel != null ? openChatInfoViewModel.getDescription() : null;
                        j5 = 0;
                        updateLiveDataRegistration(1, description);
                        if (description != null) {
                            str2 = (String) description.f();
                            if ((j4 & 28) != j5) {
                                B isSearchIncluded = openChatInfoViewModel != null ? openChatInfoViewModel.isSearchIncluded() : null;
                                updateLiveDataRegistration(2, isSearchIncluded);
                                z4 = o.safeUnbox(isSearchIncluded != null ? (Boolean) isSearchIncluded.f() : null);
                            }
                            str3 = str2;
                        }
                    } else {
                        j5 = 0;
                    }
                    str2 = null;
                    if ((j4 & 28) != j5) {
                    }
                    str3 = str2;
                }
            }
            str = null;
            if ((j4 & 26) == 0) {
            }
            str2 = null;
            if ((j4 & 28) != j5) {
            }
            str3 = str2;
        } else {
            j5 = 0;
            str = null;
        }
        if ((j4 & 26) != j5) {
            b.b(this.descriptionEditText, str3);
        }
        if ((j4 & 25) != j5) {
            b.b(this.nameEditText, str);
        }
        if ((j4 & 28) != j5) {
            a.a(this.searchIncludedCheckBox, z4);
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
            this.mDirtyFlags = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.o
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        if (i4 == 0) {
            return onChangeViewModelChatroomName((B) obj, i5);
        }
        if (i4 == 1) {
            return onChangeViewModelDescription((B) obj, i5);
        }
        if (i4 != 2) {
            return false;
        }
        return onChangeViewModelIsSearchIncluded((B) obj, i5);
    }

    @Override // androidx.databinding.o
    public boolean setVariable(int i4, Object obj) {
        if (BR.viewModel != i4) {
            return false;
        }
        setViewModel((OpenChatInfoViewModel) obj);
        return true;
    }

    @Override // com.linecorp.linesdk.databinding.OpenChatInfoFragmentBinding
    public void setViewModel(OpenChatInfoViewModel openChatInfoViewModel) {
        this.mViewModel = openChatInfoViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    private OpenChatInfoFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (View) objArr[12], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[7], (View) objArr[8], (EditText) objArr[2], (TextView) objArr[6], (View) objArr[5], (EditText) objArr[1], (TextView) objArr[4], (TextView) objArr[15], (CheckBox) objArr[3], (ConstraintLayout) objArr[13], (TextView) objArr[14]);
        this.mDirtyFlags = -1L;
        this.descriptionEditText.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.mboundView0 = scrollView;
        scrollView.setTag(null);
        this.nameEditText.setTag(null);
        this.searchIncludedCheckBox.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
