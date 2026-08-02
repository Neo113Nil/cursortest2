package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.google.android.play.integrity.internal.aj;

/* loaded from: classes9.dex */
public final class SecureTransformationMethod extends PasswordTransformationMethod {
    public final String mask;

    public final class SecureCharSequence implements CharSequence {
        public final String mask;
        public final CharSequence source;

        public SecureCharSequence(CharSequence charSequence, String str) {
            str.getClass();
            this.mask = str;
            this.source = charSequence;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            String str = this.mask;
            if (i >= str.length()) {
                return (char) 8226;
            }
            char charAt = str.charAt(i);
            aj maskChar$Literal = charAt != '#' ? charAt != '*' ? charAt != '@' ? new MaskChar$Literal(charAt) : MaskChar$AnyLetter.INSTANCE : MaskChar$AnyNumberOrLetter.INSTANCE : MaskChar$AnyNumber.INSTANCE;
            if (maskChar$Literal instanceof MaskChar$Literal) {
                return ((MaskChar$Literal) maskChar$Literal).f831char;
            }
            return (char) 8226;
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.source.length();
        }

        @Override // java.lang.CharSequence
        public final CharSequence subSequence(int i, int i2) {
            return this.source.subSequence(i, i2);
        }
    }

    public SecureTransformationMethod(String str) {
        str.getClass();
        this.mask = str;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence == null ? "" : new SecureCharSequence(charSequence, this.mask);
    }
}
