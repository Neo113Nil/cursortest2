package o2;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p2.EnumC0826a;
import q2.InterfaceC0833a;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799a implements InterfaceC0833a {
    public static final C0087a Companion = new C0087a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* renamed from: o2.a$a, reason: collision with other inner class name */
    public static final class C0087a {
        public /* synthetic */ C0087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0087a() {
        }
    }

    public C0799a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // q2.InterfaceC0833a
    public String getId() {
        return ID;
    }

    @Override // q2.InterfaceC0833a
    public C0800b getRywData(Map<String, ? extends Map<q2.b, C0800b>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<q2.b, C0800b> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        C0800b[] elements = {map.get(EnumC0826a.USER), map.get(EnumC0826a.SUBSCRIPTION)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = p.l(elements).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((C0800b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((C0800b) next).getRywToken();
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
        return (C0800b) obj;
    }

    @Override // q2.InterfaceC0833a
    public boolean isMet(Map<String, ? extends Map<q2.b, C0800b>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<q2.b, C0800b> map = indexedTokens.get(this.key);
        return (map == null || map.get(EnumC0826a.USER) == null) ? false : true;
    }
}
