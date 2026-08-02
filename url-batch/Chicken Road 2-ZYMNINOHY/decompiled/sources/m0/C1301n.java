package m0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import v2.C1453B;
import v2.C1472t;
import v2.C1474v;
import v2.J;
import v2.a0;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301n {

    /* renamed from: a, reason: collision with root package name */
    public final J f14421a;

    static {
        new C1301n(new e0.t(17));
    }

    public C1301n(e0.t tVar) {
        J j4;
        C1474v c1474v = (C1474v) ((e0.t) tVar.f8416a).f8416a;
        if (c1474v == null) {
            j4 = C1453B.f15558e;
        } else {
            Collection entrySet = c1474v.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                j4 = C1453B.f15558e;
            } else {
                C1472t c1472t = (C1472t) entrySet;
                L3.h hVar = new L3.h(c1472t.f15675b.size());
                Iterator it = c1472t.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    a0 f4 = ((v2.F) entry.getValue()).f();
                    hVar.d(key, f4);
                    i4 += f4.f15607d;
                }
                j4 = new J(hVar.a(true), i4);
            }
        }
        this.f14421a = j4;
    }

    public static String a(String str) {
        return U.i.h(str, "Accept") ? "Accept" : U.i.h(str, "Allow") ? "Allow" : U.i.h(str, "Authorization") ? "Authorization" : U.i.h(str, "Bandwidth") ? "Bandwidth" : U.i.h(str, "Blocksize") ? "Blocksize" : U.i.h(str, "Cache-Control") ? "Cache-Control" : U.i.h(str, "Connection") ? "Connection" : U.i.h(str, "Content-Base") ? "Content-Base" : U.i.h(str, "Content-Encoding") ? "Content-Encoding" : U.i.h(str, "Content-Language") ? "Content-Language" : U.i.h(str, "Content-Length") ? "Content-Length" : U.i.h(str, "Content-Location") ? "Content-Location" : U.i.h(str, "Content-Type") ? "Content-Type" : U.i.h(str, "CSeq") ? "CSeq" : U.i.h(str, "Date") ? "Date" : U.i.h(str, "Expires") ? "Expires" : U.i.h(str, "Location") ? "Location" : U.i.h(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : U.i.h(str, "Proxy-Require") ? "Proxy-Require" : U.i.h(str, "Public") ? "Public" : U.i.h(str, "Range") ? "Range" : U.i.h(str, "RTP-Info") ? "RTP-Info" : U.i.h(str, "RTCP-Interval") ? "RTCP-Interval" : U.i.h(str, "Scale") ? "Scale" : U.i.h(str, "Session") ? "Session" : U.i.h(str, "Speed") ? "Speed" : U.i.h(str, "Supported") ? "Supported" : U.i.h(str, "Timestamp") ? "Timestamp" : U.i.h(str, "Transport") ? "Transport" : U.i.h(str, "User-Agent") ? "User-Agent" : U.i.h(str, "Via") ? "Via" : U.i.h(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        v2.I g4 = this.f14421a.g(a(str));
        if (g4.isEmpty()) {
            return null;
        }
        return (String) v2.r.j(g4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1301n) {
            return this.f14421a.equals(((C1301n) obj).f14421a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14421a.hashCode();
    }
}
