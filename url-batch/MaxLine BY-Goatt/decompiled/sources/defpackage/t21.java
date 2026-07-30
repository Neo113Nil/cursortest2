package defpackage;

import android.R;
import android.animation.Animator;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
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
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class t21 implements oc2, hs, lg0, jq2, ek0 {
    public static final int[] p = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int m;
    public Object n;
    public Object o;

    public t21(EditText editText, int i) {
        this.m = i;
        switch (i) {
            case 15:
                this.n = editText;
                tg0 tg0Var = new tg0(editText);
                this.o = tg0Var;
                editText.addTextChangedListener(tg0Var);
                if (fg0.b == null) {
                    synchronized (fg0.a) {
                        try {
                            if (fg0.b == null) {
                                fg0 fg0Var = new fg0();
                                try {
                                    fg0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, fg0.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                fg0.b = fg0Var;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(fg0.b);
                return;
            default:
                this.n = editText;
                this.o = new ar0(editText);
                return;
        }
    }

    public oj1 A() {
        return (oj1) ((lz1) this.o).getValue();
    }

    public void B(AttributeSet attributeSet, int i) {
        switch (this.m) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.n;
                mh z = mh.z(absSeekBar.getContext(), attributeSet, p, i);
                Drawable r = z.r(0);
                if (r != null) {
                    if (r instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) r;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable J = J(animationDrawable.getFrame(i2), true);
                            J.setLevel(10000);
                            animationDrawable2.addFrame(J, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        r = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(r);
                }
                Drawable r2 = z.r(1);
                if (r2 != null) {
                    absSeekBar.setProgressDrawable(J(r2, false));
                }
                z.B();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.n).getContext().obtainStyledAttributes(attributeSet, b62.i, i, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    H(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void C() {
        String str = (String) this.n;
        if (((FileChannel) this.o) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.o = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.o;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.o = null;
            throw new IllegalStateException(q40.m("Unable to lock file: '", str, "'."), th);
        }
    }

    public hg0 D(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ar0 ar0Var = (ar0) this.o;
        if (inputConnection == null) {
            ar0Var.getClass();
            inputConnection2 = null;
        } else {
            t21 t21Var = (t21) ar0Var.n;
            t21Var.getClass();
            if (!(inputConnection instanceof hg0)) {
                inputConnection = new hg0(editorInfo, inputConnection, (EditText) t21Var.n);
            }
            inputConnection2 = inputConnection;
        }
        return (hg0) inputConnection2;
    }

    public void E(i3 i3Var) {
        js0 js0Var = (js0) this.n;
        ((ActionMode.Callback) js0Var.n).onDestroyActionMode(js0Var.r(i3Var));
        qf qfVar = (qf) this.o;
        if (qfVar.H != null) {
            qfVar.x.getDecorView().removeCallbacks(qfVar.I);
        }
        if (qfVar.G != null) {
            w53 w53Var = qfVar.J;
            if (w53Var != null) {
                w53Var.b();
            }
            w53 a = e53.a(qfVar.G);
            a.a(0.0f);
            qfVar.J = a;
            a.d(new gf(2, this));
        }
        qfVar.F = null;
        ViewGroup viewGroup = qfVar.M;
        WeakHashMap weakHashMap = e53.a;
        viewGroup.requestApplyInsets();
        qfVar.L();
    }

    public boolean F(i3 i3Var, Menu menu) {
        ViewGroup viewGroup = ((qf) this.o).M;
        WeakHashMap weakHashMap = e53.a;
        viewGroup.requestApplyInsets();
        js0 js0Var = (js0) this.n;
        ActionMode.Callback callback = (ActionMode.Callback) js0Var.n;
        tq2 r = js0Var.r(i3Var);
        fl2 fl2Var = (fl2) js0Var.p;
        Menu menu2 = (Menu) fl2Var.get(menu);
        if (menu2 == null) {
            menu2 = new dl1((Context) js0Var.o, (fk1) menu);
            fl2Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r, menu2);
    }

    public void G(wp0 wp0Var) {
        e92 e92Var = (e92) this.o;
        ot2 ot2Var = (ot2) this.n;
        int i = wp0Var.b;
        if (i != 0) {
            e92Var.execute(new xr(i, 0, ot2Var));
        } else {
            e92Var.execute(new iu0(6, ot2Var, wp0Var.a));
        }
    }

    public void H(boolean z) {
        tg0 tg0Var = (tg0) ((t21) ((ar0) this.o).n).o;
        if (tg0Var.o != z) {
            if (tg0Var.n != null) {
                ag0 a = ag0.a();
                sg0 sg0Var = tg0Var.n;
                a.getClass();
                j8.o(sg0Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(sg0Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            tg0Var.o = z;
            if (z) {
                tg0.a(tg0Var.m, ag0.a().c());
            }
        }
    }

    public void I(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.o;
        cardView.p.set(i, i2, i3, i4);
        Rect rect = cardView.o;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public Drawable J(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.o) == null) {
                this.o = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = J(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void K() {
        synchronized (this) {
            ((AtomicInteger) this.n).decrementAndGet();
            if (((AtomicInteger) this.n).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.lg0
    public Object a() {
        return (i23) this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.oc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nc2 b(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        ib2 ib2Var = (ib2) this.o;
        if (!str.equals(":memory:")) {
            str = ib2Var.c.a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        dj0 dj0Var = new dj0(str, (ib2Var.a || ib2Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = dj0Var.a;
        reentrantLock.lock();
        t21 t21Var = dj0Var.b;
        if (t21Var != null) {
            try {
                t21Var.C();
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
                if (ib2Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                nc2 b = ((oc2) this.n).b(str);
                if (ib2Var.a) {
                    if (ib2Var.c.f == kb2.o) {
                        s03.l(b, "PRAGMA synchronous = NORMAL");
                    } else {
                        s03.l(b, "PRAGMA synchronous = FULL");
                    }
                    ib2.b(b);
                    ib2Var.d.d(b);
                } else {
                    try {
                        ib2Var.b = true;
                        ib2.a(ib2Var, b);
                        ib2Var.b = false;
                    } catch (Throwable th2) {
                        ib2Var.b = false;
                        throw th2;
                    }
                }
                if (t21Var != null && (fileChannel2 = (FileChannel) t21Var.o) != null) {
                    try {
                        fileChannel2.close();
                        t21Var.o = null;
                    } finally {
                    }
                }
                return b;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (t21Var != null && (fileChannel = (FileChannel) t21Var.o) != null) {
                try {
                    fileChannel.close();
                    t21Var.o = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    @Override // defpackage.jq2
    public void c(iq2 iq2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.o;
        linkedHashMap.clear();
        Iterator it = iq2Var.iterator();
        while (true) {
            wu0 wu0Var = (wu0) it;
            if (!wu0Var.hasNext()) {
                return;
            }
            Object b = ((kb1) this.n).b(wu0Var.next());
            Integer num = (Integer) linkedHashMap.get(b);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                wu0Var.remove();
            } else {
                linkedHashMap.put(b, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // defpackage.lg0
    public boolean d(CharSequence charSequence, int i, int i2, e13 e13Var) {
        if ((e13Var.c & 4) > 0) {
            return true;
        }
        if (((i23) this.n) == null) {
            this.n = new i23(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((u30) this.o).getClass();
        ((i23) this.n).setSpan(new f13(e13Var), i, i2, 33);
        return true;
    }

    public boolean e(long j) {
        Object obj;
        List list = (List) ((tt1) this.o).n;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (s22.a(((v22) obj).a, j)) {
                break;
            }
            i++;
        }
        v22 v22Var = (v22) obj;
        if (v22Var != null) {
            return v22Var.h;
        }
        return false;
    }

    public nv2 f(List list) {
        pf0 pf0Var;
        Exception e;
        pf0 pf0Var2;
        try {
            int size = list.size();
            int i = 0;
            pf0Var = null;
            while (i < size) {
                try {
                    pf0Var2 = (pf0) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    pf0Var2.a((qf0) this.o);
                    i++;
                    pf0Var = pf0Var2;
                } catch (Exception e3) {
                    e = e3;
                    pf0Var = pf0Var2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((qf0) this.o).a.c());
                    sb2.append(", composition=");
                    sb2.append(((qf0) this.o).c());
                    sb2.append(", selection=");
                    qf0 qf0Var = (qf0) this.o;
                    sb2.append((Object) jw2.g(th2.a(qf0Var.b, qf0Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    zv.z(list, sb, new a0(3, pf0Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            qf0 qf0Var2 = (qf0) this.o;
            qf0Var2.getClass();
            yd ydVar = new yd(qf0Var2.a.toString());
            qf0 qf0Var3 = (qf0) this.o;
            long a = th2.a(qf0Var3.b, qf0Var3.c);
            jw2 jw2Var = jw2.f(((nv2) this.n).b) ? null : new jw2(a);
            nv2 nv2Var = new nv2(ydVar, jw2Var != null ? jw2Var.a : th2.a(jw2.d(a), jw2.e(a)), ((qf0) this.o).c());
            this.n = nv2Var;
            return nv2Var;
        } catch (Exception e4) {
            pf0Var = null;
            e = e4;
        }
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.o).get()) {
                return false;
            }
            ((AtomicInteger) this.n).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.w52
    public Object get() {
        return new jl1((Context) ((j31) this.n).m, (mh) ((ar0) this.o).get());
    }

    public void h(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.jq2
    public boolean i(Object obj, Object obj2) {
        kb1 kb1Var = (kb1) this.n;
        return Intrinsics.b(kb1Var.b(obj), kb1Var.b(obj2));
    }

    public void j(boolean z) {
        as0 as0Var = (as0) this.o;
        kr0 kr0Var = as0Var.t.n;
        fr0 fr0Var = as0Var.v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void k(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void l(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void m(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void o(boolean z) {
        as0 as0Var = (as0) this.o;
        kr0 kr0Var = as0Var.t.n;
        fr0 fr0Var = as0Var.v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.hs
    public void onCancel() {
        ((Animator) this.n).end();
        if (as0.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((bo2) this.o) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case 11:
                return ((Map) this.n).toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(boolean z) {
        fr0 fr0Var = ((as0) this.o).v;
        if (fr0Var != null) {
            fr0Var.getParentFragmentManager().l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b71.o();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public mt1 w(v03 v03Var) {
        ar0 ar0Var;
        Type type = v03Var.b;
        Class cls = v03Var.a;
        Map map = (Map) this.n;
        mt1 mt1Var = null;
        if (map.get(type) != null) {
            b71.o();
            return null;
        }
        if (map.get(cls) != null) {
            b71.o();
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                ((e82) this.o).a(declaredConstructor);
            }
            ar0Var = new ar0(16, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            ar0Var = null;
        }
        if (ar0Var != null) {
            return ar0Var;
        }
        int i = 17;
        if (Collection.class.isAssignableFrom(cls)) {
            mt1Var = SortedSet.class.isAssignableFrom(cls) ? new nj(21) : EnumSet.class.isAssignableFrom(cls) ? new ar0(i, type) : Set.class.isAssignableFrom(cls) ? new nj(22) : Queue.class.isAssignableFrom(cls) ? new nj(23) : new nj(24);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                mt1Var = new nj(25);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                mt1Var = new nj(i);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                mt1Var = new nj(18);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    type2.getClass();
                    Type n = j8.n(type2);
                    Class I = j8.I(n);
                    n.hashCode();
                    if (!String.class.isAssignableFrom(I)) {
                        mt1Var = new nj(19);
                    }
                }
                mt1Var = new nj(20);
            }
        }
        return mt1Var != null ? mt1Var : new mh(cls, type);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory x(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.o) == null) {
            Context context = (Context) this.n;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.o = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.o = map;
        }
        String str4 = (String) ((Map) this.o).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public InputMethodManager y() {
        return (InputMethodManager) ((y91) this.o).getValue();
    }

    public KeyListener z(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((t21) ((ar0) this.o).n).getClass();
        if (keyListener instanceof kg0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new kg0(keyListener);
    }

    public /* synthetic */ t21(int i, Object obj) {
        this.m = i;
        this.n = obj;
        this.o = null;
    }

    public /* synthetic */ t21(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    public t21(u93 u93Var, by1 by1Var) {
        this.m = 2;
        this.o = "ClientTelemetry.API";
        this.n = u93Var;
    }

    public t21(i91 i91Var, oj1 oj1Var) {
        this.m = 21;
        this.n = i91Var;
        this.o = ij2.j(oj1Var);
    }

    public t21(String str) {
        this.m = 17;
        this.n = str.concat(".lck");
    }

    public t21(j7 j7Var) {
        this.m = 10;
        this.n = new AtomicInteger(0);
        this.o = new AtomicBoolean(false);
    }

    public t21(AbsSeekBar absSeekBar) {
        this.m = 1;
        this.n = absSeekBar;
    }

    public /* synthetic */ t21(int i) {
        this.m = i;
    }

    public t21(as0 as0Var) {
        this.m = 19;
        this.n = new CopyOnWriteArrayList();
        this.o = as0Var;
    }

    public t21(Map map) {
        this.m = 11;
        this.o = e82.a;
        this.n = map;
    }

    public t21(ib2 ib2Var, oc2 oc2Var) {
        this.m = 6;
        oc2Var.getClass();
        this.o = ib2Var;
        this.n = oc2Var;
    }

    public t21(View view) {
        this.m = 0;
        this.n = view;
        this.o = ya1.a(kc1.m, new u(13, this));
    }

    public t21(kb1 kb1Var) {
        this.m = 23;
        this.n = kb1Var;
        this.o = new LinkedHashMap();
    }

    public t21(Animator animator) {
        this.m = 18;
        this.n = null;
        this.o = animator;
    }

    public t21(CardView cardView) {
        this.m = 9;
        this.o = cardView;
    }

    public t21() {
        this.m = 29;
        this.n = new tn1();
        this.o = new tn1();
    }

    public t21(qf qfVar, js0 js0Var) {
        this.m = 3;
        this.o = qfVar;
        this.n = js0Var;
    }
}
