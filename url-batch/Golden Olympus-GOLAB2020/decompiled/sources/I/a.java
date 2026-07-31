package I;

import G.c;
import G.d;
import G.e;
import G.f;
import G.g;
import G.h;
import G.i;
import java.util.Set;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0012a f768a = new C0012a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Set f769b = T.h(7, 20);

    /* renamed from: c, reason: collision with root package name */
    private static final int f770c = 1;

    /* renamed from: I.a$a, reason: collision with other inner class name */
    public static final class C0012a {
        public /* synthetic */ C0012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G.b a(String str, String str2) {
            return Intrinsics.areEqual(str, "CREATE_CANCELED") ? new G.a(str2) : Intrinsics.areEqual(str, "CREATE_INTERRUPTED") ? new c(str2) : new d(str2);
        }

        public final f b(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            return new i(str2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        return new g(str2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    return new e(str2);
                }
            }
            return new h(str2);
        }

        public final Set c() {
            return a.f769b;
        }

        private C0012a() {
        }
    }
}
