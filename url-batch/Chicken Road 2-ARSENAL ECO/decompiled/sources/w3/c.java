package w3;

import com.onesignal.common.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {
    private final y3.b _fallbackPushSub;
    private final List<y3.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends y3.e> collection, y3.b _fallbackPushSub) {
        i.e(collection, "collection");
        i.e(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final y3.a getByEmail(String email) {
        Object obj;
        i.e(email, "email");
        String hash = j.INSTANCE.hash(email);
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y3.e eVar = (y3.a) obj;
            i.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((com.onesignal.user.internal.i) eVar).getModel().getAddress();
            if (i.a(address, email) || i.a(address, hash)) {
                break;
            }
        }
        return (y3.a) obj;
    }

    public final y3.d getBySMS(String sms) {
        Object obj;
        i.e(sms, "sms");
        String hash = j.INSTANCE.hash(sms);
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y3.e eVar = (y3.d) obj;
            i.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((com.onesignal.user.internal.i) eVar).getModel().getAddress();
            if (i.a(address, sms) || i.a(address, hash)) {
                break;
            }
        }
        return (y3.d) obj;
    }

    public final List<y3.e> getCollection() {
        return this.collection;
    }

    public final List<y3.a> getEmails() {
        List<y3.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof y3.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final y3.b getPush() {
        List<y3.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof y3.b) {
                arrayList.add(obj);
            }
        }
        y3.b bVar = (y3.b) (arrayList.isEmpty() ? null : arrayList.get(0));
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<y3.d> getSmss() {
        List<y3.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof y3.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
