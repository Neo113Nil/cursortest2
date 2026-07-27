package s1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: f, reason: collision with root package name */
    public final I f10590f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10591g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(I provider, String str) {
        super(provider.b(m3.s.m(C1182A.class)), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter("events", "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(C1182A.class, "navigatorClass");
        this.f10592h = new ArrayList();
        this.f10590f = provider;
        this.f10591g = "events";
    }

    public final y c() {
        int hashCode;
        y yVar = (y) super.a();
        ArrayList nodes = this.f10592h;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            v node = (v) it.next();
            if (node != null) {
                Intrinsics.checkNotNullParameter(node, "node");
                int i2 = node.f10575l;
                String str = node.f10576m;
                if (i2 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = yVar.f10576m;
                if (str2 != null && Intrinsics.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + yVar).toString());
                }
                if (i2 == yVar.f10575l) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + yVar).toString());
                }
                i.H h4 = yVar.f10586o;
                v vVar = (v) h4.b(i2);
                if (vVar == node) {
                    continue;
                } else {
                    if (node.f10571e != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (vVar != null) {
                        vVar.f10571e = null;
                    }
                    node.f10571e = yVar;
                    h4.d(node.f10575l, node);
                }
            }
        }
        String startDestRoute = this.f10591g;
        if (startDestRoute == null) {
            if (this.f10578b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        if (startDestRoute == null) {
            hashCode = 0;
        } else {
            if (startDestRoute.equals(yVar.f10576m)) {
                throw new IllegalArgumentException(("Start destination " + startDestRoute + " cannot use the same route as the graph " + yVar).toString());
            }
            if (kotlin.text.y.x(startDestRoute)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = "android-app://androidx.navigation/".concat(startDestRoute).hashCode();
        }
        yVar.f10587p = hashCode;
        yVar.f10589r = startDestRoute;
        return yVar;
    }
}
