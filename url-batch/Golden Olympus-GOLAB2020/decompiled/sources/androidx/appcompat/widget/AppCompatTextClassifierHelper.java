package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    /* renamed from: a, reason: collision with root package name */
    private TextView f10614a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f10615b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    AppCompatTextClassifierHelper(TextView textView) {
        this.f10614a = (TextView) A.h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f10615b;
        return textClassifier == null ? a.a(this.f10614a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f10615b = textClassifier;
    }
}
