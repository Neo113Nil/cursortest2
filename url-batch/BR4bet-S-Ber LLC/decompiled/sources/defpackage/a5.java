package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.moontiko.really.admiralcasino.MainActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class a5 implements t9, wj, dl, zy {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public a5(int i2) {
        this.f = i2;
        switch (i2) {
            case 4:
                this.g = new Rect();
                this.h = new Rect();
                break;
            case 19:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            case 25:
                this.g = new w50(0);
                this.h = new eu();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public static int B(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public KeyListener A(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((a5) ((rc0) this.h).g).getClass();
        if (keyListener instanceof vj) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new vj(keyListener);
    }

    public void C() {
        ((SparseIntArray) this.g).clear();
    }

    public boolean D(View view) {
        ub0 ub0Var = (ub0) this.h;
        z10 z10Var = (z10) this.g;
        int d = z10Var.d();
        int c = z10Var.c();
        int b = z10Var.b(view);
        int a = z10Var.a(view);
        ub0Var.b = d;
        ub0Var.c = c;
        ub0Var.d = b;
        ub0Var.e = a;
        ub0Var.a = 24579;
        return ub0Var.a();
    }

    public void E(AttributeSet attributeSet, int i2) {
        switch (this.f) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                k6 z = k6.z(i2, 0, absSeekBar.getContext(), attributeSet, i);
                Drawable p = z.p(0);
                if (p != null) {
                    if (p instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) p;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable T = T(animationDrawable.getFrame(i3), true);
                            T.setLevel(10000);
                            animationDrawable2.addFrame(T, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        p = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(p);
                }
                Drawable p2 = z.p(1);
                if (p2 != null) {
                    absSeekBar.setProgressDrawable(T(p2, false));
                }
                z.B();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, z00.i, i2, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    R(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void F(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        y(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.g, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r60 r60Var = (r60) ((ArrayList) this.h).get(size);
            int i5 = r60Var.f;
            if (i5 >= i2) {
                r60Var.f = i5 + i3;
            }
        }
    }

    public void G(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        y(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r60 r60Var = (r60) ((ArrayList) this.h).get(size);
            int i5 = r60Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    r60Var.f = i5 - i3;
                }
            }
        }
    }

    public sj H(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        rc0 rc0Var = (rc0) this.h;
        if (inputConnection == null) {
            rc0Var.getClass();
            inputConnection2 = null;
        } else {
            a5 a5Var = (a5) rc0Var.g;
            a5Var.getClass();
            if (!(inputConnection instanceof sj)) {
                inputConnection = new sj(editorInfo, inputConnection, (EditText) a5Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (sj) inputConnection2;
    }

    public void I(m1 m1Var) {
        rg rgVar = (rg) this.g;
        ((ActionMode.Callback) rgVar.f).onDestroyActionMode(rgVar.k(m1Var));
        n4 n4Var = (n4) this.h;
        if (n4Var.A != null) {
            n4Var.q.getDecorView().removeCallbacks(n4Var.B);
        }
        if (n4Var.z != null) {
            wc0 wc0Var = n4Var.C;
            if (wc0Var != null) {
                wc0Var.b();
            }
            wc0 a = ic0.a(n4Var.z);
            a.a(0.0f);
            n4Var.C = a;
            a.d(new c4(2, this));
        }
        n4Var.y = null;
        ViewGroup viewGroup = n4Var.F;
        WeakHashMap weakHashMap = ic0.a;
        viewGroup.requestApplyInsets();
        n4Var.H();
    }

    public void J(i10 i10Var, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.g;
        mainActivity.runOnUiThread(new n1(8, mainActivity));
    }

    public boolean K(m1 m1Var, Menu menu) {
        ViewGroup viewGroup = ((n4) this.h).F;
        WeakHashMap weakHashMap = ic0.a;
        viewGroup.requestApplyInsets();
        rg rgVar = (rg) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) rgVar.f;
        s70 k = rgVar.k(m1Var);
        w50 w50Var = (w50) rgVar.i;
        Menu menu2 = (Menu) w50Var.get(menu);
        if (menu2 == null) {
            menu2 = new gx((Context) rgVar.g, (mw) menu);
            w50Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(k, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(i10 i10Var, n30 n30Var) {
        String str;
        Charset charset;
        String str2;
        final String r = MainActivity.r(new byte[]{-102, 63, -97, 59, -120, 34, -98, 126, -119, 53, -101});
        final String r2 = MainActivity.r(new byte[]{-49, 35, -103, 49, -103, 37, -98, 114, -41, 114, -126, 59, -49});
        final String str3 = n30Var.f.a.h;
        p30 p30Var = n30Var.l;
        if (p30Var != null) {
            j9 h = p30Var.h();
            try {
                iw g = p30Var.g();
                if (g != null) {
                    charset = la.a;
                    String[] strArr = g.b;
                    int i2 = 0;
                    int t = xf.t(0, strArr.length - 1, 2);
                    if (t >= 0) {
                        while (!n70.R(strArr[i2], "charset")) {
                            if (i2 != t) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = la.a;
                str = h.p(cb0.p(h, charset));
                h.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.g;
        final String str5 = (String) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: hu
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean W = f70.W(str6, r);
                MainActivity mainActivity2 = mainActivity;
                if (W) {
                    if (f70.W(str4, r2)) {
                        int i3 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    } else {
                        int i4 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.I;
                if (sharedPreferences == null) {
                    kr.g0("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString(str5, str6);
                edit.apply();
                mainActivity2.F = str6;
                mainActivity2.t(str6);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void M(bm bmVar) {
        c7 c7Var = (c7) this.h;
        pw pwVar = (pw) this.g;
        int i2 = bmVar.b;
        boolean z = false;
        Object[] objArr = 0;
        if (i2 == 0) {
            c7Var.execute(new g1(pwVar, bmVar.a, 5, z));
        } else {
            c7Var.execute(new q9(i2, (int) (objArr == true ? 1 : 0), (Object) pwVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        ud udVar;
        zd zdVar = new zd();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    udVar = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (udVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    udVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (udVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    udVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    udVar = zd.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (udVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    udVar.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (udVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    udVar.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    udVar = zd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    udVar.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (udVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                md.a(context, xmlResourceParser, udVar.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    udVar = zd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    udVar.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (udVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    udVar = zd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (!lowerCase.equals("guideline")) {
                                    break;
                                }
                                zdVar.c.put(Integer.valueOf(udVar.a), udVar);
                                udVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    zdVar.c.put(Integer.valueOf(udVar.a), udVar);
                                    udVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    zdVar.c.put(Integer.valueOf(udVar.a), udVar);
                                    udVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, zdVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, zdVar);
                return;
            }
        }
    }

    public hy O(q20 q20Var, int i2) {
        oc0 oc0Var;
        hy hyVar;
        w50 w50Var = (w50) this.g;
        int d = w50Var.d(q20Var);
        if (d >= 0 && (oc0Var = (oc0) w50Var.i(d)) != null) {
            int i3 = oc0Var.a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                oc0Var.a = i4;
                if (i2 == 4) {
                    hyVar = oc0Var.b;
                } else if (i2 == 8) {
                    hyVar = oc0Var.c;
                } else {
                    g9.i("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    w50Var.g(d);
                    oc0Var.a = 0;
                    oc0Var.b = null;
                    oc0Var.c = null;
                    oc0.d.c(oc0Var);
                }
                return hyVar;
            }
        }
        return null;
    }

    public void P(q20 q20Var) {
        oc0 oc0Var = (oc0) ((w50) this.g).get(q20Var);
        if (oc0Var == null) {
            return;
        }
        oc0Var.a &= -2;
    }

    public void Q(q20 q20Var) {
        eu euVar = (eu) this.h;
        int e = euVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (q20Var == euVar.f(e)) {
                Object[] objArr = euVar.h;
                Object obj = objArr[e];
                Object obj2 = mz.d;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    euVar.f = true;
                }
            } else {
                e--;
            }
        }
        oc0 oc0Var = (oc0) ((w50) this.g).remove(q20Var);
        if (oc0Var != null) {
            oc0Var.a = 0;
            oc0Var.b = null;
            oc0Var.c = null;
            oc0.d.c(oc0Var);
        }
    }

    public void R(boolean z) {
        ck ckVar = (ck) ((a5) ((rc0) this.h).g).h;
        if (ckVar.h != z) {
            if (ckVar.g != null) {
                lj a = lj.a();
                bk bkVar = ckVar.g;
                a.getClass();
                b9.f(bkVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(bkVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            ckVar.h = z;
            if (z) {
                ck.a(ckVar.f, lj.a().b());
            }
        }
    }

    public void S(int i2, int i3, int i4, int i5) {
        v9 v9Var = (v9) this.h;
        v9Var.i.set(i2, i3, i4, i5);
        Rect rect = v9Var.h;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public Drawable T(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = T(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    public void U() {
        Object parcelable;
        Integer num;
        uc ucVar = (uc) this.g;
        String str = (String) this.h;
        Bundle bundle = ucVar.g;
        LinkedHashMap linkedHashMap = ucVar.f;
        if (!ucVar.d.contains(str) && (num = (Integer) ucVar.b.remove(str)) != null) {
            ucVar.a.remove(num);
        }
        ucVar.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = g0.b(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!t1.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((t1) parcelable));
            bundle.remove(str);
        }
        if (ucVar.c.get(str) == null) {
            return;
        }
        g9.b();
    }

    @Override // defpackage.wj
    public Object a() {
        return (ya0) this.g;
    }

    @Override // defpackage.dl
    public int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = ((zk) this.g).g;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.h;
        int i2 = extendedFloatingActionButton2.n0;
        if (i2 != -1) {
            return (i2 == 0 || i2 == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i2;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.dl
    public int c() {
        return ((ExtendedFloatingActionButton) this.h).g0;
    }

    @Override // defpackage.dl
    public int d() {
        return ((ExtendedFloatingActionButton) this.h).f0;
    }

    @Override // defpackage.dl
    public int e() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        zk zkVar = (zk) this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.h;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return zkVar.e();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return zkVar.e();
    }

    @Override // defpackage.wj
    public boolean f(CharSequence charSequence, int i2, int i3, sa0 sa0Var) {
        if ((sa0Var.c & 4) > 0) {
            return true;
        }
        if (((ya0) this.g) == null) {
            this.g = new ya0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ej) this.h).getClass();
        ((ya0) this.g).setSpan(new ta0(sa0Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.dl
    public ViewGroup.LayoutParams g() {
        int i2 = ((ExtendedFloatingActionButton) this.h).n0;
        if (i2 == 0) {
            i2 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i2);
    }

    public void h(q20 q20Var, hy hyVar) {
        w50 w50Var = (w50) this.g;
        oc0 oc0Var = (oc0) w50Var.get(q20Var);
        if (oc0Var == null) {
            oc0Var = oc0.a();
            w50Var.put(q20Var, oc0Var);
        }
        oc0Var.c = hyVar;
        oc0Var.a |= 8;
    }

    public void i() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void j(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        en enVar = (en) this.h;
        m3 m3Var = enVar.t.s;
        pm pmVar = enVar.v;
        if (pmVar != null) {
            pmVar.j().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ye0 l(View view, ye0 ye0Var) {
        boolean z;
        boolean z2;
        s8 s8Var = (s8) this.g;
        cd0 cd0Var = (cd0) this.h;
        int i2 = cd0Var.a;
        int i3 = cd0Var.b;
        int i4 = cd0Var.c;
        ve0 ve0Var = ye0Var.a;
        er h = ve0Var.h(519);
        er h2 = ve0Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) s8Var.b;
        int i5 = h.b;
        int i6 = h.c;
        int i7 = h.a;
        bottomSheetBehavior.x = i5;
        boolean z3 = true;
        boolean z4 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z5 = bottomSheetBehavior.p;
        if (z5) {
            int a = ye0Var.a();
            bottomSheetBehavior.w = a;
            paddingBottom = a + i4;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (z4 ? i3 : i2) + i7;
        }
        if (bottomSheetBehavior.r) {
            if (!z4) {
                i2 = i3;
            }
            paddingRight = i2 + i6;
        }
        int i8 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i7) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i7;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i9 = marginLayoutParams.topMargin;
            int i10 = h.b;
            if (i9 != i10) {
                marginLayoutParams.topMargin = i10;
                if (z3) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), i8, paddingBottom);
                z2 = s8Var.a;
                if (z2) {
                    bottomSheetBehavior.n = h2.d;
                }
                if (z5 && !z2) {
                    return ye0Var;
                }
                bottomSheetBehavior.S();
                return ye0Var;
            }
        }
        z3 = z;
        if (z3) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i8, paddingBottom);
        z2 = s8Var.a;
        if (z2) {
        }
        if (z5) {
        }
        bottomSheetBehavior.S();
        return ye0Var;
    }

    public void m(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.t9
    public void onCancel() {
        ((Animator) this.g).end();
        if (en.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((m60) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        en enVar = (en) this.h;
        m3 m3Var = enVar.t.s;
        pm pmVar = enVar.v;
        if (pmVar != null) {
            pmVar.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        switch (this.f) {
            case 21:
                String str = "[ ";
                if (((g60) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((g60) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((g60) this.g);
            case 27:
                return "Bounds{lower=" + ((er) this.g) + " upper=" + ((er) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void w(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void x(boolean z) {
        pm pmVar = ((en) this.h).v;
        if (pmVar != null) {
            pmVar.j().l.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                g9.b();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void y(int i2) {
        int[] iArr = (int[]) this.g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View z(int i2, int i3, int i4, int i5) {
        View u;
        ub0 ub0Var = (ub0) this.h;
        z10 z10Var = (z10) this.g;
        int d = z10Var.d();
        int c = z10Var.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (z10Var.a) {
                case 0:
                    u = z10Var.b.u(i2);
                    break;
                default:
                    u = z10Var.b.u(i2);
                    break;
            }
            int b = z10Var.b(u);
            int a = z10Var.a(u);
            ub0Var.b = d;
            ub0Var.c = c;
            ub0Var.d = b;
            ub0Var.e = a;
            if (i4 != 0) {
                ub0Var.a = i4;
                if (ub0Var.a()) {
                    return u;
                }
            }
            if (i5 != 0) {
                ub0Var.a = i5;
                if (ub0Var.a()) {
                    view = u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public /* synthetic */ a5(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ a5(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ a5(Object obj, Object obj2, int i2, boolean z) {
        this.f = i2;
        this.h = obj;
        this.g = obj2;
    }

    public a5(AbsSeekBar absSeekBar) {
        this.f = 0;
        this.g = absSeekBar;
    }

    public a5(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case 13:
                this.g = editText;
                ck ckVar = new ck(editText);
                this.h = ckVar;
                editText.addTextChangedListener(ckVar);
                if (qj.b == null) {
                    synchronized (qj.a) {
                        try {
                            if (qj.b == null) {
                                qj qjVar = new qj();
                                try {
                                    qj.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, qj.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                qj.b = qjVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(qj.b);
                return;
            default:
                this.g = editText;
                this.h = new rc0(editText);
                return;
        }
    }

    public a5(en enVar) {
        this.f = 17;
        this.g = new CopyOnWriteArrayList();
        this.h = enVar;
    }

    public a5(z10 z10Var) {
        this.f = 24;
        this.g = z10Var;
        ub0 ub0Var = new ub0();
        ub0Var.a = 0;
        this.h = ub0Var;
    }

    public a5(Animation animation) {
        this.f = 16;
        this.g = animation;
        this.h = null;
    }

    public a5(Animator animator) {
        this.f = 16;
        this.g = null;
        this.h = animator;
    }

    public a5(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 18;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public a5(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f = 27;
        lowerBound = bounds.getLowerBound();
        this.g = er.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = er.d(upperBound);
    }

    public a5(int i2, int i3) {
        this.f = 18;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public /* synthetic */ a5(int i2, Object obj) {
        this.f = i2;
        this.h = obj;
    }

    public a5(int i2, int i3, int i4) {
        this.f = 18;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }
}
