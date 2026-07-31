package coil3.compose;

import coil3.Extras;
import coil3.ExtrasKt;
import coil3.ImageLoader;
import coil3.request.ImageRequest;
import kotlin.Metadata;

/* compiled from: imageRequests.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\"\u001e\u0010\u0000\u001a\u00020\u0003*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\f\u001a\u0004\b\b\u0010\r\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u000f\u001a\u00020\u0003*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n*\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\r\"\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"useExistingImageAsPlaceholder", "Lcoil3/request/ImageRequest$Builder;", "enable", "", "Lcoil3/ImageLoader$Builder;", "Lcoil3/request/ImageRequest;", "getUseExistingImageAsPlaceholder$annotations", "(Lcoil3/request/ImageRequest;)V", "getUseExistingImageAsPlaceholder", "(Lcoil3/request/ImageRequest;)Z", "Lcoil3/Extras$Key;", "Lcoil3/Extras$Key$Companion;", "(Lcoil3/Extras$Key$Companion;)V", "(Lcoil3/Extras$Key$Companion;)Lcoil3/Extras$Key;", "useExistingImageAsPlaceholderKey", "preferEndFirstIntrinsicSize", "getPreferEndFirstIntrinsicSize$annotations", "getPreferEndFirstIntrinsicSize", "preferEndFirstIntrinsicSizeKey", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageRequestsKt {
    private static final Extras.Key<Boolean> useExistingImageAsPlaceholderKey = new Extras.Key<>(false);
    private static final Extras.Key<Boolean> preferEndFirstIntrinsicSizeKey = new Extras.Key<>(false);

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(Extras.Key.Companion companion) {
    }

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(ImageRequest imageRequest) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(Extras.Key.Companion companion) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(ImageRequest imageRequest) {
    }

    public static final ImageRequest.Builder useExistingImageAsPlaceholder(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(useExistingImageAsPlaceholderKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder useExistingImageAsPlaceholder(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(useExistingImageAsPlaceholderKey, Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getUseExistingImageAsPlaceholder(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, useExistingImageAsPlaceholderKey)).booleanValue();
    }

    public static final Extras.Key<Boolean> getUseExistingImageAsPlaceholder(Extras.Key.Companion companion) {
        return useExistingImageAsPlaceholderKey;
    }

    public static final ImageRequest.Builder preferEndFirstIntrinsicSize(ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(preferEndFirstIntrinsicSizeKey, Boolean.valueOf(z));
        return builder;
    }

    public static final ImageLoader.Builder preferEndFirstIntrinsicSize(ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(preferEndFirstIntrinsicSizeKey, Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getPreferEndFirstIntrinsicSize(ImageRequest imageRequest) {
        return ((Boolean) ExtrasKt.getExtra(imageRequest, preferEndFirstIntrinsicSizeKey)).booleanValue();
    }

    public static final Extras.Key<Boolean> getPreferEndFirstIntrinsicSize(Extras.Key.Companion companion) {
        return preferEndFirstIntrinsicSizeKey;
    }
}
