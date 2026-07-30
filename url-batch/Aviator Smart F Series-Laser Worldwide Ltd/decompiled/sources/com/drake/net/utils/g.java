package com.drake.net.utils;

import android.content.ContentResolver;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.documentfile.provider.DocumentFile;
import com.drake.net.NetConfig;
import java.io.InputStream;
import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.j0;

/* loaded from: classes3.dex */
public abstract class g {

    public static final class a extends RequestBody {
        final /* synthetic */ long $contentLength;
        final /* synthetic */ ContentResolver $contentResolver;
        final /* synthetic */ MediaType $contentType;
        final /* synthetic */ Uri $this_toRequestBody;

        a(MediaType mediaType, long j8, ContentResolver contentResolver, Uri uri) {
            this.$contentType = mediaType;
            this.$contentLength = j8;
            this.$contentResolver = contentResolver;
            this.$this_toRequestBody = uri;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.$contentLength;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.$contentType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.d sink) {
            s.checkNotNullParameter(sink, "sink");
            InputStream openInputStream = this.$contentResolver.openInputStream(this.$this_toRequestBody);
            if (openInputStream != null) {
                try {
                    sink.writeAll(j0.source(openInputStream));
                    kotlin.io.b.closeFinally(openInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.b.closeFinally(openInputStream, th);
                        throw th2;
                    }
                }
            }
        }
    }

    public static final String fileName(Uri uri) {
        s.checkNotNullParameter(uri, "<this>");
        DocumentFile fromSingleUri = DocumentFile.fromSingleUri(NetConfig.INSTANCE.getApp(), uri);
        if (fromSingleUri != null) {
            return fromSingleUri.getName();
        }
        return null;
    }

    public static final MediaType mediaType(Uri uri) {
        s.checkNotNullParameter(uri, "<this>");
        DocumentFile fromSingleUri = DocumentFile.fromSingleUri(NetConfig.INSTANCE.getApp(), uri);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(fromSingleUri != null ? fromSingleUri.getName() : null));
        if (mimeTypeFromExtension != null) {
            return MediaType.Companion.parse(mimeTypeFromExtension);
        }
        return null;
    }

    public static final RequestBody toRequestBody(Uri uri) {
        s.checkNotNullParameter(uri, "<this>");
        NetConfig netConfig = NetConfig.INSTANCE;
        DocumentFile fromSingleUri = DocumentFile.fromSingleUri(netConfig.getApp(), uri);
        return new a(mediaType(uri), fromSingleUri != null ? fromSingleUri.length() : -1L, netConfig.getApp().getContentResolver(), uri);
    }
}
