package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ca2 extends fx1 {
    public final ht0 EcgxDIVH5in8;
    public String IAToe7bXGz4N;
    public final gp RfyTYNmI9Srp;
    public final k42 S2OOm9zPNm0h;
    public final fv2 S9EYkSpbGuxq;
    public final ca2[] VhhvGxCb8gfr;
    public boolean ZbWwgt3aGe7A;
    public String pnx5pC0XzaCw;

    public ca2(gp gpVar, ht0 ht0Var, fv2 fv2Var, ca2[] ca2VarArr) {
        gpVar.getClass();
        ht0Var.getClass();
        this.RfyTYNmI9Srp = gpVar;
        this.EcgxDIVH5in8 = ht0Var;
        this.S9EYkSpbGuxq = fv2Var;
        this.VhhvGxCb8gfr = ca2VarArr;
        this.S2OOm9zPNm0h = ht0Var.lS5Rgt96tfkO;
        int ordinal = fv2Var.ordinal();
        if (ca2VarArr != null) {
            ca2 ca2Var = ca2VarArr[ordinal];
            if (ca2Var == null && ca2Var == this) {
                return;
            }
            ca2VarArr[ordinal] = this;
        }
    }

    @Override // defpackage.fx1
    public final void EpkonXwzFgDB(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int ordinal = this.S9EYkSpbGuxq.ordinal();
        gp gpVar = this.RfyTYNmI9Srp;
        boolean z = true;
        if (ordinal == 1) {
            if (!gpVar.PxuCJdSBwIXG) {
                gpVar.Y1f8riQaR6yg(',');
            }
            gpVar.PxuCJdSBwIXG();
            return;
        }
        if (ordinal == 2) {
            if (gpVar.PxuCJdSBwIXG) {
                this.ZbWwgt3aGe7A = true;
                gpVar.PxuCJdSBwIXG();
                return;
            }
            if (i % 2 == 0) {
                gpVar.Y1f8riQaR6yg(',');
                gpVar.PxuCJdSBwIXG();
            } else {
                gpVar.Y1f8riQaR6yg(':');
                gpVar.wdg6QnbFHrFF();
                z = false;
            }
            this.ZbWwgt3aGe7A = z;
            return;
        }
        if (ordinal == 3) {
            if (i == 0) {
                this.ZbWwgt3aGe7A = true;
            }
            if (i == 1) {
                gpVar.Y1f8riQaR6yg(',');
                gpVar.wdg6QnbFHrFF();
                this.ZbWwgt3aGe7A = false;
                return;
            }
            return;
        }
        if (!gpVar.PxuCJdSBwIXG) {
            gpVar.Y1f8riQaR6yg(',');
        }
        gpVar.PxuCJdSBwIXG();
        ht0 ht0Var = this.EcgxDIVH5in8;
        ht0Var.getClass();
        zv.xfACYKDMU6Dj(ht0Var, serialDescriptor);
        gPXPFXrUH4XX(serialDescriptor.e9gEMXR7LXtO(i));
        gpVar.Y1f8riQaR6yg(':');
        gpVar.wdg6QnbFHrFF();
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void OPXfSBeufaJ8(int i) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf(i));
        } else {
            this.RfyTYNmI9Srp.e9gEMXR7LXtO(i);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final k42 PxuCJdSBwIXG() {
        return this.S2OOm9zPNm0h;
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void QrzZRwfaDlRX(char c) {
        gPXPFXrUH4XX(String.valueOf(c));
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void RAsUl2FVSrh6(boolean z) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf(z));
        } else {
            ((um) this.RfyTYNmI9Srp.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void TSizfFm2Yiuu() {
        this.RfyTYNmI9Srp.RAsUl2FVSrh6("null");
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void Y1f8riQaR6yg(double d) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf(d));
        } else {
            ((um) this.RfyTYNmI9Srp.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new nt0(vi0.gGoUzNp9JO5I(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void a92UlCVFR9N8(byte b) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf((int) b));
        } else {
            this.RfyTYNmI9Srp.TSizfFm2Yiuu(b);
        }
    }

    @Override // defpackage.fx1
    public final boolean cJeY36nTk9tz(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1 != defpackage.ak.rtx2ld2ELZv4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x003a, code lost:
    
        if (defpackage.cs0.wdg6QnbFHrFF(r1, defpackage.wa2.rtx2ld2ELZv4) == false) goto L21;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dgRBjINgWbAK(KSerializer kSerializer, Object obj) {
        String BRwzKIf41E4i;
        kSerializer.getClass();
        ht0 ht0Var = this.EcgxDIVH5in8;
        boolean z = kSerializer instanceof ko1;
        ak akVar = ht0Var.PxuCJdSBwIXG.lS5Rgt96tfkO;
        if (!z) {
            int ordinal = akVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    sj0 TSizfFm2Yiuu = kSerializer.getDescriptor().TSizfFm2Yiuu();
                    if (!cs0.wdg6QnbFHrFF(TSizfFm2Yiuu, wa2.e9gEMXR7LXtO)) {
                    }
                    BRwzKIf41E4i = xi0.BRwzKIf41E4i(ht0Var, kSerializer.getDescriptor());
                } else if (ordinal != 2) {
                    u9.gPXPFXrUH4XX();
                    return;
                }
            }
            BRwzKIf41E4i = null;
        }
        if (z) {
            ko1 ko1Var = (ko1) kSerializer;
            if (obj == null) {
                rc1.OPXfSBeufaJ8("Value for serializer ", ko1Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            } else {
                kj0.S2OOm9zPNm0h(ko1Var, this, obj);
                throw null;
            }
        }
        if (BRwzKIf41E4i != null) {
            SerialDescriptor descriptor = kSerializer.getDescriptor();
            descriptor.getClass();
            zv.xfACYKDMU6Dj(ht0Var, descriptor);
            if (fx1.pnx5pC0XzaCw(descriptor).contains(BRwzKIf41E4i)) {
                String lS5Rgt96tfkO = kSerializer.getDescriptor().lS5Rgt96tfkO();
                String lS5Rgt96tfkO2 = kSerializer.getDescriptor().lS5Rgt96tfkO();
                String dgRBjINgWbAK = (ht0Var.PxuCJdSBwIXG.lS5Rgt96tfkO == ak.OPXfSBeufaJ8 && cs0.wdg6QnbFHrFF(lS5Rgt96tfkO, lS5Rgt96tfkO2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : o0.dgRBjINgWbAK("as base class '", lS5Rgt96tfkO, '\'');
                StringBuilder sb = new StringBuilder("Class '");
                sb.append(lS5Rgt96tfkO2);
                sb.append("' cannot be serialized ");
                sb.append(dgRBjINgWbAK);
                sb.append(" because it has property name that conflicts with JSON class discriminator '");
                throw new nt0(o0.gPXPFXrUH4XX(sb, BRwzKIf41E4i, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            sj0 TSizfFm2Yiuu2 = kSerializer.getDescriptor().TSizfFm2Yiuu();
            TSizfFm2Yiuu2.getClass();
            if (TSizfFm2Yiuu2 instanceof f42) {
                u9.rtx2ld2ELZv4("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (TSizfFm2Yiuu2 instanceof cq1) {
                u9.rtx2ld2ELZv4("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (TSizfFm2Yiuu2 instanceof jo1) {
                u9.rtx2ld2ELZv4("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String lS5Rgt96tfkO3 = kSerializer.getDescriptor().lS5Rgt96tfkO();
                this.pnx5pC0XzaCw = BRwzKIf41E4i;
                this.IAToe7bXGz4N = lS5Rgt96tfkO3;
            }
        }
        kSerializer.serialize(this, obj);
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void e9gEMXR7LXtO(short s) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf((int) s));
        } else {
            this.RfyTYNmI9Srp.rtx2ld2ELZv4(s);
        }
    }

    @Override // defpackage.fx1
    public final void gGoUzNp9JO5I(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        gp gpVar = this.RfyTYNmI9Srp;
        gpVar.getClass();
        gpVar.PxuCJdSBwIXG = false;
        gpVar.Y1f8riQaR6yg(this.S9EYkSpbGuxq.OPXfSBeufaJ8);
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void gPXPFXrUH4XX(String str) {
        str.getClass();
        this.RfyTYNmI9Srp.OPXfSBeufaJ8(str);
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final fx1 lS5Rgt96tfkO(SerialDescriptor serialDescriptor) {
        ca2 ca2Var;
        serialDescriptor.getClass();
        ht0 ht0Var = this.EcgxDIVH5in8;
        fv2 xbgXKYA2cIfu = vi0.xbgXKYA2cIfu(ht0Var, serialDescriptor);
        char c = xbgXKYA2cIfu.rtx2ld2ELZv4;
        gp gpVar = this.RfyTYNmI9Srp;
        gpVar.Y1f8riQaR6yg(c);
        gpVar.PxuCJdSBwIXG = true;
        String str = this.pnx5pC0XzaCw;
        if (str != null) {
            String str2 = this.IAToe7bXGz4N;
            if (str2 == null) {
                str2 = serialDescriptor.lS5Rgt96tfkO();
            }
            gpVar.PxuCJdSBwIXG();
            gpVar.OPXfSBeufaJ8(str);
            gpVar.Y1f8riQaR6yg(':');
            gPXPFXrUH4XX(str2);
            this.pnx5pC0XzaCw = null;
            this.IAToe7bXGz4N = null;
        }
        if (this.S9EYkSpbGuxq == xbgXKYA2cIfu) {
            return this;
        }
        ca2[] ca2VarArr = this.VhhvGxCb8gfr;
        return (ca2VarArr == null || (ca2Var = ca2VarArr[xbgXKYA2cIfu.ordinal()]) == null) ? new ca2(gpVar, ht0Var, xbgXKYA2cIfu, ca2VarArr) : ca2Var;
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void r3s1LDPKFs1S(long j) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf(j));
        } else {
            this.RfyTYNmI9Srp.a92UlCVFR9N8(j);
        }
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void rtx2ld2ELZv4(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        gPXPFXrUH4XX(serialDescriptor.e9gEMXR7LXtO(i));
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final Encoder wdg6QnbFHrFF(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean PxuCJdSBwIXG = da2.PxuCJdSBwIXG(serialDescriptor);
        fv2 fv2Var = this.S9EYkSpbGuxq;
        ht0 ht0Var = this.EcgxDIVH5in8;
        gp gpVar = this.RfyTYNmI9Srp;
        if (PxuCJdSBwIXG) {
            if (!(gpVar instanceof lp)) {
                gpVar = new lp((um) gpVar.lS5Rgt96tfkO, this.ZbWwgt3aGe7A);
            }
            return new ca2(gpVar, ht0Var, fv2Var, null);
        }
        if (serialDescriptor.a92UlCVFR9N8() && serialDescriptor.equals(ot0.PxuCJdSBwIXG)) {
            if (!(gpVar instanceof kp)) {
                gpVar = new kp((um) gpVar.lS5Rgt96tfkO, this.ZbWwgt3aGe7A);
            }
            return new ca2(gpVar, ht0Var, fv2Var, null);
        }
        if (this.pnx5pC0XzaCw != null) {
            this.IAToe7bXGz4N = serialDescriptor.lS5Rgt96tfkO();
        }
        return this;
    }

    @Override // defpackage.fx1, kotlinx.serialization.encoding.Encoder
    public final void x50lh2ztY7Y5(float f) {
        if (this.ZbWwgt3aGe7A) {
            gPXPFXrUH4XX(String.valueOf(f));
        } else {
            ((um) this.RfyTYNmI9Srp.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new nt0(vi0.gGoUzNp9JO5I(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }
}
