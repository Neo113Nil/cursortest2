package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnq {
    public Activity a;
    public glu b;
    private final bnl c;
    private final bnk d;
    private final bmy e;

    public bnq(bnl bnlVar, bnk bnkVar, bmy bmyVar) {
        this.c = bnlVar;
        this.d = bnkVar;
        this.e = bmyVar;
    }

    static /* synthetic */ String b(Object obj, Class cls, String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    static /* synthetic */ String c(di diVar, Class cls) {
        Class<?> cls2 = diVar.getClass();
        return "Attempt to inject a Activity wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + String.valueOf(cls2) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public final bmx a() {
        return new bmx(this.c, this.d, this.e, this.a, this.b);
    }
}
