package com.moyoung.dafit.module.common.baseui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class BaseVBFragment<VB extends ViewBinding> extends BaseFragement {
    protected VB binding;
    private boolean isFirstLoad = true;
    protected boolean isFirstVisible = true;
    protected boolean isVisibleToUser = false;
    private r noDataUIDelegate;
    private s pageLoadingUIDelegate;
    private t permissionDelegate;
    private ViewModelProvider viewModelProvider;

    private void inflateBindingWithGeneric() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Class<? super Object> superclass = getClass().getSuperclass();
        while (this.binding == null) {
            if (genericSuperclass instanceof ParameterizedType) {
                try {
                    this.binding = (VB) ((Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).getMethod("inflate", LayoutInflater.class).invoke(null, getLayoutInflater());
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
                    e8.printStackTrace();
                }
            }
            if (superclass != null) {
                genericSuperclass = superclass.getGenericSuperclass();
                superclass = superclass.getSuperclass();
            }
        }
    }

    protected r getNoDataUI() {
        if (this.noDataUIDelegate == null) {
            this.noDataUIDelegate = new r(this.binding.getRoot());
        }
        return this.noDataUIDelegate;
    }

    protected s getPageLoadingUI() {
        if (this.pageLoadingUIDelegate == null) {
            this.pageLoadingUIDelegate = new s(this.binding.getRoot().getRootView());
        }
        return this.pageLoadingUIDelegate;
    }

    protected t getPermissionDelegate() {
        if (this.permissionDelegate == null) {
            this.permissionDelegate = new t(requireContext());
        }
        return this.permissionDelegate;
    }

    protected ViewModelProvider getViewModelProvider() {
        if (this.viewModelProvider == null) {
            this.viewModelProvider = new ViewModelProvider(requireActivity());
        }
        return this.viewModelProvider;
    }

    protected void initBinding() {
    }

    protected void initOnClickListener() {
    }

    protected void initViewModel() {
    }

    protected void loadData() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        inflateBindingWithGeneric();
        VB vb = this.binding;
        Objects.requireNonNull(vb);
        return vb.getRoot();
    }

    protected void onFirstVisible() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        this.isVisibleToUser = !z7;
        if (!this.isFirstVisible || z7) {
            return;
        }
        onFirstVisible();
        this.isFirstVisible = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        t tVar = this.permissionDelegate;
        if (tVar != null) {
            tVar.onResult(i8, strArr, iArr);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isFirstLoad) {
            initViewModel();
            loadData();
            this.isFirstLoad = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initBinding();
        initOnClickListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        this.isVisibleToUser = z7;
        if (this.isFirstVisible && z7) {
            onFirstVisible();
            this.isFirstVisible = false;
        }
    }
}
