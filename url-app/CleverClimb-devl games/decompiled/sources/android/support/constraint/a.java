package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1385a = {0, 4, 8};

    /* renamed from: c, reason: collision with root package name */
    private static SparseIntArray f1386c = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<Integer, C0002a> f1387b = new HashMap<>();

    static {
        f1386c.append(R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1386c.append(R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
        f1386c.append(R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        f1386c.append(R.styleable.ConstraintSet_android_orientation, 27);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginTop, 16);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginRight, 14);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginStart, 15);
        f1386c.append(R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintLeft_creator, 60);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintTop_creator, 60);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintRight_creator, 60);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintBottom_creator, 60);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintBaseline_creator, 60);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginLeft, 24);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginRight, 28);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginStart, 31);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginEnd, 8);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginTop, 34);
        f1386c.append(R.styleable.ConstraintSet_android_layout_marginBottom, 2);
        f1386c.append(R.styleable.ConstraintSet_android_layout_width, 23);
        f1386c.append(R.styleable.ConstraintSet_android_layout_height, 21);
        f1386c.append(R.styleable.ConstraintSet_android_visibility, 22);
        f1386c.append(R.styleable.ConstraintSet_android_alpha, 43);
        f1386c.append(R.styleable.ConstraintSet_android_elevation, 44);
        f1386c.append(R.styleable.ConstraintSet_android_rotationX, 45);
        f1386c.append(R.styleable.ConstraintSet_android_rotationY, 46);
        f1386c.append(R.styleable.ConstraintSet_android_scaleX, 47);
        f1386c.append(R.styleable.ConstraintSet_android_scaleY, 48);
        f1386c.append(R.styleable.ConstraintSet_android_transformPivotX, 49);
        f1386c.append(R.styleable.ConstraintSet_android_transformPivotY, 50);
        f1386c.append(R.styleable.ConstraintSet_android_translationX, 51);
        f1386c.append(R.styleable.ConstraintSet_android_translationY, 52);
        f1386c.append(R.styleable.ConstraintSet_android_translationZ, 53);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
        f1386c.append(R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
        f1386c.append(R.styleable.ConstraintSet_android_id, 38);
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: android.support.constraint.a$a, reason: collision with other inner class name */
    private static class C0002a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public float R;
        public boolean S;
        public float T;
        public float U;
        public float V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a, reason: collision with root package name */
        boolean f1392a;
        public float aa;
        public float ab;
        public float ac;
        public int ad;
        public int ae;
        public int af;
        public int ag;
        public int ah;
        public int ai;

        /* renamed from: b, reason: collision with root package name */
        public int f1393b;

        /* renamed from: c, reason: collision with root package name */
        public int f1394c;

        /* renamed from: d, reason: collision with root package name */
        int f1395d;
        public int e;
        public int f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public int z;

        private C0002a() {
            this.f1392a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = 0;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = false;
            this.T = 0.0f;
            this.U = 0.0f;
            this.V = 0.0f;
            this.W = 1.0f;
            this.X = 1.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 0.0f;
            this.ab = 0.0f;
            this.ac = 0.0f;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = -1;
            this.ai = -1;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0002a clone() {
            C0002a c0002a = new C0002a();
            c0002a.f1392a = this.f1392a;
            c0002a.f1393b = this.f1393b;
            c0002a.f1394c = this.f1394c;
            c0002a.e = this.e;
            c0002a.f = this.f;
            c0002a.g = this.g;
            c0002a.h = this.h;
            c0002a.i = this.i;
            c0002a.j = this.j;
            c0002a.k = this.k;
            c0002a.l = this.l;
            c0002a.m = this.m;
            c0002a.n = this.n;
            c0002a.o = this.o;
            c0002a.p = this.p;
            c0002a.q = this.q;
            c0002a.r = this.r;
            c0002a.s = this.s;
            c0002a.t = this.t;
            c0002a.u = this.u;
            c0002a.v = this.v;
            c0002a.w = this.w;
            c0002a.x = this.x;
            c0002a.y = this.y;
            c0002a.u = this.u;
            c0002a.u = this.u;
            c0002a.u = this.u;
            c0002a.u = this.u;
            c0002a.u = this.u;
            c0002a.z = this.z;
            c0002a.A = this.A;
            c0002a.B = this.B;
            c0002a.C = this.C;
            c0002a.D = this.D;
            c0002a.E = this.E;
            c0002a.F = this.F;
            c0002a.G = this.G;
            c0002a.H = this.H;
            c0002a.I = this.I;
            c0002a.J = this.J;
            c0002a.K = this.K;
            c0002a.L = this.L;
            c0002a.M = this.M;
            c0002a.N = this.N;
            c0002a.O = this.O;
            c0002a.P = this.P;
            c0002a.Q = this.Q;
            c0002a.R = this.R;
            c0002a.S = this.S;
            c0002a.T = this.T;
            c0002a.U = this.U;
            c0002a.V = this.V;
            c0002a.W = this.W;
            c0002a.X = this.X;
            c0002a.Y = this.Y;
            c0002a.Z = this.Z;
            c0002a.aa = this.aa;
            c0002a.ab = this.ab;
            c0002a.ac = this.ac;
            c0002a.ad = this.ad;
            c0002a.ae = this.ae;
            c0002a.af = this.af;
            c0002a.ag = this.ag;
            c0002a.ah = this.ah;
            c0002a.ai = this.ai;
            return c0002a;
        }

        public void a(ConstraintLayout.a aVar) {
            aVar.f1384d = this.h;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.m = this.q;
            aVar.n = this.r;
            aVar.o = this.s;
            aVar.p = this.t;
            aVar.leftMargin = this.A;
            aVar.rightMargin = this.B;
            aVar.topMargin = this.C;
            aVar.bottomMargin = this.D;
            aVar.u = this.M;
            aVar.v = this.L;
            aVar.w = this.u;
            aVar.x = this.v;
            aVar.y = this.w;
            aVar.L = this.x;
            aVar.M = this.y;
            aVar.C = this.N;
            aVar.B = this.O;
            aVar.E = this.Q;
            aVar.D = this.P;
            aVar.F = this.ad;
            aVar.G = this.ae;
            aVar.J = this.af;
            aVar.K = this.ag;
            aVar.H = this.ah;
            aVar.I = this.ai;
            aVar.N = this.z;
            aVar.f1383c = this.g;
            aVar.f1381a = this.e;
            aVar.f1382b = this.f;
            aVar.width = this.f1393b;
            aVar.height = this.f1394c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.F);
                aVar.setMarginEnd(this.E);
            }
            aVar.a();
        }
    }

    void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1387b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.f1387b.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0002a c0002a = this.f1387b.get(Integer.valueOf(id));
                ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                c0002a.a(aVar);
                childAt.setLayoutParams(aVar);
                childAt.setVisibility(c0002a.G);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(c0002a.R);
                    childAt.setRotationX(c0002a.U);
                    childAt.setRotationY(c0002a.V);
                    childAt.setScaleX(c0002a.W);
                    childAt.setScaleY(c0002a.X);
                    childAt.setPivotX(c0002a.Y);
                    childAt.setPivotY(c0002a.Z);
                    childAt.setTranslationX(c0002a.aa);
                    childAt.setTranslationY(c0002a.ab);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(c0002a.ac);
                        if (c0002a.S) {
                            childAt.setElevation(c0002a.T);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0002a c0002a2 = this.f1387b.get(num);
            if (c0002a2.f1392a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c0002a2.a(generateDefaultLayoutParams);
                constraintLayout.addView(guideline, generateDefaultLayoutParams);
            }
        }
    }

    public void a(Context context, int i) {
        int eventType;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return;
        }
        for (eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 0) {
                xml.getName();
            } else {
                switch (eventType) {
                    case 2:
                        String name = xml.getName();
                        C0002a a2 = a(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            a2.f1392a = true;
                        }
                        this.f1387b.put(Integer.valueOf(a2.f1395d), a2);
                        continue;
                    case 3:
                        continue;
                    default:
                        continue;
                }
                e.printStackTrace();
                return;
            }
        }
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private C0002a a(Context context, AttributeSet attributeSet) {
        C0002a c0002a = new C0002a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
        a(c0002a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c0002a;
    }

    private void a(C0002a c0002a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1386c.get(index);
            if (i2 != 60) {
                switch (i2) {
                    case 1:
                        c0002a.p = a(typedArray, index, c0002a.p);
                        break;
                    case 2:
                        c0002a.D = typedArray.getDimensionPixelSize(index, c0002a.D);
                        break;
                    case 3:
                        c0002a.o = a(typedArray, index, c0002a.o);
                        break;
                    case 4:
                        c0002a.n = a(typedArray, index, c0002a.n);
                        break;
                    case 5:
                        c0002a.w = typedArray.getString(index);
                        break;
                    case 6:
                        c0002a.x = typedArray.getDimensionPixelOffset(index, c0002a.x);
                        break;
                    case 7:
                        c0002a.y = typedArray.getDimensionPixelOffset(index, c0002a.y);
                        break;
                    case 8:
                        c0002a.E = typedArray.getDimensionPixelSize(index, c0002a.E);
                        break;
                    case 9:
                        c0002a.n = a(typedArray, index, c0002a.t);
                        break;
                    case 10:
                        c0002a.s = a(typedArray, index, c0002a.s);
                        break;
                    case 11:
                        c0002a.K = typedArray.getDimensionPixelSize(index, c0002a.K);
                        break;
                    case 12:
                        c0002a.L = typedArray.getDimensionPixelSize(index, c0002a.L);
                        break;
                    case 13:
                        c0002a.H = typedArray.getDimensionPixelSize(index, c0002a.H);
                        break;
                    case 14:
                        c0002a.J = typedArray.getDimensionPixelSize(index, c0002a.J);
                        break;
                    case 15:
                        c0002a.M = typedArray.getDimensionPixelSize(index, c0002a.M);
                        break;
                    case 16:
                        c0002a.I = typedArray.getDimensionPixelSize(index, c0002a.I);
                        break;
                    case 17:
                        c0002a.e = typedArray.getDimensionPixelOffset(index, c0002a.e);
                        break;
                    case 18:
                        c0002a.f = typedArray.getDimensionPixelOffset(index, c0002a.f);
                        break;
                    case 19:
                        c0002a.g = typedArray.getFloat(index, c0002a.g);
                        break;
                    case 20:
                        c0002a.u = typedArray.getFloat(index, c0002a.u);
                        break;
                    case 21:
                        c0002a.f1394c = typedArray.getLayoutDimension(index, c0002a.f1394c);
                        break;
                    case 22:
                        c0002a.G = typedArray.getInt(index, c0002a.G);
                        c0002a.G = f1385a[c0002a.G];
                        break;
                    case 23:
                        c0002a.f1393b = typedArray.getLayoutDimension(index, c0002a.f1393b);
                        break;
                    case 24:
                        c0002a.A = typedArray.getDimensionPixelSize(index, c0002a.A);
                        break;
                    case 25:
                        c0002a.h = a(typedArray, index, c0002a.h);
                        break;
                    case 26:
                        c0002a.i = a(typedArray, index, c0002a.i);
                        break;
                    case 27:
                        c0002a.z = typedArray.getInt(index, c0002a.z);
                        break;
                    case 28:
                        c0002a.B = typedArray.getDimensionPixelSize(index, c0002a.B);
                        break;
                    case 29:
                        c0002a.j = a(typedArray, index, c0002a.j);
                        break;
                    case 30:
                        c0002a.k = a(typedArray, index, c0002a.k);
                        break;
                    case 31:
                        c0002a.F = typedArray.getDimensionPixelSize(index, c0002a.F);
                        break;
                    case 32:
                        c0002a.q = a(typedArray, index, c0002a.q);
                        break;
                    case 33:
                        c0002a.r = a(typedArray, index, c0002a.r);
                        break;
                    case 34:
                        c0002a.C = typedArray.getDimensionPixelSize(index, c0002a.C);
                        break;
                    case 35:
                        c0002a.m = a(typedArray, index, c0002a.m);
                        break;
                    case 36:
                        c0002a.l = a(typedArray, index, c0002a.l);
                        break;
                    case 37:
                        c0002a.v = typedArray.getFloat(index, c0002a.v);
                        break;
                    case 38:
                        c0002a.f1395d = typedArray.getResourceId(index, c0002a.f1395d);
                        break;
                    case 39:
                        c0002a.O = typedArray.getFloat(index, c0002a.O);
                        break;
                    case 40:
                        c0002a.N = typedArray.getFloat(index, c0002a.N);
                        break;
                    case 41:
                        c0002a.P = typedArray.getInt(index, c0002a.P);
                        break;
                    case 42:
                        c0002a.Q = typedArray.getInt(index, c0002a.Q);
                        break;
                    case 43:
                        c0002a.R = typedArray.getFloat(index, c0002a.R);
                        break;
                    case 44:
                        c0002a.S = true;
                        c0002a.T = typedArray.getFloat(index, c0002a.T);
                        break;
                    case 45:
                        c0002a.U = typedArray.getFloat(index, c0002a.U);
                        break;
                    case 46:
                        c0002a.V = typedArray.getFloat(index, c0002a.V);
                        break;
                    case 47:
                        c0002a.W = typedArray.getFloat(index, c0002a.W);
                        break;
                    case 48:
                        c0002a.X = typedArray.getFloat(index, c0002a.X);
                        break;
                    case 49:
                        c0002a.Y = typedArray.getFloat(index, c0002a.Y);
                        break;
                    case 50:
                        c0002a.Z = typedArray.getFloat(index, c0002a.Z);
                        break;
                    case 51:
                        c0002a.aa = typedArray.getFloat(index, c0002a.aa);
                        break;
                    case 52:
                        c0002a.ab = typedArray.getFloat(index, c0002a.ab);
                        break;
                    case 53:
                        c0002a.ac = typedArray.getFloat(index, c0002a.ac);
                        break;
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1386c.get(index));
                        break;
                }
            } else {
                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1386c.get(index));
            }
        }
    }
}
