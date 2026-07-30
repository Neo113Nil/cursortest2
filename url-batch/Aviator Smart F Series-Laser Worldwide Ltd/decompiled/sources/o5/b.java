package o5;

import com.realsil.sdk.core.base.BaseThread;
import com.realsil.sdk.core.logger.ZLogger;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;

/* loaded from: classes4.dex */
public abstract class b {
    public static final C0380b Companion = new C0380b(null);
    public static final boolean VDBG = false;

    /* renamed from: a, reason: collision with root package name */
    public String f17075a;

    /* renamed from: b, reason: collision with root package name */
    public String f17076b;

    /* renamed from: c, reason: collision with root package name */
    public String f17077c;

    /* renamed from: d, reason: collision with root package name */
    public RandomAccessFile f17078d;

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f17079e;

    /* renamed from: f, reason: collision with root package name */
    public d f17080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17081g;

    /* renamed from: h, reason: collision with root package name */
    public a f17082h;

    /* renamed from: k, reason: collision with root package name */
    public int f17085k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17086l;

    /* renamed from: j, reason: collision with root package name */
    public int f17084j = 1;

    /* renamed from: i, reason: collision with root package name */
    public c f17083i = new c.a().build();

    public static abstract class a {
        public void onCompleted(String destDir, String dstFileName) {
            s.checkNotNullParameter(destDir, "destDir");
            s.checkNotNullParameter(dstFileName, "dstFileName");
        }

        public void onDetectionCompleted() {
        }

        public void onError() {
        }

        public void onStarted() {
        }
    }

    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public static final class C0380b {
        public C0380b(o oVar) {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public int f17087a;

        /* renamed from: b, reason: collision with root package name */
        public int f17088b;

        /* renamed from: c, reason: collision with root package name */
        public String f17089c;

        /* renamed from: d, reason: collision with root package name */
        public String f17090d;

        /* renamed from: e, reason: collision with root package name */
        public String f17091e;

        /* renamed from: f, reason: collision with root package name */
        public String f17092f;

        /* renamed from: g, reason: collision with root package name */
        public e f17093g;

        /* renamed from: h, reason: collision with root package name */
        public a f17094h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public int f17095a;

            /* renamed from: b, reason: collision with root package name */
            public int f17096b;

            /* renamed from: c, reason: collision with root package name */
            public String f17097c = "";

            /* renamed from: d, reason: collision with root package name */
            public String f17098d = "";

            /* renamed from: e, reason: collision with root package name */
            public String f17099e = "";

            /* renamed from: f, reason: collision with root package name */
            public String f17100f = "";

            /* renamed from: g, reason: collision with root package name */
            public e f17101g = new e.a().build();

            /* renamed from: h, reason: collision with root package name */
            public a f17102h;

            public static /* synthetic */ a destFile$default(a aVar, String str, String str2, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    str2 = q5.a.generateFileName$default(q5.a.INSTANCE, null, "pcm", 1, null);
                }
                return aVar.destFile(str, str2);
            }

            public static /* synthetic */ a srcFile$default(a aVar, String str, String str2, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    str2 = q5.a.generateFileName$default(q5.a.INSTANCE, null, "pcm", 1, null);
                }
                return aVar.srcFile(str, str2);
            }

            public final c build() {
                return new c(this.f17097c, this.f17098d, this.f17095a, this.f17096b, this.f17099e, this.f17100f, this.f17101g, this.f17102h, null);
            }

            public final a callback(a callback) {
                s.checkNotNullParameter(callback, "callback");
                this.f17102h = callback;
                return this;
            }

            public final a channels(int i8) {
                this.f17096b = i8;
                return this;
            }

            public final a destFile(String dir, String fileName) {
                s.checkNotNullParameter(dir, "dir");
                s.checkNotNullParameter(fileName, "fileName");
                this.f17099e = dir;
                this.f17100f = fileName;
                return this;
            }

            public final a detectionParameters(e detectionParameters) {
                s.checkNotNullParameter(detectionParameters, "detectionParameters");
                this.f17101g = detectionParameters;
                return this;
            }

            public final a sampleRate(int i8) {
                this.f17095a = i8;
                return this;
            }

            public final a srcFile(String dir, String fileName) {
                s.checkNotNullParameter(dir, "dir");
                s.checkNotNullParameter(fileName, "fileName");
                this.f17097c = dir;
                this.f17098d = fileName;
                return this;
            }
        }

        public c(String str, String str2, int i8, int i9, String str3, String str4, e eVar, a aVar, o oVar) {
            this.f17089c = str;
            this.f17090d = str2;
            this.f17087a = i8;
            this.f17088b = i9;
            this.f17091e = str3;
            this.f17092f = str4;
            this.f17093g = eVar;
            this.f17094h = aVar;
        }

        public final a getCallback() {
            return this.f17094h;
        }

        public final int getChannels() {
            return this.f17088b;
        }

        public final String getDestDir() {
            return this.f17091e;
        }

        public final e getDetectionParameters() {
            return this.f17093g;
        }

        public final String getDstFileName() {
            return this.f17092f;
        }

        public final int getSampleRate() {
            return this.f17087a;
        }

        public final String getSrcDir() {
            return this.f17089c;
        }

        public final String getSrcFileName() {
            return this.f17090d;
        }

        public final void setCallback(a aVar) {
            this.f17094h = aVar;
        }

        public final void setChannels(int i8) {
            this.f17088b = i8;
        }

        public final void setDestDir(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17091e = str;
        }

        public final void setDetectionParameters(e eVar) {
            s.checkNotNullParameter(eVar, "<set-?>");
            this.f17093g = eVar;
        }

        public final void setDstFileName(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17092f = str;
        }

        public final void setSampleRate(int i8) {
            this.f17087a = i8;
        }

        public final void setSrcDir(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17089c = str;
        }

        public final void setSrcFileName(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17090d = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DecoderParameters {");
            w wVar = w.INSTANCE;
            String format = String.format("\n\tsampleRate=" + this.f17087a + ", channels=" + this.f17088b, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format, "format(...)");
            sb.append(format);
            String format2 = String.format("\n\tsrcFile=" + this.f17089c + this.f17090d, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(format2);
            String format3 = String.format("\n\tdestFile=" + this.f17091e + this.f17092f, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format3, "format(...)");
            sb.append(format3);
            if (this.f17093g.getEnabled()) {
                String format4 = String.format("\n\tdetectionParameters=" + this.f17093g, Arrays.copyOf(new Object[0], 0));
                s.checkNotNullExpressionValue(format4, "format(...)");
                sb.append(format4);
            }
            sb.append("\n}");
            String sb2 = sb.toString();
            s.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
    }

    public final class d extends BaseThread {
        public d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.f17081g = true;
            ZLogger.d("DecoderThread is running");
            if (b.this.f17082h != null) {
                a aVar = b.this.f17082h;
                s.checkNotNull(aVar);
                aVar.onStarted();
            }
            b.this.setDetectionNumber(0);
            b.this.setSpeechDataDetected(false);
            while (!Thread.currentThread().isInterrupted() && !isCanceled()) {
                Object take = take();
                byte[] bArr = (byte[]) take;
                if (take != null) {
                    b bVar = b.this;
                    s.checkNotNull(bArr);
                    if (!bVar.a(bArr)) {
                        break;
                    }
                }
            }
            b.this.setDetectionNumber(0);
            b.this.release();
            ZLogger.d("DecoderThread stopped");
            b bVar2 = b.this;
            ZLogger.i("onCompleted,destDir=" + bVar2.f17076b + ", dstFileName=" + bVar2.f17077c);
            a aVar2 = bVar2.f17082h;
            if (aVar2 != null) {
                s.checkNotNull(aVar2);
                String str = bVar2.f17076b;
                s.checkNotNull(str);
                String str2 = bVar2.f17077c;
                s.checkNotNull(str2);
                aVar2.onCompleted(str, str2);
            }
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17104a;

        /* renamed from: b, reason: collision with root package name */
        public int f17105b;

        /* renamed from: c, reason: collision with root package name */
        public int f17106c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f17107a;

            /* renamed from: b, reason: collision with root package name */
            public int f17108b;

            /* renamed from: c, reason: collision with root package name */
            public int f17109c;

            public final e build() {
                return new e(this.f17107a, this.f17108b, this.f17109c, null);
            }

            public final a enabled(boolean z7) {
                this.f17107a = z7;
                return this;
            }

            public final a frameNumber(int i8) {
                this.f17109c = i8;
                return this;
            }

            public final a gain(int i8) {
                this.f17108b = i8;
                return this;
            }
        }

        public e(boolean z7, int i8, int i9, o oVar) {
            this.f17104a = z7;
            this.f17105b = i8;
            this.f17106c = i9;
        }

        public final boolean getEnabled() {
            return this.f17104a;
        }

        public final int getFrameNumber() {
            return this.f17106c;
        }

        public final int getGain() {
            return this.f17105b;
        }

        public final void setEnabled(boolean z7) {
            this.f17104a = z7;
        }

        public final void setFrameNumber(int i8) {
            this.f17106c = i8;
        }

        public final void setGain(int i8) {
            this.f17105b = i8;
        }

        public String toString() {
            w wVar = w.INSTANCE;
            String format = String.format("gain=" + this.f17105b + ", frameNumber=" + this.f17106c, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format, "format(...)");
            s.checkNotNullExpressionValue(format, "toString(...)");
            return format;
        }
    }

    public void a() {
    }

    public void cancel() {
        ZLogger.v("cancel decoder procedure");
        d dVar = this.f17080f;
        if (dVar != null) {
            s.checkNotNull(dVar);
            dVar.clearQueue();
            d dVar2 = this.f17080f;
            s.checkNotNull(dVar2);
            dVar2.cancel(true);
        }
        release();
    }

    public final void decode(byte[] data) {
        s.checkNotNullParameter(data, "data");
        d dVar = this.f17080f;
        if (dVar != null) {
            s.checkNotNull(dVar);
            dVar.addQueue(data);
        }
    }

    public final int getDetectionNumber() {
        return this.f17085k;
    }

    public final boolean getSpeechDataDetected() {
        return this.f17086l;
    }

    public void release() {
        this.f17081g = false;
        try {
            RandomAccessFile randomAccessFile = this.f17078d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } catch (IOException unused) {
        }
        try {
            RandomAccessFile randomAccessFile2 = this.f17079e;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (IOException unused2) {
        }
    }

    public final void setDetectionNumber(int i8) {
        this.f17085k = i8;
    }

    public final void setSpeechDataDetected(boolean z7) {
        this.f17086l = z7;
    }

    public final boolean start(c parameters) {
        s.checkNotNullParameter(parameters, "parameters");
        if (this.f17081g) {
            ZLogger.w("decoder already started");
            return false;
        }
        this.f17083i = parameters;
        parameters.getSrcDir();
        this.f17075a = parameters.getSrcFileName();
        this.f17076b = parameters.getDestDir();
        this.f17077c = parameters.getDstFileName();
        this.f17082h = parameters.getCallback();
        q5.a aVar = q5.a.INSTANCE;
        RandomAccessFile createRandomAccessFile = aVar.createRandomAccessFile(parameters.getSrcDir(), parameters.getSrcFileName(), true);
        this.f17078d = createRandomAccessFile;
        if (createRandomAccessFile == null) {
            w wVar = w.INSTANCE;
            String format = String.format("open src file: %s failed", Arrays.copyOf(new Object[]{this.f17075a}, 1));
            s.checkNotNullExpressionValue(format, "format(...)");
            ZLogger.d(format);
        }
        RandomAccessFile createRandomAccessFile2 = aVar.createRandomAccessFile(parameters.getDestDir(), parameters.getDstFileName(), true);
        this.f17079e = createRandomAccessFile2;
        if (createRandomAccessFile2 == null) {
            w wVar2 = w.INSTANCE;
            String format2 = String.format("open dst file: %s failed", Arrays.copyOf(new Object[]{this.f17077c}, 1));
            s.checkNotNullExpressionValue(format2, "format(...)");
            ZLogger.d(format2);
        }
        ZLogger.v("start decoder procedure, " + parameters);
        a();
        d dVar = this.f17080f;
        if (dVar != null) {
            s.checkNotNull(dVar);
            dVar.cancel(true);
        }
        d dVar2 = new d();
        this.f17080f = dVar2;
        s.checkNotNull(dVar2);
        dVar2.start();
        return true;
    }

    public void stop() {
    }

    public boolean a(byte[] data) {
        s.checkNotNullParameter(data, "data");
        try {
            RandomAccessFile randomAccessFile = this.f17078d;
            if (randomAccessFile == null) {
                return true;
            }
            randomAccessFile.write(data, 0, data.length);
            return true;
        } catch (IOException unused) {
            return true;
        }
    }
}
