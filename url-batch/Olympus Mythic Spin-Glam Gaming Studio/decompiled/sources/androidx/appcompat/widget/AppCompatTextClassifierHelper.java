package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* loaded from: classes4.dex */
final class AppCompatTextClassifierHelper {
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    AppCompatTextClassifierHelper(TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    @RequiresApi
    private static final class Api26Impl {
        @NonNull
        @DoNotInline
        static TextClassifier getTextClassifier(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }
}
