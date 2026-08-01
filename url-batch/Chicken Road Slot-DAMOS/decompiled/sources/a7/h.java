package a7;

import android.graphics.fonts.Font;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ Font.Builder f(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void r() {
    }
}
