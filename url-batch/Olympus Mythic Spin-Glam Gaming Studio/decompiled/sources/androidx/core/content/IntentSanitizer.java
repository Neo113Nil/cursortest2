package androidx.core.content;

import android.content.ClipData;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;

/* loaded from: classes14.dex */
public class IntentSanitizer {

    public static final class Builder {
    }

    @RequiresApi
    private static class Api31Impl {
        @DoNotInline
        static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }
    }

    @RequiresApi
    private static class Api29Impl {
        @DoNotInline
        static Intent setIdentifier(Intent intent, String str) {
            return intent.setIdentifier(str);
        }

        @DoNotInline
        static String getIdentifier(Intent intent) {
            return intent.getIdentifier();
        }
    }
}
