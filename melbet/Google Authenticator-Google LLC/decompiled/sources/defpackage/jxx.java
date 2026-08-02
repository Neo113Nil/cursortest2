package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxx {
    public static final jws a = new jws("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final jws b = new jws("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final jws c = new jws("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final jws d = new jws("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    public final List e;
    public final jwt f;
    private final int g;

    public jxx(List list, jwt jwtVar) {
        hoq.y(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.e = unmodifiableList;
        jwtVar.getClass();
        this.f = jwtVar;
        this.g = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxx)) {
            return false;
        }
        jxx jxxVar = (jxx) obj;
        List list = this.e;
        int size = list.size();
        List list2 = jxxVar.e;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.f.equals(jxxVar.f);
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        jwt jwtVar = this.f;
        return "[" + String.valueOf(this.e) + "/" + jwtVar.toString() + "]";
    }

    public jxx(SocketAddress socketAddress, jwt jwtVar) {
        this(Collections.singletonList(socketAddress), jwtVar);
    }

    public jxx(SocketAddress socketAddress) {
        this(socketAddress, jwt.a);
    }
}
