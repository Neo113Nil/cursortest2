package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
class NetworkRequestHandler extends w {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final j downloader;
    private final y stats;

    static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i8, int i9) {
            super("HTTP " + i8);
            this.code = i8;
            this.networkPolicy = i9;
        }
    }

    NetworkRequestHandler(j jVar, y yVar) {
        this.downloader = jVar;
        this.stats = yVar;
    }

    private static Request createRequest(u uVar, int i8) {
        CacheControl cacheControl;
        if (i8 == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.isOfflineOnly(i8)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.shouldReadFromDiskCache(i8)) {
                builder.noCache();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i8)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uVar.uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    @Override // com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        String scheme = uVar.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || SCHEME_HTTPS.equals(scheme);
    }

    @Override // com.squareup.picasso.w
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        Response load = this.downloader.load(createRequest(uVar, i8));
        ResponseBody body = load.body();
        if (!load.isSuccessful()) {
            body.close();
            throw new ResponseException(load.code(), uVar.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = load.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && body.contentLength() == 0) {
            body.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && body.contentLength() > 0) {
            this.stats.dispatchDownloadFinished(body.contentLength());
        }
        return new w.a(body.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.w
    boolean shouldRetry(boolean z7, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.w
    boolean supportsReplay() {
        return true;
    }
}
