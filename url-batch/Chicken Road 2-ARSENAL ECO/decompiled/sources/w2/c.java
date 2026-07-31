package w2;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class c extends i {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final String invoke() {
            return "";
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Object invoke() {
            return "";
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", b.INSTANCE);
    }

    public final void setKey(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        i.setStringProperty$default(this, "key", value, null, false, 12, null);
    }

    public final void setValue(Object value) {
        kotlin.jvm.internal.i.e(value, "value");
        i.setAnyProperty$default(this, "value", value, null, true, 4, null);
    }
}
