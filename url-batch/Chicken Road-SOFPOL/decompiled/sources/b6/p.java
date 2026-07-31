package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements d7.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d7.g f1416e;

    public /* synthetic */ p(d7.g gVar, int i) {
        this.f1415d = i;
        this.f1416e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    @Override // d7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, g6.c cVar) {
        o oVar;
        int i;
        r rVar;
        int i8;
        s sVar;
        int i9;
        t tVar;
        int i10;
        u uVar;
        int i11;
        v vVar;
        int i12;
        y3.o oVar2;
        int i13;
        switch (this.f1415d) {
            case 0:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i14 = oVar.f1401h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        oVar.f1401h = i14 - Integer.MIN_VALUE;
                        Object obj2 = oVar.f1400g;
                        i = oVar.f1401h;
                        if (i != 0) {
                            s6.a.K(obj2);
                            Boolean bool = (Boolean) ((b4.a) obj).c(w.f1483h);
                            Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                            oVar.f1401h = 1;
                            Object a8 = this.f1416e.a(valueOf, oVar);
                            h6.a aVar = h6.a.f3204d;
                            if (a8 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj2);
                        }
                        return c6.m.f1757a;
                    }
                }
                oVar = new o(this, cVar);
                Object obj22 = oVar.f1400g;
                i = oVar.f1401h;
                if (i != 0) {
                }
                return c6.m.f1757a;
            case 1:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i15 = rVar.f1437h;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        rVar.f1437h = i15 - Integer.MIN_VALUE;
                        Object obj3 = rVar.f1436g;
                        i8 = rVar.f1437h;
                        if (i8 != 0) {
                            s6.a.K(obj3);
                            Integer num = (Integer) ((b4.a) obj).c(w.i);
                            Integer num2 = new Integer(num != null ? num.intValue() : 1);
                            rVar.f1437h = 1;
                            Object a9 = this.f1416e.a(num2, rVar);
                            h6.a aVar2 = h6.a.f3204d;
                            if (a9 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj3);
                        }
                        return c6.m.f1757a;
                    }
                }
                rVar = new r(this, cVar);
                Object obj32 = rVar.f1436g;
                i8 = rVar.f1437h;
                if (i8 != 0) {
                }
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (cVar instanceof s) {
                    sVar = (s) cVar;
                    int i16 = sVar.f1447h;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        sVar.f1447h = i16 - Integer.MIN_VALUE;
                        Object obj4 = sVar.f1446g;
                        i9 = sVar.f1447h;
                        if (i9 != 0) {
                            s6.a.K(obj4);
                            Integer num3 = (Integer) ((b4.a) obj).c(w.f1484j);
                            Integer num4 = new Integer(num3 != null ? num3.intValue() : 0);
                            sVar.f1447h = 1;
                            Object a10 = this.f1416e.a(num4, sVar);
                            h6.a aVar3 = h6.a.f3204d;
                            if (a10 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj4);
                        }
                        return c6.m.f1757a;
                    }
                }
                sVar = new s(this, cVar);
                Object obj42 = sVar.f1446g;
                i9 = sVar.f1447h;
                if (i9 != 0) {
                }
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i17 = tVar.f1454h;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        tVar.f1454h = i17 - Integer.MIN_VALUE;
                        Object obj5 = tVar.f1453g;
                        i10 = tVar.f1454h;
                        if (i10 != 0) {
                            s6.a.K(obj5);
                            Integer num5 = (Integer) ((b4.a) obj).c(w.f1485k);
                            Integer num6 = new Integer(num5 != null ? num5.intValue() : 0);
                            tVar.f1454h = 1;
                            Object a11 = this.f1416e.a(num6, tVar);
                            h6.a aVar4 = h6.a.f3204d;
                            if (a11 == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj5);
                        }
                        return c6.m.f1757a;
                    }
                }
                tVar = new t(this, cVar);
                Object obj52 = tVar.f1453g;
                i10 = tVar.f1454h;
                if (i10 != 0) {
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                if (cVar instanceof u) {
                    uVar = (u) cVar;
                    int i18 = uVar.f1464h;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        uVar.f1464h = i18 - Integer.MIN_VALUE;
                        Object obj6 = uVar.f1463g;
                        i11 = uVar.f1464h;
                        if (i11 != 0) {
                            s6.a.K(obj6);
                            Integer num7 = (Integer) ((b4.a) obj).c(w.f1486l);
                            Integer num8 = new Integer(num7 != null ? num7.intValue() : 0);
                            uVar.f1464h = 1;
                            Object a12 = this.f1416e.a(num8, uVar);
                            h6.a aVar5 = h6.a.f3204d;
                            if (a12 == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj6);
                        }
                        return c6.m.f1757a;
                    }
                }
                uVar = new u(this, cVar);
                Object obj62 = uVar.f1463g;
                i11 = uVar.f1464h;
                if (i11 != 0) {
                }
                return c6.m.f1757a;
            case 5:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i19 = vVar.f1474h;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        vVar.f1474h = i19 - Integer.MIN_VALUE;
                        Object obj7 = vVar.f1473g;
                        i12 = vVar.f1474h;
                        if (i12 != 0) {
                            s6.a.K(obj7);
                            Integer num9 = (Integer) ((b4.a) obj).c(w.f1487m);
                            Integer num10 = new Integer(num9 != null ? num9.intValue() : 0);
                            vVar.f1474h = 1;
                            Object a13 = this.f1416e.a(num10, vVar);
                            h6.a aVar6 = h6.a.f3204d;
                            if (a13 == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj7);
                        }
                        return c6.m.f1757a;
                    }
                }
                vVar = new v(this, cVar);
                Object obj72 = vVar.f1473g;
                i12 = vVar.f1474h;
                if (i12 != 0) {
                }
                return c6.m.f1757a;
            default:
                if (cVar instanceof y3.o) {
                    oVar2 = (y3.o) cVar;
                    int i20 = oVar2.f8914h;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        oVar2.f8914h = i20 - Integer.MIN_VALUE;
                        Object obj8 = oVar2.f8913g;
                        i13 = oVar2.f8914h;
                        if (i13 != 0) {
                            s6.a.K(obj8);
                            y3.s0 s0Var = (y3.s0) obj;
                            if (s0Var instanceof y3.n0) {
                                throw ((y3.n0) s0Var).f8912b;
                            }
                            if (!(s0Var instanceof y3.c)) {
                                if ((s0Var instanceof y3.k0) || (s0Var instanceof y3.t0) || (s0Var instanceof y3.m0)) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new a5.c();
                            }
                            Object obj9 = ((y3.c) s0Var).f8850b;
                            oVar2.f8914h = 1;
                            Object a14 = this.f1416e.a(obj9, oVar2);
                            h6.a aVar7 = h6.a.f3204d;
                            if (a14 == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj8);
                        }
                        return c6.m.f1757a;
                    }
                }
                oVar2 = new y3.o(this, cVar);
                Object obj82 = oVar2.f8913g;
                i13 = oVar2.f8914h;
                if (i13 != 0) {
                }
                return c6.m.f1757a;
        }
    }
}
