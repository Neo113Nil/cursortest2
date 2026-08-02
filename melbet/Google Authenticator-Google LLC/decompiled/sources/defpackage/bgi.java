package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgi implements bge {
    public static final bgi a = new bgi(2, null);
    private final /* synthetic */ int b;

    public bgi(int i) {
        this.b = i;
    }

    @Override // defpackage.bge
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return true;
        }
        return obj.toString().startsWith("data:image");
    }

    @Override // defpackage.bge
    public final bvw b(Object obj, int i, int i2, bbl bblVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new bvw(new bls(obj), new bgm(obj, 0)) : new bvw(new bls(obj), new bfl(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public bgi(int i, char[] cArr) {
        this.b = i;
    }
}
