package r3;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import f2.InterfaceC0365b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public class b extends m {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final C0617a invoke() {
            return new C0617a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0365b prefs) {
        super(new l(a.INSTANCE, c.IDENTITY_NAME_SPACE, prefs));
        i.e(prefs, "prefs");
    }
}
