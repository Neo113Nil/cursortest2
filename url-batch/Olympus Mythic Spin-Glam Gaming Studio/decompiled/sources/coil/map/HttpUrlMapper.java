package coil.map;

import coil.request.Options;
import okhttp3.HttpUrl;

/* compiled from: HttpUrlMapper.kt */
/* loaded from: classes4.dex */
public final class HttpUrlMapper implements Mapper {
    @Override // coil.map.Mapper
    public String map(HttpUrl httpUrl, Options options) {
        return httpUrl.getUrl();
    }
}
