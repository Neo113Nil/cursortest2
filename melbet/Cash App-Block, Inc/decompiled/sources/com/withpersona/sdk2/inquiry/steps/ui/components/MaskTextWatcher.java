package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.play.integrity.internal.aj;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class MaskTextWatcher implements TextWatcher {
    public boolean isDeleting;
    public boolean isRunning;
    public final String mask;

    public MaskTextWatcher(String str) {
        str.getClass();
        this.mask = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        if (java.lang.Character.isLetter(r7) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        if (r7 == ((com.withpersona.sdk2.inquiry.steps.ui.components.MaskChar$Literal) r6).f831char) goto L36;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z;
        editable.getClass();
        if (this.isRunning || this.isDeleting) {
            return;
        }
        this.isRunning = true;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = this.mask;
            if (i >= str.length()) {
                editable.replace(0, editable.length(), sb);
                this.isRunning = false;
                return;
            }
            char charAt = str.charAt(i);
            aj maskChar$Literal = charAt != '#' ? charAt != '*' ? charAt != '@' ? new MaskChar$Literal(charAt) : MaskChar$AnyLetter.INSTANCE : MaskChar$AnyNumberOrLetter.INSTANCE : MaskChar$AnyNumber.INSTANCE;
            while (true) {
                if (i2 < editable.length()) {
                    char charAt2 = editable.charAt(i2);
                    if (maskChar$Literal instanceof MaskChar$AnyNumber) {
                        z = Character.isDigit(charAt2);
                    } else if (maskChar$Literal instanceof MaskChar$AnyLetter) {
                        z = Character.isLetter(charAt2);
                    } else if (maskChar$Literal instanceof MaskChar$AnyNumberOrLetter) {
                        if (!Character.isDigit(charAt2)) {
                        }
                        z = true;
                    } else if (!(maskChar$Literal instanceof MaskChar$Literal)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    if (z) {
                        sb.append(charAt2);
                        i2++;
                        break;
                    } else {
                        if (maskChar$Literal instanceof MaskChar$Literal) {
                            sb.append(charAt);
                            break;
                        }
                        i2++;
                    }
                }
            }
            i++;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        this.isDeleting = i2 > i3;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }
}
