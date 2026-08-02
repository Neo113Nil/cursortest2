package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jkd {
    public static final jkd a = new jkd(null);
    public static volatile int b = 1;
    private static volatile boolean c = false;
    private static volatile jkd d;
    private final Map e;

    jkd() {
        this.e = new HashMap();
    }

    public static jkd a() {
        jkd jkdVar = d;
        if (jkdVar != null) {
            return jkdVar;
        }
        synchronized (jkd.class) {
            jkd jkdVar2 = d;
            if (jkdVar2 != null) {
                return jkdVar2;
            }
            jkd b2 = jki.b(jkd.class);
            d = b2;
            return b2;
        }
    }

    public iwq b(jll jllVar, int i) {
        return (iwq) this.e.get(new jkc(jllVar, i));
    }

    public jkd(byte[] bArr) {
        this.e = Collections.EMPTY_MAP;
    }
}
