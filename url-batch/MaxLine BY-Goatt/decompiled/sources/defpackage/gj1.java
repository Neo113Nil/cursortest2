package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.aa2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gj1 extends pr2 implements Function2 {
    public final /* synthetic */ int m = 0;
    public int n;
    public int o;
    public int p;
    public int q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(ut1[] ut1VarArr, f03 f03Var, uy2 uy2Var, o30 o30Var) {
        super(2, o30Var);
        this.u = ut1VarArr;
        this.v = f03Var;
        this.w = uy2Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                gj1 gj1Var = new gj1((String) obj2, (ij1) this.s, o30Var);
                gj1Var.v = obj;
                return gj1Var;
            default:
                return new gj1((ut1[]) this.u, (f03) this.v, (uy2) obj2, o30Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((gj1) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((gj1) create((d32) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (defpackage.f03.c(r9, r8, r3, r33) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r3 = r5;
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ac, code lost:
    
        if (r0 == r8) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5 A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:40:0x00b9, B:41:0x02b0, B:52:0x00d5, B:54:0x023b, B:56:0x01f5, B:64:0x0233, B:65:0x023f, B:67:0x0247, B:68:0x024c, B:70:0x0257, B:72:0x027f, B:74:0x0289, B:78:0x02aa, B:80:0x00ef, B:81:0x01d5, B:83:0x013e, B:85:0x017b, B:87:0x0181, B:88:0x018e, B:92:0x01dc, B:94:0x01e4, B:95:0x01e9, B:97:0x00fe, B:98:0x0126, B:100:0x012e, B:101:0x0133, B:103:0x010c), top: B:33:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023f A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:40:0x00b9, B:41:0x02b0, B:52:0x00d5, B:54:0x023b, B:56:0x01f5, B:64:0x0233, B:65:0x023f, B:67:0x0247, B:68:0x024c, B:70:0x0257, B:72:0x027f, B:74:0x0289, B:78:0x02aa, B:80:0x00ef, B:81:0x01d5, B:83:0x013e, B:85:0x017b, B:87:0x0181, B:88:0x018e, B:92:0x01dc, B:94:0x01e4, B:95:0x01e9, B:97:0x00fe, B:98:0x0126, B:100:0x012e, B:101:0x0133, B:103:0x010c), top: B:33:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:40:0x00b9, B:41:0x02b0, B:52:0x00d5, B:54:0x023b, B:56:0x01f5, B:64:0x0233, B:65:0x023f, B:67:0x0247, B:68:0x024c, B:70:0x0257, B:72:0x027f, B:74:0x0289, B:78:0x02aa, B:80:0x00ef, B:81:0x01d5, B:83:0x013e, B:85:0x017b, B:87:0x0181, B:88:0x018e, B:92:0x01dc, B:94:0x01e4, B:95:0x01e9, B:97:0x00fe, B:98:0x0126, B:100:0x012e, B:101:0x0133, B:103:0x010c), top: B:33:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc A[Catch: all -> 0x02b5, TryCatch #0 {all -> 0x02b5, blocks: (B:40:0x00b9, B:41:0x02b0, B:52:0x00d5, B:54:0x023b, B:56:0x01f5, B:64:0x0233, B:65:0x023f, B:67:0x0247, B:68:0x024c, B:70:0x0257, B:72:0x027f, B:74:0x0289, B:78:0x02aa, B:80:0x00ef, B:81:0x01d5, B:83:0x013e, B:85:0x017b, B:87:0x0181, B:88:0x018e, B:92:0x01dc, B:94:0x01e4, B:95:0x01e9, B:97:0x00fe, B:98:0x0126, B:100:0x012e, B:101:0x0133, B:103:0x010c), top: B:33:0x00a3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:12:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0239 -> B:48:0x023b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01d1 -> B:73:0x01d5). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ba2Var;
        ij1 ij1Var;
        JSONObject jSONObject;
        int i;
        JSONArray optJSONArray;
        ij1 ij1Var2;
        int i2;
        int length;
        JSONObject jSONObject2;
        int i3;
        JSONArray jSONArray;
        int length2;
        int i4;
        JSONObject jSONObject3;
        ij1 ij1Var3;
        int i5;
        uy2 uy2Var;
        int length3;
        f03 f03Var;
        ut1[] ut1VarArr;
        int i6;
        int i7 = this.m;
        Object obj2 = this.w;
        int i8 = 2;
        int i9 = 0;
        int i10 = 1;
        switch (i7) {
            case 0:
                Object obj3 = b50.m;
                int i11 = this.q;
                try {
                } catch (Throwable th) {
                    aa2.a aVar = aa2.m;
                    ba2Var = new ba2(th);
                }
                if (i11 == 0) {
                    ca2.b(obj);
                    String str = (String) obj2;
                    ij1Var = (ij1) this.s;
                    aa2.a aVar2 = aa2.m;
                    jSONObject = new JSONObject(str);
                    this.v = null;
                    this.r = ij1Var;
                    this.t = jSONObject;
                    this.n = 0;
                    this.q = 1;
                    if (ij1Var.d(this) == obj3) {
                        return obj3;
                    }
                    i = 0;
                } else if (i11 == 1) {
                    i = this.n;
                    jSONObject = (JSONObject) this.t;
                    ij1Var = (ij1) this.r;
                    ca2.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj);
                            ba2Var = Boolean.TRUE;
                            aa2.a aVar3 = aa2.m;
                            return !(ba2Var instanceof ba2) ? Boolean.FALSE : ba2Var;
                        }
                        length2 = this.p;
                        i5 = this.o;
                        i4 = this.n;
                        jSONArray = (JSONArray) this.u;
                        jSONObject3 = (JSONObject) this.t;
                        ij1Var3 = (ij1) this.r;
                        ca2.b(obj);
                        i5++;
                        if (i5 < length2) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
                            z51 z51Var = ij1Var3.c;
                            long optLong = jSONObject4.optLong("itemId");
                            String optString = jSONObject4.optString("atlasSlug");
                            optString.getClass();
                            h51 h51Var = new h51(optLong, optString);
                            this.v = null;
                            this.r = ij1Var3;
                            this.t = jSONObject3;
                            this.u = jSONArray;
                            this.n = i4;
                            this.o = i5;
                            this.p = length2;
                            this.q = 3;
                            Object U = l41.U(this, z51Var.a, new ek(4, z51Var, h51Var), false, true);
                            if (U != b50.m) {
                                U = Unit.a;
                            }
                            if (U != obj3) {
                                i5++;
                                if (i5 < length2) {
                                    JSONArray optJSONArray2 = jSONObject3.optJSONArray("progress");
                                    if (optJSONArray2 == null) {
                                        optJSONArray2 = new JSONArray();
                                    }
                                    le1 b = pv.b();
                                    int length4 = optJSONArray2.length();
                                    for (int i12 = 0; i12 < length4; i12++) {
                                        JSONObject jSONObject5 = optJSONArray2.getJSONObject(i12);
                                        String optString2 = jSONObject5.optString("slug");
                                        optString2.getClass();
                                        b.add(new kk(optString2, jSONObject5.optBoolean("studied"), jSONObject5.optBoolean("favourite"), jSONObject5.optBoolean("owned")));
                                    }
                                    le1 a = pv.a(b);
                                    if (!a.isEmpty()) {
                                        hk hkVar = ij1Var3.b;
                                        this.v = null;
                                        this.r = null;
                                        this.t = null;
                                        this.u = null;
                                        this.n = i4;
                                        this.q = 4;
                                        Object U2 = l41.U(this, hkVar.a, new ak(hkVar, a, 1), false, true);
                                        if (U2 == b50.m) {
                                            break;
                                        } else {
                                            U2 = Unit.a;
                                            break;
                                        }
                                    }
                                    ba2Var = Boolean.TRUE;
                                    aa2.a aVar32 = aa2.m;
                                    if (!(ba2Var instanceof ba2)) {
                                    }
                                }
                            }
                        }
                        return obj3;
                    }
                    length = this.p;
                    i3 = this.o;
                    i2 = this.n;
                    optJSONArray = (JSONArray) this.u;
                    jSONObject2 = (JSONObject) this.t;
                    ij1Var2 = (ij1) this.r;
                    ca2.b(obj);
                    i3++;
                    i8 = 2;
                    if (i3 < length) {
                        JSONObject jSONObject6 = optJSONArray.getJSONObject(i3);
                        z51 z51Var2 = ij1Var2.c;
                        long optLong2 = jSONObject6.optLong("id");
                        String optString3 = jSONObject6.optString("name");
                        optString3.getClass();
                        String optString4 = jSONObject6.optString("type", "other");
                        optString4.getClass();
                        String optString5 = jSONObject6.optString("metal", "other");
                        optString5.getClass();
                        a61 a61Var = new a61(optLong2, optString3, optString4, optString5, ij1.b(ij1Var2, jSONObject6, "fineness"), ij1.a(ij1Var2, jSONObject6, "weightGrams"), (!jSONObject6.has("purchaseDateEpochDay") || jSONObject6.isNull("purchaseDateEpochDay")) ? null : Long.valueOf(jSONObject6.optLong("purchaseDateEpochDay")), ij1.b(ij1Var2, jSONObject6, "place"), ij1.a(ij1Var2, jSONObject6, "valueEntered"), ij1.b(ij1Var2, jSONObject6, "notes"), ij1.b(ij1Var2, jSONObject6, "photoUri"), jSONObject6.optBoolean("favourite"), jSONObject6.optLong("createdAt"));
                        this.v = null;
                        this.r = ij1Var2;
                        this.t = jSONObject2;
                        this.u = optJSONArray;
                        this.n = i2;
                        this.o = i3;
                        this.p = length;
                        this.q = i8;
                        if (l41.U(this, z51Var2.a, new v51(z51Var2, a61Var, i10), false, true) == obj3) {
                            return obj3;
                        }
                        i3++;
                        i8 = 2;
                        if (i3 < length) {
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray("links");
                            if (optJSONArray3 == null) {
                                optJSONArray3 = new JSONArray();
                            }
                            jSONArray = optJSONArray3;
                            length2 = optJSONArray3.length();
                            i4 = i2;
                            jSONObject3 = jSONObject2;
                            ij1Var3 = ij1Var2;
                            i5 = 0;
                            if (i5 < length2) {
                            }
                            return obj3;
                        }
                    }
                }
                optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                ij1Var2 = ij1Var;
                i2 = i;
                length = optJSONArray.length();
                jSONObject2 = jSONObject;
                i3 = 0;
                if (i3 < length) {
                }
                break;
            default:
                b50 b50Var = b50.m;
                int i13 = this.q;
                if (i13 == 0) {
                    ca2.b(obj);
                    ut1[] ut1VarArr2 = (ut1[]) this.u;
                    f03 f03Var2 = (f03) this.v;
                    uy2Var = (uy2) obj2;
                    length3 = ut1VarArr2.length;
                    f03Var = f03Var2;
                    ut1VarArr = ut1VarArr2;
                    i6 = 0;
                    if (i9 >= length3) {
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length3 = this.p;
                    int i14 = this.o;
                    int i15 = this.n;
                    uy2Var = (uy2) this.t;
                    f03Var = (f03) this.s;
                    ut1VarArr = (ut1[]) this.r;
                    ca2.b(obj);
                    int i16 = i15;
                    i9 = i14;
                    i6 = i16;
                    i9++;
                    if (i9 >= length3) {
                        int i17 = i6 + 1;
                        int ordinal = ut1VarArr[i9].ordinal();
                        if (ordinal == 0) {
                            i6 = i17;
                            i9++;
                            if (i9 >= length3) {
                                return Unit.a;
                            }
                        } else {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    a.b();
                                    return null;
                                }
                                this.r = ut1VarArr;
                                this.s = f03Var;
                                this.t = uy2Var;
                                this.n = i17;
                                this.o = i9;
                                this.p = length3;
                                this.q = 2;
                                if (f03.d(f03Var, uy2Var, i6, this) != b50Var) {
                                    i14 = i9;
                                    i15 = i17;
                                    int i162 = i15;
                                    i9 = i14;
                                    i6 = i162;
                                }
                                return b50Var;
                            }
                            this.r = ut1VarArr;
                            this.s = f03Var;
                            this.t = uy2Var;
                            this.n = i17;
                            this.o = i9;
                            this.p = length3;
                            this.q = 1;
                            break;
                            i9++;
                            if (i9 >= length3) {
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(String str, ij1 ij1Var, o30 o30Var) {
        super(2, o30Var);
        this.w = str;
        this.s = ij1Var;
    }
}
