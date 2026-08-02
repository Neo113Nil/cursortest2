package okhttp3;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public interface CookieJar {
    public static final HttpUrl.Companion NO_COOKIES = new HttpUrl.Companion();

    List loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List list);
}
