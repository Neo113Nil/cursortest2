package com.moyoung.dafit.module.common.baseui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import androidx.viewbinding.ViewBinding;
import com.moyoung.dafit.module.common.R$style;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class BaseVBDialog<VB extends ViewBinding> extends AppCompatDialog {
    protected VB binding;

    public BaseVBDialog(Context context) {
        super(context, R$style.BaseUIDialog);
        init();
    }

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

    private void init() {
        inflateBindingWithGeneric();
        setContentView(this.binding.getRoot());
        initBinding();
    }

    protected abstract void initBinding();

    public void setShowBottom() {
        setShowPosition(80);
    }

    public void setShowBottomWithAnim() {
        setShowPosition(80);
        getWindow().setWindowAnimations(R$style.BottomDialogAnimation);
    }

    public void setShowPosition(int i8) {
        Window window = getWindow();
        window.setGravity(i8);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    public BaseVBDialog(Context context, int i8) {
        super(context, i8);
        init();
    }
}
