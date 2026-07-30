package com.baidu.platform.comapi.map;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class OverlayItem {
    public static final int ALIGN_BOTTON = 2;
    public static final int ALIGN_TOP = 3;
    public static final int ALING_CENTER = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f9551b;

    /* renamed from: c, reason: collision with root package name */
    private int f9552c;

    /* renamed from: d, reason: collision with root package name */
    protected GeoPoint f9553d;

    /* renamed from: e, reason: collision with root package name */
    protected String f9554e;

    /* renamed from: f, reason: collision with root package name */
    protected String f9555f;

    /* renamed from: m, reason: collision with root package name */
    private Bundle f9562m;

    /* renamed from: n, reason: collision with root package name */
    private Bundle f9563n;

    /* renamed from: o, reason: collision with root package name */
    private float f9564o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f9565p;

    /* renamed from: q, reason: collision with root package name */
    private float f9566q;

    /* renamed from: s, reason: collision with root package name */
    private int f9568s;

    /* renamed from: i, reason: collision with root package name */
    private CoordType f9558i = CoordType.CoordType_BD09;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f9556g = null;

    /* renamed from: r, reason: collision with root package name */
    private int f9567r = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f9550a = 2;

    /* renamed from: h, reason: collision with root package name */
    private String f9557h = "";

    /* renamed from: j, reason: collision with root package name */
    private float f9559j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    private float f9560k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<Bundle> f9561l = new ArrayList<>();

    public enum AnimEffect {
        NONE,
        GROWTH,
        WAVE,
        SHRINK,
        FADE_OUT,
        FADE_IN,
        GROWTH_FADE_IN,
        SHRINK_FADE_OUT,
        GROWTH_REBOUND,
        ALPHA,
        ANCHOR_GROUTH,
        ROTATE
    }

    public enum AnimationSubType {
        NONE,
        RADAR
    }

    public enum CoordType {
        CoordType_BD09LL,
        CoordType_BD09
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9569a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9570b;

        static {
            int[] iArr = new int[AnimationSubType.values().length];
            f9570b = iArr;
            try {
                iArr[AnimationSubType.RADAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9570b[AnimationSubType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AnimEffect.values().length];
            f9569a = iArr2;
            try {
                iArr2[AnimEffect.GROWTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9569a[AnimEffect.WAVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9569a[AnimEffect.SHRINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9569a[AnimEffect.FADE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9569a[AnimEffect.FADE_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9569a[AnimEffect.GROWTH_FADE_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9569a[AnimEffect.SHRINK_FADE_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9569a[AnimEffect.GROWTH_REBOUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9569a[AnimEffect.ALPHA.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9569a[AnimEffect.ANCHOR_GROUTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9569a[AnimEffect.ROTATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9569a[AnimEffect.NONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public OverlayItem(GeoPoint geoPoint, String str, String str2) {
        this.f9553d = geoPoint;
        this.f9554e = str;
        this.f9555f = str2;
    }

    public void addClickRect(Bundle bundle) {
        if (this.f9561l == null) {
            this.f9561l = new ArrayList<>();
        }
        this.f9561l.add(bundle);
    }

    public float getAnchorX() {
        return this.f9559j;
    }

    public float getAnchorY() {
        return this.f9560k;
    }

    public Bundle getAnimate() {
        return this.f9562m;
    }

    public int getBound() {
        return this.f9550a;
    }

    public ArrayList<Bundle> getClickRect() {
        return this.f9561l;
    }

    public CoordType getCoordType() {
        return this.f9558i;
    }

    public Bundle getDelay() {
        return this.f9563n;
    }

    public float getGeoZ() {
        return this.f9564o;
    }

    public byte[] getGifData() {
        return this.f9565p;
    }

    public String getId() {
        return this.f9557h;
    }

    public int getIndoorPoi() {
        return this.f9568s;
    }

    public int getLevel() {
        return this.f9551b;
    }

    public final Drawable getMarker() {
        return this.f9556g;
    }

    public int getMask() {
        return this.f9552c;
    }

    public float getMultiplyDpi() {
        return this.f9567r;
    }

    public GeoPoint getPoint() {
        return this.f9553d;
    }

    public int getResId() {
        if (getMarker() == null) {
            return -1;
        }
        return getMarker().hashCode();
    }

    public float getScale() {
        return this.f9566q;
    }

    public String getSnippet() {
        return this.f9555f;
    }

    public String getTitle() {
        return this.f9554e;
    }

    public void setAnchor(float f8, float f9) {
        this.f9559j = f8;
        this.f9560k = f9;
    }

    public void setAnimate(Bundle bundle) {
        this.f9562m = bundle;
    }

    public void setAnimateDuration(int i8) {
        if (this.f9562m == null) {
            this.f9562m = new Bundle();
        }
        this.f9562m.putInt("dur", i8);
    }

    public void setAnimateEffect(AnimEffect animEffect) {
        if (this.f9562m == null) {
            this.f9562m = new Bundle();
        }
        switch (a.f9569a[animEffect.ordinal()]) {
            case 1:
                this.f9562m.putInt("type", 1);
                break;
            case 2:
                this.f9562m.putInt("type", 2);
                break;
            case 3:
                this.f9562m.putInt("type", 3);
                break;
            case 4:
                this.f9562m.putInt("type", 4);
                break;
            case 5:
                this.f9562m.putInt("type", 5);
                break;
            case 6:
                this.f9562m.putInt("type", 6);
                break;
            case 7:
                this.f9562m.putInt("type", 7);
                break;
            case 8:
                this.f9562m.putInt("type", 8);
                break;
            case 9:
                this.f9562m.putInt("type", 9);
                break;
            case 10:
                this.f9562m.putInt("type", 10);
                break;
            case 11:
                this.f9562m.putInt("type", 11);
                break;
            default:
                this.f9562m.putInt("type", 0);
                break;
        }
    }

    public void setAnimateEndSize(int i8, int i9) {
        if (this.f9562m == null) {
            this.f9562m = new Bundle();
        }
        this.f9562m.putInt("en_w", i8);
        this.f9562m.putInt("en_h", i9);
    }

    public void setAnimateStartSize(int i8, int i9) {
        if (this.f9562m == null) {
            this.f9562m = new Bundle();
        }
        this.f9562m.putInt("st_w", i8);
        this.f9562m.putInt("st_h", i9);
    }

    public void setBound(int i8) {
        this.f9550a = i8;
    }

    public void setClickRect(ArrayList<Bundle> arrayList) {
        this.f9561l = arrayList;
    }

    public void setCoordType(CoordType coordType) {
        this.f9558i = coordType;
    }

    public void setDelay(Bundle bundle) {
        this.f9563n = bundle;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.f9553d = geoPoint;
    }

    public void setGeoZ(float f8) {
        this.f9564o = f8;
    }

    public void setGifData(byte[] bArr) {
        this.f9565p = bArr;
    }

    public void setId(String str) {
        this.f9557h = str;
    }

    public void setIndoorPoi(int i8) {
        this.f9568s = i8;
    }

    public void setLevel(int i8) {
        this.f9551b = i8;
    }

    public void setMarker(Drawable drawable) {
        this.f9556g = drawable;
    }

    public void setMask(int i8) {
        this.f9552c = i8;
    }

    public void setMultiplyDpi(int i8) {
        this.f9567r = i8;
    }

    public void setScale(float f8) {
        this.f9566q = f8;
    }

    public void setSnippet(String str) {
        this.f9555f = str;
    }

    public void setSubAnimateEffect(AnimationSubType animationSubType) {
        if (this.f9562m == null) {
            this.f9562m = new Bundle();
        }
        if (a.f9570b[animationSubType.ordinal()] != 1) {
            this.f9562m.putInt("sub_type", 0);
        } else {
            this.f9562m.putInt("sub_type", 1);
        }
    }

    public void setTitle(String str) {
        this.f9554e = str;
    }

    public void setAnchor(int i8) {
        if (i8 == 1) {
            setAnchor(0.5f, 0.5f);
        } else if (i8 == 2) {
            setAnchor(0.5f, 1.0f);
        } else {
            if (i8 != 3) {
                return;
            }
            setAnchor(0.5f, 0.0f);
        }
    }
}
