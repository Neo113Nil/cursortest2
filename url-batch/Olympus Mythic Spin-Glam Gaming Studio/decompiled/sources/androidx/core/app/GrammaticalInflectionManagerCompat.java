package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public final class GrammaticalInflectionManagerCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GrammaticalGender {
    }

    @RequiresApi
    static class Api34Impl {
        @DoNotInline
        static int getApplicationGrammaticalGender(Context context) {
            return getGrammaticalInflectionManager(context).getApplicationGrammaticalGender();
        }

        @DoNotInline
        static void setRequestedApplicationGrammaticalGender(Context context, int i) {
            getGrammaticalInflectionManager(context).setRequestedApplicationGrammaticalGender(i);
        }

        private static GrammaticalInflectionManager getGrammaticalInflectionManager(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }
    }
}
