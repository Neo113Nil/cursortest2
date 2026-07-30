package Y3;

import a4.InterfaceC0177a;
import a4.InterfaceC0178b;
import a4.InterfaceC0180d;
import a4.InterfaceC0181e;
import com.onesignal.common.j;
import com.onesignal.user.internal.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {
    private final InterfaceC0178b _fallbackPushSub;
    private final List<InterfaceC0181e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends InterfaceC0181e> collection, InterfaceC0178b _fallbackPushSub) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final InterfaceC0177a getByEmail(String email) {
        Object obj;
        Intrinsics.checkNotNullParameter(email, "email");
        String hash = j.INSTANCE.hash(email);
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0181e interfaceC0181e = (InterfaceC0177a) obj;
            Intrinsics.c(interfaceC0181e, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) interfaceC0181e).getModel().getAddress();
            if (Intrinsics.a(address, email) || Intrinsics.a(address, hash)) {
                break;
            }
        }
        return (InterfaceC0177a) obj;
    }

    public final InterfaceC0180d getBySMS(String sms) {
        Object obj;
        Intrinsics.checkNotNullParameter(sms, "sms");
        String hash = j.INSTANCE.hash(sms);
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0181e interfaceC0181e = (InterfaceC0180d) obj;
            Intrinsics.c(interfaceC0181e, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            String address = ((i) interfaceC0181e).getModel().getAddress();
            if (Intrinsics.a(address, sms) || Intrinsics.a(address, hash)) {
                break;
            }
        }
        return (InterfaceC0180d) obj;
    }

    public final List<InterfaceC0181e> getCollection() {
        return this.collection;
    }

    public final List<InterfaceC0177a> getEmails() {
        List<InterfaceC0181e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0177a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final InterfaceC0178b getPush() {
        Object firstOrNull;
        List<InterfaceC0181e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0178b) {
                arrayList.add(obj);
            }
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        InterfaceC0178b interfaceC0178b = (InterfaceC0178b) firstOrNull;
        return interfaceC0178b == null ? this._fallbackPushSub : interfaceC0178b;
    }

    public final List<InterfaceC0180d> getSmss() {
        List<InterfaceC0181e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC0180d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
