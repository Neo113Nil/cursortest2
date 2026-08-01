package l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0220Q {
    public static TextClassifier a(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
