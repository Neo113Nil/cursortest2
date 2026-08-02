package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class koy implements krt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ koy(int i) {
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, krt] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        Object obj2;
        int i = this.b;
        if (i == 0) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
        if (i == 1) {
            Exception exc = (Exception) obj;
            exc.getClass();
            ((hkf) ((hkf) ((gjw) this.a).h.g()).h(exc).i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "tryPurgeOldVersions$<anonymous>", 395, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Failed to purge old versions");
            return hve.a;
        }
        if (i == 2) {
            String str = (String) obj;
            str.getClass();
            boolean n = ksp.n(str);
            Object obj3 = this.a;
            return n ? str.length() >= ((String) obj3).length() ? str : obj3 : ((String) obj3).concat(str);
        }
        if (i == 3) {
            String str2 = (String) obj;
            str2.getClass();
            return ((String) this.a).concat(str2);
        }
        if (i != 4) {
            ((ldx) this.a).c();
            return kow.a;
        }
        Throwable th = (Throwable) obj;
        int i2 = lck.a;
        try {
            Throwable th2 = (Throwable) this.a.a(th);
            boolean b = ksp.b(th.getMessage(), th2.getMessage());
            obj2 = th2;
            if (!b) {
                boolean b2 = ksp.b(th2.getMessage(), th.toString());
                obj2 = th2;
                if (!b2) {
                    obj2 = null;
                }
            }
        } catch (Throwable th3) {
            obj2 = ixc.X(th3);
        }
        return (Throwable) (true != (obj2 instanceof kom) ? obj2 : null);
    }

    public /* synthetic */ koy(int i, byte[] bArr) {
        this.b = i;
        this.a = "";
    }

    public /* synthetic */ koy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
