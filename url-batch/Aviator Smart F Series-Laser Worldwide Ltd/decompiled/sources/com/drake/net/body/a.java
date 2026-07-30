package com.drake.net.body;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;
import kotlin.text.j;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.c;
import okio.e;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String fileName(MultipartBody.Part part) {
        String str;
        j find$default;
        List<String> groupValues;
        s.checkNotNullParameter(part, "<this>");
        Headers headers = part.headers();
        if (headers == null || (str = headers.get("Content-Disposition")) == null || (find$default = Regex.find$default(new Regex(";\\sfilename=\"(.+?)\""), str, 0, 2, null)) == null || (groupValues = find$default.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt___CollectionsKt.getOrNull(groupValues, 1);
    }

    public static final String name(MultipartBody.Part part) {
        String str;
        j find$default;
        List<String> groupValues;
        s.checkNotNullParameter(part, "<this>");
        Headers headers = part.headers();
        if (headers == null || (str = headers.get("Content-Disposition")) == null || (find$default = Regex.find$default(new Regex(";\\sname=\"(.+?)\""), str, 0, 2, null)) == null || (groupValues = find$default.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt___CollectionsKt.getOrNull(groupValues, 1);
    }

    public static final ByteString peekBytes(RequestBody requestBody, long j8) {
        s.checkNotNullParameter(requestBody, "<this>");
        c cVar = new c();
        requestBody.writeTo(cVar);
        return cVar.readByteString(j8 < 0 ? cVar.size() : Math.min(cVar.size(), j8));
    }

    public static /* synthetic */ ByteString peekBytes$default(RequestBody requestBody, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return peekBytes(requestBody, j8);
    }

    public static final NetRequestBody toNetRequestBody(RequestBody requestBody, ConcurrentLinkedQueue<com.drake.net.interfaces.c> concurrentLinkedQueue) {
        s.checkNotNullParameter(requestBody, "<this>");
        return new NetRequestBody(requestBody, concurrentLinkedQueue);
    }

    public static /* synthetic */ NetRequestBody toNetRequestBody$default(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            concurrentLinkedQueue = null;
        }
        return toNetRequestBody(requestBody, concurrentLinkedQueue);
    }

    public static final NetResponseBody toNetResponseBody(ResponseBody responseBody, ConcurrentLinkedQueue<com.drake.net.interfaces.c> concurrentLinkedQueue, f6.a aVar) {
        s.checkNotNullParameter(responseBody, "<this>");
        return new NetResponseBody(responseBody, concurrentLinkedQueue, aVar);
    }

    public static /* synthetic */ NetResponseBody toNetResponseBody$default(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, f6.a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            concurrentLinkedQueue = null;
        }
        if ((i8 & 2) != 0) {
            aVar = null;
        }
        return toNetResponseBody(responseBody, concurrentLinkedQueue, aVar);
    }

    public static final String value(MultipartBody.Part part) {
        s.checkNotNullParameter(part, "<this>");
        String fileName = fileName(part);
        return fileName == null ? peekBytes$default(part.body(), 0L, 1, (Object) null).utf8() : fileName;
    }

    public static /* synthetic */ ByteString peekBytes$default(ResponseBody responseBody, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return peekBytes(responseBody, j8);
    }

    public static final ByteString peekBytes(ResponseBody responseBody, long j8) {
        s.checkNotNullParameter(responseBody, "<this>");
        e peek = responseBody.source().peek();
        peek.request(j8);
        return peek.readByteString(j8 < 0 ? peek.getBuffer().size() : Math.min(j8, peek.getBuffer().size()));
    }
}
