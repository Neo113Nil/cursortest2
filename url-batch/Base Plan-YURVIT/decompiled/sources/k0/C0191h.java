package k0;

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
import androidx.datastore.preferences.protobuf.k0;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0191h extends View implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: e, reason: collision with root package name */
    public ImageReader f2690e;

    /* renamed from: f, reason: collision with root package name */
    public Image f2691f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f2692g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f2693h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2694i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2695j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2696k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191h(Context context, int i2, int i3, int i4) {
        super(context, null);
        ImageReader f2 = f(i2, i3);
        this.f2694i = false;
        this.f2696k = false;
        this.f2690e = f2;
        this.f2695j = i4;
        setAlpha(0.0f);
        this.f2694i = k0.v(getContext());
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

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f2696k) {
            setAlpha(0.0f);
            e();
            this.f2692g = null;
            Image image = this.f2691f;
            if (image != null) {
                image.close();
                this.f2691f = null;
            }
            invalidate();
            this.f2696k = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c(io.flutter.embedding.engine.renderer.i iVar) {
        if (H.j.a(this.f2695j) == 0) {
            Surface surface = this.f2690e.getSurface();
            iVar.f2390b = surface;
            iVar.f2389a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f2693h = iVar;
        this.f2696k = true;
    }

    public final boolean e() {
        if (!this.f2696k) {
            return false;
        }
        Image acquireLatestImage = this.f2690e.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f2691f;
            if (image != null) {
                image.close();
                this.f2691f = null;
            }
            this.f2691f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void g(int i2, int i3) {
        if (this.f2693h == null) {
            return;
        }
        if (i2 == this.f2690e.getWidth() && i3 == this.f2690e.getHeight()) {
            return;
        }
        Image image = this.f2691f;
        if (image != null) {
            image.close();
            this.f2691f = null;
        }
        this.f2690e.close();
        this.f2690e = f(i2, i3);
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f2693h;
    }

    public ImageReader getImageReader() {
        return this.f2690e;
    }

    public Surface getSurface() {
        return this.f2690e.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        ColorSpace.Named unused;
        super.onDraw(canvas);
        Image image = this.f2691f;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f2692g = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f2691f.getHeight();
                    Bitmap bitmap = this.f2692g;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f2692g.getHeight() != height) {
                        this.f2692g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f2692g.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f2692g;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2694i) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (!(i2 == this.f2690e.getWidth() && i3 == this.f2690e.getHeight()) && this.f2695j == 1 && this.f2696k) {
            g(i2, i3);
            io.flutter.embedding.engine.renderer.i iVar = this.f2693h;
            Surface surface = this.f2690e.getSurface();
            iVar.f2390b = surface;
            iVar.f2389a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
    }
}
