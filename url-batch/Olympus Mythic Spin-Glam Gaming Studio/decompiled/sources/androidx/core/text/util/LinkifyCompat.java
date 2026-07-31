package androidx.core.text.util;

import android.text.Spannable;
import android.text.util.Linkify;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.text.util.LinkifyCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class LinkifyCompat {
    private static final String[] EMPTY_STRING = new String[0];
    private static final Comparator COMPARATOR = new Comparator() { // from class: androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = LinkifyCompat.lambda$static$0((LinkifyCompat.LinkSpec) obj, (LinkifyCompat.LinkSpec) obj2);
            return lambda$static$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static class LinkSpec {
        int end;
        int start;
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LinkifyMask {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i = linkSpec.start;
        int i2 = linkSpec2.start;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(linkSpec2.end, linkSpec.end);
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static void addLinks(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @DoNotInline
        static boolean addLinks(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }
}
