package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vl {
    public final Object a;
    public final dm b;

    public vl(MessagingClientEventExtension messagingClientEventExtension, dm dmVar) {
        if (messagingClientEventExtension == null) {
            ch2.l("Null payload");
            throw null;
        }
        this.a = messagingClientEventExtension;
        this.b = dmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        if (!this.a.equals(vlVar.a)) {
            return false;
        }
        Object obj2 = y42.m;
        return obj2.equals(obj2) && this.b.equals(vlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ y42.m.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + y42.m + ", productData=" + this.b + "}";
    }
}
