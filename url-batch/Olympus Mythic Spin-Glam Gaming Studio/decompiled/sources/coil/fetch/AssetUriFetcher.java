package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.AssetMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Utils;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;

/* compiled from: AssetUriFetcher.kt */
/* loaded from: classes14.dex */
public final class AssetUriFetcher implements Fetcher {
    private final Uri data;
    private final Options options;

    public AssetUriFetcher(Uri uri, Options options) {
        this.data = uri;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public Object fetch(Continuation continuation) {
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(this.data.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(this.options.getContext().getAssets().open(joinToString$default))), this.options.getContext(), new AssetMetadata(joinToString$default)), Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), joinToString$default), DataSource.DISK);
    }

    /* compiled from: AssetUriFetcher.kt */
    public static final class Factory implements Fetcher.Factory {
        @Override // coil.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (Utils.isAssetUri(uri)) {
                return new AssetUriFetcher(uri, options);
            }
            return null;
        }
    }
}
