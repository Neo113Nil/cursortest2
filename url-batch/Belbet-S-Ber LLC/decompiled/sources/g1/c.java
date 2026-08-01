package g1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f1620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1621g;
    public final /* synthetic */ int h;
    public final /* synthetic */ e i;

    public c(e eVar, List list, List list2, int i) {
        this.i = eVar;
        this.f1620f = list;
        this.f1621g = list2;
        this.h = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r6[(r3 + 1) + r8] > r6[(r3 - 1) + r8]) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        t tVar;
        int i4;
        s sVar;
        int i5;
        int i6;
        t tVar2;
        t tVar3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        a0.a aVar = new a0.a(13, this);
        int size = this.f1620f.size();
        int size2 = this.f1621g.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        s sVar2 = new s();
        int i22 = 0;
        sVar2.f1788a = 0;
        sVar2.f1789b = size;
        sVar2.f1790c = 0;
        sVar2.d = size2;
        arrayList2.add(sVar2);
        int i23 = size + size2;
        int i24 = 1;
        int i25 = (((i23 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i25];
        int i26 = i25 / 2;
        int[] iArr2 = new int[i25];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            s sVar3 = (s) arrayList2.remove(arrayList2.size() - i24);
            if (sVar3.b() >= i24 && sVar3.a() >= i24) {
                int a5 = ((sVar3.a() + sVar3.b()) + i24) / 2;
                int i27 = i24 + i26;
                iArr[i27] = sVar3.f1788a;
                iArr2[i27] = sVar3.f1789b;
                int i28 = i22;
                while (i28 < a5) {
                    int i29 = Math.abs(sVar3.b() - sVar3.a()) % 2 == i24 ? i24 : i22;
                    int b2 = sVar3.b() - sVar3.a();
                    int i30 = -i28;
                    int i31 = i30;
                    while (true) {
                        if (i31 > i28) {
                            i5 = i22;
                            i = i26;
                            i6 = a5;
                            tVar2 = null;
                            break;
                        }
                        if (i31 != i30) {
                            if (i31 != i28) {
                                i12 = i31;
                            } else {
                                i12 = i31;
                            }
                            i13 = iArr[(i12 - 1) + i26];
                            i14 = i13 + 1;
                            i = i26;
                            i15 = ((i14 - sVar3.f1788a) + sVar3.f1790c) - i12;
                            if (i28 == 0 && i14 == i13) {
                                i16 = i14;
                                i17 = i15 - 1;
                            } else {
                                i16 = i14;
                                i17 = i15;
                            }
                            int i32 = a5;
                            i18 = i15;
                            i19 = i16;
                            i6 = i32;
                            i20 = i29;
                            while (i19 < sVar3.f1789b && i18 < sVar3.d && aVar.C(i19, i18)) {
                                i19++;
                                i18++;
                            }
                            iArr[i12 + i] = i19;
                            if (i20 == 0) {
                                int i33 = b2 - i12;
                                i21 = b2;
                                if (i33 >= i30 + 1 && i33 <= i28 - 1 && iArr2[i33 + i] <= i19) {
                                    tVar2 = new t();
                                    tVar2.f1792a = i13;
                                    tVar2.f1793b = i17;
                                    tVar2.f1794c = i19;
                                    tVar2.d = i18;
                                    i5 = 0;
                                    tVar2.f1795e = false;
                                    break;
                                }
                            } else {
                                i21 = b2;
                            }
                            i22 = 0;
                            i31 = i12 + 2;
                            i26 = i;
                            a5 = i6;
                            i29 = i20;
                            b2 = i21;
                        } else {
                            i12 = i31;
                        }
                        i13 = iArr[i12 + 1 + i26];
                        i14 = i13;
                        i = i26;
                        i15 = ((i14 - sVar3.f1788a) + sVar3.f1790c) - i12;
                        if (i28 == 0) {
                        }
                        i16 = i14;
                        i17 = i15;
                        int i322 = a5;
                        i18 = i15;
                        i19 = i16;
                        i6 = i322;
                        i20 = i29;
                        while (i19 < sVar3.f1789b) {
                            i19++;
                            i18++;
                        }
                        iArr[i12 + i] = i19;
                        if (i20 == 0) {
                        }
                        i22 = 0;
                        i31 = i12 + 2;
                        i26 = i;
                        a5 = i6;
                        i29 = i20;
                        b2 = i21;
                    }
                    if (tVar2 != null) {
                        tVar = tVar2;
                        break;
                    }
                    int i34 = (sVar3.b() - sVar3.a()) % 2 == 0 ? 1 : i5;
                    int b5 = sVar3.b() - sVar3.a();
                    int i35 = i30;
                    while (true) {
                        if (i35 > i28) {
                            tVar3 = null;
                            break;
                        }
                        if (i35 == i30 || (i35 != i28 && iArr2[i35 + 1 + i] < iArr2[(i35 - 1) + i])) {
                            i7 = iArr2[i35 + 1 + i];
                            i8 = i7;
                        } else {
                            i7 = iArr2[(i35 - 1) + i];
                            i8 = i7 - 1;
                        }
                        int i36 = sVar3.d - ((sVar3.f1789b - i8) - i35);
                        if (i28 == 0 || i8 != i7) {
                            i9 = i36;
                        } else {
                            i9 = i36;
                            i36++;
                        }
                        int i37 = i9;
                        int i38 = i34;
                        int i39 = i8;
                        int i40 = i37;
                        int i41 = b5;
                        while (i39 > sVar3.f1788a && i40 > sVar3.f1790c) {
                            i10 = i35;
                            if (!aVar.C(i39 - 1, i40 - 1)) {
                                break;
                            }
                            i39--;
                            i40--;
                            i35 = i10;
                        }
                        i10 = i35;
                        iArr2[i10 + i] = i39;
                        if (i38 != 0 && (i11 = i41 - i10) >= i30 && i11 <= i28 && iArr[i11 + i] >= i39) {
                            tVar3 = new t();
                            tVar3.f1792a = i39;
                            tVar3.f1793b = i40;
                            tVar3.f1794c = i7;
                            tVar3.d = i36;
                            tVar3.f1795e = true;
                            break;
                        }
                        i35 = i10 + 2;
                        i34 = i38;
                        b5 = i41;
                    }
                    if (tVar3 != null) {
                        tVar = tVar3;
                        break;
                    }
                    i28++;
                    i26 = i;
                    a5 = i6;
                    i24 = 1;
                    i22 = 0;
                }
            }
            i = i26;
            tVar = null;
            if (tVar != null) {
                if (tVar.a() > 0) {
                    int i42 = tVar.d;
                    int i43 = tVar.f1793b;
                    int i44 = i42 - i43;
                    int i45 = tVar.f1794c;
                    int i46 = tVar.f1792a;
                    int i47 = i45 - i46;
                    arrayList.add(i44 != i47 ? tVar.f1795e ? new p(i46, i43, tVar.a()) : i44 > i47 ? new p(i46, i43 + 1, tVar.a()) : new p(i46 + 1, i43, tVar.a()) : new p(i46, i43, i47));
                }
                if (arrayList3.isEmpty()) {
                    sVar = new s();
                    i4 = 1;
                } else {
                    i4 = 1;
                    sVar = (s) arrayList3.remove(arrayList3.size() - 1);
                }
                sVar.f1788a = sVar3.f1788a;
                sVar.f1790c = sVar3.f1790c;
                sVar.f1789b = tVar.f1792a;
                sVar.d = tVar.f1793b;
                arrayList2.add(sVar);
                sVar3.f1789b = sVar3.f1789b;
                sVar3.d = sVar3.d;
                sVar3.f1788a = tVar.f1794c;
                sVar3.f1790c = tVar.d;
                arrayList2.add(sVar3);
            } else {
                i4 = 1;
                arrayList3.add(sVar3);
            }
            i24 = i4;
            i26 = i;
            i22 = 0;
        }
        Collections.sort(arrayList, b.f1614c);
        this.i.f1636c.execute(new androidx.fragment.app.e(this, new q(aVar, arrayList, iArr, iArr2)));
    }
}
