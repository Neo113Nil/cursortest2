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
import com.derinko.gbini.n1casino.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class q4 implements g9, uh, wv {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public q4(int i2) {
        this.f = i2;
        switch (i2) {
            case 4:
                this.g = new Rect();
                this.h = new Rect();
                break;
            case 20:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            case 27:
                this.g = new u20(0);
                this.h = new hr();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public static int A(int i2, int i3) {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int B(int i2) {
        int i3;
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.h) != null) {
            p30 y = y(i2);
            if (y != null) {
                ((ArrayList) this.h).remove(y);
            }
            int size = ((ArrayList) this.h).size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (((p30) ((ArrayList) this.h).get(i4)).f >= i2) {
                    break;
                }
                i4++;
            }
            if (i4 != -1) {
                p30 p30Var = (p30) ((ArrayList) this.h).get(i4);
                ((ArrayList) this.h).remove(i4);
                i3 = p30Var.f;
                int[] iArr2 = (int[]) this.g;
                if (i3 != -1) {
                    Arrays.fill(iArr2, i2, iArr2.length, -1);
                    return ((int[]) this.g).length;
                }
                int min = Math.min(i3 + 1, iArr2.length);
                Arrays.fill((int[]) this.g, i2, min, -1);
                return min;
            }
        }
        i3 = -1;
        int[] iArr22 = (int[]) this.g;
        if (i3 != -1) {
        }
    }

    public void C() {
        ((SparseIntArray) this.g).clear();
    }

    public boolean D(View view) {
        j80 j80Var = (j80) this.h;
        vy vyVar = (vy) this.g;
        int d = vyVar.d();
        int c = vyVar.c();
        int b = vyVar.b(view);
        int a = vyVar.a(view);
        j80Var.b = d;
        j80Var.c = c;
        j80Var.d = b;
        j80Var.e = a;
        j80Var.a = 24579;
        return j80Var.a();
    }

    public void E(AttributeSet attributeSet, int i2) {
        switch (this.f) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                a6 u = a6.u(i2, 0, absSeekBar.getContext(), attributeSet, i);
                Drawable l = u.l(0);
                if (l != null) {
                    if (l instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) l;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable T = T(animationDrawable.getFrame(i3), true);
                            T.setLevel(10000);
                            animationDrawable2.addFrame(T, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        l = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(l);
                }
                Drawable l2 = u.l(1);
                if (l2 != null) {
                    absSeekBar.setProgressDrawable(T(l2, false));
                }
                u.w();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, wx.i, i2, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    R(z);
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
        u(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.g, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p30 p30Var = (p30) ((ArrayList) this.h).get(size);
            int i5 = p30Var.f;
            if (i5 >= i2) {
                p30Var.f = i5 + i3;
            }
        }
    }

    public void G(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        u(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p30 p30Var = (p30) ((ArrayList) this.h).get(size);
            int i5 = p30Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    p30Var.f = i5 - i3;
                }
            }
        }
    }

    public qh H(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        k0 k0Var = (k0) this.h;
        if (inputConnection == null) {
            k0Var.getClass();
            inputConnection2 = null;
        } else {
            q4 q4Var = (q4) k0Var.g;
            q4Var.getClass();
            if (!(inputConnection instanceof qh)) {
                inputConnection = new qh(editorInfo, inputConnection, (EditText) q4Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (qh) inputConnection2;
    }

    public void I(l1 l1Var) {
        we weVar = (we) this.g;
        ((ActionMode.Callback) weVar.f).onDestroyActionMode(weVar.k(l1Var));
        d4 d4Var = (d4) this.h;
        if (d4Var.A != null) {
            d4Var.q.getDecorView().removeCallbacks(d4Var.B);
        }
        if (d4Var.z != null) {
            l90 l90Var = d4Var.C;
            if (l90Var != null) {
                l90Var.b();
            }
            l90 a = x80.a(d4Var.z);
            a.a(0.0f);
            d4Var.C = a;
            a.d(new s3(2, this));
        }
        d4Var.y = null;
        ViewGroup viewGroup = d4Var.E;
        WeakHashMap weakHashMap = x80.a;
        viewGroup.requestApplyInsets();
        d4Var.I();
    }

    public void J(gy gyVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.g;
        mainActivity.runOnUiThread(new m1(8, mainActivity));
    }

    public boolean K(l1 l1Var, Menu menu) {
        ViewGroup viewGroup = ((d4) this.h).E;
        WeakHashMap weakHashMap = x80.a;
        viewGroup.requestApplyInsets();
        we weVar = (we) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) weVar.f;
        q40 k = weVar.k(l1Var);
        u20 u20Var = (u20) weVar.i;
        Menu menu2 = (Menu) u20Var.get(menu);
        if (menu2 == null) {
            menu2 = new fu((Context) weVar.g, (mt) menu);
            u20Var.put(menu, menu2);
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
    public void L(gy gyVar, i00 i00Var) {
        String str;
        Charset charset;
        String str2;
        final String q = MainActivity.q(new byte[]{-52, -101, -55, -97, -34, -122, -56, -38, -33, -111, -51});
        final String q2 = MainActivity.q(new byte[]{-103, -121, -49, -107, -49, -127, -56, -42, -127, -42, -44, -97, -103});
        final String str3 = i00Var.f.a.h;
        k00 k00Var = i00Var.l;
        if (k00Var != null) {
            w8 o = k00Var.o();
            try {
                ht n = k00Var.n();
                if (n != null) {
                    charset = z9.a;
                    String[] strArr = n.b;
                    int i2 = 0;
                    int y = jw.y(0, strArr.length - 1, 2);
                    if (y >= 0) {
                        while (!k40.j0(strArr[i2], "charset")) {
                            if (i2 != y) {
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
                charset = z9.a;
                str = o.l(r70.p(o, charset));
                o.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.g;
        final String str5 = (String) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: kr
            @Override // java.lang.Runnable
            public final void run() {
                String str6 = str3;
                boolean o0 = c40.o0(str6, q);
                MainActivity mainActivity2 = mainActivity;
                if (o0) {
                    if (c40.o0(str4, q2)) {
                        int i3 = MainActivity.L;
                        mainActivity2.r();
                        return;
                    } else {
                        int i4 = MainActivity.L;
                        mainActivity2.r();
                        return;
                    }
                }
                int i5 = MainActivity.L;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.J.a();
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString(str5, str6);
                edit.apply();
                mainActivity2.G = str6;
                mainActivity2.s(str6);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void M(xj xjVar) {
        s6 s6Var = (s6) this.h;
        mr mrVar = (mr) this.g;
        int i2 = xjVar.b;
        boolean z = false;
        Object[] objArr = 0;
        if (i2 == 0) {
            s6Var.execute(new f1(mrVar, xjVar.a, 5, z));
        } else {
            s6Var.execute(new d9(i2, (int) (objArr == true ? 1 : 0), (Object) mrVar));
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
        uc ucVar;
        zc zcVar = new zc();
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
                    ucVar = null;
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
                                    if (ucVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ucVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (ucVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ucVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    ucVar = zc.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (ucVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ucVar.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (ucVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ucVar.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    ucVar = zc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ucVar.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (ucVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                mc.a(context, xmlResourceParser, ucVar.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    ucVar = zc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ucVar.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (ucVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    ucVar = zc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
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
                                zcVar.c.put(Integer.valueOf(ucVar.a), ucVar);
                                ucVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    zcVar.c.put(Integer.valueOf(ucVar.a), ucVar);
                                    ucVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    zcVar.c.put(Integer.valueOf(ucVar.a), ucVar);
                                    ucVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, zcVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, zcVar);
                return;
            }
        }
    }

    public ev O(nz nzVar, int i2) {
        e90 e90Var;
        ev evVar;
        u20 u20Var = (u20) this.g;
        int d = u20Var.d(nzVar);
        if (d >= 0 && (e90Var = (e90) u20Var.i(d)) != null) {
            int i3 = e90Var.a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                e90Var.a = i4;
                if (i2 == 4) {
                    evVar = e90Var.b;
                } else if (i2 == 8) {
                    evVar = e90Var.c;
                } else {
                    t8.k("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    u20Var.g(d);
                    e90Var.a = 0;
                    e90Var.b = null;
                    e90Var.c = null;
                    e90.d.c(e90Var);
                }
                return evVar;
            }
        }
        return null;
    }

    public void P(nz nzVar) {
        e90 e90Var = (e90) ((u20) this.g).get(nzVar);
        if (e90Var == null) {
            return;
        }
        e90Var.a &= -2;
    }

    public void Q(nz nzVar) {
        hr hrVar = (hr) this.h;
        int e = hrVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (nzVar == hrVar.f(e)) {
                Object[] objArr = hrVar.h;
                Object obj = objArr[e];
                Object obj2 = jw.i;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    hrVar.f = true;
                }
            } else {
                e--;
            }
        }
        e90 e90Var = (e90) ((u20) this.g).remove(nzVar);
        if (e90Var != null) {
            e90Var.a = 0;
            e90Var.b = null;
            e90Var.c = null;
            e90.d.c(e90Var);
        }
    }

    public void R(boolean z) {
        zh zhVar = (zh) ((q4) ((k0) this.h).g).h;
        if (zhVar.h != z) {
            if (zhVar.g != null) {
                kh a = kh.a();
                yh yhVar = zhVar.g;
                a.getClass();
                zo.g(yhVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(yhVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            zhVar.h = z;
            if (z) {
                zh.a(zhVar.f, kh.a().b());
            }
        }
    }

    public void S(int i2, int i3, int i4, int i5) {
        i9 i9Var = (i9) this.h;
        i9Var.i.set(i2, i3, i4, i5);
        Rect rect = i9Var.h;
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
        ub ubVar = (ub) this.g;
        String str = (String) this.h;
        Bundle bundle = ubVar.g;
        LinkedHashMap linkedHashMap = ubVar.f;
        if (!ubVar.d.contains(str) && (num = (Integer) ubVar.b.remove(str)) != null) {
            ubVar.a.remove(num);
        }
        ubVar.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = e0.b(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!s1.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((s1) parcelable));
            bundle.remove(str);
        }
        if (ubVar.c.get(str) == null) {
            return;
        }
        t8.c();
    }

    public void a(p30 p30Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        int size = ((ArrayList) this.h).size();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.h;
            if (i2 >= size) {
                arrayList.add(p30Var);
                return;
            }
            p30 p30Var2 = (p30) arrayList.get(i2);
            if (p30Var2.f == p30Var.f) {
                ((ArrayList) this.h).remove(i2);
            }
            if (p30Var2.f >= p30Var.f) {
                ((ArrayList) this.h).add(i2, p30Var);
                return;
            }
            i2++;
        }
    }

    @Override // defpackage.uh
    public Object b() {
        return (o70) this.g;
    }

    public void c(nz nzVar, ev evVar) {
        u20 u20Var = (u20) this.g;
        e90 e90Var = (e90) u20Var.get(nzVar);
        if (e90Var == null) {
            e90Var = e90.a();
            u20Var.put(nzVar, e90Var);
        }
        e90Var.c = evVar;
        e90Var.a |= 8;
    }

    public void d() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void e(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void f(boolean z) {
        bl blVar = (bl) this.h;
        c3 c3Var = blVar.t.p;
        mk mkVar = blVar.v;
        if (mkVar != null) {
            mkVar.j().l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void g(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void h(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void j(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        bl blVar = (bl) this.h;
        c3 c3Var = blVar.t.p;
        mk mkVar = blVar.v;
        if (mkVar != null) {
            mkVar.j().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void l(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
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
    @Override // defpackage.wv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rb0 m(View view, rb0 rb0Var) {
        boolean z;
        boolean z2;
        e8 e8Var = (e8) this.g;
        s90 s90Var = (s90) this.h;
        int i2 = s90Var.a;
        int i3 = s90Var.b;
        int i4 = s90Var.c;
        ob0 ob0Var = rb0Var.a;
        to h = ob0Var.h(519);
        to h2 = ob0Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e8Var.g;
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
            int a = rb0Var.a();
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
                z2 = e8Var.f;
                if (z2) {
                    bottomSheetBehavior.n = h2.d;
                }
                if (z5 && !z2) {
                    return rb0Var;
                }
                bottomSheetBehavior.S();
                return rb0Var;
            }
        }
        z3 = z;
        if (z3) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i8, paddingBottom);
        z2 = e8Var.f;
        if (z2) {
        }
        if (z5) {
        }
        bottomSheetBehavior.S();
        return rb0Var;
    }

    public void n(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.g9
    public void onCancel() {
        ((Animator) this.g).end();
        if (bl.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((k30) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.uh
    public boolean s(CharSequence charSequence, int i2, int i3, l70 l70Var) {
        if ((l70Var.c & 4) > 0) {
            return true;
        }
        if (((o70) this.g) == null) {
            this.g = new o70(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((dh) this.h).getClass();
        ((o70) this.g).setSpan(new m70(l70Var), i2, i3, 33);
        return true;
    }

    public void t(boolean z) {
        mk mkVar = ((bl) this.h).v;
        if (mkVar != null) {
            mkVar.j().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                t8.c();
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
            case 23:
                String str = "[ ";
                if (((e30) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((e30) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((e30) this.g);
            case 29:
                return "Bounds{lower=" + ((to) this.g) + " upper=" + ((to) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i2) {
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

    public View v(int i2, int i3, int i4, int i5) {
        View u;
        j80 j80Var = (j80) this.h;
        vy vyVar = (vy) this.g;
        int d = vyVar.d();
        int c = vyVar.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (vyVar.a) {
                case 0:
                    u = vyVar.b.u(i2);
                    break;
                default:
                    u = vyVar.b.u(i2);
                    break;
            }
            int b = vyVar.b(u);
            int a = vyVar.a(u);
            j80Var.b = d;
            j80Var.c = c;
            j80Var.d = b;
            j80Var.e = a;
            if (i4 != 0) {
                j80Var.a = i4;
                if (j80Var.a()) {
                    return u;
                }
            }
            if (i5 != 0) {
                j80Var.a = i5;
                if (j80Var.a()) {
                    view = u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public void w(int i2) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p30) ((ArrayList) this.h).get(size)).f >= i2) {
                    ((ArrayList) this.h).remove(size);
                }
            }
        }
        B(i2);
    }

    public p30 x(int i2, int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p30 p30Var = (p30) ((ArrayList) this.h).get(i5);
            int i6 = p30Var.f;
            if (i6 >= i3) {
                return null;
            }
            if (i6 >= i2 && (i4 == 0 || p30Var.g == i4 || p30Var.i)) {
                return p30Var;
            }
        }
        return null;
    }

    public p30 y(int i2) {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p30 p30Var = (p30) ((ArrayList) this.h).get(size);
            if (p30Var.f == i2) {
                return p30Var;
            }
        }
        return null;
    }

    public KeyListener z(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((q4) ((k0) this.h).g).getClass();
        if (keyListener instanceof th) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new th(keyListener);
    }

    public /* synthetic */ q4(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ q4(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public q4(AbsSeekBar absSeekBar) {
        this.f = 0;
        this.g = absSeekBar;
    }

    public q4(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case 14:
                this.g = editText;
                zh zhVar = new zh(editText);
                this.h = zhVar;
                editText.addTextChangedListener(zhVar);
                if (oh.b == null) {
                    synchronized (oh.a) {
                        try {
                            if (oh.b == null) {
                                oh ohVar = new oh();
                                try {
                                    oh.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, oh.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                oh.b = ohVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(oh.b);
                return;
            default:
                this.g = editText;
                this.h = new k0(editText);
                return;
        }
    }

    public q4(bl blVar) {
        this.f = 18;
        this.g = new CopyOnWriteArrayList();
        this.h = blVar;
    }

    public q4(vy vyVar) {
        this.f = 26;
        this.g = vyVar;
        j80 j80Var = new j80();
        j80Var.a = 0;
        this.h = j80Var;
    }

    public q4(Animation animation) {
        this.f = 17;
        this.g = animation;
        this.h = null;
    }

    public q4(Animator animator) {
        this.f = 17;
        this.g = null;
        this.h = animator;
    }

    public q4(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 19;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public q4(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f = 29;
        lowerBound = bounds.getLowerBound();
        this.g = to.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = to.d(upperBound);
    }

    public q4(int i2, int i3) {
        this.f = 19;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public /* synthetic */ q4(int i2, Object obj) {
        this.f = i2;
        this.h = obj;
    }

    public q4(int i2, int i3, int i4) {
        this.f = 19;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q4(d4 d4Var, we weVar) {
        this.f = 5;
        this.h = d4Var;
        this.g = weVar;
    }
}
