package o5;

import com.realsil.sdk.core.logger.ZLogger;
import java.io.BufferedInputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;

/* loaded from: classes4.dex */
public class a extends Thread {
    public static final b Companion = new b(null);
    public static final boolean DBG = true;
    public static final boolean TDBG = false;
    public static final boolean VDBG = true;

    /* renamed from: a, reason: collision with root package name */
    public int f17055a;

    /* renamed from: b, reason: collision with root package name */
    public String f17056b;

    /* renamed from: c, reason: collision with root package name */
    public String f17057c;

    /* renamed from: d, reason: collision with root package name */
    public String f17058d;

    /* renamed from: e, reason: collision with root package name */
    public String f17059e;

    /* renamed from: f, reason: collision with root package name */
    public BufferedInputStream f17060f;

    /* renamed from: g, reason: collision with root package name */
    public RandomAccessFile f17061g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0378a f17062h;

    /* renamed from: o5.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0378a {
        public void onCompleted(String destDir, String dstFileName) {
            s.checkNotNullParameter(destDir, "destDir");
            s.checkNotNullParameter(dstFileName, "dstFileName");
        }

        public void onError() {
        }

        public void onStarted() {
        }
    }

    public static final class b {
        public b(o oVar) {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f17063a;

        /* renamed from: b, reason: collision with root package name */
        public String f17064b;

        /* renamed from: c, reason: collision with root package name */
        public String f17065c;

        /* renamed from: d, reason: collision with root package name */
        public String f17066d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17067e;

        /* renamed from: f, reason: collision with root package name */
        public AbstractC0378a f17068f;

        /* renamed from: o5.a$c$a, reason: collision with other inner class name */
        public static final class C0379a {

            /* renamed from: a, reason: collision with root package name */
            public String f17069a = "";

            /* renamed from: b, reason: collision with root package name */
            public String f17070b = "";

            /* renamed from: c, reason: collision with root package name */
            public String f17071c = "";

            /* renamed from: d, reason: collision with root package name */
            public String f17072d = "";

            /* renamed from: e, reason: collision with root package name */
            public int f17073e;

            /* renamed from: f, reason: collision with root package name */
            public AbstractC0378a f17074f;

            public static /* synthetic */ C0379a destFile$default(C0379a c0379a, String str, String str2, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    str2 = q5.a.generateFileName$default(q5.a.INSTANCE, null, "pcm", 1, null);
                }
                return c0379a.destFile(str, str2);
            }

            public static /* synthetic */ C0379a srcFile$default(C0379a c0379a, String str, String str2, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    str2 = q5.a.generateFileName$default(q5.a.INSTANCE, null, "pcm", 1, null);
                }
                return c0379a.srcFile(str, str2);
            }

            public final c build() {
                return new c(this.f17069a, this.f17070b, this.f17071c, this.f17072d, this.f17073e, this.f17074f, null);
            }

            public final C0379a callback(AbstractC0378a callback) {
                s.checkNotNullParameter(callback, "callback");
                this.f17074f = callback;
                return this;
            }

            public final C0379a destFile(String dir, String fileName) {
                s.checkNotNullParameter(dir, "dir");
                s.checkNotNullParameter(fileName, "fileName");
                this.f17071c = dir;
                this.f17072d = fileName;
                return this;
            }

            public final AbstractC0378a getCallback() {
                return this.f17074f;
            }

            public final void setCallback(AbstractC0378a abstractC0378a) {
                this.f17074f = abstractC0378a;
            }

            public final C0379a srcFile(String dir, String fileName) {
                s.checkNotNullParameter(dir, "dir");
                s.checkNotNullParameter(fileName, "fileName");
                this.f17069a = dir;
                this.f17070b = fileName;
                return this;
            }

            public final C0379a version(int i8) {
                this.f17073e = i8;
                return this;
            }
        }

        public c(String str, String str2, String str3, String str4, int i8, AbstractC0378a abstractC0378a, o oVar) {
            this.f17063a = str;
            this.f17064b = str2;
            this.f17065c = str3;
            this.f17066d = str4;
            this.f17067e = i8;
            this.f17068f = abstractC0378a;
        }

        public final AbstractC0378a getCallback() {
            return this.f17068f;
        }

        public final String getDestDir() {
            return this.f17065c;
        }

        public final String getDstFileName() {
            return this.f17066d;
        }

        public final String getSrcDir() {
            return this.f17063a;
        }

        public final String getSrcFileName() {
            return this.f17064b;
        }

        public final int getVersion() {
            return this.f17067e;
        }

        public final void setCallback(AbstractC0378a abstractC0378a) {
            this.f17068f = abstractC0378a;
        }

        public final void setDestDir(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17065c = str;
        }

        public final void setDstFileName(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17066d = str;
        }

        public final void setSrcDir(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17063a = str;
        }

        public final void setSrcFileName(String str) {
            s.checkNotNullParameter(str, "<set-?>");
            this.f17064b = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Parameters {");
            sb.append("\n\tversion=" + this.f17067e);
            w wVar = w.INSTANCE;
            String format = String.format("\n\tsrcDir=" + this.f17063a + ", srcFileName=" + this.f17064b, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format, "format(...)");
            sb.append(format);
            String format2 = String.format("\n\tdestDir=" + this.f17065c + ", dstFileName=" + this.f17066d, Arrays.copyOf(new Object[0], 0));
            s.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(format2);
            sb.append("\n}");
            String sb2 = sb.toString();
            s.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
    }

    public void a() {
        ZLogger.i("onStarted");
        AbstractC0378a abstractC0378a = this.f17062h;
        if (abstractC0378a != null) {
            abstractC0378a.onStarted();
        }
    }

    public boolean b() {
        q5.a aVar = q5.a.INSTANCE;
        String str = this.f17056b;
        s.checkNotNull(str);
        String str2 = this.f17057c;
        s.checkNotNull(str2);
        BufferedInputStream openInputStream = aVar.openInputStream(str, str2);
        this.f17060f = openInputStream;
        if (openInputStream == null) {
            w wVar = w.INSTANCE;
            String format = String.format("open src file: %s failed", Arrays.copyOf(new Object[]{this.f17057c}, 1));
            s.checkNotNullExpressionValue(format, "format(...)");
            ZLogger.d(format);
            return false;
        }
        String str3 = this.f17058d;
        s.checkNotNull(str3);
        String str4 = this.f17059e;
        s.checkNotNull(str4);
        RandomAccessFile createRandomAccessFile = aVar.createRandomAccessFile(str3, str4, true);
        this.f17061g = createRandomAccessFile;
        if (createRandomAccessFile == null) {
            w wVar2 = w.INSTANCE;
            String format2 = String.format("open dst file: %s failed", Arrays.copyOf(new Object[]{this.f17059e}, 1));
            s.checkNotNullExpressionValue(format2, "format(...)");
            ZLogger.d(format2);
            return false;
        }
        w wVar3 = w.INSTANCE;
        String format3 = String.format("convert %s to %s", Arrays.copyOf(new Object[]{this.f17057c, this.f17059e}, 2));
        s.checkNotNullExpressionValue(format3, "format(...)");
        ZLogger.v(format3);
        return true;
    }

    public void c() {
        ZLogger.d("release");
        try {
            BufferedInputStream bufferedInputStream = this.f17060f;
            if (bufferedInputStream != null) {
                s.checkNotNull(bufferedInputStream);
                bufferedInputStream.close();
            }
            RandomAccessFile randomAccessFile = this.f17061g;
            if (randomAccessFile != null) {
                s.checkNotNull(randomAccessFile);
                randomAccessFile.close();
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public final void convert(c parameters) {
        s.checkNotNullParameter(parameters, "parameters");
        ZLogger.v("start decoder procedure, " + parameters);
        this.f17055a = parameters.getVersion();
        this.f17056b = parameters.getSrcDir();
        this.f17057c = parameters.getSrcFileName();
        this.f17058d = parameters.getDestDir();
        this.f17059e = parameters.getDstFileName();
        this.f17062h = parameters.getCallback();
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        if (!b()) {
            c();
            ZLogger.w("onError");
            AbstractC0378a abstractC0378a = this.f17062h;
            if (abstractC0378a != null) {
                abstractC0378a.onError();
                return;
            }
            return;
        }
        a();
        w wVar = w.INSTANCE;
        String format = String.format("convert: %s to %s completed", Arrays.copyOf(new Object[]{this.f17057c, this.f17059e}, 2));
        s.checkNotNullExpressionValue(format, "format(...)");
        ZLogger.i(format);
        c();
        ZLogger.i("onCompleted");
        AbstractC0378a abstractC0378a2 = this.f17062h;
        if (abstractC0378a2 != null) {
            String str = this.f17058d;
            s.checkNotNull(str);
            String str2 = this.f17059e;
            s.checkNotNull(str2);
            abstractC0378a2.onCompleted(str, str2);
        }
    }
}
