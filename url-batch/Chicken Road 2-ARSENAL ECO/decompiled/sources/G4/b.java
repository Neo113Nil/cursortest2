package G4;

import D4.j;
import D4.k;
import D4.n;
import F4.m;
import b4.i;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d4.C0323e;
import d4.InterfaceC0328j;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public final long f840b;

    /* renamed from: c, reason: collision with root package name */
    public final long f841c;

    /* renamed from: d, reason: collision with root package name */
    public final D4.a f842d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f843e;

    /* renamed from: f, reason: collision with root package name */
    public final k f844f;

    /* renamed from: g, reason: collision with root package name */
    public final m[] f845g;

    /* renamed from: h, reason: collision with root package name */
    public final int f846h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0328j f847i;

    /* renamed from: j, reason: collision with root package name */
    public final String f848j;

    /* renamed from: k, reason: collision with root package name */
    public final String f849k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f850l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(long j4, long j7, D4.a aVar, byte[] bArr, k kVar, m[] mVarArr, int i7, InterfaceC0328j interfaceC0328j, String str, String str2, byte[] bArr2) {
        super(j.b(L4.a.f1452k, bArr2) + (str2 != null ? L4.a.f1451j.f512c + j.f545b : 0) + (str == null ? 0 : L4.a.f1450i.f512c + j.f544a) + r8 + r16);
        int i8;
        int i9;
        int i10;
        int c7 = j.c(L4.a.f1443b, j7) + j.c(L4.a.f1442a, j4);
        D4.b bVar = L4.a.f1444c;
        int i11 = aVar.f508a;
        if (i11 == 0) {
            i9 = 0;
        } else {
            int i12 = bVar.f512c;
            if (i11 >= 0) {
                i8 = D4.d.b(i11);
            } else {
                int i13 = D4.d.f518e;
                i8 = 10;
            }
            i9 = i12 + i8;
        }
        int b7 = j.b(L4.a.f1445d, bArr) + i9 + c7;
        int b8 = (i7 == 0 ? 0 : D4.d.b(i7) + L4.a.f1448g.f512c) + j.e(L4.a.f1447f, mVarArr) + (kVar != null ? b7 + j.d(L4.a.f1446e, kVar) : b7);
        D4.b bVar2 = L4.a.f1449h;
        if ((((C0323e) interfaceC0328j).f3955b & 255) == 0) {
            i10 = 0;
        } else {
            int i14 = bVar2.f512c;
            int i15 = D4.d.f518e;
            i10 = i14 + 4;
        }
        this.f840b = j4;
        this.f841c = j7;
        this.f848j = str;
        this.f849k = str2;
        this.f847i = interfaceC0328j;
        this.f842d = aVar;
        this.f843e = bArr;
        this.f844f = kVar;
        this.f845g = mVarArr;
        this.f846h = i7;
        this.f850l = bArr2;
    }

    public static D4.a d(i iVar) {
        switch (iVar.ordinal()) {
            case 0:
                return L4.d.f1459a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return L4.d.f1460b;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return L4.d.f1461c;
            case 3:
                return L4.d.f1462d;
            case 4:
                return L4.d.f1463e;
            case 5:
                return L4.d.f1464f;
            case 6:
                return L4.d.f1465g;
            case 7:
                return L4.d.f1466h;
            case 8:
                return L4.d.f1467i;
            case 9:
                return L4.d.f1468j;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return L4.d.f1469k;
            case 11:
                return L4.d.f1470l;
            case 12:
                return L4.d.f1471m;
            case 13:
                return L4.d.f1472n;
            case 14:
                return L4.d.f1473o;
            case 15:
                return L4.d.f1474p;
            case 16:
                return L4.d.f1475q;
            case 17:
                return L4.d.f1476r;
            case 18:
                return L4.d.f1477s;
            case 19:
                return L4.d.f1478t;
            case 20:
                return L4.d.f1479u;
            case 21:
                return L4.d.f1480v;
            case 22:
                return L4.d.f1481w;
            case 23:
                return L4.d.f1482x;
            case 24:
                return L4.d.y;
            default:
                return L4.d.f1459a;
        }
    }

    @Override // D4.f
    public final void c(n nVar) {
        D4.b bVar = L4.a.f1442a;
        long j4 = this.f840b;
        if (j4 != 0) {
            nVar.N(bVar, j4);
        }
        D4.b bVar2 = L4.a.f1443b;
        long j7 = this.f841c;
        if (j7 != 0) {
            nVar.N(bVar2, j7);
        }
        D4.b bVar3 = L4.a.f1444c;
        D4.a aVar = this.f842d;
        if (aVar.f508a != 0) {
            nVar.L(bVar3, aVar);
        }
        nVar.v(L4.a.f1445d, this.f843e);
        k kVar = this.f844f;
        if (kVar != null) {
            nVar.a(L4.a.f1446e, kVar);
        }
        nVar.h(L4.a.f1447f, this.f845g);
        D4.b bVar4 = L4.a.f1448g;
        int i7 = this.f846h;
        if (i7 != 0) {
            nVar.Z(bVar4, i7);
        }
        D4.b bVar5 = L4.a.f1449h;
        int i8 = ((C0323e) this.f847i).f3955b & 255;
        if (i8 != 0) {
            nVar.M(bVar5, i8);
        }
        D4.b bVar6 = L4.a.f1450i;
        String str = this.f848j;
        if (str != null) {
            nVar.X(bVar6, str);
        }
        D4.b bVar7 = L4.a.f1451j;
        String str2 = this.f849k;
        if (str2 != null) {
            nVar.Q(bVar7, str2);
        }
        nVar.v(L4.a.f1452k, this.f850l);
    }
}
