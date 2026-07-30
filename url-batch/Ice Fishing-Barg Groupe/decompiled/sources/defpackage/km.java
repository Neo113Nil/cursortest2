package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class km implements hu, Serializable {
    public final fu OPXfSBeufaJ8;
    public final hu rtx2ld2ELZv4;

    public km(fu fuVar, hu huVar) {
        huVar.getClass();
        fuVar.getClass();
        this.rtx2ld2ELZv4 = huVar;
        this.OPXfSBeufaJ8 = fuVar;
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        return pe0Var.rtx2ld2ELZv4(this.rtx2ld2ELZv4.IAToe7bXGz4N(pe0Var, obj), this.OPXfSBeufaJ8);
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        huVar.getClass();
        return huVar == n50.rtx2ld2ELZv4 ? this : (hu) huVar.IAToe7bXGz4N(new jm(3, (byte) 0), this);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        guVar.getClass();
        while (true) {
            fu S2OOm9zPNm0h = this.OPXfSBeufaJ8.S2OOm9zPNm0h(guVar);
            if (S2OOm9zPNm0h != null) {
                return S2OOm9zPNm0h;
            }
            hu huVar = this.rtx2ld2ELZv4;
            if (!(huVar instanceof km)) {
                return huVar.S2OOm9zPNm0h(guVar);
            }
            this = (km) huVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof km) {
            km kmVar = (km) obj;
            int i = 2;
            km kmVar2 = kmVar;
            int i2 = 2;
            while (true) {
                hu huVar = kmVar2.rtx2ld2ELZv4;
                kmVar2 = huVar instanceof km ? (km) huVar : null;
                if (kmVar2 == null) {
                    break;
                }
                i2++;
            }
            km kmVar3 = this;
            while (true) {
                hu huVar2 = kmVar3.rtx2ld2ELZv4;
                kmVar3 = huVar2 instanceof km ? (km) huVar2 : null;
                if (kmVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    fu fuVar = this.OPXfSBeufaJ8;
                    if (!cs0.wdg6QnbFHrFF(kmVar.S2OOm9zPNm0h(fuVar.getKey()), fuVar)) {
                        z = false;
                        break;
                    }
                    hu huVar3 = this.rtx2ld2ELZv4;
                    if (!(huVar3 instanceof km)) {
                        huVar3.getClass();
                        fu fuVar2 = (fu) huVar3;
                        z = cs0.wdg6QnbFHrFF(kmVar.S2OOm9zPNm0h(fuVar2.getKey()), fuVar2);
                        break;
                    }
                    this = (km) huVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OPXfSBeufaJ8.hashCode() + this.rtx2ld2ELZv4.hashCode();
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        guVar.getClass();
        fu fuVar = this.OPXfSBeufaJ8;
        fu S2OOm9zPNm0h = fuVar.S2OOm9zPNm0h(guVar);
        hu huVar = this.rtx2ld2ELZv4;
        if (S2OOm9zPNm0h != null) {
            return huVar;
        }
        hu kpCQ9veP6n3I = huVar.kpCQ9veP6n3I(guVar);
        return kpCQ9veP6n3I == huVar ? this : kpCQ9veP6n3I == n50.rtx2ld2ELZv4 ? fuVar : new km(fuVar, kpCQ9veP6n3I);
    }

    public final String toString() {
        return o0.QrzZRwfaDlRX(new StringBuilder("["), (String) IAToe7bXGz4N(new jm(0, (byte) 0), ""), ']');
    }
}
