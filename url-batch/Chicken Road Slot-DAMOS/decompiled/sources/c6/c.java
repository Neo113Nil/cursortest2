package c6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.b0;
import androidx.lifecycle.i0;
import androidx.work.impl.WorkDatabase_Impl;
import c4.a0;
import c4.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import d2.h0;
import d2.t0;
import f8.e0;
import f8.f0;
import f8.m0;
import f8.y;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k1.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s7.c0;
import s7.k1;
import t5.t;
import te.l1;
import te.s0;
import z4.w;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a1.r, c4.q, t0, y, m6.b, b7.i, l1, t, w7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1808d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1809e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1810i;

    public c(int i3) {
        this.f1808d = i3;
        switch (i3) {
            case 13:
                this.f1809e = new b0();
                this.f1810i = new e6.j();
                g(t.f9320q);
                break;
            default:
                this.f1809e = Collections.synchronizedMap(new WeakHashMap());
                this.f1810i = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    @Override // d2.t0
    public void a(View view, float[] fArr) {
        v.o(fArr);
        j(view, fArr);
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        int i3;
        n7.e eVar = (n7.e) this.f1809e;
        n7.b bVar = (n7.b) obj;
        n7.d dVar = new n7.d(eVar, (w7.g) obj2);
        Context context = eVar.f328a;
        try {
            i3 = i7.b.a(context).e(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i3 = 0;
        }
        y6.b bVar2 = (y6.b) this.f1810i;
        bVar2.f10630t = i3;
        n7.c cVar = (n7.c) bVar.m();
        a7.g gVar = new a7.g(-1, -1, 0, true);
        Parcelable.Creator<a7.f> creator = a7.f.CREATOR;
        a7.f fVar = new a7.f(gVar, false);
        fVar.f320i = false;
        boolean z10 = fVar.f320i;
        a7.f fVar2 = new a7.f(fVar.f318d, true);
        fVar2.f320i = z10;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i10 = n7.a.f7171a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        bVar2.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        fVar2.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f7172d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // a1.r
    public Object b(a1.c cVar, Object obj) {
        return ((Function2) this.f1809e).invoke(cVar, obj);
    }

    @Override // c4.q
    public boolean c(CharSequence charSequence, int i3, int i10, x xVar) {
        if ((xVar.f1797c & 4) > 0) {
            return true;
        }
        if (((a0) this.f1809e) == null) {
            this.f1809e = new a0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((u8.d) this.f1810i).getClass();
        ((a0) this.f1809e).setSpan(new c4.y(xVar), i3, i10, 33);
        return true;
    }

    @Override // f8.y
    public ListenableFuture call() {
        f0 f0Var = (f0) this.f1809e;
        int i3 = f0.f4140s;
        if (f0Var.compareAndSet(e0.f4132d, e0.f4134i)) {
            return ((y) this.f1810i).call();
        }
        m0 m0Var = m0.f4156v;
        return m0Var != null ? m0Var : new m0();
    }

    @Override // te.l1
    public pe.a d(ce.b bVar) {
        Object obj;
        obj = ((te.p) this.f1810i).get(a.a.D(bVar));
        obj.getClass();
        s0 s0Var = (s0) obj;
        Object obj2 = s0Var.f9437a.get();
        if (obj2 == null) {
            synchronized (s0Var) {
                obj2 = s0Var.f9437a.get();
                if (obj2 == null) {
                    obj2 = new te.j((pe.a) ((Function1) this.f1809e).invoke(bVar));
                    s0Var.f9437a = new SoftReference(obj2);
                }
            }
        }
        return ((te.j) obj2).f9390a;
    }

    public ArrayList e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1809e;
        z a9 = z.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.b();
        Cursor E = cf.c.E(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(E.getCount());
            while (E.moveToNext()) {
                arrayList.add(E.isNull(0) ? null : E.getString(0));
            }
            return arrayList;
        } finally {
            E.close();
            a9.d();
        }
    }

    @Override // w7.a
    public Object f(Task task) {
        y6.c cVar = (y6.c) this.f1809e;
        Bundle bundle = (Bundle) this.f1810i;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : cVar.b(bundle).k(d6.n.f3648i, c0.F);
    }

    public void g(f fVar) {
        boolean z10;
        b0 b0Var = (b0) this.f1809e;
        synchronized (b0Var.f666a) {
            z10 = b0Var.f669d == b0.f665i;
            b0Var.f669d = fVar;
        }
        if (z10) {
            n.b Q = n.b.Q();
            androidx.lifecycle.z zVar = b0Var.f672h;
            n.d dVar = Q.f6634a;
            if (dVar.f6638c == null) {
                synchronized (dVar.f6636a) {
                    try {
                        if (dVar.f6638c == null) {
                            dVar.f6638c = n.d.Q(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            dVar.f6638c.post(zVar);
        }
        if (fVar instanceof t5.s) {
            ((e6.j) this.f1810i).i((t5.s) fVar);
        } else if (fVar instanceof t5.q) {
            ((e6.j) this.f1810i).j(((t5.q) fVar).f9318a);
        }
    }

    @Override // gd.a
    public Object get() {
        return new l6.d((Context) ((f2.a) this.f1809e).f4064d, (a1.n) ((l.d) this.f1810i).get());
    }

    @Override // c4.q
    public Object getResult() {
        return (a0) this.f1809e;
    }

    public AutofillId h(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession j3 = i0.j(this.f1809e);
        f2.a s3 = w.s((View) this.f1810i);
        Objects.requireNonNull(s3);
        return e3.l.b(j3, f1.b.g(s3.f4064d), j);
    }

    public void i(int i3, int i10, int i11, int i12) {
        r.a aVar = (r.a) this.f1810i;
        aVar.f8069r.set(i3, i10, i11, i12);
        Rect rect = aVar.f8068i;
        super/*android.view.View*/.setPadding(i3 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    public void j(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f1809e;
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, fArr);
            v.o(fArr2);
            v.v(fArr2, -view.getScrollX(), -view.getScrollY());
            h0.r(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            v.o(fArr2);
            v.v(fArr2, left, top);
            h0.r(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f1810i;
            view.getLocationInWindow(iArr);
            v.o(fArr2);
            v.v(fArr2, -view.getScrollX(), -view.getScrollY());
            h0.r(fArr, fArr2);
            float f3 = iArr[0];
            float f10 = iArr[1];
            v.o(fArr2);
            v.v(fArr2, f3, f10);
            h0.r(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        v.p(fArr2, matrix);
        h0.r(fArr, fArr2);
    }

    public void k(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.f1809e;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.f1810i;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                kotlin.collections.i0.j();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((w7.g) entry2.getKey()).b(new a7.e(status));
            }
        }
    }

    public String toString() {
        switch (this.f1808d) {
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((y) this.f1810i).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.f1808d = i3;
        this.f1809e = obj;
        this.f1810i = obj2;
    }

    public c(k1 k1Var, String str) {
        this.f1808d = 11;
        this.f1809e = str;
        this.f1810i = k1Var;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f1808d = 0;
        this.f1809e = workDatabase_Impl;
        this.f1810i = new b(workDatabase_Impl, 0);
    }

    public c(Function1 function1) {
        this.f1808d = 12;
        this.f1809e = function1;
        this.f1810i = new te.p();
    }

    public c(r.a aVar) {
        this.f1808d = 10;
        this.f1810i = aVar;
    }

    public c(float[] fArr) {
        this.f1808d = 4;
        this.f1809e = fArr;
        this.f1810i = new int[2];
    }
}
