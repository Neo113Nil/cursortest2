package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ga implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public final /* synthetic */ int dgRBjINgWbAK;
    public int rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ga(ka kaVar, int i) {
        this(kaVar.wdg6QnbFHrFF);
        this.dgRBjINgWbAK = i;
        switch (i) {
            case 1:
                this.x50lh2ztY7Y5 = kaVar;
                this(kaVar.wdg6QnbFHrFF);
                break;
            default:
                this.x50lh2ztY7Y5 = kaVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OPXfSBeufaJ8 < this.rtx2ld2ELZv4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e9gEMXR7LXtO;
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        int i = this.OPXfSBeufaJ8;
        int i2 = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i2) {
            case 0:
                e9gEMXR7LXtO = ((ka) obj).e9gEMXR7LXtO(i);
                break;
            case 1:
                e9gEMXR7LXtO = ((ka) obj).rtx2ld2ELZv4(i);
                break;
            default:
                e9gEMXR7LXtO = ((ma) obj).OPXfSBeufaJ8[i];
                break;
        }
        this.OPXfSBeufaJ8++;
        this.wdg6QnbFHrFF = true;
        return e9gEMXR7LXtO;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("Call next() before removing an element.");
            return;
        }
        int i = this.OPXfSBeufaJ8 - 1;
        this.OPXfSBeufaJ8 = i;
        int i2 = this.dgRBjINgWbAK;
        Object obj = this.x50lh2ztY7Y5;
        switch (i2) {
            case 0:
                ((ka) obj).a92UlCVFR9N8(i);
                break;
            case 1:
                ((ka) obj).a92UlCVFR9N8(i);
                break;
            default:
                ((ma) obj).PxuCJdSBwIXG(i);
                break;
        }
        this.rtx2ld2ELZv4--;
        this.wdg6QnbFHrFF = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ga(ma maVar) {
        this(maVar.wdg6QnbFHrFF);
        this.dgRBjINgWbAK = 2;
        this.x50lh2ztY7Y5 = maVar;
    }

    public ga(int i) {
        this.rtx2ld2ELZv4 = i;
    }
}
