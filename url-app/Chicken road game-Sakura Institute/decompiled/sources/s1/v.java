package s1;

import B1.C0097d;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import s0.C1160o0;
import z2.C1403G;
import z2.C1441y;
import z2.C1442z;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10569n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f10570d;

    /* renamed from: e, reason: collision with root package name */
    public y f10571e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10572i;

    /* renamed from: j, reason: collision with root package name */
    public final i.H f10573j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f10574k;

    /* renamed from: l, reason: collision with root package name */
    public int f10575l;

    /* renamed from: m, reason: collision with root package name */
    public String f10576m;

    static {
        new LinkedHashMap();
    }

    public v(H navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        LinkedHashMap linkedHashMap = I.f10486b;
        String navigatorName = m3.s.m(navigator.getClass());
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f10570d = navigatorName;
        this.f10572i = new ArrayList();
        this.f10573j = new i.H();
        this.f10574k = new LinkedHashMap();
    }

    public final void e(t navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        ArrayList q2 = m3.z.q(this.f10574k, new C1160o0(4, navDeepLink));
        if (q2.isEmpty()) {
            this.f10572i.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f10552a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + q2).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z4;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        boolean a4 = Intrinsics.a(this.f10572i, vVar.f10572i);
        i.H h4 = this.f10573j;
        int e4 = h4.e();
        i.H h5 = vVar.f10573j;
        if (e4 == h5.e()) {
            Intrinsics.checkNotNullParameter(h4, "<this>");
            Iterator it = T2.n.b(new i.I(h4)).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!Intrinsics.a(h4.b(intValue), h5.b(intValue))) {
                }
            }
            z4 = true;
            LinkedHashMap linkedHashMap2 = this.f10574k;
            size = linkedHashMap2.size();
            linkedHashMap = vVar.f10574k;
            if (size == linkedHashMap.size()) {
                Intrinsics.checkNotNullParameter(linkedHashMap2, "<this>");
                Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
                Intrinsics.checkNotNullParameter(entrySet, "<this>");
                for (Map.Entry entry : entrySet) {
                    if (linkedHashMap.containsKey(entry.getKey()) && Intrinsics.a(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                    }
                }
                z5 = true;
                return this.f10575l != vVar.f10575l && Intrinsics.a(this.f10576m, vVar.f10576m) && a4 && z4 && z5;
            }
            z5 = false;
            if (this.f10575l != vVar.f10575l) {
            }
        }
        z4 = false;
        LinkedHashMap linkedHashMap22 = this.f10574k;
        size = linkedHashMap22.size();
        linkedHashMap = vVar.f10574k;
        if (size == linkedHashMap.size()) {
        }
        z5 = false;
        if (this.f10575l != vVar.f10575l) {
        }
    }

    public final Bundle h(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f10574k;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return bundle2;
    }

    public int hashCode() {
        int i2 = this.f10575l * 31;
        String str = this.f10576m;
        int hashCode = i2 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f10572i.iterator();
        while (it.hasNext()) {
            hashCode = (((t) it.next()).f10552a.hashCode() + (hashCode * 31)) * 961;
        }
        i.H h4 = this.f10573j;
        Intrinsics.checkNotNullParameter(h4, "<this>");
        if (h4.e() > 0) {
            h4.f(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f10574k;
        for (String str2 : linkedHashMap.keySet()) {
            int a4 = r0.B.a(str2, hashCode * 31, 31);
            Object obj = linkedHashMap.get(str2);
            hashCode = a4 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fb, code lost:
    
        if (m3.z.q(r1, new s1.s(r11, 0)).isEmpty() == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, y2.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u s(C0097d navDeepLinkRequest) {
        Bundle bundle;
        int i2;
        String mimeType;
        u uVar;
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        ArrayList arrayList = this.f10572i;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        u uVar2 = null;
        while (it.hasNext()) {
            t tVar = (t) it.next();
            LinkedHashMap arguments = this.f10574k;
            Uri deepLink = (Uri) navDeepLinkRequest.f987e;
            if (deepLink != null) {
                tVar.getClass();
                Intrinsics.checkNotNullParameter(deepLink, "deepLink");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                Pattern pattern = (Pattern) tVar.f10555d.getValue();
                Matcher matcher = pattern != null ? pattern.matcher(deepLink.toString()) : bundle2;
                if (matcher != 0 && matcher.matches()) {
                    bundle = new Bundle();
                    if (tVar.b(matcher, bundle, arguments) && (!((Boolean) tVar.f10556e.getValue()).booleanValue() || tVar.c(deepLink, bundle, arguments))) {
                        String fragment = deepLink.getFragment();
                        Pattern pattern2 = (Pattern) tVar.f10562k.getValue();
                        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : bundle2;
                        if (matcher2 != 0 && matcher2.matches()) {
                            List list = (List) tVar.f10560i.getValue();
                            ArrayList arrayList2 = new ArrayList(C1442z.h(list, 10));
                            int i4 = 0;
                            for (Object obj : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    C1441y.g();
                                    throw null;
                                }
                                String str = (String) obj;
                                String value = Uri.decode(matcher2.group(i5));
                                if (arguments.get(str) != null) {
                                    throw new ClassCastException();
                                }
                                try {
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    bundle.putString(str, value);
                                    arrayList2.add(Unit.f7487a);
                                    i4 = i5;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                    }
                }
                bundle = bundle2;
                if (deepLink == null) {
                    String str2 = tVar.f10552a;
                    List<String> requestedPathSegments = deepLink.getPathSegments();
                    List<String> elements = Uri.parse(str2).getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
                    Intrinsics.checkNotNullExpressionValue(elements, "uriPathSegments");
                    Intrinsics.checkNotNullParameter(requestedPathSegments, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "other");
                    Intrinsics.checkNotNullParameter(requestedPathSegments, "<this>");
                    if (requestedPathSegments != null) {
                        linkedHashSet = new LinkedHashSet(requestedPathSegments);
                    } else {
                        linkedHashSet = new LinkedHashSet();
                        C1403G.F(requestedPathSegments, linkedHashSet);
                    }
                    Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Intrinsics.checkNotNullParameter(elements, "<this>");
                    if (elements == null) {
                        elements = C1403G.H(elements);
                    }
                    linkedHashSet.retainAll(elements);
                    i2 = linkedHashSet.size();
                } else {
                    tVar.getClass();
                    i2 = 0;
                }
                String str3 = (String) navDeepLinkRequest.f988i;
                bundle2 = null;
                boolean z4 = str3 == null && str3.equals(null);
                mimeType = (String) navDeepLinkRequest.f989j;
                if (mimeType != null) {
                    Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                }
                if (bundle == null) {
                    if (z4) {
                        Intrinsics.checkNotNullParameter(arguments, "arguments");
                        Bundle bundle3 = new Bundle();
                        if (deepLink != null) {
                            Pattern pattern3 = (Pattern) tVar.f10555d.getValue();
                            Matcher matcher3 = pattern3 != null ? pattern3.matcher(deepLink.toString()) : null;
                            if (matcher3 != null && matcher3.matches()) {
                                tVar.b(matcher3, bundle3, arguments);
                                if (((Boolean) tVar.f10556e.getValue()).booleanValue()) {
                                    tVar.c(deepLink, bundle3, arguments);
                                }
                            }
                        }
                        if (m3.z.q(arguments, new s(bundle3, 1)).isEmpty()) {
                        }
                    }
                }
                uVar = new u(this, bundle, tVar.f10563l, i2, z4);
                if (uVar2 != null || uVar.compareTo(uVar2) > 0) {
                    uVar2 = uVar;
                }
            }
            bundle = null;
            if (deepLink == null) {
            }
            String str32 = (String) navDeepLinkRequest.f988i;
            bundle2 = null;
            if (str32 == null) {
            }
            mimeType = (String) navDeepLinkRequest.f989j;
            if (mimeType != null) {
            }
            if (bundle == null) {
            }
            uVar = new u(this, bundle, tVar.f10563l, i2, z4);
            if (uVar2 != null) {
            }
            uVar2 = uVar;
        }
        return uVar2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f10575l));
        sb.append(")");
        String str = this.f10576m;
        if (str != null && !kotlin.text.y.x(str)) {
            sb.append(" route=");
            sb.append(this.f10576m);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final u w(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri uri = Uri.parse(AbstractC0864b.o(route));
        Intrinsics.b(uri);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Object obj = null;
        C0097d c0097d = new C0097d(uri, obj, obj, 23);
        return this instanceof y ? ((y) this).D(c0097d, false, false, this) : s(c0097d);
    }
}
