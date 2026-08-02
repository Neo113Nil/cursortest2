package defpackage;

import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhc extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        WeakHashMap weakHashMap = dhg.a;
        synchronized (weakHashMap) {
            Boolean bool = (Boolean) weakHashMap.remove(currentThread);
            z = true;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (!booleanValue) {
                }
                return Boolean.valueOf(z);
            }
        }
        ThreadLocal threadLocal = dhd.a;
        if (!"Filter".equals(currentThread.getName())) {
            String name = currentThread.getName();
            if (!Objects.equals(name, "Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner") && (name == null || !name.startsWith("SimpleServer ConnectionThread "))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
