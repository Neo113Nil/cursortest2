package io.opentelemetry.context;

import java.util.ArrayList;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public abstract class ContextStorageWrappers {
    public static boolean storageInitialized;
    public static final Logger log = Logger.getLogger(ContextStorageWrappers.class.getName());
    public static final ArrayList wrappers = new ArrayList();
    public static final Object mutex = new Object();
}
