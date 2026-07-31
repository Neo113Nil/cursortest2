package coil3.fetch;

import android.graphics.Bitmap;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: BitmapFetcher.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcoil3/fetch/BitmapFetcher;", "Lcoil3/fetch/Fetcher;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Bitmap;", "fetch", "Lcoil3/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapFetcher implements Fetcher {
    private final Bitmap data;

    public BitmapFetcher(Bitmap bitmap) {
        this.data = bitmap;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(Continuation<? super FetchResult> continuation) {
        return new ImageFetchResult(Image_androidKt.asImage$default(this.data, false, 1, null), false, DataSource.MEMORY);
    }

    /* compiled from: BitmapFetcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcoil3/fetch/BitmapFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "<init>", "()V", "create", "Lcoil3/fetch/Fetcher;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "options", "Lcoil3/request/Options;", "imageLoader", "Lcoil3/ImageLoader;", "(Landroid/graphics/Bitmap;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Bitmap> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Bitmap data, Options options, ImageLoader imageLoader) {
            return new BitmapFetcher(data);
        }
    }
}
