package hb;

import com.onesignal.common.modeling.i;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends i {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
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

    public final void setKey(String str) {
        str.getClass();
        i.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    public final void setValue(Object obj) {
        obj.getClass();
        i.setAnyProperty$default(this, "value", obj, null, true, 4, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }
}
