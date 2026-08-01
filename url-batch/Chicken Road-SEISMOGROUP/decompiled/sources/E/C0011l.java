package E;

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
import m.AbstractC0068d;

/* renamed from: E.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0011l extends View implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f167a;

    /* renamed from: b, reason: collision with root package name */
    public Image f168b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f169c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f170d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011l(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f172f = false;
        this.f167a = f2;
        this.f171e = i4;
        setAlpha(0.0f);
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

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        if (AbstractC0068d.a(this.f171e) == 0) {
            Surface surface = this.f167a.getSurface();
            hVar.f624b = surface;
            hVar.f623a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f170d = hVar;
        this.f172f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void d() {
        if (this.f172f) {
            setAlpha(0.0f);
            e();
            this.f169c = null;
            Image image = this.f168b;
            if (image != null) {
                image.close();
                this.f168b = null;
            }
            invalidate();
            this.f172f = false;
        }
    }

    public final boolean e() {
        if (!this.f172f) {
            return false;
        }
        Image acquireLatestImage = this.f167a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f168b;
            if (image != null) {
                image.close();
                this.f168b = null;
            }
            this.f168b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f170d == null) {
            return;
        }
        if (i2 == this.f167a.getWidth() && i3 == this.f167a.getHeight()) {
            return;
        }
        Image image = this.f168b;
        if (image != null) {
            image.close();
            this.f168b = null;
        }
        this.f167a.close();
        this.f167a = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f170d;
    }

    public ImageReader getImageReader() {
        return this.f167a;
    }

    public Surface getSurface() {
        return this.f167a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f168b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f169c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f168b.getHeight();
                    Bitmap bitmap = this.f169c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f169c.getHeight() != height) {
                        this.f169c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f169c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f169c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f167a.getWidth() && i3 == this.f167a.getHeight()) && this.f171e == 1 && this.f172f) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.h hVar = this.f170d;
            Surface surface = this.f167a.getSurface();
            hVar.f624b = surface;
            hVar.f623a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void c() {
    }
}
