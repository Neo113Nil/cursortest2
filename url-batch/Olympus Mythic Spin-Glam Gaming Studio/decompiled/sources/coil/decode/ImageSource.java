package coil.decode;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;

/* compiled from: ImageSource.kt */
/* loaded from: classes12.dex */
public abstract class ImageSource implements Closeable {

    /* compiled from: ImageSource.kt */
    public static abstract class Metadata {
    }

    public /* synthetic */ ImageSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Metadata getMetadata();

    public abstract BufferedSource source();

    private ImageSource() {
    }
}
