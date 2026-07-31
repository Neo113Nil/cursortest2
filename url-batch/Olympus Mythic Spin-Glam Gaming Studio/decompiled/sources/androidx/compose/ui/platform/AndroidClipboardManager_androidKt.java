package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString;", "convertToAnnotatedString", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "convertToCharSequence", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidClipboardManager_androidKt {
    public static final AnnotatedString convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        int lastIndex = ArraysKt.getLastIndex(annotations);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotations[i];
                if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "span.value");
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(value).decodeSpanStyle(), spanStart, spanEnd));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) spanStyles.get(i);
            SpanStyle spanStyle = (SpanStyle) range.getItem();
            int start = range.getStart();
            int end = range.getEnd();
            encodeHelper.reset();
            encodeHelper.encode(spanStyle);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), start, end, 33);
        }
        return spannableString;
    }
}
