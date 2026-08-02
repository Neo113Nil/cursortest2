package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kxf extends kvj {
    protected final String e() {
        kxf kxfVar;
        kvj kvjVar = kwa.a;
        kxf kxfVar2 = lcv.a;
        if (this == kxfVar2) {
            return "Dispatchers.Main";
        }
        try {
            kxfVar = kxfVar2.i();
        } catch (UnsupportedOperationException unused) {
            kxfVar = null;
        }
        if (this == kxfVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract kxf i();

    @Override // defpackage.kvj
    public String toString() {
        String e = e();
        if (e != null) {
            return e;
        }
        return kvp.a(this) + "@" + kvp.b(this);
    }
}
