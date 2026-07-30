package r4;

import androidx.exifinterface.media.ExifInterface;
import com.drake.net.tag.NetTag$DownloadListeners;
import com.drake.net.tag.NetTag$Extras;
import com.drake.net.tag.NetTag$UploadListeners;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.s;
import kotlin.reflect.q;
import okhttp3.Headers;
import okhttp3.OkHttpUtils;
import okhttp3.Request;
import t4.i;
import t4.j;
import t4.k;

/* loaded from: classes3.dex */
public abstract class d {
    public static final ConcurrentLinkedQueue<com.drake.net.interfaces.c> downloadListeners(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(NetTag$DownloadListeners.class);
        if (!(obj instanceof NetTag$DownloadListeners)) {
            obj = null;
        }
        NetTag$DownloadListeners netTag$DownloadListeners = (NetTag$DownloadListeners) obj;
        if (netTag$DownloadListeners != null) {
            return netTag$DownloadListeners;
        }
        NetTag$DownloadListeners netTag$DownloadListeners2 = new NetTag$DownloadListeners();
        builder.tag(NetTag$DownloadListeners.class, netTag$DownloadListeners2);
        return netTag$DownloadListeners2;
    }

    public static final HashMap<String, Object> extras(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(NetTag$Extras.class);
        if (!(obj instanceof NetTag$Extras)) {
            obj = null;
        }
        NetTag$Extras netTag$Extras = (NetTag$Extras) obj;
        if (netTag$Extras != null) {
            return netTag$Extras;
        }
        NetTag$Extras netTag$Extras2 = new NetTag$Extras();
        builder.tag(NetTag$Extras.class, netTag$Extras2);
        return netTag$Extras2;
    }

    public static final Object getGroup(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(i.class);
        if (!(obj instanceof i)) {
            obj = null;
        }
        i iVar = (i) obj;
        Object m1534unboximpl = iVar != null ? iVar.m1534unboximpl() : null;
        if (m1534unboximpl == null) {
            return null;
        }
        return m1534unboximpl;
    }

    public static final Object getId(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(j.class);
        if (!(obj instanceof j)) {
            obj = null;
        }
        j jVar = (j) obj;
        Object m1541unboximpl = jVar != null ? jVar.m1541unboximpl() : null;
        if (m1541unboximpl == null) {
            return null;
        }
        return m1541unboximpl;
    }

    public static final q getKType(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(k.class);
        if (!(obj instanceof k)) {
            obj = null;
        }
        k kVar = (k) obj;
        q m1548unboximpl = kVar != null ? kVar.m1548unboximpl() : null;
        if (m1548unboximpl == null) {
            return null;
        }
        return m1548unboximpl;
    }

    public static final Headers.Builder headers(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Headers.Builder headers = OkHttpUtils.headers(builder);
        s.checkNotNullExpressionValue(headers, "headers(this)");
        return headers;
    }

    public static final Request.Builder setConverter(Request.Builder builder, com.drake.net.convert.a converter) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(converter, "converter");
        builder.tag(com.drake.net.convert.a.class, converter);
        return builder;
    }

    public static final Request.Builder setExtra(Request.Builder builder, String name, Object obj) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(name, "name");
        HashMap<String, Object> extras = extras(builder);
        if (obj == null) {
            extras.remove(name);
        } else {
            extras.put(name, obj);
        }
        return builder;
    }

    public static final void setGroup(Request.Builder builder, Object obj) {
        s.checkNotNullParameter(builder, "<this>");
        Object m1529constructorimpl = obj != null ? i.m1529constructorimpl(obj) : null;
        builder.tag(i.class, m1529constructorimpl != null ? i.m1528boximpl(m1529constructorimpl) : null);
    }

    public static final void setId(Request.Builder builder, Object obj) {
        s.checkNotNullParameter(builder, "<this>");
        Object m1536constructorimpl = obj != null ? j.m1536constructorimpl(obj) : null;
        builder.tag(j.class, m1536constructorimpl != null ? j.m1535boximpl(m1536constructorimpl) : null);
    }

    public static final void setKType(Request.Builder builder, q qVar) {
        s.checkNotNullParameter(builder, "<this>");
        q m1543constructorimpl = qVar != null ? k.m1543constructorimpl(qVar) : null;
        builder.tag(k.class, m1543constructorimpl != null ? k.m1542boximpl(m1543constructorimpl) : null);
    }

    public static final /* synthetic */ <T> T tagOf(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Map<Class<?>, Object> tags = tags(builder);
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t7 = (T) tags.get(Object.class);
        s.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t7;
    }

    public static final Map<Class<?>, Object> tags(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Map<Class<?>, Object> tags = OkHttpUtils.tags(builder);
        s.checkNotNullExpressionValue(tags, "tags(this)");
        return tags;
    }

    public static final ConcurrentLinkedQueue<com.drake.net.interfaces.c> uploadListeners(Request.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        Object obj = tags(builder).get(NetTag$UploadListeners.class);
        if (!(obj instanceof NetTag$UploadListeners)) {
            obj = null;
        }
        NetTag$UploadListeners netTag$UploadListeners = (NetTag$UploadListeners) obj;
        if (netTag$UploadListeners != null) {
            return netTag$UploadListeners;
        }
        NetTag$UploadListeners netTag$UploadListeners2 = new NetTag$UploadListeners();
        builder.tag(NetTag$UploadListeners.class, netTag$UploadListeners2);
        return netTag$UploadListeners2;
    }

    public static final /* synthetic */ <T> Request.Builder tagOf(Request.Builder builder, T t7) {
        s.checkNotNullParameter(builder, "<this>");
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        builder.tag(Object.class, t7);
        return builder;
    }
}
