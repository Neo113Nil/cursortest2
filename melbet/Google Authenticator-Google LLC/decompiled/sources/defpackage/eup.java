package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eup extends euq {
    private volatile boolean d;
    private Object e;

    public eup(String str, String str2, evj evjVar, eum eumVar, String str3) {
        super(str, str2, evjVar, eumVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.eui
    public final Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object bD = bD((String) this.e);
                    bD.getClass();
                    this.e = bD;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
