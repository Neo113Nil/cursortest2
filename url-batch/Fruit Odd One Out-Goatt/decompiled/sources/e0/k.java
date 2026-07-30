package e0;

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

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class k extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f168a;

    /* renamed from: b, reason: collision with root package name */
    public Image f169b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f170c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f171d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f172e;

    /* renamed from: f, reason: collision with root package name */
    public final int f173f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f172e = false;
        this.f174g = false;
        this.f168a = f2;
        this.f173f = i4;
        setAlpha(0.0f);
        this.f172e = a.a.n(getContext());
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
        if (o.d.a(this.f173f) == 0) {
            Surface surface = this.f168a.getSurface();
            hVar.f423b = surface;
            hVar.f422a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f171d = hVar;
        this.f174g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f174g) {
            setAlpha(0.0f);
            e();
            this.f170c = null;
            Image image = this.f169b;
            if (image != null) {
                image.close();
                this.f169b = null;
            }
            invalidate();
            this.f174g = false;
        }
    }

    public final boolean e() {
        if (!this.f174g) {
            return false;
        }
        Image acquireLatestImage = this.f168a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f169b;
            if (image != null) {
                image.close();
                this.f169b = null;
            }
            this.f169b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f171d == null) {
            return;
        }
        if (i2 == this.f168a.getWidth() && i3 == this.f168a.getHeight()) {
            return;
        }
        Image image = this.f169b;
        if (image != null) {
            image.close();
            this.f169b = null;
        }
        this.f168a.close();
        this.f168a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f171d;
    }

    public ImageReader getImageReader() {
        return this.f168a;
    }

    public Surface getSurface() {
        return this.f168a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f169b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f170c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f169b.getHeight();
                    Bitmap bitmap = this.f170c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f170c.getHeight() != height) {
                        this.f170c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f170c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f170c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f172e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f168a.getWidth() && i3 == this.f168a.getHeight()) && this.f173f == 1 && this.f174g) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f171d;
            Surface surface = this.f168a.getSurface();
            hVar.f423b = surface;
            hVar.f422a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
    }
}
