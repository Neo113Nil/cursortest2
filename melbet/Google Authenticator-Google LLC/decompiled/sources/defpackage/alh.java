package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alh implements AutoCloseable {
    public final String a;
    public final krx b;
    public final koi c = new kop(new nb(this, 9));
    public final brn d;

    public alh(brn brnVar, String str, krx krxVar) {
        this.d = brnVar;
        this.a = str;
        this.b = krxVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        koi koiVar = this.c;
        if (koiVar.b()) {
            ((ana) koiVar.a()).close();
        }
    }
}
