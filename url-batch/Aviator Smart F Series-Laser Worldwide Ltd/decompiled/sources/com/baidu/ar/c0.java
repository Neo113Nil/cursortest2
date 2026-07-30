package com.baidu.ar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.arrender.a;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c0 implements a.e {

    /* renamed from: a, reason: collision with root package name */
    public Context f1858a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1859b;

    /* renamed from: c, reason: collision with root package name */
    public g3 f1860c;

    /* renamed from: d, reason: collision with root package name */
    public e6 f1861d;

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.ar.arrender.a f1862e;

    /* renamed from: f, reason: collision with root package name */
    public r3 f1863f;

    /* renamed from: g, reason: collision with root package name */
    public String f1864g;

    /* renamed from: h, reason: collision with root package name */
    public x8 f1865h;

    /* renamed from: i, reason: collision with root package name */
    public b f1866i;

    /* renamed from: j, reason: collision with root package name */
    public HashMap<String, e3> f1867j;

    /* renamed from: n, reason: collision with root package name */
    public a.f f1871n;

    /* renamed from: o, reason: collision with root package name */
    public int f1872o;

    /* renamed from: p, reason: collision with root package name */
    public int f1873p;

    /* renamed from: q, reason: collision with root package name */
    public int f1874q;

    /* renamed from: r, reason: collision with root package name */
    public int f1875r;

    /* renamed from: s, reason: collision with root package name */
    public int f1876s;

    /* renamed from: k, reason: collision with root package name */
    public List<t5> f1868k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f1869l = false;

    /* renamed from: m, reason: collision with root package name */
    public List<String> f1870m = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f1877t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1878u = true;

    public class a implements a.f {
        public a() {
        }

        @Override // com.baidu.ar.arrender.a.f
        public void a(int i8, int i9) {
            c0 c0Var = c0.this;
            c0Var.f1874q = i8;
            c0Var.f1875r = i9;
        }
    }

    public interface b {
        boolean a(String str, e3 e3Var);
    }

    public final void a(int i8, HashMap<String, Object> hashMap) {
        r3 r3Var = this.f1863f;
        if (r3Var != null) {
            r3Var.a(i8, hashMap);
        }
    }

    public void adjust(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        String str = (String) hashMap.get("detect_sync");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean equals = "sync".equals(str);
        if (e()) {
            equals = true;
        }
        if (equals != this.f1869l) {
            this.f1869l = equals;
            for (t5 t5Var : this.f1868k) {
                if (t5Var != null && (t5Var instanceof o4)) {
                    ((o4) t5Var).a(this.f1869l);
                }
                g3 g3Var = this.f1860c;
                if (g3Var != null) {
                    g3Var.a((o4) t5Var);
                }
            }
        }
    }

    public void b() {
        List<String> list = this.f1870m;
        if (list != null) {
            list.clear();
        }
    }

    public final Context c() {
        return this.f1858a;
    }

    public final IARRenderer d() {
        return this.f1862e;
    }

    public final boolean e() {
        com.baidu.ar.arrender.a aVar = this.f1862e;
        if (aVar == null || aVar.q() == null) {
            return false;
        }
        return this.f1862e.q().isSyncInputContent();
    }

    public String getFaceModelPath() {
        return this.f1864g;
    }

    public SparseArray<w8> getMdlConfigs() {
        x8 x8Var = this.f1865h;
        if (x8Var != null) {
            return x8Var.a();
        }
        h.b("AbstractAR", "mMdlConfigParams is null.");
        return new SparseArray<>();
    }

    public void onCaseCreate(String str) {
    }

    public void onCaseDestroy() {
    }

    @Override // com.baidu.ar.arrender.a.e
    public void onInputSizeChange(int i8, int i9) {
        com.baidu.ar.arrender.a aVar = this.f1862e;
        if (aVar == null) {
            return;
        }
        this.f1872o = aVar.q().getInputWidth();
        this.f1873p = this.f1862e.q().getInputHeight();
    }

    public void pause() {
    }

    public void release() {
        HashMap<String, e3> hashMap = this.f1867j;
        if (hashMap != null) {
            for (Map.Entry<String, e3> entry : hashMap.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            this.f1867j.clear();
            this.f1867j = null;
        }
        int size = this.f1868k.size();
        t5[] t5VarArr = new t5[size];
        this.f1868k.toArray(t5VarArr);
        for (int i8 = 0; i8 < size; i8++) {
            a(t5VarArr[i8]);
        }
        this.f1868k.clear();
        this.f1868k = null;
        this.f1860c = null;
        this.f1861d = null;
        this.f1862e = null;
        this.f1863f = null;
        this.f1859b = null;
        this.f1858a = null;
    }

    public void resume() {
    }

    public void setFaceModelPath(String str) {
        this.f1864g = str;
    }

    public void setMdlConfigParams(x8 x8Var) {
        this.f1865h = x8Var;
    }

    public void setup(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        String str = (String) hashMap.get("detect_sync");
        if (!TextUtils.isEmpty(str) && "sync".equals(str)) {
            this.f1869l = true;
        }
        if (e()) {
            this.f1869l = true;
        }
    }

    public void a(Context context, Looper looper) {
        this.f1858a = context;
        this.f1859b = new Handler(looper);
    }

    public final void b(s3 s3Var) {
        r3 r3Var = this.f1863f;
        if (r3Var != null) {
            r3Var.b(s3Var);
        }
    }

    public final boolean c(String str, e3 e3Var) {
        if (this.f1866i == null || TextUtils.isEmpty(str) || e3Var == null) {
            return false;
        }
        HashMap<String, e3> hashMap = this.f1867j;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        return this.f1866i.a(str, e3Var);
    }

    public void a(b bVar) {
        this.f1866i = bVar;
    }

    public void b(String str) {
        List<String> list = this.f1870m;
        if (list != null) {
            list.remove(str);
        }
    }

    public void a(e6 e6Var) {
        this.f1861d = e6Var;
    }

    public void b(String str, e3 e3Var) {
        if (this.f1868k == null || TextUtils.isEmpty(str) || e3Var == null) {
            return;
        }
        for (t5 t5Var : this.f1868k) {
            if (t5Var != null && str.equals(t5Var.getName()) && (t5Var instanceof f0)) {
                ((f0) t5Var).c(e3Var);
            }
        }
    }

    public void a(g3 g3Var, com.baidu.ar.arrender.a aVar, g gVar) {
        this.f1860c = g3Var;
        this.f1862e = aVar;
        this.f1872o = aVar.q().getInputWidth();
        this.f1873p = aVar.q().getInputHeight();
        aVar.r().getOutputWidth();
        aVar.r().getOutputHeight();
        this.f1876s = aVar.q().getInputDegree();
        this.f1877t = aVar.q().isCameraInput();
        this.f1878u = aVar.q().isFrontCamera();
        a aVar2 = new a();
        this.f1871n = aVar2;
        aVar.a(aVar2);
        aVar.a(this);
        if (e()) {
            this.f1869l = true;
        }
    }

    public final void a(LuaMsgListener luaMsgListener) {
        r3 r3Var = this.f1863f;
        if (r3Var == null || r3Var.d() == null) {
            return;
        }
        this.f1863f.d().a(luaMsgListener);
    }

    public final void a(n7 n7Var) {
        e6 e6Var = this.f1861d;
        if (e6Var != null) {
            e6Var.stop(n7Var);
        }
    }

    public void a(r3 r3Var) {
        this.f1863f = r3Var;
    }

    public final void a(s3 s3Var) {
        r3 r3Var = this.f1863f;
        if (r3Var != null) {
            r3Var.a(s3Var);
        }
    }

    public final void a(t5 t5Var) {
        com.baidu.ar.arrender.a aVar;
        if (t5Var == null) {
            h.b("AbstractAR", "removeDetector error!!! detector is null!!!");
            return;
        }
        if ((t5Var instanceof o4) && (aVar = this.f1862e) != null) {
            o4 o4Var = (o4) t5Var;
            aVar.b(o4Var.b(), o4Var);
        }
        g3 g3Var = this.f1860c;
        if (g3Var != null) {
            g3Var.a(t5Var);
        }
        List<t5> list = this.f1868k;
        if (list != null) {
            list.remove(t5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r2 != 270) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(t5 t5Var, e3 e3Var) {
        PixelRotation pixelRotation;
        if (t5Var == null) {
            h.b("AbstractAR", "addDetector error!!! detector is null!!!");
            return;
        }
        if ((t5Var instanceof o4) && this.f1862e != null) {
            this.f1868k.add(t5Var);
            o4 o4Var = (o4) t5Var;
            o4Var.a(this.f1859b);
            o4Var.a(this.f1869l);
            PixelReadParams b8 = o4Var.b();
            if (this.f1877t && b8.getIsPortrait()) {
                if (!this.f1878u) {
                    pixelRotation = PixelRotation.RotateRight;
                    b8.setPixelRotate(pixelRotation);
                    this.f1862e.a(b8, o4Var);
                }
                pixelRotation = PixelRotation.RotateRightFlipHorizontal;
                b8.setPixelRotate(pixelRotation);
                this.f1862e.a(b8, o4Var);
            } else {
                if (!this.f1877t) {
                    int i8 = this.f1876s;
                    if (i8 == 0) {
                        pixelRotation = PixelRotation.FlipVertical;
                    } else if (i8 == 90) {
                        pixelRotation = PixelRotation.RotateRightFlipVertical;
                    } else if (i8 == 180) {
                        pixelRotation = PixelRotation.FlipHorizontal;
                    }
                    b8.setPixelRotate(pixelRotation);
                }
                this.f1862e.a(b8, o4Var);
            }
        }
        g3 g3Var = this.f1860c;
        if (g3Var != null) {
            g3Var.a(t5Var, e3Var);
        }
    }

    public void a(String str) {
        List<String> list = this.f1870m;
        if (list == null || list.contains(str)) {
            return;
        }
        this.f1870m.add(str);
    }

    public void a(String str, e3 e3Var) {
        if (this.f1868k == null || TextUtils.isEmpty(str) || e3Var == null) {
            return;
        }
        for (t5 t5Var : this.f1868k) {
            if (t5Var != null && str.equals(t5Var.getName()) && (t5Var instanceof f0)) {
                ((f0) t5Var).b(e3Var);
            }
        }
    }

    public final void a(HashMap<String, Object> hashMap) {
        r3 r3Var = this.f1863f;
        if (r3Var != null) {
            r3Var.a(1902, hashMap);
        }
    }

    public void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            List<String> list2 = this.f1870m;
            if (list2 != null && !list2.contains(str)) {
                this.f1870m.add(str);
            }
        }
    }

    void a(JSONObject jSONObject) {
    }

    void a(boolean z7) {
        this.f1878u = z7;
        for (t5 t5Var : this.f1868k) {
            if ((t5Var instanceof o4) && this.f1862e != null) {
                PixelReadParams b8 = ((o4) t5Var).b();
                if (this.f1877t && b8.getIsPortrait()) {
                    PixelRotation pixelRotation = z7 ? PixelRotation.RotateRightFlipHorizontal : PixelRotation.RotateRight;
                    b8.setPixelRotate(pixelRotation);
                    this.f1862e.a(b8, pixelRotation);
                }
            }
        }
    }

    public boolean a() {
        List<String> list = this.f1870m;
        if (list != null && list.size() > 0) {
            return false;
        }
        for (t5 t5Var : this.f1868k) {
            if (t5Var != null && (t5Var instanceof f0) && ((f0) t5Var).a()) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(q7 q7Var, n7 n7Var) {
        e6 e6Var = this.f1861d;
        if (e6Var != null) {
            return e6Var.start(q7Var, n7Var);
        }
        return false;
    }
}
