package com.withpersona.sdk2.inquiry.shared.di;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.shared.baseFragment.BaseFragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class BaseDaggerFragment extends BaseFragment implements HasAndroidInjector {
    public DispatchingAndroidInjector androidInjector;
    public final Function3 inflateFn;

    public BaseDaggerFragment(Function3 function3) {
        this.inflateFn = function3;
    }

    @Override // dagger.android.HasAndroidInjector
    public final DispatchingAndroidInjector androidInjector() {
        DispatchingAndroidInjector dispatchingAndroidInjector = this.androidInjector;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("androidInjector");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.withpersona.sdk2.inquiry.shared.baseFragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        HasAndroidInjector hasAndroidInjector;
        context.getClass();
        Fragment fragment = this;
        while (true) {
            fragment = fragment.getParentFragment();
            if (fragment == 0) {
                FragmentActivity activity = getActivity();
                if (activity instanceof HasAndroidInjector) {
                    hasAndroidInjector = (HasAndroidInjector) activity;
                } else {
                    if (!(activity.getApplication() instanceof HasAndroidInjector)) {
                        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("No injector was found for ", getClass().getCanonicalName()));
                        return;
                    }
                    hasAndroidInjector = (HasAndroidInjector) activity.getApplication();
                }
            } else if (fragment instanceof HasAndroidInjector) {
                hasAndroidInjector = (HasAndroidInjector) fragment;
                break;
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", "An injector for " + getClass().getCanonicalName() + " was found in " + hasAndroidInjector.getClass().getCanonicalName());
        }
        hasAndroidInjector.androidInjector().inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewBinding viewBinding = (ViewBinding) this.inflateFn.invoke(layoutInflater, viewGroup, Boolean.FALSE);
        viewBinding.getClass();
        this._binding = viewBinding;
        View root = viewBinding.getRoot();
        root.getClass();
        return root;
    }
}
