package c0;

import a.AbstractC0069a;
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

/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0108j extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public ImageReader f1713e;

    /* renamed from: f, reason: collision with root package name */
    public Image f1714f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f1715g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1716h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1717i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1718j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1719k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108j(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f1717i = false;
        this.f1719k = false;
        this.f1713e = f2;
        this.f1718j = i4;
        setAlpha(0.0f);
        this.f1717i = AbstractC0069a.s(getContext());
    }

    public static ImageReader f(int i2, int i3) {
        ImageReader newInstance;
        if (i2 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i2 + ", set width=1");
            i2 = 1;
        }
        if (i3 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i3 + ", set height=1");
            i3 = 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i2, i3, 1, 3);
        }
        newInstance = ImageReader.newInstance(i2, i3, 1, 3, 768L);
        return newInstance;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (F.j.b(this.f1718j) == 0) {
            Surface surface = this.f1713e.getSurface();
            hVar.f2386b = surface;
            hVar.f2385a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f1716h = hVar;
        this.f1719k = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1719k) {
            setAlpha(0.0f);
            e();
            this.f1715g = null;
            Image image = this.f1714f;
            if (image != null) {
                image.close();
                this.f1714f = null;
            }
            invalidate();
            this.f1719k = false;
        }
    }

    public final boolean e() {
        if (!this.f1719k) {
            return false;
        }
        Image acquireLatestImage = this.f1713e.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f1714f;
            if (image != null) {
                image.close();
                this.f1714f = null;
            }
            this.f1714f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f1716h == null) {
            return;
        }
        if (i2 == this.f1713e.getWidth() && i3 == this.f1713e.getHeight()) {
            return;
        }
        Image image = this.f1714f;
        if (image != null) {
            image.close();
            this.f1714f = null;
        }
        this.f1713e.close();
        this.f1713e = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1716h;
    }

    public ImageReader getImageReader() {
        return this.f1713e;
    }

    public Surface getSurface() {
        return this.f1713e.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f1714f;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f1715g = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f1714f.getHeight();
                    Bitmap bitmap = this.f1715g;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f1715g.getHeight() != height) {
                        this.f1715g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f1715g.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f1715g;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1717i) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f1713e.getWidth() && i3 == this.f1713e.getHeight()) && this.f1718j == 1 && this.f1719k) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f1716h;
            Surface surface = this.f1713e.getSurface();
            hVar.f2386b = surface;
            hVar.f2385a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
    }
}
