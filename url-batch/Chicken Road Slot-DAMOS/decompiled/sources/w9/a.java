package w9;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements y9.a {
    public static final C0076a Companion = new C0076a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    public a(String str) {
        str.getClass();
        this.key = str;
    }

    @Override // y9.a
    public String getId() {
        return ID;
    }

    @Override // y9.a
    public b getRywData(Map<String, ? extends Map<y9.b, b>> map) {
        map.getClass();
        Map<y9.b, b> map2 = map.get(this.key);
        Object obj = null;
        if (map2 == null) {
            return null;
        }
        Iterator it = w.m(new b[]{map2.get(x9.a.USER), map2.get(x9.a.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((b) next).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        obj = next;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (b) obj;
    }

    @Override // y9.a
    public boolean isMet(Map<String, ? extends Map<y9.b, b>> map) {
        map.getClass();
        Map<y9.b, b> map2 = map.get(this.key);
        return (map2 == null || map2.get(x9.a.USER) == null) ? false : true;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: w9.a$a, reason: collision with other inner class name */
    public static final class C0076a {
        public /* synthetic */ C0076a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0076a() {
        }
    }
}
