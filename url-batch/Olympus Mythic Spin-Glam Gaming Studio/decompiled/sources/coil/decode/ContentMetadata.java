package coil.decode;

import android.net.Uri;
import coil.decode.ImageSource;

/* compiled from: ImageSource.kt */
/* loaded from: classes13.dex */
public final class ContentMetadata extends ImageSource.Metadata {
    private final Uri uri;

    public ContentMetadata(Uri uri) {
        this.uri = uri;
    }
}
