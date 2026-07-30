package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cd0 implements Comparable {
    public final int OPXfSBeufaJ8;
    public final String dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final String wdg6QnbFHrFF;

    public cd0(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = str;
        this.dgRBjINgWbAK = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cd0 cd0Var = (cd0) obj;
        cd0Var.getClass();
        int i = this.rtx2ld2ELZv4 - cd0Var.rtx2ld2ELZv4;
        return i == 0 ? this.OPXfSBeufaJ8 - cd0Var.OPXfSBeufaJ8 : i;
    }
}
