package g5;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import l5.w;
import l5.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l5.i f4458a;

    /* renamed from: b, reason: collision with root package name */
    public final l5.f f4459b;

    /* renamed from: c, reason: collision with root package name */
    public final q5.h f4460c = q5.h.f7529f;

    public c(l5.i iVar, l5.f fVar) {
        this.f4458a = iVar;
        this.f4459b = fVar;
    }

    public final void a(k kVar) {
        w wVar = new w(this.f4458a, kVar, new q5.i(this.f4459b, this.f4460c));
        y yVar = y.f6095b;
        synchronized (yVar.f6096a) {
            try {
                List list = (List) yVar.f6096a.get(wVar);
                if (list != null && !list.isEmpty()) {
                    if (wVar.f6090f.b()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            w wVar2 = (w) list.get(size);
                            if (!hashSet.contains(wVar2.f6090f)) {
                                hashSet.add(wVar2.f6090f);
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
        this.f4458a.e(new i(this, wVar, 0));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        l5.f fVar = this.f4459b;
        l5.f A = fVar.A();
        l5.i iVar = this.f4458a;
        c cVar = A != null ? new c(iVar, A) : null;
        if (cVar == null) {
            return iVar.f6032a.toString();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.toString());
            sb.append("/");
            sb.append(URLEncoder.encode(fVar.isEmpty() ? null : fVar.y().f8889f, "UTF-8").replace("+", "%20"));
            return sb.toString();
        } catch (UnsupportedEncodingException e9) {
            StringBuilder sb2 = new StringBuilder("Failed to URLEncode key: ");
            sb2.append(fVar.isEmpty() ? null : fVar.y().f8889f);
            throw new b(sb2.toString(), e9);
        }
    }
}
