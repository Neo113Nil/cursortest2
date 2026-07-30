package s4;

import com.drake.net.exception.ConvertException;
import com.drake.net.exception.DownloadFileException;
import com.drake.net.exception.NetException;
import com.drake.net.interfaces.c;
import com.drake.net.tag.NetTag$DownloadListeners;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.lang.reflect.Type;
import java.net.SocketException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.io.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.s;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.q;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.d;
import okio.j0;
import okio.k0;
import r4.e;
import y5.w;

/* loaded from: classes3.dex */
public abstract class a {
    public static final /* synthetic */ <R> R convert(Response response) {
        s.checkNotNullParameter(response, "<this>");
        try {
            com.drake.net.convert.a converter = e.converter(response.request());
            s.reifiedOperationMarker(6, "R");
            R r8 = (R) converter.onConvert(TypesJVMKt.getJavaType((q) null), response);
            s.reifiedOperationMarker(1, "R");
            return r8;
        } catch (NetException e8) {
            throw e8;
        } catch (CancellationException e9) {
            throw e9;
        } catch (Throwable th) {
            throw new ConvertException(response, "An unexpected error occurred in the converter", th, null, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
    public static final File file(Response response) {
        ?? substringBeforeLast$default;
        String substringAfterLast$default;
        String str;
        ?? r12;
        okio.e source;
        String extension;
        String nameWithoutExtension;
        String header$default;
        s.checkNotNullParameter(response, "<this>");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = e.downloadFileDir(response.request());
        File file = new File((String) ref$ObjectRef.element);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        if (file.isDirectory()) {
            String fileName = fileName(response);
            str = fileName;
            r12 = new File((String) ref$ObjectRef.element, fileName);
        } else {
            T t7 = ref$ObjectRef.element;
            String str2 = (String) t7;
            char c8 = File.separatorChar;
            substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default((String) t7, c8, (String) null, 2, (Object) null);
            ref$ObjectRef.element = substringBeforeLast$default;
            substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(str2, c8, (String) null, 2, (Object) null);
            str = substringAfterLast$default;
            r12 = file;
        }
        ref$ObjectRef2.element = r12;
        try {
            if (r12.exists()) {
                if (e.downloadMd5Verify(response.request()) && (header$default = Response.header$default(response, HttpHeaders.CONTENT_MD5, null, 2, null)) != null && s.areEqual(com.drake.net.utils.a.md5((File) ref$ObjectRef2.element, true), header$default)) {
                    NetTag$DownloadListeners netTag$DownloadListeners = (NetTag$DownloadListeners) response.request().tag(NetTag$DownloadListeners.class);
                    if (netTag$DownloadListeners != null && !netTag$DownloadListeners.isEmpty()) {
                        long length = ((File) ref$ObjectRef2.element).length();
                        p4.a aVar = new p4.a();
                        aVar.setCurrentByteCount$net_release(length);
                        aVar.setTotalByteCount$net_release(length);
                        aVar.setIntervalByteCount$net_release(length);
                        aVar.setFinish$net_release(true);
                        Iterator<c> it = netTag$DownloadListeners.iterator();
                        while (it.hasNext()) {
                            it.next().onProgress(aVar);
                        }
                    }
                    return (File) ref$ObjectRef2.element;
                }
                if (e.downloadConflictRename(response.request()) && s.areEqual(((File) ref$ObjectRef2.element).getName(), str)) {
                    extension = FilesKt__UtilsKt.getExtension((File) ref$ObjectRef2.element);
                    nameWithoutExtension = FilesKt__UtilsKt.getNameWithoutExtension((File) ref$ObjectRef2.element);
                    ref$ObjectRef2.element = file$rename(ref$ObjectRef2, ref$ObjectRef, nameWithoutExtension, extension, 1L);
                }
            }
            if (e.downloadTempFile(response.request())) {
                ref$ObjectRef2.element = new File((String) ref$ObjectRef.element, ((File) ref$ObjectRef2.element).getName() + ".downloading");
            }
            ResponseBody body = response.body();
            if (body != null && (source = body.source()) != null) {
                if (!((File) ref$ObjectRef2.element).exists()) {
                    ((File) ref$ObjectRef2.element).createNewFile();
                }
                d buffer = j0.buffer(k0.sink$default((File) ref$ObjectRef2.element, false, 1, null));
                try {
                    buffer.writeAll(source);
                    Util.closeQuietly(source);
                    w wVar = w.INSTANCE;
                    b.closeFinally(buffer, null);
                    if (!e.downloadTempFile(response.request())) {
                        return (File) ref$ObjectRef2.element;
                    }
                    File file2 = new File((String) ref$ObjectRef.element, str);
                    ((File) ref$ObjectRef2.element).renameTo(file2);
                    return file2;
                } finally {
                }
            }
            return null;
        } catch (SocketException e8) {
            if (e.downloadTempFile(response.request())) {
                ((File) ref$ObjectRef2.element).delete();
            }
            CancellationException cancellationException = new CancellationException(e8.toString());
            cancellationException.initCause(e8);
            throw cancellationException;
        } catch (Exception e9) {
            throw new DownloadFileException(response, null, e9, null, 10, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.io.File] */
    private static final File file$rename(Ref$ObjectRef<File> ref$ObjectRef, Ref$ObjectRef<String> ref$ObjectRef2, String str, String str2, long j8) {
        ?? file = new File(ref$ObjectRef2.element, str + "_(" + j8 + ')' + str2);
        ref$ObjectRef.element = file;
        return file.exists() ? file$rename(ref$ObjectRef, ref$ObjectRef2, str, str2, j8 + 1) : ref$ObjectRef.element;
    }

    public static final String fileName(Response response) {
        String substringBefore$default;
        String trimStart;
        s.checkNotNullParameter(response, "<this>");
        String downloadFileName = e.downloadFileName(response.request());
        if (downloadFileName == null || t.isBlank(downloadFileName)) {
            downloadFileName = null;
        }
        if (downloadFileName != null) {
            return downloadFileName;
        }
        String header$default = Response.header$default(response, "Content-Disposition", null, 2, null);
        if (header$default != null) {
            String substringAfter = StringsKt__StringsKt.substringAfter(header$default, "filename=", "");
            if (t.isBlank(substringAfter)) {
                substringAfter = null;
            }
            if (substringAfter != null) {
                return substringAfter;
            }
            String substringAfter2 = StringsKt__StringsKt.substringAfter(header$default, "filename*=", "");
            char[] charArray = "UTF-8''".toCharArray();
            s.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
            trimStart = StringsKt__StringsKt.trimStart(substringAfter2, Arrays.copyOf(charArray, charArray.length));
            if (t.isBlank(trimStart)) {
                trimStart = null;
            }
            if (trimStart != null) {
                return trimStart;
            }
        }
        substringBefore$default = StringsKt__StringsKt.substringBefore$default((String) CollectionsKt___CollectionsKt.last((List) response.request().url().pathSegments()), "?", (String) null, 2, (Object) null);
        if (t.isBlank(substringBefore$default)) {
            return "unknown_" + System.currentTimeMillis();
        }
        if (e.downloadFileNameDecode(response.request())) {
            try {
                substringBefore$default = URLDecoder.decode(substringBefore$default, "UTF8");
            } catch (Exception unused) {
            }
        }
        s.checkNotNullExpressionValue(substringBefore$default, "{\n        if (request.do…    } else fileName\n    }");
        return substringBefore$default;
    }

    public static final <R> R convert(Response response, Type type) {
        s.checkNotNullParameter(response, "<this>");
        s.checkNotNullParameter(type, "type");
        try {
            return (R) e.converter(response.request()).onConvert(type, response);
        } catch (NetException e8) {
            throw e8;
        } catch (CancellationException e9) {
            throw e9;
        } catch (Throwable th) {
            throw new ConvertException(response, "An unexpected error occurred in the converter", th, null, 8, null);
        }
    }
}
