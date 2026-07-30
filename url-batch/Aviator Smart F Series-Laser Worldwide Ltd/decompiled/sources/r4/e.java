package r4;

import androidx.exifinterface.media.ExifInterface;
import com.drake.net.NetConfig;
import com.drake.net.tag.NetTag$DownloadListeners;
import com.drake.net.tag.NetTag$Extras;
import com.drake.net.tag.NetTag$UploadListeners;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.s;
import kotlin.reflect.q;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import t4.g;
import t4.h;
import t4.i;
import t4.j;
import t4.k;

/* loaded from: classes3.dex */
public abstract class e {
    public static final com.drake.net.convert.a converter(Request request) {
        s.checkNotNullParameter(request, "<this>");
        com.drake.net.convert.a aVar = (com.drake.net.convert.a) request.tag(com.drake.net.convert.a.class);
        return aVar == null ? NetConfig.INSTANCE.getConverter() : aVar;
    }

    public static final boolean downloadConflictRename(Request request) {
        s.checkNotNullParameter(request, "<this>");
        t4.c cVar = (t4.c) request.tag(t4.c.class);
        return cVar != null && cVar.m1488unboximpl();
    }

    public static final String downloadFileDir(Request request) {
        s.checkNotNullParameter(request, "<this>");
        t4.d dVar = (t4.d) request.tag(t4.d.class);
        String m1496unboximpl = dVar != null ? dVar.m1496unboximpl() : null;
        if (m1496unboximpl != null) {
            return m1496unboximpl;
        }
        String absolutePath = NetConfig.INSTANCE.getApp().getFilesDir().getAbsolutePath();
        s.checkNotNullExpressionValue(absolutePath, "NetConfig.app.filesDir.absolutePath");
        return absolutePath;
    }

    public static final String downloadFileName(Request request) {
        s.checkNotNullParameter(request, "<this>");
        t4.f fVar = (t4.f) request.tag(t4.f.class);
        String m1511unboximpl = fVar != null ? fVar.m1511unboximpl() : null;
        if (m1511unboximpl == null) {
            return null;
        }
        return m1511unboximpl;
    }

    public static final boolean downloadFileNameDecode(Request request) {
        s.checkNotNullParameter(request, "<this>");
        g gVar = (g) request.tag(g.class);
        return gVar != null && gVar.m1519unboximpl();
    }

    public static final ConcurrentLinkedQueue<com.drake.net.interfaces.c> downloadListeners(Request request) {
        s.checkNotNullParameter(request, "<this>");
        NetTag$DownloadListeners netTag$DownloadListeners = (NetTag$DownloadListeners) request.tag(NetTag$DownloadListeners.class);
        if (netTag$DownloadListeners != null) {
            return netTag$DownloadListeners;
        }
        NetTag$DownloadListeners netTag$DownloadListeners2 = new NetTag$DownloadListeners();
        tags(request).put(NetTag$DownloadListeners.class, netTag$DownloadListeners2);
        return netTag$DownloadListeners2;
    }

    public static final boolean downloadMd5Verify(Request request) {
        s.checkNotNullParameter(request, "<this>");
        t4.e eVar = (t4.e) request.tag(t4.e.class);
        return eVar != null && eVar.m1504unboximpl();
    }

    public static final boolean downloadTempFile(Request request) {
        s.checkNotNullParameter(request, "<this>");
        h hVar = (h) request.tag(h.class);
        return hVar != null && hVar.m1527unboximpl();
    }

    public static final Object extra(Request request, String name) {
        s.checkNotNullParameter(request, "<this>");
        s.checkNotNullParameter(name, "name");
        NetTag$Extras netTag$Extras = (NetTag$Extras) request.tag(NetTag$Extras.class);
        if (netTag$Extras != null) {
            return netTag$Extras.get((Object) name);
        }
        return null;
    }

    public static final HashMap<String, Object> extras(Request request) {
        s.checkNotNullParameter(request, "<this>");
        Map<Class<?>, Object> tags = tags(request);
        NetTag$Extras netTag$Extras = (NetTag$Extras) tags.get(NetTag$Extras.class);
        if (netTag$Extras != null) {
            return netTag$Extras;
        }
        NetTag$Extras netTag$Extras2 = new NetTag$Extras();
        tags.put(NetTag$Extras.class, netTag$Extras2);
        return netTag$Extras2;
    }

    public static final Object getGroup(Request request) {
        s.checkNotNullParameter(request, "<this>");
        i iVar = (i) request.tag(i.class);
        Object m1534unboximpl = iVar != null ? iVar.m1534unboximpl() : null;
        if (m1534unboximpl == null) {
            return null;
        }
        return m1534unboximpl;
    }

    public static final Object getId(Request request) {
        s.checkNotNullParameter(request, "<this>");
        j jVar = (j) request.tag(j.class);
        Object m1541unboximpl = jVar != null ? jVar.m1541unboximpl() : null;
        if (m1541unboximpl == null) {
            return null;
        }
        return m1541unboximpl;
    }

    public static final q getKType(Request request) {
        s.checkNotNullParameter(request, "<this>");
        k kVar = (k) request.tag(k.class);
        q m1548unboximpl = kVar != null ? kVar.m1548unboximpl() : null;
        if (m1548unboximpl == null) {
            return null;
        }
        return m1548unboximpl;
    }

    public static final void setGroup(Request request, Object obj) {
        s.checkNotNullParameter(request, "<this>");
        Object m1529constructorimpl = obj != null ? i.m1529constructorimpl(obj) : null;
        i m1528boximpl = m1529constructorimpl != null ? i.m1528boximpl(m1529constructorimpl) : null;
        if (m1528boximpl == null) {
            tags(request).remove(i.class);
        } else {
            tags(request).put(i.class, m1528boximpl);
        }
    }

    public static final void setId(Request request, Object obj) {
        s.checkNotNullParameter(request, "<this>");
        Object m1536constructorimpl = obj != null ? j.m1536constructorimpl(obj) : null;
        j m1535boximpl = m1536constructorimpl != null ? j.m1535boximpl(m1536constructorimpl) : null;
        if (m1535boximpl == null) {
            tags(request).remove(j.class);
        } else {
            tags(request).put(j.class, m1535boximpl);
        }
    }

    public static final void setKType(Request request, q qVar) {
        s.checkNotNullParameter(request, "<this>");
        q m1543constructorimpl = qVar != null ? k.m1543constructorimpl(qVar) : null;
        k m1542boximpl = m1543constructorimpl != null ? k.m1542boximpl(m1543constructorimpl) : null;
        if (m1542boximpl == null) {
            tags(request).remove(k.class);
        } else {
            tags(request).put(k.class, m1542boximpl);
        }
    }

    public static final /* synthetic */ <T> T tagOf(Request request) {
        s.checkNotNullParameter(request, "<this>");
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) request.tag(Object.class);
    }

    public static final Map<Class<?>, Object> tags(Request request) {
        s.checkNotNullParameter(request, "<this>");
        Map<Class<?>, Object> tags = OkHttpUtils.tags(request);
        s.checkNotNullExpressionValue(tags, "tags(this)");
        return tags;
    }

    public static final ConcurrentLinkedQueue<com.drake.net.interfaces.c> uploadListeners(Request request) {
        s.checkNotNullParameter(request, "<this>");
        NetTag$UploadListeners netTag$UploadListeners = (NetTag$UploadListeners) request.tag(NetTag$UploadListeners.class);
        if (netTag$UploadListeners != null) {
            return netTag$UploadListeners;
        }
        NetTag$UploadListeners netTag$UploadListeners2 = new NetTag$UploadListeners();
        tags(request).put(NetTag$UploadListeners.class, netTag$UploadListeners2);
        return netTag$UploadListeners2;
    }

    public static final /* synthetic */ <T> Request tagOf(Request request, T t7) {
        s.checkNotNullParameter(request, "<this>");
        if (t7 == null) {
            Map<Class<?>, Object> tags = tags(request);
            s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            tags.remove(Object.class);
        } else {
            Map<Class<?>, Object> tags2 = tags(request);
            s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            tags2.put(Object.class, t7);
        }
        return request;
    }
}
