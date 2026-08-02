package com.squareup.workflow1.ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.ui.BackButtonScreen;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewRegistry;
import com.squareup.workflow1.ui.ViewRegistryKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.modal.ModalContainer;

/* loaded from: classes8.dex */
public class ModalViewContainer extends ModalContainer {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModalViewContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public final ModalContainer.DialogRef buildDialog(Object obj, ViewEnvironment viewEnvironment) {
        obj.getClass();
        viewEnvironment.getClass();
        BackButtonScreen backButtonScreen = new BackButtonScreen(obj, ModalViewContainer$buildDialog$wrappedRendering$1.INSTANCE);
        ViewRegistry viewRegistry = (ViewRegistry) viewEnvironment.get(ViewRegistry.Companion);
        Context context = getContext();
        context.getClass();
        final View buildView = ViewRegistryKt.buildView(viewRegistry, backButtonScreen, viewEnvironment, context, this, null);
        ViewShowRenderingKt.start(buildView);
        Dialog buildDialogForView = buildDialogForView(buildView);
        buildDialogForView.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.squareup.workflow1.ui.modal.ModalViewContainer$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner;
                OnBackPressedDispatcher onBackPressedDispatcher;
                int i2 = ModalViewContainer.$r8$clinit;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                Object context2 = buildView.getContext();
                context2.getClass();
                while (!(context2 instanceof OnBackPressedDispatcherOwner)) {
                    ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                    if (contextWrapper == null || (context2 = contextWrapper.getBaseContext()) == null) {
                        onBackPressedDispatcherOwner = null;
                        break;
                    }
                }
                onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) context2;
                if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != null && onBackPressedDispatcher.hasEnabledCallbacks) {
                    onBackPressedDispatcher.onBackPressed();
                }
                return true;
            }
        });
        return new ModalContainer.DialogRef(obj, viewEnvironment, buildDialogForView, buildView);
    }

    public Dialog buildDialogForView(View view) {
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        window.getClass();
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        window2.getClass();
        window2.setBackgroundDrawable(null);
        return dialog;
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public final void updateDialog(ModalContainer.DialogRef dialogRef) {
        BackButtonScreen backButtonScreen = new BackButtonScreen(dialogRef.modalRendering, ModalViewContainer$buildDialog$wrappedRendering$1.INSTANCE$1);
        Object obj = dialogRef.extra;
        if (obj != null) {
            ViewShowRenderingKt.showRendering((View) obj, backButtonScreen, dialogRef.viewEnvironment);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.View");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalViewContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalViewContainer(Context context) {
        this(context, null, 0, 14, 0);
        context.getClass();
    }
}
