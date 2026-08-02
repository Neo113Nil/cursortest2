package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class etr implements dcy {
    @Override // defpackage.dcy
    public final Object a(ddi ddiVar) {
        int i;
        eto etoVar;
        int i2;
        dbg dbgVar = (dbg) ddiVar.d();
        jkj k = etn.a.k();
        String str = dbgVar.a;
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        etn etnVar = (etn) jkpVar;
        str.getClass();
        int i3 = 1;
        etnVar.b |= 1;
        etnVar.c = str;
        String str2 = dbgVar.c;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        etn etnVar2 = (etn) jkpVar2;
        str2.getClass();
        int i4 = 4;
        etnVar2.b |= 4;
        etnVar2.e = str2;
        boolean z = dbgVar.f;
        if (!jkpVar2.M()) {
            k.t();
        }
        jkp jkpVar3 = k.b;
        etn etnVar3 = (etn) jkpVar3;
        etnVar3.b |= 8;
        etnVar3.h = z;
        long j = dbgVar.g;
        if (!jkpVar3.M()) {
            k.t();
        }
        etn etnVar4 = (etn) k.b;
        etnVar4.b |= 16;
        etnVar4.i = j;
        byte[] bArr = dbgVar.b;
        int i5 = 2;
        if (bArr != null) {
            jjq r = jjq.r(bArr);
            if (!k.b.M()) {
                k.t();
            }
            etn etnVar5 = (etn) k.b;
            r.getClass();
            etnVar5.b |= 2;
            etnVar5.d = r;
        }
        dbf[] dbfVarArr = dbgVar.d;
        int length = dbfVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            dbf dbfVar = dbfVarArr[i6];
            dbn[] dbnVarArr = dbfVar.b;
            int length2 = dbnVarArr.length;
            int i7 = 0;
            while (i7 < length2) {
                dbn dbnVar = dbnVarArr[i7];
                int i8 = dbnVar.g;
                if (i8 == i3) {
                    i = i5;
                    int i9 = i3;
                    jkj k2 = eto.a.k();
                    String str3 = dbnVar.a;
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    jkp jkpVar4 = k2.b;
                    eto etoVar2 = (eto) jkpVar4;
                    str3.getClass();
                    etoVar2.b |= 1;
                    etoVar2.e = str3;
                    i3 = i9;
                    if (i8 != i3) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j2 = dbnVar.b;
                    if (!jkpVar4.M()) {
                        k2.t();
                    }
                    eto etoVar3 = (eto) k2.b;
                    etoVar3.c = i3;
                    etoVar3.d = Long.valueOf(j2);
                    etoVar = (eto) k2.q();
                } else if (i8 != i5) {
                    if (i8 == 3) {
                        i2 = i3;
                        jkj k3 = eto.a.k();
                        String str4 = dbnVar.a;
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        jkp jkpVar5 = k3.b;
                        eto etoVar4 = (eto) jkpVar5;
                        str4.getClass();
                        etoVar4.b |= 1;
                        etoVar4.e = str4;
                        if (i8 != 3) {
                            throw new IllegalArgumentException("Not a double type");
                        }
                        double d = dbnVar.d;
                        if (!jkpVar5.M()) {
                            k3.t();
                        }
                        eto etoVar5 = (eto) k3.b;
                        etoVar5.c = 3;
                        etoVar5.d = Double.valueOf(d);
                        etoVar = (eto) k3.q();
                    } else if (i8 == i4) {
                        i2 = i3;
                        jkj k4 = eto.a.k();
                        String str5 = dbnVar.a;
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        eto etoVar6 = (eto) k4.b;
                        str5.getClass();
                        etoVar6.b |= 1;
                        etoVar6.e = str5;
                        if (i8 != i4) {
                            throw new IllegalArgumentException("Not a String type");
                        }
                        String str6 = dbnVar.e;
                        oy.at(str6);
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        eto etoVar7 = (eto) k4.b;
                        etoVar7.c = i4;
                        etoVar7.d = str6;
                        etoVar = (eto) k4.q();
                    } else {
                        if (i8 != 5) {
                            throw new IllegalArgumentException(a.Y(i8, "Unrecognized flag type: "));
                        }
                        jkj k5 = eto.a.k();
                        String str7 = dbnVar.a;
                        i2 = i3;
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        eto etoVar8 = (eto) k5.b;
                        str7.getClass();
                        etoVar8.b |= 1;
                        etoVar8.e = str7;
                        if (i8 != 5) {
                            throw new IllegalArgumentException("Not a bytes type");
                        }
                        byte[] bArr2 = dbnVar.f;
                        oy.at(bArr2);
                        jjq r2 = jjq.r(bArr2);
                        if (!k5.b.M()) {
                            k5.t();
                        }
                        eto etoVar9 = (eto) k5.b;
                        r2.getClass();
                        etoVar9.c = 5;
                        etoVar9.d = r2;
                        etoVar = (eto) k5.q();
                    }
                    i3 = i2;
                    i = 2;
                } else {
                    int i10 = i3;
                    jkj k6 = eto.a.k();
                    String str8 = dbnVar.a;
                    if (!k6.b.M()) {
                        k6.t();
                    }
                    jkp jkpVar6 = k6.b;
                    eto etoVar10 = (eto) jkpVar6;
                    str8.getClass();
                    etoVar10.b |= 1;
                    etoVar10.e = str8;
                    i = 2;
                    if (i8 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = dbnVar.c;
                    if (!jkpVar6.M()) {
                        k6.t();
                    }
                    eto etoVar11 = (eto) k6.b;
                    etoVar11.c = 2;
                    etoVar11.d = Boolean.valueOf(z2);
                    etoVar = (eto) k6.q();
                    i3 = i10;
                }
                if (!k.b.M()) {
                    k.t();
                }
                etn etnVar6 = (etn) k.b;
                etoVar.getClass();
                jkx jkxVar = etnVar6.f;
                if (!jkxVar.c()) {
                    etnVar6.f = jkp.A(jkxVar);
                }
                etnVar6.f.add(etoVar);
                i7++;
                i5 = i;
                i4 = 4;
            }
            int i11 = i5;
            String[] strArr = dbfVar.c;
            if (strArr != null) {
                for (String str9 : strArr) {
                    if (!k.b.M()) {
                        k.t();
                    }
                    etn etnVar7 = (etn) k.b;
                    str9.getClass();
                    jkx jkxVar2 = etnVar7.g;
                    if (!jkxVar2.c()) {
                        etnVar7.g = jkp.A(jkxVar2);
                    }
                    etnVar7.g.add(str9);
                }
            }
            i6++;
            i5 = i11;
            i4 = 4;
        }
        return (etn) k.q();
    }
}
