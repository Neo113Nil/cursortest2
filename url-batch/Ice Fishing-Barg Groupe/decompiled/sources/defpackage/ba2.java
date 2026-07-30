package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.TSizfFm2Yiuu;
import kotlinx.serialization.json.Y1f8riQaR6yg;
import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ba2 extends b51 implements Decoder, op {
    public final fv2 IAToe7bXGz4N;
    public int aF05bpZJlKEP;
    public final cb1 e6tOsSdd2EFb;
    public final k42 jyegZNwi31qc;
    public final ht0 pnx5pC0XzaCw;

    public ba2(ht0 ht0Var, fv2 fv2Var, cb1 cb1Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.pnx5pC0XzaCw = ht0Var;
        this.IAToe7bXGz4N = fv2Var;
        this.e6tOsSdd2EFb = cb1Var;
        this.jyegZNwi31qc = ht0Var.lS5Rgt96tfkO;
        this.aF05bpZJlKEP = -1;
    }

    public final ht0 D0aTLcX6Uhyo() {
        return this.pnx5pC0XzaCw;
    }

    @Override // defpackage.b51, defpackage.op
    public final Object EcgxDIVH5in8(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        j4 j4Var = (j4) this.e6tOsSdd2EFb.Y1f8riQaR6yg;
        serialDescriptor.getClass();
        kSerializer.getClass();
        boolean z = this.IAToe7bXGz4N == fv2.x50lh2ztY7Y5 && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) j4Var.e9gEMXR7LXtO;
            int i2 = j4Var.lS5Rgt96tfkO;
            if (iArr[i2] == -2) {
                ((Object[]) j4Var.Y1f8riQaR6yg)[i2] = ih0.XL4ISE6Oc65B;
            }
        }
        Object x50lh2ztY7Y5 = x50lh2ztY7Y5(kSerializer);
        if (z) {
            int[] iArr2 = (int[]) j4Var.e9gEMXR7LXtO;
            int i3 = j4Var.lS5Rgt96tfkO;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                j4Var.lS5Rgt96tfkO = i4;
                if (i4 == ((Object[]) j4Var.Y1f8riQaR6yg).length) {
                    j4Var.e9gEMXR7LXtO();
                }
            }
            Object[] objArr = (Object[]) j4Var.Y1f8riQaR6yg;
            int i5 = j4Var.lS5Rgt96tfkO;
            objArr[i5] = ((lt0) j4Var.TSizfFm2Yiuu).TSizfFm2Yiuu ? x50lh2ztY7Y5 : jx1.BRwzKIf41E4i;
            ((int[]) j4Var.e9gEMXR7LXtO)[i5] = -2;
        }
        return x50lh2ztY7Y5;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final short IAToe7bXGz4N() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        long rtx2ld2ELZv4 = cb1Var.rtx2ld2ELZv4();
        short s = (short) rtx2ld2ELZv4;
        if (rtx2ld2ELZv4 == s) {
            return s;
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Failed to parse short for input '" + rtx2ld2ELZv4 + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final char OPXfSBeufaJ8() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        String wdg6QnbFHrFF = cb1Var.wdg6QnbFHrFF();
        if (wdg6QnbFHrFF.length() == 1) {
            return wdg6QnbFHrFF.charAt(0);
        }
        cb1.x50lh2ztY7Y5(cb1Var, o0.dgRBjINgWbAK("Expected single char, but got '", wdg6QnbFHrFF, '\''), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.op
    public final k42 PxuCJdSBwIXG() {
        return this.jyegZNwi31qc;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final Decoder QrzZRwfaDlRX(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return da2.PxuCJdSBwIXG(serialDescriptor) ? new mt0(this.e6tOsSdd2EFb, this.pnx5pC0XzaCw) : this;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final long TSizfFm2Yiuu() {
        return this.e6tOsSdd2EFb.rtx2ld2ELZv4();
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final int VhhvGxCb8gfr() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        long rtx2ld2ELZv4 = cb1Var.rtx2ld2ELZv4();
        int i = (int) rtx2ld2ELZv4;
        if (rtx2ld2ELZv4 == i) {
            return i;
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Failed to parse int for input '" + rtx2ld2ELZv4 + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final boolean a92UlCVFR9N8() {
        boolean z;
        boolean z2;
        cb1 cb1Var = this.e6tOsSdd2EFb;
        int RfyTYNmI9Srp = cb1Var.RfyTYNmI9Srp();
        String str = (String) cb1Var.RAsUl2FVSrh6;
        if (RfyTYNmI9Srp == str.length()) {
            cb1.x50lh2ztY7Y5(cb1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(RfyTYNmI9Srp) == '\"') {
            RfyTYNmI9Srp++;
            z = true;
        } else {
            z = false;
        }
        int XL4ISE6Oc65B = cb1Var.XL4ISE6Oc65B(RfyTYNmI9Srp);
        if (XL4ISE6Oc65B >= str.length() || XL4ISE6Oc65B == -1) {
            cb1.x50lh2ztY7Y5(cb1Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = XL4ISE6Oc65B + 1;
        int charAt = str.charAt(XL4ISE6Oc65B) | ' ';
        if (charAt == 102) {
            cb1Var.TSizfFm2Yiuu("alse", i);
            z2 = false;
        } else {
            if (charAt != 116) {
                cb1.x50lh2ztY7Y5(cb1Var, "Expected valid boolean literal prefix, but had '" + cb1Var.wdg6QnbFHrFF() + '\'', 0, null, 6);
                throw null;
            }
            cb1Var.TSizfFm2Yiuu("rue", i);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (cb1Var.lS5Rgt96tfkO == str.length()) {
            cb1.x50lh2ztY7Y5(cb1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(cb1Var.lS5Rgt96tfkO) == '\"') {
            cb1Var.lS5Rgt96tfkO++;
            return z2;
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final double aF05bpZJlKEP() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        String wdg6QnbFHrFF = cb1Var.wdg6QnbFHrFF();
        try {
            double parseDouble = Double.parseDouble(wdg6QnbFHrFF);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            cb1.x50lh2ztY7Y5(cb1Var, vi0.gGoUzNp9JO5I(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            cb1.x50lh2ztY7Y5(cb1Var, o0.dgRBjINgWbAK("Failed to parse type 'double' for input '", wdg6QnbFHrFF, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b51, defpackage.op
    public final void cpQdD2nAriOS(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.Y1f8riQaR6yg() == 0 && zv.jyegZNwi31qc(this.pnx5pC0XzaCw, serialDescriptor)) {
            while (dgRBjINgWbAK(serialDescriptor) != -1) {
            }
        }
        cb1 cb1Var = this.e6tOsSdd2EFb;
        if (cb1Var.EcgxDIVH5in8()) {
            vi0.ozEBbv0hFTAB(cb1Var, "");
            throw null;
        }
        cb1Var.RAsUl2FVSrh6(this.IAToe7bXGz4N.OPXfSBeufaJ8);
        j4 j4Var = (j4) cb1Var.Y1f8riQaR6yg;
        int i = j4Var.lS5Rgt96tfkO;
        int[] iArr = (int[]) j4Var.e9gEMXR7LXtO;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            j4Var.lS5Rgt96tfkO = i - 1;
        }
        int i2 = j4Var.lS5Rgt96tfkO;
        if (i2 != -1) {
            j4Var.lS5Rgt96tfkO = i2 - 1;
        }
    }

    @Override // defpackage.op
    public final int dgRBjINgWbAK(SerialDescriptor serialDescriptor) {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        j4 j4Var = (j4) cb1Var.Y1f8riQaR6yg;
        serialDescriptor.getClass();
        fv2 fv2Var = this.IAToe7bXGz4N;
        int ordinal = fv2Var.ordinal();
        boolean z = false;
        int i = -1;
        if (ordinal == 0) {
            boolean EcgxDIVH5in8 = cb1Var.EcgxDIVH5in8();
            while (true) {
                if (cb1Var.lS5Rgt96tfkO()) {
                    String Y1f8riQaR6yg = cb1Var.Y1f8riQaR6yg();
                    cb1Var.RAsUl2FVSrh6(':');
                    ht0 ht0Var = this.pnx5pC0XzaCw;
                    int S2OOm9zPNm0h = zv.S2OOm9zPNm0h(serialDescriptor, ht0Var, Y1f8riQaR6yg);
                    if (S2OOm9zPNm0h != -3) {
                        i = S2OOm9zPNm0h;
                        break;
                    }
                    if (!zv.jyegZNwi31qc(ht0Var, serialDescriptor)) {
                        int i2 = j4Var.lS5Rgt96tfkO;
                        int[] iArr = (int[]) j4Var.e9gEMXR7LXtO;
                        if (iArr[i2] == -2) {
                            iArr[i2] = -1;
                            j4Var.lS5Rgt96tfkO = i2 - 1;
                        }
                        int i3 = j4Var.lS5Rgt96tfkO;
                        if (i3 != -1) {
                            j4Var.lS5Rgt96tfkO = i3 - 1;
                        }
                        String obj = ((String) cb1Var.RAsUl2FVSrh6).subSequence(0, cb1Var.lS5Rgt96tfkO).toString();
                        obj.getClass();
                        cb1Var.dgRBjINgWbAK(obj.lastIndexOf(Y1f8riQaR6yg, obj.length() - 1), o0.dgRBjINgWbAK("Encountered an unknown key '", Y1f8riQaR6yg, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte gPXPFXrUH4XX = cb1Var.gPXPFXrUH4XX();
                    if (gPXPFXrUH4XX == 8 || gPXPFXrUH4XX == 6) {
                        while (true) {
                            byte gPXPFXrUH4XX2 = cb1Var.gPXPFXrUH4XX();
                            if (gPXPFXrUH4XX2 == 1) {
                                cb1Var.Y1f8riQaR6yg();
                            } else {
                                if (gPXPFXrUH4XX2 == 8 || gPXPFXrUH4XX2 == 6) {
                                    arrayList.add(Byte.valueOf(gPXPFXrUH4XX2));
                                } else if (gPXPFXrUH4XX2 == 9) {
                                    if (((Number) zk.kRWHK87H9qm4(arrayList)).byteValue() != 8) {
                                        cb1.x50lh2ztY7Y5(cb1Var, "found ] instead of }", 0, null, 6);
                                        throw null;
                                    }
                                    el.W7ceZOzvrRuI(arrayList);
                                } else if (gPXPFXrUH4XX2 == 7) {
                                    if (((Number) zk.kRWHK87H9qm4(arrayList)).byteValue() != 6) {
                                        cb1.x50lh2ztY7Y5(cb1Var, "found } instead of ]", 0, null, 6);
                                        throw null;
                                    }
                                    el.W7ceZOzvrRuI(arrayList);
                                } else if (gPXPFXrUH4XX2 == 10) {
                                    cb1.x50lh2ztY7Y5(cb1Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                cb1Var.e9gEMXR7LXtO();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        cb1Var.wdg6QnbFHrFF();
                    }
                    EcgxDIVH5in8 = cb1Var.EcgxDIVH5in8();
                } else if (EcgxDIVH5in8) {
                    vi0.ozEBbv0hFTAB(cb1Var, "object");
                    throw null;
                }
            }
        } else if (ordinal != 2) {
            boolean EcgxDIVH5in82 = cb1Var.EcgxDIVH5in8();
            if (cb1Var.lS5Rgt96tfkO()) {
                int i4 = this.aF05bpZJlKEP;
                if (i4 != -1 && !EcgxDIVH5in82) {
                    cb1.x50lh2ztY7Y5(cb1Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i4 + 1;
                this.aF05bpZJlKEP = i;
            } else if (EcgxDIVH5in82) {
                vi0.ozEBbv0hFTAB(cb1Var, "array");
                throw null;
            }
        } else {
            int i5 = this.aF05bpZJlKEP;
            boolean z2 = i5 % 2 != 0;
            if (!z2) {
                cb1Var.RAsUl2FVSrh6(':');
            } else if (i5 != -1) {
                z = cb1Var.EcgxDIVH5in8();
            }
            if (cb1Var.lS5Rgt96tfkO()) {
                if (z2) {
                    int i6 = this.aF05bpZJlKEP;
                    int i7 = cb1Var.lS5Rgt96tfkO;
                    if (i6 == -1) {
                        if (z) {
                            cb1.x50lh2ztY7Y5(cb1Var, "Unexpected leading comma", i7, null, 4);
                            throw null;
                        }
                    } else if (!z) {
                        cb1.x50lh2ztY7Y5(cb1Var, "Expected comma after the key-value pair", i7, null, 4);
                        throw null;
                    }
                }
                i = this.aF05bpZJlKEP + 1;
                this.aF05bpZJlKEP = i;
            } else if (z) {
                vi0.ozEBbv0hFTAB(cb1Var, "object");
                throw null;
            }
        }
        if (fv2Var != fv2.x50lh2ztY7Y5) {
            ((int[]) j4Var.e9gEMXR7LXtO)[j4Var.lS5Rgt96tfkO] = i;
        }
        return i;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final String e6tOsSdd2EFb() {
        return this.e6tOsSdd2EFb.OPXfSBeufaJ8();
    }

    public final lS5Rgt96tfkO jJwa0q7P5wHq() {
        return new um(this.pnx5pC0XzaCw.PxuCJdSBwIXG, this.e6tOsSdd2EFb).RAsUl2FVSrh6();
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final float jyegZNwi31qc() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        String wdg6QnbFHrFF = cb1Var.wdg6QnbFHrFF();
        try {
            float parseFloat = Float.parseFloat(wdg6QnbFHrFF);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            cb1.x50lh2ztY7Y5(cb1Var, vi0.gGoUzNp9JO5I(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            cb1.x50lh2ztY7Y5(cb1Var, o0.dgRBjINgWbAK("Failed to parse type 'float' for input '", wdg6QnbFHrFF, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final op lS5Rgt96tfkO(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ht0 ht0Var = this.pnx5pC0XzaCw;
        fv2 xbgXKYA2cIfu = vi0.xbgXKYA2cIfu(ht0Var, serialDescriptor);
        cb1 cb1Var = this.e6tOsSdd2EFb;
        j4 j4Var = (j4) cb1Var.Y1f8riQaR6yg;
        j4Var.getClass();
        int i = j4Var.lS5Rgt96tfkO + 1;
        j4Var.lS5Rgt96tfkO = i;
        if (i == ((Object[]) j4Var.Y1f8riQaR6yg).length) {
            j4Var.e9gEMXR7LXtO();
        }
        ((Object[]) j4Var.Y1f8riQaR6yg)[i] = serialDescriptor;
        cb1Var.RAsUl2FVSrh6(xbgXKYA2cIfu.rtx2ld2ELZv4);
        if (cb1Var.gPXPFXrUH4XX() != 4) {
            int ordinal = xbgXKYA2cIfu.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new ba2(ht0Var, xbgXKYA2cIfu, cb1Var, serialDescriptor) : this.IAToe7bXGz4N == xbgXKYA2cIfu ? this : new ba2(ht0Var, xbgXKYA2cIfu, cb1Var, serialDescriptor);
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final byte pnx5pC0XzaCw() {
        cb1 cb1Var = this.e6tOsSdd2EFb;
        long rtx2ld2ELZv4 = cb1Var.rtx2ld2ELZv4();
        byte b = (byte) rtx2ld2ELZv4;
        if (rtx2ld2ELZv4 == b) {
            return b;
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Failed to parse byte for input '" + rtx2ld2ELZv4 + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final boolean rtx2ld2ELZv4() {
        boolean z;
        cb1 cb1Var = this.e6tOsSdd2EFb;
        int XL4ISE6Oc65B = cb1Var.XL4ISE6Oc65B(cb1Var.RfyTYNmI9Srp());
        String str = (String) cb1Var.RAsUl2FVSrh6;
        int length = str.length() - XL4ISE6Oc65B;
        if (length >= 4 && XL4ISE6Oc65B != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(XL4ISE6Oc65B + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || mm2.IAToe7bXGz4N(str.charAt(XL4ISE6Oc65B + 4)) != 0) {
                    cb1Var.lS5Rgt96tfkO = XL4ISE6Oc65B + 4;
                    z = true;
                }
            }
        }
        z = false;
        return !z;
    }

    @Override // defpackage.b51, kotlinx.serialization.encoding.Decoder
    public final int wdg6QnbFHrFF(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        cb1 cb1Var = this.e6tOsSdd2EFb;
        return zv.ZbWwgt3aGe7A(serialDescriptor, this.pnx5pC0XzaCw, cb1Var.OPXfSBeufaJ8(), " at path ".concat(((j4) cb1Var.Y1f8riQaR6yg).lS5Rgt96tfkO()));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x50lh2ztY7Y5(KSerializer kSerializer) {
        String message;
        String str;
        ht0 ht0Var = this.pnx5pC0XzaCw;
        cb1 cb1Var = this.e6tOsSdd2EFb;
        j4 j4Var = (j4) cb1Var.Y1f8riQaR6yg;
        kSerializer.getClass();
        try {
        } catch (j61 e) {
            message = e.getMessage();
            message.getClass();
            if (!ia2.jJwa0q7P5wHq(message, "at path", false)) {
            }
        }
        if (!(kSerializer instanceof ko1)) {
            return kSerializer.deserialize(this);
        }
        String QrzZRwfaDlRX = cb1Var.QrzZRwfaDlRX(xi0.BRwzKIf41E4i(ht0Var, ((ko1) kSerializer).getDescriptor()));
        if (QrzZRwfaDlRX != null) {
            try {
                kj0.VhhvGxCb8gfr((ko1) kSerializer, this, QrzZRwfaDlRX);
                throw null;
            } catch (i42 e2) {
                String message2 = e2.getMessage();
                message2.getClass();
                int rxipThha848g = ia2.rxipThha848g(message2, '\n', 0, 6);
                if (rxipThha848g != -1) {
                    message2 = message2.substring(0, rxipThha848g);
                }
                if (ia2.PsecLrZVVK61(message2, ".")) {
                    message2 = message2.substring(0, message2.length() - ".".length());
                }
                String message3 = e2.getMessage();
                message3.getClass();
                String str2 = "";
                int rxipThha848g2 = ia2.rxipThha848g(message3, '\n', 0, 6);
                if (rxipThha848g2 != -1) {
                    str2 = message3.substring(rxipThha848g2 + 1, message3.length());
                }
                cb1.x50lh2ztY7Y5(cb1Var, message2, 0, str2, 2);
                throw null;
            }
        }
        String BRwzKIf41E4i = xi0.BRwzKIf41E4i(ht0Var, ((ko1) kSerializer).getDescriptor());
        lS5Rgt96tfkO jJwa0q7P5wHq = jJwa0q7P5wHq();
        String lS5Rgt96tfkO = ((ko1) kSerializer).getDescriptor().lS5Rgt96tfkO();
        if (!(jJwa0q7P5wHq instanceof TSizfFm2Yiuu)) {
            throw new nt0(vi0.EcgxDIVH5in8(-1, "Expected " + bu1.PxuCJdSBwIXG(TSizfFm2Yiuu.class).TSizfFm2Yiuu() + ", but had " + bu1.PxuCJdSBwIXG(jJwa0q7P5wHq.getClass()).TSizfFm2Yiuu() + " as the serialized body of " + lS5Rgt96tfkO, j4Var.lS5Rgt96tfkO(), null, ht0Var.PxuCJdSBwIXG.TSizfFm2Yiuu ? vi0.Pf0ThKz3j5YS(jJwa0q7P5wHq.toString(), -1).toString() : null));
        }
        TSizfFm2Yiuu tSizfFm2Yiuu = (TSizfFm2Yiuu) jJwa0q7P5wHq;
        lS5Rgt96tfkO ls5rgt96tfko = (lS5Rgt96tfkO) tSizfFm2Yiuu.get(BRwzKIf41E4i);
        try {
            if (ls5rgt96tfko != null) {
                Y1f8riQaR6yg PxuCJdSBwIXG = ot0.PxuCJdSBwIXG(ls5rgt96tfko);
                if (!(PxuCJdSBwIXG instanceof JsonNull)) {
                    str = PxuCJdSBwIXG.PxuCJdSBwIXG();
                    kj0.VhhvGxCb8gfr((ko1) kSerializer, this, str);
                    throw null;
                }
            }
            kj0.VhhvGxCb8gfr((ko1) kSerializer, this, str);
            throw null;
        } catch (i42 e3) {
            String message4 = e3.getMessage();
            message4.getClass();
            throw new nt0(vi0.EcgxDIVH5in8(-1, message4, null, null, ht0Var.PxuCJdSBwIXG.TSizfFm2Yiuu ? vi0.Pf0ThKz3j5YS(tSizfFm2Yiuu.toString(), -1).toString() : null));
        }
        str = null;
        message = e.getMessage();
        message.getClass();
        if (!ia2.jJwa0q7P5wHq(message, "at path", false)) {
            throw e;
        }
        throw new j61(e.getMessage() + " at path: " + j4Var.lS5Rgt96tfkO(), e, e.rtx2ld2ELZv4, e.OPXfSBeufaJ8);
    }
}
