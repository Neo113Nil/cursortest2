package org.apache.a.f;

import android.support.v7.widget.helper.ItemTouchHelper;
import com.tapjoy.TJAdUnitConstants;
import org.apache.a.ab;

/* compiled from: EnglishReasonPhraseCatalog.java */
/* loaded from: classes2.dex */
public class d implements ab {

    /* renamed from: a, reason: collision with root package name */
    public static final d f9857a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final String[][] f9858b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        a(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, "OK");
        a(201, "Created");
        a(202, "Accepted");
        a(204, "No Content");
        a(301, "Moved Permanently");
        a(302, "Moved Temporarily");
        a(304, "Not Modified");
        a(400, "Bad Request");
        a(401, "Unauthorized");
        a(403, "Forbidden");
        a(404, "Not Found");
        a(TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, "Internal Server Error");
        a(501, "Not Implemented");
        a(502, "Bad Gateway");
        a(503, "Service Unavailable");
        a(100, "Continue");
        a(307, "Temporary Redirect");
        a(405, "Method Not Allowed");
        a(409, "Conflict");
        a(412, "Precondition Failed");
        a(413, "Request Too Long");
        a(414, "Request-URI Too Long");
        a(415, "Unsupported Media Type");
        a(300, "Multiple Choices");
        a(303, "See Other");
        a(305, "Use Proxy");
        a(402, "Payment Required");
        a(406, "Not Acceptable");
        a(407, "Proxy Authentication Required");
        a(408, "Request Timeout");
        a(101, "Switching Protocols");
        a(203, "Non Authoritative Information");
        a(205, "Reset Content");
        a(206, "Partial Content");
        a(504, "Gateway Timeout");
        a(505, "Http Version Not Supported");
        a(410, "Gone");
        a(411, "Length Required");
        a(416, "Requested Range Not Satisfiable");
        a(417, "Expectation Failed");
        a(102, "Processing");
        a(207, "Multi-Status");
        a(422, "Unprocessable Entity");
        a(419, "Insufficient Space On Resource");
        a(420, "Method Failure");
        a(423, "Locked");
        a(507, "Insufficient Storage");
        a(424, "Failed Dependency");
    }

    protected d() {
    }

    private static void a(int i, String str) {
        int i2 = i / 100;
        f9858b[i2][i - (i2 * 100)] = str;
    }
}
