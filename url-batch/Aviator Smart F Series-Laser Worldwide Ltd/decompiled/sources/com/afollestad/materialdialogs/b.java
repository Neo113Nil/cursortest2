package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* loaded from: classes.dex */
class b extends Dialog implements DialogInterface.OnShowListener {
    private DialogInterface.OnShowListener showListener;
    protected MDRootLayout view;

    b(Context context, int i8) {
        super(context, i8);
    }

    @Override // android.app.Dialog
    public View findViewById(int i8) {
        return this.view.findViewById(i8);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.showListener;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int i8) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    final void setOnShowListenerInternal() {
        super.setOnShowListener(this);
    }

    final void setViewInternal(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(@NonNull View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
