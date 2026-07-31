package com.facebook.react.devsupport;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: MultipartStreamReader.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J8\u0010\u0016\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader;", "", "source", "Lokio/BufferedSource;", "boundary", "", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "lastProgressEvent", "", "readAllParts", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "parseHeaders", "", "data", "Lokio/Buffer;", "emitChunk", "", "chunk", "done", "emitProgress", "headers", "contentLength", "isFinal", "ChunkListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String boundary;
    private long lastProgressEvent;
    private final BufferedSource source;

    /* compiled from: MultipartStreamReader.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "", "onChunkComplete", "", "headers", "", "", "body", "Lokio/Buffer;", "isLastChunk", "", "onChunkProgress", "loaded", "", "total", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ChunkListener {
        void onChunkComplete(Map<String, String> headers, Buffer body, boolean isLastChunk) throws IOException;

        void onChunkProgress(Map<String, String> headers, long loaded, long total) throws IOException;
    }

    public MultipartStreamReader(BufferedSource source, String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean readAllParts(ChunkListener listener) throws IOException {
        boolean z;
        long j;
        Map<String, String> map;
        ChunkListener listener2 = listener;
        Intrinsics.checkNotNullParameter(listener2, "listener");
        ByteString m5758deprecated_encodeUtf8 = ByteString.INSTANCE.m5758deprecated_encodeUtf8("\r\n--" + this.boundary + "\r\n");
        ByteString m5758deprecated_encodeUtf82 = ByteString.INSTANCE.m5758deprecated_encodeUtf8("\r\n--" + this.boundary + "--\r\n");
        ByteString m5758deprecated_encodeUtf83 = ByteString.INSTANCE.m5758deprecated_encodeUtf8("\r\n\r\n");
        Buffer buffer = new Buffer();
        Map<String, String> map2 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            long max = (long) Math.max(j2 - m5758deprecated_encodeUtf82.m5754deprecated_size(), j3);
            long indexOf = buffer.indexOf(m5758deprecated_encodeUtf8, max);
            if (indexOf == -1) {
                indexOf = buffer.indexOf(m5758deprecated_encodeUtf82, max);
                z = true;
            } else {
                z = false;
            }
            if (indexOf == -1) {
                long size = buffer.getSize();
                if (map2 == null) {
                    long indexOf2 = buffer.indexOf(m5758deprecated_encodeUtf83, max);
                    if (indexOf2 >= 0) {
                        this.source.read(buffer, indexOf2);
                        Buffer buffer2 = new Buffer();
                        buffer.copyTo(buffer2, max, indexOf2 - max);
                        j4 = m5758deprecated_encodeUtf83.m5754deprecated_size() + buffer2.getSize();
                        map2 = parseHeaders(buffer2);
                        j = j3;
                        if (this.source.read(buffer, 4096) > 0) {
                            return false;
                        }
                        listener2 = listener;
                        j3 = j;
                        j2 = size;
                    } else {
                        j = j3;
                        map = map2;
                    }
                } else {
                    j = j3;
                    map = map2;
                    emitProgress(map, buffer.getSize() - j4, false, listener2);
                }
                map2 = map;
                if (this.source.read(buffer, 4096) > 0) {
                }
            } else {
                long j5 = j3;
                Map<String, String> map3 = map2;
                long j6 = indexOf - j5;
                if (j5 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(j5);
                    buffer.read(buffer3, j6);
                    listener2 = listener;
                    emitProgress(map3, buffer3.getSize() - j4, true, listener2);
                    emitChunk(buffer3, z, listener2);
                    map2 = null;
                    j4 = 0;
                } else {
                    listener2 = listener;
                    buffer.skip(indexOf);
                    map2 = map3;
                }
                if (z) {
                    return true;
                }
                j3 = m5758deprecated_encodeUtf8.m5754deprecated_size();
                j2 = j3;
            }
        }
    }

    private final Map<String, String> parseHeaders(Buffer data) {
        List emptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> split = new Regex("\r\n").split(data.readUtf8(), 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        for (String str : (String[]) emptyList.toArray(new String[0])) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, StringUtils.PROCESS_POSTFIX_DELIMITER, 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                String substring = str.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String str2 = substring;
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String obj = str2.subSequence(i, length + 1).toString();
                String substring2 = str.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                String str3 = substring2;
                int length2 = str3.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.compare((int) str3.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                linkedHashMap.put(obj, str3.subSequence(i2, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    private final void emitChunk(Buffer chunk, boolean done, ChunkListener listener) throws IOException {
        long indexOf = chunk.indexOf(ByteString.INSTANCE.m5758deprecated_encodeUtf8("\r\n\r\n"));
        if (indexOf == -1) {
            listener.onChunkComplete(MapsKt.emptyMap(), chunk, done);
            return;
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = new Buffer();
        chunk.read(buffer, indexOf);
        chunk.skip(r0.m5754deprecated_size());
        chunk.readAll(buffer2);
        listener.onChunkComplete(parseHeaders(buffer), buffer2, done);
    }

    private final void emitProgress(Map<String, String> headers, long contentLength, boolean isFinal, ChunkListener listener) throws IOException {
        if (listener == null || headers == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastProgressEvent > 16 || isFinal) {
            this.lastProgressEvent = currentTimeMillis;
            listener.onChunkProgress(headers, contentLength, Long.parseLong(headers.getOrDefault("Content-Length", CommonUrlParts.Values.FALSE_INTEGER)));
        }
    }
}
