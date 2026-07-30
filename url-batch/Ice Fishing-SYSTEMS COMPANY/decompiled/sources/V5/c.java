package V5;

import com.onesignal.common.j;
import com.onesignal.user.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {
    private final X5.b _fallbackPushSub;
    private final List<X5.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends X5.e> collection, X5.b _fallbackPushSub) {
        h.e(collection, "collection");
        h.e(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final X5.a getByEmail(String email) {
        Object obj;
        h.e(email, "email");
        String hash = j.INSTANCE.hash(email);
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object obj2 = (X5.a) obj;
            h.c(obj2, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) obj2).getModel().getAddress();
            if (h.a(address, email) || h.a(address, hash)) {
                break;
            }
        }
        return (X5.a) obj;
    }

    public final X5.d getBySMS(String sms) {
        Object obj;
        h.e(sms, "sms");
        String hash = j.INSTANCE.hash(sms);
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object obj2 = (X5.d) obj;
            h.c(obj2, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) obj2).getModel().getAddress();
            if (h.a(address, sms) || h.a(address, hash)) {
                break;
            }
        }
        return (X5.d) obj;
    }

    public final List<X5.e> getCollection() {
        return this.collection;
    }

    public final List<X5.a> getEmails() {
        List<X5.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof X5.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final X5.b getPush() {
        List<X5.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof X5.b) {
                arrayList.add(obj);
            }
        }
        X5.b bVar = (X5.b) (arrayList.isEmpty() ? null : arrayList.get(0));
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<X5.d> getSmss() {
        List<X5.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof X5.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
