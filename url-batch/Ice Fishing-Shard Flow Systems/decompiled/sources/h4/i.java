package h4;

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

/* loaded from: classes.dex */
public class i extends View implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: d, reason: collision with root package name */
    public ImageReader f5209d;

    /* renamed from: e, reason: collision with root package name */
    public Image f5210e;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f5211i;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f5212l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5213m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5214n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5215o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i2, int i5, int i7) {
        super(context, null);
        ImageReader f7 = f(i2, i5);
        this.f5213m = false;
        this.f5215o = false;
        this.f5209d = f7;
        this.f5214n = i7;
        setAlpha(0.0f);
        this.f5213m = P0.f.y(getContext());
    }

    public static ImageReader f(int i2, int i5) {
        ImageReader newInstance;
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i5 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i5 + ", set height=1");
            i5 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i2, i5, 1, 3);
        }
        newInstance = ImageReader.newInstance(i2, i5, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f5215o) {
            setAlpha(0.0f);
            e();
            this.f5211i = null;
            Image image = this.f5210e;
            if (image != null) {
                image.close();
                this.f5210e = null;
            }
            invalidate();
            this.f5215o = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c(io.flutter.embedding.engine.renderer.j jVar) {
        if (S.i.b(this.f5214n) == 0) {
            Surface surface = this.f5209d.getSurface();
            jVar.f5600c = surface;
            jVar.f5598a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f5212l = jVar;
        this.f5215o = true;
    }

    public final boolean e() {
        if (!this.f5215o) {
            return false;
        }
        Image acquireLatestImage = this.f5209d.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f5210e;
            if (image != null) {
                image.close();
                this.f5210e = null;
            }
            this.f5210e = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i5) {
        if (this.f5212l == null) {
            return;
        }
        if (i2 == this.f5209d.getWidth() && i5 == this.f5209d.getHeight()) {
            return;
        }
        Image image = this.f5210e;
        if (image != null) {
            image.close();
            this.f5210e = null;
        }
        this.f5209d.close();
        this.f5209d = f(i2, i5);
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f5212l;
    }

    public ImageReader getImageReader() {
        return this.f5209d;
    }

    public Surface getSurface() {
        return this.f5209d.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f5210e;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f5211i = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f5210e.getHeight();
                    Bitmap bitmap = this.f5211i;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f5211i.getHeight() != height) {
                        this.f5211i = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f5211i.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f5211i;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        if (!this.f5213m) {
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i5), View.MeasureSpec.getMode(i5) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i5, int i7, int i8) {
        if (!(i2 == this.f5209d.getWidth() && i5 == this.f5209d.getHeight()) && this.f5214n == 1 && this.f5215o) {
            g(i2, i5);
            io.flutter.embedding.engine.renderer.j jVar = this.f5212l;
            Surface surface = this.f5209d.getSurface();
            jVar.f5600c = surface;
            jVar.f5598a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d() {
    }
}
