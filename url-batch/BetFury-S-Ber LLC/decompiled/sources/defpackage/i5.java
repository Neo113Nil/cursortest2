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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.trembin.nirefon.betfury.MainActivity;
import com.trembin.nirefon.betfury.data.NoteDatabase_Impl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class i5 implements db0, la, km, og0 {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public i5(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case 13:
                this.g = editText;
                qm qmVar = new qm(editText);
                this.h = qmVar;
                editText.addTextChangedListener(qmVar);
                if (em.b == null) {
                    synchronized (em.a) {
                        try {
                            if (em.b == null) {
                                em emVar = new em();
                                try {
                                    em.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, em.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                em.b = emVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(em.b);
                return;
            default:
                this.g = editText;
                this.h = new o0(editText);
                return;
        }
    }

    public static int y(int i2, int i3) {
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

    public void A(AttributeSet attributeSet, int i2) {
        switch (this.f) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                s6 t = s6.t(i2, 0, absSeekBar.getContext(), attributeSet, i);
                Drawable k = t.k(0);
                if (k != null) {
                    if (k instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) k;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable R = R(animationDrawable.getFrame(i3), true);
                            R.setLevel(10000);
                            animationDrawable2.addFrame(R, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        k = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(k);
                }
                Drawable k2 = t.k(1);
                if (k2 != null) {
                    absSeekBar.setProgressDrawable(R(k2, false));
                }
                t.v();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, d70.i, i2, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    P(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void B() {
        String str = (String) this.g;
        if (((FileChannel) this.h) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.h = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.h;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.h = null;
            throw new IllegalStateException(r7.c("Unable to lock file: '", str, "'."), th);
        }
    }

    public void C(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        v(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.g, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xe0 xe0Var = (xe0) ((ArrayList) this.h).get(size);
            int i5 = xe0Var.f;
            if (i5 >= i2) {
                xe0Var.f = i5 + i3;
            }
        }
    }

    public void D(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        v(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xe0 xe0Var = (xe0) ((ArrayList) this.h).get(size);
            int i5 = xe0Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    xe0Var.f = i5 - i3;
                }
            }
        }
    }

    public gm E(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        o0 o0Var = (o0) this.h;
        if (inputConnection == null) {
            o0Var.getClass();
            inputConnection2 = null;
        } else {
            i5 i5Var = (i5) o0Var.g;
            i5Var.getClass();
            if (!(inputConnection instanceof gm)) {
                inputConnection = new gm(editorInfo, inputConnection, (EditText) i5Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (gm) inputConnection2;
    }

    public void F(p1 p1Var) {
        wi wiVar = (wi) this.g;
        ((ActionMode.Callback) wiVar.f).onDestroyActionMode(wiVar.h(p1Var));
        v4 v4Var = (v4) this.h;
        if (v4Var.A != null) {
            v4Var.q.getDecorView().removeCallbacks(v4Var.B);
        }
        if (v4Var.z != null) {
            vm0 vm0Var = v4Var.C;
            if (vm0Var != null) {
                vm0Var.b();
            }
            vm0 a = hm0.a(v4Var.z);
            a.a(0.0f);
            v4Var.C = a;
            a.d(new k4(2, this));
        }
        v4Var.y = null;
        ViewGroup viewGroup = v4Var.F;
        WeakHashMap weakHashMap = hm0.a;
        viewGroup.requestApplyInsets();
        v4Var.I();
    }

    public void G(n70 n70Var, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new r1(8, mainActivity));
    }

    public boolean H(p1 p1Var, Menu menu) {
        ViewGroup viewGroup = ((v4) this.h).F;
        WeakHashMap weakHashMap = hm0.a;
        viewGroup.requestApplyInsets();
        wi wiVar = (wi) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) wiVar.f;
        bg0 h = wiVar.h(p1Var);
        zd0 zd0Var = (zd0) wiVar.i;
        Menu menu2 = (Menu) zd0Var.get(menu);
        if (menu2 == null) {
            menu2 = new k20((Context) wiVar.g, (r10) menu);
            zd0Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(n70 n70Var, v90 v90Var) {
        String str;
        Charset charset;
        String str2;
        final String l = MainActivity.l(new byte[]{-12, 105, -15, 109, -26, 116, -16, 40, -25, 99, -11});
        final String l2 = MainActivity.l(new byte[]{-95, 117, -9, 103, -9, 115, -16, 36, -71, 36, -20, 109, -95});
        final String str3 = ((ou) v90Var.f.b).h;
        x90 x90Var = v90Var.l;
        if (x90Var != null) {
            w9 r = x90Var.r();
            try {
                l10 n = x90Var.n();
                if (n != null) {
                    charset = fb.a;
                    String[] strArr = n.b;
                    int i2 = 0;
                    int w = mv.w(0, strArr.length - 1, 2);
                    if (w >= 0) {
                        while (!uf0.o(strArr[i2], "charset")) {
                            if (i2 != w) {
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
                charset = fb.a;
                str = r.M(zk0.p(r, charset));
                r.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: iz
            @Override // java.lang.Runnable
            public final void run() {
                String str5 = str3;
                boolean t = mf0.t(str5, l);
                MainActivity mainActivity2 = mainActivity;
                if (t) {
                    if (mf0.t(str4, l2)) {
                        int i3 = MainActivity.K;
                        mainActivity2.m();
                        return;
                    } else {
                        int i4 = MainActivity.K;
                        mainActivity2.m();
                        return;
                    }
                }
                int i5 = MainActivity.K;
                SharedPreferences sharedPreferences = (SharedPreferences) mainActivity2.J.getValue();
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString((String) this.g, str5);
                edit.apply();
                mainActivity2.G = str5;
                mainActivity2.n(str5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J(hp hpVar) {
        l7 l7Var = (l7) this.h;
        kz kzVar = (kz) this.g;
        int i2 = hpVar.b;
        boolean z = false;
        Object[] objArr = 0;
        if (i2 == 0) {
            l7Var.execute(new j1(kzVar, hpVar.a, 5, z));
        } else {
            l7Var.execute(new fa(i2, (int) (objArr == true ? 1 : 0), (Object) kzVar));
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
    public void K(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        jf jfVar;
        of ofVar = new of();
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
                    jfVar = null;
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
                                    if (jfVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jfVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (jfVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jfVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    jfVar = of.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (jfVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jfVar.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (jfVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    jfVar.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    jfVar = of.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jfVar.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (jfVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                ze.a(context, xmlResourceParser, jfVar.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    jfVar = of.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    jfVar.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (jfVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    jfVar = of.d(context, Xml.asAttributeSet(xmlResourceParser), false);
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
                                ofVar.c.put(Integer.valueOf(jfVar.a), jfVar);
                                jfVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    ofVar.c.put(Integer.valueOf(jfVar.a), jfVar);
                                    jfVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    ofVar.c.put(Integer.valueOf(jfVar.a), jfVar);
                                    jfVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, ofVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, ofVar);
                return;
            }
        }
    }

    public void L(Bundle bundle) {
        rb0 rb0Var = (rb0) this.g;
        sb0 sb0Var = rb0Var.a;
        if (!rb0Var.e) {
            rb0Var.a();
        }
        if (sb0Var.e().c.isAtLeast(gx.STARTED)) {
            s9.t(sb0Var.e().c, "performRestore cannot be called when owner is ");
            return;
        }
        if (rb0Var.g) {
            s9.u("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = d50.z(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        rb0Var.f = bundle2;
        rb0Var.g = true;
    }

    public void M(Bundle bundle) {
        rb0 rb0Var = (rb0) this.g;
        Bundle j = bi.j((k50[]) Arrays.copyOf(new k50[0], 0));
        Bundle bundle2 = rb0Var.f;
        if (bundle2 != null) {
            j.putAll(bundle2);
        }
        synchronized (rb0Var.c) {
            for (Map.Entry entry : rb0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((qb0) entry.getValue()).a();
                str.getClass();
                j.putBundle(str, a);
            }
        }
        if (j.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", j);
    }

    public void N(String str, qb0 qb0Var) {
        qb0Var.getClass();
        rb0 rb0Var = (rb0) this.g;
        synchronized (rb0Var.c) {
            if (rb0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            rb0Var.d.put(str, qb0Var);
        }
    }

    public void O() {
        if (!((rb0) this.g).h) {
            s9.u("Can not perform this action after onSaveInstanceState");
            return;
        }
        s3 s3Var = (s3) this.h;
        if (s3Var == null) {
            s3Var = new s3(this);
        }
        this.h = s3Var;
        try {
            bx.class.getDeclaredConstructor(null);
            s3 s3Var2 = (s3) this.h;
            if (s3Var2 != null) {
                ((LinkedHashSet) s3Var2.b).add(bx.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + bx.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void P(boolean z) {
        qm qmVar = (qm) ((i5) ((o0) this.h).g).h;
        if (qmVar.h != z) {
            if (qmVar.g != null) {
                zl a = zl.a();
                pm pmVar = qmVar.g;
                a.getClass();
                bi.q(pmVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(pmVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            qmVar.h = z;
            if (z) {
                qm.a(qmVar.f, zl.a().b());
            }
        }
    }

    public void Q(int i2, int i3, int i4, int i5) {
        oa oaVar = (oa) this.h;
        oaVar.i.set(i2, i3, i4, i5);
        Rect rect = oaVar.h;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public Drawable R(Drawable drawable, boolean z) {
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
            drawableArr[i2] = R(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
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

    @Override // defpackage.km
    public Object a() {
        return (vk0) this.g;
    }

    @Override // defpackage.km
    public boolean b(CharSequence charSequence, int i2, int i3, nk0 nk0Var) {
        if ((nk0Var.c & 4) > 0) {
            return true;
        }
        if (((vk0) this.g) == null) {
            this.g = new vk0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((sl) this.h).getClass();
        ((vk0) this.g).setSpan(new ok0(nk0Var), i2, i3, 33);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.db0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb0 c(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        ea0 ea0Var = (ea0) this.h;
        if (!str.equals(":memory:")) {
            str = ea0Var.c.a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        un unVar = new un(str, (ea0Var.a || ea0Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = unVar.a;
        reentrantLock.lock();
        i5 i5Var = unVar.b;
        if (i5Var != null) {
            try {
                i5Var.B();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (ea0Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                cb0 c = ((db0) this.g).c(str);
                if (ea0Var.a) {
                    if (ea0Var.c.g == ha0.WRITE_AHEAD_LOGGING) {
                        gk0.p(c, "PRAGMA synchronous = NORMAL");
                    } else {
                        gk0.p(c, "PRAGMA synchronous = FULL");
                    }
                    ea0.b(c);
                    ea0Var.d.onOpen(c);
                } else {
                    try {
                        ea0Var.b = true;
                        ea0.a(ea0Var, c);
                        ea0Var.b = false;
                    } catch (Throwable th2) {
                        ea0Var.b = false;
                        throw th2;
                    }
                }
                if (i5Var != null && (fileChannel2 = (FileChannel) i5Var.h) != null) {
                    try {
                        fileChannel2.close();
                        i5Var.h = null;
                    } finally {
                    }
                }
                return c;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (i5Var != null && (fileChannel = (FileChannel) i5Var.h) != null) {
                try {
                    fileChannel.close();
                    i5Var.h = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    @Override // defpackage.og0
    public String d() {
        return (String) this.g;
    }

    public void e() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    @Override // defpackage.og0
    public void f(ng0 ng0Var) {
        Object[] objArr = (Object[]) this.h;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj == null) {
                ng0Var.l(i2);
            } else if (obj instanceof byte[]) {
                ng0Var.E(i2, (byte[]) obj);
            } else if (obj instanceof Float) {
                ng0Var.o(i2, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ng0Var.o(i2, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ng0Var.b(i2, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ng0Var.b(i2, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ng0Var.b(i2, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ng0Var.b(i2, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ng0Var.F((String) obj, i2);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ng0Var.b(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public Bundle g(String str) {
        rb0 rb0Var = (rb0) this.g;
        if (!rb0Var.g) {
            s9.u("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = rb0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle z = bundle.containsKey(str) ? d50.z(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            rb0Var.f = null;
        }
        return z;
    }

    public void h(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(boolean z) {
        c cVar = (c) this.h;
        u3 u3Var = cVar.t.p;
        a aVar = cVar.v;
        if (aVar != null) {
            aVar.j().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void j(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void l(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void m(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(boolean z) {
        c cVar = (c) this.h;
        u3 u3Var = cVar.t.p;
        a aVar = cVar.v;
        if (aVar != null) {
            aVar.j().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.la
    public void onCancel() {
        ((Animator) this.g).end();
        if (c.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((qe0) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
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
            case 24:
                String str = "[ ";
                if (((je0) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((je0) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((je0) this.g);
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
        a aVar = ((c) this.h).v;
        if (aVar != null) {
            aVar.j().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                s9.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(int i2) {
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

    public KeyListener w(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((i5) ((o0) this.h).g).getClass();
        if (keyListener instanceof jm) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new jm(keyListener);
    }

    public qb0 x() {
        qb0 qb0Var;
        rb0 rb0Var = (rb0) this.g;
        synchronized (rb0Var.c) {
            Iterator it = rb0Var.d.entrySet().iterator();
            do {
                qb0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                qb0 qb0Var2 = (qb0) entry.getValue();
                if (mv.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    qb0Var = qb0Var2;
                }
            } while (qb0Var == null);
        }
        return qb0Var;
    }

    public void z() {
        ((SparseIntArray) this.g).clear();
    }

    public /* synthetic */ i5(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ i5(LayoutInflater.Factory2 factory2, Object obj, int i2) {
        this.f = i2;
        this.h = factory2;
        this.g = obj;
    }

    public /* synthetic */ i5(Object obj, int i2, boolean z) {
        this.f = i2;
        this.h = obj;
    }

    public /* synthetic */ i5(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public i5(rb0 rb0Var) {
        this.f = 27;
        this.g = rb0Var;
        this.h = new i5(26, rb0Var);
    }

    public i5(NoteDatabase_Impl noteDatabase_Impl) {
        this.f = 21;
        this.g = noteDatabase_Impl;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.getClass();
        this.h = newSetFromMap;
    }

    public i5(String str) {
        this.f = 16;
        this.g = str.concat(".lck");
    }

    public /* synthetic */ i5(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public i5(c cVar) {
        this.f = 18;
        this.g = new CopyOnWriteArrayList();
        this.h = cVar;
    }

    public i5(ea0 ea0Var, db0 db0Var) {
        this.f = 7;
        db0Var.getClass();
        this.h = ea0Var;
        this.g = db0Var;
    }

    public i5(Animation animation) {
        this.f = 17;
        this.g = animation;
        this.h = null;
    }

    public i5(Animator animator) {
        this.f = 17;
        this.g = null;
        this.h = animator;
    }

    public i5(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 19;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public i5(int i2, int i3) {
        this.f = 19;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public i5(int i2) {
        this.f = i2;
        switch (i2) {
            case 3:
                this.g = new Rect();
                this.h = new Rect();
                break;
            case 20:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public i5(int i2, int i3, int i4) {
        this.f = 19;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }
}
