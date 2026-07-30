package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vg2 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ eh2 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(eh2 eh2Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = eh2Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i;
        v8 v8Var;
        qk qkVar;
        Object nkVar;
        Object obj2;
        CharSequence text;
        CharSequence charSequence;
        int i2;
        Parcel parcel;
        int i3;
        int i4;
        v8 v8Var2;
        int i5 = this.x50lh2ztY7Y5;
        mi0 mi0Var = mi0.rtx2ld2ELZv4;
        su suVar = su.rtx2ld2ELZv4;
        eh2 eh2Var = this.r3s1LDPKFs1S;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i5) {
            case 0:
                int i6 = this.cpQdD2nAriOS;
                if (i6 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    if (eh2Var.S9EYkSpbGuxq(this) == suVar) {
                    }
                } else if (i6 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i6 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                vi1 PxuCJdSBwIXG = eh2.PxuCJdSBwIXG(eh2Var);
                if (PxuCJdSBwIXG != null) {
                    String str = (String) PxuCJdSBwIXG.rtx2ld2ELZv4;
                    long j = ((vi2) PxuCJdSBwIXG.OPXfSBeufaJ8).PxuCJdSBwIXG;
                    cn1 cn1Var = eh2Var.OPXfSBeufaJ8;
                    if (cn1Var != null) {
                        this.cpQdD2nAriOS = 2;
                        Object OYiFbU3x63rc = (str.length() == 0 || vi2.TSizfFm2Yiuu(j)) ? no2Var : fx1.OYiFbU3x63rc(cn1Var.PxuCJdSBwIXG, new e4(cn1Var, new OPXfSBeufaJ8(j, null, cn1Var, str), (bt) null, 7), this);
                        if (OYiFbU3x63rc != suVar) {
                            OYiFbU3x63rc = no2Var;
                        }
                        if (OYiFbU3x63rc == suVar) {
                        }
                    }
                }
                break;
            case 1:
                int i7 = this.cpQdD2nAriOS;
                if (i7 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (vi2.TSizfFm2Yiuu(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO) || !eh2Var.wdg6QnbFHrFF()) {
                        i = 1;
                        v8Var = null;
                    } else {
                        v8Var = sj0.jyegZNwi31qc(eh2Var.r3s1LDPKFs1S());
                        v8 kpCQ9veP6n3I = sj0.kpCQ9veP6n3I(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                        v8 aF05bpZJlKEP = sj0.aF05bpZJlKEP(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                        s8 s8Var = new s8(kpCQ9veP6n3I);
                        s8Var.PxuCJdSBwIXG(aF05bpZJlKEP);
                        v8 lS5Rgt96tfkO = s8Var.lS5Rgt96tfkO();
                        int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO);
                        eh2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(eh2.e9gEMXR7LXtO(lS5Rgt96tfkO, jh0.rtx2ld2ELZv4(a92UlCVFR9N8, a92UlCVFR9N8)));
                        eh2Var.XL4ISE6Oc65B(mi0Var);
                        i = 1;
                        eh2Var.PxuCJdSBwIXG.e9gEMXR7LXtO = true;
                    }
                    if (v8Var != null && (qkVar = eh2Var.RAsUl2FVSrh6) != null) {
                        nk xfACYKDMU6Dj = bs0.xfACYKDMU6Dj(v8Var);
                        this.cpQdD2nAriOS = i;
                        ((x0) qkVar).PxuCJdSBwIXG(xfACYKDMU6Dj);
                        if (no2Var == suVar) {
                        }
                    }
                } else if (i7 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
            default:
                int i8 = this.cpQdD2nAriOS;
                if (i8 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    qk qkVar2 = eh2Var.RAsUl2FVSrh6;
                    if (qkVar2 != null) {
                        this.cpQdD2nAriOS = 1;
                        ClipData primaryClip = ((x0) qkVar2).PxuCJdSBwIXG.PxuCJdSBwIXG().getPrimaryClip();
                        nkVar = primaryClip != null ? new nk(primaryClip) : null;
                        if (nkVar == suVar) {
                        }
                    }
                } else if (i8 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    nkVar = obj;
                } else if (i8 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    obj2 = obj;
                    v8Var2 = (v8) obj2;
                    if (v8Var2 != null && eh2Var.wdg6QnbFHrFF()) {
                        s8 s8Var2 = new s8(sj0.kpCQ9veP6n3I(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                        s8Var2.PxuCJdSBwIXG(v8Var2);
                        v8 lS5Rgt96tfkO2 = s8Var2.lS5Rgt96tfkO();
                        v8 aF05bpZJlKEP2 = sj0.aF05bpZJlKEP(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                        s8 s8Var3 = new s8(lS5Rgt96tfkO2);
                        s8Var3.PxuCJdSBwIXG(aF05bpZJlKEP2);
                        v8 lS5Rgt96tfkO3 = s8Var3.lS5Rgt96tfkO();
                        int length = v8Var2.OPXfSBeufaJ8.length() + vi2.a92UlCVFR9N8(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO);
                        eh2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(eh2.e9gEMXR7LXtO(lS5Rgt96tfkO3, jh0.rtx2ld2ELZv4(length, length)));
                        eh2Var.XL4ISE6Oc65B(mi0Var);
                        eh2Var.PxuCJdSBwIXG.e9gEMXR7LXtO = true;
                    }
                    break;
                }
                nk nkVar2 = (nk) nkVar;
                if (nkVar2 != null) {
                    this.cpQdD2nAriOS = 2;
                    int i9 = 0;
                    ClipData.Item itemAt = nkVar2.PxuCJdSBwIXG.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        obj2 = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i10 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i10];
                                if (cs0.wdg6QnbFHrFF(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    cw cwVar = new cw();
                                    Parcel obtain = Parcel.obtain();
                                    cwVar.PxuCJdSBwIXG = obtain;
                                    byte[] decode = Base64.decode(value, i9);
                                    charSequence = text;
                                    obtain.unmarshall(decode, i9, decode.length);
                                    obtain.setDataPosition(i9);
                                    Parcel parcel2 = cwVar.PxuCJdSBwIXG;
                                    hl.Companion.getClass();
                                    long j2 = hl.RAsUl2FVSrh6;
                                    hj2.Companion.getClass();
                                    long j3 = j2;
                                    long j4 = j3;
                                    long j5 = hj2.TSizfFm2Yiuu;
                                    long j6 = j5;
                                    xc0 xc0Var = null;
                                    rc0 rc0Var = null;
                                    tc0 tc0Var = null;
                                    String str2 = null;
                                    uc ucVar = null;
                                    th2 th2Var = null;
                                    if2 if2Var = null;
                                    w42 w42Var = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte readByte = parcel2.readByte();
                                            i2 = i9;
                                            if (readByte == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    j3 = cwVar.PxuCJdSBwIXG();
                                                    i9 = i2;
                                                }
                                            } else if (readByte == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    j5 = cwVar.lS5Rgt96tfkO();
                                                    i9 = i2;
                                                }
                                            } else if (readByte == 3) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    xc0Var = new xc0(parcel2.readInt());
                                                    i9 = i2;
                                                }
                                            } else if (readByte == 4) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte readByte2 = parcel2.readByte();
                                                    if (readByte2 == 0) {
                                                        rc0.Companion.getClass();
                                                    } else if (readByte2 == 1) {
                                                        rc0.Companion.getClass();
                                                        i4 = 1;
                                                        rc0 rc0Var2 = new rc0(i4);
                                                        i9 = i2;
                                                        rc0Var = rc0Var2;
                                                    } else {
                                                        rc0.Companion.getClass();
                                                    }
                                                    i4 = i2;
                                                    rc0 rc0Var22 = new rc0(i4);
                                                    i9 = i2;
                                                    rc0Var = rc0Var22;
                                                }
                                            } else if (readByte != 5) {
                                                if (readByte == 6) {
                                                    str2 = parcel2.readString();
                                                } else if (readByte == 7) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        j6 = cwVar.lS5Rgt96tfkO();
                                                    }
                                                } else if (readByte == 8) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        i9 = i2;
                                                        ucVar = new uc(parcel2.readFloat());
                                                    }
                                                } else if (readByte == 9) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        th2Var = new th2(parcel2.readFloat(), parcel2.readFloat());
                                                    }
                                                } else if (readByte == 10) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        j4 = cwVar.PxuCJdSBwIXG();
                                                    }
                                                } else if (readByte != 11) {
                                                    parcel = parcel2;
                                                    if (readByte != 12) {
                                                        i9 = i2;
                                                        parcel2 = parcel;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        i9 = i2;
                                                        parcel2 = parcel;
                                                        w42Var = new w42(parcel.readFloat(), cwVar.PxuCJdSBwIXG(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L));
                                                    }
                                                } else if (parcel2.dataAvail() >= 4) {
                                                    int readInt = parcel2.readInt();
                                                    if2.Companion.getClass();
                                                    int i11 = (readInt & 2) != 0 ? 1 : i2;
                                                    int i12 = (readInt & 1) != 0 ? 1 : i2;
                                                    if2 if2Var2 = if2.Y1f8riQaR6yg;
                                                    parcel = parcel2;
                                                    if2 if2Var3 = if2.TSizfFm2Yiuu;
                                                    if (i11 != 0 && i12 != 0) {
                                                        List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(if2Var2, if2Var3);
                                                        Integer valueOf = Integer.valueOf(i2);
                                                        int size = D0aTLcX6Uhyo.size();
                                                        int i13 = i2;
                                                        while (i13 < size) {
                                                            valueOf = Integer.valueOf(((if2) D0aTLcX6Uhyo.get(i13)).PxuCJdSBwIXG | valueOf.intValue());
                                                            i13++;
                                                            D0aTLcX6Uhyo = D0aTLcX6Uhyo;
                                                        }
                                                        if2Var = new if2(valueOf.intValue());
                                                    } else if (i11 != 0) {
                                                        if2Var = if2Var2;
                                                    } else {
                                                        if (i12 == 0) {
                                                            if2Var3 = if2.lS5Rgt96tfkO;
                                                        }
                                                        if2Var = if2Var3;
                                                    }
                                                    i9 = i2;
                                                    parcel2 = parcel;
                                                }
                                                i9 = i2;
                                            } else if (parcel2.dataAvail() >= 1) {
                                                byte readByte3 = parcel2.readByte();
                                                if (readByte3 == 0) {
                                                    tc0.Companion.getClass();
                                                } else {
                                                    if (readByte3 == 1) {
                                                        tc0.Companion.getClass();
                                                        i3 = 65535;
                                                    } else if (readByte3 == 3) {
                                                        tc0.Companion.getClass();
                                                        i3 = 2;
                                                    } else if (readByte3 == 2) {
                                                        tc0.Companion.getClass();
                                                        i3 = 1;
                                                    } else {
                                                        tc0.Companion.getClass();
                                                    }
                                                    tc0 tc0Var2 = new tc0(i3);
                                                    i9 = i2;
                                                    tc0Var = tc0Var2;
                                                }
                                                i3 = i2;
                                                tc0 tc0Var22 = new tc0(i3);
                                                i9 = i2;
                                                tc0Var = tc0Var22;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                    }
                                    arrayList.add(new u8(spanStart, spanEnd, new q82(j3, j5, xc0Var, rc0Var, tc0Var, (pb0) null, str2, j6, ucVar, th2Var, (p21) null, j4, if2Var, w42Var, 49152)));
                                } else {
                                    charSequence = text;
                                    i2 = i9;
                                }
                                if (i10 != length2) {
                                    i10++;
                                    text = charSequence;
                                    i9 = i2;
                                }
                            }
                        } else {
                            charSequence = text;
                        }
                        String obj3 = charSequence.toString();
                        v8 v8Var3 = w8.PxuCJdSBwIXG;
                        obj2 = new v8(arrayList.isEmpty() ? null : arrayList, obj3);
                    } else {
                        obj2 = new v8(text.toString());
                    }
                    if (obj2 == suVar) {
                    }
                    v8Var2 = (v8) obj2;
                    if (v8Var2 != null) {
                        s8 s8Var22 = new s8(sj0.kpCQ9veP6n3I(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                        s8Var22.PxuCJdSBwIXG(v8Var2);
                        v8 lS5Rgt96tfkO22 = s8Var22.lS5Rgt96tfkO();
                        v8 aF05bpZJlKEP22 = sj0.aF05bpZJlKEP(eh2Var.r3s1LDPKFs1S(), eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length());
                        s8 s8Var32 = new s8(lS5Rgt96tfkO22);
                        s8Var32.PxuCJdSBwIXG(aF05bpZJlKEP22);
                        v8 lS5Rgt96tfkO32 = s8Var32.lS5Rgt96tfkO();
                        int length3 = v8Var2.OPXfSBeufaJ8.length() + vi2.a92UlCVFR9N8(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO);
                        eh2Var.TSizfFm2Yiuu.OPXfSBeufaJ8(eh2.e9gEMXR7LXtO(lS5Rgt96tfkO32, jh0.rtx2ld2ELZv4(length3, length3)));
                        eh2Var.XL4ISE6Oc65B(mi0Var);
                        eh2Var.PxuCJdSBwIXG.e9gEMXR7LXtO = true;
                    }
                }
                break;
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        eh2 eh2Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new vg2(eh2Var, btVar, 0);
            case 1:
                return new vg2(eh2Var, btVar, 1);
            default:
                return new vg2(eh2Var, btVar, 2);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                long j = ((bf1) obj).PxuCJdSBwIXG;
                return new vg2(this.r3s1LDPKFs1S, (bt) obj2, 0).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((vg2) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            default:
                return ((vg2) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
        }
    }
}
