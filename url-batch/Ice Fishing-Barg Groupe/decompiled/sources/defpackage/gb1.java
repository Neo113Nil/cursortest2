package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gb1 implements Iterator, fu0 {
    public boolean OPXfSBeufaJ8;
    public int rtx2ld2ELZv4 = -1;
    public final /* synthetic */ id0 wdg6QnbFHrFF;

    public gb1(id0 id0Var) {
        this.wdg6QnbFHrFF = id0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.rtx2ld2ELZv4 + 1 < ((s82) this.wdg6QnbFHrFF.Y1f8riQaR6yg).e9gEMXR7LXtO();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        this.OPXfSBeufaJ8 = true;
        s82 s82Var = (s82) this.wdg6QnbFHrFF.Y1f8riQaR6yg;
        int i = this.rtx2ld2ELZv4 + 1;
        this.rtx2ld2ELZv4 = i;
        return (za1) s82Var.a92UlCVFR9N8(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.OPXfSBeufaJ8) {
            u9.rtx2ld2ELZv4("You must call next() before you can remove an element");
            return;
        }
        s82 s82Var = (s82) this.wdg6QnbFHrFF.Y1f8riQaR6yg;
        ((za1) s82Var.a92UlCVFR9N8(this.rtx2ld2ELZv4)).wdg6QnbFHrFF = null;
        int i = this.rtx2ld2ELZv4;
        Object[] objArr = s82Var.wdg6QnbFHrFF;
        Object obj = objArr[i];
        Object obj2 = zv.r3s1LDPKFs1S;
        if (obj != obj2) {
            objArr[i] = obj2;
            s82Var.rtx2ld2ELZv4 = true;
        }
        this.rtx2ld2ELZv4 = i - 1;
        this.OPXfSBeufaJ8 = false;
    }
}
