package androidx.webkit;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class ProcessGlobalConfig {
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();
    private static final Object sLock = new Object();
    private static boolean sApplyCalled = false;
}
