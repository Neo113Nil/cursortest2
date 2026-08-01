package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import com.awerser.monnit.betplay.MainActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class h5 implements o1, b9, mh, dw {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public h5(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case 11:
                this.g = editText;
                rh rhVar = new rh(editText);
                this.h = rhVar;
                editText.addTextChangedListener(rhVar);
                if (gh.b == null) {
                    synchronized (gh.a) {
                        try {
                            if (gh.b == null) {
                                gh ghVar = new gh();
                                try {
                                    gh.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, gh.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                gh.b = ghVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(gh.b);
                return;
            default:
                this.g = editText;
                this.h = new j1(editText);
                return;
        }
    }

    public static int v(int i2, int i3) {
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

    public void A(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        s(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y30 y30Var = (y30) ((ArrayList) this.h).get(size);
            int i5 = y30Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    y30Var.f = i5 - i3;
                }
            }
        }
    }

    public ih B(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        j1 j1Var = (j1) this.h;
        if (inputConnection == null) {
            j1Var.getClass();
            inputConnection2 = null;
        } else {
            h5 h5Var = (h5) j1Var.g;
            h5Var.getClass();
            if (!(inputConnection instanceof ih)) {
                inputConnection = new ih(editorInfo, inputConnection, (EditText) h5Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (ih) inputConnection2;
    }

    public void C(p1 p1Var) {
        h8 h8Var = (h8) this.g;
        ((ActionMode.Callback) h8Var.f).onDestroyActionMode(h8Var.d(p1Var));
        t4 t4Var = (t4) this.h;
        if (t4Var.B != null) {
            t4Var.q.getDecorView().removeCallbacks(t4Var.C);
        }
        if (t4Var.A != null) {
            t90 t90Var = t4Var.D;
            if (t90Var != null) {
                t90Var.b();
            }
            t90 a = e90.a(t4Var.A);
            a.a(0.0f);
            t4Var.D = a;
            a.d(new i4(2, this));
        }
        t4Var.s.onSupportActionModeFinished(t4Var.z);
        t4Var.z = null;
        ViewGroup viewGroup = t4Var.G;
        WeakHashMap weakHashMap = e90.a;
        viewGroup.requestApplyInsets();
        t4Var.H();
    }

    public void D(vy vyVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new q1(8, mainActivity));
    }

    public boolean E(p1 p1Var, Menu menu) {
        ViewGroup viewGroup = ((t4) this.h).G;
        WeakHashMap weakHashMap = e90.a;
        viewGroup.requestApplyInsets();
        h8 h8Var = (h8) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) h8Var.f;
        x40 d = h8Var.d(p1Var);
        h30 h30Var = (h30) h8Var.i;
        Menu menu2 = (Menu) h30Var.get(menu);
        if (menu2 == null) {
            menu2 = new uu((Context) h8Var.g, (au) menu);
            h30Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(d, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(vy vyVar, y00 y00Var) {
        String str;
        Charset charset;
        String str2;
        final String r = MainActivity.r(new byte[]{-82, -113, -85, -117, -68, -110, -86, -50, -67, -123, -81});
        final String r2 = MainActivity.r(new byte[]{-5, -109, -83, -127, -83, -107, -86, -62, -29, -62, -74, -117, -5});
        final String str3 = ((yo) y00Var.f.b).h;
        a10 a10Var = y00Var.l;
        if (a10Var != null) {
            r8 o = a10Var.o();
            try {
                wt n = a10Var.n();
                if (n != null) {
                    charset = v9.a;
                    String[] strArr = n.b;
                    int i2 = 0;
                    int t = l70.t(0, strArr.length - 1, 2);
                    if (t >= 0) {
                        while (!t40.b0(strArr[i2], "charset")) {
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
                charset = v9.a;
                str = o.l(y70.p(o, charset));
                o.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: yr
            @Override // java.lang.Runnable
            public final void run() {
                String str5 = str3;
                boolean g0 = l40.g0(str5, r);
                MainActivity mainActivity2 = mainActivity;
                if (g0) {
                    if (l40.g0(str4, r2)) {
                        int i3 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    } else {
                        int i4 = MainActivity.L;
                        mainActivity2.s();
                        return;
                    }
                }
                int i5 = MainActivity.L;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.J.a();
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString((String) this.g, str5);
                edit.apply();
                mainActivity2.G = str5;
                mainActivity2.t(str5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(sj sjVar) {
        o00 o00Var = (o00) this.h;
        tx txVar = (tx) this.g;
        int i2 = sjVar.b;
        boolean z = false;
        Object[] objArr = 0;
        if (i2 == 0) {
            o00Var.execute(new h1(txVar, sjVar.a, 4, z));
        } else {
            o00Var.execute(new y8(i2, (int) (objArr == true ? 1 : 0), (Object) txVar));
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
    public void H(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        yc ycVar;
        dd ddVar = new dd();
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
                    ycVar = null;
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
                                    if (ycVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ycVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (ycVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ycVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    ycVar = dd.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (ycVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ycVar.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (ycVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ycVar.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    ycVar = dd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ycVar.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (ycVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                qc.a(context, xmlResourceParser, ycVar.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    ycVar = dd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ycVar.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (ycVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    ycVar = dd.d(context, Xml.asAttributeSet(xmlResourceParser), false);
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
                                ddVar.c.put(Integer.valueOf(ycVar.a), ycVar);
                                ycVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    ddVar.c.put(Integer.valueOf(ycVar.a), ycVar);
                                    ycVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    ddVar.c.put(Integer.valueOf(ycVar.a), ycVar);
                                    ycVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, ddVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, ddVar);
                return;
            }
        }
    }

    public uv I(c00 c00Var, int i2) {
        l90 l90Var;
        uv uvVar;
        h30 h30Var = (h30) this.g;
        int d = h30Var.d(c00Var);
        if (d >= 0 && (l90Var = (l90) h30Var.i(d)) != null) {
            int i3 = l90Var.a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                l90Var.a = i4;
                if (i2 == 4) {
                    uvVar = l90Var.b;
                } else if (i2 == 8) {
                    uvVar = l90Var.c;
                } else {
                    o8.j("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    h30Var.g(d);
                    l90Var.a = 0;
                    l90Var.b = null;
                    l90Var.c = null;
                    l90.d.c(l90Var);
                }
                return uvVar;
            }
        }
        return null;
    }

    public void J(c00 c00Var) {
        l90 l90Var = (l90) ((h30) this.g).get(c00Var);
        if (l90Var == null) {
            return;
        }
        l90Var.a &= -2;
    }

    public void K(c00 c00Var) {
        vr vrVar = (vr) this.h;
        int e = vrVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (c00Var == vrVar.f(e)) {
                Object[] objArr = vrVar.h;
                Object obj = objArr[e];
                Object obj2 = j8.c;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    vrVar.f = true;
                }
            } else {
                e--;
            }
        }
        l90 l90Var = (l90) ((h30) this.g).remove(c00Var);
        if (l90Var != null) {
            l90Var.a = 0;
            l90Var.b = null;
            l90Var.c = null;
            l90.d.c(l90Var);
        }
    }

    public void L(boolean z) {
        rh rhVar = (rh) ((h5) ((j1) this.h).g).h;
        if (rhVar.h != z) {
            if (rhVar.g != null) {
                ch a = ch.a();
                qh qhVar = rhVar.g;
                a.getClass();
                vw.o(qhVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(qhVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            rhVar.h = z;
            if (z) {
                rh.a(rhVar.f, ch.a().b());
            }
        }
    }

    public void M(int i2, int i3, int i4, int i5) {
        d9 d9Var = (d9) this.h;
        d9Var.i.set(i2, i3, i4, i5);
        Rect rect = d9Var.h;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public Drawable N(Drawable drawable, boolean z) {
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
            drawableArr[i2] = N(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
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

    public void a(c00 c00Var, uv uvVar) {
        h30 h30Var = (h30) this.g;
        l90 l90Var = (l90) h30Var.get(c00Var);
        if (l90Var == null) {
            l90Var = l90.a();
            h30Var.put(c00Var, l90Var);
        }
        l90Var.c = uvVar;
        l90Var.a |= 8;
    }

    @Override // defpackage.mh
    public Object b() {
        return (v70) this.g;
    }

    public void c() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void d(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void e(boolean z) {
        n nVar = (n) this.h;
        r3 r3Var = nVar.t.g;
        Fragment fragment = nVar.v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void f(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void g(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void h(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void j(boolean z) {
        n nVar = (n) this.h;
        r3 r3Var = nVar.t.g;
        Fragment fragment = nVar.v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void l(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void m(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.mh
    public boolean n(CharSequence charSequence, int i2, int i3, s70 s70Var) {
        if ((s70Var.c & 4) > 0) {
            return true;
        }
        if (((v70) this.g) == null) {
            this.g = new v70(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((vg) this.h).getClass();
        ((v70) this.g).setSpan(new t70(s70Var), i2, i3, 33);
        return true;
    }

    public void o(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.dw
    public ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        z90 z90Var = (z90) this.g;
        aa0 aa0Var = (aa0) this.h;
        aa0 aa0Var2 = new aa0();
        aa0Var2.a = aa0Var.a;
        aa0Var2.b = aa0Var.b;
        aa0Var2.c = aa0Var.c;
        return z90Var.onApplyWindowInsets(view, ac0Var, aa0Var2);
    }

    @Override // defpackage.b9
    public void onCancel() {
        ((Animator) this.g).end();
        if (n.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((s) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        Fragment fragment = ((n) this.h).v;
        if (fragment != null) {
            fragment.getParentFragmentManager().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                o8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(int i2) {
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

    public View t(int i2, int i3, int i4, int i5) {
        View u;
        q80 q80Var = (q80) this.h;
        lz lzVar = (lz) this.g;
        int d = lzVar.d();
        int c = lzVar.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (lzVar.a) {
                case 0:
                    u = lzVar.b.u(i2);
                    break;
                default:
                    u = lzVar.b.u(i2);
                    break;
            }
            int b = lzVar.b(u);
            int a = lzVar.a(u);
            q80Var.b = d;
            q80Var.c = c;
            q80Var.d = b;
            q80Var.e = a;
            if (i4 != 0) {
                q80Var.a = i4;
                if (q80Var.a()) {
                    return u;
                }
            }
            if (i5 != 0) {
                q80Var.a = i5;
                if (q80Var.a()) {
                    view = u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public String toString() {
        switch (this.f) {
            case 19:
                String str = "[ ";
                if (((p30) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((p30) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((p30) this.g);
            default:
                return super.toString();
        }
    }

    public KeyListener u(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((h5) ((j1) this.h).g).getClass();
        if (keyListener instanceof lh) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new lh(keyListener);
    }

    public void w() {
        ((SparseIntArray) this.g).clear();
    }

    public boolean x(View view) {
        q80 q80Var = (q80) this.h;
        lz lzVar = (lz) this.g;
        int d = lzVar.d();
        int c = lzVar.c();
        int b = lzVar.b(view);
        int a = lzVar.a(view);
        q80Var.b = d;
        q80Var.c = c;
        q80Var.d = b;
        q80Var.e = a;
        q80Var.a = 24579;
        return q80Var.a();
    }

    public void y(AttributeSet attributeSet, int i2) {
        switch (this.f) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                r6 u = r6.u(i2, 0, absSeekBar.getContext(), attributeSet, i);
                Drawable l = u.l(0);
                if (l != null) {
                    if (l instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) l;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable N = N(animationDrawable.getFrame(i3), true);
                            N.setLevel(10000);
                            animationDrawable2.addFrame(N, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        l = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(l);
                }
                Drawable l2 = u.l(1);
                if (l2 != null) {
                    absSeekBar.setProgressDrawable(N(l2, false));
                }
                u.w();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, my.i, i2, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    L(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void z(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        s(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.g, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y30 y30Var = (y30) ((ArrayList) this.h).get(size);
            int i5 = y30Var.f;
            if (i5 >= i2) {
                y30Var.f = i5 + i3;
            }
        }
    }

    public /* synthetic */ h5(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ h5(LayoutInflater.Factory2 factory2, Object obj, int i2) {
        this.f = i2;
        this.h = factory2;
        this.g = obj;
    }

    public /* synthetic */ h5(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public h5(AbsSeekBar absSeekBar) {
        this.f = 0;
        this.g = absSeekBar;
    }

    public /* synthetic */ h5(int i2, Object obj) {
        this.f = i2;
        this.h = obj;
    }

    public h5(n nVar) {
        this.f = 15;
        this.g = new CopyOnWriteArrayList();
        this.h = nVar;
    }

    public h5(lz lzVar) {
        this.f = 22;
        this.g = lzVar;
        q80 q80Var = new q80();
        q80Var.a = 0;
        this.h = q80Var;
    }

    public h5(Animation animation) {
        this.f = 14;
        this.g = animation;
        this.h = null;
    }

    public h5(Animator animator) {
        this.f = 14;
        this.g = null;
        this.h = animator;
    }

    public h5(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 16;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public h5(int i2, int i3) {
        this.f = 16;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public h5(int i2) {
        this.f = i2;
        switch (i2) {
            case 17:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            case 23:
                this.g = new h30(0);
                this.h = new vr();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public h5(int i2, int i3, int i4) {
        this.f = 16;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }
}
