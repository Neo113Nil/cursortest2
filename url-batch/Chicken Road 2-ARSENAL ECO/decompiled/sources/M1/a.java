package M1;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class a implements O1.a {
    public static final C0001a Companion = new C0001a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* renamed from: M1.a$a, reason: collision with other inner class name */
    public static final class C0001a {
        public /* synthetic */ C0001a(e eVar) {
            this();
        }

        private C0001a() {
        }
    }

    public a(String key) {
        i.e(key, "key");
        this.key = key;
    }

    @Override // O1.a
    public String getId() {
        return ID;
    }

    @Override // O1.a
    public b getRywData(Map<String, ? extends Map<O1.b, b>> indexedTokens) {
        i.e(indexedTokens, "indexedTokens");
        Map<O1.b, b> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = AbstractC0505i.K(new b[]{map.get(N1.a.USER), map.get(N1.a.SUBSCRIPTION)}).iterator();
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

    @Override // O1.a
    public boolean isMet(Map<String, ? extends Map<O1.b, b>> indexedTokens) {
        i.e(indexedTokens, "indexedTokens");
        Map<O1.b, b> map = indexedTokens.get(this.key);
        return (map == null || map.get(N1.a.USER) == null) ? false : true;
    }
}
