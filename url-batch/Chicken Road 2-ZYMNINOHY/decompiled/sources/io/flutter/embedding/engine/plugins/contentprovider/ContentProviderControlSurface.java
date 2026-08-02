package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.lifecycle.AbstractC0231j;

/* loaded from: classes.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, AbstractC0231j abstractC0231j);

    void detachFromContentProvider();
}
