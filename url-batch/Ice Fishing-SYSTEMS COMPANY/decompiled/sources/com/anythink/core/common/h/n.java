package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATCustomContentResult;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.e.g;
import com.anythink.core.d.l;
import com.anythink.core.mg.api.MgAdInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import com.anythink.core.mg.api.MgPreLoadCallbackRegister;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends bu implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14147a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14148b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14149c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14150d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14151e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14152f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14153g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14154h = 8;
    public static final int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14155j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14156k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14157l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14158m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14159n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14160o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f14161p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f14162q = 2;

    /* renamed from: A, reason: collision with root package name */
    protected double f14163A;

    /* renamed from: B, reason: collision with root package name */
    String f14164B;

    /* renamed from: C, reason: collision with root package name */
    public int f14165C;

    /* renamed from: D, reason: collision with root package name */
    int f14166D;

    /* renamed from: E, reason: collision with root package name */
    int f14167E;

    /* renamed from: F, reason: collision with root package name */
    public String f14168F;

    /* renamed from: G, reason: collision with root package name */
    protected int f14169G;

    /* renamed from: H, reason: collision with root package name */
    protected int f14170H;

    /* renamed from: I, reason: collision with root package name */
    protected int f14171I;
    protected int J;

    /* renamed from: K, reason: collision with root package name */
    protected double f14172K;

    /* renamed from: L, reason: collision with root package name */
    List<Integer> f14173L;

    /* renamed from: M, reason: collision with root package name */
    boolean f14174M;

    /* renamed from: N, reason: collision with root package name */
    int f14175N;

    /* renamed from: O, reason: collision with root package name */
    String f14176O;

    /* renamed from: P, reason: collision with root package name */
    long f14177P;

    /* renamed from: Q, reason: collision with root package name */
    long f14178Q;

    /* renamed from: R, reason: collision with root package name */
    String f14179R;
    private int aX;
    private String aY;
    private String aZ;
    private String bA;
    private String bB;
    private String bC;
    private String bD;
    private int bE;
    private String bG;
    private String bH;
    private double bI;
    private String bJ;
    private double bK;
    private double bL;
    private String bM;
    private double bN;
    private String bO;
    private int bP;
    private String bQ;
    private String bR;
    private String bS;
    private String bT;
    private int bU;
    private int bV;
    private String bW;
    private long bX;
    private int bY;
    private int bZ;
    private int ba;
    private int bb;
    private String bc;
    private int bd;
    private int bh;
    private int bi;
    private boolean bj;
    private long bk;
    private long bl;
    private long bm;
    private long bn;
    private long bo;
    private long bp;
    private long bq;
    private long br;
    private long bs;
    private long bt;
    private long bu;
    private long bv;
    private long bw;
    private int bx;
    private int by;
    private long bz;
    private int cB;
    private String cC;
    private long cD;
    private long cE;
    private boolean cF;
    private int cK;
    private double cL;
    private double cM;
    private Map<String, String> cN;
    private String cP;
    private String cR;
    private String cT;
    private String cU;
    private int cV;
    private double cW;
    private int cX;
    private int cY;
    private int cZ;
    private int ca;
    private int cb;
    private int cc;
    private long cd;
    private int cf;
    private int cg;
    private int cj;
    private String ck;
    private int cl;
    private ATRewardInfo cm;
    private Map<String, ATRewardInfo> cn;
    private Map<String, Object> co;
    private Map<String, Object> cp;
    private d cq;
    private Map<String, Object> cr;
    private boolean cs;
    private double ct;
    private double cu;
    private int cv;
    private int cw;
    private int cx;
    private double cy;
    private int cz;
    private long dA;
    private String dC;
    private int da;
    private String dc;
    private int de;
    private int df;
    private aa dg;
    private e dh;
    private ab di;
    private bc dj;
    private int dk;
    private ATCustomContentResult dl;
    private int dm;
    private double dn;

    /* renamed from: do, reason: not valid java name */
    private long f0do;
    private String du;
    private int dv;
    private ATAdRequest dw;
    private int dz;

    /* renamed from: r, reason: collision with root package name */
    protected int f14180r;

    /* renamed from: w, reason: collision with root package name */
    public int f14185w;

    /* renamed from: x, reason: collision with root package name */
    public String f14186x;

    /* renamed from: y, reason: collision with root package name */
    int f14187y;

    /* renamed from: z, reason: collision with root package name */
    protected double f14188z;
    private int be = -1;
    private int bf = -1;
    private int bg = -1;

    /* renamed from: s, reason: collision with root package name */
    public String f14181s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f14182t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f14183u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f14184v = 0;
    private String bF = "unknow";
    private int ce = -1;
    private int ch = 1;
    private int ci = 13;
    private int cA = 1;
    private int cG = 0;
    private int cH = 0;
    private int cI = 0;
    private int cJ = 0;
    private double cO = -1.0d;
    private double cQ = -1.0d;
    private int cS = -1;
    private int db = -2;
    private int dd = 2;
    private int dp = 0;
    private int dq = -1;
    private int dr = 0;
    private int ds = 0;
    private String dt = "";
    private boolean dx = false;
    private boolean dy = false;
    private int dB = -1;

    private void M(String str) {
        this.f14168F = str;
    }

    private void N(String str) {
        this.f14186x = str;
    }

    private int aN() {
        return this.cz;
    }

    private double aO() {
        return this.ct;
    }

    private boolean aP() {
        return this.cs;
    }

    private double aQ() {
        return this.f14172K;
    }

    private int aR() {
        return this.ca;
    }

    private int aS() {
        return this.bZ;
    }

    private String aT() {
        return this.f14168F;
    }

    private int aU() {
        return this.f14165C;
    }

    private void aV() {
        this.f14165C = 1;
    }

    private double aW() {
        return this.f14163A;
    }

    private String aX() {
        return this.f14186x;
    }

    private boolean aY() {
        return this.cb == 9;
    }

    private String aZ() {
        return this.aY;
    }

    private void aq(int i4) {
        this.f14182t = i4;
    }

    private void ar(int i4) {
        this.f14183u = i4;
    }

    private void as(int i4) {
        this.f14184v = i4;
    }

    private void at(int i4) {
        this.f14185w = i4;
    }

    private JSONObject au(int i4) {
        return super.O(i4);
    }

    private int ba() {
        return this.f14182t;
    }

    private int bb() {
        return this.f14183u;
    }

    private int bc() {
        return this.f14185w;
    }

    private boolean bd() {
        return this.f14174M;
    }

    private int be() {
        return this.f14175N;
    }

    private String bf() {
        return this.f14176O;
    }

    private int bg() {
        return this.cG;
    }

    private long bh() {
        return this.f14177P;
    }

    private long bi() {
        return this.f14178Q;
    }

    private String bj() {
        return this.f14179R;
    }

    private int bk() {
        return this.cw;
    }

    private int bl() {
        return this.cx;
    }

    private int bm() {
        return this.cJ;
    }

    private int bn() {
        return this.dz;
    }

    private int bo() {
        return this.cZ;
    }

    private int bp() {
        return this.da;
    }

    private int bq() {
        return this.dd;
    }

    private int br() {
        return this.dq;
    }

    private int bs() {
        return this.dv;
    }

    public final int A() {
        return this.bE;
    }

    public final String B() {
        return this.bF;
    }

    public final String C() {
        return this.bG;
    }

    public final String D() {
        return this.bH;
    }

    public final Map<String, ATRewardInfo> E() {
        return this.cn;
    }

    public final ATRewardInfo F() {
        return this.cm;
    }

    public final Map<String, Object> G() {
        return this.co;
    }

    public final int H() {
        return this.f14166D;
    }

    public final int I() {
        return this.f14167E;
    }

    public final int J() {
        return this.f14187y;
    }

    public final boolean K() {
        return this.f14187y == 1;
    }

    public final double L() {
        return this.f14188z;
    }

    public final int O() {
        return this.bh;
    }

    public final int P() {
        return this.bi;
    }

    public final int Q() {
        return this.ba;
    }

    public final int R() {
        return this.bb;
    }

    public final String S() {
        return this.bc;
    }

    public final int T() {
        return this.bd;
    }

    public final int U() {
        return this.be;
    }

    public final int V() {
        return this.bf;
    }

    public final int W() {
        return this.bg;
    }

    public final String X() {
        return this.aZ;
    }

    public final int Y() {
        return this.f14180r;
    }

    public final int Z() {
        return this.aX;
    }

    public final void a(long j9) {
        this.bv = j9;
    }

    public final long aa() {
        return this.bk;
    }

    public final long ab() {
        return this.bz;
    }

    public final int ac() {
        return this.ce;
    }

    public final int ad() {
        int i4 = this.ce;
        return i4 == -1 ? Integer.parseInt(this.aN) : i4;
    }

    public final int ae() {
        return this.cj;
    }

    public final n af() {
        try {
            n nVar = (n) super.clone();
            nVar.cm = this.cm;
            nVar.cp = this.cp;
            nVar.cn = this.cn;
            nVar.co = this.co;
            nVar.cr = this.cr;
            nVar.cq = this.cq;
            nVar.cA = this.cA;
            nVar.dA = this.dA;
            nVar.dg = this.dg;
            nVar.dw = this.dw;
            return nVar;
        } catch (Throwable unused) {
            return this;
        }
    }

    public final int ag() {
        return this.cB;
    }

    public final boolean ah() {
        return this.cF;
    }

    public final int ai() {
        return this.cH;
    }

    public final int aj() {
        return this.cI;
    }

    public final String ak() {
        return this.cU;
    }

    public final Map<String, String> al() {
        return this.cN;
    }

    public final int am() {
        return this.db;
    }

    public final int an() {
        return this.de;
    }

    public final void ao() {
        this.df = 1;
    }

    public final aa ap() {
        return this.dg;
    }

    public final String av() {
        return this.du;
    }

    public final boolean aw() {
        return this.dx;
    }

    public final void b(long j9) {
        this.bw = j9;
    }

    public final void c(long j9) {
        this.bo = j9;
    }

    public final void d(long j9) {
        this.bu = j9;
    }

    public final void e(long j9) {
        this.bs = j9;
    }

    public final void f(long j9) {
        this.bt = j9;
    }

    public final void g(long j9) {
        this.bp = j9;
    }

    public final void h(long j9) {
        this.bq = j9;
    }

    public final void i(long j9) {
        this.br = j9;
    }

    public final void j(long j9) {
        this.bn = j9;
    }

    public final void k(long j9) {
        this.bl = j9;
    }

    public final void l(long j9) {
        this.bm = j9;
    }

    public final void m(long j9) {
        this.cD = j9;
    }

    public final void n(long j9) {
        this.cE = j9;
    }

    public final void o(long j9) {
        this.cd = j9;
    }

    public final void p(long j9) {
        this.bX = j9;
    }

    public final double q() {
        return this.bN;
    }

    public final String r() {
        return this.bM;
    }

    public final String s() {
        return this.bO;
    }

    public final int t() {
        return this.bP;
    }

    public final double u() {
        return this.bI;
    }

    public final String v() {
        return this.bJ;
    }

    public final String w() {
        return this.bR;
    }

    public final String x() {
        return this.f14164B;
    }

    public final String y() {
        return this.bC;
    }

    public final String z() {
        return this.bD;
    }

    public final void A(int i4) {
        this.bb = i4;
    }

    public final void B(int i4) {
        this.bd = i4;
    }

    public final void C(int i4) {
        this.be = i4;
    }

    public final void D(int i4) {
        this.bf = i4;
    }

    public final void E(int i4) {
        this.bg = i4;
    }

    public final void F(int i4) {
        this.f14180r = i4;
    }

    public final void G(int i4) {
        this.aX = i4;
    }

    public final void H(int i4) {
        this.ce = i4;
    }

    public final void I(int i4) {
        this.ch = i4;
    }

    public final void J(int i4) {
        this.ci = i4;
    }

    public final void K(int i4) {
        this.cj = i4;
    }

    public final void L(int i4) {
        this.f14175N = i4;
    }

    public final String M() {
        return this.bA;
    }

    public final int N() {
        int i4 = this.cb;
        if (i4 != 8) {
            return i4 != 9 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|(10:2|3|(1:5)|6|(1:8)|9|(1:11)|12|(4:403|404|(1:406)|407)|(1:402))|(3:(1:(2:34|(36:36|37|(1:39)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)(1:393)|55|(1:57)|58|(1:60)|62|63|64|69|70|(6:84|(1:109)|88|(3:90|(2:98|99)|(2:93|94))|103|(1:107))|110|111|(2:113|(2:117|(1:119)))(2:217|(4:219|(1:221)|222|(1:224)))|120|121|(4:129|(1:131)|132|(1:134))|136|(1:138)(1:215)|(12:179|180|(1:182)|183|(1:185)|186|(1:188)|189|(1:191)(1:213)|192|(1:212)(1:198)|(5:200|(1:202)(1:210)|(1:204)(1:209)|205|(1:207)))|140|(3:146|147|(10:151|(1:153)|154|(1:156)|157|(1:159)|160|(1:162)|163|(1:165)))|(3:171|172|(1:174))|177)))|394|(1:398))|399|(1:401)|37|(0)|40|(0)|43|(0)|46|(0)|49|(0)|52|(0)(0)|55|(0)|58|(0)|62|63|64|69|70|(8:72|84|(1:86)|109|88|(0)|103|(2:105|107))|110|111|(0)(0)|120|121|(5:123|129|(0)|132|(0))|136|(0)(0)|(0)|140|(4:142|146|147|(11:149|151|(0)|154|(0)|157|(0)|160|(0)|163|(0)))|(4:169|171|172|(0))|177|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:0|1|2|3|(1:5)|6|(1:8)|9|(1:11)|12|(4:403|404|(1:406)|407)|(1:402)|(3:(1:(2:34|(36:36|37|(1:39)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)(1:393)|55|(1:57)|58|(1:60)|62|63|64|69|70|(6:84|(1:109)|88|(3:90|(2:98|99)|(2:93|94))|103|(1:107))|110|111|(2:113|(2:117|(1:119)))(2:217|(4:219|(1:221)|222|(1:224)))|120|121|(4:129|(1:131)|132|(1:134))|136|(1:138)(1:215)|(12:179|180|(1:182)|183|(1:185)|186|(1:188)|189|(1:191)(1:213)|192|(1:212)(1:198)|(5:200|(1:202)(1:210)|(1:204)(1:209)|205|(1:207)))|140|(3:146|147|(10:151|(1:153)|154|(1:156)|157|(1:159)|160|(1:162)|163|(1:165)))|(3:171|172|(1:174))|177)))|394|(1:398))|399|(1:401)|37|(0)|40|(0)|43|(0)|46|(0)|49|(0)|52|(0)(0)|55|(0)|58|(0)|62|63|64|69|70|(8:72|84|(1:86)|109|88|(0)|103|(2:105|107))|110|111|(0)(0)|120|121|(5:123|129|(0)|132|(0))|136|(0)(0)|(0)|140|(4:142|146|147|(11:149|151|(0)|154|(0)|157|(0)|160|(0)|163|(0)))|(4:169|171|172|(0))|177|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x08b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x08e1, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x05d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x05d9, code lost:
    
        r6 = "aprn_auto_req";
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x019a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08fb A[Catch: Exception -> 0x0909, TryCatch #1 {Exception -> 0x0909, blocks: (B:121:0x08e4, B:129:0x08f7, B:131:0x08fb, B:132:0x0900, B:134:0x0904), top: B:120:0x08e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0904 A[Catch: Exception -> 0x0909, TRY_LEAVE, TryCatch #1 {Exception -> 0x0909, blocks: (B:121:0x08e4, B:129:0x08f7, B:131:0x08fb, B:132:0x0900, B:134:0x0904), top: B:120:0x08e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09bd A[Catch: Exception -> 0x0a00, TryCatch #4 {Exception -> 0x0a00, blocks: (B:147:0x09a2, B:149:0x09a6, B:151:0x09ac, B:153:0x09bd, B:154:0x09c2, B:156:0x09ce, B:157:0x09d3, B:159:0x09df, B:160:0x09e4, B:162:0x09f0, B:163:0x09f5, B:165:0x09fb), top: B:146:0x09a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09ce A[Catch: Exception -> 0x0a00, TryCatch #4 {Exception -> 0x0a00, blocks: (B:147:0x09a2, B:149:0x09a6, B:151:0x09ac, B:153:0x09bd, B:154:0x09c2, B:156:0x09ce, B:157:0x09d3, B:159:0x09df, B:160:0x09e4, B:162:0x09f0, B:163:0x09f5, B:165:0x09fb), top: B:146:0x09a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x09df A[Catch: Exception -> 0x0a00, TryCatch #4 {Exception -> 0x0a00, blocks: (B:147:0x09a2, B:149:0x09a6, B:151:0x09ac, B:153:0x09bd, B:154:0x09c2, B:156:0x09ce, B:157:0x09d3, B:159:0x09df, B:160:0x09e4, B:162:0x09f0, B:163:0x09f5, B:165:0x09fb), top: B:146:0x09a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x09f0 A[Catch: Exception -> 0x0a00, TryCatch #4 {Exception -> 0x0a00, blocks: (B:147:0x09a2, B:149:0x09a6, B:151:0x09ac, B:153:0x09bd, B:154:0x09c2, B:156:0x09ce, B:157:0x09d3, B:159:0x09df, B:160:0x09e4, B:162:0x09f0, B:163:0x09f5, B:165:0x09fb), top: B:146:0x09a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09fb A[Catch: Exception -> 0x0a00, TRY_LEAVE, TryCatch #4 {Exception -> 0x0a00, blocks: (B:147:0x09a2, B:149:0x09a6, B:151:0x09ac, B:153:0x09bd, B:154:0x09c2, B:156:0x09ce, B:157:0x09d3, B:159:0x09df, B:160:0x09e4, B:162:0x09f0, B:163:0x09f5, B:165:0x09fb), top: B:146:0x09a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0a0a A[Catch: all -> 0x0a14, TRY_LEAVE, TryCatch #7 {all -> 0x0a14, blocks: (B:172:0x0a06, B:174:0x0a0a), top: B:171:0x0a06 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0915 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08b8 A[Catch: all -> 0x08b6, TryCatch #10 {all -> 0x08b6, blocks: (B:115:0x08a0, B:117:0x08a6, B:119:0x08b0, B:217:0x08b8, B:219:0x08c2, B:221:0x08cc, B:222:0x08d1, B:224:0x08db), top: B:111:0x089a }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01bb A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01d6 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01e4 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01f1 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01fa A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0204 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x050c A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x051b A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0526 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053f A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x058c A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ac A[Catch: Exception -> 0x05d8, TRY_ENTER, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ee A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05f7 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0608 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0631 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x064e A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0659 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0662 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x066c A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0675 A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01a6 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0216 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x021d A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0230 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c3 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0304 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02e5 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0298 A[Catch: Exception -> 0x031c, TryCatch #6 {Exception -> 0x031c, blocks: (B:318:0x025a, B:321:0x029f, B:335:0x0298), top: B:317:0x025a }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x023a A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0320 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0382 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x03d9 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x043c A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0496 A[Catch: Exception -> 0x019a, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x069b A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06ff A[Catch: Exception -> 0x05d8, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07cf A[Catch: Exception -> 0x05d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x05d8, blocks: (B:268:0x05ac, B:270:0x05c4, B:272:0x05ce, B:274:0x05d2, B:275:0x05db, B:277:0x05df, B:279:0x05e3, B:280:0x05ea, B:282:0x05ee, B:283:0x05f3, B:285:0x05f7, B:286:0x05fc, B:288:0x0608, B:289:0x060d, B:291:0x0631, B:292:0x0646, B:294:0x064e, B:295:0x0655, B:297:0x0659, B:298:0x065e, B:300:0x0662, B:301:0x0667, B:303:0x066c, B:304:0x0671, B:306:0x0675, B:307:0x067a, B:371:0x069b, B:372:0x06ff, B:374:0x075e, B:376:0x0762, B:377:0x078e, B:379:0x0792, B:380:0x0797, B:382:0x07a4, B:383:0x07b9, B:385:0x07c1, B:386:0x07c8, B:387:0x0771, B:388:0x0780, B:389:0x07cf), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x012a A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5 A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110 A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120 A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[Catch: Exception -> 0x0020, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #5 {Exception -> 0x0020, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x0024, B:8:0x0028, B:9:0x002d, B:11:0x003c, B:12:0x0043, B:14:0x004d, B:16:0x0057, B:18:0x0061, B:37:0x00c7, B:39:0x00cb, B:40:0x00f1, B:42:0x00f5, B:43:0x00fa, B:45:0x00fe, B:46:0x0103, B:48:0x0107, B:49:0x010c, B:51:0x0110, B:52:0x0115, B:54:0x0120, B:55:0x0137, B:57:0x013b, B:58:0x0140, B:60:0x0148, B:393:0x012a, B:394:0x00a3, B:396:0x00a7, B:398:0x00ad, B:399:0x00b8, B:401:0x00c0, B:402:0x0089), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173 A[Catch: Exception -> 0x019a, TRY_ENTER, TryCatch #11 {Exception -> 0x019a, blocks: (B:65:0x0173, B:67:0x0177, B:230:0x01b7, B:232:0x01bb, B:234:0x01ce, B:236:0x01d6, B:237:0x01e0, B:239:0x01e4, B:240:0x01e9, B:242:0x01f1, B:243:0x01f6, B:245:0x01fa, B:246:0x01ff, B:248:0x0204, B:249:0x0209, B:250:0x04e5, B:252:0x050c, B:253:0x0513, B:255:0x051b, B:256:0x0522, B:258:0x0526, B:259:0x052b, B:261:0x053f, B:262:0x0546, B:264:0x058c, B:265:0x0591, B:309:0x01a6, B:311:0x01aa, B:314:0x0216, B:315:0x021d, B:316:0x0230, B:323:0x02b1, B:325:0x02c3, B:326:0x02c8, B:329:0x02ea, B:331:0x0304, B:332:0x0309, B:333:0x02e5, B:340:0x023a, B:343:0x0253, B:344:0x024c, B:346:0x0320, B:350:0x0369, B:352:0x0372, B:353:0x036d, B:354:0x0382, B:357:0x03a8, B:359:0x03b7, B:360:0x03d4, B:361:0x03c6, B:362:0x03a1, B:363:0x03d9, B:364:0x043c, B:366:0x0475, B:367:0x047a, B:368:0x0496), top: B:63:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0852 A[Catch: Exception -> 0x0895, TRY_LEAVE, TryCatch #3 {Exception -> 0x0895, blocks: (B:70:0x0821, B:84:0x083f, B:88:0x084e, B:90:0x0852, B:97:0x0886, B:102:0x0871, B:105:0x088c, B:107:0x0890, B:109:0x0847, B:99:0x0862, B:94:0x0876), top: B:69:0x0821, inners: #0, #12 }] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.anythink.core.common.h.bu, com.anythink.core.common.h.n] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    @Override // com.anythink.core.common.h.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject O(int i4) {
        int i9;
        int i10;
        MgPreLoadAdRequest preLoadInfo;
        Map<String, Object> map;
        JSONObject jSONObject;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i11;
        int i12;
        Map<String, Object> map2;
        int i13;
        d dVar;
        int i14;
        int i15;
        int i16;
        ATAdRequest aTAdRequest;
        int i17;
        String str;
        String str2;
        String str3;
        int i18;
        int i19;
        String str4;
        String str5;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        double d2;
        String str6;
        int i30;
        double d3;
        String str7;
        bc bcVar;
        JSONObject O8 = super.O(i4);
        try {
            O8.put("nw_ver", this.f14186x);
            int i31 = this.be;
            if (i31 != -1) {
                O8.put(ToolBar.REFRESH, i31);
            }
            int i32 = this.bf;
            if (i32 != -1) {
                O8.put("refresh_v2", i32);
            }
            O8.put("load_mode", this.bg);
            if (!TextUtils.isEmpty(this.bT)) {
                O8.put("tp_bid_id", this.bT);
            }
            if ("4".equals(this.aN) || "2".equals(this.aN) || "3".equals(this.aN) || "1".equals(this.aN)) {
                try {
                    int i33 = this.ce;
                    if (i33 == -1) {
                        i33 = Integer.parseInt(this.aN);
                    }
                    O8.put("ad_type", i33);
                } catch (Exception unused) {
                }
            }
            if (i4 == 1 || i4 == 2 || i4 == 4 || i4 == 6 || i4 == 13 || i4 == 24) {
                O8.put("extra", this.bS);
            }
        } catch (Exception e6) {
            e = e6;
            i9 = i4;
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 != 4 && i4 != 6 && i4 != 8) {
                if (i4 != 13) {
                    if (i4 != 25) {
                        dVar = this.cq;
                        if (dVar != null) {
                            O8.put("real_p", dVar.a());
                            O8.put("real_s", this.f14168F);
                            O8.put("real_g", this.cq.b());
                            O8.put("real_t", this.cq.c());
                        }
                        i14 = this.cc;
                        if (i14 > 0) {
                            O8.put("ads_list_type", i14);
                        }
                        if (this.cF) {
                            O8.put(com.anythink.core.common.m.e.be, 1);
                        }
                        i15 = this.de;
                        if (i15 > 0) {
                            O8.put("s_type", i15);
                        }
                        i16 = this.df;
                        if (i16 > 0) {
                            O8.put("imp_type", i16);
                        }
                        O8.put("network_pl_id", this.bC);
                        aTAdRequest = this.dw;
                        if (aTAdRequest == null) {
                            O8.put(com.anythink.core.common.m.e.bp, aTAdRequest.getChannelSource());
                        } else {
                            O8.put(com.anythink.core.common.m.e.bp, com.anythink.core.common.d.t.b().E());
                        }
                        i17 = this.dB;
                        if (i17 != -1) {
                            O8.put("f_device_pub", i17);
                        }
                        if (!TextUtils.isEmpty(this.dC)) {
                            O8.put("b_network_ids", this.dC);
                        }
                        String str8 = "unit_type";
                        switch (i4) {
                            case 1:
                                i10 = i4;
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put("aprn_auto_req", N());
                                O8.put("bidtype", this.f14187y);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put("ad_reqt", this.cd);
                                O8.put("unit_type", this.cK);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                e(O8);
                                f(O8);
                                break;
                            case 2:
                                i10 = i4;
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put("aprn_auto_req", N());
                                O8.put("status", this.f14183u);
                                O8.put("flag", this.f14184v);
                                O8.put("bidtype", this.f14187y);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(ATAdConst.KEY.CP_LOAD_MODE, aA());
                                O8.put("ft_t", this.bl);
                                O8.put("filled_t", this.bm);
                                if (this.cA != 2) {
                                    O8.put("filledtime", this.bz);
                                    O8.put("data_ft", this.bk);
                                } else if (this.cc == 2) {
                                    O8.put("filledtime", this.bz);
                                    O8.put("data_ft", this.bz);
                                } else {
                                    O8.put("filledtime", this.bk);
                                    O8.put("data_ft", this.bk);
                                }
                                int i34 = this.cG;
                                if (i34 > 0) {
                                    O8.put("material_type", i34);
                                }
                                O8.put("unit_type", this.cK);
                                if (!TextUtils.isEmpty(this.bM)) {
                                    O8.put(com.anythink.core.common.k.aS, this.bM);
                                    O8.put("e_c_key_id", this.bP);
                                    O8.put("unique_id", this.bQ);
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                    O8.put(com.anythink.core.common.k.aT, this.bO);
                                }
                                f(O8);
                                e(O8);
                                break;
                            case 3:
                                i10 = i4;
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put("aprn_auto_req", N());
                                O8.put("status", this.f14183u);
                                O8.put("flag", this.f14184v);
                                O8.put("bidtype", this.f14187y);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(ATAdConst.KEY.CP_LOAD_MODE, aA());
                                O8.put("unit_type", this.cK);
                                O8.put("nw_err_c", this.dc);
                                O8.put("report_t", this.dd);
                                f(O8);
                                break;
                            case 4:
                                str = "aprn_auto_req";
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                str2 = "show_custom_ext";
                                O8.put("phs", this.J);
                                O8.put("cl_imp", this.bU);
                                if (!TextUtils.isEmpty(this.ck)) {
                                    O8.put(l.a.i, this.ck);
                                }
                                if (!TextUtils.isEmpty(this.cC)) {
                                    O8.put("render_w_h", this.cC);
                                }
                                i29 = this.cJ;
                                if (i29 > 0) {
                                    O8.put("offer_install", i29);
                                }
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                if (this.f14180r == 22) {
                                    O8.put(j.w.f12770K, this.dv);
                                }
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                    O8.put("scenario", this.f14168F);
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                    O8.put("cl_s_type", this.ch);
                                    O8.put("cl_area", this.ci);
                                    if ("3".equals(this.aN) && this.ce == Integer.parseInt("0") && (i28 = this.cw) > 0) {
                                        O8.put("bn_click_area", i28);
                                    }
                                    if (this.dy && !this.dx) {
                                        O8.put("tk_x_cl_sent", "1");
                                    }
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                    O8.put("render_type_video", i21);
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                    O8.put("close_button_m", i22);
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                    O8.put("material_type", i23);
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                    O8.put(com.anythink.core.common.k.aS, this.bM);
                                    O8.put("e_c_key_id", this.bP);
                                    O8.put("unique_id", this.bQ);
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                    O8.put(com.anythink.core.common.k.aT, this.bO);
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                    O8.put("cls_style", i24);
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                    O8.put("iv_template_id", i25);
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                    O8.put("adx_mix_type", i26);
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                    O8.put(com.anythink.core.common.k.aZ, i27);
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 5:
                            case 14:
                            case 17:
                            case 21:
                            default:
                                i10 = i4;
                                break;
                            case 6:
                                str = "aprn_auto_req";
                                str2 = "show_custom_ext";
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 7:
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put("aprn_auto_req", N());
                                O8.put(g.a.f13106C, this.f14185w);
                                O8.put("bidtype", this.f14187y);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put("unit_type", this.cK);
                                e(O8);
                                O8.put("show_custom_ext", this.cU);
                                i10 = i4;
                                break;
                            case 8:
                            case 9:
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put("aprn_auto_req", N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                    O8.put("scenario", this.f14168F);
                                }
                                d(O8);
                                O8.put("unit_type", this.cK);
                                e(O8);
                                O8.put("show_custom_ext", this.cU);
                                O8.put("network_pl_id", this.bC);
                                f(O8);
                                i10 = i4;
                                break;
                            case 10:
                                O8.put("isload", this.f14174M ? 1 : 0);
                                O8.put("reason", this.f14175N);
                                O8.put("gro_id", this.aX);
                                O8.put("req_par", this.cf);
                                O8.put("req_par_num", this.cg);
                                O8.put("load_start_t", this.bn);
                                O8.put("pre_st_t", this.bo);
                                O8.put("req_st_t", this.bp);
                                O8.put("st_succ_t", this.bq);
                                O8.put("dec_st_t", this.br);
                                O8.put("filter_st_start_t", this.bs);
                                O8.put("filter_st_end_t", this.bt);
                                O8.put("adx_cache_t", this.bu);
                                O8.put("cache_st_type", this.bx);
                                i10 = i4;
                                break;
                            case 11:
                                O8.put("auto_req", this.f14182t);
                                O8.put("gro_id", this.aX);
                                O8.put("bidrequesttime", this.f14177P);
                                O8.put("bidresponselist", TextUtils.isEmpty(this.f14179R) ? "[]" : new JSONArray(this.f14179R));
                                O8.put("ft_t", this.bl);
                                if (this.cA == 2) {
                                    O8.put("bidresponsetime", this.f14178Q);
                                    O8.put("data_bidresponsetime", this.f14178Q);
                                } else {
                                    O8.put("data_bidresponsetime", this.dA);
                                    O8.put("bidresponsetime", this.f14178Q);
                                }
                                f(O8);
                                i10 = i4;
                                break;
                            case 12:
                                O8.put("loadtime", this.bz);
                                O8.put("gro_id", this.aX);
                                O8.put("unit_id", this.bA);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put("first_hb_fill_t", this.bv);
                                O8.put("first_nor_fill_t", this.bw);
                                O8.put("load_t", this.bm);
                                O8.put("loaded_ad_type", this.by);
                                int i35 = this.f14175N;
                                if (i35 != 5 && i35 != 13) {
                                    switch (i35) {
                                    }
                                    O8.put("req_par", this.cf);
                                    O8.put("req_par_num", this.cg);
                                    i10 = i4;
                                    break;
                                }
                                O8.put("reason", i35);
                                O8.put("req_par", this.cf);
                                O8.put("req_par_num", this.cg);
                                i10 = i4;
                                break;
                            case 13:
                                str3 = "unit_type";
                                try {
                                    O8.put("unit_id", this.bA);
                                    O8.put("nw_firm_id", this.f14180r);
                                    O8.put("gro_id", this.aX);
                                    O8.put("bidtype", this.f14187y);
                                    O8.put("bidprice", String.valueOf(this.f14188z));
                                    O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                    O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                    O8.put("as_result", !TextUtils.isEmpty(this.f14176O) ? "[]" : new JSONArray(this.f14176O));
                                    O8.put("new_req_id", this.aM);
                                    O8.put("auto_req", this.f14182t);
                                    O8.put("req_id_match", 0);
                                    O8.put("myoffer_showtype", this.f14165C);
                                    if (!TextUtils.isEmpty(this.f14168F)) {
                                        O8.put("scenario", this.f14168F);
                                    }
                                    O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                    O8.put("ahs", this.f14170H);
                                    O8.put("pds", this.f14171I);
                                    O8.put("phs", this.J);
                                    i18 = this.f14175N;
                                    if (i18 != 12) {
                                        O8.put("reason", i18);
                                    }
                                    O8.put(str3, this.cK);
                                    e(O8);
                                    O8.put("show_spec_nw_ad", this.dz);
                                    O8.put("show_custom_ext", this.cU);
                                    i19 = this.dm;
                                    if (i19 != 0) {
                                        O8.put(com.anythink.core.common.k.aZ, i19);
                                    }
                                    O8.put(com.anythink.core.common.k.bj, this.dn);
                                    O8.put(l.a.aO, this.dq);
                                    f(O8);
                                    i10 = i4;
                                } catch (Exception e9) {
                                    e = e9;
                                    i9 = i4;
                                    e.printStackTrace();
                                    i10 = i9;
                                    if (TextUtils.equals(this.aN, "2")) {
                                    }
                                    com.anythink.core.common.u.b a9 = com.anythink.core.common.u.b.a();
                                    if (i10 == 4) {
                                    }
                                    if (TextUtils.equals(this.aN, "0")) {
                                    }
                                    ATAdRequest aTAdRequest2 = this.dw;
                                    if (aTAdRequest2 == null) {
                                    }
                                    if (preLoadInfo != null) {
                                    }
                                    if (this.f14180r == 8) {
                                    }
                                    if (O8 != null) {
                                    }
                                    return O8;
                                }
                                break;
                            case 15:
                                O8.put("gro_id", this.aX);
                                O8.put("bidresponselist", TextUtils.isEmpty(this.f14179R) ? "[]" : new JSONArray(this.f14179R));
                                i10 = i4;
                                break;
                            case 16:
                                str3 = "unit_type";
                                O8.put("ad_ch_st", this.ca);
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("bidtype", this.f14187y);
                                O8.put("bidprice", String.valueOf(this.f14188z));
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("as_result", !TextUtils.isEmpty(this.f14176O) ? "[]" : new JSONArray(this.f14176O));
                                O8.put("new_req_id", this.aM);
                                O8.put("auto_req", this.f14182t);
                                O8.put("req_id_match", 0);
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i18 = this.f14175N;
                                if (i18 != 12) {
                                }
                                O8.put(str3, this.cK);
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put("show_custom_ext", this.cU);
                                i19 = this.dm;
                                if (i19 != 0) {
                                }
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put(l.a.aO, this.dq);
                                f(O8);
                                i10 = i4;
                                break;
                            case 18:
                            case 20:
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("app_nm", this.bW);
                                i10 = i4;
                                break;
                            case 19:
                                O8.put("dl_ts", this.bX);
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("app_nm", this.bW);
                                i10 = i4;
                                break;
                            case 22:
                                str4 = "aprn_auto_req";
                                d3 = this.cQ;
                                if (d3 == -1.0d) {
                                    str5 = "unit_type";
                                    O8.put("mmb_secprice", d3);
                                } else {
                                    str5 = "unit_type";
                                }
                                str7 = this.cR;
                                if (str7 != null) {
                                    O8.put("mmb_secBidder", str7);
                                }
                                d2 = this.cO;
                                if (d2 != -1.0d) {
                                    O8.put("mmb_firstPrice", d2);
                                }
                                str6 = this.cP;
                                if (str6 != null) {
                                    O8.put("mmb_firstBidder", str6);
                                }
                                i30 = this.cS;
                                if (i30 != -1) {
                                    O8.put("mmb_lossReason", i30);
                                }
                                O8.put("mmb_ilrd", this.cT);
                                str = str4;
                                str8 = str5;
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                str2 = "show_custom_ext";
                                O8.put("phs", this.J);
                                O8.put("cl_imp", this.bU);
                                if (!TextUtils.isEmpty(this.ck)) {
                                }
                                if (!TextUtils.isEmpty(this.cC)) {
                                }
                                i29 = this.cJ;
                                if (i29 > 0) {
                                }
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                if (this.f14180r == 22) {
                                }
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 23:
                                str4 = "aprn_auto_req";
                                str5 = "unit_type";
                                d2 = this.cO;
                                if (d2 != -1.0d) {
                                }
                                str6 = this.cP;
                                if (str6 != null) {
                                }
                                i30 = this.cS;
                                if (i30 != -1) {
                                }
                                O8.put("mmb_ilrd", this.cT);
                                str = str4;
                                str8 = str5;
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                str2 = "show_custom_ext";
                                O8.put("phs", this.J);
                                O8.put("cl_imp", this.bU);
                                if (!TextUtils.isEmpty(this.ck)) {
                                }
                                if (!TextUtils.isEmpty(this.cC)) {
                                }
                                i29 = this.cJ;
                                if (i29 > 0) {
                                }
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                if (this.f14180r == 22) {
                                }
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 24:
                                ab abVar = this.di;
                                if (abVar != null) {
                                    str4 = "aprn_auto_req";
                                    O8.put("notice", abVar.a());
                                    bcVar = this.dj;
                                    if (bcVar != null) {
                                        O8.put("reward", bcVar.a());
                                    }
                                    d3 = this.cQ;
                                    if (d3 == -1.0d) {
                                    }
                                    str7 = this.cR;
                                    if (str7 != null) {
                                    }
                                    d2 = this.cO;
                                    if (d2 != -1.0d) {
                                    }
                                    str6 = this.cP;
                                    if (str6 != null) {
                                    }
                                    i30 = this.cS;
                                    if (i30 != -1) {
                                    }
                                    O8.put("mmb_ilrd", this.cT);
                                    str = str4;
                                    str8 = str5;
                                    O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                    O8.put("ahs", this.f14170H);
                                    O8.put("pds", this.f14171I);
                                    str2 = "show_custom_ext";
                                    O8.put("phs", this.J);
                                    O8.put("cl_imp", this.bU);
                                    if (!TextUtils.isEmpty(this.ck)) {
                                    }
                                    if (!TextUtils.isEmpty(this.cC)) {
                                    }
                                    i29 = this.cJ;
                                    if (i29 > 0) {
                                    }
                                    O8.put("rotation_order", this.dp);
                                    O8.put(l.a.aO, this.dq);
                                    if (this.f14180r == 22) {
                                    }
                                    O8.put("unit_id", this.bA);
                                    O8.put("nw_firm_id", this.f14180r);
                                    O8.put("gro_id", this.aX);
                                    O8.put("auto_req", this.f14182t);
                                    O8.put(str, N());
                                    O8.put("bidtype", this.f14187y);
                                    c(O8);
                                    O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                    O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                    O8.put("myoffer_showtype", this.f14165C);
                                    if (!TextUtils.isEmpty(this.f14168F)) {
                                    }
                                    O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                    O8.put("ahs", this.f14170H);
                                    O8.put("pds", this.f14171I);
                                    O8.put("phs", this.J);
                                    i20 = i4;
                                    if (i20 == 6) {
                                    }
                                    i21 = this.cl;
                                    if (i21 > 0) {
                                    }
                                    i22 = this.cz;
                                    if (i22 > 0) {
                                    }
                                    d(O8);
                                    O8.put(str8, this.cK);
                                    i23 = this.cG;
                                    if (i23 > 0) {
                                    }
                                    e(O8);
                                    O8.put("show_spec_nw_ad", this.dz);
                                    O8.put(str2, this.cU);
                                    O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                    if (!TextUtils.isEmpty(this.bM)) {
                                    }
                                    if (!TextUtils.isEmpty(this.bO)) {
                                    }
                                    i24 = this.da;
                                    if (i24 > 0) {
                                    }
                                    i25 = this.cZ;
                                    if (i25 > 0) {
                                    }
                                    i26 = this.db;
                                    if (i26 >= -1) {
                                    }
                                    i27 = this.dm;
                                    if (i27 != 0) {
                                    }
                                    f(O8);
                                    O8.put(com.anythink.core.common.k.bi, this.f0do);
                                    O8.put(com.anythink.core.common.k.bj, this.dn);
                                    O8.put("rotation_order", this.dp);
                                    O8.put(l.a.aO, this.dq);
                                    i10 = i20;
                                    break;
                                }
                                str4 = "aprn_auto_req";
                                bcVar = this.dj;
                                if (bcVar != null) {
                                }
                                d3 = this.cQ;
                                if (d3 == -1.0d) {
                                }
                                str7 = this.cR;
                                if (str7 != null) {
                                }
                                d2 = this.cO;
                                if (d2 != -1.0d) {
                                }
                                str6 = this.cP;
                                if (str6 != null) {
                                }
                                i30 = this.cS;
                                if (i30 != -1) {
                                }
                                O8.put("mmb_ilrd", this.cT);
                                str = str4;
                                str8 = str5;
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                str2 = "show_custom_ext";
                                O8.put("phs", this.J);
                                O8.put("cl_imp", this.bU);
                                if (!TextUtils.isEmpty(this.ck)) {
                                }
                                if (!TextUtils.isEmpty(this.cC)) {
                                }
                                i29 = this.cJ;
                                if (i29 > 0) {
                                }
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                if (this.f14180r == 22) {
                                }
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 25:
                                str4 = "aprn_auto_req";
                                bcVar = this.dj;
                                if (bcVar != null) {
                                }
                                d3 = this.cQ;
                                if (d3 == -1.0d) {
                                }
                                str7 = this.cR;
                                if (str7 != null) {
                                }
                                d2 = this.cO;
                                if (d2 != -1.0d) {
                                }
                                str6 = this.cP;
                                if (str6 != null) {
                                }
                                i30 = this.cS;
                                if (i30 != -1) {
                                }
                                O8.put("mmb_ilrd", this.cT);
                                str = str4;
                                str8 = str5;
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                str2 = "show_custom_ext";
                                O8.put("phs", this.J);
                                O8.put("cl_imp", this.bU);
                                if (!TextUtils.isEmpty(this.ck)) {
                                }
                                if (!TextUtils.isEmpty(this.cC)) {
                                }
                                i29 = this.cJ;
                                if (i29 > 0) {
                                }
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                if (this.f14180r == 22) {
                                }
                                O8.put("unit_id", this.bA);
                                O8.put("nw_firm_id", this.f14180r);
                                O8.put("gro_id", this.aX);
                                O8.put("auto_req", this.f14182t);
                                O8.put(str, N());
                                O8.put("bidtype", this.f14187y);
                                c(O8);
                                O8.put("bidprice_cny", String.valueOf(this.f14163A));
                                O8.put(com.anythink.core.common.k.ap, String.valueOf(this.f14172K));
                                O8.put("myoffer_showtype", this.f14165C);
                                if (!TextUtils.isEmpty(this.f14168F)) {
                                }
                                O8.put(com.anythink.expressad.foundation.d.e.f18820h, this.f14169G);
                                O8.put("ahs", this.f14170H);
                                O8.put("pds", this.f14171I);
                                O8.put("phs", this.J);
                                i20 = i4;
                                if (i20 == 6) {
                                }
                                i21 = this.cl;
                                if (i21 > 0) {
                                }
                                i22 = this.cz;
                                if (i22 > 0) {
                                }
                                d(O8);
                                O8.put(str8, this.cK);
                                i23 = this.cG;
                                if (i23 > 0) {
                                }
                                e(O8);
                                O8.put("show_spec_nw_ad", this.dz);
                                O8.put(str2, this.cU);
                                O8.put("nv_tmpl_id", String.valueOf(this.cV));
                                if (!TextUtils.isEmpty(this.bM)) {
                                }
                                if (!TextUtils.isEmpty(this.bO)) {
                                }
                                i24 = this.da;
                                if (i24 > 0) {
                                }
                                i25 = this.cZ;
                                if (i25 > 0) {
                                }
                                i26 = this.db;
                                if (i26 >= -1) {
                                }
                                i27 = this.dm;
                                if (i27 != 0) {
                                }
                                f(O8);
                                O8.put(com.anythink.core.common.k.bi, this.f0do);
                                O8.put(com.anythink.core.common.k.bj, this.dn);
                                O8.put("rotation_order", this.dp);
                                O8.put(l.a.aO, this.dq);
                                i10 = i20;
                                break;
                            case 26:
                                e eVar = this.dh;
                                if (eVar != null) {
                                    O8.put("sdk_chif_lt", eVar.f14097d);
                                    O8.put("ad_wipl_tp", this.dh.f14098e);
                                    O8.put("ad_wipl_if", this.dh.f14099f);
                                    O8.put("ad_wipl_time", this.dh.f14100g);
                                }
                                i10 = i4;
                                break;
                        }
                        if (TextUtils.equals(this.aN, "2") && (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 13 || i10 == 11 || i10 == 6)) {
                            if (this.ce != 0 || i10 == 11) {
                                O8.put(l.a.aq, this.cx);
                            }
                            map2 = this.cp;
                            if (map2 != null) {
                                Object obj5 = map2.get(ATAdConst.KEY.AD_WIDTH);
                                Object obj6 = this.cp.get(ATAdConst.KEY.AD_HEIGHT);
                                if (obj5 != null) {
                                    try {
                                        O8.put("bn_width", Integer.parseInt(obj5.toString()));
                                    } catch (Exception e10) {
                                        e10.getMessage();
                                    }
                                }
                                if (obj6 != null) {
                                    try {
                                        O8.put("bn_height", Integer.parseInt(obj6.toString()));
                                    } catch (Exception e11) {
                                        e11.getMessage();
                                    }
                                }
                            }
                            if (i10 == 6 && (i13 = this.cw) > 0) {
                                O8.put("bn_click_area", i13);
                            }
                        }
                        com.anythink.core.common.u.b a92 = com.anythink.core.common.u.b.a();
                        if (i10 == 4) {
                            if (i10 == 6 && this.f14180r == 66) {
                                long b9 = com.anythink.core.common.u.b.b((n) this);
                                if (b9 > 0) {
                                    O8.put("s_c_interval", b9);
                                }
                            }
                        } else if (!"0".equals(this.aN)) {
                            long a10 = a92.a((n) this);
                            if (a10 > 0) {
                                O8.put("pl_show_interval", a10);
                            }
                            long b10 = a92.b();
                            if (b10 > 0) {
                                O8.put("bidads_show_interval", b10);
                            }
                        }
                        if (TextUtils.equals(this.aN, "0") && (i10 == 1 || i10 == 4 || i10 == 6)) {
                            i11 = this.cX;
                            if (i11 > 0) {
                                O8.put(j.w.f12765E, i11);
                            }
                            i12 = this.cY;
                            if (i12 > 0) {
                                O8.put(j.w.f12766F, i12);
                            }
                        }
                        ATAdRequest aTAdRequest22 = this.dw;
                        preLoadInfo = aTAdRequest22 == null ? aTAdRequest22.getPreLoadInfo() : null;
                        if (preLoadInfo != null) {
                            try {
                                String placementId = preLoadInfo.getPlacementId();
                                String psId = preLoadInfo.getPsId();
                                String requestId = preLoadInfo.getRequestId();
                                if (!TextUtils.isEmpty(placementId)) {
                                    O8.put("mmed_pl_id", placementId);
                                }
                                if (!TextUtils.isEmpty(psId)) {
                                    O8.put("mmed_psid", psId);
                                }
                                if (!TextUtils.isEmpty(requestId)) {
                                    O8.put("mmed_req_id", requestId);
                                }
                                O8.put("mmed_wait_price_sw", preLoadInfo.getCpEcpmSwitch());
                                O8.put("mmed_wait_price_t", preLoadInfo.getCpEcpmTimeout());
                                MgComparedResult mgComparedResult = preLoadInfo.getMgComparedResult();
                                if (!(i10 == 4 || i10 == 6 || i10 == 13) || (mgComparedResult != null ? mgComparedResult.isCompared() : false)) {
                                    MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo.getPreLoadCallbackRegister();
                                    MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
                                    double uSDEcpm = mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d;
                                    if (uSDEcpm > 0.0d) {
                                        O8.put("mmed_price", String.valueOf(uSDEcpm));
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        if (this.f14180r == 8 && (i10 == 1 || i10 == 6)) {
                            try {
                                map = this.cp;
                                if (map != null && !map.isEmpty()) {
                                    jSONObject = new JSONObject();
                                    obj = this.cp.get(com.anythink.expressad.foundation.g.a.ai);
                                    if (obj instanceof String) {
                                        jSONObject.put(com.anythink.expressad.foundation.g.a.ai, obj);
                                    }
                                    obj2 = this.cp.get("lat");
                                    if (obj2 instanceof String) {
                                        jSONObject.put("lat", obj2);
                                    }
                                    obj3 = this.cp.get("loc_time");
                                    if (obj3 instanceof String) {
                                        jSONObject.put("loc_time", obj3);
                                    }
                                    obj4 = this.cp.get("wxopenid");
                                    if (obj4 instanceof String) {
                                        jSONObject.put("wxopenid", obj4);
                                    }
                                    if (jSONObject.length() > 0) {
                                        O8.put("tx_d", jSONObject);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        if (O8 != null && i10 == 6) {
                            try {
                                if (this.dx) {
                                    this.dy = true;
                                    O8.put("type", 28);
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                        return O8;
                    }
                }
            }
            List<Integer> list = this.f14173L;
            if (list != null && !list.isEmpty()) {
                O8.put("bid_link", this.f14173L.toString());
            }
        }
        if (!TextUtils.isEmpty(this.bB)) {
            O8.put("bid_t_m", this.bB);
        }
        dVar = this.cq;
        if (dVar != null) {
        }
        i14 = this.cc;
        if (i14 > 0) {
        }
        if (this.cF) {
        }
        i15 = this.de;
        if (i15 > 0) {
        }
        i16 = this.df;
        if (i16 > 0) {
        }
        O8.put("network_pl_id", this.bC);
        aTAdRequest = this.dw;
        if (aTAdRequest == null) {
        }
        i17 = this.dB;
        if (i17 != -1) {
        }
        if (!TextUtils.isEmpty(this.dC)) {
        }
        String str82 = "unit_type";
        switch (i4) {
        }
        if (TextUtils.equals(this.aN, "2")) {
            if (this.ce != 0) {
            }
            O8.put(l.a.aq, this.cx);
            map2 = this.cp;
            if (map2 != null) {
            }
            if (i10 == 6) {
                O8.put("bn_click_area", i13);
            }
        }
        com.anythink.core.common.u.b a922 = com.anythink.core.common.u.b.a();
        if (i10 == 4) {
        }
        if (TextUtils.equals(this.aN, "0")) {
            i11 = this.cX;
            if (i11 > 0) {
            }
            i12 = this.cY;
            if (i12 > 0) {
            }
        }
        ATAdRequest aTAdRequest222 = this.dw;
        if (aTAdRequest222 == null) {
        }
        if (preLoadInfo != null) {
        }
        if (this.f14180r == 8) {
            map = this.cp;
            if (map != null) {
                jSONObject = new JSONObject();
                obj = this.cp.get(com.anythink.expressad.foundation.g.a.ai);
                if (obj instanceof String) {
                }
                obj2 = this.cp.get("lat");
                if (obj2 instanceof String) {
                }
                obj3 = this.cp.get("loc_time");
                if (obj3 instanceof String) {
                }
                obj4 = this.cp.get("wxopenid");
                if (obj4 instanceof String) {
                }
                if (jSONObject.length() > 0) {
                }
            }
        }
        if (O8 != null) {
            if (this.dx) {
            }
        }
        return O8;
    }

    public final void P(int i4) {
        this.cw = i4;
    }

    public final void Q(int i4) {
        this.cx = i4;
    }

    public final void R(int i4) {
        this.cB = i4;
    }

    public final void S(int i4) {
        this.cH = i4;
    }

    public final void T(int i4) {
        this.cI = i4;
    }

    public final void U(int i4) {
        this.cJ = i4;
    }

    public final void V(int i4) {
        this.dz = i4;
    }

    public final void W(int i4) {
        this.cV = i4;
    }

    public final void X(int i4) {
        this.cX = i4;
    }

    public final void Y(int i4) {
        this.cY = i4;
    }

    public final void Z(int i4) {
        this.cZ = i4;
    }

    public final void a(int i4) {
        this.bx = i4;
    }

    public final void aa(int i4) {
        this.da = i4;
    }

    public final void ab(int i4) {
        this.db = i4;
    }

    public final void ac(int i4) {
        this.dd = i4;
    }

    public final void ad(int i4) {
        this.de = i4;
    }

    public final void ae(int i4) {
        this.dk = i4;
    }

    public final void ag(int i4) {
        this.dr = i4;
    }

    public final void ah(int i4) {
        this.ds = i4;
    }

    public final void ai(int i4) {
        this.dp = i4;
    }

    public final void aj(int i4) {
        this.dq = i4;
    }

    public final void ak(int i4) {
        this.dv = i4;
    }

    public final ATCustomContentResult aq() {
        return this.dl;
    }

    public final int ar() {
        return this.dr;
    }

    public final int as() {
        return this.ds;
    }

    public final int at() {
        return this.dp;
    }

    public final String au() {
        return this.dt;
    }

    public final void b(int i4) {
        this.by = i4;
    }

    public final void c(int i4) {
        this.cS = i4;
    }

    public final void d(int i4) {
        this.cK = i4;
    }

    public final double e() {
        return this.cy;
    }

    public final d f() {
        return this.cq;
    }

    public final String g() {
        d dVar = this.cq;
        return dVar != null ? dVar.a() : "";
    }

    public final Map<String, Object> h() {
        return this.cr;
    }

    public final int i() {
        return this.cv;
    }

    public final Map<String, Object> j() {
        return this.cp;
    }

    public final int k() {
        return this.cc;
    }

    public final void l(int i4) {
        this.bZ = i4;
    }

    public final void m(int i4) {
        this.bY = i4;
    }

    public final void n() {
        if (this.bV != 1) {
            this.bU = 1;
        }
    }

    public final String o() {
        return this.bT;
    }

    public final double p() {
        return this.bL;
    }

    public final void q(int i4) {
        this.f14171I = i4;
    }

    public final void r(int i4) {
        this.J = i4;
    }

    public final void s(int i4) {
        this.bE = i4;
    }

    public final void t(int i4) {
        this.cl = i4;
    }

    public final void u(int i4) {
        this.f14166D = i4;
    }

    public final void v(int i4) {
        this.f14167E = i4;
    }

    public final void w(int i4) {
        this.f14187y = i4;
    }

    public final void x(int i4) {
        this.bh = i4;
    }

    public final void y(int i4) {
        this.bi = i4;
    }

    public final void z(int i4) {
        this.ba = i4;
    }

    public final void A(String str) {
        this.dc = str;
    }

    public final void B(String str) {
        this.dt = str;
    }

    public final void C(String str) {
        this.du = str;
    }

    public final void M(int i4) {
        this.cG = i4;
    }

    public final void N(int i4) {
        this.dB = i4;
    }

    public final ATAdRequest a() {
        return this.dw;
    }

    public final void b(double d2) {
        this.cQ = d2;
    }

    public final void c(String str) {
        this.cT = str;
    }

    public final void d() {
        this.cA = 2;
    }

    public final void e(int i4) {
        this.cz = i4;
    }

    public final void f(int i4) {
        this.cv = i4;
    }

    public final void h(int i4) {
        this.cg = i4;
    }

    public final void i(int i4) {
        this.cb = i4;
    }

    public final void j(int i4) {
        this.cc = i4;
    }

    public final void k(int i4) {
        this.ca = i4;
    }

    public final int l() {
        return this.bY;
    }

    public final void m() {
        this.bV = 1;
    }

    public final void o(int i4) {
        this.f14169G = i4;
    }

    public final void p(int i4) {
        this.f14170H = i4;
    }

    public final void q(String str) {
        this.bH = str;
    }

    public final void r(String str) {
        this.bA = str;
    }

    public final void s(String str) {
        this.bc = str;
    }

    public final void t(String str) {
        this.aZ = str;
    }

    public final void u(String str) {
        this.aY = str;
    }

    public final void v(String str) {
        this.bS = str;
    }

    public final void w(String str) {
        this.f14176O = str;
    }

    public final void x(String str) {
        this.f14179R = str;
    }

    public final void y(String str) {
        this.dC = str;
    }

    public final void z(String str) {
        this.cU = str;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.dw = aTAdRequest;
    }

    public final void b(String str) {
        this.cR = str;
    }

    public final long c() {
        return this.cE;
    }

    public final void d(double d2) {
        this.cu = d2;
    }

    public final void e(double d2) {
        this.ct = d2;
    }

    public final void f(double d2) {
        this.f14172K = d2;
    }

    public final void h(double d2) {
        this.bN = d2;
    }

    public final void i(String str) {
        this.bQ = str;
    }

    public final void j(String str) {
        this.bJ = str;
    }

    public final void k(String str) {
        this.bR = str;
    }

    public final void l(String str) {
        this.f14164B = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.bB = com.anythink.core.common.v.o.b(this.f14164B);
    }

    public final void m(String str) {
        this.bC = str;
    }

    public final void n(int i4) {
        this.bP = i4;
    }

    public final void o(String str) {
        this.bF = str;
    }

    public final void p(String str) {
        this.bG = str;
    }

    public final void q(long j9) {
        this.bk = j9;
    }

    public final void r(long j9) {
        this.bz = j9;
    }

    public final void s(long j9) {
        this.f14177P = j9;
    }

    public final void t(long j9) {
        this.f14178Q = j9;
    }

    public final void u(long j9) {
        this.dA = j9;
    }

    public final void v(long j9) {
        this.f0do = j9;
    }

    public final void a(double d2) {
        this.cO = d2;
    }

    public final long b() {
        return this.cD;
    }

    public final void c(double d2) {
        this.cy = d2;
    }

    public final void d(String str) {
        this.ck = str;
    }

    public final void e(String str) {
        this.bW = str;
    }

    public final void f(String str) {
        this.bT = str;
    }

    public final void g(int i4) {
        this.cf = i4;
    }

    public final void h(String str) {
        this.bO = str;
    }

    public final void i(double d2) {
        this.bI = d2;
    }

    public final void j(double d2) {
        this.f14188z = d2;
    }

    public final void k(double d2) {
        this.f14163A = d2;
    }

    public final void m(double d2) {
        this.cM = d2;
    }

    public final void n(String str) {
        this.bD = str;
    }

    private void e(boolean z8) {
        this.bj = z8;
    }

    private void f(JSONObject jSONObject, int i4) {
        com.anythink.core.common.u.b a9 = com.anythink.core.common.u.b.a();
        try {
            if (i4 != 4) {
                if (i4 == 6 && this.f14180r == 66) {
                    long b9 = com.anythink.core.common.u.b.b(this);
                    if (b9 > 0) {
                        jSONObject.put("s_c_interval", b9);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("0".equals(this.aN)) {
                return;
            }
            long a10 = a9.a(this);
            if (a10 > 0) {
                jSONObject.put("pl_show_interval", a10);
            }
            long b10 = a9.b();
            if (b10 > 0) {
                jSONObject.put("bidads_show_interval", b10);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a(String str) {
        this.cP = str;
    }

    public final void b(Map<String, Object> map) {
        this.cp = map;
    }

    public final void c(Map<String, ATRewardInfo> map) {
        this.cn = map;
    }

    public final void d(Map<String, Object> map) {
        this.co = map;
    }

    public final void g(double d2) {
        this.bL = d2;
    }

    public final void n(double d2) {
        this.dn = d2;
    }

    private void c(JSONObject jSONObject) {
        double d2 = this.ct;
        if (d2 > 0.0d) {
            jSONObject.put("bidprice", String.valueOf(d2));
            jSONObject.put("am_bp_type", 3);
            return;
        }
        jSONObject.put("bidprice", String.valueOf(this.f14188z));
        int i4 = 1;
        if (this.dk == 1) {
            double d3 = this.cu;
            if (d3 == -1.0d) {
                i4 = 5;
            } else if (d3 == 0.0d) {
                i4 = 4;
            } else if (this.cs) {
                i4 = 2;
            }
        }
        jSONObject.put("am_bp_type", i4);
    }

    private void d(JSONObject jSONObject) {
        Map<String, Object> map = this.cr;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (this.f14180r == 2 || this.dk == 1) {
            try {
                jSONObject.put("am_ilrd", new JSONObject(this.cr).toString());
            } catch (Throwable unused) {
            }
        }
    }

    private void e(JSONObject jSONObject, int i4) {
        if (i4 == 1 || i4 == 6) {
            try {
                Map<String, Object> map = this.cp;
                if (map == null || map.isEmpty()) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                Object obj = this.cp.get(com.anythink.expressad.foundation.g.a.ai);
                if (obj instanceof String) {
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.ai, obj);
                }
                Object obj2 = this.cp.get("lat");
                if (obj2 instanceof String) {
                    jSONObject2.put("lat", obj2);
                }
                Object obj3 = this.cp.get("loc_time");
                if (obj3 instanceof String) {
                    jSONObject2.put("loc_time", obj3);
                }
                Object obj4 = this.cp.get("wxopenid");
                if (obj4 instanceof String) {
                    jSONObject2.put("wxopenid", obj4);
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put("tx_d", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i4, int i9) {
        this.cC = i4 + "_" + i9;
    }

    public final void b(boolean z8) {
        this.f14174M = z8;
    }

    public final void g(String str) {
        this.bM = str;
    }

    public final void l(double d2) {
        this.cL = d2;
    }

    private void b(JSONObject jSONObject, int i4) {
        if (jSONObject == null || i4 != 6) {
            return;
        }
        try {
            if (this.dx) {
                this.dy = true;
                jSONObject.put("type", 28);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(d dVar) {
        this.cq = dVar;
    }

    public final void a(Map<String, Object> map) {
        this.cr = map;
    }

    private void d(JSONObject jSONObject, int i4) {
        try {
            if (TextUtils.equals(this.aN, "0")) {
                if (i4 == 1 || i4 == 4 || i4 == 6) {
                    int i9 = this.cX;
                    if (i9 > 0) {
                        jSONObject.put(j.w.f12765E, i9);
                    }
                    int i10 = this.cY;
                    if (i10 > 0) {
                        jSONObject.put(j.w.f12766F, i10);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z8) {
        this.cs = z8;
    }

    private void b(int i4, JSONObject jSONObject) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 4 && i4 != 6 && i4 != 8) {
                if (i4 != 13) {
                    if (i4 != 25) {
                        return;
                    }
                }
            }
            List<Integer> list = this.f14173L;
            if (list != null && !list.isEmpty()) {
                jSONObject.put("bid_link", this.f14173L.toString());
            }
        }
        if (TextUtils.isEmpty(this.bB)) {
            return;
        }
        jSONObject.put("bid_t_m", this.bB);
    }

    public final void a(ATRewardInfo aTRewardInfo) {
        this.cm = aTRewardInfo;
    }

    public final void a(bv bvVar) {
        if (bvVar != null) {
            this.bA = bvVar.z();
            this.f14188z = bvVar.D();
            this.f14163A = bvVar.f13979z;
            this.cc = bvVar.d();
        }
    }

    public final void af(int i4) {
        this.dm = i4;
    }

    private void c(JSONObject jSONObject, int i4) {
        int i9;
        try {
            if (TextUtils.equals(this.aN, "2")) {
                if (i4 == 1 || i4 == 2 || i4 == 4 || i4 == 13 || i4 == 11 || i4 == 6) {
                    if (this.ce == 0 || i4 == 11) {
                        jSONObject.put(l.a.aq, this.cx);
                    }
                    Map<String, Object> map = this.cp;
                    if (map != null) {
                        Object obj = map.get(ATAdConst.KEY.AD_WIDTH);
                        Object obj2 = this.cp.get(ATAdConst.KEY.AD_HEIGHT);
                        if (obj != null) {
                            try {
                                jSONObject.put("bn_width", Integer.parseInt(obj.toString()));
                            } catch (Exception e6) {
                                e6.getMessage();
                            }
                        }
                        if (obj2 != null) {
                            try {
                                jSONObject.put("bn_height", Integer.parseInt(obj2.toString()));
                            } catch (Exception e9) {
                                e9.getMessage();
                            }
                        }
                    }
                    if (i4 != 6 || (i9 = this.cw) <= 0) {
                        return;
                    }
                    jSONObject.put("bn_click_area", i9);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(boolean z8) {
        this.dx = z8;
    }

    private void f(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(this.dt)) {
                jSONObject.put("deal_type", this.dt);
            }
            if (TextUtils.isEmpty(this.du)) {
                return;
            }
            jSONObject.put("deal_id", this.du);
        } catch (Throwable unused) {
        }
    }

    private void a(JSONObject jSONObject, int i4) {
        ATAdRequest aTAdRequest = this.dw;
        MgPreLoadAdRequest preLoadInfo = aTAdRequest != null ? aTAdRequest.getPreLoadInfo() : null;
        if (preLoadInfo == null) {
            return;
        }
        try {
            String placementId = preLoadInfo.getPlacementId();
            String psId = preLoadInfo.getPsId();
            String requestId = preLoadInfo.getRequestId();
            if (!TextUtils.isEmpty(placementId)) {
                jSONObject.put("mmed_pl_id", placementId);
            }
            if (!TextUtils.isEmpty(psId)) {
                jSONObject.put("mmed_psid", psId);
            }
            if (!TextUtils.isEmpty(requestId)) {
                jSONObject.put("mmed_req_id", requestId);
            }
            jSONObject.put("mmed_wait_price_sw", preLoadInfo.getCpEcpmSwitch());
            jSONObject.put("mmed_wait_price_t", preLoadInfo.getCpEcpmTimeout());
            MgComparedResult mgComparedResult = preLoadInfo.getMgComparedResult();
            boolean z8 = false;
            boolean isCompared = mgComparedResult != null ? mgComparedResult.isCompared() : false;
            if ((i4 != 4 && i4 != 6 && i4 != 13) || isCompared) {
                z8 = true;
            }
            if (z8) {
                MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo.getPreLoadCallbackRegister();
                MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
                double uSDEcpm = mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d) {
                    jSONObject.put("mmed_price", String.valueOf(uSDEcpm));
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void e(JSONObject jSONObject) {
        try {
            jSONObject.put("dd_ori_price", String.valueOf(this.cM));
            jSONObject.put(com.anythink.core.common.k.aN, String.valueOf(this.cL));
        } catch (Throwable unused) {
        }
    }

    public final void e(Map<String, String> map) {
        this.cN = map;
    }

    public final void c(boolean z8) {
        this.cF = z8;
    }

    private static boolean a(int i4, MgPreLoadAdRequest mgPreLoadAdRequest) {
        MgComparedResult mgComparedResult = mgPreLoadAdRequest.getMgComparedResult();
        return !(i4 == 4 || i4 == 6 || i4 == 13) || (mgComparedResult != null ? mgComparedResult.isCompared() : false);
    }

    private void a(int i4, JSONObject jSONObject) {
        if (i4 == 1 || i4 == 2 || i4 == 4 || i4 == 6 || i4 == 13 || i4 == 24) {
            jSONObject.put("extra", this.bS);
        }
    }

    public final void a(aa aaVar) {
        this.dg = aaVar;
    }

    public final void a(ab abVar) {
        this.di = abVar;
    }

    public final void a(bc bcVar) {
        this.dj = bcVar;
    }

    public final void a(e eVar) {
        this.dh = eVar;
    }

    public final void a(ATCustomContentResult aTCustomContentResult) {
        this.dl = aTCustomContentResult;
    }

    public final void a(List<Integer> list) {
        this.f14173L = list;
    }
}
