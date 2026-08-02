package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.manager.LifecycleLifecycle;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afr {
    public final Object a;
    public final Object b;

    public afr(EditText editText) {
        this.b = editText;
        ade adeVar = new ade(editText);
        this.a = adeVar;
        editText.addTextChangedListener(adeVar);
        editText.setEditableFactory(acz.a());
    }

    public static final bdv B(ImageDecoder.Source source, int i, int i2, bbl bblVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new bgx(i, i2, bblVar));
        if (gd$$ExternalSyntheticApiModelOutline0.m77m((Object) decodeDrawable)) {
            return new bjb(gd$$ExternalSyntheticApiModelOutline0.m62m((Object) decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }

    public static final boolean C(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List H(String str) {
        ?? r0 = this.b;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r02 = this.a;
        List list = (List) r02.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r02.put(str, arrayList);
        return arrayList;
    }

    public final byte[] A(int i) {
        return (byte[]) ((bek) this.a).a(i, byte[].class);
    }

    public final synchronized List D(Class cls) {
        return ((bgj) this.a).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final synchronized List E(Class cls) {
        ?? r0 = ((brn) this.b).a;
        brn brnVar = (brn) r0.get(cls);
        ?? r1 = brnVar == null ? 0 : brnVar.a;
        if (r1 != 0) {
            return r1;
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(((bgj) this.a).b(cls));
        if (((brn) r0.put(cls, new brn(unmodifiableList, (byte[]) null))) == null) {
            return unmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    public final synchronized void F(Class cls, Class cls2, bgf bgfVar) {
        ((bgj) this.a).d(cls, cls2, bgfVar);
        ((brn) this.b).m();
    }

    public final synchronized void G(Class cls, Class cls2, bgf bgfVar) {
        ((bgj) this.a).e(cls, cls2, bgfVar);
        ((brn) this.b).m();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [amd, java.lang.Object] */
    public final amd a() {
        return ((ldt) this.b).b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public final Object b(String str) {
        Object b;
        Object obj = this.b;
        try {
            lao laoVar = (lao) ((ldt) obj).d.get(str);
            if (laoVar != null && (b = laoVar.b()) != null) {
                return b;
            }
            return ((ldt) obj).a.get(str);
        } catch (ClassCastException unused) {
            ((ldt) obj).t(str);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void c(String str, amd amdVar) {
        ((ldt) this.b).c.put(str, amdVar);
    }

    public final void d(final Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new Choreographer.FrameCallback() { // from class: ace
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    public final void e(lp lpVar) {
        qy qyVar = (qy) this.b;
        mn mnVar = (mn) qyVar.get(lpVar);
        if (mnVar == null) {
            mnVar = mn.a();
            qyVar.put(lpVar, mnVar);
        }
        mnVar.b |= 1;
    }

    public final void f(long j, lp lpVar) {
        ((qq) this.a).g(j, lpVar);
    }

    public final void g() {
        ((qy) this.b).clear();
        ((qq) this.a).f();
    }

    public final void h(lp lpVar) {
        mn mnVar = (mn) ((qy) this.b).get(lpVar);
        if (mnVar == null) {
            return;
        }
        mnVar.b &= -2;
    }

    public final void i(lp lpVar) {
        qq qqVar = (qq) this.a;
        int b = qqVar.b();
        while (true) {
            b--;
            if (b < 0) {
                break;
            }
            if (lpVar == qqVar.e(b)) {
                Object[] objArr = qqVar.c;
                Object obj = objArr[b];
                Object obj2 = qr.a;
                if (obj != obj2) {
                    objArr[b] = obj2;
                    qqVar.a = true;
                }
            }
        }
        mn mnVar = (mn) ((qy) this.b).remove(lpVar);
        if (mnVar != null) {
            mn.b(mnVar);
        }
    }

    public final boolean j(lp lpVar) {
        mn mnVar = (mn) ((qy) this.b).get(lpVar);
        return (mnVar == null || (mnVar.b & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm] */
    public final View k(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int d = r0.d();
        int c = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View e = r0.e(i5);
            int b = r0.b(e);
            int a = r0.a(e);
            ml mlVar = (ml) this.a;
            mlVar.c(d, c, b, a);
            mlVar.b();
            mlVar.a(i3);
            if (mlVar.d()) {
                return e;
            }
            mlVar.b();
            mlVar.a(i4);
            int i6 = 1;
            if (true == mlVar.d()) {
                view = e;
            }
            if (i2 <= i) {
                i6 = -1;
            }
            i5 += i6;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mm] */
    public final boolean l(View view) {
        Object obj = this.a;
        ?? r4 = this.b;
        ml mlVar = (ml) obj;
        mlVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        mlVar.b();
        mlVar.a(24579);
        return mlVar.d();
    }

    public final xp m(lp lpVar, int i) {
        mn mnVar;
        xp xpVar;
        qy qyVar = (qy) this.b;
        int b = qyVar.b(lpVar);
        if (b >= 0 && (mnVar = (mn) qyVar.f(b)) != null) {
            int i2 = mnVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                mnVar.b = i3;
                if (i == 4) {
                    xpVar = mnVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    xpVar = mnVar.d;
                }
                if ((i3 & 12) == 0) {
                    qyVar.d(b);
                    mn.b(mnVar);
                }
                return xpVar;
            }
        }
        return null;
    }

    public final void n(lp lpVar, xp xpVar) {
        qy qyVar = (qy) this.b;
        mn mnVar = (mn) qyVar.get(lpVar);
        if (mnVar == null) {
            mnVar = mn.a();
            qyVar.put(lpVar, mnVar);
        }
        mnVar.d = xpVar;
        mnVar.b |= 8;
    }

    public final void o(lp lpVar, xp xpVar) {
        qy qyVar = (qy) this.b;
        mn mnVar = (mn) qyVar.get(lpVar);
        if (mnVar == null) {
            mnVar = mn.a();
            qyVar.put(lpVar, mnVar);
        }
        mnVar.c = xpVar;
        mnVar.b |= 4;
    }

    public final void p() {
        ((SparseIntArray) this.b).clear();
    }

    public final void q() {
        ((SparseIntArray) this.a).clear();
    }

    public final void r(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((TextView) this.b).getContext().obtainStyledAttributes(attributeSet, em.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            Object obj = this.a;
            acv acvVar = acv.a;
            ((add) ((brn) obj).a).a.a = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List s(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<iyi> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (iyi iyiVar : list) {
                    if (iyiVar.A(cls, cls2)) {
                        arrayList.add(iyiVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List t(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<iyi> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (iyi iyiVar : list) {
                    if (iyiVar.A(cls, cls2)) {
                        Object obj = iyiVar.c;
                        if (!arrayList.contains(obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void u(String str, bbn bbnVar, Class cls, Class cls2) {
        H(str).add(new iyi(cls, cls2, bbnVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void v(List list) {
        ?? r1 = this.b;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    public final synchronized void w(bbn bbnVar, Class cls, Class cls2) {
        H("legacy_prepend_all").add(0, new iyi(cls, cls2, bbnVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [bki, java.lang.Object] */
    public final bah x(Context context, azj azjVar, ael aelVar, boolean z) {
        bmi.f();
        bmi.f();
        ?? r0 = this.a;
        bah bahVar = (bah) r0.get(aelVar);
        if (bahVar != null) {
            return bahVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(aelVar);
        bah a = this.b.a(azjVar, lifecycleLifecycle, new bkf(), context);
        r0.put(aelVar, a);
        lifecycleLifecycle.a(new bke(this, aelVar));
        if (!z) {
            return a;
        }
        a.h();
        return a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bed, java.lang.Object] */
    public final void y(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void z(byte[] bArr) {
        ((bek) this.a).c(bArr);
    }

    public afr(bed bedVar, bek bekVar) {
        this.b = bedVar;
        this.a = bekVar;
    }

    public afr(Class cls, bax baxVar) {
        this.a = cls;
        this.b = baxVar;
    }

    public afr(String str, krt krtVar) {
        this.b = str;
        this.a = new ajq(krtVar, 3);
    }

    public afr(List list, bek bekVar) {
        this.a = list;
        this.b = bekVar;
    }

    public afr(mm mmVar) {
        this.b = mmVar;
        this.a = new ml();
    }

    public afr(bki bkiVar) {
        this.a = new HashMap();
        this.b = bkiVar;
    }

    public afr(wq wqVar) {
        bgj bgjVar = new bgj(wqVar);
        this.b = new brn((char[]) null, (byte[]) null);
        this.a = bgjVar;
    }

    public afr(byte[] bArr, byte[] bArr2) {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public afr(byte[] bArr, char[] cArr) {
        this.a = new AtomicReference();
        this.b = new qi();
    }

    public afr(char[] cArr) {
        this.b = new qy(0);
        this.a = new qq(null);
    }

    public afr(byte[] bArr) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public afr(short[] sArr) {
        this.b = new ArrayList();
        this.a = new HashMap();
    }

    public afr(TextView textView) {
        this.b = textView;
        this.a = new brn(textView);
    }

    public afr() {
        this.a = new LinkedHashMap();
        this.b = new ldt(kpl.a);
    }

    public afr(Map map) {
        this.a = new LinkedHashMap();
        this.b = new ldt(map);
    }
}
