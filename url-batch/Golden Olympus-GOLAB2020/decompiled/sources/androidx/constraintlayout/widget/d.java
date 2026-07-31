package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C3139z9;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.C3378a;
import r.AbstractC3384a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f11209d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f11210e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap f11211a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f11212b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f11213c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f11214a;

        /* renamed from: b, reason: collision with root package name */
        public final C0087d f11215b = new C0087d();

        /* renamed from: c, reason: collision with root package name */
        public final c f11216c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f11217d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f11218e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap f11219f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i4, ConstraintLayout.b bVar) {
            this.f11214a = i4;
            b bVar2 = this.f11217d;
            bVar2.f11261h = bVar.f11125d;
            bVar2.f11263i = bVar.f11127e;
            bVar2.f11265j = bVar.f11129f;
            bVar2.f11267k = bVar.f11131g;
            bVar2.f11268l = bVar.f11133h;
            bVar2.f11269m = bVar.f11135i;
            bVar2.f11270n = bVar.f11137j;
            bVar2.f11271o = bVar.f11139k;
            bVar2.f11272p = bVar.f11141l;
            bVar2.f11273q = bVar.f11149p;
            bVar2.f11274r = bVar.f11150q;
            bVar2.f11275s = bVar.f11151r;
            bVar2.f11276t = bVar.f11152s;
            bVar2.f11277u = bVar.f11159z;
            bVar2.f11278v = bVar.f11093A;
            bVar2.f11279w = bVar.f11094B;
            bVar2.f11280x = bVar.f11143m;
            bVar2.f11281y = bVar.f11145n;
            bVar2.f11282z = bVar.f11147o;
            bVar2.f11221A = bVar.f11109Q;
            bVar2.f11222B = bVar.f11110R;
            bVar2.f11223C = bVar.f11111S;
            bVar2.f11259g = bVar.f11123c;
            bVar2.f11255e = bVar.f11119a;
            bVar2.f11257f = bVar.f11121b;
            bVar2.f11251c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f11253d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f11224D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f11225E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f11226F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f11227G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f11236P = bVar.f11098F;
            bVar2.f11237Q = bVar.f11097E;
            bVar2.f11239S = bVar.f11100H;
            bVar2.f11238R = bVar.f11099G;
            bVar2.f11262h0 = bVar.f11112T;
            bVar2.f11264i0 = bVar.f11113U;
            bVar2.f11240T = bVar.f11101I;
            bVar2.f11241U = bVar.f11102J;
            bVar2.f11242V = bVar.f11105M;
            bVar2.f11243W = bVar.f11106N;
            bVar2.f11244X = bVar.f11103K;
            bVar2.f11245Y = bVar.f11104L;
            bVar2.f11246Z = bVar.f11107O;
            bVar2.f11248a0 = bVar.f11108P;
            bVar2.f11260g0 = bVar.f11114V;
            bVar2.f11231K = bVar.f11154u;
            bVar2.f11233M = bVar.f11156w;
            bVar2.f11230J = bVar.f11153t;
            bVar2.f11232L = bVar.f11155v;
            bVar2.f11235O = bVar.f11157x;
            bVar2.f11234N = bVar.f11158y;
            bVar2.f11228H = bVar.getMarginEnd();
            this.f11217d.f11229I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f11217d;
            bVar.f11125d = bVar2.f11261h;
            bVar.f11127e = bVar2.f11263i;
            bVar.f11129f = bVar2.f11265j;
            bVar.f11131g = bVar2.f11267k;
            bVar.f11133h = bVar2.f11268l;
            bVar.f11135i = bVar2.f11269m;
            bVar.f11137j = bVar2.f11270n;
            bVar.f11139k = bVar2.f11271o;
            bVar.f11141l = bVar2.f11272p;
            bVar.f11149p = bVar2.f11273q;
            bVar.f11150q = bVar2.f11274r;
            bVar.f11151r = bVar2.f11275s;
            bVar.f11152s = bVar2.f11276t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f11224D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f11225E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f11226F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f11227G;
            bVar.f11157x = bVar2.f11235O;
            bVar.f11158y = bVar2.f11234N;
            bVar.f11154u = bVar2.f11231K;
            bVar.f11156w = bVar2.f11233M;
            bVar.f11159z = bVar2.f11277u;
            bVar.f11093A = bVar2.f11278v;
            bVar.f11143m = bVar2.f11280x;
            bVar.f11145n = bVar2.f11281y;
            bVar.f11147o = bVar2.f11282z;
            bVar.f11094B = bVar2.f11279w;
            bVar.f11109Q = bVar2.f11221A;
            bVar.f11110R = bVar2.f11222B;
            bVar.f11098F = bVar2.f11236P;
            bVar.f11097E = bVar2.f11237Q;
            bVar.f11100H = bVar2.f11239S;
            bVar.f11099G = bVar2.f11238R;
            bVar.f11112T = bVar2.f11262h0;
            bVar.f11113U = bVar2.f11264i0;
            bVar.f11101I = bVar2.f11240T;
            bVar.f11102J = bVar2.f11241U;
            bVar.f11105M = bVar2.f11242V;
            bVar.f11106N = bVar2.f11243W;
            bVar.f11103K = bVar2.f11244X;
            bVar.f11104L = bVar2.f11245Y;
            bVar.f11107O = bVar2.f11246Z;
            bVar.f11108P = bVar2.f11248a0;
            bVar.f11111S = bVar2.f11223C;
            bVar.f11123c = bVar2.f11259g;
            bVar.f11119a = bVar2.f11255e;
            bVar.f11121b = bVar2.f11257f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f11251c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f11253d;
            String str = bVar2.f11260g0;
            if (str != null) {
                bVar.f11114V = str;
            }
            bVar.setMarginStart(bVar2.f11229I);
            bVar.setMarginEnd(this.f11217d.f11228H);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f11217d.a(this.f11217d);
            aVar.f11216c.a(this.f11216c);
            aVar.f11215b.a(this.f11215b);
            aVar.f11218e.a(this.f11218e);
            aVar.f11214a = this.f11214a;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f11220k0;

        /* renamed from: c, reason: collision with root package name */
        public int f11251c;

        /* renamed from: d, reason: collision with root package name */
        public int f11253d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f11256e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f11258f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f11260g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f11247a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f11249b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f11255e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f11257f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f11259g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f11261h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f11263i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f11265j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f11267k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f11268l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f11269m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f11270n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f11271o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f11272p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f11273q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f11274r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f11275s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f11276t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f11277u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f11278v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f11279w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f11280x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f11281y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f11282z = 0.0f;

        /* renamed from: A, reason: collision with root package name */
        public int f11221A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f11222B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f11223C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f11224D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f11225E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f11226F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f11227G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f11228H = -1;

        /* renamed from: I, reason: collision with root package name */
        public int f11229I = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f11230J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f11231K = -1;

        /* renamed from: L, reason: collision with root package name */
        public int f11232L = -1;

        /* renamed from: M, reason: collision with root package name */
        public int f11233M = -1;

        /* renamed from: N, reason: collision with root package name */
        public int f11234N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f11235O = -1;

        /* renamed from: P, reason: collision with root package name */
        public float f11236P = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public float f11237Q = -1.0f;

        /* renamed from: R, reason: collision with root package name */
        public int f11238R = 0;

        /* renamed from: S, reason: collision with root package name */
        public int f11239S = 0;

        /* renamed from: T, reason: collision with root package name */
        public int f11240T = 0;

        /* renamed from: U, reason: collision with root package name */
        public int f11241U = 0;

        /* renamed from: V, reason: collision with root package name */
        public int f11242V = -1;

        /* renamed from: W, reason: collision with root package name */
        public int f11243W = -1;

        /* renamed from: X, reason: collision with root package name */
        public int f11244X = -1;

        /* renamed from: Y, reason: collision with root package name */
        public int f11245Y = -1;

        /* renamed from: Z, reason: collision with root package name */
        public float f11246Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f11248a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f11250b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f11252c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f11254d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f11262h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f11264i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f11266j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11220k0 = sparseIntArray;
            sparseIntArray.append(g.f11504q3, 24);
            f11220k0.append(g.f11509r3, 25);
            f11220k0.append(g.f11519t3, 28);
            f11220k0.append(g.f11524u3, 29);
            f11220k0.append(g.f11549z3, 35);
            f11220k0.append(g.f11544y3, 34);
            f11220k0.append(g.f11429b3, 4);
            f11220k0.append(g.f11424a3, 3);
            f11220k0.append(g.f11415Y2, 1);
            f11220k0.append(g.f11334E3, 6);
            f11220k0.append(g.f11339F3, 7);
            f11220k0.append(g.f11464i3, 17);
            f11220k0.append(g.f11469j3, 18);
            f11220k0.append(g.f11474k3, 19);
            f11220k0.append(g.f11355J2, 26);
            f11220k0.append(g.f11529v3, 31);
            f11220k0.append(g.f11534w3, 32);
            f11220k0.append(g.f11459h3, 10);
            f11220k0.append(g.f11454g3, 9);
            f11220k0.append(g.I3, 13);
            f11220k0.append(g.L3, 16);
            f11220k0.append(g.J3, 14);
            f11220k0.append(g.G3, 11);
            f11220k0.append(g.K3, 15);
            f11220k0.append(g.H3, 12);
            f11220k0.append(g.f11324C3, 38);
            f11220k0.append(g.f11494o3, 37);
            f11220k0.append(g.f11489n3, 39);
            f11220k0.append(g.f11319B3, 40);
            f11220k0.append(g.f11484m3, 20);
            f11220k0.append(g.f11314A3, 36);
            f11220k0.append(g.f11449f3, 5);
            f11220k0.append(g.f11499p3, 76);
            f11220k0.append(g.f11539x3, 76);
            f11220k0.append(g.f11514s3, 76);
            f11220k0.append(g.f11419Z2, 76);
            f11220k0.append(g.f11411X2, 76);
            f11220k0.append(g.f11367M2, 23);
            f11220k0.append(g.f11375O2, 27);
            f11220k0.append(g.f11383Q2, 30);
            f11220k0.append(g.f11387R2, 8);
            f11220k0.append(g.f11371N2, 33);
            f11220k0.append(g.f11379P2, 2);
            f11220k0.append(g.f11359K2, 22);
            f11220k0.append(g.f11363L2, 21);
            f11220k0.append(g.f11434c3, 61);
            f11220k0.append(g.f11444e3, 62);
            f11220k0.append(g.f11439d3, 63);
            f11220k0.append(g.f11329D3, 69);
            f11220k0.append(g.f11479l3, 70);
            f11220k0.append(g.f11403V2, 71);
            f11220k0.append(g.f11395T2, 72);
            f11220k0.append(g.f11399U2, 73);
            f11220k0.append(g.f11407W2, 74);
            f11220k0.append(g.f11391S2, 75);
        }

        public void a(b bVar) {
            this.f11247a = bVar.f11247a;
            this.f11251c = bVar.f11251c;
            this.f11249b = bVar.f11249b;
            this.f11253d = bVar.f11253d;
            this.f11255e = bVar.f11255e;
            this.f11257f = bVar.f11257f;
            this.f11259g = bVar.f11259g;
            this.f11261h = bVar.f11261h;
            this.f11263i = bVar.f11263i;
            this.f11265j = bVar.f11265j;
            this.f11267k = bVar.f11267k;
            this.f11268l = bVar.f11268l;
            this.f11269m = bVar.f11269m;
            this.f11270n = bVar.f11270n;
            this.f11271o = bVar.f11271o;
            this.f11272p = bVar.f11272p;
            this.f11273q = bVar.f11273q;
            this.f11274r = bVar.f11274r;
            this.f11275s = bVar.f11275s;
            this.f11276t = bVar.f11276t;
            this.f11277u = bVar.f11277u;
            this.f11278v = bVar.f11278v;
            this.f11279w = bVar.f11279w;
            this.f11280x = bVar.f11280x;
            this.f11281y = bVar.f11281y;
            this.f11282z = bVar.f11282z;
            this.f11221A = bVar.f11221A;
            this.f11222B = bVar.f11222B;
            this.f11223C = bVar.f11223C;
            this.f11224D = bVar.f11224D;
            this.f11225E = bVar.f11225E;
            this.f11226F = bVar.f11226F;
            this.f11227G = bVar.f11227G;
            this.f11228H = bVar.f11228H;
            this.f11229I = bVar.f11229I;
            this.f11230J = bVar.f11230J;
            this.f11231K = bVar.f11231K;
            this.f11232L = bVar.f11232L;
            this.f11233M = bVar.f11233M;
            this.f11234N = bVar.f11234N;
            this.f11235O = bVar.f11235O;
            this.f11236P = bVar.f11236P;
            this.f11237Q = bVar.f11237Q;
            this.f11238R = bVar.f11238R;
            this.f11239S = bVar.f11239S;
            this.f11240T = bVar.f11240T;
            this.f11241U = bVar.f11241U;
            this.f11242V = bVar.f11242V;
            this.f11243W = bVar.f11243W;
            this.f11244X = bVar.f11244X;
            this.f11245Y = bVar.f11245Y;
            this.f11246Z = bVar.f11246Z;
            this.f11248a0 = bVar.f11248a0;
            this.f11250b0 = bVar.f11250b0;
            this.f11252c0 = bVar.f11252c0;
            this.f11254d0 = bVar.f11254d0;
            this.f11260g0 = bVar.f11260g0;
            int[] iArr = bVar.f11256e0;
            if (iArr != null) {
                this.f11256e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f11256e0 = null;
            }
            this.f11258f0 = bVar.f11258f0;
            this.f11262h0 = bVar.f11262h0;
            this.f11264i0 = bVar.f11264i0;
            this.f11266j0 = bVar.f11266j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11351I2);
            this.f11249b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = f11220k0.get(index);
                if (i5 == 80) {
                    this.f11262h0 = obtainStyledAttributes.getBoolean(index, this.f11262h0);
                } else if (i5 != 81) {
                    switch (i5) {
                        case 1:
                            this.f11272p = d.n(obtainStyledAttributes, index, this.f11272p);
                            break;
                        case 2:
                            this.f11227G = obtainStyledAttributes.getDimensionPixelSize(index, this.f11227G);
                            break;
                        case 3:
                            this.f11271o = d.n(obtainStyledAttributes, index, this.f11271o);
                            break;
                        case 4:
                            this.f11270n = d.n(obtainStyledAttributes, index, this.f11270n);
                            break;
                        case 5:
                            this.f11279w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f11221A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11221A);
                            break;
                        case 7:
                            this.f11222B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11222B);
                            break;
                        case 8:
                            this.f11228H = obtainStyledAttributes.getDimensionPixelSize(index, this.f11228H);
                            break;
                        case 9:
                            this.f11276t = d.n(obtainStyledAttributes, index, this.f11276t);
                            break;
                        case 10:
                            this.f11275s = d.n(obtainStyledAttributes, index, this.f11275s);
                            break;
                        case 11:
                            this.f11233M = obtainStyledAttributes.getDimensionPixelSize(index, this.f11233M);
                            break;
                        case 12:
                            this.f11234N = obtainStyledAttributes.getDimensionPixelSize(index, this.f11234N);
                            break;
                        case 13:
                            this.f11230J = obtainStyledAttributes.getDimensionPixelSize(index, this.f11230J);
                            break;
                        case 14:
                            this.f11232L = obtainStyledAttributes.getDimensionPixelSize(index, this.f11232L);
                            break;
                        case 15:
                            this.f11235O = obtainStyledAttributes.getDimensionPixelSize(index, this.f11235O);
                            break;
                        case 16:
                            this.f11231K = obtainStyledAttributes.getDimensionPixelSize(index, this.f11231K);
                            break;
                        case 17:
                            this.f11255e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11255e);
                            break;
                        case 18:
                            this.f11257f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11257f);
                            break;
                        case 19:
                            this.f11259g = obtainStyledAttributes.getFloat(index, this.f11259g);
                            break;
                        case 20:
                            this.f11277u = obtainStyledAttributes.getFloat(index, this.f11277u);
                            break;
                        case 21:
                            this.f11253d = obtainStyledAttributes.getLayoutDimension(index, this.f11253d);
                            break;
                        case 22:
                            this.f11251c = obtainStyledAttributes.getLayoutDimension(index, this.f11251c);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            this.f11224D = obtainStyledAttributes.getDimensionPixelSize(index, this.f11224D);
                            break;
                        case 24:
                            this.f11261h = d.n(obtainStyledAttributes, index, this.f11261h);
                            break;
                        case 25:
                            this.f11263i = d.n(obtainStyledAttributes, index, this.f11263i);
                            break;
                        case 26:
                            this.f11223C = obtainStyledAttributes.getInt(index, this.f11223C);
                            break;
                        case 27:
                            this.f11225E = obtainStyledAttributes.getDimensionPixelSize(index, this.f11225E);
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            this.f11265j = d.n(obtainStyledAttributes, index, this.f11265j);
                            break;
                        case 29:
                            this.f11267k = d.n(obtainStyledAttributes, index, this.f11267k);
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            this.f11229I = obtainStyledAttributes.getDimensionPixelSize(index, this.f11229I);
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            this.f11273q = d.n(obtainStyledAttributes, index, this.f11273q);
                            break;
                        case 32:
                            this.f11274r = d.n(obtainStyledAttributes, index, this.f11274r);
                            break;
                        case 33:
                            this.f11226F = obtainStyledAttributes.getDimensionPixelSize(index, this.f11226F);
                            break;
                        case 34:
                            this.f11269m = d.n(obtainStyledAttributes, index, this.f11269m);
                            break;
                        case C3139z9.f40333J /* 35 */:
                            this.f11268l = d.n(obtainStyledAttributes, index, this.f11268l);
                            break;
                        case 36:
                            this.f11278v = obtainStyledAttributes.getFloat(index, this.f11278v);
                            break;
                        case 37:
                            this.f11237Q = obtainStyledAttributes.getFloat(index, this.f11237Q);
                            break;
                        case C3139z9.f40334K /* 38 */:
                            this.f11236P = obtainStyledAttributes.getFloat(index, this.f11236P);
                            break;
                        case 39:
                            this.f11238R = obtainStyledAttributes.getInt(index, this.f11238R);
                            break;
                        case 40:
                            this.f11239S = obtainStyledAttributes.getInt(index, this.f11239S);
                            break;
                        default:
                            switch (i5) {
                                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                                    this.f11240T = obtainStyledAttributes.getInt(index, this.f11240T);
                                    break;
                                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                                    this.f11241U = obtainStyledAttributes.getInt(index, this.f11241U);
                                    break;
                                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                                    this.f11242V = obtainStyledAttributes.getDimensionPixelSize(index, this.f11242V);
                                    break;
                                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                                    this.f11243W = obtainStyledAttributes.getDimensionPixelSize(index, this.f11243W);
                                    break;
                                case 58:
                                    this.f11244X = obtainStyledAttributes.getDimensionPixelSize(index, this.f11244X);
                                    break;
                                case 59:
                                    this.f11245Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f11245Y);
                                    break;
                                default:
                                    switch (i5) {
                                        case 61:
                                            this.f11280x = d.n(obtainStyledAttributes, index, this.f11280x);
                                            break;
                                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                            this.f11281y = obtainStyledAttributes.getDimensionPixelSize(index, this.f11281y);
                                            break;
                                        case 63:
                                            this.f11282z = obtainStyledAttributes.getFloat(index, this.f11282z);
                                            break;
                                        default:
                                            switch (i5) {
                                                case 69:
                                                    this.f11246Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                                                    this.f11248a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                                                    this.f11250b0 = obtainStyledAttributes.getInt(index, this.f11250b0);
                                                    break;
                                                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
                                                    this.f11252c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f11252c0);
                                                    break;
                                                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                                                    this.f11258f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f11266j0 = obtainStyledAttributes.getBoolean(index, this.f11266j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11220k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f11260g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f11220k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f11264i0 = obtainStyledAttributes.getBoolean(index, this.f11264i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f11283h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f11284a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f11285b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f11286c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f11287d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f11288e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f11289f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f11290g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11283h = sparseIntArray;
            sparseIntArray.append(g.W3, 1);
            f11283h.append(g.Y3, 2);
            f11283h.append(g.Z3, 3);
            f11283h.append(g.V3, 4);
            f11283h.append(g.U3, 5);
            f11283h.append(g.X3, 6);
        }

        public void a(c cVar) {
            this.f11284a = cVar.f11284a;
            this.f11285b = cVar.f11285b;
            this.f11286c = cVar.f11286c;
            this.f11287d = cVar.f11287d;
            this.f11288e = cVar.f11288e;
            this.f11290g = cVar.f11290g;
            this.f11289f = cVar.f11289f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.T3);
            this.f11284a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f11283h.get(index)) {
                    case 1:
                        this.f11290g = obtainStyledAttributes.getFloat(index, this.f11290g);
                        break;
                    case 2:
                        this.f11287d = obtainStyledAttributes.getInt(index, this.f11287d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f11286c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f11286c = C3378a.f43379c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f11288e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f11285b = d.n(obtainStyledAttributes, index, this.f11285b);
                        break;
                    case 6:
                        this.f11289f = obtainStyledAttributes.getFloat(index, this.f11289f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0087d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11291a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f11292b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f11293c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f11294d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f11295e = Float.NaN;

        public void a(C0087d c0087d) {
            this.f11291a = c0087d.f11291a;
            this.f11292b = c0087d.f11292b;
            this.f11294d = c0087d.f11294d;
            this.f11295e = c0087d.f11295e;
            this.f11293c = c0087d.f11293c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.i4);
            this.f11291a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.k4) {
                    this.f11294d = obtainStyledAttributes.getFloat(index, this.f11294d);
                } else if (index == g.j4) {
                    this.f11292b = obtainStyledAttributes.getInt(index, this.f11292b);
                    this.f11292b = d.f11209d[this.f11292b];
                } else if (index == g.m4) {
                    this.f11293c = obtainStyledAttributes.getInt(index, this.f11293c);
                } else if (index == g.l4) {
                    this.f11295e = obtainStyledAttributes.getFloat(index, this.f11295e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f11296n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f11297a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f11298b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f11299c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f11300d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f11301e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f11302f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f11303g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f11304h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f11305i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f11306j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f11307k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f11308l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f11309m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f11296n = sparseIntArray;
            sparseIntArray.append(g.G4, 1);
            f11296n.append(g.H4, 2);
            f11296n.append(g.I4, 3);
            f11296n.append(g.E4, 4);
            f11296n.append(g.F4, 5);
            f11296n.append(g.A4, 6);
            f11296n.append(g.B4, 7);
            f11296n.append(g.C4, 8);
            f11296n.append(g.D4, 9);
            f11296n.append(g.J4, 10);
            f11296n.append(g.K4, 11);
        }

        public void a(e eVar) {
            this.f11297a = eVar.f11297a;
            this.f11298b = eVar.f11298b;
            this.f11299c = eVar.f11299c;
            this.f11300d = eVar.f11300d;
            this.f11301e = eVar.f11301e;
            this.f11302f = eVar.f11302f;
            this.f11303g = eVar.f11303g;
            this.f11304h = eVar.f11304h;
            this.f11305i = eVar.f11305i;
            this.f11306j = eVar.f11306j;
            this.f11307k = eVar.f11307k;
            this.f11308l = eVar.f11308l;
            this.f11309m = eVar.f11309m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.z4);
            this.f11297a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f11296n.get(index)) {
                    case 1:
                        this.f11298b = obtainStyledAttributes.getFloat(index, this.f11298b);
                        break;
                    case 2:
                        this.f11299c = obtainStyledAttributes.getFloat(index, this.f11299c);
                        break;
                    case 3:
                        this.f11300d = obtainStyledAttributes.getFloat(index, this.f11300d);
                        break;
                    case 4:
                        this.f11301e = obtainStyledAttributes.getFloat(index, this.f11301e);
                        break;
                    case 5:
                        this.f11302f = obtainStyledAttributes.getFloat(index, this.f11302f);
                        break;
                    case 6:
                        this.f11303g = obtainStyledAttributes.getDimension(index, this.f11303g);
                        break;
                    case 7:
                        this.f11304h = obtainStyledAttributes.getDimension(index, this.f11304h);
                        break;
                    case 8:
                        this.f11305i = obtainStyledAttributes.getDimension(index, this.f11305i);
                        break;
                    case 9:
                        this.f11306j = obtainStyledAttributes.getDimension(index, this.f11306j);
                        break;
                    case 10:
                        this.f11307k = obtainStyledAttributes.getDimension(index, this.f11307k);
                        break;
                    case 11:
                        this.f11308l = true;
                        this.f11309m = obtainStyledAttributes.getDimension(index, this.f11309m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11210e = sparseIntArray;
        sparseIntArray.append(g.f11521u0, 25);
        f11210e.append(g.f11526v0, 26);
        f11210e.append(g.f11536x0, 29);
        f11210e.append(g.f11541y0, 30);
        f11210e.append(g.f11331E0, 36);
        f11210e.append(g.f11326D0, 35);
        f11210e.append(g.f11431c0, 4);
        f11210e.append(g.f11426b0, 3);
        f11210e.append(g.f11416Z, 1);
        f11210e.append(g.f11365M0, 6);
        f11210e.append(g.f11369N0, 7);
        f11210e.append(g.f11466j0, 17);
        f11210e.append(g.f11471k0, 18);
        f11210e.append(g.f11476l0, 19);
        f11210e.append(g.f11510s, 27);
        f11210e.append(g.f11546z0, 32);
        f11210e.append(g.f11311A0, 33);
        f11210e.append(g.f11461i0, 10);
        f11210e.append(g.f11456h0, 9);
        f11210e.append(g.f11381Q0, 13);
        f11210e.append(g.f11393T0, 16);
        f11210e.append(g.f11385R0, 14);
        f11210e.append(g.f11373O0, 11);
        f11210e.append(g.f11389S0, 15);
        f11210e.append(g.f11377P0, 12);
        f11210e.append(g.f11345H0, 40);
        f11210e.append(g.f11511s0, 39);
        f11210e.append(g.f11506r0, 41);
        f11210e.append(g.f11341G0, 42);
        f11210e.append(g.f11501q0, 20);
        f11210e.append(g.f11336F0, 37);
        f11210e.append(g.f11451g0, 5);
        f11210e.append(g.f11516t0, 82);
        f11210e.append(g.f11321C0, 82);
        f11210e.append(g.f11531w0, 82);
        f11210e.append(g.f11421a0, 82);
        f11210e.append(g.f11412Y, 82);
        f11210e.append(g.f11535x, 24);
        f11210e.append(g.f11545z, 28);
        f11210e.append(g.f11360L, 31);
        f11210e.append(g.f11364M, 8);
        f11210e.append(g.f11540y, 34);
        f11210e.append(g.f11310A, 2);
        f11210e.append(g.f11525v, 23);
        f11210e.append(g.f11530w, 21);
        f11210e.append(g.f11520u, 22);
        f11210e.append(g.f11315B, 43);
        f11210e.append(g.f11372O, 44);
        f11210e.append(g.f11352J, 45);
        f11210e.append(g.f11356K, 46);
        f11210e.append(g.f11348I, 60);
        f11210e.append(g.f11340G, 47);
        f11210e.append(g.f11344H, 48);
        f11210e.append(g.f11320C, 49);
        f11210e.append(g.f11325D, 50);
        f11210e.append(g.f11330E, 51);
        f11210e.append(g.f11335F, 52);
        f11210e.append(g.f11368N, 53);
        f11210e.append(g.f11349I0, 54);
        f11210e.append(g.f11481m0, 55);
        f11210e.append(g.f11353J0, 56);
        f11210e.append(g.f11486n0, 57);
        f11210e.append(g.f11357K0, 58);
        f11210e.append(g.f11491o0, 59);
        f11210e.append(g.f11436d0, 61);
        f11210e.append(g.f11446f0, 62);
        f11210e.append(g.f11441e0, 63);
        f11210e.append(g.f11376P, 64);
        f11210e.append(g.f11409X0, 65);
        f11210e.append(g.f11400V, 66);
        f11210e.append(g.f11413Y0, 67);
        f11210e.append(g.f11401V0, 79);
        f11210e.append(g.f11515t, 38);
        f11210e.append(g.f11397U0, 68);
        f11210e.append(g.f11361L0, 69);
        f11210e.append(g.f11496p0, 70);
        f11210e.append(g.f11392T, 71);
        f11210e.append(g.f11384R, 72);
        f11210e.append(g.f11388S, 73);
        f11210e.append(g.f11396U, 74);
        f11210e.append(g.f11380Q, 75);
        f11210e.append(g.f11405W0, 76);
        f11210e.append(g.f11316B0, 77);
        f11210e.append(g.f11417Z0, 78);
        f11210e.append(g.f11408X, 80);
        f11210e.append(g.f11404W, 81);
    }

    private int[] i(View view, String str) {
        int i4;
        Object designInformation;
        String[] split = str.split(StringUtils.COMMA);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            try {
                i4 = f.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i4 = ((Integer) designInformation).intValue();
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        return i6 != split.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11505r);
        o(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i4) {
        if (!this.f11213c.containsKey(Integer.valueOf(i4))) {
            this.f11213c.put(Integer.valueOf(i4), new a());
        }
        return (a) this.f11213c.get(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    private void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index != g.f11515t && g.f11360L != index && g.f11364M != index) {
                aVar.f11216c.f11284a = true;
                aVar.f11217d.f11249b = true;
                aVar.f11215b.f11291a = true;
                aVar.f11218e.f11297a = true;
            }
            switch (f11210e.get(index)) {
                case 1:
                    b bVar = aVar.f11217d;
                    bVar.f11272p = n(typedArray, index, bVar.f11272p);
                    break;
                case 2:
                    b bVar2 = aVar.f11217d;
                    bVar2.f11227G = typedArray.getDimensionPixelSize(index, bVar2.f11227G);
                    break;
                case 3:
                    b bVar3 = aVar.f11217d;
                    bVar3.f11271o = n(typedArray, index, bVar3.f11271o);
                    break;
                case 4:
                    b bVar4 = aVar.f11217d;
                    bVar4.f11270n = n(typedArray, index, bVar4.f11270n);
                    break;
                case 5:
                    aVar.f11217d.f11279w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f11217d;
                    bVar5.f11221A = typedArray.getDimensionPixelOffset(index, bVar5.f11221A);
                    break;
                case 7:
                    b bVar6 = aVar.f11217d;
                    bVar6.f11222B = typedArray.getDimensionPixelOffset(index, bVar6.f11222B);
                    break;
                case 8:
                    b bVar7 = aVar.f11217d;
                    bVar7.f11228H = typedArray.getDimensionPixelSize(index, bVar7.f11228H);
                    break;
                case 9:
                    b bVar8 = aVar.f11217d;
                    bVar8.f11276t = n(typedArray, index, bVar8.f11276t);
                    break;
                case 10:
                    b bVar9 = aVar.f11217d;
                    bVar9.f11275s = n(typedArray, index, bVar9.f11275s);
                    break;
                case 11:
                    b bVar10 = aVar.f11217d;
                    bVar10.f11233M = typedArray.getDimensionPixelSize(index, bVar10.f11233M);
                    break;
                case 12:
                    b bVar11 = aVar.f11217d;
                    bVar11.f11234N = typedArray.getDimensionPixelSize(index, bVar11.f11234N);
                    break;
                case 13:
                    b bVar12 = aVar.f11217d;
                    bVar12.f11230J = typedArray.getDimensionPixelSize(index, bVar12.f11230J);
                    break;
                case 14:
                    b bVar13 = aVar.f11217d;
                    bVar13.f11232L = typedArray.getDimensionPixelSize(index, bVar13.f11232L);
                    break;
                case 15:
                    b bVar14 = aVar.f11217d;
                    bVar14.f11235O = typedArray.getDimensionPixelSize(index, bVar14.f11235O);
                    break;
                case 16:
                    b bVar15 = aVar.f11217d;
                    bVar15.f11231K = typedArray.getDimensionPixelSize(index, bVar15.f11231K);
                    break;
                case 17:
                    b bVar16 = aVar.f11217d;
                    bVar16.f11255e = typedArray.getDimensionPixelOffset(index, bVar16.f11255e);
                    break;
                case 18:
                    b bVar17 = aVar.f11217d;
                    bVar17.f11257f = typedArray.getDimensionPixelOffset(index, bVar17.f11257f);
                    break;
                case 19:
                    b bVar18 = aVar.f11217d;
                    bVar18.f11259g = typedArray.getFloat(index, bVar18.f11259g);
                    break;
                case 20:
                    b bVar19 = aVar.f11217d;
                    bVar19.f11277u = typedArray.getFloat(index, bVar19.f11277u);
                    break;
                case 21:
                    b bVar20 = aVar.f11217d;
                    bVar20.f11253d = typedArray.getLayoutDimension(index, bVar20.f11253d);
                    break;
                case 22:
                    C0087d c0087d = aVar.f11215b;
                    c0087d.f11292b = typedArray.getInt(index, c0087d.f11292b);
                    C0087d c0087d2 = aVar.f11215b;
                    c0087d2.f11292b = f11209d[c0087d2.f11292b];
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    b bVar21 = aVar.f11217d;
                    bVar21.f11251c = typedArray.getLayoutDimension(index, bVar21.f11251c);
                    break;
                case 24:
                    b bVar22 = aVar.f11217d;
                    bVar22.f11224D = typedArray.getDimensionPixelSize(index, bVar22.f11224D);
                    break;
                case 25:
                    b bVar23 = aVar.f11217d;
                    bVar23.f11261h = n(typedArray, index, bVar23.f11261h);
                    break;
                case 26:
                    b bVar24 = aVar.f11217d;
                    bVar24.f11263i = n(typedArray, index, bVar24.f11263i);
                    break;
                case 27:
                    b bVar25 = aVar.f11217d;
                    bVar25.f11223C = typedArray.getInt(index, bVar25.f11223C);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    b bVar26 = aVar.f11217d;
                    bVar26.f11225E = typedArray.getDimensionPixelSize(index, bVar26.f11225E);
                    break;
                case 29:
                    b bVar27 = aVar.f11217d;
                    bVar27.f11265j = n(typedArray, index, bVar27.f11265j);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    b bVar28 = aVar.f11217d;
                    bVar28.f11267k = n(typedArray, index, bVar28.f11267k);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    b bVar29 = aVar.f11217d;
                    bVar29.f11229I = typedArray.getDimensionPixelSize(index, bVar29.f11229I);
                    break;
                case 32:
                    b bVar30 = aVar.f11217d;
                    bVar30.f11273q = n(typedArray, index, bVar30.f11273q);
                    break;
                case 33:
                    b bVar31 = aVar.f11217d;
                    bVar31.f11274r = n(typedArray, index, bVar31.f11274r);
                    break;
                case 34:
                    b bVar32 = aVar.f11217d;
                    bVar32.f11226F = typedArray.getDimensionPixelSize(index, bVar32.f11226F);
                    break;
                case C3139z9.f40333J /* 35 */:
                    b bVar33 = aVar.f11217d;
                    bVar33.f11269m = n(typedArray, index, bVar33.f11269m);
                    break;
                case 36:
                    b bVar34 = aVar.f11217d;
                    bVar34.f11268l = n(typedArray, index, bVar34.f11268l);
                    break;
                case 37:
                    b bVar35 = aVar.f11217d;
                    bVar35.f11278v = typedArray.getFloat(index, bVar35.f11278v);
                    break;
                case C3139z9.f40334K /* 38 */:
                    aVar.f11214a = typedArray.getResourceId(index, aVar.f11214a);
                    break;
                case 39:
                    b bVar36 = aVar.f11217d;
                    bVar36.f11237Q = typedArray.getFloat(index, bVar36.f11237Q);
                    break;
                case 40:
                    b bVar37 = aVar.f11217d;
                    bVar37.f11236P = typedArray.getFloat(index, bVar37.f11236P);
                    break;
                case 41:
                    b bVar38 = aVar.f11217d;
                    bVar38.f11238R = typedArray.getInt(index, bVar38.f11238R);
                    break;
                case 42:
                    b bVar39 = aVar.f11217d;
                    bVar39.f11239S = typedArray.getInt(index, bVar39.f11239S);
                    break;
                case 43:
                    C0087d c0087d3 = aVar.f11215b;
                    c0087d3.f11294d = typedArray.getFloat(index, c0087d3.f11294d);
                    break;
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    e eVar = aVar.f11218e;
                    eVar.f11308l = true;
                    eVar.f11309m = typedArray.getDimension(index, eVar.f11309m);
                    break;
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    e eVar2 = aVar.f11218e;
                    eVar2.f11299c = typedArray.getFloat(index, eVar2.f11299c);
                    break;
                case 46:
                    e eVar3 = aVar.f11218e;
                    eVar3.f11300d = typedArray.getFloat(index, eVar3.f11300d);
                    break;
                case 47:
                    e eVar4 = aVar.f11218e;
                    eVar4.f11301e = typedArray.getFloat(index, eVar4.f11301e);
                    break;
                case 48:
                    e eVar5 = aVar.f11218e;
                    eVar5.f11302f = typedArray.getFloat(index, eVar5.f11302f);
                    break;
                case 49:
                    e eVar6 = aVar.f11218e;
                    eVar6.f11303g = typedArray.getDimension(index, eVar6.f11303g);
                    break;
                case 50:
                    e eVar7 = aVar.f11218e;
                    eVar7.f11304h = typedArray.getDimension(index, eVar7.f11304h);
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    e eVar8 = aVar.f11218e;
                    eVar8.f11305i = typedArray.getDimension(index, eVar8.f11305i);
                    break;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    e eVar9 = aVar.f11218e;
                    eVar9.f11306j = typedArray.getDimension(index, eVar9.f11306j);
                    break;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    e eVar10 = aVar.f11218e;
                    eVar10.f11307k = typedArray.getDimension(index, eVar10.f11307k);
                    break;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    b bVar40 = aVar.f11217d;
                    bVar40.f11240T = typedArray.getInt(index, bVar40.f11240T);
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    b bVar41 = aVar.f11217d;
                    bVar41.f11241U = typedArray.getInt(index, bVar41.f11241U);
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    b bVar42 = aVar.f11217d;
                    bVar42.f11242V = typedArray.getDimensionPixelSize(index, bVar42.f11242V);
                    break;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    b bVar43 = aVar.f11217d;
                    bVar43.f11243W = typedArray.getDimensionPixelSize(index, bVar43.f11243W);
                    break;
                case 58:
                    b bVar44 = aVar.f11217d;
                    bVar44.f11244X = typedArray.getDimensionPixelSize(index, bVar44.f11244X);
                    break;
                case 59:
                    b bVar45 = aVar.f11217d;
                    bVar45.f11245Y = typedArray.getDimensionPixelSize(index, bVar45.f11245Y);
                    break;
                case 60:
                    e eVar11 = aVar.f11218e;
                    eVar11.f11298b = typedArray.getFloat(index, eVar11.f11298b);
                    break;
                case 61:
                    b bVar46 = aVar.f11217d;
                    bVar46.f11280x = n(typedArray, index, bVar46.f11280x);
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    b bVar47 = aVar.f11217d;
                    bVar47.f11281y = typedArray.getDimensionPixelSize(index, bVar47.f11281y);
                    break;
                case 63:
                    b bVar48 = aVar.f11217d;
                    bVar48.f11282z = typedArray.getFloat(index, bVar48.f11282z);
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    c cVar = aVar.f11216c;
                    cVar.f11285b = n(typedArray, index, cVar.f11285b);
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f11216c.f11286c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f11216c.f11286c = C3378a.f43379c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f11216c.f11288e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f11216c;
                    cVar2.f11290g = typedArray.getFloat(index, cVar2.f11290g);
                    break;
                case 68:
                    C0087d c0087d4 = aVar.f11215b;
                    c0087d4.f11295e = typedArray.getFloat(index, c0087d4.f11295e);
                    break;
                case 69:
                    aVar.f11217d.f11246Z = typedArray.getFloat(index, 1.0f);
                    break;
                case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                    aVar.f11217d.f11248a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                    b bVar49 = aVar.f11217d;
                    bVar49.f11250b0 = typedArray.getInt(index, bVar49.f11250b0);
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
                    b bVar50 = aVar.f11217d;
                    bVar50.f11252c0 = typedArray.getDimensionPixelSize(index, bVar50.f11252c0);
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    aVar.f11217d.f11258f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f11217d;
                    bVar51.f11266j0 = typedArray.getBoolean(index, bVar51.f11266j0);
                    break;
                case 76:
                    c cVar3 = aVar.f11216c;
                    cVar3.f11287d = typedArray.getInt(index, cVar3.f11287d);
                    break;
                case 77:
                    aVar.f11217d.f11260g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0087d c0087d5 = aVar.f11215b;
                    c0087d5.f11293c = typedArray.getInt(index, c0087d5.f11293c);
                    break;
                case 79:
                    c cVar4 = aVar.f11216c;
                    cVar4.f11289f = typedArray.getFloat(index, cVar4.f11289f);
                    break;
                case 80:
                    b bVar52 = aVar.f11217d;
                    bVar52.f11262h0 = typedArray.getBoolean(index, bVar52.f11262h0);
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT /* 81 */:
                    b bVar53 = aVar.f11217d;
                    bVar53.f11264i0 = typedArray.getBoolean(index, bVar53.f11264i0);
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f11210e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f11210e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z4) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f11213c.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f11213c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC3384a.a(childAt));
            } else {
                if (this.f11212b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f11213c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f11213c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f11217d.f11254d0 = 1;
                        }
                        int i5 = aVar.f11217d.f11254d0;
                        if (i5 != -1 && i5 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f11217d.f11250b0);
                            barrier.setMargin(aVar.f11217d.f11252c0);
                            barrier.setAllowsGoneWidget(aVar.f11217d.f11266j0);
                            b bVar = aVar.f11217d;
                            int[] iArr = bVar.f11256e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f11258f0;
                                if (str != null) {
                                    bVar.f11256e0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f11217d.f11256e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z4) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f11219f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0087d c0087d = aVar.f11215b;
                        if (c0087d.f11293c == 0) {
                            childAt.setVisibility(c0087d.f11292b);
                        }
                        childAt.setAlpha(aVar.f11215b.f11294d);
                        childAt.setRotation(aVar.f11218e.f11298b);
                        childAt.setRotationX(aVar.f11218e.f11299c);
                        childAt.setRotationY(aVar.f11218e.f11300d);
                        childAt.setScaleX(aVar.f11218e.f11301e);
                        childAt.setScaleY(aVar.f11218e.f11302f);
                        if (!Float.isNaN(aVar.f11218e.f11303g)) {
                            childAt.setPivotX(aVar.f11218e.f11303g);
                        }
                        if (!Float.isNaN(aVar.f11218e.f11304h)) {
                            childAt.setPivotY(aVar.f11218e.f11304h);
                        }
                        childAt.setTranslationX(aVar.f11218e.f11305i);
                        childAt.setTranslationY(aVar.f11218e.f11306j);
                        childAt.setTranslationZ(aVar.f11218e.f11307k);
                        e eVar = aVar.f11218e;
                        if (eVar.f11308l) {
                            childAt.setElevation(eVar.f11309m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f11213c.get(num);
            int i6 = aVar2.f11217d.f11254d0;
            if (i6 != -1 && i6 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f11217d;
                int[] iArr2 = bVar3.f11256e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f11258f0;
                    if (str2 != null) {
                        bVar3.f11256e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f11217d.f11256e0);
                    }
                }
                barrier2.setType(aVar2.f11217d.f11250b0);
                barrier2.setMargin(aVar2.f11217d.f11252c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar2.b(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f11217d.f11247a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(int i4, int i5) {
        if (this.f11213c.containsKey(Integer.valueOf(i4))) {
            a aVar = (a) this.f11213c.get(Integer.valueOf(i4));
            switch (i5) {
                case 1:
                    b bVar = aVar.f11217d;
                    bVar.f11263i = -1;
                    bVar.f11261h = -1;
                    bVar.f11224D = -1;
                    bVar.f11230J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f11217d;
                    bVar2.f11267k = -1;
                    bVar2.f11265j = -1;
                    bVar2.f11225E = -1;
                    bVar2.f11232L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f11217d;
                    bVar3.f11269m = -1;
                    bVar3.f11268l = -1;
                    bVar3.f11226F = -1;
                    bVar3.f11231K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f11217d;
                    bVar4.f11270n = -1;
                    bVar4.f11271o = -1;
                    bVar4.f11227G = -1;
                    bVar4.f11233M = -1;
                    return;
                case 5:
                    aVar.f11217d.f11272p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f11217d;
                    bVar5.f11273q = -1;
                    bVar5.f11274r = -1;
                    bVar5.f11229I = -1;
                    bVar5.f11235O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f11217d;
                    bVar6.f11275s = -1;
                    bVar6.f11276t = -1;
                    bVar6.f11228H = -1;
                    bVar6.f11234N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i4) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f11213c.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f11212b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f11213c.containsKey(Integer.valueOf(id))) {
                this.f11213c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f11213c.get(Integer.valueOf(id));
            aVar.f11219f = androidx.constraintlayout.widget.a.a(this.f11211a, childAt);
            aVar.d(id, bVar);
            aVar.f11215b.f11292b = childAt.getVisibility();
            aVar.f11215b.f11294d = childAt.getAlpha();
            aVar.f11218e.f11298b = childAt.getRotation();
            aVar.f11218e.f11299c = childAt.getRotationX();
            aVar.f11218e.f11300d = childAt.getRotationY();
            aVar.f11218e.f11301e = childAt.getScaleX();
            aVar.f11218e.f11302f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f11218e;
                eVar.f11303g = pivotX;
                eVar.f11304h = pivotY;
            }
            aVar.f11218e.f11305i = childAt.getTranslationX();
            aVar.f11218e.f11306j = childAt.getTranslationY();
            aVar.f11218e.f11307k = childAt.getTranslationZ();
            e eVar2 = aVar.f11218e;
            if (eVar2.f11308l) {
                eVar2.f11309m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f11217d.f11266j0 = barrier.l();
                aVar.f11217d.f11256e0 = barrier.getReferencedIds();
                aVar.f11217d.f11250b0 = barrier.getType();
                aVar.f11217d.f11252c0 = barrier.getMargin();
            }
        }
    }

    public void h(int i4, int i5, int i6, float f4) {
        b bVar = k(i4).f11217d;
        bVar.f11280x = i5;
        bVar.f11281y = i6;
        bVar.f11282z = f4;
    }

    public void l(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a j4 = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        j4.f11217d.f11247a = true;
                    }
                    this.f11213c.put(Integer.valueOf(j4.f11214a), j4);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c4 = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c4 = 6;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c4 = 7;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                                aVar = j(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 1:
                                aVar = j(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = aVar.f11217d;
                                bVar.f11247a = true;
                                bVar.f11249b = true;
                                break;
                            case 2:
                                aVar = j(context, Xml.asAttributeSet(xmlPullParser));
                                aVar.f11217d.f11254d0 = 1;
                                break;
                            case 3:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f11215b.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 4:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f11218e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 5:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f11217d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 6:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f11216c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 7:
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.a.b(context, xmlPullParser, aVar.f11219f);
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            this.f11213c.put(Integer.valueOf(aVar.f11214a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
