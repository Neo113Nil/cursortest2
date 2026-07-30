package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t82 extends rq0 {
    public final /* synthetic */ s82 OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;

    public t82(s82 s82Var) {
        this.OPXfSBeufaJ8 = s82Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.rtx2ld2ELZv4 < this.OPXfSBeufaJ8.e9gEMXR7LXtO();
    }

    @Override // defpackage.rq0
    public final int nextInt() {
        int i = this.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = i + 1;
        return this.OPXfSBeufaJ8.TSizfFm2Yiuu(i);
    }
}
