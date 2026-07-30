package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class gp {
    public boolean PxuCJdSBwIXG = true;
    public Object lS5Rgt96tfkO;

    public /* synthetic */ gp(Object obj) {
        this.lS5Rgt96tfkO = obj;
    }

    public void OPXfSBeufaJ8(String str) {
        int i;
        str.getClass();
        um umVar = (um) this.lS5Rgt96tfkO;
        umVar.e9gEMXR7LXtO(umVar.lS5Rgt96tfkO, str.length() + 2);
        char[] cArr = (char[]) umVar.TSizfFm2Yiuu;
        int i2 = umVar.lS5Rgt96tfkO;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = ga2.lS5Rgt96tfkO;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    umVar.e9gEMXR7LXtO(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = ga2.lS5Rgt96tfkO;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) umVar.TSizfFm2Yiuu)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = ga2.PxuCJdSBwIXG[charAt];
                                str2.getClass();
                                umVar.e9gEMXR7LXtO(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) umVar.TSizfFm2Yiuu, i5);
                                int length3 = str2.length() + i5;
                                umVar.lS5Rgt96tfkO = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) umVar.TSizfFm2Yiuu;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                umVar.lS5Rgt96tfkO = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) umVar.TSizfFm2Yiuu)[i5] = charAt;
                    }
                    i5 = i;
                }
                umVar.e9gEMXR7LXtO(i5, 1);
                ((char[]) umVar.TSizfFm2Yiuu)[i5] = '\"';
                umVar.lS5Rgt96tfkO = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        umVar.lS5Rgt96tfkO = i4 + 1;
    }

    public void PxuCJdSBwIXG() {
        this.PxuCJdSBwIXG = false;
    }

    public void RAsUl2FVSrh6(String str) {
        str.getClass();
        ((um) this.lS5Rgt96tfkO).cpQdD2nAriOS(str);
    }

    public void TSizfFm2Yiuu(byte b) {
        ((um) this.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(b));
    }

    public void Y1f8riQaR6yg(char c) {
        um umVar = (um) this.lS5Rgt96tfkO;
        umVar.e9gEMXR7LXtO(umVar.lS5Rgt96tfkO, 1);
        char[] cArr = (char[]) umVar.TSizfFm2Yiuu;
        int i = umVar.lS5Rgt96tfkO;
        umVar.lS5Rgt96tfkO = i + 1;
        cArr[i] = c;
    }

    public void a92UlCVFR9N8(long j) {
        ((um) this.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(j));
    }

    public void e9gEMXR7LXtO(int i) {
        ((um) this.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS5Rgt96tfkO(long j, long j2, ct ctVar) {
        y02 y02Var;
        int i;
        long j3;
        if (ctVar instanceof y02) {
            y02Var = (y02) ctVar;
            int i2 = y02Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y02Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = y02Var.x50lh2ztY7Y5;
                i = y02Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    j3 = 0;
                    if (!this.PxuCJdSBwIXG) {
                        yp2.Companion.getClass();
                        return new yp2(j3);
                    }
                    l12 l12Var = (l12) this.lS5Rgt96tfkO;
                    if (l12Var.OPXfSBeufaJ8) {
                        yp2.Companion.getClass();
                        j3 = yp2.Y1f8riQaR6yg(j2, j3);
                        return new yp2(j3);
                    }
                    y02Var.dgRBjINgWbAK = j2;
                    y02Var.r3s1LDPKFs1S = 1;
                    obj = l12Var.PxuCJdSBwIXG(j2, y02Var);
                    su suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = y02Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                }
                j3 = ((yp2) obj).PxuCJdSBwIXG;
                j3 = yp2.Y1f8riQaR6yg(j2, j3);
                return new yp2(j3);
            }
        }
        y02Var = new y02(this, ctVar);
        Object obj2 = y02Var.x50lh2ztY7Y5;
        i = y02Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
        j3 = ((yp2) obj2).PxuCJdSBwIXG;
        j3 = yp2.Y1f8riQaR6yg(j2, j3);
        return new yp2(j3);
    }

    public void rtx2ld2ELZv4(short s) {
        ((um) this.lS5Rgt96tfkO).cpQdD2nAriOS(String.valueOf(s));
    }

    public void dgRBjINgWbAK() {
    }

    public void wdg6QnbFHrFF() {
    }
}
