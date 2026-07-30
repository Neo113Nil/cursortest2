package com.drake.net.utils;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.ByteString;
import okio.j0;
import okio.x0;
import y5.w;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: com.drake.net.utils.a$a, reason: collision with other inner class name */
    public static final class C0262a extends RequestBody {
        final /* synthetic */ MediaType $fileMediaType;
        final /* synthetic */ File $this_toRequestBody;

        C0262a(MediaType mediaType, File file) {
            this.$fileMediaType = mediaType;
            this.$this_toRequestBody = file;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.$this_toRequestBody.length();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.$fileMediaType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.d sink) {
            s.checkNotNullParameter(sink, "sink");
            x0 source = j0.source(this.$this_toRequestBody);
            try {
                sink.writeAll(source);
                kotlin.io.b.closeFinally(source, null);
            } finally {
            }
        }
    }

    public static final String md5(File file, boolean z7) {
        s.checkNotNullParameter(file, "<this>");
        try {
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(file), MessageDigest.getInstance("MD5"));
            do {
                try {
                } finally {
                }
            } while (digestInputStream.read(new byte[262144]) > 0);
            w wVar = w.INSTANCE;
            kotlin.io.b.closeFinally(digestInputStream, null);
            byte[] md5 = digestInputStream.getMessageDigest().digest();
            if (z7) {
                ByteString.a aVar = ByteString.Companion;
                s.checkNotNullExpressionValue(md5, "md5");
                return ByteString.a.of$default(aVar, md5, 0, 0, 3, null).base64();
            }
            ByteString.a aVar2 = ByteString.Companion;
            s.checkNotNullExpressionValue(md5, "md5");
            return ByteString.a.of$default(aVar2, md5, 0, 0, 3, null).hex();
        } catch (IOException e8) {
            com.drake.net.a.debug(e8);
            return null;
        }
    }

    public static /* synthetic */ String md5$default(File file, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return md5(file, z7);
    }

    public static final MediaType mediaType(File file) {
        s.checkNotNullParameter(file, "<this>");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath()));
        if (mimeTypeFromExtension != null) {
            return MediaType.Companion.parse(mimeTypeFromExtension);
        }
        return null;
    }

    public static final RequestBody toRequestBody(File file, MediaType mediaType) {
        s.checkNotNullParameter(file, "<this>");
        if (mediaType == null) {
            mediaType = mediaType(file);
        }
        return new C0262a(mediaType, file);
    }

    public static /* synthetic */ RequestBody toRequestBody$default(File file, MediaType mediaType, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mediaType = null;
        }
        return toRequestBody(file, mediaType);
    }
}
