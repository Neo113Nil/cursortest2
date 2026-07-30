package io.noties.markwon.core.spans;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class j {
    private final WeakReference<TextView> reference;

    public j(@NonNull TextView textView) {
        this.reference = new WeakReference<>(textView);
    }

    public static void applyTo(@NonNull Spannable spannable, @NonNull TextView textView) {
        j[] jVarArr = (j[]) spannable.getSpans(0, spannable.length(), j.class);
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                spannable.removeSpan(jVar);
            }
        }
        spannable.setSpan(new j(textView), 0, spannable.length(), 18);
    }

    @Nullable
    public static TextView textViewOf(@NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return textViewOf((Spanned) charSequence);
        }
        return null;
    }

    @Nullable
    public TextView textView() {
        return this.reference.get();
    }

    @Nullable
    public static TextView textViewOf(@NonNull Spanned spanned) {
        j[] jVarArr = (j[]) spanned.getSpans(0, spanned.length(), j.class);
        if (jVarArr == null || jVarArr.length <= 0) {
            return null;
        }
        return jVarArr[0].textView();
    }
}
