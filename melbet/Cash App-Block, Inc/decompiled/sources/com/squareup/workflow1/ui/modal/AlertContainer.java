package com.squareup.workflow1.ui.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.modal.AlertScreen;
import com.squareup.workflow1.ui.modal.ModalContainer;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;

/* loaded from: classes8.dex */
public final class AlertContainer extends ModalContainer {
    public static final UiScreenRunner.Companion Companion = new UiScreenRunner.Companion(8);
    public final int dialogThemeResId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlertContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        this.dialogThemeResId = 0;
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public final ModalContainer.DialogRef buildDialog(Object obj, ViewEnvironment viewEnvironment) {
        AlertScreen alertScreen = (AlertScreen) obj;
        alertScreen.getClass();
        viewEnvironment.getClass();
        AlertDialog create = new AlertDialog.Builder(getContext(), this.dialogThemeResId).create();
        create.getClass();
        ModalContainer.DialogRef dialogRef = new ModalContainer.DialogRef(alertScreen, viewEnvironment, create, null);
        updateDialog(dialogRef);
        return dialogRef;
    }

    @Override // com.squareup.workflow1.ui.modal.ModalContainer
    public final void updateDialog(ModalContainer.DialogRef dialogRef) {
        int i;
        Unit unit;
        char c;
        AlertDialog alertDialog = (AlertDialog) dialogRef.dialog;
        AlertScreen alertScreen = (AlertScreen) dialogRef.modalRendering;
        alertScreen.getClass();
        int i2 = 0;
        alertDialog.setOnCancelListener(new AlertContainer$$ExternalSyntheticLambda0(alertScreen, i2));
        alertDialog.setCancelable(true);
        AlertScreen.Button[] values = AlertScreen.Button.values();
        int length = values.length;
        while (i2 < length) {
            AlertScreen.Button button = values[i2];
            i2++;
            String str = (String) alertScreen.buttons.get(button);
            Button button2 = null;
            if (str == null) {
                unit = null;
            } else {
                int ordinal = button.ordinal();
                if (ordinal == 0) {
                    i = -1;
                } else if (ordinal == 1) {
                    i = -2;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i = -3;
                }
                alertDialog.mAlert.setButton(i, str, new AlertContainer$$ExternalSyntheticLambda1(alertScreen, button));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                int ordinal2 = button.ordinal();
                if (ordinal2 == 0) {
                    c = 65535;
                } else if (ordinal2 == 1) {
                    c = 65534;
                } else {
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    c = 65533;
                }
                AlertController alertController = alertDialog.mAlert;
                if (c == 65533) {
                    button2 = alertController.mButtonNeutral;
                } else if (c == 65534) {
                    button2 = alertController.mButtonNegative;
                } else if (c != 65535) {
                    alertController.getClass();
                } else {
                    button2 = alertController.mButtonPositive;
                }
                if (button2 != null) {
                    button2.setVisibility(4);
                }
            }
        }
        String str2 = alertScreen.message;
        AlertController alertController2 = alertDialog.mAlert;
        alertController2.mMessage = str2;
        TextView textView = alertController2.mMessageView;
        if (textView != null) {
            textView.setText(str2);
        }
        alertDialog.setTitle(alertScreen.title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlertContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 28);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlertContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 24);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlertContainer(Context context) {
        this(context, null, 0, 30);
        context.getClass();
    }
}
