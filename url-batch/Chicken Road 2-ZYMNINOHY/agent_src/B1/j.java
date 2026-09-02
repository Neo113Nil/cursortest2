package B1;

import C3.v;
import E.AbstractC0003d;
import E.AbstractC0012m;
import E1.P;
import L1.r;
import N3.A;
import R1.o;
import T.C0096n;
import T.C0097o;
import W.G;
import W.J;
import W.u;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0140f;
import a0.C0141g;
import a0.C0144j;
import a0.ExecutorC0129E;
import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.H;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.recyclerview.widget.RecyclerView;
import b3.InterfaceC0264a;
import c0.y;
import com.google.android.gms.internal.play_billing.C0333m;
import e0.t;
import e1.C0400d;
import f1.E;
import f1.z;
import g.AbstractC0432a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.impl.Zo;
import io.flutter.Build;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import k.q0;
import l1.AbstractC1254a;
import m1.C1307e;
import org.xmlpull.v1.XmlPullParserException;
import q0.U;
import q0.k0;
import t.AbstractC1419g;
import t.AbstractC1420h;
import t.C1417e;
import t.C1418f;
import v2.I;
import w.AbstractC1485e;
import w.InterfaceC1481a;
import x.AbstractC1516e;
import y0.F;
import y0.p;
import y0.q;
import z2.EnumC1582a;

/* loaded from: classes.dex */
public final class j implements N1.b, V0.d, z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public Object f201b;

    /* renamed from: c, reason: collision with root package name */
    public Object f202c;

    /* renamed from: d, reason: collision with root package name */
    public Object f203d;

    public j(int i4) {
        this.f200a = i4;
        switch (i4) {
            case C0583e9.f11744D /* 20 */:
                j0.j jVar = j0.j.f13763a;
                this.f201b = new HashSet();
                this.f202c = jVar;
                break;
            default:
                this.f202c = new ArrayDeque();
                this.f203d = null;
                this.f201b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
        }
    }

    public static j v(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public void A(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f201b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f203d) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void B(I1.a aVar) {
        D0.d dVar = new D0.d(5);
        r rVar = (r) this.f203d;
        L1.j jVar = (L1.j) this.f201b;
        I1.b bVar = (I1.b) this.f202c;
        Q1.d dVar2 = rVar.f1664c;
        j a3 = L1.j.a();
        a3.D(jVar.f1645a);
        a3.f203d = I1.c.f1126a;
        a3.f202c = jVar.f1646b;
        L1.j h2 = a3.h();
        L1.h hVar = new L1.h();
        hVar.f1638f = new HashMap();
        hVar.f1636d = Long.valueOf(rVar.f1662a.q());
        hVar.f1637e = Long.valueOf(rVar.f1663b.q());
        hVar.f1633a = "PLAY_BILLING_LIBRARY";
        hVar.f1635c = new L1.n(bVar, aVar.f1124a.a());
        hVar.f1634b = null;
        Q1.c cVar = (Q1.c) dVar2;
        cVar.f2266b.execute(new Q1.a(cVar, h2, dVar, hVar.d()));
    }

    public void C(int i4) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f203d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f203d = null;
        }
        create = LoudnessCodecController.create(i4, EnumC1582a.f16288a, new j0.i(this));
        this.f203d = create;
        Iterator it = ((HashSet) this.f201b).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public void D(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f201b = str;
    }

    public void E() {
        synchronized (((HashMap) this.f201b)) {
            try {
                Iterator it = ((HashMap) this.f201b).values().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f201b).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f203d)) {
            try {
                Iterator it2 = ((HashMap) this.f203d).values().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f203d).clear();
            } finally {
            }
        }
        synchronized (((HashMap) this.f202c)) {
            try {
                Iterator it3 = ((HashMap) this.f202c).values().iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                }
                ((HashMap) this.f202c).clear();
            } finally {
            }
        }
    }

    @Override // f1.z
    public void a(u uVar) {
        long d4;
        long j4;
        ((G) this.f202c).getClass();
        String str = J.f3263a;
        G g4 = (G) this.f202c;
        synchronized (g4) {
            try {
                long j5 = g4.f3260c;
                d4 = j5 != -9223372036854775807L ? j5 + g4.f3259b : g4.d();
            } finally {
            }
        }
        G g5 = (G) this.f202c;
        synchronized (g5) {
            j4 = g5.f3259b;
        }
        if (d4 == -9223372036854775807L || j4 == -9223372036854775807L) {
            return;
        }
        C0097o c0097o = (C0097o) this.f201b;
        if (j4 != c0097o.f2872s) {
            C0096n a3 = c0097o.a();
            a3.f2834r = j4;
            C0097o c0097o2 = new C0097o(a3);
            this.f201b = c0097o2;
            ((F) this.f203d).d(c0097o2);
        }
        int a4 = uVar.a();
        ((F) this.f203d).a(a4, uVar);
        ((F) this.f203d).e(d4, 1, a4, 0, null);
    }

    @Override // V0.d
    public int b(long j4) {
        long[] jArr = (long[]) this.f203d;
        int b4 = J.b(jArr, j4, false);
        if (b4 < jArr.length) {
            return b4;
        }
        return -1;
    }

    @Override // V0.d
    public long c(int i4) {
        long[] jArr = (long[]) this.f203d;
        AbstractC0124a.h(i4 >= 0);
        AbstractC0124a.h(i4 < jArr.length);
        return jArr[i4];
    }

    @Override // f1.z
    public void d(G g4, p pVar, E e4) {
        this.f202c = g4;
        e4.a();
        e4.c();
        F z = pVar.z(e4.f8529c, 5);
        this.f203d = z;
        z.d((C0097o) this.f201b);
    }

    @Override // V0.d
    public List e(long j4) {
        List list = (List) this.f201b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            long[] jArr = (long[]) this.f202c;
            int i5 = i4 * 2;
            if (jArr[i5] <= j4 && j4 < jArr[i5 + 1]) {
                C0400d c0400d = (C0400d) list.get(i4);
                V.b bVar = c0400d.f8437a;
                if (bVar.f3151e == -3.4028235E38f) {
                    arrayList2.add(c0400d);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new B.c(4));
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            V.b bVar2 = ((C0400d) arrayList2.get(i6)).f8437a;
            arrayList.add(new V.b(bVar2.f3147a, bVar2.f3148b, bVar2.f3149c, bVar2.f3150d, (-1) - i6, 1, bVar2.f3153g, bVar2.f3154h, bVar2.f3155i, bVar2.n, bVar2.o, bVar2.f3156j, bVar2.f3157k, bVar2.f3158l, bVar2.f3159m, bVar2.f3160p, bVar2.f3161q, bVar2.f3162r));
        }
        return arrayList;
    }

    @Override // V0.d
    public int f() {
        return ((long[]) this.f203d).length;
    }

    public void g() {
        P2.a aVar = (P2.a) ((ArrayDeque) this.f202c).poll();
        this.f203d = aVar;
        if (aVar != null) {
            aVar.executeOnExecutor((ThreadPoolExecutor) this.f201b, new Object[0]);
        }
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        switch (this.f200a) {
            case 6:
                return new r(new a2.i(25), new a2.i(24), (Q1.d) ((G3.u) this.f201b).get(), (R1.m) ((q0) this.f202c).get(), (o) ((G1.c) this.f203d).get());
            default:
                return new R1.d((Context) ((InterfaceC0264a) this.f201b).get(), (S1.d) ((InterfaceC0264a) this.f202c).get(), (R1.b) ((a2.i) this.f203d).get());
        }
    }

    public L1.j h() {
        String str = ((String) this.f201b) == null ? " backendName" : "";
        if (((I1.c) this.f203d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new L1.j((String) this.f201b, (byte[]) this.f202c, (I1.c) this.f203d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String i(String str, long j4, int i4, long j5) {
        ArrayList arrayList = (ArrayList) this.f201b;
        ArrayList arrayList2 = (ArrayList) this.f203d;
        ArrayList arrayList3 = (ArrayList) this.f202c;
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            sb.append((String) arrayList.get(i5));
            if (((Integer) arrayList3.get(i5)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList3.get(i5)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i5), Long.valueOf(j4)));
            } else if (((Integer) arrayList3.get(i5)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i5), Integer.valueOf(i4)));
            } else if (((Integer) arrayList3.get(i5)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList2.get(i5), Long.valueOf(j5)));
            }
        }
        sb.append((String) arrayList.get(arrayList3.size()));
        return sb.toString();
    }

    public void j(O1.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f201b;
        D2.e eVar = new D2.e(byteArrayOutputStream, hashMap, (HashMap) this.f202c, (A2.d) this.f203d);
        A2.d dVar = (A2.d) hashMap.get(O1.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new A2.b("No encoder for " + O1.a.class);
        }
    }

    public int k(int i4, int i5) {
        ArrayList arrayList = (ArrayList) this.f203d;
        int size = arrayList.size();
        while (i5 < size) {
            ((AbstractC1254a) arrayList.get(i5)).getClass();
            i5++;
        }
        return i4;
    }

    public androidx.lifecycle.J l(Class cls, String key) {
        androidx.lifecycle.J viewModel;
        M m4 = (M) this.f202c;
        kotlin.jvm.internal.i.e(key, "key");
        O o = (O) this.f201b;
        o.getClass();
        LinkedHashMap linkedHashMap = o.f5037a;
        androidx.lifecycle.J j4 = (androidx.lifecycle.J) linkedHashMap.get(key);
        if (!cls.isInstance(j4)) {
            R.c cVar = new R.c((R.b) this.f203d);
            cVar.f2272a.put(K.f5033b, key);
            try {
                viewModel = m4.b(cls, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = m4.a(cls);
            }
            kotlin.jvm.internal.i.e(viewModel, "viewModel");
            androidx.lifecycle.J j5 = (androidx.lifecycle.J) linkedHashMap.put(key, viewModel);
            if (j5 != null) {
                j5.b();
            }
            return viewModel;
        }
        H h2 = m4 instanceof H ? (H) m4 : null;
        if (h2 != null) {
            kotlin.jvm.internal.i.b(j4);
            AbstractC0231j abstractC0231j = h2.f5025d;
            if (abstractC0231j != null) {
                C1307e c1307e = h2.f5026e;
                kotlin.jvm.internal.i.b(c1307e);
                androidx.lifecycle.E.a(j4, c1307e, abstractC0231j);
            }
        }
        kotlin.jvm.internal.i.c(j4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return j4;
    }

    public ColorStateList m(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f202c;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            Context context = (Context) this.f201b;
            Object obj = AbstractC0432a.f8818a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i4);
    }

    public long n() {
        y0.k kVar = (y0.k) this.f203d;
        if (kVar != null) {
            return kVar.f16169d;
        }
        return -1L;
    }

    public Drawable o(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f202c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : AbstractC0432a.a((Context) this.f201b, resourceId);
    }

    public Typeface p(int i4, int i5, A a3) {
        A a4;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f202c).getResourceId(i4, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f203d) == null) {
                this.f203d = new TypedValue();
            }
            Context context = (Context) this.f201b;
            TypedValue typedValue = (TypedValue) this.f203d;
            Object obj = AbstractC1485e.f15736a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    a3.d();
                    return null;
                }
                int i6 = typedValue.assetCookie;
                p.i iVar = AbstractC1516e.f15960b;
                Typeface typeface = (Typeface) iVar.a(AbstractC1516e.b(resources, resourceId, charSequence2, i6, i5));
                int i7 = 13;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new g0.p(a3, i7, typeface));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        a4 = a3;
                        try {
                            int i8 = typedValue.assetCookie;
                            Typeface m4 = AbstractC1516e.f15959a.m(context, resources, resourceId, charSequence2, i5);
                            if (m4 != null) {
                                iVar.b(AbstractC1516e.b(resources, resourceId, charSequence2, i8, i5), m4);
                            }
                            if (m4 != null) {
                                new Handler(Looper.getMainLooper()).post(new g0.p(a4, i7, m4));
                            } else {
                                a4.d();
                            }
                            return m4;
                        } catch (IOException e4) {
                            e = e4;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            a4.d();
                            return null;
                        } catch (XmlPullParserException e5) {
                            e = e5;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            a4.d();
                            return null;
                        }
                    }
                    InterfaceC1481a t4 = U.i.t(resources.getXml(resourceId), resources);
                    if (t4 != null) {
                        try {
                            return AbstractC1516e.a(context, t4, resources, resourceId, charSequence2, typedValue.assetCookie, i5, a3);
                        } catch (IOException e6) {
                            e = e6;
                            a4 = a3;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            a4.d();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            a4 = a3;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            a4.d();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        a3.d();
                        return null;
                    } catch (IOException e8) {
                        iOException = e8;
                        a4 = a3;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        a4.d();
                        return null;
                    } catch (XmlPullParserException e9) {
                        xmlPullParserException = e9;
                        a4 = a3;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        a4.d();
                        return null;
                    }
                } catch (IOException e10) {
                    e = e10;
                    a4 = a3;
                } catch (XmlPullParserException e11) {
                    e = e11;
                    a4 = a3;
                }
            }
        }
        return null;
    }

    public View q(int i4) {
        return ((RecyclerView) ((t) this.f201b).f8416a).getChildAt(i4);
    }

    public int r() {
        return ((RecyclerView) ((t) this.f201b).f8416a).getChildCount();
    }

    public boolean s() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f202c;
        if (((String) this.f203d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f203d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.f201b).readLine();
                this.f203d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f203d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.f16169d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.f16169d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(Y.h hVar, Uri uri, Map map, long j4, long j5, U u4) {
        y0.k kVar = new y0.k(hVar, j4, j5);
        this.f203d = kVar;
        if (((y0.n) this.f202c) != null) {
            return;
        }
        y0.n[] c4 = ((q) this.f201b).c(uri, map);
        int length = c4.length;
        v2.G g4 = I.f15571b;
        v2.r.d(length, "expectedSize");
        v2.F f4 = new v2.F(length);
        boolean z = true;
        if (c4.length == 1) {
            this.f202c = c4[0];
        } else {
            int length2 = c4.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                y0.n nVar = c4[i4];
                try {
                } catch (EOFException unused) {
                    if (((y0.n) this.f202c) == null) {
                    }
                } catch (Throwable th) {
                    if (((y0.n) this.f202c) == null && kVar.f16169d != j4) {
                        z = false;
                    }
                    AbstractC0124a.t(z);
                    kVar.f16171f = 0;
                    throw th;
                }
                if (nVar.b(kVar)) {
                    this.f202c = nVar;
                    kVar.f16171f = 0;
                    break;
                }
                f4.c(nVar.d());
                if (((y0.n) this.f202c) == null) {
                }
                boolean z4 = true;
                AbstractC0124a.t(z4);
                kVar.f16171f = 0;
                i4++;
            }
            if (((y0.n) this.f202c) == null) {
                String str = "None of the available extractors (" + new v(", ").c(v2.r.u(I.l(c4), new Zo(7))) + ") could read the stream.";
                uri.getClass();
                throw new k0(str, f4.f());
            }
        }
        ((y0.n) this.f202c).e(u4);
    }

    public String toString() {
        switch (this.f200a) {
            case 14:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f201b);
                sb.append('{');
                C0333m c0333m = ((C0333m) this.f202c).f5978b;
                String str = "";
                while (c0333m != null) {
                    Object obj = c0333m.f5977a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c0333m = c0333m.f5978b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case Build.API_LEVELS.API_23 /* 23 */:
                return ((G0.c) this.f202c).toString() + ", hidden list:" + ((ArrayList) this.f203d).size();
            default:
                return super.toString();
        }
    }

    public String u() {
        if (!s()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f203d;
        this.f203d = null;
        return str;
    }

    public void w(Activity activity, y1.k kVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f203d;
        kotlin.jvm.internal.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f202c;
        reentrantLock.lock();
        try {
            if (kVar.equals((y1.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((n) ((t1.h) this.f201b).f15398b).f217b.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.f211a.equals(activity)) {
                    mVar.f213c = kVar;
                    mVar.f212b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void x() {
        ((TypedArray) this.f202c).recycle();
    }

    public void y(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1254a instance = (AbstractC1254a) arrayList.get(i4);
            instance.getClass();
            P p2 = (P) this.f201b;
            Object[] objArr = (Object[]) p2.f519c;
            kotlin.jvm.internal.i.e(instance, "instance");
            int i5 = p2.f518b;
            for (int i6 = 0; i6 < i5; i6++) {
                if (objArr[i6] == instance) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i7 = p2.f518b;
            if (i7 < objArr.length) {
                objArr[i7] = instance;
                p2.f518b = i7 + 1;
            }
        }
        arrayList.clear();
    }

    public void z(u0.a aVar) {
        b0.i iVar = (b0.i) ((HashMap) this.f201b).remove(aVar);
        iVar.getClass();
        C0140f c0140f = (C0140f) ((C0141g) this.f203d).f4136p.get(iVar);
        if (c0140f != null) {
            synchronized (c0140f) {
                c0140f.f4109d--;
            }
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i4) {
        this.f200a = i4;
        this.f201b = obj;
        this.f202c = obj2;
        this.f203d = obj3;
    }

    public j(C0144j c0144j, byte b4) {
        this.f200a = 24;
        this.f201b = new HashMap();
        this.f202c = new HashMap();
        this.f203d = new HashMap();
    }

    public j(String str, int i4) {
        this.f200a = i4;
        switch (i4) {
            case 18:
                C0096n c0096n = new C0096n();
                c0096n.f2830l = T.F.n("video/mp2t");
                c0096n.f2831m = T.F.n(str);
                this.f201b = new C0097o(c0096n);
                break;
            default:
                C0333m c0333m = new C0333m();
                this.f202c = c0333m;
                this.f203d = c0333m;
                this.f201b = str;
                break;
        }
    }

    public j(L1.j jVar, I1.b bVar, a2.i iVar, r rVar) {
        this.f200a = 5;
        this.f201b = jVar;
        this.f202c = bVar;
        this.f203d = rVar;
    }

    public j(ArrayList arrayList) {
        this.f200a = 17;
        this.f201b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f202c = new long[arrayList.size() * 2];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0400d c0400d = (C0400d) arrayList.get(i4);
            int i5 = i4 * 2;
            long[] jArr = (long[]) this.f202c;
            jArr[i5] = c0400d.f8438b;
            jArr[i5 + 1] = c0400d.f8439c;
        }
        long[] jArr2 = (long[]) this.f202c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f203d = copyOf;
        Arrays.sort(copyOf);
    }

    public j(O store, M m4, R.b defaultCreationExtras) {
        this.f200a = 11;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f201b = store;
        this.f202c = m4;
        this.f203d = defaultCreationExtras;
    }

    public j(t tVar) {
        this.f200a = 23;
        this.f201b = tVar;
        this.f202c = new G0.c();
        this.f203d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(O store, M m4) {
        this(store, m4, R.a.f2271b);
        this.f200a = 11;
        kotlin.jvm.internal.i.e(store, "store");
    }

    public j(q qVar) {
        this.f200a = 25;
        this.f201b = qVar;
    }

    public j(Context context, TypedArray typedArray) {
        this.f200a = 21;
        this.f201b = context;
        this.f202c = typedArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(C1418f c1418f) {
        ArrayList arrayList;
        Bundle bundle;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Notification notification;
        ArrayList arrayList6;
        int i5;
        char c4;
        Icon icon;
        Bundle bundle2;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i6;
        this.f200a = 26;
        new ArrayList();
        this.f203d = new Bundle();
        this.f202c = c1418f;
        Context context = c1418f.f15248a;
        ArrayList arrayList7 = c1418f.f15261p;
        ArrayList arrayList8 = c1418f.f15250c;
        ArrayList arrayList9 = c1418f.f15251d;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f201b = AbstractC0012m.a(context, c1418f.f15260m);
        } else {
            this.f201b = new Notification.Builder(c1418f.f15248a);
        }
        Notification notification2 = c1418f.o;
        int i7 = 0;
        ((Notification.Builder) this.f201b).setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c1418f.f15252e).setContentText(c1418f.f15253f).setContentInfo(null).setContentIntent(c1418f.f15254g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        ((Notification.Builder) this.f201b).setLargeIcon((Icon) null);
        ((Notification.Builder) this.f201b).setSubText(null).setUsesChronometer(false).setPriority(c1418f.f15255h);
        ArrayList arrayList10 = c1418f.f15249b;
        int size = arrayList10.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            C1417e c1417e = (C1417e) arrayList10.get(i8);
            int i10 = i7;
            int i11 = Build.VERSION.SDK_INT;
            if (c1417e.f15242b == null && (i6 = c1417e.f15245e) != 0) {
                c1417e.f15242b = IconCompat.a(i6);
            }
            IconCompat iconCompat = c1417e.f15242b;
            boolean z = c1417e.f15243c;
            Bundle bundle3 = c1417e.f15241a;
            if (iconCompat != null) {
                int i12 = iconCompat.f4508a;
                switch (i12) {
                    case -1:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i5 = size;
                        c4 = 2;
                        icon = (Icon) iconCompat.f4509b;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("Unknown type");
                    case 1:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i5 = size;
                        c4 = 2;
                        icon = Icon.createWithBitmap((Bitmap) iconCompat.f4509b);
                        colorStateList = iconCompat.f4514g;
                        if (colorStateList != null) {
                            icon.setTintList(colorStateList);
                        }
                        mode = iconCompat.f4515h;
                        if (mode != IconCompat.f4507k) {
                            icon.setTintMode(mode);
                            break;
                        }
                        break;
                    case 2:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i5 = size;
                        if (i12 == -1) {
                            Object obj = iconCompat.f4509b;
                            if (i11 >= 28) {
                                str = AbstractC0003d.e(obj);
                            } else {
                                try {
                                    str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                                } catch (IllegalAccessException e4) {
                                    Log.e("IconCompat", "Unable to get icon package", e4);
                                    str = null;
                                    c4 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f4512e);
                                    colorStateList = iconCompat.f4514g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f4515h;
                                    if (mode != IconCompat.f4507k) {
                                    }
                                    Notification.Action.Builder builder = new Notification.Action.Builder(icon, c1417e.f15246f, c1417e.f15247g);
                                    if (bundle3 == null) {
                                    }
                                    bundle2.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder.setAllowGeneratedReplies(z);
                                    bundle2.putInt("android.support.action.semanticAction", i10);
                                    if (i11 >= 28) {
                                    }
                                    if (i11 >= 29) {
                                    }
                                    if (i11 < 31) {
                                    }
                                    bundle2.putBoolean("android.support.action.showsUserInterface", c1417e.f15244d);
                                    builder.addExtras(bundle2);
                                    ((Notification.Builder) this.f201b).addAction(builder.build());
                                    i8 = i9;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i5;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    i7 = 0;
                                } catch (NoSuchMethodException e5) {
                                    Log.e("IconCompat", "Unable to get icon package", e5);
                                    str = null;
                                    c4 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f4512e);
                                    colorStateList = iconCompat.f4514g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f4515h;
                                    if (mode != IconCompat.f4507k) {
                                    }
                                    Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, c1417e.f15246f, c1417e.f15247g);
                                    if (bundle3 == null) {
                                    }
                                    bundle2.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder2.setAllowGeneratedReplies(z);
                                    bundle2.putInt("android.support.action.semanticAction", i10);
                                    if (i11 >= 28) {
                                    }
                                    if (i11 >= 29) {
                                    }
                                    if (i11 < 31) {
                                    }
                                    bundle2.putBoolean("android.support.action.showsUserInterface", c1417e.f15244d);
                                    builder2.addExtras(bundle2);
                                    ((Notification.Builder) this.f201b).addAction(builder2.build());
                                    i8 = i9;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i5;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    i7 = 0;
                                } catch (InvocationTargetException e6) {
                                    Log.e("IconCompat", "Unable to get icon package", e6);
                                    str = null;
                                    c4 = 2;
                                    icon = Icon.createWithResource(str, iconCompat.f4512e);
                                    colorStateList = iconCompat.f4514g;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.f4515h;
                                    if (mode != IconCompat.f4507k) {
                                    }
                                    Notification.Action.Builder builder22 = new Notification.Action.Builder(icon, c1417e.f15246f, c1417e.f15247g);
                                    if (bundle3 == null) {
                                    }
                                    bundle2.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder22.setAllowGeneratedReplies(z);
                                    bundle2.putInt("android.support.action.semanticAction", i10);
                                    if (i11 >= 28) {
                                    }
                                    if (i11 >= 29) {
                                    }
                                    if (i11 < 31) {
                                    }
                                    bundle2.putBoolean("android.support.action.showsUserInterface", c1417e.f15244d);
                                    builder22.addExtras(bundle2);
                                    ((Notification.Builder) this.f201b).addAction(builder22.build());
                                    i8 = i9;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i5;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    i7 = 0;
                                }
                            }
                            c4 = 2;
                        } else {
                            c4 = 2;
                            if (i12 == 2) {
                                String str2 = iconCompat.f4517j;
                                if (str2 != null && !TextUtils.isEmpty(str2)) {
                                    str = iconCompat.f4517j;
                                } else {
                                    str = ((String) iconCompat.f4509b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[i10];
                                }
                            } else {
                                throw new IllegalStateException("called getResPackage() on " + iconCompat);
                            }
                        }
                        icon = Icon.createWithResource(str, iconCompat.f4512e);
                        colorStateList = iconCompat.f4514g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f4515h;
                        if (mode != IconCompat.f4507k) {
                        }
                        break;
                    case 3:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i5 = size;
                        icon = Icon.createWithData((byte[]) iconCompat.f4509b, iconCompat.f4512e, iconCompat.f4513f);
                        c4 = 2;
                        colorStateList = iconCompat.f4514g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f4515h;
                        if (mode != IconCompat.f4507k) {
                        }
                        break;
                    case 4:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i5 = size;
                        icon = Icon.createWithContentUri((String) iconCompat.f4509b);
                        c4 = 2;
                        colorStateList = iconCompat.f4514g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f4515h;
                        if (mode != IconCompat.f4507k) {
                        }
                        break;
                    case 5:
                        if (i11 >= 26) {
                            icon = AbstractC0012m.b((Bitmap) iconCompat.f4509b);
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList8;
                            arrayList5 = arrayList9;
                            notification = notification2;
                            arrayList6 = arrayList10;
                            i5 = size;
                            c4 = 2;
                            colorStateList = iconCompat.f4514g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f4515h;
                            if (mode != IconCompat.f4507k) {
                            }
                        } else {
                            Bitmap bitmap = (Bitmap) iconCompat.f4509b;
                            arrayList4 = arrayList8;
                            int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                            arrayList6 = arrayList10;
                            Canvas canvas = new Canvas(createBitmap);
                            i5 = size;
                            Paint paint = new Paint(3);
                            float f4 = min * 0.5f;
                            arrayList5 = arrayList9;
                            paint.setColor(-16777216);
                            arrayList3 = arrayList7;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            notification = notification2;
                            matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f4, f4, f4 * 0.9166667f, paint);
                            canvas.setBitmap(null);
                            icon = Icon.createWithBitmap(createBitmap);
                            c4 = 2;
                            colorStateList = iconCompat.f4514g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f4515h;
                            if (mode != IconCompat.f4507k) {
                            }
                        }
                        break;
                    case 6:
                        if (i11 >= 30) {
                            icon = E.K.a(iconCompat.c());
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList8;
                            arrayList5 = arrayList9;
                            notification = notification2;
                            arrayList6 = arrayList10;
                            i5 = size;
                            c4 = 2;
                            colorStateList = iconCompat.f4514g;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.f4515h;
                            if (mode != IconCompat.f4507k) {
                            }
                        } else {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                        }
                        break;
                }
            } else {
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                arrayList5 = arrayList9;
                notification = notification2;
                arrayList6 = arrayList10;
                i5 = size;
                c4 = 2;
                icon = null;
            }
            Notification.Action.Builder builder222 = new Notification.Action.Builder(icon, c1417e.f15246f, c1417e.f15247g);
            if (bundle3 == null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder222.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i10);
            if (i11 >= 28) {
                AbstractC0003d.o(builder222);
            }
            if (i11 >= 29) {
                AbstractC1419g.c(builder222);
            }
            if (i11 < 31) {
                AbstractC1420h.a(builder222);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c1417e.f15244d);
            builder222.addExtras(bundle2);
            ((Notification.Builder) this.f201b).addAction(builder222.build());
            i8 = i9;
            arrayList8 = arrayList4;
            arrayList10 = arrayList6;
            size = i5;
            arrayList9 = arrayList5;
            arrayList7 = arrayList3;
            notification2 = notification;
            i7 = 0;
        }
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList8;
        ArrayList arrayList13 = arrayList9;
        Notification notification3 = notification2;
        Bundle bundle4 = c1418f.f15259l;
        if (bundle4 != null) {
            ((Bundle) this.f203d).putAll(bundle4);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f201b).setShowWhen(c1418f.f15256i);
        ((Notification.Builder) this.f201b).setLocalOnly(c1418f.f15258k);
        ((Notification.Builder) this.f201b).setGroup(null);
        ((Notification.Builder) this.f201b).setSortKey(null);
        ((Notification.Builder) this.f201b).setGroupSummary(false);
        ((Notification.Builder) this.f201b).setCategory(null);
        ((Notification.Builder) this.f201b).setColor(0);
        ((Notification.Builder) this.f201b).setVisibility(0);
        ((Notification.Builder) this.f201b).setPublicVersion(null);
        ((Notification.Builder) this.f201b).setSound(notification3.sound, notification3.audioAttributes);
        if (i13 < 28) {
            if (arrayList12 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList12.size());
                Iterator it = arrayList12.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList2 == null) {
                arrayList = arrayList11;
            } else {
                if (arrayList11 != null) {
                    p.f fVar = new p.f(arrayList11.size() + arrayList2.size());
                    fVar.addAll(arrayList2);
                    fVar.addAll(arrayList11);
                    arrayList2 = new ArrayList(fVar);
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = arrayList11;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList.get(i14);
                i14++;
                ((Notification.Builder) this.f201b).addPerson((String) obj2);
            }
        }
        if (arrayList13.size() > 0) {
            if (c1418f.f15259l == null) {
                c1418f.f15259l = new Bundle();
            }
            Bundle bundle5 = c1418f.f15259l.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList13.size()) {
                String num = Integer.toString(i15);
                ArrayList arrayList14 = arrayList13;
                C1417e c1417e2 = (C1417e) arrayList14.get(i15);
                Bundle bundle8 = new Bundle();
                if (c1417e2.f15242b == null && (i4 = c1417e2.f15245e) != 0) {
                    c1417e2.f15242b = IconCompat.a(i4);
                }
                IconCompat iconCompat2 = c1417e2.f15242b;
                Bundle bundle9 = c1417e2.f15241a;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle8.putCharSequence("title", c1417e2.f15246f);
                bundle8.putParcelable("actionIntent", c1417e2.f15247g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c1417e2.f15243c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c1417e2.f15244d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i15++;
                arrayList13 = arrayList14;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (c1418f.f15259l == null) {
                c1418f.f15259l = new Bundle();
            }
            c1418f.f15259l.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f203d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f201b).setExtras(c1418f.f15259l);
        ((Notification.Builder) this.f201b).setRemoteInputHistory(null);
        if (i16 >= 26) {
            AbstractC0012m.i((Notification.Builder) this.f201b);
            AbstractC0012m.o((Notification.Builder) this.f201b);
            AbstractC0012m.p((Notification.Builder) this.f201b);
            AbstractC0012m.q((Notification.Builder) this.f201b);
            AbstractC0012m.k((Notification.Builder) this.f201b);
            if (!TextUtils.isEmpty(c1418f.f15260m)) {
                ((Notification.Builder) this.f201b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it2 = arrayList12.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i16 >= 29) {
            AbstractC1419g.a((Notification.Builder) this.f201b, c1418f.n);
            AbstractC1419g.b((Notification.Builder) this.f201b);
        }
        if (i16 >= 36) {
            F.e.f((Notification.Builder) this.f201b);
        }
    }

    public j(C0144j c0144j) {
        this.f200a = 22;
        this.f201b = new P(30, 1);
        this.f202c = new ArrayList();
        this.f203d = new ArrayList();
        new C0144j(17, this);
    }

    public j(U.n[] nVarArr) {
        this.f200a = 13;
        c0.M m4 = new c0.M();
        U.t tVar = new U.t();
        tVar.f3101c = 1.0f;
        tVar.f3102d = 1.0f;
        U.k kVar = U.k.f3054e;
        tVar.f3103e = kVar;
        tVar.f3104f = kVar;
        tVar.f3105g = kVar;
        tVar.f3106h = kVar;
        ByteBuffer byteBuffer = U.n.f3061a;
        tVar.f3109k = byteBuffer;
        tVar.f3110l = byteBuffer;
        tVar.f3100b = -1;
        U.n[] nVarArr2 = new U.n[nVarArr.length + 2];
        this.f201b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.f202c = m4;
        this.f203d = tVar;
        nVarArr2[nVarArr.length] = m4;
        nVarArr2[nVarArr.length + 1] = tVar;
    }

    public j(t1.h hVar) {
        this.f200a = 0;
        this.f201b = hVar;
        this.f202c = new ReentrantLock();
        this.f203d = new WeakHashMap();
    }

    public j(c0.z zVar) {
        this.f200a = 12;
        this.f203d = zVar;
        Handler o = J.o(null);
        this.f201b = o;
        y yVar = new y(this);
        this.f202c = yVar;
        zVar.f5628a.registerStreamEventCallback(new ExecutorC0129E(1, o), yVar);
    }

    public j(C0141g c0141g, b0.i iVar) {
        this.f200a = 9;
        this.f203d = c0141g;
        this.f201b = new HashMap();
        this.f202c = iVar;
    }

    public j(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f200a = 19;
        this.f202c = arrayDeque;
        this.f201b = bufferedReader;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a0.D, java.lang.Object] */
    public j(C0130F c0130f, Context context) {
        this.f200a = 10;
        this.f203d = c0130f;
        this.f201b = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: a0.D
            @Override // java.util.function.IntConsumer
            public final void accept(int i4) {
                C0130F c0130f2 = (C0130F) B1.j.this.f203d;
                if (c0130f2.f3880f0) {
                    return;
                }
                c0130f2.D(1, 19, Integer.valueOf(i4));
            }
        };
        this.f202c = r02;
        context.registerDeviceIdChangeListener(new ExecutorC0129E(0, c0130f.f3899w.a(c0130f.f3898u, null)), r02);
    }
}
