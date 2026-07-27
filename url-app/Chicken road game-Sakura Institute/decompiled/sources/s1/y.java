package s1;

import B1.C0097d;
import M2.C0249a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1439w;

/* loaded from: classes.dex */
public class y extends v implements Iterable, N2.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10585s = 0;

    /* renamed from: o, reason: collision with root package name */
    public final i.H f10586o;

    /* renamed from: p, reason: collision with root package name */
    public int f10587p;

    /* renamed from: q, reason: collision with root package name */
    public String f10588q;

    /* renamed from: r, reason: collision with root package name */
    public String f10589r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1182A navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f10586o = new i.H();
    }

    public final v B(String route, boolean z4) {
        Object obj;
        y yVar;
        Intrinsics.checkNotNullParameter(route, "route");
        i.H h4 = this.f10586o;
        Intrinsics.checkNotNullParameter(h4, "<this>");
        Iterator it = T2.n.b(new C0249a(1, h4)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v vVar = (v) obj;
            if (kotlin.text.u.i(false, vVar.f10576m, route) || vVar.w(route) != null) {
                break;
            }
        }
        v vVar2 = (v) obj;
        if (vVar2 != null) {
            return vVar2;
        }
        if (!z4 || (yVar = this.f10571e) == null || route == null || kotlin.text.y.x(route)) {
            return null;
        }
        return yVar.B(route, true);
    }

    public final v C(int i2, y yVar, boolean z4) {
        i.H h4 = this.f10586o;
        v vVar = (v) h4.b(i2);
        if (vVar != null) {
            return vVar;
        }
        if (z4) {
            Intrinsics.checkNotNullParameter(h4, "<this>");
            Iterator it = T2.n.b(new C0249a(1, h4)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    vVar = null;
                    break;
                }
                v vVar2 = (v) it.next();
                vVar = (!(vVar2 instanceof y) || Intrinsics.a(vVar2, yVar)) ? null : ((y) vVar2).C(i2, this, true);
                if (vVar != null) {
                    break;
                }
            }
        }
        if (vVar != null) {
            return vVar;
        }
        y yVar2 = this.f10571e;
        if (yVar2 == null || yVar2.equals(yVar)) {
            return null;
        }
        y yVar3 = this.f10571e;
        Intrinsics.c(yVar3);
        return yVar3.C(i2, this, z4);
    }

    public final u D(C0097d navDeepLinkRequest, boolean z4, boolean z5, v lastVisited) {
        u uVar;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        u s4 = super.s(navDeepLinkRequest);
        u uVar2 = null;
        if (z4) {
            ArrayList arrayList = new ArrayList();
            x xVar = new x(this);
            while (xVar.hasNext()) {
                v vVar = (v) xVar.next();
                u s5 = !Intrinsics.a(vVar, lastVisited) ? vVar.s(navDeepLinkRequest) : null;
                if (s5 != null) {
                    arrayList.add(s5);
                }
            }
            uVar = (u) C1403G.z(arrayList);
        } else {
            uVar = null;
        }
        y yVar = this.f10571e;
        if (yVar != null && z5 && !yVar.equals(lastVisited)) {
            uVar2 = yVar.D(navDeepLinkRequest, z4, true, this);
        }
        u[] elements = {s4, uVar, uVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (u) C1403G.z(C1439w.t(elements));
    }

    @Override // s1.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        if (super.equals(obj)) {
            i.H h4 = this.f10586o;
            int e4 = h4.e();
            y yVar = (y) obj;
            i.H h5 = yVar.f10586o;
            if (e4 == h5.e() && this.f10587p == yVar.f10587p) {
                Intrinsics.checkNotNullParameter(h4, "<this>");
                Iterator it = T2.n.b(new C0249a(1, h4)).iterator();
                while (it.hasNext()) {
                    v vVar = (v) it.next();
                    if (!vVar.equals(h5.b(vVar.f10575l))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // s1.v
    public final int hashCode() {
        int i2 = this.f10587p;
        i.H h4 = this.f10586o;
        int e4 = h4.e();
        for (int i4 = 0; i4 < e4; i4++) {
            i2 = (((i2 * 31) + h4.c(i4)) * 31) + ((v) h4.f(i4)).hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // s1.v
    public final u s(C0097d navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return D(navDeepLinkRequest, true, false, this);
    }

    @Override // s1.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f10589r;
        v B = (str == null || kotlin.text.y.x(str)) ? null : B(str, true);
        if (B == null) {
            B = C(this.f10587p, this, false);
        }
        sb.append(" startDestination=");
        if (B == null) {
            String str2 = this.f10589r;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f10588q;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f10587p));
                }
            }
        } else {
            sb.append("{");
            sb.append(B.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
