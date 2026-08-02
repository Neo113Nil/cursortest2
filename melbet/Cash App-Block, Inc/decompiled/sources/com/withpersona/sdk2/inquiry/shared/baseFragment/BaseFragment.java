package com.withpersona.sdk2.inquiry.shared.baseFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/baseFragment/BaseFragment;", "Landroidx/viewbinding/ViewBinding;", "T", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class BaseFragment<T extends ViewBinding> extends Fragment {
    public ViewBinding _binding;
    public Context themedContext;

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        InquiryArgsProvider inquiryArgsProvider;
        context.getClass();
        super.onAttach(context);
        Fragment fragment = getParentFragment();
        while (true) {
            if (fragment == 0) {
                inquiryArgsProvider = null;
                break;
            } else {
                if (fragment instanceof InquiryArgsProvider) {
                    inquiryArgsProvider = (InquiryArgsProvider) fragment;
                    break;
                }
                fragment = fragment.getParentFragment();
            }
        }
        if (inquiryArgsProvider != null) {
            InquiryFragment inquiryFragment = (InquiryFragment) inquiryArgsProvider;
            if (inquiryFragment.requireActivity().getClass() != InquiryActivity.class) {
                Integer theme = inquiryFragment.getTheme();
                this.themedContext = new ContextThemeWrapper(context, theme.intValue() != 0 ? theme.intValue() : R.style.Persona_Inquiry_Theme);
                return;
            }
        }
        this.themedContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        onGetLayoutInflater.getClass();
        Context context = this.themedContext;
        if (context == null) {
            context = getContext();
        }
        LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(context);
        cloneInContext.getClass();
        return cloneInContext;
    }
}
