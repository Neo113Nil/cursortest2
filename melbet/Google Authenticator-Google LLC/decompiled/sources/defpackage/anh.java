package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class anh implements amh {
    public final amj f;
    public final String g;
    public boolean h;

    public anh(amj amjVar, String str) {
        this.f = amjVar;
        this.g = str;
    }

    @Override // defpackage.amh
    public /* synthetic */ boolean n() {
        return b(0) != 0;
    }

    protected final void o() {
        if (this.h) {
            yi.h(21, "statement is closed");
            throw new koh();
        }
    }

    protected final void p() {
        this.h = true;
    }
}
