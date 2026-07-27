package s1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final H f10577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10578b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10579c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10580d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10581e;

    public w(H navigator, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f10577a = navigator;
        this.f10578b = str;
        this.f10579c = new LinkedHashMap();
        this.f10580d = new ArrayList();
        this.f10581e = new LinkedHashMap();
    }

    public v a() {
        v b4 = b();
        b4.getClass();
        Iterator it = this.f10579c.entrySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it2 = this.f10580d.iterator();
                while (it2.hasNext()) {
                    b4.e((t) it2.next());
                }
                for (Map.Entry entry : this.f10581e.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        throw new ClassCastException();
                    }
                    Intrinsics.checkNotNullParameter(null, "action");
                    if (b4 instanceof C1185a) {
                        throw new UnsupportedOperationException("Cannot add action " + intValue + " to " + b4 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                    }
                    if (intValue == 0) {
                        throw new IllegalArgumentException("Cannot have an action with actionId 0");
                    }
                    b4.f10573j.d(intValue, null);
                }
                String str = this.f10578b;
                if (str != null) {
                    int i2 = v.f10569n;
                    if (kotlin.text.y.x(str)) {
                        throw new IllegalArgumentException("Cannot have an empty route");
                    }
                    String uriPattern = AbstractC0864b.o(str);
                    b4.f10575l = uriPattern.hashCode();
                    Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                    Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                    b4.e(new t(uriPattern));
                    ArrayList arrayList = b4.f10572i;
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (((t) next).f10552a.equals(AbstractC0864b.o(b4.f10576m))) {
                            obj = next;
                            break;
                        }
                    }
                    M2.J.a(arrayList);
                    arrayList.remove(obj);
                    b4.f10576m = str;
                }
                return b4;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String argumentName = (String) entry2.getKey();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            Intrinsics.checkNotNullParameter(null, "argument");
            b4.f10574k.put(argumentName, null);
        }
    }

    public v b() {
        return this.f10577a.a();
    }
}
