package com.baidu.platform.comapi.map;

import android.text.TextUtils;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected a0 f9721a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9722b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9723c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9724d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9725e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9727g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9728h;

    /* renamed from: i, reason: collision with root package name */
    public String f9729i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9730j;

    /* renamed from: o, reason: collision with root package name */
    protected double[] f9735o;

    /* renamed from: p, reason: collision with root package name */
    protected double[] f9736p;

    /* renamed from: q, reason: collision with root package name */
    protected int[] f9737q;

    /* renamed from: u, reason: collision with root package name */
    protected JsonBuilder f9741u;

    /* renamed from: k, reason: collision with root package name */
    public float f9731k = 5.0f;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9732l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f9733m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f9734n = 0;

    /* renamed from: r, reason: collision with root package name */
    protected GeoPoint f9738r = new GeoPoint(0, 0);

    /* renamed from: s, reason: collision with root package name */
    protected GeoPoint f9739s = new GeoPoint(0, 0);

    /* renamed from: t, reason: collision with root package name */
    protected boolean f9740t = true;

    /* renamed from: v, reason: collision with root package name */
    protected int f9742v = -1;

    /* renamed from: w, reason: collision with root package name */
    protected int f9743w = 0;

    public g(a0 a0Var) {
        this.f9721a = a0Var;
    }

    public abstract String a();

    public void a(boolean z7, int i8, int i9) {
        this.f9732l = z7;
        this.f9733m = i8;
        this.f9734n = i9;
    }

    protected String a(int i8) {
        JsonBuilder jsonBuilder = new JsonBuilder();
        this.f9741u = jsonBuilder;
        jsonBuilder.object();
        int i9 = 0;
        if (i8 == 0) {
            this.f9741u.key("path").arrayValue();
            if (this.f9735o != null) {
                int i10 = 0;
                while (true) {
                    double[] dArr = this.f9735o;
                    if (i10 >= dArr.length) {
                        break;
                    }
                    this.f9741u.value(dArr[i10]);
                    i10++;
                }
            }
            this.f9741u.endArrayValue();
            this.f9741u.key("arrColor").arrayValue();
            if (this.f9737q != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr = this.f9737q;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    this.f9741u.value(iArr[i11]);
                    i11++;
                }
            }
            this.f9741u.endArrayValue();
            this.f9741u.key("useColorArray").value(this.f9727g);
        } else if (i8 == 1) {
            this.f9741u.key("sgeo");
            this.f9741u.object();
            this.f9741u.key("bound").arrayValue();
            GeoPoint geoPoint = this.f9738r;
            if (geoPoint != null && this.f9739s != null) {
                this.f9741u.value(geoPoint.getLongitude());
                this.f9741u.value(this.f9738r.getLatitude());
                this.f9741u.value(this.f9739s.getLongitude());
                this.f9741u.value(this.f9739s.getLatitude());
            }
            this.f9741u.endArrayValue();
            if (this.f9743w == 4) {
                this.f9741u.key("type").value(3);
            } else {
                this.f9741u.key("type").value(this.f9743w);
            }
            this.f9741u.key("elements").arrayValue();
            this.f9741u.object();
            this.f9741u.key("points").arrayValue();
            if (this.f9735o != null) {
                int i12 = 0;
                while (true) {
                    double[] dArr2 = this.f9735o;
                    if (i12 >= dArr2.length) {
                        break;
                    }
                    this.f9741u.value(dArr2[i12]);
                    i12++;
                }
            }
            this.f9741u.endArrayValue();
            this.f9741u.endObject();
            this.f9741u.endArrayValue();
            this.f9741u.endObject();
        }
        this.f9741u.key("ud").value(String.valueOf(hashCode()));
        this.f9741u.key(MapBundleKey.MapObjKey.OBJ_DIR).value(0);
        a0 a0Var = this.f9721a;
        if (a0Var == null || a0Var.c() == 0) {
            int i13 = this.f9743w;
            if (i13 == 3) {
                this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TYPE).value(FeatureCodes.TRACK_3D);
            } else if (i13 == 4) {
                this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TYPE).value(3200);
            } else {
                this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TYPE).value(-1);
            }
        } else {
            this.f9741u.key(MapBundleKey.MapObjKey.OBJ_NORMALSTYTLE).value(this.f9721a.c());
            this.f9741u.key(MapBundleKey.MapObjKey.OBJ_FOCUSSTYTLE).value(this.f9721a.c());
            this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TYPE).value(32);
        }
        this.f9741u.key(MapBundleKey.MapObjKey.OBJ_OFFSET).value(0);
        this.f9741u.key("in").value(0);
        this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TEXT).value("");
        this.f9741u.key(MapBundleKey.MapObjKey.OBJ_DIS).value(0);
        this.f9741u.key("align").value(0);
        if (this.f9722b) {
            this.f9741u.key("dash").value(1);
            this.f9741u.key(MapBundleKey.MapObjKey.OBJ_TYPE).value(this.f9743w);
        }
        if (this.f9723c) {
            this.f9741u.key("trackMove").object();
            this.f9741u.key("pointStyle").value(((b0) this.f9721a).e());
            this.f9741u.endObject();
        }
        if (this.f9725e) {
            this.f9741u.key("cancelDataReduction").value(1);
        } else {
            this.f9741u.key("cancelDataReduction").value(0);
        }
        if (this.f9726f) {
            this.f9741u.key("cancelSmooth").value(1);
        } else {
            this.f9741u.key("cancelSmooth").value(0);
        }
        if (this.f9730j) {
            this.f9741u.key("isTrackBloom").value(1);
            this.f9741u.key("bloomSpeed").value(this.f9731k);
        } else {
            this.f9741u.key("isTrackBloom").value(0);
        }
        if (this.f9724d) {
            this.f9741u.key("pointMove").object();
            if (this.f9728h) {
                this.f9741u.key("use3dPoint").value(1);
            } else {
                this.f9741u.key("use3dPoint").value(0);
            }
            if (this.f9732l) {
                this.f9741u.key("duration").value(this.f9733m);
                this.f9741u.key("easingCurve").value(this.f9734n);
                this.f9732l = false;
            } else {
                this.f9741u.key("duration").value(0);
                this.f9741u.key("easingCurve").value(0);
            }
            this.f9741u.key("pointArray").arrayValue();
            if (this.f9736p != null) {
                while (true) {
                    double[] dArr3 = this.f9736p;
                    if (i9 >= dArr3.length) {
                        break;
                    }
                    this.f9741u.value(dArr3[i9]);
                    i9++;
                }
            }
            this.f9741u.endArrayValue();
            if (!TextUtils.isEmpty(this.f9729i)) {
                this.f9741u.key("imagePath").value(this.f9729i);
            }
            this.f9741u.endObject();
        }
        this.f9741u.key(TtmlNode.TAG_STYLE).object();
        if (this.f9721a != null) {
            this.f9741u.key(com.arthenica.ffmpegkit.x.KEY_WIDTH).value(this.f9721a.d());
            this.f9741u.key("color").value(a0.c(this.f9721a.a()));
            int i14 = this.f9743w;
            if (i14 == 3 || i14 == 4) {
                this.f9741u.key("scolor").value(a0.c(this.f9721a.b()));
            }
        }
        this.f9741u.endObject();
        this.f9741u.endObject();
        return this.f9741u.toString();
    }
}
