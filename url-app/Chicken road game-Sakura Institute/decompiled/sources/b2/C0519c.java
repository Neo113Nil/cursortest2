package b2;

import g2.w;
import g2.y;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519c {

    /* renamed from: a, reason: collision with root package name */
    public final g2.h f5633a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.e f5634b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.h f5635c = l2.h.f7978f;

    public C0519c(g2.h hVar, g2.e eVar) {
        this.f5633a = hVar;
        this.f5634b = eVar;
    }

    public final void a(k kVar) {
        w wVar = new w(this.f5633a, kVar, new l2.i(this.f5634b, this.f5635c));
        y yVar = y.f6774b;
        synchronized (yVar.f6775a) {
            try {
                List list = (List) yVar.f6775a.get(wVar);
                if (list != null && !list.isEmpty()) {
                    if (wVar.f6769f.b()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            w wVar2 = (w) list.get(size);
                            if (!hashSet.contains(wVar2.f6769f)) {
                                hashSet.add(wVar2.f6769f);
                                wVar2.a();
                            }
                        }
                    } else {
                        ((w) list.get(0)).a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5633a.e(new i(this, wVar, 0));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0519c) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        g2.e eVar = this.f5634b;
        g2.e D3 = eVar.D();
        g2.h hVar = this.f5633a;
        C0519c c0519c = D3 != null ? new C0519c(hVar, D3) : null;
        if (c0519c == null) {
            return hVar.f6703a.toString();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(c0519c.toString());
            sb.append("/");
            sb.append(URLEncoder.encode(eVar.isEmpty() ? null : eVar.B().f8920d, "UTF-8").replace("+", "%20"));
            return sb.toString();
        } catch (UnsupportedEncodingException e4) {
            StringBuilder sb2 = new StringBuilder("Failed to URLEncode key: ");
            sb2.append(eVar.isEmpty() ? null : eVar.B().f8920d);
            throw new C0518b(sb2.toString(), e4);
        }
    }
}
