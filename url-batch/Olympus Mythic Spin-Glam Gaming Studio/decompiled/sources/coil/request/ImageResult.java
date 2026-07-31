package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ImageResult.kt */
/* loaded from: classes15.dex */
public abstract class ImageResult {
    public /* synthetic */ ImageResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Drawable getDrawable();

    public abstract ImageRequest getRequest();

    private ImageResult() {
    }
}
