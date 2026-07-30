package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zf extends jyegZNwi31qc {
    public final Object dgRBjINgWbAK;
    public final /* synthetic */ int wdg6QnbFHrFF = 1;

    public zf(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.dgRBjINgWbAK = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.wdg6QnbFHrFF;
        Object obj = this.dgRBjINgWbAK;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    int i2 = this.rtx2ld2ELZv4;
                    this.rtx2ld2ELZv4 = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    this.rtx2ld2ELZv4++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.wdg6QnbFHrFF;
        Object obj = this.dgRBjINgWbAK;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    int i2 = this.rtx2ld2ELZv4 - 1;
                    this.rtx2ld2ELZv4 = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    this.rtx2ld2ELZv4--;
                    break;
                }
        }
        return null;
    }

    public zf(int i, Object obj) {
        super(i, 1);
        this.dgRBjINgWbAK = obj;
    }
}
