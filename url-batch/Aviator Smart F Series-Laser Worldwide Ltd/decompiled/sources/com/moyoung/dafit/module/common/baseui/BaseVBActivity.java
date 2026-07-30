package com.moyoung.dafit.module.common.baseui;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.moyoung.dafit.module.common.utils.k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class BaseVBActivity<VB extends ViewBinding> extends BaseActivity {
    protected VB binding;
    private r noDataUIDelegate;
    private s pageLoadingUIDelegate;
    private t permissionDelegate;

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

    protected boolean getFitsSystemWindows() {
        return true;
    }

    protected r getNoDataUI() {
        if (this.noDataUIDelegate == null) {
            this.noDataUIDelegate = new r(this.binding.getRoot().getRootView());
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
            this.permissionDelegate = new t(this);
        }
        return this.permissionDelegate;
    }

    protected void initBinding() {
    }

    protected void initOnClickListener() {
    }

    protected void loadData() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        k0.setColorTranslucent(this);
        k0.setLightMode(this);
        inflateBindingWithGeneric();
        this.binding.getRoot().setFitsSystemWindows(getFitsSystemWindows());
        setContentView(this.binding.getRoot());
        initBinding();
        loadData();
        initOnClickListener();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        t tVar = this.permissionDelegate;
        if (tVar != null) {
            tVar.onResult(i8, strArr, iArr);
        }
    }
}
