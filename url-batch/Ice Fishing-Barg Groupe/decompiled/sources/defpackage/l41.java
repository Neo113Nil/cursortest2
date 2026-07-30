package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l41 extends n41 implements Iterator, fu0 {
    public final /* synthetic */ int x50lh2ztY7Y5;

    public l41(o41 o41Var, int i) {
        this.x50lh2ztY7Y5 = i;
        o41Var.getClass();
        this.dgRBjINgWbAK = o41Var;
        this.OPXfSBeufaJ8 = -1;
        this.wdg6QnbFHrFF = o41Var.QrzZRwfaDlRX;
        TSizfFm2Yiuu();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                lS5Rgt96tfkO();
                int i = this.rtx2ld2ELZv4;
                o41 o41Var = (o41) this.dgRBjINgWbAK;
                if (i >= o41Var.cpQdD2nAriOS) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    this.rtx2ld2ELZv4 = i + 1;
                    this.OPXfSBeufaJ8 = i;
                    m41 m41Var = new m41(o41Var, i);
                    TSizfFm2Yiuu();
                    break;
                }
            case 1:
                lS5Rgt96tfkO();
                int i2 = this.rtx2ld2ELZv4;
                o41 o41Var2 = (o41) this.dgRBjINgWbAK;
                if (i2 >= o41Var2.cpQdD2nAriOS) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    this.rtx2ld2ELZv4 = i2 + 1;
                    this.OPXfSBeufaJ8 = i2;
                    Object obj = o41Var2.rtx2ld2ELZv4[i2];
                    TSizfFm2Yiuu();
                    break;
                }
            default:
                lS5Rgt96tfkO();
                int i3 = this.rtx2ld2ELZv4;
                o41 o41Var3 = (o41) this.dgRBjINgWbAK;
                if (i3 >= o41Var3.cpQdD2nAriOS) {
                    u9.RfyTYNmI9Srp();
                    break;
                } else {
                    this.rtx2ld2ELZv4 = i3 + 1;
                    this.OPXfSBeufaJ8 = i3;
                    Object[] objArr = o41Var3.OPXfSBeufaJ8;
                    objArr.getClass();
                    Object obj2 = objArr[this.OPXfSBeufaJ8];
                    TSizfFm2Yiuu();
                    break;
                }
        }
        return null;
    }
}
