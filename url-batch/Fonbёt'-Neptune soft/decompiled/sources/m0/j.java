package m0;

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
public class j extends View implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: e, reason: collision with root package name */
    public ImageReader f3162e;

    /* renamed from: f, reason: collision with root package name */
    public Image f3163f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f3164g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f3165h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3166i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3167j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f3167j = false;
        this.f3162e = f2;
        this.f3166i = i4;
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

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        if (K.j.b(this.f3166i) == 0) {
            Surface surface = this.f3162e.getSurface();
            lVar.f2539c = surface;
            lVar.f2537a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f3165h = lVar;
        this.f3167j = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f3167j) {
            setAlpha(0.0f);
            e();
            this.f3164g = null;
            Image image = this.f3163f;
            if (image != null) {
                image.close();
                this.f3163f = null;
            }
            invalidate();
            this.f3167j = false;
        }
    }

    public final boolean e() {
        if (!this.f3167j) {
            return false;
        }
        Image acquireLatestImage = this.f3162e.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f3163f;
            if (image != null) {
                image.close();
                this.f3163f = null;
            }
            this.f3163f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f3165h == null) {
            return;
        }
        if (i2 == this.f3162e.getWidth() && i3 == this.f3162e.getHeight()) {
            return;
        }
        Image image = this.f3163f;
        if (image != null) {
            image.close();
            this.f3163f = null;
        }
        this.f3162e.close();
        this.f3162e = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f3165h;
    }

    public ImageReader getImageReader() {
        return this.f3162e;
    }

    public Surface getSurface() {
        return this.f3162e.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f3163f;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f3164g = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f3163f.getHeight();
                    Bitmap bitmap = this.f3164g;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f3164g.getHeight() != height) {
                        this.f3164g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f3164g.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f3164g;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f3162e.getWidth() && i3 == this.f3162e.getHeight()) && this.f3166i == 1 && this.f3167j) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.l lVar = this.f3165h;
            Surface surface = this.f3162e.getSurface();
            lVar.f2539c = surface;
            lVar.f2537a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }
}
