package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.arplay.core.renderer.IARPRenderer;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    public Handler f2781a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f2782b;

    /* renamed from: c, reason: collision with root package name */
    public LuaMsgListener f2783c;

    /* renamed from: d, reason: collision with root package name */
    public i8 f2784d;

    /* renamed from: e, reason: collision with root package name */
    public IARPRenderer f2785e;

    /* renamed from: f, reason: collision with root package name */
    public PixelReadParams f2786f;

    /* renamed from: g, reason: collision with root package name */
    public PixelReadListener f2787g;

    public class a implements PixelReadListener {
        public a() {
        }

        @Override // com.baidu.ar.arplay.core.pixel.PixelReadListener
        public boolean onPixelRead(FramePixels framePixels) {
            if (framePixels == null || m4.this.f2785e == null) {
                return false;
            }
            h.a("FrameCapture", "onPixelRead textureID = " + framePixels.getTextureID());
            m4.this.f2785e.setCaptureData(framePixels.getTextureID());
            m4.this.c();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m4.this.d();
        }
    }

    public class c implements LuaMsgListener {
        public c() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return m4.this.f2782b;
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            PixelReadParams pixelReadParams;
            PixelRotation pixelRotation;
            if (m4.this.f2785e == null || m4.this.f2786f == null || m4.this.f2787g == null) {
                return;
            }
            String str = (String) hashMap.get("event_name");
            h.a("FrameCapture", "createLuaCaptureListener eventName = " + str);
            if (!"capture_frame".equals(str)) {
                if ("clear_capture".equals(str)) {
                    m4.this.f2785e.clearCaptureData();
                    return;
                }
                return;
            }
            m4.this.f2786f.setPreFilterID((String) hashMap.get("filter_id"));
            if (m4.this.f2786f.getPreFilterID().equals(PixelReadParams.DEFAULT_FILTER_ID) || TextUtils.isEmpty(m4.this.f2786f.getPreFilterID())) {
                if (m4.this.f2785e.isFrontCamera()) {
                    pixelReadParams = m4.this.f2786f;
                    pixelRotation = PixelRotation.RotateRightFlipHorizontal;
                } else {
                    pixelReadParams = m4.this.f2786f;
                    pixelRotation = PixelRotation.RotateRight;
                }
                pixelReadParams.setPixelRotate(pixelRotation);
            }
            m4.this.f2785e.createPixelReaderByPreFilterID(m4.this.f2786f, m4.this.f2787g);
        }
    }

    public m4(Looper looper, i8 i8Var, IARPRenderer iARPRenderer) {
        if (looper == null || i8Var == null || iARPRenderer == null) {
            h.b("FrameCapture", "create FrameCapture error!!! As params NULLLLL!!!");
        }
        this.f2781a = new Handler(looper);
        this.f2784d = i8Var;
        this.f2785e = iARPRenderer;
    }

    public void b() {
        LuaMsgListener luaMsgListener;
        Handler handler = this.f2781a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2781a = null;
        }
        i8 i8Var = this.f2784d;
        if (i8Var != null && (luaMsgListener = this.f2783c) != null) {
            i8Var.b(luaMsgListener);
        }
        this.f2784d = null;
        this.f2783c = null;
        this.f2782b = null;
        this.f2786f = null;
        this.f2787g = null;
        this.f2785e = null;
    }

    public void a() {
        IARPRenderer iARPRenderer = this.f2785e;
        if (iARPRenderer != null) {
            iARPRenderer.clearCaptureData();
        }
    }

    public void b(int i8, int i9) {
        a(i8, i9);
        a(this.f2784d);
    }

    public final void c() {
        Handler handler = this.f2781a;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public void d() {
        PixelReadParams pixelReadParams;
        PixelReadListener pixelReadListener;
        IARPRenderer iARPRenderer = this.f2785e;
        if (iARPRenderer == null || (pixelReadParams = this.f2786f) == null || (pixelReadListener = this.f2787g) == null) {
            return;
        }
        iARPRenderer.destroyPixelReaderByPreFilterID(pixelReadParams, pixelReadListener);
    }

    public final void a(int i8, int i9) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.RGBA);
        this.f2786f = pixelReadParams;
        pixelReadParams.setOutputWidth(i8);
        this.f2786f.setOutputHeight(i9);
        this.f2786f.setFrameType(PixelReadParams.FrameType.SINGLE_FRAME);
        this.f2787g = new a();
    }

    public final void a(i8 i8Var) {
        this.f2782b = Arrays.asList("event_name");
        c cVar = new c();
        this.f2783c = cVar;
        i8Var.a(cVar);
    }
}
