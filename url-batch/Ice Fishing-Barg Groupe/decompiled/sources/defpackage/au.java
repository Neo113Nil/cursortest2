package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class au implements le0 {
    public final /* synthetic */ bu OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ au(bu buVar, l32 l32Var) {
        this.rtx2ld2ELZv4 = 3;
        this.OPXfSBeufaJ8 = buVar;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        boolean isText;
        int i = this.rtx2ld2ELZv4;
        StringBuilder sb = null;
        boolean z = true;
        bu buVar = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                mj1 mj1Var = buVar.IAToe7bXGz4N.EcgxDIVH5in8;
                Boolean bool = Boolean.TRUE;
                mj1Var.setValue(bool);
                buVar.IAToe7bXGz4N.RfyTYNmI9Srp.setValue(bool);
                yz0 yz0Var = buVar.IAToe7bXGz4N;
                n3 n3Var = (n3) ((z70) obj);
                isText = n3Var.PxuCJdSBwIXG.isText();
                CharSequence textValue = isText ? n3Var.PxuCJdSBwIXG.getTextValue() : null;
                textValue.getClass();
                bu.Yadk4uqlxLy8(yz0Var, (String) textValue, buVar.e6tOsSdd2EFb);
                return bool;
            case 1:
                List list = (List) obj;
                if (buVar.IAToe7bXGz4N.Y1f8riQaR6yg() != null) {
                    ki2 Y1f8riQaR6yg = buVar.IAToe7bXGz4N.Y1f8riQaR6yg();
                    Y1f8riQaR6yg.getClass();
                    list.add(Y1f8riQaR6yg.PxuCJdSBwIXG);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                bu.Yadk4uqlxLy8(buVar.IAToe7bXGz4N, ((v8) obj).OPXfSBeufaJ8, buVar.e6tOsSdd2EFb);
                return Boolean.TRUE;
            default:
                v8 v8Var = (v8) obj;
                if (buVar.e6tOsSdd2EFb) {
                    ei2 ei2Var = buVar.IAToe7bXGz4N.e9gEMXR7LXtO;
                    if (ei2Var != null) {
                        tf2 tf2Var = uf2.Companion;
                        List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(new d80(), new mm(v8Var, 1));
                        yz0 yz0Var2 = buVar.IAToe7bXGz4N;
                        op0 op0Var = yz0Var2.Y1f8riQaR6yg;
                        mt mtVar = yz0Var2.VhhvGxCb8gfr;
                        tf2Var.getClass();
                        oh2 dgRBjINgWbAK = op0Var.dgRBjINgWbAK(D0aTLcX6Uhyo);
                        if (cs0.wdg6QnbFHrFF((ei2) ei2Var.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var)) {
                            ei2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(null, dgRBjINgWbAK);
                        }
                        mtVar.OPXfSBeufaJ8(dgRBjINgWbAK);
                    } else {
                        oh2 oh2Var = buVar.pnx5pC0XzaCw;
                        String str = oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
                        long j = oh2Var.lS5Rgt96tfkO;
                        ui2 ui2Var = vi2.Companion;
                        int i2 = (int) (j >> 32);
                        int i3 = (int) (j & 4294967295L);
                        str.getClass();
                        v8Var.getClass();
                        if (i3 >= i2) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i2);
                            sb.append((CharSequence) v8Var);
                            sb.append((CharSequence) str, i3, str.length());
                        } else {
                            rc1.Y1f8riQaR6yg(i3, i2, ") is less than start index (", "End index (");
                        }
                        String obj2 = sb.toString();
                        int length = v8Var.OPXfSBeufaJ8.length() + ((int) (buVar.pnx5pC0XzaCw.lS5Rgt96tfkO >> 32));
                        buVar.IAToe7bXGz4N.VhhvGxCb8gfr.OPXfSBeufaJ8(new oh2(4, jh0.rtx2ld2ELZv4(length, length), obj2));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ au(bu buVar, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = buVar;
    }
}
