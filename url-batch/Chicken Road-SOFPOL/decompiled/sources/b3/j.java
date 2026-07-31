package b3;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1150c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1151d;

    /* renamed from: e, reason: collision with root package name */
    public final n f1152e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f1153f;

    public j() {
        m mVar = new m();
        mVar.f1204a = 0;
        mVar.f1205b = 0;
        mVar.f1206c = 1.0f;
        mVar.f1207d = Float.NaN;
        this.f1149b = mVar;
        l lVar = new l();
        lVar.f1196a = -1;
        lVar.f1197b = 0;
        lVar.f1198c = -1;
        lVar.f1199d = Float.NaN;
        lVar.f1200e = Float.NaN;
        lVar.f1201f = Float.NaN;
        lVar.f1202g = -1;
        lVar.f1203h = null;
        lVar.i = -1;
        this.f1150c = lVar;
        k kVar = new k();
        kVar.f1155a = false;
        kVar.f1161d = -1;
        kVar.f1163e = -1;
        kVar.f1165f = -1.0f;
        kVar.f1167g = true;
        kVar.f1169h = -1;
        kVar.i = -1;
        kVar.f1172j = -1;
        kVar.f1174k = -1;
        kVar.f1176l = -1;
        kVar.f1178m = -1;
        kVar.f1180n = -1;
        kVar.f1182o = -1;
        kVar.f1184p = -1;
        kVar.f1185q = -1;
        kVar.f1186r = -1;
        kVar.f1187s = -1;
        kVar.f1188t = -1;
        kVar.f1189u = -1;
        kVar.f1190v = -1;
        kVar.f1191w = 0.5f;
        kVar.f1192x = 0.5f;
        kVar.f1193y = null;
        kVar.f1194z = -1;
        kVar.A = 0;
        kVar.B = 0.0f;
        kVar.C = -1;
        kVar.D = -1;
        kVar.E = -1;
        kVar.F = 0;
        kVar.G = 0;
        kVar.H = 0;
        kVar.I = 0;
        kVar.J = 0;
        kVar.K = 0;
        kVar.L = 0;
        kVar.M = Integer.MIN_VALUE;
        kVar.N = Integer.MIN_VALUE;
        kVar.O = Integer.MIN_VALUE;
        kVar.P = Integer.MIN_VALUE;
        kVar.Q = Integer.MIN_VALUE;
        kVar.R = Integer.MIN_VALUE;
        kVar.S = Integer.MIN_VALUE;
        kVar.T = -1.0f;
        kVar.U = -1.0f;
        kVar.V = 0;
        kVar.W = 0;
        kVar.X = 0;
        kVar.Y = 0;
        kVar.Z = 0;
        kVar.f1156a0 = 0;
        kVar.f1158b0 = 0;
        kVar.f1160c0 = 0;
        kVar.f1162d0 = 1.0f;
        kVar.f1164e0 = 1.0f;
        kVar.f1166f0 = -1;
        kVar.f1168g0 = 0;
        kVar.f1170h0 = -1;
        kVar.f1177l0 = false;
        kVar.f1179m0 = false;
        kVar.f1181n0 = true;
        kVar.f1183o0 = 0;
        this.f1151d = kVar;
        n nVar = new n();
        nVar.f1209a = 0.0f;
        nVar.f1210b = 0.0f;
        nVar.f1211c = 0.0f;
        nVar.f1212d = 1.0f;
        nVar.f1213e = 1.0f;
        nVar.f1214f = Float.NaN;
        nVar.f1215g = Float.NaN;
        nVar.f1216h = -1;
        nVar.i = 0.0f;
        nVar.f1217j = 0.0f;
        nVar.f1218k = 0.0f;
        nVar.f1219l = false;
        nVar.f1220m = 0.0f;
        this.f1152e = nVar;
        this.f1153f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f1151d;
        eVar.f1088e = kVar.f1169h;
        eVar.f1090f = kVar.i;
        eVar.f1092g = kVar.f1172j;
        eVar.f1094h = kVar.f1174k;
        eVar.i = kVar.f1176l;
        eVar.f1097j = kVar.f1178m;
        eVar.f1099k = kVar.f1180n;
        eVar.f1101l = kVar.f1182o;
        eVar.f1103m = kVar.f1184p;
        eVar.f1105n = kVar.f1185q;
        eVar.f1107o = kVar.f1186r;
        eVar.f1113s = kVar.f1187s;
        eVar.f1114t = kVar.f1188t;
        eVar.f1115u = kVar.f1189u;
        eVar.f1116v = kVar.f1190v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.I;
        eVar.A = kVar.R;
        eVar.B = kVar.Q;
        eVar.f1118x = kVar.N;
        eVar.f1120z = kVar.P;
        eVar.E = kVar.f1191w;
        eVar.F = kVar.f1192x;
        eVar.f1109p = kVar.f1194z;
        eVar.f1111q = kVar.A;
        eVar.f1112r = kVar.B;
        eVar.G = kVar.f1193y;
        eVar.T = kVar.C;
        eVar.U = kVar.D;
        eVar.I = kVar.T;
        eVar.H = kVar.U;
        eVar.K = kVar.W;
        eVar.J = kVar.V;
        eVar.W = kVar.f1177l0;
        eVar.X = kVar.f1179m0;
        eVar.L = kVar.X;
        eVar.M = kVar.Y;
        eVar.P = kVar.Z;
        eVar.Q = kVar.f1156a0;
        eVar.N = kVar.f1158b0;
        eVar.O = kVar.f1160c0;
        eVar.R = kVar.f1162d0;
        eVar.S = kVar.f1164e0;
        eVar.V = kVar.E;
        eVar.f1084c = kVar.f1165f;
        eVar.f1080a = kVar.f1161d;
        eVar.f1082b = kVar.f1163e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.f1157b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f1159c;
        String str = kVar.f1175k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = kVar.f1183o0;
        eVar.setMarginStart(kVar.K);
        eVar.setMarginEnd(kVar.J);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f1151d;
        kVar.getClass();
        k kVar2 = this.f1151d;
        kVar.f1155a = kVar2.f1155a;
        kVar.f1157b = kVar2.f1157b;
        kVar.f1159c = kVar2.f1159c;
        kVar.f1161d = kVar2.f1161d;
        kVar.f1163e = kVar2.f1163e;
        kVar.f1165f = kVar2.f1165f;
        kVar.f1167g = kVar2.f1167g;
        kVar.f1169h = kVar2.f1169h;
        kVar.i = kVar2.i;
        kVar.f1172j = kVar2.f1172j;
        kVar.f1174k = kVar2.f1174k;
        kVar.f1176l = kVar2.f1176l;
        kVar.f1178m = kVar2.f1178m;
        kVar.f1180n = kVar2.f1180n;
        kVar.f1182o = kVar2.f1182o;
        kVar.f1184p = kVar2.f1184p;
        kVar.f1185q = kVar2.f1185q;
        kVar.f1186r = kVar2.f1186r;
        kVar.f1187s = kVar2.f1187s;
        kVar.f1188t = kVar2.f1188t;
        kVar.f1189u = kVar2.f1189u;
        kVar.f1190v = kVar2.f1190v;
        kVar.f1191w = kVar2.f1191w;
        kVar.f1192x = kVar2.f1192x;
        kVar.f1193y = kVar2.f1193y;
        kVar.f1194z = kVar2.f1194z;
        kVar.A = kVar2.A;
        kVar.B = kVar2.B;
        kVar.C = kVar2.C;
        kVar.D = kVar2.D;
        kVar.E = kVar2.E;
        kVar.F = kVar2.F;
        kVar.G = kVar2.G;
        kVar.H = kVar2.H;
        kVar.I = kVar2.I;
        kVar.J = kVar2.J;
        kVar.K = kVar2.K;
        kVar.L = kVar2.L;
        kVar.M = kVar2.M;
        kVar.N = kVar2.N;
        kVar.O = kVar2.O;
        kVar.P = kVar2.P;
        kVar.Q = kVar2.Q;
        kVar.R = kVar2.R;
        kVar.S = kVar2.S;
        kVar.T = kVar2.T;
        kVar.U = kVar2.U;
        kVar.V = kVar2.V;
        kVar.W = kVar2.W;
        kVar.X = kVar2.X;
        kVar.Y = kVar2.Y;
        kVar.Z = kVar2.Z;
        kVar.f1156a0 = kVar2.f1156a0;
        kVar.f1158b0 = kVar2.f1158b0;
        kVar.f1160c0 = kVar2.f1160c0;
        kVar.f1162d0 = kVar2.f1162d0;
        kVar.f1164e0 = kVar2.f1164e0;
        kVar.f1166f0 = kVar2.f1166f0;
        kVar.f1168g0 = kVar2.f1168g0;
        kVar.f1170h0 = kVar2.f1170h0;
        kVar.f1175k0 = kVar2.f1175k0;
        int[] iArr = kVar2.f1171i0;
        if (iArr == null || kVar2.f1173j0 != null) {
            kVar.f1171i0 = null;
        } else {
            kVar.f1171i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.f1173j0 = kVar2.f1173j0;
        kVar.f1177l0 = kVar2.f1177l0;
        kVar.f1179m0 = kVar2.f1179m0;
        kVar.f1181n0 = kVar2.f1181n0;
        kVar.f1183o0 = kVar2.f1183o0;
        l lVar = jVar.f1150c;
        lVar.getClass();
        l lVar2 = this.f1150c;
        lVar2.getClass();
        lVar.f1196a = lVar2.f1196a;
        lVar.f1198c = lVar2.f1198c;
        lVar.f1200e = lVar2.f1200e;
        lVar.f1199d = lVar2.f1199d;
        m mVar = this.f1149b;
        int i = mVar.f1204a;
        m mVar2 = jVar.f1149b;
        mVar2.f1204a = i;
        mVar2.f1206c = mVar.f1206c;
        mVar2.f1207d = mVar.f1207d;
        mVar2.f1205b = mVar.f1205b;
        n nVar = jVar.f1152e;
        nVar.getClass();
        n nVar2 = this.f1152e;
        nVar2.getClass();
        nVar.f1209a = nVar2.f1209a;
        nVar.f1210b = nVar2.f1210b;
        nVar.f1211c = nVar2.f1211c;
        nVar.f1212d = nVar2.f1212d;
        nVar.f1213e = nVar2.f1213e;
        nVar.f1214f = nVar2.f1214f;
        nVar.f1215g = nVar2.f1215g;
        nVar.f1216h = nVar2.f1216h;
        nVar.i = nVar2.i;
        nVar.f1217j = nVar2.f1217j;
        nVar.f1218k = nVar2.f1218k;
        nVar.f1219l = nVar2.f1219l;
        nVar.f1220m = nVar2.f1220m;
        jVar.f1148a = this.f1148a;
        return jVar;
    }
}
