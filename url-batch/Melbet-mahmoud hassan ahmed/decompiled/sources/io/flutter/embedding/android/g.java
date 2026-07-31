package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

@TargetApi(19)
/* loaded from: classes.dex */
public class g extends View implements k5.c {

    /* renamed from: f, reason: collision with root package name */
    private ImageReader f17091f;

    /* renamed from: g, reason: collision with root package name */
    private Image f17092g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f17093h;

    /* renamed from: i, reason: collision with root package name */
    private k5.a f17094i;

    /* renamed from: j, reason: collision with root package name */
    private b f17095j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17096k;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17097a;

        static {
            int[] iArr = new int[b.values().length];
            f17097a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17097a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public g(Context context, int i7, int i8, b bVar) {
        this(context, f(i7, i8), bVar);
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f17096k = false;
        this.f17091f = imageReader;
        this.f17095j = bVar;
        g();
    }

    private void d() {
        Image image = this.f17092g;
        if (image != null) {
            image.close();
            this.f17092g = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader f(int i7, int i8) {
        int i9;
        int i10;
        if (i7 <= 0) {
            h("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i7));
            i9 = 1;
        } else {
            i9 = i7;
        }
        if (i8 <= 0) {
            h("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i8));
            i10 = 1;
        } else {
            i10 = i8;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i9, i10, 1, 3, 768L) : ImageReader.newInstance(i9, i10, 1, 3);
    }

    private void g() {
        setAlpha(0.0f);
    }

    private static void h(String str, Object... objArr) {
        z4.b.f("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void j() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f17092g.getHardwareBuffer();
            this.f17093h = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f17092g.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f17092g.getHeight();
        Bitmap bitmap = this.f17093h;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f17093h.getHeight() != height) {
            this.f17093h = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f17093h.copyPixelsFromBuffer(buffer);
    }

    @Override // k5.c
    public void Z() {
    }

    @Override // k5.c
    public void a() {
        if (this.f17096k) {
            setAlpha(0.0f);
            c();
            this.f17093h = null;
            d();
            invalidate();
            this.f17096k = false;
        }
    }

    @Override // k5.c
    public void b(k5.a aVar) {
        if (a.f17097a[this.f17095j.ordinal()] == 1) {
            aVar.x(this.f17091f.getSurface());
        }
        setAlpha(1.0f);
        this.f17094i = aVar;
        this.f17096k = true;
    }

    @TargetApi(19)
    public boolean c() {
        if (!this.f17096k) {
            return false;
        }
        Image acquireLatestImage = this.f17091f.acquireLatestImage();
        if (acquireLatestImage != null) {
            d();
            this.f17092g = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public void e() {
        this.f17091f.close();
    }

    @Override // k5.c
    public k5.a getAttachedRenderer() {
        return this.f17094i;
    }

    public ImageReader getImageReader() {
        return this.f17091f;
    }

    public Surface getSurface() {
        return this.f17091f.getSurface();
    }

    public void i(int i7, int i8) {
        if (this.f17094i == null) {
            return;
        }
        if (i7 == this.f17091f.getWidth() && i8 == this.f17091f.getHeight()) {
            return;
        }
        d();
        e();
        this.f17091f = f(i7, i8);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17092g != null) {
            j();
        }
        Bitmap bitmap = this.f17093h;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f17091f.getWidth() && i8 == this.f17091f.getHeight()) && this.f17095j == b.background && this.f17096k) {
            i(i7, i8);
            this.f17094i.x(this.f17091f.getSurface());
        }
    }
}
