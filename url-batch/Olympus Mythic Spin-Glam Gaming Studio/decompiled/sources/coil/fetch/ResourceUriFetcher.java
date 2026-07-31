package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.decode.ResourceMetadata;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Contexts;
import coil.util.DrawableUtils;
import coil.util.Utils;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;

/* compiled from: ResourceUriFetcher.kt */
/* loaded from: classes3.dex */
public final class ResourceUriFetcher implements Fetcher {
    public static final Companion Companion = new Companion(null);
    private final Uri data;
    private final Options options;

    public ResourceUriFetcher(Uri uri, Options options) {
        this.data = uri;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public Object fetch(Continuation continuation) {
        Integer intOrNull;
        Resources resourcesForApplication;
        Drawable xmlDrawableCompat;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (StringsKt.isBlank(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull(this.data.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    throwInvalidUriException(this.data);
                    throw new KotlinNothingValueException();
                }
                int intValue = intOrNull.intValue();
                Context context = this.options.getContext();
                if (Intrinsics.areEqual(authority, context.getPackageName())) {
                    resourcesForApplication = context.getResources();
                } else {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                }
                TypedValue typedValue = new TypedValue();
                resourcesForApplication.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (Intrinsics.areEqual(mimeTypeFromUrl, "text/xml")) {
                    if (Intrinsics.areEqual(authority, context.getPackageName())) {
                        xmlDrawableCompat = Contexts.getDrawableCompat(context, intValue);
                    } else {
                        xmlDrawableCompat = Contexts.getXmlDrawableCompat(context, resourcesForApplication, intValue);
                    }
                    Drawable drawable = xmlDrawableCompat;
                    boolean isVector = Utils.isVector(drawable);
                    if (isVector) {
                        drawable = new BitmapDrawable(context.getResources(), DrawableUtils.INSTANCE.convertToBitmap(drawable, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
                    }
                    return new DrawableResult(drawable, isVector, DataSource.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(resourcesForApplication.openRawResource(intValue, typedValue2))), context, new ResourceMetadata(authority, intValue, typedValue2.density)), mimeTypeFromUrl, DataSource.DISK);
            }
        }
        throwInvalidUriException(this.data);
        throw new KotlinNothingValueException();
    }

    private final Void throwInvalidUriException(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    /* compiled from: ResourceUriFetcher.kt */
    public static final class Factory implements Fetcher.Factory {
        @Override // coil.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (isApplicable(uri)) {
                return new ResourceUriFetcher(uri, options);
            }
            return null;
        }

        private final boolean isApplicable(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "android.resource");
        }
    }

    /* compiled from: ResourceUriFetcher.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
