package sqip.internal;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lsqip/internal/CreditCardTransformMethod;", "Landroid/text/method/PasswordTransformationMethod;", "()V", "getTransformation", "", "source", "view", "Landroid/view/View;", "MaskedCreditCardCharSequence", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreditCardTransformMethod extends PasswordTransformationMethod {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lsqip/internal/CreditCardTransformMethod$MaskedCreditCardCharSequence;", "", "source", "(Ljava/lang/CharSequence;)V", "length", "", "getLength", "()I", "get", "", "index", "subSequence", "startIndex", "endIndex", "toString", "", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MaskedCreditCardCharSequence implements CharSequence {
        private static final char DOT = 8226;
        private static final char SPACE = ' ';
        private final CharSequence source;

        public MaskedCreditCardCharSequence(CharSequence charSequence) {
            charSequence.getClass();
            this.source = charSequence;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i) {
            return get(i);
        }

        public char get(int index) {
            return this.source.charAt(index) == ' ' ? SPACE : index == length() + (-1) ? this.source.charAt(index) : DOT;
        }

        public int getLength() {
            return this.source.length();
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int startIndex, int endIndex) {
            return new MaskedCreditCardCharSequence(this.source.subSequence(startIndex, endIndex));
        }

        @Override // java.lang.CharSequence
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length(); i++) {
                sb.append(charAt(i));
            }
            return sb.toString();
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence source, View view) {
        if (source == null) {
            source = "";
        }
        return new MaskedCreditCardCharSequence(source);
    }
}
