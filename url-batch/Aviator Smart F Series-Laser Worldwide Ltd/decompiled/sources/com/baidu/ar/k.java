package com.baidu.ar;

import android.content.Context;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.rotate.Orientation;
import com.baidu.ar.arplay.core.engine.rotate.OrientationManager;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.EasyAudioCallback;
import com.baidu.ar.audio.IEasyAudio;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.Watermark;
import com.baidu.ar.record.EncoderParams;
import com.baidu.ar.record.IRecord;
import com.baidu.ar.record.MovieRecorderCallback;
import com.baidu.ar.record.RecordCallback;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class k implements IRecord, FrameRenderListener {

    /* renamed from: r, reason: collision with root package name */
    public static final String f2621r = "k";

    /* renamed from: a, reason: collision with root package name */
    public Context f2622a;

    /* renamed from: b, reason: collision with root package name */
    public IARRenderer f2623b;

    /* renamed from: c, reason: collision with root package name */
    public RecordCallback f2624c;

    /* renamed from: d, reason: collision with root package name */
    public Watermark f2625d;

    /* renamed from: e, reason: collision with root package name */
    public DuMixOutput f2626e;

    /* renamed from: f, reason: collision with root package name */
    public l6 f2627f;

    /* renamed from: g, reason: collision with root package name */
    public EncoderParams f2628g;

    /* renamed from: h, reason: collision with root package name */
    public MovieRecorderCallback f2629h;

    /* renamed from: i, reason: collision with root package name */
    public IEasyAudio f2630i;

    /* renamed from: j, reason: collision with root package name */
    public AudioParams f2631j;

    /* renamed from: k, reason: collision with root package name */
    public EasyAudioCallback f2632k;

    /* renamed from: p, reason: collision with root package name */
    public long f2637p;

    /* renamed from: l, reason: collision with root package name */
    public int f2633l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2634m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2635n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2636o = false;

    /* renamed from: q, reason: collision with root package name */
    public long f2638q = 0;

    public class a implements EasyAudioCallback {
        public a() {
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8) {
            k.this.a(byteBuffer, i8);
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioStart(boolean z7, AudioParams audioParams) {
            h.a(k.f2621r, "onAudioStart result = " + z7);
            k.this.a(z7, audioParams);
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioStop(boolean z7) {
            h.a(k.f2621r, "onAudioStop result = " + z7);
        }
    }

    public class b implements MovieRecorderCallback {
        public b() {
        }

        @Override // com.baidu.ar.record.MovieRecorderCallback
        public void onRecorderComplete(boolean z7, String str) {
            h.a(k.f2621r, "onRecorderComplete result = " + z7);
            k.this.f2635n = false;
            if (k.this.f2624c != null) {
                k.this.f2624c.onRecorderComplete(z7, str);
                k.this.f2624c = null;
            }
        }

        @Override // com.baidu.ar.record.MovieRecorderCallback
        public void onRecorderError(int i8) {
            h.b(k.f2621r, "onRecorderError error = " + i8);
        }

        @Override // com.baidu.ar.record.MovieRecorderCallback
        public void onRecorderInit(Surface surface) {
            if (k.this.f2628g == null) {
                return;
            }
            h.a(k.f2621r, "onRecorderInit inputSurface = " + surface.hashCode());
            k kVar = k.this;
            kVar.f2626e = new DuMixOutput(surface, kVar.f2628g.getVideoWidth(), k.this.f2628g.getVideoHeight());
            k.this.f2626e.setRotationType(k.this.e());
            k.this.f2626e.setWatermark(k.this.f2625d);
            if (k.this.f2623b == null || k.this.f2628g == null) {
                return;
            }
            k.this.f2623b.addOutputSurface(k.this.f2626e);
        }

        @Override // com.baidu.ar.record.MovieRecorderCallback
        public void onRecorderProcess(int i8) {
            h.a(k.f2621r, "onRecorderProcess process = " + i8);
            if (i8 > 100) {
                k.this.stopRecord();
            } else if (k.this.f2624c != null) {
                k.this.f2624c.onRecorderProcess(i8);
            }
        }

        @Override // com.baidu.ar.record.MovieRecorderCallback
        public void onRecorderStart(boolean z7) {
            h.a(k.f2621r, "onRecorderStart result = " + z7);
            k.this.f2635n = z7;
            if (k.this.f2624c != null) {
                k.this.f2624c.onRecorderStart(z7);
            }
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2641a;

        static {
            int[] iArr = new int[Orientation.values().length];
            f2641a = iArr;
            try {
                iArr[Orientation.LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2641a[Orientation.LANDSCAPE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2641a[Orientation.PORTRAIT_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(Context context, IARRenderer iARRenderer) {
        this.f2622a = context;
        this.f2623b = iARRenderer;
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderFinished(long j8) {
        if (this.f2627f == null || this.f2636o) {
            return;
        }
        this.f2627f.onVideoFrameAvailable(System.nanoTime() - this.f2638q);
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderStarted(long j8) {
    }

    @Override // com.baidu.ar.record.IRecord
    public void pauseRecord() {
        if (!this.f2635n || this.f2636o) {
            return;
        }
        this.f2636o = true;
        this.f2637p = System.nanoTime();
    }

    @Override // com.baidu.ar.record.IRecord
    public void resumeRecord() {
        if (this.f2635n && this.f2636o) {
            this.f2636o = false;
            this.f2638q += System.nanoTime() - this.f2637p;
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void setRecordWatermark(Watermark watermark) {
        this.f2625d = watermark;
    }

    @Override // com.baidu.ar.record.IRecord
    public void startRecord(String str, long j8, RecordCallback recordCallback) {
        c();
        d();
        this.f2624c = recordCallback;
        EncoderParams encoderParams = this.f2628g;
        if (encoderParams != null) {
            encoderParams.setOutputFile(str);
            this.f2628g.setOutputTotalMs(j8);
        }
        IEasyAudio iEasyAudio = this.f2630i;
        if (iEasyAudio != null) {
            iEasyAudio.startAudio(this.f2631j, this.f2632k);
        }
        IARRenderer iARRenderer = this.f2623b;
        if (iARRenderer != null) {
            iARRenderer.addFrameRenderListener(this);
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public synchronized void stopRecord() {
        try {
            IEasyAudio iEasyAudio = this.f2630i;
            if (iEasyAudio != null) {
                iEasyAudio.stopAudio(this.f2632k);
                this.f2630i = null;
            }
            this.f2631j = null;
            this.f2632k = null;
            l6 l6Var = this.f2627f;
            if (l6Var != null) {
                l6Var.stopRecorder();
                this.f2627f = null;
            }
            this.f2628g = null;
            this.f2629h = null;
            IARRenderer iARRenderer = this.f2623b;
            if (iARRenderer != null) {
                iARRenderer.removeOutputSurface(this.f2626e);
                this.f2623b.removeFrameRenderListener(this);
            }
            this.f2626e = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        Watermark watermark;
        RotationType rotationType;
        Orientation globalOrientation = OrientationManager.getGlobalOrientation();
        Watermark watermark2 = this.f2625d;
        if (watermark2 != null) {
            if (globalOrientation == Orientation.LANDSCAPE) {
                watermark2.setCoordinateType(Watermark.CoordinateType.RIGHT_BOTTOM);
                watermark = this.f2625d;
                rotationType = RotationType.ROTATE_270;
            } else if (globalOrientation == Orientation.LANDSCAPE_REVERSE) {
                watermark2.setCoordinateType(Watermark.CoordinateType.LEFT_TOP);
                watermark = this.f2625d;
                rotationType = RotationType.ROTATE_90;
            } else if (globalOrientation == Orientation.PORTRAIT_REVERSE) {
                watermark2.setCoordinateType(Watermark.CoordinateType.RIGHT_TOP);
                watermark = this.f2625d;
                rotationType = RotationType.ROTATE_180;
            } else {
                watermark2.setCoordinateType(Watermark.CoordinateType.LEFT_BOTTOM);
                watermark = this.f2625d;
                rotationType = RotationType.ROTATE_0;
            }
            watermark.setRotationType(rotationType);
        }
    }

    public final void c() {
        if (this.f2631j == null) {
            this.f2631j = new AudioParams();
        }
        if (this.f2632k == null) {
            this.f2632k = new a();
        }
        if (this.f2630i == null) {
            this.f2630i = j.a();
        }
    }

    public final void d() {
        if (this.f2628g == null) {
            this.f2628g = new EncoderParams();
        }
        if (this.f2629h == null) {
            this.f2629h = new b();
        }
        if (this.f2627f == null) {
            this.f2627f = j.c();
        }
    }

    public final RotationType e() {
        RotationType rotationType = RotationType.ROTATE_0;
        int i8 = c.f2641a[OrientationManager.getGlobalOrientation().ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? rotationType : RotationType.ROTATE_180 : RotationType.ROTATE_270 : RotationType.ROTATE_90;
    }

    public void a(int i8, int i9) {
        this.f2633l = i8;
        this.f2634m = i9;
    }

    public final void a(EncoderParams encoderParams, AudioParams audioParams) {
        int videoWidth = encoderParams.getVideoWidth();
        int videoHeight = encoderParams.getVideoHeight();
        if (this.f2633l > 0 && this.f2634m > 0) {
            if (videoHeight > videoWidth) {
                videoHeight = (this.f2628g.getVideoWidth() * this.f2634m) / this.f2633l;
            } else {
                videoWidth = (this.f2628g.getVideoHeight() * this.f2634m) / this.f2633l;
            }
        }
        Orientation globalOrientation = OrientationManager.getGlobalOrientation();
        if (globalOrientation == Orientation.LANDSCAPE || globalOrientation == Orientation.LANDSCAPE_REVERSE) {
            int i8 = videoHeight;
            videoHeight = videoWidth;
            videoWidth = i8;
        }
        if (videoWidth % 2 == 1) {
            videoWidth++;
        }
        if (videoHeight % 2 == 1) {
            videoHeight++;
        }
        encoderParams.setVideoWidth(videoWidth);
        encoderParams.setVideoHeight(videoHeight);
        encoderParams.setAudioSampleRate(audioParams.getSampleRate());
        encoderParams.setAudioFrameSize(audioParams.getFrameSize());
    }

    public final synchronized void a(ByteBuffer byteBuffer, int i8) {
        long nanoTime = System.nanoTime() - this.f2638q;
        l6 l6Var = this.f2627f;
        if (l6Var != null && byteBuffer != null && i8 > 0 && !this.f2636o) {
            l6Var.onAudioFrameAvailable(byteBuffer, i8, nanoTime);
        }
    }

    public final synchronized void a(boolean z7, AudioParams audioParams) {
        this.f2628g.setAudioIncluded(z7);
        if (this.f2627f != null) {
            a(this.f2628g, audioParams);
            b();
            this.f2627f.startRecorder(this.f2622a, this.f2628g, this.f2629h);
        }
    }
}
