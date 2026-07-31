package D3;

import a.AbstractC0219a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: D3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0122j extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: f, reason: collision with root package name */
    public ImageReader f437f;

    /* renamed from: g, reason: collision with root package name */
    public Image f438g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f439h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f440i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f441j;

    /* renamed from: k, reason: collision with root package name */
    public final int f442k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122j(Context context, int i7, int i8, int i9) {
        super(context, null);
        ImageReader f7 = f(i7, i8);
        this.f441j = false;
        this.f443l = false;
        this.f437f = f7;
        this.f442k = i9;
        setAlpha(0.0f);
        this.f441j = AbstractC0219a.v(getContext());
    }

    public static ImageReader f(int i7, int i8) {
        ImageReader newInstance;
        if (i7 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i7 + ", set width=1");
            i7 = 1;
        }
        if (i8 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i8 + ", set height=1");
            i8 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i7, i8, 1, 3);
        }
        newInstance = ImageReader.newInstance(i7, i8, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        if (this.f443l) {
            setAlpha(0.0f);
            e();
            this.f439h = null;
            Image image = this.f438g;
            if (image != null) {
                image.close();
                this.f438g = null;
            }
            invalidate();
            this.f443l = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c(io.flutter.embedding.engine.renderer.h hVar) {
        if (N.p.c(this.f442k) == 0) {
            Surface surface = this.f437f.getSurface();
            hVar.f4487b = surface;
            hVar.f4486a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f440i = hVar;
        this.f443l = true;
    }

    public final boolean e() {
        if (!this.f443l) {
            return false;
        }
        Image acquireLatestImage = this.f437f.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f438g;
            if (image != null) {
                image.close();
                this.f438g = null;
            }
            this.f438g = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i7, int i8) {
        if (this.f440i == null) {
            return;
        }
        if (i7 == this.f437f.getWidth() && i8 == this.f437f.getHeight()) {
            return;
        }
        Image image = this.f438g;
        if (image != null) {
            image.close();
            this.f438g = null;
        }
        this.f437f.close();
        this.f437f = f(i7, i8);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f440i;
    }

    public ImageReader getImageReader() {
        return this.f437f;
    }

    public Surface getSurface() {
        return this.f437f.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f438g;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f439h = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f438g.getHeight();
                    Bitmap bitmap = this.f439h;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f439h.getHeight() != height) {
                        this.f439h = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f439h.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f439h;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (!this.f441j) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i7), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i8), View.MeasureSpec.getMode(i8) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        if (!(i7 == this.f437f.getWidth() && i8 == this.f437f.getHeight()) && this.f442k == 1 && this.f443l) {
            g(i7, i8);
            io.flutter.embedding.engine.renderer.h hVar = this.f440i;
            Surface surface = this.f437f.getSurface();
            hVar.f4487b = surface;
            hVar.f4486a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
    }
}
