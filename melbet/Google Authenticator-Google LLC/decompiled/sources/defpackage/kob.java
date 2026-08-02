package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kob {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    static {
        Object obj;
        Class<?> cls;
        koa koaVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                koaVar = (koa) cls.asSubclass(koa.class).getConstructor(koc.class).newInstance(koa.a);
            } catch (Throwable th2) {
                obj = th2;
            }
            if (koaVar == null) {
                new koa(koa.a);
            }
            if (obj == null) {
                try {
                    if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                        Class<?> cls2 = Class.forName("java.util.logging.Logger");
                        Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, kob.class.getName());
                        Class<?> cls3 = Class.forName("java.util.logging.Level");
                        cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        koaVar = null;
        if (koaVar == null) {
        }
        if (obj == null) {
        }
    }

    private kob() {
    }
}
