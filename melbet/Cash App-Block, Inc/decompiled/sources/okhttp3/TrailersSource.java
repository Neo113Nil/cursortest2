package okhttp3;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public interface TrailersSource {
    public static final HttpUrl.Companion EMPTY = new HttpUrl.Companion();

    Headers get();
}
